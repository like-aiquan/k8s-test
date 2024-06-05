package org.example.k8stest;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@SpringBootApplication
public class K8sTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sTestApplication.class, args);
    }

    @Bean
    public RouterFunction<ServerResponse> api() {
        return route()
                .GET("/hello", request -> ok().bodyValue("Hello World!"))
                .build();
    }
}

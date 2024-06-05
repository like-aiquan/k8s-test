FROM openjdk:17
LABEL authors="chenaiquan"

COPY ./build/libs/k8s-test-0.0.1-SNAPSHOT.jar /app.jar
CMD ["--server.port=8080"]
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]

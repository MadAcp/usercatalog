FROM openjdk:18-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/UserCatalog-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", "-jar", "./app.jar" ]
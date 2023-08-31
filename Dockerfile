FROM openjdk:11-jre-slim

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} RESTful-application.jar

ENTRYPOINT ["java","-jar","/RESTful-application.jar"]

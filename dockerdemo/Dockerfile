FROM openjdk:8-jdk-alpine
COPY target/dockerdemo-0.0.1-SNAPSHOT.jar /usr/app/dockerdemo-0.0.1-SNAPSHOT.jar
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "dockerdemo-0.0.1-SNAPSHOT.jar"]

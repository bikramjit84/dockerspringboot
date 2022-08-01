FROM openjdk:17-alpine
EXPOSE 8080

WORKDIR /appl

COPY target/dockerspring-0.0.1-SNAPSHOT.jar /appl/dockerspring.jar

ENTRYPOINT ["java", "-jar", "dockerspring.jar"]
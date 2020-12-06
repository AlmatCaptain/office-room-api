FROM openjdk:8

ADD /target/office-room-api-0.0.1-SNAPSHOT.jar office-room-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "office-room-api-0.0.1-SNAPSHOT.jar"]

EXPOSE 8085
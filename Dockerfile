FROM amazoncorretto:11-alpine-jdk
MAINTAINER gise
COPY target/gise-0.0.1-SNAPSHOT.jar gise-de.jar
ENTRYPOINT ["java","-jar","/gise-de.jar"]
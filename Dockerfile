FROM openjdk:11
EXPOSE 8080
ADD target/kuberdocker.jar kuberdocker.jar
ENTRYPOINT ["java","-jar","/kuberdocker.jar"]
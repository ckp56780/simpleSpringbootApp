FROM openjdk:17
EXPOSE 8080
ADD target/simplespringbootapp.jar simplespringbootapp.jar
ENTRYPOINT ["java" ,"-jar" ,"/simplespringbootapp.jar"]

FROM openjdk:8
ADD target/springboot-docker-demo.war springboot-docker-demo.war
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.war"]
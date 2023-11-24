FROM openjdk:17
EXPOSE 8098

ADD target/condidats-0.0.1-SNAPSHOT.jar condidats.jar
ENTRYPOINT ["java","-jar","condidats.jar"]
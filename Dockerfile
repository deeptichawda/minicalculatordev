FROM openjdk:8
COPY ./target/miniprojectcalc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "miniprojectcalc-1.0-SNAPSHOT-jar-with-dependencies.jar","Calculator"]
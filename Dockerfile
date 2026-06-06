# Step 1: Build the application using Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
COPY . .
RUN ./mvnw clean package -DskipTests

# Step 2: Run the application using a lightweight Java runtime
FROM eclipse-temurin:17-jre
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
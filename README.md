# Spring Boot Airline API

This project demonstrates a **Spring Boot REST API** for managing airline services. It includes multiple airline classes (`AirIndia`, `Indigo`, `Vistara`) and provides **CRUD operations** using `@GetMapping`, `@PostMapping`, `@PutMapping`, and `@DeleteMapping`. The API is tested using **Postman**.

## 📂 Project Structure

```
SpringBoot_AirlineAPI/
│-- src/main/java/com/jbk/
│   ├── main/
│   │   ├── AirIndia.java
│   │   ├── Indigo.java
│   │   ├── Vistara.java
│   │   ├── AirlineApiSpringBootApplication.java
│-- pom.xml
```

## 🛠 Technologies Used

- **Java**
- **Spring Boot**
- **Spring Web**
- **Spring Boot Actuator**
- **Spring Boot DevTools**
- **Postman** (for API testing)
- **Maven** (for dependency management)


## 📌 pom.xml Dependencies

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.4.3</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.tka.SpringBoot</groupId>
	<artifactId>Airline_API_SpringBoot</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>Airline_API_SpringBoot</name>
	<description>Demo project for Spring Boot</description>
	<url/>
	<licenses>
		<license/>
	</licenses>
	<developers>
		<developer/>
	</developers>
	<scm>
		<connection/>
		<developerConnection/>
		<tag/>
		<url/>
	</scm>
	<properties>
		<java.version>17</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>

```

## 📌 API Endpoints

| HTTP Method 
|-----------
| **GET** 
| **POST** 
| **PUT**
| **DELETE** 

## 📌 Testing with Postman

1️⃣ Open **Postman**.
2️⃣ Use the API .
3️⃣ Send requests and check responses.



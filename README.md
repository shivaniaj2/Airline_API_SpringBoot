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

## 🚀 Running the API

### 1️⃣ Clone the Repository

```sh
git clone https://github.com/shivaniaj22/SpringBoot_AirlineAPI.git
```

### 2️⃣ Navigate to the Project Directory

```sh
cd SpringBoot_AirlineAPI
```

### 3️⃣ Run the Application

```sh
mvn spring-boot:run
```

## 📌 API Endpoints

| HTTP Method | Endpoint | Description |
|------------|----------------|----------------|
| **GET** | `/airindia/flights` | Get all flights |
| **POST** | `/airindia/add?flight=AI202` | Add a new flight |
| **PUT** | `/airindia/update/{index}?flight=AI203` | Update a flight at given index |
| **DELETE** | `/airindia/delete/{index}` | Delete a flight at given index |

## 📌 Testing with Postman

1️⃣ Open **Postman**.
2️⃣ Use the API endpoints listed above.
3️⃣ Send requests and check responses.



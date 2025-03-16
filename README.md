# Spring Security JWT

Spring Boot-based REST API secured with JWT authentication and PostgreSQL database, running in a Dockerized environment.

## Features

- Spring Boot 3.4.3
- JWT Authentication (JSON Web Token)
- Spring Security Integration
- PostgreSQL Database
- Docker Support
- Lombok for Boilerplate Code Reduction

## Prerequisites

Make sure you have the following installed:

- JDK 17
- Maven
- Docker & Docker Compose

## Installation & Setup

### 1. Clone the Repository

```sh
git clone https://github.com/mustafaulvi/SpringSecurityJWT.git
cd SpringSecurityJWT
```

### 2. Configure Environment Variables

Create an `.env` file and add the following variables:

```
DB_USERNAME=your_username
DB_PASSWORD=your_password
DB_NAME=springsecurityjwt
DB_HOST=localhost
DB_PORT=5432
JWT_SECRET=your_jwt_secret
```

### 3. Build and Run with Docker

```sh
docker-compose up --build
```

This will start both the PostgreSQL database and the Spring Boot application.

```sh
mvn clean install
mvn spring-boot:run
```

## Technologies Used

- Spring Boot (Spring Security, Spring Web, Spring Data JPA)
- PostgreSQL
- JWT (io.jsonwebtoken)
- Lombok
- Maven
- Docker

### Author

Developed by Mustafa Ulvi


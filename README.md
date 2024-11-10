# Student API Project
This project is a Spring Boot RESTful API for managing student records. The API supports basic CRUD operations, including the ability to create, read, update, and delete student information.

## Features
* GET /api/v1/student: Retrieve a list of all students.

* POST api/v1/student: Add a new student to the database.
* PUT api/v1/student/{id}: Update details for an existing student by ID.
* DELETE api/v1/students/{id}: Remove a student from the database by ID.


## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven


## Getting Started
### Prerequisites
- Java 17 or later
- Maven (for building the project)
- PostgreSQL


## Installation
1. Clone the repository:
```bash
git clone https://github.com/manuchekhY/student-api.git
cd student-api
```
2. Configure Database: Update the application.properties file with your database settings.

3. Build and Run the Application:
```bash
mvn spring-boot:run
```
📌 To-Do Application

A simple Spring Boot + Thymeleaf based To-Do web app where users can manage their daily tasks.
This project is built as a learning exercise in Spring MVC, JPA, and Thymeleaf templating.

 Features

 Add new tasks with a title.

 Mark tasks as completed / not completed by toggling.

 Delete tasks individually.

 Bootstrap 5 styled UI for a clean and responsive experience.

 Persistent storage with MySQL and Spring Data JPA.

 Tech Stack

Backend: Spring Boot, Spring MVC, Spring Data JPA

Frontend: Thymeleaf, Bootstrap 5

Database: MySQL

Build Tool: Maven

<img width="960" height="540" alt="Screenshot 2025-09-01 145044" src="https://github.com/user-attachments/assets/a65d570a-65c5-410c-acaf-5ba088b774df" />

3. Run the application
mvn spring-boot:run

4. Access the app

Open your browser and visit:
 http://localhost:8080/tasks

 Project Structure
todo-app/
 ├── src/main/java/com/example/todo_app/
 │   ├── controller/    # Handles web requests
 │   ├── models/        # Task entity
 │   ├── repository/    # JPA repository
 │   └── services/      # Business logic
 ├── src/main/resources/
 │   ├── templates/     # Thymeleaf templates
 │   └── application.properties
 └── pom.xml

 Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you’d like to improve.

 License

This project is licensed under the MIT License.

# Taco Cloud 🌮☁️
A full-featured web application built with Spring Boot that allows users to design and order their custom-made tacos. This project demonstrates key concepts of the Spring Framework, including Spring MVC, Spring Data JPA, and Spring Security.

![alt text](https://img.shields.io/badge/License-MIT-yellow.svg)

![alt text](https://img.shields.io/badge/Java-11+-orange.svg)

![alt text](https://img.shields.io/badge/Spring_Boot-2.5.4-brightgreen.svg)

![alt text](https://img.shields.io/badge/Built_with-Maven-blue.svg)

## Table of Contents
- About The Project
- Key Features
- Built With
- Getting Started
  - Prerequisites
  - Installation & Running
- Usage
- Contributing
- License
- Acknowledgments

## About The Project
Taco Cloud is a hands-on learning project designed to showcase a modern Java web application stack. It simulates an online taco shop where authenticated users can select from a list of fresh ingredients, design their own unique tacos, and place an order.

The application handles everything from user registration and login to data persistence and form validation, providing a complete, end-to-end user experience.

## Key Features
- User Authentication: Secure registration and login functionality powered by Spring Security.
- Dynamic Taco Creation: A user-friendly form to design tacos by selecting ingredients.
- Order Management: A shopping cart and order form with validation for user details.
- Data Persistence: User data, ingredients, and orders are stored in a database via Spring Data JPA.
- RESTful Endpoints: A well-defined API for managing ingredients and taco designs.

## Built With
This project leverages a powerful set of modern technologies:

**Backend:**
- Java 21
- Spring Boot
- Spring Web (for MVC and REST controllers)
- Spring Data JPA (for database interaction)
- Spring Security (for authentication & authorization)
- Lombok (to reduce boilerplate code)

**Frontend:**
- Thymeleaf (as the server-side template engine)
- HTML5 & CSS3

**Database:**
- H2 Database Engine (in-memory for easy setup)
- Build & Dependency Management:
- Apache Maven

## Getting Started
Follow these instructions to get a local copy up and running.

## Prerequisites
Make sure you have the following installed on your system:
- **Java Development Kit (JDK)**: Version 11 or higher.
- **Apache Maven**: To build the project and manage dependencies.

## Installation & Running
1. Clone the repository:
```git clone https://github.com/Brainiac2222/taco-cloud.git```
2. Navigate to the project directory:
```cd taco-cloud```
3. Build the project and run the application using the Maven wrapper:
  - On macOS/Linux:
```./mvnw spring-boot:run```
  - On Windows:
```mvnw.cmd spring-boot:run```
- The application will start, and the H2 database will be initialized with ingredient data from data.sql.
4. Access the application:
Open your web browser and navigate to http://localhost:8080.

## Usage
Once the application is running, you can:

1. Click on "Design a taco" from the home page.
2. You will be prompted to Register for a new account or Login if you already have one.
3. On the design page, select your desired ingredients and give your taco a name.
4. After submitting your design, you'll be taken to the order form where you can review your current order.
5. Fill in your delivery details and click "Submit Order".
6. Your order is now saved! You can continue to design more tacos.

**Note: Since this project uses an in-memory H2 database, all data (users, orders) will be reset every time you restart the application.**

## Contributing
Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

If you have a suggestion that would make this better, please fork the repo and create a pull request.

1. Fork the Project
2. Create your Feature Branch (git checkout -b feature/AmazingFeature)
3. Commit your Changes (git commit -m 'Add some AmazingFeature')
4. Push to the Branch (git push origin feature/AmazingFeature)
5. Open a Pull Request

## License
Distributed under the MIT License. See LICENSE file for more information. (You should add a LICENSE file to your repo with the MIT license text).

## Acknowledgments
- This project is heavily inspired by and based on the example application from the book "Spring in Action" by Craig Walls.
- A huge thanks to the Spring and Pivotal teams for creating such a robust and developer-friendly framework.

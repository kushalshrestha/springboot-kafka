# springboot-kafka

This is a sample project that demonstrates how to use Apache Kafka with Spring Boot. Apache Kafka is a distributed streaming platform that allows you to build real-time streaming applications.


## Prerequisite
Make sure you have the following installed on your system:

* Java Development Kit (JDK) 8 or higher
* Apache Kafka
* Apache Maven (for building the project)

## Getting Started
Follow these steps to get started with the project:

1. Clone the repository:
```
git clone <repository_url>
```
2. Navigate to the project directory:
3. Update the Kafka configuration:

    Open the application.properties file located in the src/main/resources directory and update the Kafka broker address, topic names, and any other relevant configurations.
4. Build the project and run the application.

## Project Structure
```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.kushal.springkafka
│   │   │       ├── ConsumerService           # Consumer
│   │   │       ├── EmailEvent                # EmailEvent entity
│   │   │       ├── ProduerService            # Produccer
│   │   │       └── SpringKafkaApplication.java  # Spring Boot application main class
│   │   └── resources
│   │       └── application.properties  # Kafka configuration properties
│   └── test                           # Test classes
├── .gitignore
├── pom.xml                            # Maven dependencies and build configuration
└── README.md                          # Project documentation (you are here)

```
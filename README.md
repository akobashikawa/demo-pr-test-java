# demo-pr-test-java

This is a simple Maven project named `demo-pr-test-java` that demonstrates the use of JDK 17 and JUnit 5 for testing.

## Project Structure

```
demo-pr-test-java
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── App.java
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── AppTest.java
├── pom.xml
└── README.md
```

## Requirements

- JDK 17
- Maven

## How to Run

1. Clone the repository:
   ```
   git clone <repository-url>
   cd demo-pr-test-java
   ```

2. Build the project:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn exec:java -Dexec.mainClass="com.example.App"
   ```

## How to Test

To run the tests, use the following command:
```
mvn test
```

This will execute the test cases defined in `AppTest.java` using JUnit 5.
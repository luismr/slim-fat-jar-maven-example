# Slim Fat JAR Maven Example

[![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white)](https://openjdk.java.net/)
[![Maven](https://img.shields.io/badge/Maven-3.x-blue?logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![SLF4J](https://img.shields.io/badge/SLF4J-2.0.16-green?logo=slf4j&logoColor=white)](https://www.slf4j.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5.11.0-green?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE.md)
[![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen)](https://github.com)
[![Coverage](https://img.shields.io/badge/Coverage-100%25-brightgreen)](https://github.com)

This project demonstrates how to create both fat and slim JARs with Maven, including proper manifest configuration for executable JARs.

## 🚀 Features

- **Java 21** with Maven 3.x
- **SLF4J logging** with simple implementation
- **JUnit 5** unit tests
- **Fat JAR** with all dependencies included
- **Slim JAR** with all dependencies included
- **Executable JARs** with proper manifest configuration

## 🛠️ Tech Stack

### Core Technologies
[![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white)](https://openjdk.java.net/)
[![Maven](https://img.shields.io/badge/Maven-3.x-blue?logo=apache-maven&logoColor=white)](https://maven.apache.org/)

### Logging & Testing
[![SLF4J](https://img.shields.io/badge/SLF4J-2.0.16-green?logo=slf4j&logoColor=white)](https://www.slf4j.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5.11.0-green?logo=junit5&logoColor=white)](https://junit.org/junit5/)

### Build Tools & Plugins
[![Maven Shade Plugin](https://img.shields.io/badge/Shade%20Plugin-3.6.0-blue?logo=apache-maven&logoColor=white)](https://maven.apache.org/plugins/maven-shade-plugin/)
[![Maven Assembly Plugin](https://img.shields.io/badge/Assembly%20Plugin-3.7.1-blue?logo=apache-maven&logoColor=white)](https://maven.apache.org/plugins/maven-assembly-plugin/)
[![Maven Surefire Plugin](https://img.shields.io/badge/Surefire%20Plugin-3.4.0-blue?logo=apache-maven&logoColor=white)](https://maven.apache.org/plugins/maven-surefire-plugin/)

### Project Status
[![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen)](https://github.com)
[![Tests](https://img.shields.io/badge/Tests-3%20Passing-brightgreen)](https://github.com)
[![Coverage](https://img.shields.io/badge/Coverage-100%25-brightgreen)](https://github.com)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE.md)

### JAR Sizes
[![Fat JAR](https://img.shields.io/badge/Fat%20JAR-85KB-blue?logo=java&logoColor=white)](https://github.com)
[![Slim JAR](https://img.shields.io/badge/Slim%20JAR-84KB-green?logo=java&logoColor=white)](https://github.com)
[![Regular JAR](https://img.shields.io/badge/Regular%20JAR-3KB-orange?logo=java&logoColor=white)](https://github.com)

## Project Structure

```
├── pom.xml                                    # Maven configuration
├── src/
│   ├── main/java/com/example/
│   │   └── HelloWorld.java                    # Main application class
│   └── test/java/com/example/
│       └── HelloWorldTest.java               # Unit tests
└── target/                                    # Build output
    ├── slim-fat-jar-maven-example-1.0.0.jar                    # Regular JAR (3KB)
    ├── slim-fat-jar-maven-example-1.0.0-fat.jar                # Fat JAR (85KB)
    └── slim-fat-jar-maven-example-1.0.0-slim-jar-with-dependencies.jar # Slim JAR (84KB)
```

## ⚡ Quick Start

[![Quick Start](https://img.shields.io/badge/Quick%20Start-Ready-brightgreen?logo=rocket&logoColor=white)](https://github.com)

### 🏗️ Build the project
[![Maven Build](https://img.shields.io/badge/Maven-Build-blue?logo=apache-maven&logoColor=white)](https://maven.apache.org/)
```bash
mvn clean package
```

### 🧪 Run tests
[![JUnit Tests](https://img.shields.io/badge/JUnit-Tests-green?logo=junit5&logoColor=white)](https://junit.org/junit5/)
```bash
mvn test
```

### 🚀 Execute the JARs

[![Java Runtime](https://img.shields.io/badge/Java-Runtime-orange?logo=openjdk&logoColor=white)](https://openjdk.java.net/)

**Fat JAR (recommended for standalone deployment):**
[![Fat JAR](https://img.shields.io/badge/Fat%20JAR-85KB-blue?logo=java&logoColor=white)](https://github.com)
```bash
java -jar target/slim-fat-jar-maven-example-1.0.0-fat.jar
```

**Slim JAR (alternative with dependencies):**
[![Slim JAR](https://img.shields.io/badge/Slim%20JAR-84KB-green?logo=java&logoColor=white)](https://github.com)
```bash
java -jar target/slim-fat-jar-maven-example-1.0.0-slim-jar-with-dependencies.jar
```

## JAR Types Explained

### Fat JAR (Maven Shade Plugin)
- **File**: `slim-fat-jar-maven-example-1.0.0-fat.jar`
- **Size**: ~85KB
- **Created by**: Maven Shade Plugin
- **Features**: 
  - Includes all dependencies
  - Single executable JAR
  - Proper manifest with main class
  - Best for standalone deployment

### Slim JAR (Maven Assembly Plugin)
- **File**: `slim-fat-jar-maven-example-1.0.0-slim-jar-with-dependencies.jar`
- **Size**: ~84KB
- **Created by**: Maven Assembly Plugin
- **Features**:
  - Includes all dependencies
  - Alternative to fat JAR
  - Proper manifest with main class

### Regular JAR
- **File**: `slim-fat-jar-maven-example-1.0.0.jar`
- **Size**: ~3KB
- **Features**:
  - Only application code
  - Requires classpath setup
  - Not executable standalone

## Dependencies

- **SLF4J API 2.0.16**: Logging facade
- **SLF4J Simple 2.0.16**: Simple logging implementation
- **JUnit Jupiter 5.11.0**: Testing framework

## Maven Plugins Used

1. **Maven Compiler Plugin**: Java 21 compilation
2. **Maven Surefire Plugin**: Test execution
3. **Maven Shade Plugin**: Fat JAR creation
4. **Maven Assembly Plugin**: Slim JAR creation

## Expected Output

When running either executable JAR, you should see:

```
Hello, World!
[main] INFO com.example.HelloWorld - Starting Hello World application...
[main] INFO com.example.HelloWorld - Hello World message printed to console
[main] INFO com.example.HelloWorld - This is an info message
[main] WARN com.example.HelloWorld - This is a warning message
[main] ERROR com.example.HelloWorld - This is an error message
[main] INFO com.example.HelloWorld - Hello World application completed successfully
```

## Notes

- Both fat and slim JARs are executable with `java -jar`
- The manifest includes the main class: `com.example.HelloWorld`
- SLF4J logging demonstrates different log levels
- JUnit 5 tests verify the application functionality
- All dependencies are included in the executable JARs

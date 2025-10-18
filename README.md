# Slim Fat JAR Maven Example

[![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white)](https://openjdk.java.net/)
[![Maven](https://img.shields.io/badge/Maven-3.x-blue?logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![SLF4J](https://img.shields.io/badge/SLF4J-2.0.16-green?logo=slf4j&logoColor=white)](https://www.slf4j.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5.11.0-green?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE.md)
[![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen)](https://github.com/luismr/slim-fat-jar-maven-example/actions)
[![Coverage](https://img.shields.io/badge/Coverage-100%25-brightgreen)](https://github.com/luismr/slim-fat-jar-maven-example/actions)

This project demonstrates how to create both fat and slim JARs with Maven, including proper manifest configuration for executable JARs.

## 📑 Table of Contents

- [🚀 Features](#-features)
- [🛠️ Tech Stack](#️-tech-stack)
  - [Core Technologies](#core-technologies)
  - [Logging & Testing](#logging--testing)
  - [Build Tools & Plugins](#build-tools--plugins)
  - [Project Status](#project-status)
  - [JAR Sizes](#jar-sizes)
- [📁 Project Structure](#project-structure)
- [⚡ Quick Start](#-quick-start)
  - [🏗️ Build the project](#️-build-the-project)
  - [🧪 Run tests](#-run-tests)
  - [🚀 Execute the JARs](#-execute-the-jars)
- [🔧 Maven JAR Generation](#-maven-jar-generation)
  - [📦 Regular JAR (Default Maven JAR Plugin)](#-regular-jar-default-maven-jar-plugin)
  - [🏗️ Fat JAR (Maven Shade Plugin)](#️-fat-jar-maven-shade-plugin)
  - [🎯 Slim JAR (Maven Assembly Plugin)](#-slim-jar-maven-assembly-plugin)
  - [🔍 Maven Plugin Comparison](#-maven-plugin-comparison)
  - [🚀 When to Use Each Approach](#-when-to-use-each-approach)
- [📋 JAR Types Explained](#jar-types-explained)
  - [Fat JAR (Maven Shade Plugin)](#fat-jar-maven-shade-plugin)
  - [Slim JAR (Maven Assembly Plugin)](#slim-jar-maven-assembly-plugin)
  - [Regular JAR](#regular-jar)
- [📦 Dependencies](#dependencies)
- [📋 Understanding dependency-reduced-pom.xml](#-understanding-dependency-reduced-pomxml)
  - [🔍 What is dependency-reduced-pom.xml?](#-what-is-dependency-reduced-pomxml)
  - [📊 Key Differences from Original POM](#-key-differences-from-original-pom)
  - [🎯 What's Included in dependency-reduced-pom.xml](#-whats-included-in-dependency-reduced-pomxml)
  - [🔧 Purpose and Benefits](#-purpose-and-benefits)
  - [⚠️ Important Notes](#️-important-notes)
  - [🚀 Example Usage](#-example-usage)
- [🔧 Maven Plugins Used](#maven-plugins-used)
- [📊 Expected Output](#expected-output)
- [🤝 Contributing](#-contributing)
  - [🍴 Fork the Project](#-fork-the-project)
  - [🔧 Development Setup](#-development-setup)
  - [📝 Making Changes](#-making-changes)
  - [🚀 Submitting Changes](#-submitting-changes)
  - [🔄 Syncing with Upstream](#-syncing-with-upstream-optional-but-recommended)
  - [📋 Contribution Guidelines](#-contribution-guidelines)
- [🔄 GitHub Actions](#-github-actions)
  - [🏗️ CI/CD Pipeline (`ci.yml`)](#️-cicd-pipeline-ciyml)
  - [🔍 Code Quality (`quality.yml`)](#-code-quality-qualityyml)
  - [📊 Workflow Status](#-workflow-status)
- [👨‍💻 Author](#-author)
- [📝 Notes](#-notes)

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
[![JaCoCo](https://img.shields.io/badge/JaCoCo-0.8.12-green?logo=java&logoColor=white)](https://www.jacoco.org/jacoco/)

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
├── .github/workflows/                         # GitHub Actions workflows
│   ├── ci.yml                                # CI/CD pipeline
│   └── quality.yml                           # Code quality checks
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

## 🔧 Maven JAR Generation

This project demonstrates three different approaches to creating JARs with Maven, each with its own peculiarities:

### 📦 Regular JAR (Default Maven JAR Plugin)
```bash
mvn clean package
```
**Generated**: `target/slim-fat-jar-maven-example-1.0.0.jar` (~3KB)

**Peculiarities**:
- ✅ **Smallest size** - Only contains your application code
- ❌ **Not executable** - Requires classpath setup
- ❌ **No dependencies** - Must provide all dependencies separately
- ✅ **Standard Maven** - Uses default JAR plugin
- ❌ **Manual execution** - `java -cp target/classes:lib/* com.example.HelloWorld`

### 🏗️ Fat JAR (Maven Shade Plugin)
```bash
mvn clean package
```
**Generated**: `target/slim-fat-jar-maven-example-1.0.0-fat.jar` (~85KB)

**Peculiarities**:
- ✅ **Single executable** - `java -jar target/slim-fat-jar-maven-example-1.0.0-fat.jar`
- ✅ **All dependencies included** - No external JARs needed
- ✅ **Manifest transformation** - Automatically sets main class
- ⚠️ **Dependency conflicts** - May have overlapping classes (warnings shown)
- ⚠️ **Larger size** - Includes all transitive dependencies
- ✅ **Uber JAR** - Everything in one file
- ⚠️ **Shading** - Renames packages to avoid conflicts

### 🎯 Slim JAR (Maven Assembly Plugin)
```bash
mvn clean package
```
**Generated**: `target/slim-fat-jar-maven-example-1.0.0-slim-jar-with-dependencies.jar` (~84KB)

**Peculiarities**:
- ✅ **Executable** - `java -jar target/slim-fat-jar-maven-example-1.0.0-slim-jar-with-dependencies.jar`
- ✅ **All dependencies included** - No external JARs needed
- ✅ **Standard packaging** - Uses JAR-with-dependencies descriptor
- ✅ **No shading** - Preserves original package names
- ⚠️ **Classpath conflicts** - May have issues with duplicate classes
- ✅ **Alternative approach** - Different from Shade plugin
- ⚠️ **Long filename** - Descriptive but verbose

### 🔍 Maven Plugin Comparison

| Feature | Regular JAR | Fat JAR (Shade) | Slim JAR (Assembly) |
|---------|-------------|-----------------|-------------------|
| **Size** | 3KB | 85KB | 84KB |
| **Executable** | ❌ | ✅ | ✅ |
| **Dependencies** | ❌ | ✅ | ✅ |
| **Main Class** | Manual | Auto | Auto |
| **Conflicts** | N/A | Handled | Possible |
| **Use Case** | Libraries | Applications | Applications |

### 🚀 When to Use Each Approach

**Regular JAR** - Use when:
- Creating libraries for other projects
- Dependencies managed by parent project
- Need minimal footprint
- Building microservices with external dependency management

**Fat JAR (Shade)** - Use when:
- Standalone applications
- Microservices deployment
- Docker containers
- Need conflict resolution
- Production deployments

**Slim JAR (Assembly)** - Use when:
- Simple applications
- No complex dependency conflicts
- Alternative to Fat JAR
- Standard Maven approach

## 📋 Understanding dependency-reduced-pom.xml

The `dependency-reduced-pom.xml` file is automatically generated by the **Maven Shade Plugin** when creating fat JARs. This file represents a simplified version of your original POM with dependencies that were "shaded" (included) into the fat JAR removed.

### 🔍 What is dependency-reduced-pom.xml?

When the Maven Shade Plugin creates a fat JAR, it:
1. **Includes all dependencies** directly into the JAR file
2. **Removes those dependencies** from the POM since they're no longer needed as separate dependencies
3. **Creates this reduced POM** to document what the fat JAR actually contains

### 📊 Key Differences from Original POM

| Aspect | Original POM | dependency-reduced-pom.xml |
|--------|---------------|----------------------------|
| **SLF4J Dependencies** | ✅ Included | ❌ Removed (shaded into JAR) |
| **Test Dependencies** | ✅ Included | ✅ Included (not in fat JAR) |
| **Build Plugins** | ✅ Full configuration | ✅ Full configuration |
| **Properties** | ✅ All properties | ✅ All properties |
| **Size** | ~124 lines | ~103 lines |

### 🎯 What's Included in dependency-reduced-pom.xml

**✅ Retained:**
- Basic project information (groupId, artifactId, version)
- Build plugins configuration (Shade, Assembly, Surefire, Compiler)
- Properties and versions
- **Test dependencies** (JUnit) - since these weren't included in the fat JAR

**❌ Removed:**
- **SLF4J API 2.0.16** - Shaded into fat JAR
- **SLF4J Simple 2.0.16** - Shaded into fat JAR
- All runtime dependencies that were included in the fat JAR

### 🔧 Purpose and Benefits

1. **📋 Documentation**: Shows what the fat JAR actually contains
2. **🚀 Deployment**: Can be used if you want to deploy the fat JAR to a Maven repository
3. **🔍 Transparency**: Makes it clear which dependencies were included vs. excluded
4. **📦 Repository Management**: Helps Maven understand what's in the fat JAR

### ⚠️ Important Notes

- **Normal behavior**: This file is expected when using Maven Shade Plugin
- **Don't edit manually**: It's automatically generated and will be overwritten
- **Version control**: Can be committed to show the reduced dependency state
- **CI/CD**: Useful for understanding what's actually packaged in the fat JAR

### 🚀 Example Usage

```bash
# After building with Maven Shade Plugin
ls -la dependency-reduced-pom.xml

# View the reduced dependencies
cat dependency-reduced-pom.xml | grep -A 10 "<dependencies>"

# Compare with original POM
diff pom.xml dependency-reduced-pom.xml
```


## Maven Plugins Used

1. **Maven Compiler Plugin**: Java 21 compilation
2. **Maven Surefire Plugin**: Test execution
3. **Maven Shade Plugin**: Fat JAR creation
4. **Maven Assembly Plugin**: Slim JAR creation
5. **JaCoCo Plugin**: Code coverage reporting

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

## 🤝 Contributing

[![Contributing](https://img.shields.io/badge/Contributing-Welcome-green?logo=github&logoColor=white)](https://github.com/luismr/slim-fat-jar-maven-example)

We welcome contributions! Here's how to get started:

### 🍴 Fork the Project
1. **Fork the repository**:
   - Go to [https://github.com/luismr/slim-fat-jar-maven-example](https://github.com/luismr/slim-fat-jar-maven-example)
   - Click the "Fork" button in the top-right corner
   - This creates a copy in your GitHub account

2. **Clone your fork**:
   ```bash
   # Replace YOUR_USERNAME with your actual GitHub username
   git clone git@github.com:YOUR_USERNAME/slim-fat-jar-maven-example.git
   cd slim-fat-jar-maven-example
   ```

3. **Add upstream remote** (to sync with original repo):
   ```bash
   git remote add upstream git@github.com:luismr/slim-fat-jar-maven-example.git
   git remote -v  # Verify you have both origin and upstream
   ```

### 🔧 Development Setup
1. **Prerequisites**: Java 21, Maven 3.x
2. **Build the project**:
   ```bash
   mvn clean package
   ```
3. **Run tests**:
   ```bash
   mvn test
   ```

### 📝 Making Changes
1. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
2. Make your changes
3. Ensure tests pass:
   ```bash
   mvn test
   ```
4. Commit your changes:
   ```bash
   git commit -m "Add your feature description"
   ```

### 🚀 Submitting Changes

#### Step 1: Push your changes to your fork
```bash
git push origin feature/your-feature-name
```

#### Step 2: Create a Pull Request
1. **Go to your fork on GitHub**: `https://github.com/YOUR_USERNAME/slim-fat-jar-maven-example`
2. **You'll see a banner** saying "Compare & pull request" - click it
3. **Or manually**:
   - Click "Pull requests" tab
   - Click "New pull request"
   - Set base repository: `luismr/slim-fat-jar-maven-example` (main branch)
   - Set head repository: `YOUR_USERNAME/slim-fat-jar-maven-example` (your feature branch)

#### Step 3: Fill out the Pull Request
- **Title**: Clear description of your changes
- **Description**: Explain what you changed and why
- **Example**:
  ```
  Title: Add new logging feature
  Description: 
  - Added new log level configuration
  - Updated tests to cover new functionality
  - Updated documentation
  ```

#### Step 4: Submit and Wait
- Click "Create pull request"
- Wait for review and feedback
- Make requested changes if needed

### 🔄 Syncing with Upstream (Optional but Recommended)
Before starting new work, sync your fork with the original repository:
```bash
# Fetch latest changes from upstream
git fetch upstream

# Switch to your main branch
git checkout main

# Merge upstream changes
git merge upstream/main

# Push updates to your fork
git push origin main
```

### 📋 Contribution Guidelines
- Follow existing code style
- Add tests for new features
- Update documentation as needed
- Keep commits focused and descriptive
- Sync with upstream before starting new work

## 🔄 GitHub Actions

This project includes comprehensive GitHub Actions workflows:

### 🏗️ CI/CD Pipeline (`ci.yml`)
- **Triggers**: Push to main/develop, Pull Requests
- **Features**:
  - ✅ Java 21 setup with Temurin distribution
  - ✅ Maven dependency caching
  - ✅ Test execution with JUnit 5
  - ✅ JAR file building and verification
  - ✅ JAR execution testing
  - ✅ Manifest verification
  - ✅ Artifact upload for debugging

### 🔍 Code Quality (`quality.yml`)
- **Triggers**: Push to main/develop, Pull Requests
- **Features**:
  - ✅ Maven validation and dependency analysis
  - ✅ Test coverage reporting
  - ✅ JAR structure verification
  - ✅ Execution testing with timeout
  - ✅ Manifest content validation
  - ✅ Quality metrics reporting


### 📊 Workflow Status
[![CI/CD Pipeline](https://github.com/luismr/slim-fat-jar-maven-example/workflows/CI/CD%20Pipeline/badge.svg)](https://github.com/luismr/slim-fat-jar-maven-example/actions)
[![Code Quality](https://github.com/luismr/slim-fat-jar-maven-example/workflows/Code%20Quality/badge.svg)](https://github.com/luismr/slim-fat-jar-maven-example/actions)

## 📝 Notes

- Both fat and slim JARs are executable with `java -jar`
- The manifest includes the main class: `com.example.HelloWorld`
- SLF4J logging demonstrates different log levels
- JUnit 5 tests verify the application functionality
- All dependencies are included in the executable JARs
- GitHub Actions automatically build, test, and verify all JAR files

## 👨‍💻 Author

**Luis Machado Reis** - *The JAR Whisperer* 🥃

[![GitHub](https://img.shields.io/badge/GitHub-luismr-black?logo=github&logoColor=white)](https://github.com/luismr)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Luis%20Machado%20Reis-blue?logo=linkedin&logoColor=white)](https://linkedin.com/in/luismachadoreis)
[![Twitter](https://img.shields.io/badge/Twitter-@luismr-blue?logo=twitter&logoColor=white)](https://twitter.com/luismr)

> *"I don't always create JARs, but when I do, I prefer them fat and executable."* - The Most Interesting Developer in the World

A seasoned Software Architect with 20+ years of experience who has probably seen more Maven builds than most people have seen sunsets. Known for architecting systems that handle $300M+ transactions without breaking a sweat, Luis has mastered the art of making complex things look simple (like this README).

**Fun Facts:**
- 🏗️ **Architecture Wizard** - Built systems that handle more money than most countries' GDP
- ☁️ **Cloud Native Enthusiast** - Believes Kubernetes is the answer to everything (even relationship problems)
- 🐧 **Linux Aficionado** - Can make a server dance with just a few commands
- ☕ **Java Evangelist** - Convinced that Java 21 is the best thing since sliced bread
- 🎯 **JAR Specialist** - Can create fat JARs so good, they should be served with a side of fries

*When he's not busy making JARs executable or explaining why microservices are better than your ex, Luis can be found mentoring teams and making the impossible look easy.*

**Connect with Luis:**
- 🐙 [GitHub](https://github.com/luismr) - Where the magic happens
- 💼 [LinkedIn](https://linkedin.com/in/luismachadoreis) - Professional networking
- 🐦 [Twitter](https://twitter.com/luismr) - Random tech thoughts and dad jokes

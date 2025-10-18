package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello World application demonstrating SLF4J logging
 * and executable JAR with manifest.
 */
public class HelloWorld {
    
    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    
    public static void main(String[] args) {
        logger.info("Starting Hello World application...");
        
        System.out.println("Hello, World!");
        logger.info("Hello World message printed to console");
        
        // Demonstrate different log levels
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        
        logger.info("Hello World application completed successfully");
    }
    
    /**
     * Public method for testing purposes
     * @return greeting message
     */
    public String getGreeting() {
        return "Hello, World!";
    }
}

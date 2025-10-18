package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for HelloWorld class using JUnit 5
 */
public class HelloWorldTest {
    
    @Test
    public void testGetGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        String greeting = helloWorld.getGreeting();
        
        assertNotNull(greeting, "Greeting should not be null");
        assertEquals("Hello, World!", greeting);
    }
    
    @Test
    public void testGetGreetingContent() {
        HelloWorld helloWorld = new HelloWorld();
        String greeting = helloWorld.getGreeting();
        
        assertTrue(greeting.contains("Hello"), "Greeting should contain 'Hello'");
        assertTrue(greeting.contains("World"), "Greeting should contain 'World'");
        assertTrue(greeting.endsWith("!"), "Greeting should end with exclamation mark");
    }
    
    @Test
    public void testGetGreetingLength() {
        HelloWorld helloWorld = new HelloWorld();
        String greeting = helloWorld.getGreeting();
        
        assertTrue(greeting.length() > 0, "Greeting should have reasonable length");
        assertEquals(13, greeting.length(), "Greeting should be exactly 13 characters");
    }
}

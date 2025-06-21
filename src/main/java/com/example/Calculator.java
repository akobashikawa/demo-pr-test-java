package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a - b; // ¡Error intencional! Debería ser a + b
    }

    public int subtract(int a, int b) { // Nuevo método
        return a - b;
    }
}
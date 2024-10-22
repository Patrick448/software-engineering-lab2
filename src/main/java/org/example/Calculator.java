package org.example;

public class Calculator {

    public int addition(int a, int b){
        return a + b;
    }

    public int subtraction(int a, int b){
        return a + b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public int division(int a, int b){

        if(b == 0){
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a/b;
    }
}

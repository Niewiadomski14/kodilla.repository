package com.kodilla.calculator;

public class Calculator {

    public void addition() {
        int a = 10;
        int b = 5;

        int result = a + b;
        System.out.println(result);
    }

    public void subtraction(){
        int a = 10;
        int b = 5;

        int result = a - b;
        System.out.println(result);

    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.addition();
        calculator.subtraction();
    }

}

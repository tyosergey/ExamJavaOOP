package org.example;

public class Main {
    public static void main(String[] args) {
        Number number = new Number(4, 2);
        Calculator calculator = new CalcNumbers(number);
        System.out.println(calculator.sumNumbers());
    }
}
package org.example;

public class CalcNumbers implements Calculator{
    private Number number;

    public CalcNumbers(Number number) {
        this.number = number;
    }

    @Override
    public double sumNumbers() {
        return number.getFirstNumber() + number.getSecondNumber();
    }

    @Override
    public double multiplicationNumbers() {
        return number.getFirstNumber() * number.getSecondNumber();
    }

    @Override
    public double dividingNumbers() {
        if (number.getFirstNumber() == 0 || number.getSecondNumber() == 0) {
            System.out.println("На ноль делить нельзя.");
        }
        return number.getFirstNumber() / number.getSecondNumber();
    }
}

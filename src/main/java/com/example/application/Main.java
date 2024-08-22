package com.example.application;
import com.example.calculator.Calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        double num1 = 0;
        double num2 = 0;
        String operation = "";

        System.out.print("Введіть перше число: ");
        try {
            num1 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Будь ласка, введіть дійсне число.");
            return;
        }

        System.out.print("Введіть операцію (+, -, *, /): ");
        operation = scanner.next();

        System.out.print("Введіть друге число: ");
        try {
            num2 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Будь ласка, введіть дійсне число.");
            return;
        }

        try {
            double result = 0;
            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Невідома операція.");
                    return;
            }
            System.out.println(num1+operation+num2+" = "+ result);
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
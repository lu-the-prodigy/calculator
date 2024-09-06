package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение : ");
        String input = scanner.nextLine();
        try {
            String result = calc(input);
            System.out.println("Результат : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String calc(String input) throws Exception {

        input = input.trim();

        char operator = ' ';

        if (input.contains(" + ")) {
            operator = '+';
        } else if (input.contains(" - ")) {
            operator = '-';
        } else if (input.contains(" * ")) {
            operator = '*';
        } else if (input.contains(" / ")) {
            operator = '/';
        } else {
            throw new Exception("Строка не является математической операцией");
        }

        String[] parts = input.split(" \\" + operator + " ");
        if (parts.length != 2) {
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        int num1,num2;
        try {
            num1 = Integer.parseInt(parts[0].trim());
            num2 = Integer.parseInt(parts[1].trim());
        } catch (NumberFormatException e) {
            throw new Exception("Операнд не является целым числом");
        }

        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new Exception("Числа должны быть от 1 до 10 включительно");
        }
        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new Exception("Деление на ноль невозможно");
                }
                result = num1 / num2;
                break;
            default:
                throw new Exception("Неизвестная ошибка");
        }
        return String.valueOf(result);
    }
}
package com.example.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, Calculator!");

        boolean endFlag = false;
        while (!endFlag) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int n1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int n2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char op = sc.next().charAt(0);

            int result = 0;
            switch (op) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                case '/':
                    if (n2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        continue;
                    }
                    result = n1 / n2;
                    break;
            }

            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String s = sc.next();
            if (s.equals("exit")) endFlag = true;
        }
    }
}
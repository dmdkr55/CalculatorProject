package levelTwo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        boolean endFlag = false;
        while (!endFlag) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int n1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int n2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char op = sc.next().charAt(0);

            int calculateResult=0;
            try {
                calculateResult = cal.calculate(n1, n2, op);
            } catch (Exception e){
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                continue;
            }

            System.out.println("결과: " + calculateResult);

            System.out.println("모든 결과 확인하시겠습니까? (네/아니요)");
            String checkResults = sc.next();
            if (checkResults.equals("네")) {
                System.out.print("현재까지 저장된 결과값: ");
                ArrayList<Integer> results = cal.getResults();
                for (int result: results) {
                    System.out.print(result+" ");
                }
                System.out.println();
            }

            System.out.println("가장 먼저 저장된 결과값을 삭제하시겠습니까? (네/아니요)");
            String removeResult = sc.next();
            if (removeResult.equals("네")){
                cal.removeResult();
                System.out.println("삭제를 완료하였습니다.");

                System.out.print("삭제 후 결과값: ");
                ArrayList<Integer> results = cal.getResults();
                for (int result: results) {
                    System.out.print(result+" ");
                }
                System.out.println();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String s = sc.next();
            if (s.equals("exit")) endFlag = true;
        }
    }
}
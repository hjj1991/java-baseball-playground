package study;

import java.util.Scanner;

public class StringCalculator {

    public static final char PLUS = '+';
    public static final char MINUS = '-';
    public static final char DIVIDE = '/';
    public static final char MULTIPLY = '*';


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] splitValue = value.split(" ");
    }

    public int operation(String str){
        String[] value = str.split(" ");
        int sum = 0;
        for(int i = 0; i < value.length; i++){
            switch (value[i]){
                case PLUS:
                    sum += plus(Integer.valueOf(value[i-1]), Integer.valueOf(value[i+1]));
                    break;
                case MINUS:
                    sum += minus(Integer.valueOf(value[i-1]), Integer.valueOf(value[i+1]));
                    break;
                case DIVIDE:
                    sum += divide(Integer.valueOf(value[i-1]), Integer.valueOf(value[i+1]));
                    break;
                case MULTIPLY:
                    sum += multiply(Integer.valueOf(value[i-1]), Integer.valueOf(value[i+1]));
                    break;
            }
        }

        return sum;
    }

    public int operation(int firstValue, char operation, int secondValue){
        if(operation == PLUS){

        }
        if(operation == MINUS){

        }
        if(operation == DIVIDE){
        }
        if(operation == MULTIPLY){

        }

    }


    public int plus(int a, int b){
        return a + b;
    }

    public int minus(int a, int b){
        return a - b;
    }

    public int divide(int a, int b){
        try{
            return a / b;
        }catch (ArithmeticException e){
            System.out.println("숫자 0으로 나눌 수 없습니다.");
        }
    }

    public int multiply(int a, int b){
        return a * b;
    }

}

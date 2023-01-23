import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter required operation[+,-,*,/]");
        char operator = scanner.next().charAt(0);

        int res = calculate(firstNumber,secondNumber,operator);
        System.out.println(firstNumber + " " + operator + " "+ secondNumber + " = "+ res);
        scanner.close();
    }

    static int calculate(int x, int y, char operator) {
        int res = 0;
        switch (operator) {
            case '+':
                res = x + y;
                break;
            case '-':
                res = x - y;
                break;
            case '*':
                res = x * y;
                break;
            case '/':
                res = x / y;
                break;
        }

        return res;
    }
}

import java.util.Scanner;

public class FibonacciSeriesNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many fibonacci series numbers you want: ");
        int sum = scanner.nextInt();

        displayFibonacciSeries(sum);
        scanner.close();
    }

     static void displayFibonacciSeries(int n) {
        int x = 1, y= 0, z=0, count =1;

        while (count <= n){
            System.out.print(z+ "    ");
            z=x+y;
            x=y;
            y=z;
            count++;
        }

    }
}

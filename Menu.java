import java.util.Scanner;
import java.io.*;

class Menu {
    int res = 0;

    public static void main(String[] args) throws IOException {
        System.out.println("**************Menu*************");
        System.out.println("1.To find GCD LCM\n2.To Print N Fibo \n3.To Reverse a Number \n4. To Solve Addition of N natural Numbers:");
      Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();

        switch (ch) {
            case 1:
                int a, b, lcm, gcd;
                
                // Take two numbers from user
                System.out.println("Enter Two Number");
                a = scanner.nextInt();
                b = scanner.nextInt();

                gcd = getGcd(a, b);
                lcm = (a * b) / gcd;
                System.out.println("LCM = " + lcm);
                System.out.println("GCD = " + gcd);
                break;
            case 2:
                int terms, i;

                Scanner in = new Scanner(System.in);
                System.out.println("Enter number of terms in Fibonacci Series");
                terms = scanner.nextInt();

                // fibonacci(N) = fibonacci(N-1) + fibonacci(N-2);

                for (i = 0; i < terms; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                break;


            case 3:
                System.out.println("Enter a number");
                int x = scanner.nextInt();
                Reverse r = new Reverse();
                r.rev(x);
                break;
            case 4:
                int sum;
               
                System.out.print("Enter the value for num: ");
                int num = scanner.nextInt();
                sum = addNumbers(num);
                System.out.print("Sum of natural numbers are:" + sum);
                break;
        }
    }
    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGcd(b, a % b);
        }
    }
    public static int fibonacci(int num) {
        /* Exit condition of recursion*/
        if (num < 2)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
    void rev(int num) {
        int rem;
        if (num != 0) {
            rem = num % 10;
            res = (res * 10) + rem;
            num = num / 10;

            rev(num);
        } else
            System.out.println("reverse of a number is:" + res);
    }
    static int addNumbers(int num) {

        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }

}
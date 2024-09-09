//9.Визначити, які числа серед перших N чисел Фібоначчі можна задати у формі
       // omega^2 - 1(на 1 менше ніж певний квадрат).

import java.util.Scanner;
public class Main {
    static int fiboMethod(int n) {
        int a = 1;
        int b = 1;


        return b;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int square = 0;
        int omega = square * square - 1;

        System.out.println("Which number of Fibos");
        int fibo = myObj.nextInt();
        for (int i = 3; i <= fibo; i++) {
            int c = a + b;
            a = b;
            b = c;
            for (int j = 1; j < 1000; j++) {
                if (b == j * j - 1) {
                    System.out.println(b + "(" + j + "*" + j + "-1)");
                }
            }

        }
    }
}

package task1;

import java.util.Random;
import java.util.Scanner;

//n! (произведение чисел от 1 до n)
public class task22 {
    public static double factor(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int i = iScanner.nextInt();
        return factorial(i);
    }
    public static double factorial(int i) {
        if (i == 1) return 1;
        return i * factorial(i-1);

    }
}

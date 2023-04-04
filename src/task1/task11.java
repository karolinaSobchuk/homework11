package task1;
import java.util.Scanner;
public class task11 {
    public static void hello() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}
//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
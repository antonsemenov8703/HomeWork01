import java.util.Scanner;

public class Task1 {

//    Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//    Ввод:5
//    Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//    n! 1 * 2 * 3 * 4 * 5 = 120
    public static void main(String[] args) {

        Scanner iScanner = new Scanner (System.in);
        System.out.printf ("Введите число: ");
        int n = iScanner.nextInt () ;
        iScanner.close () ;

        int resultSum = 0;
        for (int i = 1; i <= n; i++) {
            resultSum += i;
        }
        System.out.println(resultSum);

        int resultFact = 1;
        for (int i = 1; i <= n; i++) {
            resultFact = resultFact * i;
        }
        System.out.printf("Факториал числа %d = %d", n, resultFact);
    }
}
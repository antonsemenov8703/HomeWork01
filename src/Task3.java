import java.lang.reflect.Type;
import java.util.Scanner;

public class Task3 {
//    Реализовать простой калькулятор (+ - / *)
//    Ввод числа ->
//    Ввод знака ->
//    Ввод числа ->
    public static void main(String[] args) {

        Scanner iScanner = new Scanner (System.in);
        System.out.println ("Введите первое число: ");
        float x = iScanner.nextFloat () ;
        System.out.println ("Введите знак (+ - / или *: ");
        char sign  = iScanner.next().charAt(0) ;
        System.out.println ("Введите второе число: ");
        float y = iScanner.nextFloat () ;
        iScanner.close () ;

        switch (sign){
            case '+':
                System.out.printf("%.0f %c %.0f = %.0f, ", x, sign, y, x+y );
                break;
            case '-':
                System.out.printf("%.0f %c %.0f = %.0f, ", x, sign, y, x-y );
                break;
            case '*':
                System.out.printf("%.0f %c %.0f = %.0f, ", x, sign, y, x*y );
                break;
            case '/':
                float result = (float)(x/y);
                System.out.printf("%.0f %c %.0f = %.2f, ", x, sign, y, result );
                break;
            default:
                System.out.println("ошибка");
        }
    }
}

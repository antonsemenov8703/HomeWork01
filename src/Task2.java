public class Task2 {
//    Вывести все простые числа от 1 до 1000

    public static void main(String[] args) {
        int [] arr = new int [0];
        int count = 0;
        System.out.print("1 ");
        for (int i = 1; i < 1001 ; i++){
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    count++;
                    break;
                }
                else {
                    if (count == 0) {
                        System.out.print(i + " ");
                        break;
                    }
                }
                count = 0;
            }
        }
    }

}

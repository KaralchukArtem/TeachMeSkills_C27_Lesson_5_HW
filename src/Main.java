import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int size;
        int count;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:  ");
        size = scanner.nextInt();
        System.out.print("Введите добавочное число:  ");
        count = scanner.nextInt();
        System.out.print("\n");

        int[][] arr = new int[size][size];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 9 +1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");


        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] +=count;
                sumArr += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\nСумма массива "+sumArr+"\n");

        String [][] arrString = new String[size][size];
        for (int i = 0; i < arrString.length; i++) {
            for (int j = 0; j < arrString[i].length ; j++) {
                if((i+j) % 2 == 0 ){
                    arrString[i][j] = "w";
                }else {
                    arrString[i][j] = "b";
                }
                System.out.print(arrString[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
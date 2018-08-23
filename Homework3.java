package Homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Длина массива ");
        int x = scanner.nextInt();
        int[] array = new int[x];
        System.out.println("Введити числа в массив");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];

        for (int n = 1; n < array.length; n++) {
            if (array[n] > max) max = array[n];
        }

        int min = array[0];
        for (int n = 1; n < array.length - 1; n++) {
            if (array[n] < min)
                min = array[n];
        }

        System.out.println("Вывод мах число массива " + max);
        System.out.println("Вывод мin число массива " + min);

        int a = 0;
        for(int n = 0; n < array.length;n++){
            if(array[n] == 5) a += 1;
        }
        System.out.println("Количевство 5  в массиве" + a);


        for (int n = 0; n < array.length; n++) {
            for (int g = 1; g < (array.length - n); g++) {
                if (array[g - 1] > array[g]) {
                    int temp = array[g - 1];
                    array[g - 1] = array[g];
                    array[g] = temp;

                }
            }
        }
        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n] + " ");
        }
    }
}







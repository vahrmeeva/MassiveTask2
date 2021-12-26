//Написать программу, выполняющую «сглаживание» вещественного массива A размерности N
//следующим образом: элемент AK
//заменяется на среднее арифметическое первых K исходных
//элементов массива A. На экран должны выводиться как оригинальное состояние массива, так и
//итоговое.
package ru.javabegin.oop;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayTask2 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элеменов массива:");
        int n = in.nextInt();
        System.out.println("Введите элементы массива:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Введите номер элемента:");
        int j = 0;
        int x = in.nextInt();
         //найдем количество элементов нового массива
        int i=0;
        //arr[i] == x
        j = n-x+1; // длина нового массива


        int sum=0;
        for(i = 0; i < x; i++){ //находим сумму первых х элементов
            sum = sum + arr[i];
        }
        //System.out.println(sum);
        int[] newarr = new int[j];
        newarr[0]= sum;
        int j1 = 1;
        for(i = 2; i<=n-1; i++) {
            newarr[j1]=arr[i];
            if (j1<j) {
                j1 = j1 + 1;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}

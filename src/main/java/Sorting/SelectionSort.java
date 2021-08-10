package Sorting;

import java.util.Arrays;

/*
                 Best	 Average  	Worst
Selection Sort	Ω(n^2)	 Θ(n^2)   	O(n^2)
* Сортировка методом выбора в Java реализует простой алгоритм следующим образом:

Алгоритм многократно ищет нижний элемент.
Заменить текущий элемент на элемент с самым низким значением
С каждой итерацией / проходом выбора сортировки элементы меняются местами.
* */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}

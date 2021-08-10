package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] params) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        countSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void countSort(int[] array) {
        final int MAX_VALUE = 100;

        int[] count = new int[MAX_VALUE];

        for (int i = 0; i < array.length; i++) {
            count[array[i]] = count[array[i]] + 1;
        }

        int arrayindex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[arrayindex] = i;
                arrayindex++;
            }
        }
    }

}

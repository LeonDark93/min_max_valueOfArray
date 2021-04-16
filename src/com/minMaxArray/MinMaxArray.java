package com.minMaxArray;

public class MinMaxArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, -1, 10, 45, 3,-67,200};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {

            if (minValue > array[i]) {
                minValue = array[i];

            }
            if (maxValue < array[i]) {
                maxValue = array[i];

            }

        }
        System.out.println(" ");
        System.out.println("Minimal value = " + minValue);
        System.out.println("Maximal value = " + maxValue);

    }

}

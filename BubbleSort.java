/*
 * Created by Reed Lawrence
 * Analysis of Algorythms Fall 2014
 * Implementation of a Bubble sort.
 * Don't ever want to use this, but it is really simple to implement
 */
//package bubblesort;

import java.io.*;
import java.lang.*;

public class BubbleSort {
    //bubble sort
    static void sort(int[] array) {
        boolean swap = true;
        while (swap == true) {
            swap = false;
            for (int i = 1; i < array.length; i++) {
                //bubble swap
                if (array[i - 1] > array[i]) {
                    swap = true;
                    swap(array, i - 1, i);
                }
            }
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println("");
        }
    }
    static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    public static void main(String[] args) {
        int[] array;

        array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        sort(array);

        for (int i = 0; i < args.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

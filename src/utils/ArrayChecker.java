package utils;

import domain.ArrayManipulator;

public class ArrayChecker {
    public static void main(String[] args) {

        ArrayManipulator arrayManipulator = new ArrayManipulator();

        int[] ints9 = fillTable(9);
        int[] ints10 = fillTable(10);

        try {
            arrayManipulator.calculateArray(null, 1);
        } catch (NullPointerException e) {
            System.out.println("wylapany");
        }

        try {
            arrayManipulator.calculateArray(ints9, 900);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wylapany");
        }

        try {
            arrayManipulator.calculateArray(ints9, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("wylapany");
        }

        try {
            arrayManipulator.calculateArray(ints9, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("wylapny");
        }

        int[] result9_2 = arrayManipulator.calculateArray(ints9, 2);
        printTable(result9_2);

        int[] result9_3 = arrayManipulator.calculateArray(ints9, 3);
        printTable(result9_3);

        int[] result10_3 = arrayManipulator.calculateArray(ints10, 3);
        printTable(result10_3);

        int[] result10_4 = arrayManipulator.calculateArray(ints10, 4);
        printTable(result10_4);

        int[] result10_2 = arrayManipulator.calculateArray(ints10, 2);
        printTable(result10_2);
    }

    private static int[] fillTable(int size) {
        int[] tab = new int[size];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i+1;
        }

        return tab;
    }

    private static void printTable(int[] tab){
        String result ="TAB: ";
        for (int i : tab) {
            result = result +"[" + i +"]";
        }
        System.out.println(result);
    }
}

package com.yorix.hillel.java_elementary.tasks_from_1_to_29.task05;

public class D extends PrintArray {
    private static int[][] arr = {
            {27, 25, 23, 24, 21},
            {10, 20, 30, 40, 50},
            {44, 35, 31, 18, 12}
    };

    private static int sumOfColumn(int col) {
        return arr[0][col] + arr[1][col] + arr[2][col];
    }

    private static int countUp() {
        int max = sumOfColumn(0);
        int columnNumber = 1;
        for (int i = 0; i < arr[0].length; i++) {
            int sum = sumOfColumn(i);
            if (sum > max) {
                max = sum;
                columnNumber = i + 1;
            }
            System.out.print(sum + " ");
        }
        System.out.println();
        return columnNumber;
    }

    public static void main(String[] args) {
        printArray(arr);
        int MaxColNum = countUp();

        System.out.printf("Column %d contain the maximum sum.\n", MaxColNum);
    }
}

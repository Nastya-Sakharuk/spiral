package com.epam.rd.autotasks;

public class Spiral {
    public static void main(String[] args) {
        int[][] array = Spiral.spiral(5, 6);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4s", array[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] spiral ( int rows, int columns){
        int[][] arr = new int[rows][columns];
        int num = 1;
        int max = rows * columns;

        int rmin = 0, rmax = rows - 1;
        int cmin = 0, cmax = columns - 1;

        while (num <= max) {
            // проход вправо по верхней строке, инкремент столбцов
            for (int i = cmin; num <= max && i <= cmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;
            // проход вниз по правому краю, инкремент строк
            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][cmax] = num++;
            }
            cmax--;
            // проход влево по нижней строке, декремент столбцов
            for (int i = cmax; num <= max && i >= cmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;
            // проход вверх по левому краю, декремент строк
            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][cmin] = num++;
            }
            cmin++;
        }
        return arr;
    }
}

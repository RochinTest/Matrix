//Определите класс для матриц. Напишите перегруженные конструктор для создания
// одномерной и двумерной матриц. В конструкторы передаются размерности матриц.
// (В конструктор для одномерной матрицы передается один параметр, для двумерной два).
// Напишите методы для выведения, сложения, вычитания и умножения матриц.
package com.example.Matrix;

import java.util.*;

public class Matrix {
    public int rows;
    public int columns;
    public int mass[];
    public int mas[];
    public int cwadro[][];
    public int n = 0;

    public Matrix() {
        this.rows = rows;
        this.columns = columns;
        this.mass = new int[rows];
        this.mas = new int[rows];
        this.cwadro = new int[rows][columns];
    }

    public Matrix(int rows) {
        this.rows = rows;
        this.columns = columns;
        this.mass = new int[rows];
        this.mas = new int[rows];
        this.cwadro = new int[rows][columns];
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.mass = new int[rows];
        this.mas = new int[rows];
        this.cwadro = new int[rows][columns];
    }

    public void matrix() {
        mass = new int[rows];
        for (int i = 0; i < rows; i++) {
            mass[i] = (int) (Math.random() * 100);

        }
    }

    public void matrix(int rows) {
        mass = new int[rows];
        for (int i = 0; i < rows; i++) {
            mass[i] = (int) (Math.random() * 100);

        }
    }

    public void matrix(int rows, int columns) {
        cwadro = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            //System.out.println();
            for (int j = 0; j < columns; j++) {
                cwadro[i][j] = (int) (Math.random() * 100);

            }
        }
    }

    public void add() {
        n = 1;
        matrix();
        mas = new int[rows];

        for (int i = 0; i < rows; i++) {
            mas[i] = mass[i] + mass[i];

        }
        show(rows);
        show();
    }

    public void sub() {
        int n = 0;
        matrix();
        show(rows);
        mas = new int[rows];

        for (int i = 0; i < rows; i++) {
            mas[i] = mass[i];

        }
        matrix();
        for (int i = 0; i < rows; i++) {
            mas[i] = mas[i] - mass[i];
        }
        show(rows);

        show();
    }

    public void mult() {
        n = 2;
        matrix();
        mas = new int[rows];

        for (int i = 0; i < rows; i++) {
            mas[i] = mass[i] * mass[i];

        }
        show(rows);
        show();
    }

    public void show(int rows, int columns) {
        matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.println("Матрица cwadro " + rows + "x" + columns + "=  " + cwadro[i][j]);
            }
        }System.out.println();
    }

    public void show(int rows) {
        System.out.println("Исходная матрица mass " + rows + "x" + columns);
        for (int i = 0; i < rows; i++) {
            System.out.print(" " + mass[i]);
        }
        System.out.println();
    }

    public void show() {
        if (n == 0) {
            System.out.println("Матрица вычитание mass - mass " + rows + "x" + columns);
        } else if (n == 1) {
            System.out.println("Матрица сложение mass + mass " + rows + "x" + columns);
        } else if (n == 2) {
            System.out.println("Матрица умножение mass * mass " + rows + "x" + columns);
        }
        for (int i = 0; i < rows; i++) {

            System.out.print(" " + mas[i]);
        }System.out.println();
    }

    public static void main(String[] arg) {

        Matrix w = new Matrix();
        w.rows = 4;
       // w.mult();
       // w.add();
        w.sub();
        //w.add();
        // w.matrix(5,8);
        // w.getMass();
        // w.show(5);
        //w.show();


    }
}




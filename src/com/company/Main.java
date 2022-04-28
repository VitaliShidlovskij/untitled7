package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 20;
        System.out.println("Итого " + task(value));
    }

    public static int task(int value) {
        int result = 0;
        for (int a = 0; a < value; a++) {
            if (a % 3 == 0 || a % 5 == 0) {
                result = result + a;
                //System.out.println("Итого " + result + " Индекс " + a);
            }
            else if (a % 3 == 0 && a % 5 == 0) {
                result = result + a;
                //System.out.println("Итого " + result + " Индекс " + a);
            }
        }

        return result;


    }
}
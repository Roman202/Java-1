package com.company;

public class Main {

    public static void main(String[] args) {

        int x; // змінна х видна в всьому методі main()
        x = 1;
        System.out.println("До вкладеного блока: x = " + x);

        {
            // новий блок створює нову область видимості

            /* змінна у доступна тільки в середені цього блока, но це не мішає
            їй використовувати разом з змінною х з верхнього блоку
             */

            int y = 3;

            // тут дієють дві змінні х і у
            System.out.println("Внутрішній блок: х = " + x + ", y = " + y);

            x = y * 3;
        } // кінець вкладеного блоку

        // як видно змінна х видна у всій програмі
        System.out.println("Після вкладеного блоку: х = " + x);
    }
}

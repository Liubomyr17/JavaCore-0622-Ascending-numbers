package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*

0622 Числа по возрастанию

Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода: 3 2 15 6 17
Пример вывода: 2 3 6 15 17

Требования:
1. Программа должна считывать 5 чисел с клавиатуры.
2. Программа должна выводить 5 чисел, каждое с новой строки.
3. Выведенные числа должны быть отсортированы по возрастанию.
4. Вывод должен содержать те же числа, что и были введены (порядок не важен).


*/

// public class Solution
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] vct = new int[5];
        for (int i = 0; i < vct.length; i++) {
            vct[i] = Integer.parseInt(reader.readLine());
        }
        int tmp;
        for (int i = 0; i < vct.length; i++)
            for (int j=i+1; j<vct.length; j++)
                if(vct[i] > vct[j]) {
                    tmp = vct[i];
                    vct[i] = vct[j];
                    vct[j] = tmp;
        }
        for (int i = 0; i < vct.length; i++) {
            System.out.println(vct[i]);
        }
    }
}












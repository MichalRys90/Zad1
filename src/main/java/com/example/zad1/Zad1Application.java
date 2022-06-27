package com.example.zad1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Scanner;

/**
 * Napisać program, który wczytuje od użytkownika liczbę oznaczającą,
 * ile należy wylosować liczb z zakresu od -100 do 100.
 * Następnie dokonuje obliczeń stosunku wylosowanych liczb dodatnich (bez zera)
 * do liczb ujemnych oraz najmniejsze i największej znalezionej liczby.
 * Wynikiem działania programu powinna być informacja na temat wszystkich trzech wartości.
 * W programie nie należy używać tablic.
 */

@SpringBootApplication
public class Zad1Application {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int howManyRandom = scanner.nextInt();
        int numberPlus = 0;
        int numberMinus = 0;
        int max = 0;
        int min = 0;

        for (int i=0; i<howManyRandom; i++) {
            int liczba = random.nextInt(101 + 100) - 100;
            if (liczba>0) {
                numberPlus++;
            }
            else if (liczba < 0) {
                numberMinus ++;
            }
            if (liczba<min) {
                min = liczba;
            }
            max = liczba > max ? liczba : max;
        }
        if (numberMinus !=0) {
            double ratioPlusMinus = numberPlus / (double) numberMinus;
            System.out.println("Ratio plus minus = " + ratioPlusMinus + " number min = " + min + " number max = " + max);
        } else if (numberMinus == 0) {

            System.out.println(" number minus = 0 Pamietaj cholero nie dziel przez 0 " + " number min = " + min + " number max = " + max);

        }


    }
}
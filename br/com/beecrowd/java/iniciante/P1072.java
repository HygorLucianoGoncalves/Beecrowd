package br.com.beecrowd.java.iniciante;

import java.util.Scanner;

public class P1072 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < x; i++) {
            int y = sc.nextInt();

            if (y >= 10 && y <= 20) {
                in++;
            } else out++;

        }

        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}

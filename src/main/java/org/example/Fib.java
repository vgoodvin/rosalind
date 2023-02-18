package org.example;

public class Fib {
    public static int calc(int n, int k) {
        int r1 = 1;
        int r2 = 1;
        for (int i = 2; i < n; i++) {
            int tmp = r2;
            r2 += r1 * k;
            r1 = tmp;
        }

        return r2;
    }
}

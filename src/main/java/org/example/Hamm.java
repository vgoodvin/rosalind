package org.example;

public class Hamm {
    public static int calc(String dna1, String dna2) {
        int dist = 0;
        for (int i = 0; i < dna1.length(); i++) {
            if (dna1.charAt(i) != dna2.charAt(i)) {
                dist++;
            }
        }
        return dist;
    }
}

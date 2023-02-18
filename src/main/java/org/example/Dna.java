package org.example;

public class Dna {
    public static int[] calc(String dna) {
        int adenine = 0;
        int cytosine = 0;
        int guanine = 0;
        int thymine = 0;
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.charAt(i)) {
                case 'a', 'A' -> adenine++;
                case 'c', 'C' -> cytosine++;
                case 'g', 'G' -> guanine++;
                case 't', 'T' -> thymine++;
            }
        }

        int[] result = new int[4];
        result[0] = adenine;
        result[1] = cytosine;
        result[2] = guanine;
        result[3] = thymine;

        return result;
    }
}
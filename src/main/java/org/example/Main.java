package org.example;

import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private static void run() {
        HashTable<Integer> HashTable = new HashTable<>();
        HashSet<Integer> jHashSet = new HashSet<>();
        Random random = new Random();
        int num = 1000000;
        long start = System.currentTimeMillis();
        for (int i = 0; i <= num; i++) {
            HashTable.add(random.nextInt(1, num));
        }
        long finish = System.currentTimeMillis();
        System.out.println("HashTable (Витрачений час) = " + (finish-start));
        start = System.currentTimeMillis();
        for (int i = 0; i <= num; i++) {
            jHashSet.add(random.nextInt(1, num));
        }
        finish = System.currentTimeMillis();
        System.out.println("HashSet (Витрачений час) = " + (finish-start));

    }
}
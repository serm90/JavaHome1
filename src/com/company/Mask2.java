package com.company;

import java.io.IOException;

public class Mask2 {

    public static void main(String[] args) throws IOException {

        int x = 15;

        x &= ~(1 << 2); // установить в 0 бит 2

        int y = x & (1 << 2); // узнаем про 2 бит
        int z = x & (1 << 3); // узнаем про 3 бит
        System.out.println(Integer.toBinaryString(x) + " " + x + " " + y + " " + z);
    }
}

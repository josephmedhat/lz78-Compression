package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Text U Want to compress :");
        String text="ABAABABAABABBBBBBBBBBA";

        Lz78 lz78=new Lz78(text);
        lz78.Compress();
        lz78.getCompressedText();
        System.out.println(lz78.deCompress());

    }


}

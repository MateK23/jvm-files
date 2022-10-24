package com.matek;

import java.io.File;
import java.util.Objects;

public class Code1 {
    public Code1() {
        // C:\Users\matew\Desktop\test
        File testFile = new File("C:/Users/matew/Desktop/test");

        System.out.println(testFile.exists());
        System.out.println(testFile.isFile());
        System.out.println(testFile.isDirectory());
        System.out.println(testFile.canRead());
        System.out.println(testFile.canWrite());


        for (File file : Objects.requireNonNull(testFile.listFiles())) {
            System.out.println(file.getName());
        }


    }
}

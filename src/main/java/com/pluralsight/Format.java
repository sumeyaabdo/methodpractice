package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        formatName("Sumeya", "Abdo");
        System.out.println(formatName("Sumeya", "Abdo"));

    }
    public static String formatName(String first, String last){
       return (last + ", " + first);
    }
}

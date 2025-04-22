package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        // Sayıları iki katına çıkarma (Geleneksel yöntem)
        /*
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
         */

        //Lambda kullanarak
        numbers.replaceAll(n -> n*2);


        // Sonuçları yazdırma
        /*
        for (int number : numbers) {

            System.out.println(number);
        }
         */

        //Sonuçları yazdırma Lambda ile
        numbers.forEach(System.out::println);
    }
}

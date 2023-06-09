package com.slokam;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionsExample {
	
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

      
    
        numbers.forEach((Integer number) -> {
            System.out.println(number);
        });

    }
    
}
package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegersDescending {
	 public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);
	        
	        List<Integer> result=  numbers.stream().sorted((a,b) -> b.compareTo(a))
	        .collect(Collectors.toList());
	        for(Integer i: result)
	        {
	        	System.out.print(i+" ");
	        }
	 }
}

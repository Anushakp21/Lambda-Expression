package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNonEmptyString {
	 public static void main(String[] args) {
	        List<String> strings = Arrays.asList("apple", "", "banana", " ", "cherry", "", "date");

	        List<String> nonEmptyStrings = strings.stream()
	                .filter(s -> !s.isEmpty()) 
	                .collect(Collectors.toList());

	        System.out.println("Non-empty strings: " + nonEmptyStrings);
	    }

}

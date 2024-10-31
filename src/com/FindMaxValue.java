package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxValue {
	public static void main(String[] args) {
		
	 List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);

     Optional<Integer> maxValue = numbers.stream()
             .max(Integer::compareTo);

     maxValue.ifPresent(value -> System.out.println("Maximum value: " + value));
 }
}

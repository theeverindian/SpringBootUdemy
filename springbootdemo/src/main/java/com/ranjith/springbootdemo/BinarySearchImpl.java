package com.ranjith.springbootdemo;

public class BinarySearchImpl {
	SortAlgorithm sortAlgorithm;
	
	// ctrl + shift + s (short cut)
	// This is loose coupling, we pass the dependency to the binary search in constructor
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int number) {
		//dummy implementation
		// 1. Sort
		
		/*
		 	This tight coupling, betwwen Binary search and bubble sort
			
			BubbleSortAlgorithm bsa = new BubbleSortAlgorithm();
			int[] sortednumbers = bsa.sort(numbers); 
		 */		
		
		// good programming 
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println("Algorithm used is :" + sortAlgorithm);
		
		// 2. Impl Binary Search
		// 3. Return index
		int index = 0;
		return index;
	}
}

package com.epam.training.java.sort;

public class Service {

	public Service() {
	}

	public static void printArray(int[] array) {
		if (array == null) {
			System.out.println("Error: You sent the empty array!");
		} else {
			System.out.print("Array = ");
			for (int i : array) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}

	public void bubleSort() {
		System.out.println("Sorting by a bubble:");
		int[] array = { 17, 2, -5, 6, 0, 8, 17, -20 };
		printArray(array);
		try {
			printArray(Sort.sortBubble(array));
		} catch (SortException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("");
	}

	public void selectionSort() {
		System.out.println("Sorting by the choice:");
		int[] array = { -4, 27, 15, -2, 63, 18, 46, 100 };
		printArray(array);
		try {
			printArray(Sort.sortSelection(array));
		} catch (SortException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("");
	}

	public void insertionSort() {
		System.out.println("Sorting by inserts:");
		int[] array = { 16, -1, 83, 10, -1, 5, 25, 33 };
		printArray(array);
		try {
			printArray(Sort.sortInsertion(array));
		} catch (SortException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("");
	}

	public void quickSort() {
		System.out.println("Quick sort:");
		int[] array = { 25, 15, -1, 69, 4, 37, -9, 0 };
		printArray(array);
		try {
			printArray(Sort.sortQuick(array));
		} catch (SortException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("");
	}

}

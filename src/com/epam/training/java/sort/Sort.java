package com.epam.training.java.sort;

public final class Sort {

	private Sort() {

	}

	public static int[] sortBubble(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		return array;
	}

	public static int[] sortSelection(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			int tmp = array[i];
			array[i] = array[min];
			array[min] = tmp;
		}
		return array;
	}

	public static int[] sortInsertion(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int previous = i - 1;
			while (previous >= 0 && array[previous] > current) {
				array[previous + 1] = array[previous];
				array[previous] = current;
				previous--;
			}
		}
		return array;
	}

	public static int[] sortQuick(int[] array) {
		int start = 0;
		int end = array.length - 1;
		sort(start, end, array);
		return array;
	}

	public static void sort(int start, int end, int[] array) {
		if (start == end) {
			return;
		}
		int middle = start + (end - start) / 2;
		int pivot = array[middle];
		int i = start, j = end;
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				i++;
				j--;
			}
		}
		if (start < j)
			sort(start, j, array);
		if (end > i)
			sort(i, end, array);
	}
}

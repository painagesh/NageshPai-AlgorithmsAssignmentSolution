package com.greatlearning.service;

public class BinarySearchImplementation {

	public void searchValue(double sharePriceArray[], double searchVal) {
		int left = 0;
		int right = sharePriceArray.length - 1;
		int mid = left + (right - left) / 2;

		while (left <= right) {

			if (searchVal < sharePriceArray[mid]) {
				// range is l to mid-1
				right = mid - 1;
			} else if (searchVal > sharePriceArray[mid]) {
				// range is mid+1 to r
				left = mid + 1;

			} else {
				System.out.println("Stock of value " + searchVal + " is present ");
				break;
			}
			mid = left + (right - left) / 2;
		}

		if (left > right) {
			System.out.println("Value not found");
		}
	}

	
}

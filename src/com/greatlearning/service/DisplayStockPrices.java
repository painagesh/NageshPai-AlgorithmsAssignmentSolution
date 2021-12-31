package com.greatlearning.service;

public class DisplayStockPrices {

	public void displayInAscendingOrder (double sharePriceArray[]) {
		
		for (int i = 0; i<= sharePriceArray.length-1; i++) {
			
			System.out.print(sharePriceArray[i]+ " ");
		}
		System.out.println();
	}
	
	
	public void displayInDescendingOrder (double sharePriceArray[]) {
		
		for (int i=sharePriceArray.length-1; i >=0; i--) {
			
			System.out.print(sharePriceArray[i]+ " ");
			
		}
		System.out.println();
	}
}

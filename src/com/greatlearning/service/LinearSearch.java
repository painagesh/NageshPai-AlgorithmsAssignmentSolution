package com.greatlearning.service;

public class LinearSearch {

	public int countofCompanies (boolean stockPriceArray[]) {
		
		int count = 0;
		
		for (int i=0; i<=stockPriceArray.length-1; i++) {
			
			if (stockPriceArray[i] == true) {
				count++;
				
			}
			
		}
		return count;
	}
	
}

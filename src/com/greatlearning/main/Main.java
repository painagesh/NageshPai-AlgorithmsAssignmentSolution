package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.service.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//Seek the number of companies from user
		System.out.println("Enter the number of companies");
		
		int N = 0;
		N = sc.nextInt();
		
		//Seek the details of the companies
		
		double sharePrice[] = new double [N];
		boolean stockPriceFlag [] = new boolean [N];
		
		for (int i=0; i<=N-1; i++) {
			
			System.out.println("Enter current stock price of the company "+(i+1));
			sharePrice[i]=sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			stockPriceFlag[i]=sc.nextBoolean();	
		}
		
		
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		mergeSortImplementation.sort(sharePrice, 0, sharePrice.length-1);
		
		LinearSearch SearchCompanies = new LinearSearch();
		DisplayStockPrices DisplayPrices = new DisplayStockPrices ();
		BinarySearchImplementation SearchStockPrice = new BinarySearchImplementation ();
		

		
		int userSelection;
		
		int exitFlag = 1;
		while (exitFlag == 1) {
			
			System.out.println("------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			
			userSelection = sc.nextInt();
			
			switch (userSelection) {
			
			case 1: 
				//call function to display stock prices in ascending order
				DisplayPrices.displayInAscendingOrder(sharePrice);
				break;
				
			case 2: 
				//call function to display stock prices in descending order
				DisplayPrices.displayInDescendingOrder(sharePrice);
				break;
				
			case 3: 
				//call function to display total no. of companies for which stock prices rose today
				System.out.println("Total no of companies whose stock price rose today "+ SearchCompanies.countofCompanies(stockPriceFlag));
				break;
				
			case 4: 
				//call function to display total no. of companies for which stock prices declined today
				System.out.println("Total no of companies whose stock price declined today "+ (N - SearchCompanies.countofCompanies(stockPriceFlag)));
				break;
				
			case 5:
				//call function to search a specific stock price
				System.out.println("Enter the key value");
				double searchVal = sc.nextDouble();
				SearchStockPrice.searchValue(sharePrice, searchVal);
				break;
				
			case 0:
				exitFlag = 0;
				System.out.println("Exited successfully");
				break;
				
				default:
					System.out.println("Enter valid option");
		
			}
			
		}
		
	
		sc.close();
	}

}

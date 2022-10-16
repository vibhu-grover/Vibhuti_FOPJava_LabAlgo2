

import java.util.Scanner;

public class Transaction {

	Scanner sc = new Scanner(System.in);
	public int[] transactionArray;
	int size;

	public void insertValues() {
		
		System.out.println("Enter the Size of transactions arrray: ");
		size = sc.nextInt();
		
		int[] transactionArray = new int[size];
		
		System.out.println("Enter the transaction array values: ");
		for(int i=0;i<size;i++) {
			transactionArray[i] = sc.nextInt();
		}
		
		this.transactionArray = transactionArray;
}}
	

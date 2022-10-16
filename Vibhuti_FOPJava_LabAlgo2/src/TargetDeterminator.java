

import java.util.Scanner;



public class TargetDeterminator {
	Scanner sc = new Scanner(System.in);
	int targetNumber, targetValue, sum, flag;
	
	public void targetValue(int[] transactionArray) {
		
		System.out.println("Enter the total number of targets that needs to be achieved: ");
		targetNumber = sc.nextInt();
	
		System.out.println("Enter the target value: ");
		targetValue = sc.nextInt();
		
		flag = 0;
		sum = 0;
		
		for(int j=0;j<transactionArray.length;j++) {
			
			sum += transactionArray[j];
			
			if(sum>=targetValue) {
				System.out.println("Target achieved after "+(j+1)+" transactions");
			
				flag=1;
				break;
			
			}
			
		}
		if(flag==0) {
			System.out.println("Given target is not achieved!");
		}
		
	}
		
	
	
	public static void main(String[] args) {
		
		Transaction obj = new Transaction();
		obj.insertValues();
		
		TargetDeterminator obj2 = new TargetDeterminator();
		obj2.targetValue(obj.transactionArray);
		
	}


}

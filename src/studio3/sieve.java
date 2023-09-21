package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your upper limit for you prime number sort?");
		int n = in.nextInt();
		
		boolean [] nums = new boolean[n];
		
			for (int i = 2; i < Math.sqrt(n); i++)
			{
				if (nums [i] == false) 
				{
					for (int j = (int)Math.pow(i, 2); j < n; j += i ) 
					{
						nums[j] = true;	
					}
				}
			}
		
			for (int i = 2; i < n; i++) 
			{
				if (nums[i] == false) 
				{
					System.out.println(i);
				}	
				
			}
		

	}

}

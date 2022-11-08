package logicalProgrammday6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num;
		int count = 0;
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();

		for(int i=1; i<=num; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}


		if(count == 2)
		{
			System.out.println( "prime number");
		}
		else
		{
			System.out.println( "it is not prime number");


		}

	}
}




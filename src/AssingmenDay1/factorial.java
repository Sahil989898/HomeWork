package AssingmenDay1;

import java.util.Scanner;

public class factorial {
	public static int fact(int n) {
		int result =1;
		while (n>0) {
			result = result*n;
			n--;
		}
		return result;
	}

	public static void main(String[] args) {
    Scanner s= new Scanner (System.in);   
	System.out.println("enter n value");
	int n =s.nextInt();
	int res = factorial.fact(n);
 System.out.println("factorial is: "+res);
	
	}
}

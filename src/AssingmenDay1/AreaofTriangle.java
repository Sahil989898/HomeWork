package AssingmenDay1;

import java.util.Scanner;
public class AreaofTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Length a of Triangle");
		int a=s.nextInt();
		System.out.println("Breadth b of Triangle");
		int b=s.nextInt();
		float area = (a*b)/2f;
		
		System.out.println("Area of Triangle is:" +area);

	}
}

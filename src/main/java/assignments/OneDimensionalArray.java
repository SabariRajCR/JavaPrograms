package assignments;

import java.util.Scanner;



public class OneDimensionalArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++){
			System.out.println("enter value of " + a[i] + "  "  );
			a[i] = scan.nextInt();
			
			
		}
		
		for (int i = 0;i<a.length;i++){
			
			System.out.println(a[i]);
			
			
		}
		 
	}

}

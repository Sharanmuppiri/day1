package day1;

import java.util.Arrays;

public class sortarrayelements {
	
	public static void main(String[] args) {
		
		int [] numbers= {10,30,20,60,40,50};
		Arrays.sort(numbers);
		
		for(int num:numbers) {
			
			System.out.println(num);
		}
	}
	

}

package BaseTEst;

import java.util.Arrays;

public class BaseClassJavaPrograms {
	

		public static void main(String args[]) {
			System.out.println("Hello world");
			
			//reverse a number
			int n=934342;
			int digit,reversed=0;
			while(n!=0) {
				digit=n%10;
				reversed=reversed*10+digit;
				n=n/10;
			}
			System.out.println("Reversed digit"+reversed);
			
			//reverse a string
			
			String str="I am new to this";
			
			String reverse=""; 
			for(int i=str.length()-1;i>=0;i--) {
				reverse=reverse+str.charAt(i);
			}
			System.out.println(reverse);
			
			//sort a string
			
			String[] str2= {"sd", "df", "fg"};
			Arrays.sort(str2);
			
			System.out.println(str2);
			
			
		}
	}



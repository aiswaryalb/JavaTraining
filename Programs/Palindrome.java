import java.util.*;
import java.io.*;
class Palindrome
{
	public static void main(String[] args)
	 {
	 	int num1,r=0,rev=0;
	 	Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=in.nextInt();
		num1=num;
		while(num1!=0)
		{
			r=num1%10;
			rev=rev*10+r;
			num1=num1/10;
		}
		if(rev==num)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}


}
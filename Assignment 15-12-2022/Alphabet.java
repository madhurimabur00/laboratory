package basic;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char c;
		System.out.println("Enter a character:");
		c=sc.next().charAt(0);
		if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
		{
			System.out.println("the character is an alphabet");
		}
		else
		{
			System.out.println("the character is not an alphabet");
		}
	}

}

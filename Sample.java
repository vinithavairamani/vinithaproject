/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sample
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("positive number");
		}
		else if(a<0)
		{
			System.out.println("negative number");
		}
		else
		{
			System.out.println("zero");
		}
	}
}

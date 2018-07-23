import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String s1[]=s.split(" ");
		String sum3=" ";
		String a[]={};
		
		int i=0,sum1=0,sum2=0,i1=0;
		for(String s3:s1){
		 int n=s3.length();
		 if(n%2!=0){
		 	for( i=0;i<n/2;i++){
		 sum1+=i+n-(i+1);
		
		 	}
		 	sum2=n/2;
		 }
		 
		 sum3=sum1+""+sum2;
		 System.out.println(sum3);
		
		 a[i1]=sum3;
		
		 i1++;
		 System.out.println(i1++);
		
		 
		}
		System.out.println(sum3);
		
		
	}
}

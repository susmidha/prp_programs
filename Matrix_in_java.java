import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	// your code goes here()
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		int col=scan.nextInt();
		int m1[][]=new int[row][col];
		int m2[][]=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				m1[i][j]=scan.nextInt();
			}
			
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				m2[i][j]=scan.nextInt();
			}
			
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(m1[i][j]==m2[i][j]){
					System.out.println("both are equa
				}
				else{
					System.out.println("both are not  equal");
				}
			}
			
		}
		
		
	}
}

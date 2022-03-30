package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [][] mat = new int [n][n];
		
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < n; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal:");
		
		for(int i = 0; i < mat.length; i++)
		{
		  System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		System.out.print("Negativos: ");
		int negativos = 0;
		
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat.length; j++)
			{ 
				if(mat[i][j] < 0)
				{
					negativos++;
				}
			}
		}
		
		System.out.println(negativos);
		sc.close();

	}

}

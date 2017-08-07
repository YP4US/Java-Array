//Array Declaration and initialization 
//Name: Yogesh P.Pawar
import  java.util.Scanner;

class Programm1
{

	static int[] takeArrayValue(int arr2[])
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Values in array:");
		for(int i=0;i<=4; i++ )
		{
			arr2[i]=sc1.nextInt();
		}
		return arr2;

	}
	public static void main(String args[])
	{
		
		System.out.println(" Hi I am Java Developer");
		System.out.println("Programm Started...");
		int arr[] = new int [5];
		int arr3[]=takeArrayValue(arr);
		System.out.println(" Printing the output.....");
		for(int j=0;j<=4;j++)
		{
			System.out.println(arr3[j]);
		}
		System.out.println("Program Ended...");
	}
}
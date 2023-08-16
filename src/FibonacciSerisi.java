import java.util.Scanner;

public class FibonacciSerisi 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Fibonacci sayi dizisinin eleman sayisini girin: ");
		int n = inp.nextInt();
		System.out.println("");
		
		int first=0, second=1;
		System.out.print("FIBONACCI DIZISI: " + "\n" + first + "," + second);
		
		for(int i=2; i<n; i++) 
		{
			int next = first + second;
			System.out.print("," + next);
			first = second;
			second = next;
		}
	}
}
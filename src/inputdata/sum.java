package inputdata;
import java.util.Scanner;

public class sum {
	public static void main(String[]args){
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a and b");
		int firstnum  = scanner.nextInt();
		int secondnum = scanner.nextInt();
		int sum = firstnum+secondnum;
		System.out.println("the sum is "+ sum);
		
		
	}

}

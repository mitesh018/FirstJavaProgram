import java.util.Scanner;

public class Whiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number to check: - ");
		int i = sc.nextInt();
			
		CheckOddorEven(i);
		System.out.println("");
		if(CheckOddorEven1(i))
			System.out.print(i +" is an even");
		
		
	}
	public static void CheckOddorEven(int i) {
		if(i%2==0)
			System.out.print(i +" is an even");
		else
			System.out.print(i +" is an odd");
		
	}
	
	public static boolean CheckOddorEven1(int i) {
		if(i%2==0)
			return true;
		else
			return false;
		
		
	}

}

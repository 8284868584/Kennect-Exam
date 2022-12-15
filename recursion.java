package ChetanGavhaneExam;
import java.util.*;


class recursion {

	static int ans = 0;
	static int Reverse(int var)
	{
		if (var == 0) {
			return ans;
		}
		if (var > 0) {
			int temp = var % 10;
			ans = ans * 10 + temp;
			Reverse(var / 10);
		}
		return ans;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no=");
		int var =sc.nextInt();
		
		int rev;
		rev = Reverse(var);
		System.out.println("Reversed number: " + rev);
	}
}

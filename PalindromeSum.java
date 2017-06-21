import java.util.Scanner;


public class PalindromeSum {
	public static void main(String []args){
		int sum=0;
		int r;
		Scanner s=new Scanner(System.in);
		System.out.print("The number is:");
		int n=s.nextInt();
		while(n!=0){
			r=n%10;
			n=n/10;
			sum=sum+r;
			}
		
		String str=(String.valueOf(sum));
		String reverse=new StringBuffer(str).reverse().toString();
		if(str.equals(reverse)){
			System.out.println("The sum is palindrome");
		}else
		{
			System.out.println("The sum is not palindrome");
		}
		
	}


}

import java.util.*;
class Swap{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n, rev = 0,temp;  
		System.out.println("Enter the number:");
		n=sc.nextInt();
		temp=n;
		while(n != 0){
			int rem = n % 10;  
			rev = rev * 10 + rem;  
			n = n/10;  
		}  
		System.out.println("ENTERED STRING:"+temp+"\nREVERSE STRING:" + rev);  
		}  
}
		


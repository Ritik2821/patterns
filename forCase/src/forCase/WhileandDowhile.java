package forCase;
import java.util.Scanner;
public class WhileandDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int temp=n;
//		int sum=0;
//		while(temp>0) {
//			int lastDigit=temp%10;
//			sum=sum+lastDigit;
//			temp=temp/10; 
//			System.out.println(lastDigit+"    " +temp+"   "+sum);
//		}
//		System.out.println("sum of the given digit " +n + " is equal to "     +sum);
//
//	
		  
//	      int revno=0;
//	      int temp=n;
//	      while(temp>0) {
//	    	  int lastdigit=temp%10;
//	    	  revno=revno*10+lastdigit;
//	    	  temp=temp/10;
//	    	}                                      //PALINDROME ..
//	      if(revno==n) {
//	    	  System.out.println(n+ "  is a palindrome ");
//	      }else {
//	    	  System.out.println(+n+"  is not a palindrome");
//	      }
//	   }
	
	        n=1;
	        do {
	        	n=sc.nextInt();                            //DO-WHILE
	        	System.out.println("NO is "  +n);
	        }while(n!=0);
		}
	}


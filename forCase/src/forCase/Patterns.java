package forCase;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();                 
//		for(int i=1;i<=n;i++) {                   ****                   
//		for(int j=0;j<n;j++) {                    ****
                                               // ****		
//			System.out.print("* ");               ****                         //PATTERN 1
//		}                                                            
//		System.out.println(" ");                                          
//
//	}                                                  *
		                                     //        ** 
//	for(int i=1;i<=n;i++) {                            ***   PATTERN 2        
//		for(int j=1;j<=i;j++) {                        ****                  
//			System.out.print("* ");                                
//		}
//		System.out.println();
//	}
		
//		for(int i=1;i<=n;i++) {                         // *****	                                            ****  
//			for(int j=n;j>=i;j--) {                     // ***
//				       System.out.print(" *");          // **        PATTERN 3      
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");     //for printing SPACES.
//			}                                                       //PATTERN 4
//			for(int j=1;j<=i;j++) {         //for printing STARS
//				System.out.print("*  ");
//			}
//			System.out.println();
//		}
//		
//		int number=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print("  ");  //for SPACES
//			}                              
//			for(int j=1;j<=i;j++) {      //FOR SPACES     PATTERN 5
//			System.out.print(number++ +"  ");
//			}
//			System.out.println();
//		}
//	
		
		int row=2*n-1;
		for(int i=1;i<=row;i++) {
			if(i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");     //for UPPER HALF
				} 
			}else {                                              //PATTERN 6
				for(int j=1;j<=row-i+1;j++) {               
					System.out.print("* ");   //for LOWER HALF
					}
			}
			System.out.println();
		}
		
	}
	
}


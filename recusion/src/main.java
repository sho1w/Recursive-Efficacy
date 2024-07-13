
public class main {

	public static void main(String[] args) {
		
		 int dividend = 121, divisor = 3;

	        int quotient = dividend / divisor;
	        int remainder = dividend % divisor;

	        System.out.println("The Quotient is = " + quotient);
	        System.out.println("The Remainder is = " + remainder);
		
	}	
	public boolean isPowerOfFour(int n) {
		
		if(n == 1)return true;
		boolean singleSet=(n&(n-1))==0;
		boolean fourorsix= n%10==4 || n%10==6;
		
		return singleSet && fourorsix;
	}
}

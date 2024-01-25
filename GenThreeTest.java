class GenThreeTest {
    public static void main(String args[]) {
		int bottomRange = Integer.parseInt(args[0]);
		int topRange = Integer.parseInt(args[1]);
		
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		
		int A = (int) (a*(topRange-bottomRange) + bottomRange);
		int B = (int) (b*(topRange-bottomRange) + bottomRange);
		int C = (int) (c*(topRange-bottomRange) + bottomRange);
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		int lowest = Math.min(A,B);
		
		System.out.print("The minimal generated number is "+Math.min(lowest,C));
	
	
		
		
		
     
	
	}
}
package org.testing;

public class BreakContinueExitLooping {
	
	public static void main(String[] args) {
		
		System.out.println("starts");
		
		for (int i = 0; i <= 10; i++) {
			if (i==5) {
				//break;
				//continue;
				System.exit(0);
				}
			System.out.println(i);
		}
		
	}
}
				
		
			
	



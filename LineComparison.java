package AssignmentThree;

public class LineComparison {

	public static void main(String[] args) {
		// variables
		double length_of_line_1 = 0;
		double length_of_line_2 = 0;
		
		// Display Welcome Message
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		
		// Co-ordinates Generation for 4 Points on Lines 1 & 2
		int x1 = (int)(Math.floor(Math.random()*10)); 
		int y1 = (int)(Math.floor(Math.random()*10));	
		int x2 = (int)(Math.floor(Math.random()*10)); 
		int y2 = (int)(Math.floor(Math.random()*10));
		int x3 = (int)(Math.floor(Math.random()*10)); 
		int y3 = (int)(Math.floor(Math.random()*10));	
		int x4 = (int)(Math.floor(Math.random()*10)); 
		int y4 = (int)(Math.floor(Math.random()*10));
		
		// Calculation of Length of Lines 1 & 2 based on Co-ordinates Generated
		length_of_line_1 = Math.sqrt( (x2 - x1) * (x2 - x1)  + (y2- y1) * (y2- y1) ); 
		length_of_line_2 = Math.sqrt( (x4 - x3) * (x4 - x3)  + (y4- y3) * (y4- y3) );
		
		// Double Objects Creation for Lines Length
		Double Line_1 = new Double(length_of_line_1);
		Double Line_2 = new Double(length_of_line_2);
		
		// Comparison of Two Lines using equals() Method and Display
		if(Line_1.equals(Line_2))
			System.out.println("Both the Lines are Equal");
		else
			System.out.println("Both the Lines are Not Equal");	

	}

}

package AssignmentThree;

public class LineComparison {

	public static void main(String[] args) {
		// variables
		double length_of_line = 0;
		
		// Display Welcome Message
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		
		// Co-ordinates Generation for 2 Points on a Line
		int x1 = (int)(Math.floor(Math.random()*10)); 
		int y1 = (int)(Math.floor(Math.random()*10));	
		int x2 = (int)(Math.floor(Math.random()*10)); 
		int y2 = (int)(Math.floor(Math.random()*10)); 
		
		// Calculation of Length of Line based on Co-ordinates Generated
		length_of_line = Math.sqrt( (x2 - x1) * (x2 - x1)  + (y2- y1) * (y2- y1) ); 
		
		// Display of Line Length
		System.out.println("Length of the Line : "+Math.round(length_of_line * 100.0)/100.0);


	}

}

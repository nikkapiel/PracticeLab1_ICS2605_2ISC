import java.util.ArrayList;

public class TestNumbers {
	
	public static void main (String[] args) {
		ArrayList <Integer> testInts = new ArrayList ();
		testInts.add(12);
		testInts.add(16);
		testInts.add(36);
		testInts.add(6);
		
		System.out.println("The sum of all integers is " + Numbers.computeSum(testInts) +".");
	}
}

//Problem 1

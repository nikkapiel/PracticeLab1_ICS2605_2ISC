import java.util.ArrayList;

public class Numbers {
	ArrayList <Integer> nums = new ArrayList ();

	static int computeSum (ArrayList<Integer> ints) {
		int sum = 0;
		for (int num: ints) {
			sum += num;
		}
		return sum;
	}

}

//Problem 1
//Create a function which returns the number of true values there are in an array.

import java.util.stream.IntStream;

public class Challenge {
	public static int countTrue(boolean[] arr) {
		int count = 0;
    for (boolean value : arr) {
    	if (value) {
				count++;
      }
    }
		return count;
	}
}

import java.util.*;

public class Searcher<T> {
	// Returns the index of the key in the sorted array, or -1 if the 
	// key is not found.
	public static <T> int binarySearch(T[] array, T key, 
			Comparator<T> comparer) {
			   
		int low = 0;
		int high = array.length - 1;
		
		while (low <= high) {
			int middle = low + (high - low) / 2;
			int result = comparer.compare(array[middle], key);
			
			if (result < 0) {
				low = middle + 1;
			}
			
			else if (result > 0) {
				high = middle - 1;
			}
			
			else {
				return middle;
			}
		}
		return -1;
	}
}
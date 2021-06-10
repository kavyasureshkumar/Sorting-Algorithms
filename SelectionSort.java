package sorting_algos;

public class SelectionSort {
/*
 * Swap the first element of array with smallest elemt of array and so on
 * Until everythig is sorted
 * It has O(n^2)
 */
	public static void main(String[] args) {
		int[] array = {5,6,2,3,4,1};
		for(int i = 0; i < array.length; i++) {
			int swap = array[i];
			int swapind = i;
			//finding minimum
			for(int j = i; j < array.length; j++ ) {
				if(array[j]<swap) {
					swap = array[j];
					swapind = j;
				}
			}
			// swapping
			if(swap != array[i]) {
			int temp = array[i];
			array[i] = swap;
			array[swapind] = temp;
			}
			System.out.println(array[i]);
		}
		
	}
}

package sorting_algos;

public class BinarySearch {
	/*
	 * The linear search in array has a O(n) time complexity
	 * however binary search has O(log2n)
	 * eg, 128 takes atmost 8 iterations
	 * take a minimum and a maximum then take avg of both 
	 * if the avg is less than the required number set thatto the minimum
	 * if avg is greater set it to max
	 * compute avg again
	 */
public static void main(String[] args) {
	int lenarray = 104856;
	int[] example = new int[lenarray];
	for(int i = 0; i < lenarray; i ++) {
		example[i] = i;
	}
	int min = 0;
	int max = lenarray-1;
	int required = 3840;
	int curr = (min+max)/2;
	int iter = 0;
	while(curr!=required) {
		iter++;
		if(curr>required) {
			max = curr;
		}
		else if(curr<required) {
			min = curr;
		}
		curr = (max+min)/2;
	}
	System.out.println("The element  " + curr + " was found in " + iter + " iterations!!");
}
}

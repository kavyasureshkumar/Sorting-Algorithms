package sorting_algos;

public class InsertionSort {
/*
 * Check if it is less and move it to the left until enounter something greater
 */
	public static int[] insert(int[] array,int rightIndex,int value) {
		int j;
	    for(j = rightIndex; j >= 0 && array[j] > value; j--) {
	        array[j + 1] = array[j];
	    }   
	    array[j + 1] = value; 
	    return array;
	}

	public static int[] insertionSort(int[] array) {
	for( int i = 1; i < array.length; i++){
	    array  = insert(array,i-1,array[i]);
	}
	return array;
	}
	public static void main(String[] args) {
	int[] array = {22, 11, 99, 88, 9, 7, 42};
	insertionSort(array);
	System.out.println("Array after sorting:  ");
	for(int i = 0; i < array.length; i ++) {
		System.out.print(array[i] + "\t");
	}
}
}
package sorting_algos;

public class MergeSort {
public static  int[] merge (int[] array,int p,int q,int r) {
	int[] lowHalf = new int[q-p+1];
	int[] highHalf = new int[r-q];
	    
	   int k = p;
	    int i;
	    int j;
	    for (i = 0; k <= q; i++, k++) {
	        lowHalf[i] = array[k];
	    }
	    for (j = 0; k <= r; j++, k++) {
	        highHalf[j] = array[k];
	    }

	    k = p;
	    i = 0;
	    j = 0;
	    while(i<q-p+1 && j<r-q){
	    if(lowHalf[i]<(highHalf[j])){
	    array[k++] = lowHalf[i++];
	    }
	    else{
	    array[k++] = highHalf[j++]; 
	    }
	    }
	    while(j < r-q){
	        array[k++] = highHalf[j++];
	    }
	    
	    while(i < q-p+1){
	    array[k++] = lowHalf[i++];
	    }
	   for(int s = 0 ; s < array.length; s ++) {
		   System.out.print(array[s] + "\t");
	   }
	   System.out.println();
	  return array;  
	}
public static void mergeSort(int[] array,int p,int r) {
    if(p != r){
    int q =(int) Math.floor((p+r)/2);
    mergeSort(array,p,q);
    mergeSort(array,q+1,r);
    array = merge(array,p,q,r);
    
    }
};
public static void main(String[] args) {
	int[] array = {-1,4,5,2,8,-2,6,10,-4};
	mergeSort(array,0,array.length-1);
}
}

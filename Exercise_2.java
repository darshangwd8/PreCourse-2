//Time Complexity :O(n.log n)
//Space Complexity :O(n.log n)
//Did this code successfully run on Leetcode : N/a
//Any problem you faced while coding this : N/A


class QuickSort 
{ 
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    void swap(int arr[],int i,int j){
        //Your code here   
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
    }
    
    int partition(int arr[], int low, int high) 
    { 
   	//Write code here for Partition and Swap 
        int temp = arr[high];
		int i = low - 1;
		
		for(int j =low; j <= high -1; j++) {
			if(arr[j] <= temp) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr, i+1, high);
		return i+1;
    } 
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    {  
        // Recursively sort elements before
		// partition and after partition
		if(low < high) {
			int p = partition(arr, low, high);// for pivot
			sort(arr, low, p-1); // left array
			sort(arr, p+1, high); // right array
		}
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 

import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Take array input
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter size of array :");
		int size = input.nextInt();
		System.out.println(" "+size);
		int[] arr = new int[size];
		System.out.println("Please enter the numbers :");
		for(int j=0;j<size;j++){
			arr[j] = input.nextInt();
		}
		System.out.println("Input array : "+Arrays.toString(arr));

		// Sort the array
		sort(arr);

		// Print Sorted array
		System.out.println("Sorted array : "+Arrays.toString(arr));

	}
  
  // Sort function for sorting the array
	static void sort(int[] arr){
		if(arr.length<2){
			return;
		}
		boolean swap = true;
		while(swap){
			swap = false;
			for(int i=0;i<arr.length-1;i++){
				if(arr[i]>arr[i+1]){
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					swap = true;
				}
			}
		}
	}
}

/*
 * Name: Andrew Ayman
 * Section: 1
 * BN: 14
 */
import java.util.*; 
import java.util.Arrays;

public class common {
	public static void main(String [] args) {
		int arr1[] = {1,8,5,4,2,11};
		int arr2[] = {6,8,2,4,1,3};
		getCommonElementsWithoutSort(arr1,arr2);
		getCommonElementsWithSort(arr1,arr2);
		hash(arr1,arr2);
	}
	//Finding common elements of 2 arrays by order of n^2 time complexity
	public static void getCommonElementsWithoutSort(int arr1[], int arr2[]){
		if(arr1 == null || arr2 == null) {
			System.out.println("One of the 2 arrays is empty!");
		}
		else {
			int i,j,counter = 0;
			System.out.println("The repeated elements without sorting:");
			for(i=0; i<arr1.length; i++) {
				for(j=0; j<arr2.length; j++) {
					if(arr1[i] == arr2[j]) {
						counter++;
						System.out.println(arr1[i]);
					}
				}
			}
			if(counter == 0) {
				System.out.println("There is no common element!");
			}
		}
	}//End of the function
	
	//Finding common elements of 2 arrays by order of n^2 time complexity
	public static void getCommonElementsWithSort(int arr1[], int arr2[]) {
		if(arr1 == null || arr2 == null) {
			System.out.println("One of the 2 arrays is empty!");
		}else {
			int i = 0,j = 0,counter = 0;
			Arrays.sort(arr1);Arrays.sort(arr2);
			System.out.println("The repeated elements with sorting:");
			while(i < arr1.length && j < arr2.length) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					counter++;
					i++;
				}else if(arr1[i] > arr2[j]) {
					j++;
				}else {
					i++;
				}
			}
			if(counter == 0) {
				System.out.println("There is no common element!");
			}
		}
	}//End of the function
	//Finding common elements of 2 arrays by order of 1 time complexity
	public static void hash(int arr1[], int arr2[]) {
		if(arr1 == null || arr2 == null) {
			System.out.println("One of the 2 arrays is empty!");
		}else {
			System.out.println("The repeated elements using hashSet:");
			int i,counter = 0;
			HashSet<Integer> h = new HashSet<Integer>();
			for(i=0; i<arr1.length; i++) {
				h.add(arr1[i]);
			}
			for(i=0; i<arr2.length; i++) {
				if(h.contains(arr2[i]) == true) {
					System.out.println(arr2[i]);
					counter++;
				}
			}
			if(counter == 0) {
				System.out.println("There is no common element!");
			}
			System.out.println("Hash:");
			System.out.println(h);
		}
		
	}//End of the function
}

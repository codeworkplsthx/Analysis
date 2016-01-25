import java.util.ArrayList;

public class Search {
	
	public static int binarySearch(ArrayList<Integer> arr, int hi, int lo, int num) {

		if (lo > hi) {

			return -1;
		}

		int mid = (hi + lo) / 2;

		if (arr.get(mid) == num) {

			return mid;
		} else if (arr.get(mid) > num) {

			hi = mid;
			return binarySearch(arr, hi - 1, lo, num);
		}
		// arr[mid] < num
		else {
			lo = mid;
			return binarySearch(arr, hi, lo + 1, num);
		}
	}
	public static int linearSearch(int[] arr, int num) {

		System.out.println("Array Size: " + arr.length);

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			count++;
			if (arr[i] == num) {
				System.out.println("Number of cmp: " + count);
				return i;
			}
		}
		System.out.println("Number of cmp: " + count);
		return -1;

	}
	
	
}

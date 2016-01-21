
public class Program {

	public static int binarySearch(int[] arr,int hi,int lo,int num) {
		
		if (lo > hi) {
			
			return -1;
		}
		
		int mid = (hi + lo) / 2;
		
		if (arr[mid] == num){
			
			return mid;
		}
		else if (arr[mid] > num) {
			
			hi = mid;
			return binarySearch(arr,hi-1,lo,num);
		}
		//arr[mid] < num
		else {
			lo = mid;
			return binarySearch(arr,hi,lo+1,num);
		}
	}
	public static int linearSearch(int[] arr,int num) {
		
		System.out.println("Array Size: " + arr.length);

		int count = 0;
		for (int i = 0;i < arr.length;i++) {

			count++;
			if (arr[i] == num) {
				System.out.println("Number of cmp: " + count);
				return i;
			}
		}
		System.out.println("Number of cmp: " + count);
		return -1;
		

	}
	public static void main(String[] args) {
		
		Test worst_case = new Test(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26},"worst case");
		Test best_case = new Test(new int[]{5},"best case");
		Test test_case = new Test(new int[]{1,2,3,4,5},"test case");
		
		
		System.out.println("Linear Search: ");
		linearSearch(worst_case.data,5);
		System.out.println("Linear Search: ");
		linearSearch(best_case.data,5);
		System.out.println("Binary Search: ");
		binarySearch(test_case.data,test_case.data.length-1,0,3);
		
		
	}

}

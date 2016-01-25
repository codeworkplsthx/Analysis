import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Program {

	public static int b_search(int[] A, int t) {

		int lo = 0;
		int hi = A.length - 1;

		int count = 0;
		while (lo <= hi) {
			count++;
			int choice = (lo + hi) / 2;
			if (A[choice] == t) {
				return choice;
			} else if (A[choice] > t) {
				hi = choice - 1;
			} else {
				lo = choice + 1;
			}
		}
		System.out.println(count);
		return -1;
	}

	public static void run() {
		
		int input_size = 5000;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Random random = new Random();
		
		for (int i = 0; i < input_size; i++) {

			arr.add(random.nextInt());

		}
		Collections.sort(arr);

		for (int i = 0; i < input_size; i++) {
			//generate a random number in the array
			int bound = random.nextInt(arr.get(arr.size()-1));
			System.out.println(Search.binarySearch(arr, arr.size()-1, 0, bound));

		}
	}
	public static void main(String[] args) {
		
		Random random = new Random();
		List<Integer> list = 
				random
				  .ints(9)
				  .boxed()
				  .collect(Collectors.toList());
		
		
	
		list
		  .stream()
		  .filter(n -> n % 2 == 0)
		  .forEach(System.out::println);

		list
			.stream()
			.map(n -> n * 2)
			.forEach(System.out::println);
		
		
		  
	}

}

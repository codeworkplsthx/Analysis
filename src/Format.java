


public class Format {

	
	public static <T> String asList(Iterable<T> arr) {
		
		String result = "[";
		
		
		for (T arg : arr) {
			
			result += arg + ",";
			
		}
		result = result.substring(0,result.length()-2);
		result += "]";
		return result;
	}
}

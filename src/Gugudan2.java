
public class Gugudan2 {
	public static void main(String[] args) {
		int[] result = new int[9];
						
		for(int j = 2; j < 10; j++) {
			for(int i = 0; i < result.length; i++) {
				result[i] =  j * (i + 1);
				System.out.println(result[i]);
			}
		}
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//				
	}
}
 
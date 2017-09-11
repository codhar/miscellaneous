import java.util.Scanner;

public class TryException {
	
	public static void main(String args[]){
		System.out.println("enter 2 no");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		int j = sc.nextInt();
		sc.close();
		try {
			compute(i,j);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void compute(int i, int j) {
		try {
			int k = i/j;
			System.out.println(k);
		} catch (Exception e) {
			throw new CustomException(e);
		}
		
	}

}

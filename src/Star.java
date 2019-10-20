
public class Star {
	public static void st(int n) {
		int i,j;
		for (i=0; i<n; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		int n=5;
		st(n);

	}

}

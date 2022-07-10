public class BreakDetail{
	public static void main(String[] args) {
		int n=0;
		for (int i=1;i<=100 ;i++ ) {
			n+=i;
			System.out.println(n);
			if (n>=20) {
				System.out.println("The fist sum is 20");
				break;
			}
		}
	}
}
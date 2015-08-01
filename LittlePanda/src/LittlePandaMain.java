import java.util.Scanner;

public class LittlePandaMain {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		solve();

	}
	private static void solve(){
		int testCases = Integer.parseInt(sc.next());
		for(int idx=0; idx<testCases; idx++){
			String[] inputString = sc.next().split(" ");
			System.out.println(modCalculation(Integer.parseInt(inputString[0]),
					Integer.parseInt(inputString[0]),Integer.parseInt(inputString[0])));
		}
	}
	private static int modCalculation(int a, int b, int c){
		return 0;
	}
}

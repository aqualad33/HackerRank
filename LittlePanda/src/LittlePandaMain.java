import java.math.BigInteger;
import java.util.Scanner;

public class LittlePandaMain {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		solve();
	}
	private static void solve(){
		int testCases = Integer.parseInt(sc.nextLine().trim());
		BigInteger[][] input = new BigInteger[3][testCases];
		String[] stringInput;
		for(int idx=0; idx<testCases; idx++){
			stringInput = sc.nextLine().trim().split(" ");
			input[0][idx] = new BigInteger(stringInput[0]);
			input[1][idx] = new BigInteger(stringInput[1]);
			input[2][idx] = new BigInteger(stringInput[2]);
		}
		for(int idx = 0; idx<testCases; idx++){
			System.out.println(modCalculation(input[0][idx],input[1][idx],input[2][idx]));
		}
	}
	private static BigInteger modCalculation(BigInteger a, BigInteger b, BigInteger c){
			return a.modPow(b, c);
	}
}

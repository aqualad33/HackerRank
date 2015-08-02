import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MatrixTracingMain{
	public static Scanner sc = new Scanner(System.in);
	public static final BigInteger MODULUS = BigInteger.valueOf(1000000007);
	
	public static void main(String[] args) {
			List<int[]>inputs = getInputs();
			for(int[] input : inputs){
				solveAndPrint(input);
			}
	}
	private static List<int[]> getInputs(){
		//first integer is the number of test cases. You need to trim the spaces at the end.
		int testCases = Integer.parseInt(sc.nextLine().trim());
		
		//intended to hold one line from the input
		List<int[]> input = new ArrayList<int[]>();
		for(int idx=0; idx < testCases; idx++){
			int[] anInput = new int[2];
			String[] s = sc.nextLine().trim().split(" ");
			anInput[0] = Integer.parseInt(s[0]);
			anInput[1] = Integer.parseInt(s[1]);
			input.add(anInput);
		}
		return input;
	}
	private static void solveAndPrint(int[] input) {
		if(input[0] == 1 || input[1] == 1){
			System.out.println(1);
		}
		else{
			BigInteger big1 = BigInteger.valueOf(input[0]-1);
			BigInteger big2 = BigInteger.valueOf(input[1]-1);
			BigInteger big3 = BigInteger.valueOf(input[0]+input[1]-2);
			long upperBound = big1.longValue();
			for(long i=1; i<upperBound;i++){
				big1 = (big1.multiply(BigInteger.valueOf(i))).mod(MODULUS);
			}
			upperBound = big2.longValue();
			for(long i=1; i<upperBound;i++){
				big2 = (big2.multiply(BigInteger.valueOf(i))).mod(MODULUS);
			}
			upperBound = big3.longValue();
			for(long i=1; i<upperBound;i++){
				big3 = (big3.multiply(BigInteger.valueOf(i))).mod(MODULUS);
			}
			big1 = big1.modInverse(MODULUS);
			big2 = big2.modInverse(MODULUS);
			
			big1 = big1.multiply(big2).multiply(big3).mod(MODULUS);
			System.out.println(big1.longValue());
		}
	}
}

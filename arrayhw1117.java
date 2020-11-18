import java.util.Scanner;
import java.util.ArrayList;
public class arrayhw1117 {

	public static void main(String[] s) {
		Scanner myScan = new Scanner(System.in);
		ArrayList<Integer> myArr = new ArrayList<Integer>();
		int userNum;
		for(int i=1; i < 6; i++) {
			userNum = Integer.parseInt(myScan.nextLine());
			myArr.add(userNum);
			
		}
		int max = Integer.MIN_VALUE;
		for(int i=0; i < myArr.size(); i++) {
			if (myArr.get(i) > max) {
				max = myArr.get(i);
			}
		}
		int min = Integer.MAX_VALUE;
		for ( int i= 0; i < myArr.size() ; i++ ) {
			if (myArr.get(i) < min) {
				min = myArr.get(i);
			}
		}
		int sum = 0;
		for (int i = 0; i < myArr.size(); i++) {
			sum += myArr.get(i);
		}
		
		int product = 1;
		for( int i = 0; i < myArr.size(); i++) {
			 product *= myArr.get(i);
		}
		
}
};

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 *  더하기 기능 클래스
 */
public class TheHaGi {
	
	/* 내가 만든 게임으로 메소드 만든거
	public int t1 ( ) {
		ArrayList<Integer> firstnumList = new ArrayList<Integer>();
		for (int i = 10; i < 100; i++) {
			firstnumList.add(i);
		}
		ArrayList<Integer> secondnumList = new ArrayList<Integer>();
		for (int i = 10; i < 100; i++) {
			secondnumList.add(i);
		}
		Random rnd = new Random();
		int fn = rnd.nextInt(firstnumList.size());
		int sn = rnd.nextInt(firstnumList.size());
		int result = fn + sn;
		System.out.println("!!랜덤 두 자리수 합 구하기!!");

		Scanner scan = new Scanner(System.in);
		System.out.print((fn) + "+" + (sn) + "=" + "정답을 입력하세용 ");
		int input = scan.nextInt();
		if (input == result) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다");

		}
		return result;
	}
	*/

	// 교수님이 만든 게임으로 메소드 만든거
	public int[] rnd2Num() { // 배열로 뺀거
		Random rnd = new Random();
		int [] nums = new int [2];
		nums[0] = rnd.nextInt(89) + 10;
		nums[1] = rnd.nextInt(89) + 10;
		return nums;
	}
	
	public ArrayList<Integer> rnd2NumList() { // ArrayList로 뺀거
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rnd = new Random();
		list.add(rnd.nextInt(89) + 10);
		list.add(rnd.nextInt(89) + 10);
		return list;
	}
	
	public int t2() {
		Random rnd = new Random();
		int num1 = rnd.nextInt(89) + 10;
		int num2 = rnd.nextInt(89) + 10;
		System.out.println(num1 + " + " + num2 + " = ");

		return (num1 + num2);

	}
	
	public int userDab() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}
	
	// 매개 변수로 두개를 받아서 더하기 값을 전달 하는 메소드
	// 메소드 이름은 그대로 사용
	// 메인 메소드에서 
	// 위에 만든 랜덤 숫자 2개를 전달하는 메소드를 활용
	// 메인 메소드에서 thehagi의 결과만 출력 해보자  ==> thehagi가 내 소스에서는 t2임!!
	// ran2numList() 메소드를 호출하고
	// 받은 데이터를 thehagi() 넣고 thehagi()에서 결과값을 외부로 전달해서
	// 화면에 결과값만 출력
	public int t2 (ArrayList<Integer> i) {
//		System.out.println(i.get(0) + " + " + i.get(1) + " = ");
		int dab = i.get(0) + i.get(1);
		return dab;
		
	}
	
	
	public boolean ox(int i2, int input) {
		if (input == (i2)) {
			return true;
//			System.out.println("정답입니다");
		} else {
//			System.out.println("틀렸습니다");
			return false;
		}
	}
}

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  더하기 게임 메인 클래스
 */
public class MainClass {

	public static void main(String[] args) {
//		int i = thg.t1();
//		System.out.println(i);
		System.out.println("더달 게임 메인 클래스");
		
		TheHaGi thg = new TheHaGi();
		
		ArrayList<Integer> i  = thg.rnd2NumList();
		int dab = thg.t2 (i);
		System.out.println(dab);
		
				 			 
//		int i2 = thg.t2();
//		int user = thg.userDab();
		
//		while (!thg.ox(user, i2)) {
//			user = thg.userDab();
//			System.out.println("틀렸다");
//		}
//		System.out.println("맞습니다");
		
//		
//		for (;;) {
//			int input = thg.userDab();
//			if (input == (i2)) {
//				System.out.println("정답입니다");
//				break;
//			} else {
//				System.out.println("틀렸습니다");
//			}
//		}
	}

}


// 번호 만드는 메소드 실행
// 더하기 메소드에서 나온 변수 = 더하기 메소드(번호1, 번호2)
// 더하기 메소드에서 나온 수를 출력

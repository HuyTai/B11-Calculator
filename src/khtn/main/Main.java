package khtn.main;

import java.util.Scanner;
import khtn.utils.Cal;

public class Main extends Cal{
	public static void main(String[] args) {
		Cal cal = new Cal();	
		String sA,sB;
		Scanner sc = new Scanner(System.in);
		do{ System.out.println("Nhập vào số A: ");
			sA = sc.nextLine();
		}while(isNumber(sA)==false);
		cal.setA(Integer.parseInt(sA));
		do{	System.out.println("Nhập vào số B: ");
			sB = sc.nextLine();
		}while(isNumber(sB)==false);
		cal.setB(Integer.parseInt(sB));
		cal.voidTong();
		cal.voidHieu();
		cal.voidTich();
		cal.voidThuong();
		sc.close();
	}
	public static boolean isNumber(String number) {
		try{
			Integer.parseInt(number);
			return true;
		}catch(NumberFormatException e){
			System.out.println("Lỗi: Hãy nhập số");
			return false;
		}
	}
}


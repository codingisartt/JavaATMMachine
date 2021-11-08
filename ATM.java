package JavaATMMachine;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bakiye=1000;
		int islem;
		
		
		System.out.println("1: Bakiye Görüntüle");
		System.out.println("2: Para Yatırma");
		System.out.println("3: Para Çekme");
		System.out.println("4: Sistemden Çıkış");
			
		islem= scan.nextInt();
		
		switch(islem) {
			case 1:
				System.out.println("Bakiyeniz:" + bakiye + "TLdir.");
				break;
			case 2:
				System.out.println("Ne kadar yatıracaksınız?");
				int miktar= scan.nextInt();
				bakiye+= miktar;
				System.out.println("Bakiyeniz: " +bakiye+ "tldir.");
				break;
			case 3: //çekeceği miktardan fazla derse vs geliştirilmeli program.
				System.out.println("Ne kadar çekeceksiniz?");
				miktar= scan.nextInt();
				bakiye-= miktar;
				System.out.println("Bakiyeniz: " +bakiye+ "tldir.");
				break;
			case 4:
				System.out.println("Sistemden çıkılıyor...");
				break;
			default:
				System.out.println("Geçersiz İşlem...");
				break;
				
		}
	}

}

package galgje;

import java.util.Scanner;


public class Galgje {
	
	public static String teRadenWoord = "niet ingevuld";
	
	public static boolean checkenOfLetterBestaat(String s) {
		System.out.println("Uw ingevoerde letter is: " + s);
		if(teRadenWoord.contains(s)) {
			System.out.println("ja, komt voor");
			return true;
		}else {
			System.out.println("nee, komt niet voor");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Welkom bij galgje");
		System.out.println("Het te raden woord:");
		
		teRadenWoord = "Qien";
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			String str = sc.nextLine();
			checkenOfLetterBestaat(str);
		}
		
		
		System.out.println("Het spel is klaar");
		}
		
	}


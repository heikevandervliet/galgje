package galgje;

import java.util.Scanner;


public class Galgje {
	
	public static String teRadenWoord = "Anderen";
	public static boolean Win = false;
	
	static StringBuilder woord = new StringBuilder(teRadenWoord);
	
	public static void setWin (boolean b) {
		Win = b; 
	}
	
	
	static StringBuilder zetWoord(String str){
		int index = 0;
		while(index<woord.length()) {
		woord.replace(index, index+1, "*");
		index++;
		}
		return woord;
	}
	
	static void toonWoord(char raad) {
		for (int j = 0; j < (woord.length()); j++) {
			if (raad == teRadenWoord.charAt(j)) {
				woord.setCharAt(j, raad);
			}
			}
	}
	
	
	public static StringBuilder checkenOfLetterBestaat(String s) {
		System.out.println("Uw ingevoerde letter is: " + s);
		
		if(teRadenWoord.contains(s)) {
			System.out.println("ja, komt voor");
			char ch = s.charAt(0);
			Galgje.toonWoord(ch);
			return woord;
			
		}else {
			System.out.println("nee, komt niet voor");
			return woord;
		}
	}

	
	public static void endGame(boolean b) {
		if(b==true) {
		System.out.println("You win! Het woord was: " + teRadenWoord);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Welkom bij galgje");
		System.out.println("Het te raden woord:");
		System.out.println(Galgje.zetWoord(teRadenWoord));
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<10; i++) {
			String guess = sc.nextLine();
			if(guess.equalsIgnoreCase(teRadenWoord)) {
				setWin(true);
				break;
			} else {
				Galgje.checkenOfLetterBestaat(guess);
				if(woord.toString().equalsIgnoreCase(teRadenWoord)) {
					setWin(true);
					break;
				}
				System.out.println(woord);
			}
			
		}
		
		
		endGame(Win);
		
		System.out.println("Het spel is klaar");
		}
		
	}



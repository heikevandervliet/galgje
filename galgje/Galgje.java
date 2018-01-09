package galgje;

import java.util.Scanner;


public class Galgje {
	
	public static String teRadenWoord = "oefening";
	public static int points = 10;
	public static boolean Win = false;
	
	static StringBuilder woord = new StringBuilder(teRadenWoord);
	static StringBuilder fout = new StringBuilder("");
	
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
	
	
	public static void checkenOfLetterBestaat(String s) {
		System.out.println("Uw ingevoerde letter is: " + s);
		
		if(teRadenWoord.contains(s)) {
			System.out.println("ja, komt voor");
			char ch = s.charAt(0);
			Galgje.toonWoord(ch);			
		}else {
			System.out.println("nee, komt niet voor");
			fout.append(s);
			points = points - 1;
		}
	}

	
	public static void endGame() {
		if(Win==true) {
		System.out.println("Gewonnen! Het woord is: " + teRadenWoord);
		}
		else {
			System.out.println("Verloren... Het woord was: " + teRadenWoord);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Welkom bij galgje.");
		System.out.println("Je hebt 10 punten en verliest een punt voor ieder fout geraden woord.");
		System.out.println("Het te raden woord:");
		System.out.println(Galgje.zetWoord(teRadenWoord));
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<50; i++) {
			String guess = sc.nextLine();
			if(guess.equalsIgnoreCase(teRadenWoord)) {
				setWin(true);
				break;
			} else {
				Galgje.checkenOfLetterBestaat(guess);
				if(woord.toString().equalsIgnoreCase(teRadenWoord)) {
					setWin(true);
					break;
				} else if (points <=0){
					System.out.println("Geen punten meer...");
					break;
				}
				System.out.println("Punten: " + points + "\t Fout geraden letters: "+ fout);
				System.out.println("Te raden woord: "+ woord);
			}
			
		}
		
		
		endGame();
		
		System.out.println("Het spel is klaar");
		}
		
	}



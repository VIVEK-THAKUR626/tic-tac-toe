import java.util.*;

class Player{
	String name;
	char type;
	public Player(String n, char t){
		name = n;
		type = t;
	}
	public int enterChoice(){
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}
}

public class main { 
	public static void main(String[] args){
		System.out.println("WELCOME TO TIC-TAC-TOE");
		System.out.println("YOU KNOW THE DAMN RULES, SO NO NEED TO WASTE THE TIME");
		System.out.println("Press 0 to choose o and 1 to choose x");
		
		System.out.println("|---|---|---|");
		System.out.println("| 1 | 2 | 3 |");
		System.out.println("|---|---|---|");
		System.out.println("| 4 | 5 | 6 |");
		System.out.println("|---|---|---|");
		System.out.println("| 7 | 8 | 9 |");
		System.out.println("|---|---|---|");

		Player[] players = new Player[2];

		for(int i=1; i<3; i++){
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the name of player "+i);
			String name = sc.next();

			System.out.println("Enter the type (x/o) of player "+i);
			char type = sc.next().charAt(0);
			
			Player p = new Player(name,type);
			players[i-1] = p;
		}
	
		System.out.println("GET READY "+players[0].name+"("+players[0].type+")"+" and "+players[1].name+"("+players[1].type+")");
		int turn = (int)(Math.random() * (2-0)) + 0;
	}
}

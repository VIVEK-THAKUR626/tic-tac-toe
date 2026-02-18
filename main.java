import java.util.*;

class Player{
	String name;
	char type;
	public Player(String n, char t){
		name = n;
		type = t;
	}
	public char enterChoice(){
		Scanner sc = new Scanner(System.in);
		char choice = sc.next().charAt(0);
		return choice;
	}
}

public class main { 
	static void updateBoard(char[][] gameBoard){
		System.out.println("|---|---|---|");
		for(int i=0; i<gameBoard.length; i++){
			for(int j=0; j<gameBoard.length; j++){
				System.out.print("| "+gameBoard[i][j]+" ");
			}
			System.out.println("|");
			System.out.println("|---|---|---|");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO TIC-TAC-TOE");
		System.out.println("YOU KNOW THE DAMN RULES, SO NO NEED TO WASTE THE TIME");
		
		Player[] players = new Player[2];

		for(int i=1; i<3; i++){
			System.out.println("Enter the name of player "+i);
			String name = sc.next();

			System.out.println("Enter the type (x/o) of player "+i);
			char type = sc.next().charAt(0);
			
			Player p = new Player(name,type);
			players[i-1] = p;
		}
	
		System.out.println("GET READY "+players[0].name+"("+players[0].type+")"+" and "+players[1].name+"("+players[1].type+")");
		int turn = (int)(Math.random()* (2-0)) + 0;
		
		char[][] gameBoard = {{'1','2','3'},
				     {'4','5','6'},
				     {'7','8','9'}};

		System.out.println("|---|---|---|");
		System.out.println("| 1 | 2 | 3 |");
		System.out.println("|---|---|---|");
		System.out.println("| 4 | 5 | 6 |");
		System.out.println("|---|---|---|");
		System.out.println("| 7 | 8 | 9 |");
		System.out.println("|---|---|---|");

		while (true) {
			int marked = 0;
			System.out.println("Its "+players[turn].name+"'s turn");
			System.out.println("Choose your place to mark "+players[turn].type);
			char choice = players[turn].enterChoice();

			for(int i=0;i<gameBoard.length; i++){
				for(int j=0; j<gameBoard.length; j++){
					if(gameBoard[i][j] == choice){
						gameBoard[i][j] = players[turn].type;
						marked = 1;
						break;
					}
				}
				if(marked == 1){
					break;
				}
			}
			updateBoard(gameBoard);
			turn = (turn == 0) ? 1 : 0;
		}
	}
}

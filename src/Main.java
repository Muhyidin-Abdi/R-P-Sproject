import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------Welcome to Rock Paper Scissors Game------------------");

        Scanner sc = new Scanner(System.in);
        String player1 , player2 ;
        int player1Score = 0, player2Score =0;
        int rounds;


        System.out.println("Please enter how nany Round you wanna play:");
            rounds = sc.nextInt();

        for (int i = 0; i < rounds; i++) {
            System.out.println("\nRound " + (i + 1) + ": ");

            do {
                System.out.println("Player1, Pick! (Rock, Paper or Scissors): ");
                player1 = sc.next().toLowerCase();
            } while (!isValidChoice(player1));

            do {
                System.out.println("Player2, Pick! (Rock, Paper or Scissors): ");
                player2 = sc.next().toLowerCase();
            } while (!isValidChoice(player2));

            String result = Winner(player1, player2);
            System.out.println(result);

            if (result.equals("player1 wins")) {
                player1Score++;
            } else if (result.equals("player2 wins")) {
                player2Score++;
            }
        }

        System.out.println("\nFinal score is:");
        System.out.println("player1: " + player1Score);
        System.out.println("player2: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("player1 wins");
        } else if (player2Score > player1Score) {
            System.out.println("player2 wins");
        } else {
            System.out.println("it's a tie");
        }
    }
    public static boolean isValidChoice(String input){

        return input.equals("rock") || input.equals("paper") || input.equals("scissors");
    }

    public static String Winner(String player1, String player2){
        if(player1.equals(player2)){
            return "its a draw!";
        }
            switch (player1){
            case "rock":
                return player2.equals("Scissors") ? "player1 wins" : "player2 wins";
            case "paper":
                return  player2.equals("Scissors") ? "player2 wins" : "player1 wins";
            case "scissors":
                return player2.equals("Rock") ? "player2 wins" : "player1 wins";
            default:
                return "choose only rock, paper or scissors";
        }
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game of Snakes and Ladders!");

        Player player1 = new HumanPlayer("Player 1");
        Player player2 = new AIPlayer("Player 2");

        System.out.println(player1.shortDesc());
        System.out.println(player2.shortDesc());
    }
}
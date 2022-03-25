import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //make two athletes
        Athlete athlete1 = new Athlete("Zack Wilson".toLowerCase(), "football", "Jets", "2", "QB", "6' 2\"", "214 lbs", "22");
        Athlete athlete2 = new Athlete("Michael Jordan".toLowerCase(), "basketball", "Wizards", "32", "SG", "6' 6\"", "193 lbs", "23");
        ArrayList<Celebrity> celebs = new ArrayList<Celebrity>();
        celebs.add(athlete1);
        celebs.add(athlete2);

        //start game
        System.out.println("Welcome to the game of athletes!");
        System.out.println("There are two athletes in this game.");
        //pick a celebrity randomly
        Athlete celeb = (Athlete) celebs.get((int)(Math.random()*celebs.size()));
        boolean win = false;
        while(!win) {
            //give hint
            System.out.println("Hint: " + celeb.getClue());
            //ask for input
            System.out.println("What is your guess?");
            String guess = scan.nextLine();
            //check if correct
            if(celeb.checkAnswer(guess.toLowerCase())) {
                System.out.println("You win!");
                win = true;
            }
        }
    }
}


import java.util.*;

public class RockPaperScissors {
    static char CPUOutput(){
        Random rand = new Random();
        int cpuRPS = rand.nextInt(3);
        cpuRPS++;
        switch (cpuRPS){
            case 1:
                return 'R';
            case 2:
                return 'P';
            case 3:
                return 'S';
            default:
                return 'N';
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Type R for Rock \nType P for Paper \nType S for Scissors\n");
        Scanner scanner = new Scanner(System.in);
        char userInput = Character.toUpperCase(scanner.next().charAt(0));
        char CPU = CPUOutput();


        if(CPU == userInput) System.out.println("TIE!");
        else {
            switch(CPU){
                case 'R':
                    System.out.println("CPU chose ROCK!");
                    if(userInput == 'P') {
                        System.out.println("YOU WIN!");
                    }
                    else {
                        System.out.println("YOU LOSE!");
                    }
                    break;
                case 'P':
                    System.out.println("CPU chose PAPER!");
                    if(userInput == 'R') {
                        System.out.println("YOU LOSE!");
                    }
                    else {
                        System.out.println("YOU WIN!");
                    }
                    break;
                case 'S':
                    System.out.println("CPU chose SCISSORS!");
                    if(userInput == 'P') {
                        System.out.println("YOU LOSE!");
                    }
                    else {
                        System.out.println("YOU WIN!");
                    }
                    break;
            }
        }
    }
}

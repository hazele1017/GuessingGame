//implicit import
import java.util.*;

public class Guess {
    public static void main(String[] args) {

        //Generate a random number 1 and 10
        Random rng = new Random();
        int randomNumber = 1 + rng.nextInt(100);
       
        //Get user inputted number 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 100: ");
        int guess = input.nextInt();

        //Compare randomly generated number to use inputterd number
        int iteration = 0;
        boolean giveUp = false;

        //indicator for guess, hint 
        int hint = 0;

            //when user gets it wrong excute while loop
            while (guess != randomNumber){
                //tells if guess is too high or low 
                
                if (guess > randomNumber) //make hint = 1 if guess too high 
                    {
                        hint = 1;
                    }
                    else if (guess < randomNumber) //make hint = -1 if guess too low 
                    {
                        hint = -1;
                    }
                    
                if (hint == 0) //make hint = 0 if coorrect
                    {
                    hint = 0;
                    }
                    else if (hint == 1)
                    {
                        System.out.println("Too high!");
                    } 
                    else if (hint == -1)
                    {
                        System.out.println("Too low!");
                    }
                
                //asks if user gives up every 5 wrong guesses
               if(((iteration + 1) % 5) == 0)
               {
                    System.out.print("Do you give up?");
                    String userAnswer = input.next();
                    String testing = "yes";
                    if(userAnswer.equals(testing))
                    {
                        giveUp = true;
                        break;
                    } 
                    else 
                    {
                        //otherwise ask for another guess
                        System.out.print("Ok! Try again: ");
                        guess = input.nextInt();
                        iteration++;
                    }
                
                }
                else 
                {
                    System.out.print("Nope! Try again: ");
                    guess = input.nextInt();
                    iteration++;
                }
            }
            if (giveUp)
            {
                System.out.print("Aww ok :( Number was " + randomNumber);
            } 
            else 
            {
                System.out.print("Yup! You got it! Number was " + randomNumber);
            }
            
     
    }
}
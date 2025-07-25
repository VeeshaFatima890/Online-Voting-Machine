import java.util.Scanner;
public class OnlineVotingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;
        System.out.println();
        System.out.println("=====LONG LIVE PAKISTAN(_* ====== ");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println( " Welcome  to  Online_Voting_System ");
        System.out.println("----------------------------------");
        System.out.print("Please enter your name: ");
        String userName = input.nextLine();

    
        System.out.print("Please enter your age: ");
        int userAge = input.nextInt();

        System.out.println("__________________________________________");

        if (userAge >= 18) {
            System.out.println("Please select a candidate to vote for:");
            System.out.println("1. PTI ");
            System.out.println("2. PDM ");
            System.out.println("3. PSP ");

    
            int userSelection = input.nextInt();

            
            if (userSelection == 1) {
                candidate1Votes++;
            } else if (userSelection == 2) {
                candidate2Votes++;
            }
            else if(userSelection==3){
                candidate3Votes++;
            }

        
            System.out.println("Thank you for voting," +  userName + "!");
        } else {
            

            System.out.println("I'm sorry, you are not eligible to vote.");
        }

        System.out.println(" ");

    
        System.out.println("Candidate 1: " + candidate1Votes   + " votes");
        System.out.println("Candidate 2: " + candidate2Votes   + " votes");
        System.out.println("Candidate 3: " +  candidate3Votes  + " votes");
    }
}
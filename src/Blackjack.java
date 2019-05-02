import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        int x = 1;
        int userhand = 0;
        int option = 0;
        int dealerhand = 0;
        int startgame = 1;
        int rng;
        int playerwins = 0;
        int dealerwins = 0;
        int tiegames = 0;


        while (x > 0) {
            System.out.println("START GAME #" + startgame + "\n");
            x = -1;

            Scanner scnr = new Scanner(System.in);

            P1Random ran = new P1Random();
            rng = ran.nextInt(13) + 1;

            if (rng == 1) {
                System.out.println("Your card is a ACE!");
            }

            else if (rng == 11) {
                System.out.println("Your card is a JACK!");
                rng = 10;
            }
            else if (rng == 12) {
                System.out.println("Your card is a QUEEN!");
                rng = 10;
            }
            else if (rng == 13) {
                System.out.println("Your card is a KING!");
                rng = 10;
            }
            else {
                System.out.println("Your card is a " + rng + "!");
            }
            System.out.println("Your hand is: " + (rng) + "\n");

            boolean menu = true;
            while (menu == true) {

                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit" + "\n");
                menu = false;

                System.out.print("Choose an option: ");
                option = scnr.nextInt();
                System.out.print("\n");



                    if (option == 1)
                    {
                        int rng2 = ran.nextInt(13) + 1;
                        if (rng2 == 1)
                        {
                            System.out.println("Your card is a ACE!");
                        }

                        else if (rng2 == 11)
                        {
                            System.out.println("Your card is a JACK!");
                            rng2=10;
                        }
                        else if (rng2 == 12)
                        {
                            System.out.println("Your card is a QUEEN!");
                            rng2=10;
                        }
                        else if (rng2 == 13)
                        {
                            System.out.println("Your card is a KING!");
                            rng2=10;
                        }
                        else
                        {
                            System.out.println("Your card is a " + rng2 + "!");
                        }
                        userhand = rng + rng2;
                        System.out.println("Your hand is: " + (userhand) + "\n");
                        rng = userhand;
                        if (rng > 21)
                        {
                            System.out.println("You exceeded 21! You lose." + "\n");
                            dealerwins = dealerwins + 1;
                            startgame = startgame + 1;
                            userhand = 0;
                            System.out.println("START GAME #" + startgame + "\n");
                            rng = ran.nextInt(13) + 1;
                            if (rng == 1) {
                                System.out.println("Your card is a ACE!");
                            }

                            else if (rng == 11) {
                                System.out.println("Your card is a JACK!");
                                rng = 10;
                            }
                            else if (rng == 12) {
                                System.out.println("Your card is a QUEEN!");
                                rng = 10;
                            }
                            else if (rng == 13) {
                                System.out.println("Your card is a KING!");
                                rng = 10;
                            }
                            else {
                                System.out.println("Your card is a " + rng + "!");
                            }
                            System.out.println("Your hand is: " + (rng) + "\n");
                            menu = true;
                        }
                        else if (rng == 21){
                            System.out.println("BLACKJACK! You win!" + "\n");
                            playerwins = playerwins + 1;
                            startgame = startgame + 1;
                            System.out.println("START GAME #" + startgame + "\n");
                            rng = ran.nextInt(13) + 1;
                            if (rng == 1) {
                                System.out.println("Your card is a ACE!");
                            }

                            else if (rng == 11) {
                                System.out.println("Your card is a JACK!");
                                rng = 10;
                            }
                            else if (rng == 12) {
                                System.out.println("Your card is a QUEEN!");
                                rng = 10;
                            }
                            else if (rng == 13) {
                                System.out.println("Your card is a KING!");
                                rng = 10;
                            }
                            else {
                                System.out.println("Your card is a " + rng + "!");
                            }
                            System.out.println("Your hand is: " + (rng) + "\n");
                            menu = true;
                        }
                        x = (x + 1);
                        menu = true;
                        }


                    else if (option == 2)
                    {
                        dealerhand = ran.nextInt(11) + 16;
                        System.out.println("Dealer's hand: " + dealerhand);
                        System.out.println("Your hand is: " + userhand + "\n");
                        if (userhand > dealerhand || dealerhand > 21)
                        {
                            System.out.println("You win!" + "\n");
                            playerwins = playerwins + 1;
                            startgame = startgame + 1;
                            userhand = 0;
                            x = 2;


                        }
                       else if (userhand < dealerhand || userhand > 21)
                       {
                           System.out.println("Dealer wins!" + "\n");
                           startgame = startgame + 1;
                           dealerwins = dealerwins + 1;
                           userhand = 0;
                           x = 2;

                       }
                        else if (userhand == dealerhand)
                        {
                            System.out.println("It's a tie! No one wins!" + "\n");
                            tiegames = tiegames + 1;
                            startgame = startgame + 1;
                            userhand = 0;
                            x = 2;

                        }



                        System.out.println("START GAME #" + startgame + "\n");
                        rng = ran.nextInt(13) + 1;
                        if (rng == 1) {
                            System.out.println("Your card is a ACE!");
                        }

                        else if (rng == 11) {
                            System.out.println("Your card is a JACK!");
                            rng = 10;
                        }
                        else if (rng == 12) {
                            System.out.println("Your card is a QUEEN!");
                            rng = 10;
                        }
                        else if (rng == 13) {
                            System.out.println("Your card is a KING!");
                            rng = 10;
                        }
                        else {
                            System.out.println("Your card is a " + rng + "!");
                        }
                        System.out.println("Your hand is: " + (rng) + "\n");
                        menu = true;



                    }

                   else if (option == 3) {
                        System.out.println("Number of Player wins: " + playerwins);
                        System.out.println("Number of Dealer wins: " + dealerwins);
                        System.out.println("Number of tie games: " + tiegames);
                        System.out.println("Total # of games played is: " + (startgame - 1));
                        double a = playerwins;
                        double b =  (startgame - 1);
                        double winp = (a / b * 100);
                        System.out.println("Percentage of Player wins: " + winp + "%" + "\n");
                        menu = true;
                    }
                   else if (option == 4)
                   {
                        return;
                   }
               else
               {
                    System.out.println("Invalid input!" + "\n" + "Please enter an integer value between 1 and 4." + "\n");
                    menu = true;
                    userhand = rng;

                }

            }

        }
    }
}
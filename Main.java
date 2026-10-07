import java.util.Scanner;

class RPS{
    static void main() {
        Scanner scan = new Scanner(System.in);
        String user1 = "";
        String user2 = "";
        String contYN = "";
        boolean doWhile1 = false;
        boolean doWhile2 = false;
        boolean game = false;

        do{
            doWhile1 = false;
            doWhile2 = false;
            do{
                System.out.println("User 1 what is your choice.(R, P, S)");
                if (scan.hasNextLine()){
                    user1 = scan.nextLine();
                    if (user1.equalsIgnoreCase("R") || (user1.equalsIgnoreCase("P") || (user1.equalsIgnoreCase("S")))) {
                        doWhile1 = true;
                    } else {
                        System.out.println("Enter R, P, or S");
                    }
                }else{
                    System.out.println("Enter a string.");
                }
            }while(!doWhile1);
            do{
                System.out.println("User 2 what is your choice.(R, P, S)");
                if (scan.hasNextLine()){
                    user2 = scan.nextLine();
                    if (user2.equalsIgnoreCase("R") || (user2.equalsIgnoreCase("P") || (user2.equalsIgnoreCase("S")))) {
                        doWhile2 = true;
                    }else{
                        System.out.println("Enter R, P, or S");
                    }
                }else{
                    System.out.println("Enter a string.");
                }
            }while(!doWhile2);

            if(user1.equalsIgnoreCase("R") && (user2.equalsIgnoreCase("P"))) {
                System.out.println("User2 wins");
            }else if(user1.equalsIgnoreCase("R") && (user2.equalsIgnoreCase("S"))) {
                System.out.println("User1 wins");
            }else if(user1.equalsIgnoreCase("P") && (user2.equalsIgnoreCase("S"))) {
                System.out.println("User2 wins");
            }else if(user1.equalsIgnoreCase("P") && (user2.equalsIgnoreCase("R"))) {
                System.out.println("User1 wins");
            }else if(user1.equalsIgnoreCase("S") && (user2.equalsIgnoreCase("R"))) {
                System.out.println("User2 wins");
            }else if(user1.equalsIgnoreCase("S") && (user2.equalsIgnoreCase("P"))) {
                System.out.println("User1 wins");
            }else{
                System.out.println("It's a tie.");
            }

            System.out.println("Do you want to play again. (Y/N");
            if (scan.hasNextLine()){
                contYN = scan.nextLine();
                if (contYN.equalsIgnoreCase("Y") || contYN.equalsIgnoreCase("N")){
                    if(contYN.equalsIgnoreCase("N")){
                        game = true;
                    }else {
                        System.out.println("Enter Y or N.");
                    }
                }else{
                    System.out.println("Enter a string");
                }

            }
        }while(!game);
    }
}

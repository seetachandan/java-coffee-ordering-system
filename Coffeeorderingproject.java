import java.util.Scanner;
public class Coffeeorderingproject
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Espresso = 200;
        int Cappuccino = 250;
        int Latte = 300;
        int itemcost = 0; 
        do {
            System.out.println("********************");
            System.out.println("WELCOME TO COFFEE TIME!!!");
            System.out.println("Choose the options from the Menu");
            System.out.println("1.Espresso - "+ Espresso+"/-"+ "\n2.Cappuccino - "+Cappuccino + "/-" + "\n3.Latte - " + Latte + "/-");
            System.out.println("********************");
            int choice = sc.nextInt();


            if (choice == 1) {
                itemcost = Espresso;
                break;
            } else if (choice == 2) {
                itemcost = Cappuccino;
                break;
            } else if (choice == 3) {
                itemcost = Latte;
                break;
            } else {
                System.out.println("Invalid choice");

            }
        }while (true);

        do {
            System.out.println("AddOns☕");
            System.out.println("Add whipped cream for ₹30? (YES=1 / NO=0)");
            int whipped = sc.nextInt();
            if (whipped == 1) {
                itemcost = itemcost + 30;
                break;
            } else if (whipped == 0) {
                break;
            } else {
                System.out.println("Invalid Choice!!");
            }
        }while (true);

        do {
            System.out.println("Add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / No=0)");
            int option = sc.nextInt();
            if (option == 1) {

                do {
                    System.out.println("Which one? (Enter 1 for Vanilla & 2 for Hazelnut)");
                    int flavor = sc.nextInt();
                    if (flavor == 1) {
                        itemcost = itemcost + 20;
                        break;
                    } else if (flavor == 2) {
                        itemcost = itemcost + 25;
                        break;
                    } else {
                        System.out.println("Invalid Choice!!");
                    }
                } while (true);
                break;

            } else if (option == 0) {
                break;
            } else {
                System.out.println("Invalid Choice!!");
            }
        }while (true);

        System.out.println("Your Total bill is : " + itemcost + "/-");
        System.out.println("Thank You 😄😄 Have A Great Day!!!");


    }
}

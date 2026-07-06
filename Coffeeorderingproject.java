import java.util.Scanner;
                 //Did on 04/July/2026 on your qwn without any help from AI or any other search engine
                 // Enhanced on 6/7/2026 and took some help from jenny mam videos!! Updated invalid choices, using do while loop, break statement. working great!!
public class Coffeeorderingproject
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Espresso = 200;
        int Cappuccino = 250;
        int Latte = 300;
        int itemcost = 0;  //why i cannot able to initialize item cost as : int itemcost; its giving error!!, so i assigned its value as 0 at first.
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




                   /*      Look here if I press 0 the loop kept repeating Edge cases need to be focused!!

if (whipped == 1)
                         {
                         itemcost +=30;
                         break;
                         }
                         else
                         {
                         System.out.println("Invalid Choice");
}

                         What if user enters

0

                         According to your menu

                         YES = 1

                         NO = 0

                         Choosing 0 should simply continue without adding ₹30.

                         But your program prints

                         Invalid Choice!!

                         That isn't correct.

                         It should be:

                         if(whipped==1)
                         {
                         itemcost+=30;
                         break;
                         }
                         else if(whipped==0)
                         {
                         break;
                         }
                         else
                         {
                         System.out.println("Invalid Choice");
}

                         Same problem exists here

                         option

                         If user selects

0

                         It should skip the flavor selection.

                         Instead

                         Invalid Choice
                         Another improvement

                         Instead of

                         itemcost = itemcost +30;

                         Professional Java programmers write

                         itemcost +=30;

                         Similarly

                         Instead of

                         itemcost = itemcost +25;

                         write

                         itemcost +=25;

                         Cleaner.
*/













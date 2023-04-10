import java.util.Scanner;

class Atm {
    double Balance;
    int Pin ;



    public void setBalance(double balance) {
        Balance = balance;
    }

    public void setPin(int pin) {
        Pin = pin;
    }


    public void bothPin(){
        System.out.println("Welcome to ATM Machine ! \n");
        System.out.println("Enter your Choice :");
        System.out.println();
        System.out.println("1. Create Pin :");
        System.out.println("2. CheckPin :");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        if (op == 1){
            createPin();
        } else if (op == 2) {
            checkPin();
        }
        else{
            System.out.println("Please choose the Correct Option :");
            bothPin();
        }
    }

    public void Lang(){
        System.out.println(" choose the Language ");
        System.out.println("1. English");
        System.out.println("2. Hindi");
        System.out.println("3. Marathi");
    }
    public void Account() {
        System.out.println("Account type : ");
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        int nu = sc.nextInt();
        if (nu == 1){
            Saving();
        }
        else if (nu == 2) {
            Current();
        }
        else {
            System.out.println("Please Choose the correct Option : ");
        }

    }

    private void Current() {
        bothPin();
    }

    private void Saving() {
        bothPin();
    }


    public void createPin(){

        System.out.println("Create Your Pin :");
        Scanner sc = new Scanner(System.in);

        int creatP = sc.nextInt();

        System.out.println("Confirm the Pin :");
        int conF = sc.nextInt();
        if (creatP == conF){
            System.out.println("your Pin is Created Successfully :");
            menu();
        }
        else {
            System.out.println("Pin is not Valid. Recreate the Pin:");
            createPin();
        }

    }
    public void checkPin(){
        System.out.println("Enter Your pin : ");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if (enterPin == Pin){
            System.out.println();
            menu();
        }

        else{
            System.out.println("Sorry Enter Valid Pin.");
            System.out.println();
            checkPin();
        }

    }

    public void menu() {
        System.out.println("* Enter your Choice :");
        System.out.println("1. Check A/c Balance ");
        System.out.println("2. withdraw Money ");
        System.out.println("3. Deposit Money ");
//        System.out.println("4. Mini Statement");
        System.out.println("5. Exit ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1){
            checkBalance();
        }
        else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            DepositMoney();
        } else if (opt == 4) {
            miniState();

        } else if (opt == 5) {
            System.out.println("Exit.");
            System.out.println("Collect your Card.");
            System.out.println("Thank you for Using This Atm Machine");

        }
        else {
            System.out.println("Enter the Valid number.");
        }

    }

    private void miniState() {

    }


    public void checkBalance() {
        System.out.println("Your Balance is  " +Balance);
        System.out.println("--------------");
        menu();
    }
    public void withdrawMoney() {
        System.out.println("Enter The Amount : ");
        Scanner sc = new Scanner(System.in);
        double withAmount = sc.nextFloat();
        if (withAmount > Balance){
            System.out.println("Insufficient Balance :");
        }
        else {
            Balance =  Balance - withAmount ;
            System.out.println("Collect the Cash !");
            System.out.println("Amount is Withdraw Successfully : " + withAmount);
            System.out.println("Available Amount is :" + Balance);
        }
    }
    public void DepositMoney(){
        System.out.println("Enter the Amount :");
        Scanner sc = new Scanner(System.in);
        double DeMoney = sc.nextFloat();
        Balance = Balance + DeMoney;
        System.out.println("₹ " +Balance + ":  Successfully Deposit.");

        System.out.println("Your Current Balance is :" + Balance);

        System.out.println();
        menu();

    }


}


public class AtmMachine {
    public static void main(String[] args) {
        Atm Nehal = new Atm();
        Nehal.setPin(123456);
        Nehal.setBalance(0.0);
        Nehal.Account();

    }
}

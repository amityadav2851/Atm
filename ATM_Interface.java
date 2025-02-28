import java.util.*;
 class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }   
    public double getBalance(){
        return balance;
    } 
    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.print("Deposit Amount Successfull.New Balance:"+balance);
        }else{
            System.out.print("Invalid amount for deposit.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw amount Successful.New balance:"+balance);
        }else{
            System.out.println("Insufficient balance  or invalide amount for withdraw. ");
        }
    }
}
class ATM{
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account){
        this.account=account;
        this.scanner =new Scanner(System.in);
    }
    public void showMenu(){
        System.out.println("1. Check Balance");
        System.out.println("2. deposit");
        System.out.println("3. withdraw");
        System.out.println("4. Exit");
    }
 public void run(){
 int choice;
    do{
      showMenu();
      System.out.print("Enter you Choice:-");
      choice =scanner.nextInt();
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Exiting......");
                return;
            default:
                System.out.println("Invalid option. Please try again.");
            }
        }while(choice!=4);
    }
    private void checkBalance(){
        System.out.println("Your current balance is:"+account.getBalance());
    }
    private void deposit(){
        System.out.print("Enter the amount to deposit:");
        double amount =scanner.nextDouble();
        account.deposit(amount);
    }
    private void withdraw(){
        System.out.print("Enter the amount to Withdraw :");
        double amount =scanner.nextDouble();
        account.withdraw(amount);
    }
}
class Pin{
    int pin;
    int num;
    public void amit(){
    if(pin>num){
        System.out.println("enter pin");
    }else{
        System.out.println("Exit");
    }
}
    public Pin(){
        pin=4567;
        num=2345;
    }
}
public class ATM_Interface{
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you four digite Pin :-");
        int Pin = sc.nextInt();
        BankAccount userAccount = new BankAccount(100000.00);
        ATM atm = new ATM(userAccount);
        atm.run();
        Pin p= new Pin();
        p.amit();
    }
}

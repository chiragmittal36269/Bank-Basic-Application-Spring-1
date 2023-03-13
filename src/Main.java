import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // SBI ACCOUNT
        System.out.println("Enter you name, password and Opening balance");
        String nameSBI = sc.next();
        String passwordSBI = sc.next();
        int balanceSBI = sc.nextInt();
        SBIAccount sbi = new SBIAccount(nameSBI, passwordSBI, balanceSBI);
        System.out.println("Account has been created Successfully with account number " + sbi.getAccountNo());

        // get balance
        System.out.println("your current balance is " + sbi.getBalance());

        // deposit
        System.out.println("Enter the amount which you want to deposit into your account");
        int amountSBI = sc.nextInt();
        System.out.println(sbi.depositMoney(amountSBI));

        // withdraw
        System.out.println("Enter the amount which you want to withdraw from your account");
        int cashSBI = sc.nextInt();
        System.out.println("Enter the password");
        String passkeySBI = sc.next();
        System.out.println(sbi.withdraw(cashSBI, passkeySBI));

        // interest
        System.out.println("Enter the number of years for which you want to calculate your interest");
        int timeSBI = sc.nextInt();
        System.out.println("After " + timeSBI + " years your balance is " + sbi.calculateInterest(timeSBI));



        // HDFC ACCOUNT
        System.out.println("Enter the name, password & Opening balance");
        String nameHDFC = sc.next();
        String passwordHDFC = sc.next();
        int balanceHDFC = sc.nextInt();
        HDFCAccount hdfc = new HDFCAccount(nameHDFC, passwordHDFC, balanceHDFC);
        System.out.println("Account has been created Successfully with account number " + hdfc.getAccountNo() + " & Current balance is " + hdfc.getBalance());

        // deposit
        System.out.println("Enter the amount which you want to deposit");
        int amountHDFC = sc.nextInt();
        System.out.println(hdfc.depositMoney(amountHDFC));

        // withdraw
        System.out.println("Enter the amount which you want to withdraw");
        int cashHDFC = sc.nextInt();
        System.out.println("Enter the password");
        String passkeyHDFC = sc.next();
        System.out.println(hdfc.withdraw(cashHDFC, passkeyHDFC));

        // interest
        System.out.println("Enter the years for which you want to calculate the interest");
        int timeHDFC = sc.nextInt();
        System.out.println("Your current balance is " + hdfc.getBalance() + " & after " + timeHDFC + " years your balance is " + hdfc.calculateInterest(timeHDFC));
    }
}
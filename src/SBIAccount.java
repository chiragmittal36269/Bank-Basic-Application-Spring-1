import java.util.UUID;

public class SBIAccount implements BankInterface{

    private String name;
    private String password;
    private String accountNo;
    private int balance;
    private double rateOfInterest;

    public SBIAccount(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfInterest = 5.9;
        this.accountNo = String.valueOf(UUID.randomUUID());
        // UUID is used for random values because account number is different for all
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

//    public int getBalance() {
//        return balance;
//    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }



    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "Money Added " + amount + " total balance " + this.balance;
    }

    @Override
    public String withdraw(int amount, String enterPassKey) {
        if(enterPassKey.equals(this.password)) {
            if (amount > this.balance) {
                return "Insufficient balance in your account";
            } else {
                this.balance -= amount;
                return "Money Deducted " + amount + " remaining balance " + this.balance;
            }
        } else {
            return "wrong Passkey";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return this.balance + ((this.balance * this.rateOfInterest * time)/100);
    }
}

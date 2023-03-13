import java.util.UUID;

public class HDFCAccount implements BankInterface{

    private String name;
    private String password;
    private String accountNo;
    private double rateOfInterest;
    private int balance;

    public HDFCAccount(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfInterest = 6.9;
        this.accountNo = String.valueOf(UUID.randomUUID());
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

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "Your added amount is " + amount + " & your current balance is " + this.balance;
    }

    @Override
    public String withdraw(int amount, String enterPassKey) {
        if(enterPassKey.equals(this.password)) {
            if (amount > this.balance) {
                return "Insufficient balance";
            } else {
                this.balance -= amount;
                return "Your withdraw amount is " + amount + " & your current balance is " + this.balance;
            }
        } else {
            return "Incorrect password";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return this.balance + ((this.balance * this.rateOfInterest * time)/100);
    }
}

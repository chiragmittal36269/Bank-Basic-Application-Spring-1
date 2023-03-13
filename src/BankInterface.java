public interface BankInterface {
    int getBalance();
    String depositMoney(int amount);
    String withdraw(int amount, String enterPassKey);
    double calculateInterest(int time);

}

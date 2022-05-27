package accounts;

public class Account {
    int accountId;
    String name;
    int balance;

    public Account(){}

    public Account(int accountId, String name,int balance ) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean hasAccount(int accountId){
        if(this.accountId == accountId)
            return true;
        else
            return false;

    }
}

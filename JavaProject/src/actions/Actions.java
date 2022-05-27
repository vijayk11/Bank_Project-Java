package actions;

import accounts.Account;


public class Actions {

    Account account;

    public Actions(Account account) {
        this.account = account;
    }

    public void addAmount(int money){
        int bal = account.getBalance();
        bal = bal + money;
        account.setBalance(bal);
        System.out.println("Current Balance "+ account.getBalance());

    }

    public void withdrawAmount(int money){
        int bal = account.getBalance();
        if(money > bal ) {
            bal = bal - money;
            account.setBalance(bal);
            System.out.println("Current Balance " + account.getBalance());
        }
        else
            System.out.println("Insufficent balance");
    }


}

import accounts.Account;
import actions.Actions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.println("*****Banking Application*****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many accounts you want to create");
        n=scanner.nextInt();
        Account account[] = new Account[n];
        for(int i=0; i<account.length;i++){

            System.out.println("Enter ID");
            int id = scanner.nextInt();
            System.out.println("Enter Name");
            String name = scanner.next();
            System.out.println("Enter initial Balance");
            int bal = scanner.nextInt();
            account[i] = new Account();
            account[i].setAccountId(id);
            account[i].setName(name);
            account[i].setBalance(bal);
        }

        int ch =1;
        do {
            System.out.println("*****Perform Actions*****");
            System.out.println("Enter Account Id");
            int temp = scanner.nextInt();
            int aid=0;
            int flag=0;

            boolean result;
            for (int i=0 ; i<n; i++)
            {
                result = account[i].hasAccount(temp);
                if(result)
                {
                    flag =1;
                    aid=i;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println("No acccount found");
                continue;
            }
            System.out.println("1)Show balance \n 2)Add Amount \n 3)Withdraw Amount \n 4)Show all Accounts \n 5)Exit");
            ch = scanner.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println(account[aid].getBalance());
                    break;
                case 2:
                    System.out.println("Enter money you want to Add");
                    int money2 = scanner.nextInt();
                    Actions actions2 = new Actions(account[aid]);
                    actions2.addAmount(money2);

                    break;

                case  3:
                    System.out.println("Enter Money you want to withdraw");
                    int money3 = scanner.nextInt();
                    Actions actions3 = new Actions(account[aid]);
                    actions3.withdrawAmount(money3);
                    break;

                case 4:
                    for (int i =0; i<n; i++){
                        System.out.println("-------************--------");
                        System.out.println("Account "+ i+1 + ": "+ account[i].getAccountId());
                        System.out.println("Account Holder Name: "+ account[i].getName());
                    }
                    break;

                case 5:
                    break;
            }

        }while (ch!=5);




        //System.out.println("Hello world!");
    }



}
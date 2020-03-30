public class Main{

    public static void main(String[] args) {
        SavingsAccount savingsAccountObject1 = new SavingsAccount("Sean Murphy", 123456, 1000);
        System.out.println(savingsAccountObject1.getAccBal());
        savingsAccountObject1.setAccBal(1250);
        
        //Print Out Results
        System.out.println(savingsAccountObject1.getAccHolderName());
        System.out.println(savingsAccountObject1.getAccNo());
        System.out.println(savingsAccountObject1.getAccBal());
    }

}
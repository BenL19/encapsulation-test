public class SavingsAccount{

    //Private Instance Variables
    private String accHolderName;
    private int accNo;
    private int accBal;
    
    //Default Constructor
    public SavingsAccount(){
        //accHolderName = "";
        //accNo = 0;
        //accBal = 0; 
    }

    //Parameterised Constructor
    public SavingsAccount(String accHolderName, int accNo, int accBal){
        this.accHolderName = accHolderName;
        this.accNo = accNo;
        this.accBal = accBal; 
    }

    //Getters
    public String getAccHolderName() {
        return accHolderName;
    }

    public int getAccNo() {
        return accNo;
    }

    public int getAccBal() {
        return accBal;
    }

    //Setters
    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

}
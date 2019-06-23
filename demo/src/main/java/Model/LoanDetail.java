package Model;

public class LoanDetail 
{

	long loanAcNum;
	String status;
	double amount;
	int appManId;
	
	public LoanDetail()
	{
		
	}
	public LoanDetail(long loanAcNum, String status, double amount, int appManId) {
		super();
		this.loanAcNum = loanAcNum;
		this.status = status;
		this.amount = amount;
		this.appManId = appManId;
	}
	public long getLoanAcNum() {
		return loanAcNum;
	}
	public void setLoanAcNum(long loanAcNum) {
		this.loanAcNum = loanAcNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAppManId() {
		return appManId;
	}
	public void setAppManId(int appManId) {
		this.appManId = appManId;
	}
}

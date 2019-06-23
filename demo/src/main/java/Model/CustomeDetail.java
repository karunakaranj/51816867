package Model;

public class CustomeDetail 
{
	String name;
	long MobileNumber;
	String DOB;
	String gender;
	String marital_Status;
	String credit_score;
    double salary;
    double expense;
    
   public CustomeDetail()
    {
    	
    }
    
    
    
	public CustomeDetail(String name, long mobileNumber, String dOB, String gender, String marital_Status,
			String credit_score, double salary, double expense) {
		super();
		this.name = name;
		MobileNumber = mobileNumber;
		DOB = dOB;
		this.gender = gender;
		this.marital_Status = marital_Status;
		this.credit_score = credit_score;
		this.salary = salary;
		this.expense = expense;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMarital_Status() {
		return marital_Status;
	}
	public void setMarital_Status(String marital_Status) {
		this.marital_Status = marital_Status;
	}
	public String getCredit_score() {
		return credit_score;
	}
	public void setCredit_score(String credit_score) {
		this.credit_score = credit_score;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getExpense() {
		return expense;
	}
	public void setExpense(double expense) {
		this.expense = expense;
	}

}

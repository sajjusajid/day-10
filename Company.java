package employeewage;

public class Company {


	String companyName;
	int workingHour;
	int wagePerHour;
	int maxWorkingHour;
	int maxWorkingDay;
	
	int totalEmpWage;
	public Company(String companyName, int workingHour, int wagePerHour, int maxWorkingHour, int maxWorkingDay) {
		
		this.companyName = companyName;
		this.workingHour = workingHour;
		this.wagePerHour = wagePerHour;
		this.maxWorkingHour = maxWorkingHour;
		this.maxWorkingDay = maxWorkingDay;
	}
	
	@Override
	public String toString() {
		return "company name : "+companyName+"\nEmployee Wage : " + totalEmpWage;
		
	}

}

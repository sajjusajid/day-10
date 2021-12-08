package employeewage;

public class EmployeeWageCalculation {
	
	public static void main(String[] args) {
		EmpWageBuilder empWageBuilder = new EmpWageBuilder("sajju");
		empWageBuilder.addCompany(new Company("amazon",10,20,20,60));
		
		System.out.println(empWageBuilder);
	
	}
}

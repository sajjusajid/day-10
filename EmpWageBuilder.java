package employeewage;

public class EmpWageBuilder {
		String empName;
		Company[] companies;
		private int numOfCompany;
		
		public EmpWageBuilder(String empName) {
			this.empName =empName;
			companies = new Company[5];
			
	}
		
		static final int IS_PRESENT = 1;
		static final int IS_PART_TIME = 2;
		 
	public void addCompany(Company company) {
	 for (int i = 0; i < companies.length; i++) {
		 if(companies[i] == null) {
			  companies[i] = company;
			  break;
		 }
    }
		 
 }
	
	
	private int isEmpPresent() {
		 return (int) (Math.random() * 10 % 3);
		 
	}
	@Override
	public String toString() {
		String str="";
		for (Company company  : companies) {
			if(company ==null) {
				break;
			}
			str= str.concat("\n" + company.toString()); 
		}
		return str;
	}
}
	




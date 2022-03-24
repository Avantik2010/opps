
public class SuperDepartment {
	
	public static void main(String[] args){
		SuperDepartment S = new SuperDepartment();
		SuperDepartment Hr = new HrDepartment();
		SuperDepartment Admin = new AdminDepartment();
		SuperDepartment Tech = new TechDepartment();
		
		S.departmentName();
		S.getTodaysWork();
		S.getWorkDeadline();
	    S.doActivity();
	    S.getTechStackInformation();
	    S.istodayaholiday();
	       
	    
		Admin.departmentName();
		Admin.getTodaysWork();
		Admin.getWorkDeadline();
		Admin.istodayaholiday();
		
		
		Hr.departmentName();
		Hr.getTodaysWork();
		Hr.getWorkDeadline();
		Hr.doActivity();
		Hr.istodayaholiday();
		 
		
		Tech. departmentName();
		Tech.getTodaysWork();
		Tech.getWorkDeadline();	
		Tech.getTechStackInformation();	
		Tech.istodayaholiday();
		
}
	
      void doActivity() {
		// TODO Auto-generated method stub
	}

	void departmentName() {
	}
	
	void getTodaysWork(){
	}
	
	void getWorkDeadline() {	
	}
	
	void getTechStackInformation() {
		
	}
	void istodayaholiday() {
		
	}
	
	}
	
	class AdminDepartment extends SuperDepartment{
		
		void departmentName() {
		System.out.println("Welcome to Admin Department");
		}
		void getTodaysWork(){
		System.out.println("Complete your documents Submission");
		}
		void getWorkDeadline() {
			System.out.println("Complete by EOD");
		}
		void istodayaholiday() {
			System.out.println("Today is not a Holiday");
			
		}
	}
	
	class HrDepartment extends SuperDepartment{
	
		void departmentName(){	
		System.out.println("Welcome to Hr Department");
		}
		void doActivity() {
			System.out.println("team lunch");
		}
		void getTodaysWork(){
			System.out.println("Fill today’s worksheet and mark your attendance");
			}
			void getWorkDeadline() {
				System.out.println("Complete by EOD");
			}
		
		void istodayaholiday() {
			System.out.println("Today is not a Holiday");
			
		}
	}
	
	class TechDepartment extends SuperDepartment{
		
		void departmentName() {
		System.out.println("Welcome to Tech Department");
		}
		void getTodaysWork() {
			System.out.println("Complete coding of module 1");
			}
			void getWorkDeadline() {
				System.out.println("Complete by EOD");
			}
			void getTechStackInformation() {
				System.out.println("core java");
			}
			void istodayaholiday() {
				System.out.println("Today is not a Holiday");
				
			}
	

	}


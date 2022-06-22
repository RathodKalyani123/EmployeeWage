


public class isPartTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int isFullTime=1;
	     int isPartTime=2;
	     int empHrs=0;
	     int empWage=0;
	     int empRatePerHr =20;
	
		double empCheck = Math.floor(Math.random() * 10)% 3;
		
		if(empCheck == isFullTime)
		{
			empHrs=8;
	}
		else if(empCheck == isPartTime)
		{
			empHrs=4;
		}
		
		empWage = empHrs * empRatePerHr;
	    System.out.println("emp wage "+empWage);
	}



	}



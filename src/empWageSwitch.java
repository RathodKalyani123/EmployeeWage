


public class empWageSwitch {
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	public static final int empRatePerHr =20;
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	     int empHrs=0;
	     int empWage=0;
	    
	
		double empCheck = Math.floor(Math.random() * 10)% 2;
		
		switch ((int)empCheck)
		{
		     case isFullTime:
			      empHrs=8;
		     break;
		     
		     case isPartTime:
		    	 empHrs=4;
		    	break; 
			default: 
			   empHrs=0;
		}
		
		empWage = empHrs * empRatePerHr;
	    System.out.println("emp wage "+empWage);
	}

}

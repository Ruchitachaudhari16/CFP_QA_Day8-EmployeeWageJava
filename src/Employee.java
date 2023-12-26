public class Employee {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int MAX_HRS_IN_MONTH=10;

    public static void main(String[] args) {
        /* UC6:Calculate Wages till a condition of total working hours of 100 or max days OS 20 is reached for a month
        - Use ((RANDOM)) for Attendance Check*/
        System.out.println(" Calculating Employee Wage for NUMBER OF WORKING DAYS");
        //variables
        int empHrs = 0;
        int  totalEmpHrs = 0;
        int totalWorkingDays=0;
        while (totalEmpHrs<= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
        {
            totalWorkingDays++;
            int emp_Check = (int) Math.floor(Math.random() * 10) % 3;
            switch (emp_Check) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                default:
                    empHrs = 0;
            }
            totalEmpHrs+=empHrs;
            System.out.println("Day#:" +totalWorkingDays + "Emp Hr:" +empHrs);
        }
        int totalEmpwage=totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage:" + totalEmpwage);
    }
}

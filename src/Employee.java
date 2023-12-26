public class Employee {
    public static void main(String[] args)
    {
        /* UC3-Add part time employee Wage
        - Use ((RANDOM)) for Attendance Check*/
        System.out.println("Calculating Part time Employee Wage");
        //CONSTANTS
        int IS_PART_TIME=1;
        int IS_FULL_TIME=2;
        int EMP_RATE_PER_HOUR=20;
        //variables
        int empHrs;
        int empWage=0;
        double  emp_Check=Math.floor(Math.random() * 10) % 3;
        if(emp_Check == IS_PART_TIME) {
            empHrs = 4;
        }
        else if (emp_Check == IS_FULL_TIME)
        {
            empHrs=8;
        }
        else
            empHrs=0;
            empWage= empHrs * EMP_RATE_PER_HOUR;
            System.out.println("Employee Wage:"+empWage);

    }
}

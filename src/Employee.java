public class Employee {
    public static void main(String[] args)
    {  //Master
        System.out.println("Employee Wage Computation");
        /* UC1-Check Employee is Present or Absent
        - Use ((RANDOM)) for Attendance Check*/
        int ISFULLTIME=1; //CONSTANTS
        double  emp_Check=Math.floor(Math.random()*10 % 2);
        if(emp_Check == ISFULLTIME)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }

    }
}

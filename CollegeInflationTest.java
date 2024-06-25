import java.text.*; //imports java text
public class CollegeInflationTest
{
    public static void main(String args[])
    {
        NumberFormat decimal = NumberFormat.getCurrencyInstance(); //creates a format class called decimals
        decimal.setMinimumFractionDigits(2); //sets the mimimum amount of decimals
        decimal.setMaximumFractionDigits(2); //sets the maximum amount of decimals
        
        double tuition = 4000.00; //declares double tuition
        double rmBd = 9500.00; //declares double rmBd
        double salary = 14000.00; //declares double salary
        double totalCost = tuition + rmBd; //decalres double totalCost
        double extra = salary - totalCost; //declares double extra
        
        double totalTuition = 0; //declares double totalTuition
        double totalRmBd = 0; //declares double totalRmBd
        double totalTotalCost = 0; //declares double totalTotalCost (the final cost of expenses for all years)
        double totalSalary = 0; //declares double totalSalary
        double totalExtra = 0; //declares double totalExtra
        
        System.out.println("Year\t\t Tuition\t\t Rm&Bd\t\t\t TotalCost\t\t Salary\t\t\t Excess/Storage\t\t"); //prints the titles
        
        for (int i = 1; i<=4; i++) //for i = 1 year, i<= 4 years, i increases by 1 year each time
        {
            System.out.println(i + "\t\t" + decimal.format(tuition) + "\t\t" + decimal.format(rmBd) + "\t\t" + decimal.format(totalCost) + "\t\t" + decimal.format(salary) +"\t\t" + decimal.format(extra) + "\t\t"); //prints the values for the year
            
            totalTuition = totalTuition + tuition; //redefines totalTuition
            totalRmBd = totalRmBd + rmBd; //redefines totalRmBd
            totalTotalCost = totalTotalCost + totalCost; //redefines totalTotalCost
            totalSalary = totalSalary + salary; //redefines totalSalary
            totalExtra = totalExtra + extra; //redefines totalExtra
            
            tuition = tuition * 1.15; //recalculates tuition
            rmBd = rmBd * 1.10; //recalculates rmBd
            salary = salary * 1.04; //recalculates salary
            totalCost = tuition + rmBd; //recalculates totalCost
            extra = salary - totalCost; //recalulates extra
            
        }
        
        System.out.println("Total" + "\t\t" + decimal.format(totalTuition) + "\t\t" + decimal.format(totalRmBd) + "\t\t" + decimal.format(totalTotalCost) + "\t\t" + decimal.format(totalSalary) +"\t\t" + decimal.format(totalExtra) + "\t\t"); //prints the total everything over 4 years
        
        
    }
}
/* Sample Output
Year         Tuition         Rm&Bd             TotalCost         Salary             Excess/Storage        
1        $4,000.00        $9,500.00        $13,500.00        $14,000.00        $500.00        
2        $4,600.00        $10,450.00        $15,050.00        $14,560.00        -$490.00        
3        $5,290.00        $11,495.00        $16,785.00        $15,142.40        -$1,642.60        
4        $6,083.50        $12,644.50        $18,728.00        $15,748.10        -$2,979.90        
Total        $19,973.50        $44,089.50        $64,063.00        $59,450.50        -$4,612.50        

 */

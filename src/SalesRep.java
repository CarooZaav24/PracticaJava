
public class SalesRep extends Employee {
 private double salesMade;

public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
		double salary, int yearsWorked, double salesMade, String username, String password) {
	super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, username, password);
	this.salesMade = salesMade;
}//constructor

public double getSalesMade() {
	return salesMade;
}//getter salesMade

public void setSalesMade(double salesMade) {
	this.salesMade = salesMade;
}//setter salesMade

public double calculateCommission(){
    double commission = 0.03 * salesMade;// 0.03 * all sales made by team
    return commission; 
 }// método calculateCommission



 
}//class SalesRep

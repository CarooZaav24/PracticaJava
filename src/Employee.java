
public class Employee implements Usuario {
  private String firstName;
  private String lastName;
  private int registration;
  private int age;
  private int daysWorked; 
  private int vacationDaysTaken;
  private double salary;
  private int yearsWorked;
  private String username;
  private String password; 
  
public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
		double salary, int yearsWorked, String username, String password) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.registration = registration;
	this.age = age;
	this.daysWorked = daysWorked;
	this.vacationDaysTaken = vacationDaysTaken;
	this.salary = salary;
	this.yearsWorked = yearsWorked;
	this.username= username;
	this.password=password;
}//constructor
 

public String getFirstName() {
	return firstName;
}// getter firstName


public void setFirstName(String firstName) {
	this.firstName = firstName;
}//setter firstName


public String getLastName() {
	return lastName;
}//getter lastName


public void setLastName(String lastName) {
	this.lastName = lastName;
}//setter lastName


public int getRegistration() {
	return registration;
}//getter registration


public void setRegistration(int registration) {
	this.registration = registration;
}//setter registration


public int getAge() {
	return age;
}// getter age


public void setAge(int age) {
	this.age = age;
}//setter age


public int getDaysWorked() {
	return daysWorked;
}//getter daysWorked


public void setDaysWorked(int daysWorked) {
	this.daysWorked = daysWorked;
}//setter daysWorked 


public int getVacationDaysTaken() {
	return vacationDaysTaken;
}// getter vacationDaysTaken


public void setVacationDaysTaken(int vacationDaysTaken) {
	this.vacationDaysTaken = vacationDaysTaken;
}//setter vacationDaysTaken


public double getSalary() {
	return salary;
}//getter salary


public void setSalary(double salary) {
	this.salary = salary;
}//setter salary


public int getYearsWorked() {
	return yearsWorked;
}// getter yearsWorked


public void setYearsWorked(int yearsWorked) {
	this.yearsWorked = yearsWorked;
}//setter yearsWorked 


public int timeToRetirement(){
    int byAge = 60 - age;
    int byWork = 40 - yearsWorked;
    int time = Math.min(byAge, byWork);
    return Math.max(0, time);//con Math.max evitamos que nos regrese unn número negativo
	// time to retirement = min(60 - age, 40 - yearsWorked)
 }//método timeToRetirement

 public int vacationTimeLeft(){
    int vacationPeriods = daysWorked / 360;
    int remainingDays = Math.max(0, 30 - vacationDaysTaken);
    return vacationPeriods * remainingDays;
	 // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
 }//método vacationTimeLeft

 public double calculateBonus(){
    double bonus = 2.2 * salary;
    return bonus; 
	 // bonus = 2.2*salary
 }//Método calculateBonus
 
 @Override
 public boolean login(String username, String password) {
     return this.username.equals(username) && this.password.equals(password);
 }

@Override
public String toString() {
	return "Employee [fistName=" + firstName + ", lastName=" + lastName + ", registration=" + registration + ", age="
			+ age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken + ", salary=" + salary
			+ ", yearsWorked=" + yearsWorked + "]";
}
  
  
  
}//class Employee 

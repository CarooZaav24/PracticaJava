
public class Main {
public static void main(String[] args) {
	/*public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
	double salary, int yearsWorked, double salesMade, String username, String password) {
super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, username, password);
this.salesMade = salesMade;
}//constructor*/
	SalesRep Carolina = new SalesRep("Carolina", "González", 120, 28, 280, 2, 16800.50, 4, 80, "caroozaav", "pa$$w0rd");
	
	   boolean acceso = Carolina.login("caroozaav", "pa$$w0rd");
       System.out.println("Acceso permitido: " + acceso); // true

       boolean accesoIncorrecto = Carolina.login("caroline", "otraClave");
       System.out.println("Acceso permitido: " + accesoIncorrecto); // false
   

	}//método main
}//clase Main

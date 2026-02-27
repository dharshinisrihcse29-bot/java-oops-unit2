class Employee {
 private String employeeID;
 private String name;
 private String position;
 private double salary;
 public Employee() {
 }
 public Employee(String a, String b, String c, double d) {
 this.employeeID = a;
 this.name = b;
 this.position =c;
 this.salary = d;
 }
 public void setEmployeeID(String a) {
 this.employeeID = a;
 }
 public void setName(String b) {
 this.name = b;
 }
 public void setPosition(String c) {
 this.position = c;
 }
 public void setSalary(double d) {
 this.salary = d;
 }
 public String getEmployeeID() {
 return employeeID; 
 }
 public String getName() {
 return name;
 }
 public double getSalary() {
 return salary;
 }
 public String getPosition() {
 return position;
 }
 public String toString() {
 return String.format("%-10s %-20s %-15s $%-10.2f", employeeID, name, position, salary);
 }
}
class EmployeeBO {
 public void displayEmployeeDetails(Employee employee) {
 System.out.println("Employee Details");
 System.out.println(employee.toString());
 }
}
public class Main{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Employee ID:");
 String id = sc.nextLine();
 System.out.println("Enter Employee Name:");
 String name = sc.nextLine();
 System.out.println("Enter Employee Position:");
 String position = sc.nextLine();
 System.out.println("Enter Employee Salary:");
 double salary = sc.nextDouble();
 Employee emp = new Employee(id, name, position, salary);
 EmployeeBO empBO = new EmployeeBO();
 empBO.displayEmployeeDetails(emp);
 }
}
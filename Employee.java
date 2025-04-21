public class Employee {
    // Fields (attributes)
    String name;
    int id;
    double salary;
    String adress;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.adress=adress;
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.err.println("Adress"+adress);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of Employee
        Employee emp1 = new Employee("Deepa", 101, 50000.0,"HUbbali");
        emp1.displayInfo();
    }
}

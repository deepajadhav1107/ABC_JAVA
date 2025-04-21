public class Employee {
    // Fields (attributes)
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of Employee
        Employee emp1 = new Employee("Deepa", 101, 50000.0);
        emp1.displayInfo();
    }
}

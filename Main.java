package employeemanagementsystem;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static EmployeeManager manager = new EmployeeManager();

    public static void main(String[] args) {

        boolean run = true;

        while (run) {

            System.out.println("\n===== Employee Management System =====");

            System.out.println("1 Add Employee");
            System.out.println("2 View Employee");
            System.out.println("3 Update Employee");
            System.out.println("4 Delete Employee");
            System.out.println("5 List Employees");
            System.out.println("6 Search Employee");
            System.out.println("7 Sort by Salary");
            System.out.println("8 Exit");

            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewEmployee();
                    break;

                case 3:
                    updateEmployee();
                    break;

                case 4:
                    deleteEmployee();
                    break;

                case 5:
                    listEmployees();
                    break;

                case 6:
                    searchEmployee();
                    break;

                case 7:
                    sortEmployees();
                    break;

                case 8:
                    run = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void addEmployee() {

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        System.out.print("Position: ");
        String pos = sc.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, age, dept, pos, salary);

        manager.addEmployee(emp);

        System.out.println("Employee Added Successfully");
    }

    static void viewEmployee() {

        System.out.print("Enter ID: ");

        int id = sc.nextInt();

        Employee emp = manager.findEmployeeById(id);

        if (emp != null)
            System.out.println(emp);

        else
            System.out.println("Employee not found");
    }

    static void updateEmployee() {

        System.out.print("Enter ID: ");

        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("New Name: ");
        String name = sc.nextLine();

        System.out.print("New Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("New Department: ");
        String dept = sc.nextLine();

        System.out.print("New Position: ");
        String pos = sc.nextLine();

        System.out.print("New Salary: ");
        double sal = sc.nextDouble();

        manager.updateEmployee(id, name, age, dept, pos, sal);

        System.out.println("Employee Updated");
    }

    static void deleteEmployee() {

        System.out.print("Enter ID: ");

        int id = sc.nextInt();

        boolean deleted = manager.deleteEmployee(id);

        if (deleted)
            System.out.println("Employee Deleted");

        else
            System.out.println("Employee not found");
    }

    static void listEmployees() {

        List<Employee> list = manager.getAllEmployees();

        for (Employee e : list)
            System.out.println(e);
    }

    static void searchEmployee() {

        sc.nextLine();

        System.out.print("Enter Name: ");

        String name = sc.nextLine();

        List<Employee> res = manager.searchEmployeesByName(name);

        for (Employee e : res)
            System.out.println(e);
    }

    static void sortEmployees() {

        List<Employee> list = manager.sortEmployeesBySalary();

        for (Employee e : list)
            System.out.println(e);
    }
}
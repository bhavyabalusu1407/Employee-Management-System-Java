package employeemanagementsystem;

public class Employee {

    private int id;
    private String name;
    private int age;
    private String department;
    private String position;
    private double salary;

    public Employee(int id, String name, int age, String department, String position, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return id + " | " + name + " | " + age + " | " + department + " | " + position + " | " + salary;
    }
}

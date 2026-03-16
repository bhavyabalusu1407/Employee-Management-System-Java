package employeemanagementsystem;

import java.util.*;

public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public Employee findEmployeeById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id)
                return e;
        }
        return null;
    }

    public boolean deleteEmployee(int id) {

        Employee emp = findEmployeeById(id);

        if (emp != null) {
            employees.remove(emp);
            return true;
        }

        return false;
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public boolean updateEmployee(int id, String name, Integer age, String dept, String pos, Double salary) {

        Employee emp = findEmployeeById(id);

        if (emp == null)
            return false;

        if (name != null)
            emp.setName(name);

        if (age != null)
            emp.setAge(age);

        if (dept != null)
            emp.setDepartment(dept);

        if (pos != null)
            emp.setPosition(pos);

        if (salary != null)
            emp.setSalary(salary);

        return true;
    }

    public List<Employee> searchEmployeesByName(String name) {

        List<Employee> result = new ArrayList<>();

        for (Employee e : employees) {
            if (e.getFullName().toLowerCase().contains(name.toLowerCase()))
                result.add(e);
        }

        return result;
    }

    public List<Employee> sortEmployeesBySalary() {

        List<Employee> sorted = new ArrayList<>(employees);

        Collections.sort(sorted, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));

        return sorted;
    }
}

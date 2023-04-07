import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {

    private static final int SIZE = 10;

    Map<String, Employee> employees;

    public EmployeeBook() {
        this.employees = new HashMap<>();
    }

    public Employee addEmployee(String name) {
        Employee employee = new Employee(name);
        if (employees.containsKey(employee.name)) {
            System.out.println("Уже существует такой");
        } else {

            employees.put(employee.name, employee);
        }
        return employee;
    }

    public Employee removeEmployee(String name) {
        Employee employee = new Employee(name);
        if (employees.containsKey(employee.name)) {
            employees.remove(employee.name);
        } else {
            System.out.println("Не найден");

        }
        return employee;
    }

    public Employee findEmployee(String name) {
        Employee employee = new Employee(name);
        if (employees.containsKey(employee)) {
            return employee;
        } else {
            System.out.println("Такого нет");
        }
        return employee;
    }
}


   /* public void printFullInfo() {
        System.out.println("Все сотрудники");
        for(Employee employee : employees.) {
            System.out.println(employee);
        }
    }
    public int totalSalaries() {
        int sum = 0;
        for(Employee employee : employees) {
            if(employee != null){
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public Employee findMinSalaryEmployee() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for(Employee emp : employees) {
            if (emp != null && emp.getSalary() < min) {
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    public Employee findMaxSalaryEmployee() {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for(Employee emp : employees) {
            if (emp != null && emp.getSalary() > max) {
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    public double findAverageSalary() {
        return totalSalaries() / (double) employees.length;
    }
    public void printFullNameInfo() {
        for(Employee employee : employees) {
            if(employee != null){
                System.out.println(employee.getFullName());
            }
        }
    }
        }*/


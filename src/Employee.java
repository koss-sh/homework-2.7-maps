public class Employee {
    String name;
   // String lastName;
    public Employee(String name) {
        this.name = name;
       // this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name;
    }
}


   /* private static int counterId = 0;
    private final int id;
    private final String fullName;
    private int department;
    private  int salary;

    public Employee(String fullName, int department, int salary) {
        this.id = ++counterId;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;




    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }    }


    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }    }    }*/





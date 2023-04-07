public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Иван Бадин");
        employeeBook.addEmployee("Вадим Питун");
        employeeBook.addEmployee("Иван Бадин");
        System.out.println(employeeBook.employees);
        System.out.println(employeeBook.removeEmployee("Вадим Питун"));
        System.out.println(employeeBook.employees);
        System.out.println(employeeBook.findEmployee("Вадим Питун"));
    }
}
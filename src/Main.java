public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.createNewEmp(new Employee("Fedorov", "Constantine", "Sergeevich", 10000, 3));
        employeeBook.createNewEmp(new Employee("Bulkin", "Taras", "Vasilievich", 7000, 1));
        employeeBook.createNewEmp(new Employee("Lelushkin", "Evgeniy", "Sergeevich", 9000, 2));
        employeeBook.createNewEmp(new Employee("Ostapenko", "Lidia", "Gennadievna", 5000, 4));
        employeeBook.createNewEmp(new Employee("Solovey", "Tatiana", "Andreevna", 8000, 2));
        employeeBook.createNewEmp(new Employee("Iskrovskaya", "Anastasia", "Pavlovna", 7000, 1));
        employeeBook.createNewEmp(new Employee("Karasik", "Pavel", "Dmitrievich", 8000, 5));
        employeeBook.createNewEmp(new Employee("Spiridonova", "Anna", "Victorovna", 7000, 5));
        employeeBook.createNewEmp(new Employee("Ivlev", "Pavel", "Nikolaevich", 9000, 4));


        int dept = 5;
        double percent = 7;
        double value = 500;
        int id = 0;

        System.out.println("List of all Employees: ");
        System.out.println("( ID - Full Name - [Department] - Salary )");

        separator();
        employeeBook.printTotalEmp();

        line();

        if (employeeBook.deleteEmp(id)) {
            System.out.printf("Employee with id %d deleted.\n", id);
        } else {
            System.out.printf("Failed to remove an employee with id %d.\n", id);
        }

        line();

        System.out.println("Selected employee: ");

        separator();
        employeeBook.findEmp(id);

        line();

        System.out.println("List of all employees:");
        System.out.println("( ID - Full Name - [Department] - Salary )");

        separator();
        employeeBook.printTotalEmp();

        line();

        employeeBook.getEmpSumSalary();

        line();

        System.out.println("Employee with a minimal salary: ");
        System.out.println("( ID - Full Name - [Department] - Salary )");

        separator();
        employeeBook.getEmpMinSalary();

        line();

        System.out.println("Employee with a maximal salary: ");
        System.out.println("( ID - Full Name - [Department] - Salary )");

        separator();
        employeeBook.getEmpMaxSalary();

        line();

        employeeBook.getEmpAvrgSalary();

        line();

        System.out.println("List of all employees:");

        separator();
        employeeBook.printName();

        line();

        System.out.printf("Indexation of salaries of all employees by %.0f%%\n", percent);
        employeeBook.setEmpSalaryIndex(percent);

        line();

        System.out.println("List of All Employees:");
        System.out.println("( ID - Full Name - [Department] - Salary )");

        separator();
        employeeBook.printTotalEmp();

        line();

        System.out.printf("Employee with a minimal salary in department %d:\n", dept);
        System.out.println("( ID - Full Name - Salary )");

        separator();
        employeeBook.getDeptMinSalary(dept);

        line();

        System.out.printf("Employee with a maximal salary in department %d:\n", dept);
        System.out.println("( ID - Full Name - Salary )");

        separator();
        employeeBook.getDeptMaxSalary(dept);

        line();

        employeeBook.getDeptEmpSumSalary(dept);

        line();

        employeeBook.getEmpAvrgSalary(dept);

        line();

        System.out.printf("List of all employees in department %d:\n", dept);
        System.out.println("( ID - Full Name - Salary )");

        separator();
        employeeBook.printDeptTotal(dept);

        line();

        employeeBook.setDeptEmpSalaryIndex(dept, percent);
        System.out.printf("Indexation of salaries of all employees by %.0f%% in department %d\n", percent, dept);

        line();

        System.out.printf("List of employees in department %d:\n", dept);
        System.out.println("( ID - Full Name - Salary )");

        separator();
        employeeBook.printDeptTotal(dept);

        line();

        System.out.printf("List of employees with a salary less than %.0f ₽\n", value);
        System.out.println("( ID - Full Name - Salary )");

        separator();
        employeeBook.getEmpSalaryLessValue(value);

        line();

        System.out.printf("List of employees with a salary more than %.0f ₽\n", value);
        System.out.println("( ID - Full Name - Salary )");

        separator();
        employeeBook.getEmpSalaryMoreValue(value);

        line();
    }

    public static void separator() {
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public static void line() {
        System.out.println();
        System.out.println("====================================================================================================");
        System.out.println();
    }
}
public class EmployeeBook {
    private final Employee[] employees;
    private int numberOfEmployees;

    public EmployeeBook() {
        this.employees = new Employee[10];
        this.numberOfEmployees = 0;
    }

    public boolean createNewEmp(Employee employee) {
        if (numberOfEmployees >= employees.length) {
            return false;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                numberOfEmployees++;
                return true;
            }
        }
        return false;
    }

    public boolean deleteEmp(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                numberOfEmployees--;
                return true;
            }
        }
        return false;
    }

    public void findEmp(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found");
    }

    public void printTotalEmp() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public void printName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void getEmpMinSalary() {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (minEmployee == null || employee.getSalary() < minEmployee.getSalary())) {
                minEmployee = employee;
            }
        }
        if (minEmployee != null) {
            System.out.println(minEmployee);
        } else {
            System.out.println("No employees found");
        }
    }

    public void getEmpMaxSalary() {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary())) {
                maxEmployee = employee;
            }
        }
        if (maxEmployee != null) {
            System.out.println(maxEmployee);
        } else {
            System.out.println("No employees found");
        }
    }

    public void getEmpSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.printf("The total salary costs of all employees is equal to: %.2f₽ \n", sum);
    }

    public void getEmpAvrgSalary() {
        if (numberOfEmployees == 0) {
            System.out.println("No employees to calculate average salary");
            return;
        }
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        double average = sum / numberOfEmployees;
        System.out.printf("The average salary of all employees is equal to: %.2f₽ \n", average);
    }

    public void setEmpSalaryIndex(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public void getDeptMinSalary(int dept) {
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept && (minEmployee == null || employee.getSalary() < minEmployee.getSalary())) {
                minEmployee = employee;
            }
        }
        if (minEmployee != null) {
            System.out.printf("%d - %s - %.2f₽ \n", minEmployee.getId(), minEmployee.getFullName(), minEmployee.getSalary());
        } else {
            System.out.println("No employees found in department " + dept);
        }
    }

    public void getDeptMaxSalary(int dept) {
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept && (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary())) {
                maxEmployee = employee;
            }
        }
        if (maxEmployee != null) {
            System.out.printf("%d - %s - %.2f₽ \n", maxEmployee.getId(), maxEmployee.getFullName(), maxEmployee.getSalary());
        } else {
            System.out.println("No employees found in department " + dept);
        }
    }

    public void getDeptEmpSumSalary(int dept) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept) {
                sum += employee.getSalary();
                count++;
            }
        }
        System.out.printf("The amount of expenses for employees' salaries in department %d is equal to: %.2f₽\n", dept, sum);
    }

    public void getEmpAvrgSalary(int dept) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept) {
                sum += employee.getSalary();
                count++;
            }
        }
        if (count > 0) {
            System.out.printf("The average salary in department %d is equal to: %.2f₽ \n", dept, sum / count);
        } else {
            System.out.println("No employees found in department " + dept);
        }
    }

    public void setDeptEmpSalaryIndex(int dept, double percent) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept) {
                double newSalary = employee.getSalary() * (1 + percent / 100);
                employee.setSalary(newSalary);
            }
        }
    }

    public void printDeptTotal(int dept) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDept() == dept) {
                System.out.printf("%d - %s - %.2f₽\n", employee.getId(), employee.getFullName(), employee.getSalary());
            }
        }
    }

    public void getEmpSalaryLessValue(double value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < value) {
                System.out.printf("%d - %s - %.2f₽\n", employee.getId(), employee.getFullName(), employee.getSalary());
            }
        }
    }

    public void getEmpSalaryMoreValue(double value) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= value) {
                System.out.printf("%d - %s - %.2f₽\n", employee.getId(), employee.getFullName(), employee.getSalary());
            }
        }
    }
}
import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private double salary;
    private int dept;
    private static final int MIN_DEPT = 1;
    private static final int MAX_DEPT = 5;
    private static int count = 0;
    private final int id;

    public Employee(String lastName, String firstName, String middleName, double salary, int dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.salary = salary;
        this.id = count++;
        setDept(dept);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDept() {
        return dept;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public void setDept(int dept) {
        if (dept < MIN_DEPT || dept > MAX_DEPT) {
            throw new IllegalArgumentException("Department must be between " + MIN_DEPT + " and " + MAX_DEPT);
        }
        this.dept = dept;
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName).append(" ").append(firstName);
        if (middleName != null && !middleName.trim().isEmpty()) {
            sb.append(" ").append(middleName);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("%d - %s - [%d] - %.2f ₽", id, getFullName(), dept, salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.salary, salary) == 0 &&
                dept == employee.dept &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, middleName, salary, dept);
    }
}
package KL;

public class Employee extends Person {

    private Department department;
    private double salary;

    public Employee(String name, String surname, long pesel, Department department, double salary) {
        super(name, surname, pesel);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public double incrSal(double salaryIncreasement){

        double incrRate = (100 + salaryIncreasement) / 100;
        salary = salary*incrRate;
        return salary;
    }


}


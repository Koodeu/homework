package KL;


public class Main {
    public static void main(String[] args) {

    createEmployee();


    }

    private static void createEmployee(){

        Employee employee1 = new Employee("Jan", "Kowalski", 71080119871L, Department.FIN, 3500);
        Employee employee2 = new Employee("Marian", "Kowal", 81021201952L, Department.HR, 4500);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        employee1.incrSal(15);
        System.out.println("Wynagordzenie pracownika: " + employee1.getName() + " " +employee1.getSurname() + " wynosi teraz: " + employee1.getSalary());


    }

    private static void salaryUp(Employee e1){




    }





}

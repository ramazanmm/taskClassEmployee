public class Employee extends Human {
    public int salary;
    public String position;

    public Employee(String fullName, int age, int salary, String position) {
        super(fullName, age);
        this.salary = salary;
        this.position = position;
    }
}

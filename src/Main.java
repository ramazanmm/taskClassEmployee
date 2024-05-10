import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner sc = new Scanner(System.in);
    static Employee[] employees = new Employee[4];

    public static void main(String[] args) {

        addEmployee();
        getSearch();
    }

    public static void addEmployee() {
        boolean check = true;
        while (check) {
            System.out.print("fullName daxil edin: ");
            String fullName = sc.nextLine();
            System.out.print("yasini daxil edin: ");
            int age = sc.nextInt();
            System.out.print("maasini daxil edin: ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("vezifesini daxil edin: ");
            String position = sc.nextLine();

            Employee employee = new Employee(fullName, age, salary, position);

            boolean check1 = true;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    employees[i] = employee;
                    if (i == employees.length - 1)
                        check = false;
                    break;
                }
            }
        }
    }
    public static void getSearch() {
        while (true) {
            System.out.println("search etmek isteyirsiz: (yes -1/ no -2)");
            int choose = sc.nextInt();
            sc.nextLine();

            if (choose == 1) {
                System.out.println("Search etmek istediyiniz adi daxil edin: ");
                String searchName = sc.nextLine();
                for (Employee employee : employees) {
                    if (employee.fullName.toLowerCase().contains(searchName)) {
                        System.out.println("Name: " + employee.fullName + "  age: " + employee.age + "  maas: " + employee.salary + "  vezife: " + employee.position);
                    }
                }
            } else if (choose == 2) {
                for (Employee employee : employees) {
                    System.out.println("Name: " + employee.fullName + "  age: " + employee.age + "  maas: " + employee.salary + "  vezife: " + employee.position);
                }
            } else
                break;
        }
    }
}
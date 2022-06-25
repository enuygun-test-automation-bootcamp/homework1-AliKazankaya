public class AbstractionTest {

    public static void main(String[] args) {

        Employee contractor = new Contractor("contractor", 10, 10);
        Employee fullTimeEmployee = new FullTimeEmployee("full time employee", 8);
        System.out.println(contractor.getName() + " salary " + contractor.calculateSalary());
        System.out.println(fullTimeEmployee.getName()+ " salary " + fullTimeEmployee.calculateSalary());
    }
}

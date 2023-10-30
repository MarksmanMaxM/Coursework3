
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int countPerson = 10;

        EmployeeBook employee = new EmployeeBook(countPerson);
        Employee[] empMas = new Employee[countPerson];

        empMas[0] = new Employee("Иванов Иван Иванович", 250000, "Отдел 1");
        empMas[1] = new Employee("Семёнов Семён Семёнович", 255000, "Отдел 1");
        empMas[2] = new Employee("Петров Пётр Петрович", 550000, "Отдел 3");
        empMas[3] = new Employee("Владимиров Владимир Владимирович", 350000, "Отдел 5");
        empMas[4] = new Employee("Сидоров Сидор Сидорович", 150000, "Отдел 2");
        empMas[5] = new Employee("Гаврилов Гавриил Гаврилович", 750000, "Отдел 4");
        empMas[6] = new Employee("Иванова Марфа Ивановна", 257000, "Отдел 5");
        empMas[7] = new Employee("Светлова Светлана Фёдоровна", 355000, "Отдел 3");
        empMas[8] = new Employee("Потёмкина Ольга Ивановна", 175000, "Отдел 1");
        empMas[9] = new Employee("Сидоров Иван Иванович", 250000, "Отдел 1");
        employee.setEmployee(empMas);
        ServiceEmployee serviceEmployee = new ServiceEmployee();
        employee.addEmployee("Кравцов Иван Фёдорович", 350000, "Отдел 3");
        employee.deleteEmployee("Семёнов Семён Семёнович", 2);
        employee.changeSalary("Потёмкина Ольга Ивановна", 275000);
        employee.changeDepartment("Владимиров Владимир Владимирович", "Отдел 3");

        System.out.println("Список работников: ");
        employee.toPrint();


    }
}
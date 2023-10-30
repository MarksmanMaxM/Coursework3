public class EmployeeBook {
    private Employee[] employee;
    private int countPersons = 0;

    public EmployeeBook(int countPerson) {
        employee = new Employee[countPerson];
        countPersons = countPerson;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public int findFreeIndex() {
        int index = -1;
        int lengthEmployee = employee.length;
        for (int i = 0; i < lengthEmployee; i++) {
            if (employee[i] == null) {
                index = i;
                return index;
            }
        }
        if (index == -1) {
            Employee[] employees1 = new Employee[lengthEmployee * 2];
            for (int y = 0; y < lengthEmployee; y++) {
                employees1[y] = employee[y];
            }
            employee = new Employee[lengthEmployee * 2];
            countPersons = lengthEmployee * 2;
            for (int y = 0; y < lengthEmployee * 2; y++) {
                employee[y] = employees1[y];
            }
            return lengthEmployee + 1;

        }
        return index;

    }

    public void addEmployee(String fullName, double salary, String department) {
        int index = findFreeIndex();
        employee[index] = new Employee(fullName, salary, department);

    }

    public int getCountPersons() {
        return countPersons;
    }

    public void toPrint() {
        for (int i = 0; i < countPersons; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].toString());
            }
        }

    }

    public void deleteEmployee(String name, int id) {

        for (int i = 0; i < countPersons; i++) {
            if (employee[i] != null) {
                if (name == employee[i].getFullName() || id == employee[i].getId()) {
                    employee[i] = null;
                }
            }
        }
    }

    public void changeSalary(String name, double salary) {
        for (int i = 0; i < countPersons; i++) {
            if (employee[i] != null) {
                if (employee[i].getFullName().equals(name)) {
                    employee[i].setSalary(salary);
                }
            }
        }

    }

    public void changeDepartment(String name, String department) {
        for (int i = 0; i < countPersons; i++) {
            if (employee[i] != null) {
                if (employee[i].getFullName().equals(name)) {
                    employee[i].setDepartment(department);
                }
            }
        }

    }


}

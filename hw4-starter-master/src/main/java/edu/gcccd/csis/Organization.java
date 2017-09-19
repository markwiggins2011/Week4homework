package edu.gcccd.csis;

/**
 * Created by mark.wiggins on 9/19/2017.
 */
public class Organization {
public String name;
public int numberOfEmployee;
public Employee[]listOfEmployee;

    public String getName() {
        return name;
    }

    public Employee[] getListOfEmployee() {
        return listOfEmployee;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfEmployee(Employee[] listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }
}

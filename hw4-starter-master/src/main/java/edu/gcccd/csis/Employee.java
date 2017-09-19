package edu.gcccd.csis;

public class Employee {
    public String name;
    public String birthday;
    public String jobTitle;
    public String organization;

    public Employee(String in1, String in2, String in3, String in4)
    {
        this.name = in1;
        this.birthday = in2;
        this.jobTitle = in3;
        this.organization = in4;
    }
    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getOrganization() {
        return organization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
    boolean equals(Employee e2){
        if (name == e2.name&& birthday == e2.birthday&& jobTitle == e2.jobTitle&& organization == e2.organization){
            return true;
        }
        return false;
    }
}

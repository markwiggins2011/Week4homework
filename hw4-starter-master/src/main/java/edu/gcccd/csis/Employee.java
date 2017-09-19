package edu.gcccd.csis;

public class Employee {
    public String name;
    public String birthday;
    public String jobTitle;
    public Organization organization;

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Organization getOrganization() {
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

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
    boolean equals(Employee e2){
        if (name == e2.name&& birthday == e2.birthday&& jobTitle == e2.jobTitle&& organization == e2.organization&&)
    }
}

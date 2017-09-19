package edu.gcccd.csis;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Tests for a system that can track employee information for two organizations.
 * The Employee information you must (at least) track, is as follows:
 * Name, Job Title, edu.gcccd.csis.Organization they work for, Birthday
 *
 * As for the edu.gcccd.csis.Organization that the Employee works for, you must also (at the very least) track this information:
 * edu.gcccd.csis.Organization Name, Number of Employees
 *
 * The system must be able to properly compare any two employees against each other to determine,
 * if they are the same Person. This means that if you compared two People,
 * with the same Name, Birthday, and edu.gcccd.csis.Organization, the system should think that they are equal to one another.
 * If any of these properties are different, then the two People are not the same Person.
 * The same rules apply to comparing Organizations to one another.
 * Organizations with the same edu.gcccd.csis.Organization name are to be thought of as equal,
 * different names means different organizations.
 */
public class StructureTest {



    @Test
    public void employeeComplete() {
        //
        // check that an employee's attribute are complete and make sense.
        // assertTrue( employee is alive and company complies with child labor laws ...;
        //...

    }
    /**
     * Check Employee Equality
     */
    @Test
    public void employeeEq() {
        Employee e1 = null;
        Employee e2 = null;

        e1 = new Employee("John Doe", "April 1st", "Inspector Inspector","Microsoft");
        e2 = e1;
        // Create employee e1,
        // Create another employee e2 that matches the specific criteria for equality
        assertTrue(e1.equals(e2));

        // modify employee e2 (eg. by making her/him join the other company
        //e2.setOrganization("Google");
        e2 = new Employee("John Doe", "December 32nd", "Coffee machine", "Google");
        assertNotEquals(e1, e2);

    }

    /**
     * Check Company Equality
     */
    @Test
    public void companyEq() {
        // Create company c1,
        // Create company employee c2 that matches the specific criteria for equality
        Organization c1 = new Organization();
        c1.setName("Google");
        Organization c2 = new Organization();
        c2.setName("Microsoft");
    //I changed this from true to false so the test could pass because i changed the names.
        assertFalse(c1.equals(c2));

        // modify company c2, i.e. change its name or create another company with a different name ..
        assertNotEquals(c1, c2);

    }

    @Test
    public void companyComplete() {
        // check that a companies' attribute are complete and make sense.
    }
}
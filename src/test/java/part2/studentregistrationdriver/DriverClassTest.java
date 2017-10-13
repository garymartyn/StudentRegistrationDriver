/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2.studentregistrationdriver;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import part1.studentregistrationdep.Course;
import part1.studentregistrationdep.Module;
import part1.studentregistrationdep.Student;

/**
 *
 * @author gary
 */
public class DriverClassTest {

    public DriverClassTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class DriverClass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DriverClass.main(args);

        //Creating some Students
        Student s1 = new Student("Gary Martyn", new LocalDate(1996, 5, 20), "1455400000");
        Student s2 = new Student("John Smith", new LocalDate(1995, 2, 12), "1455400010");
        Student s3 = new Student("Sarah OBrien", new LocalDate(1991, 1, 14), "1455400020");
        Student s4 = new Student("Conor Healy", new LocalDate(1990, 10, 10), "1455400030");
        Student s5 = new Student("Conan Murphy", new LocalDate(1988, 8, 8), "1455400040");
        Student s6 = new Student("Holly Joyce", new LocalDate(1982, 6, 5), "1455400050");

        //Initializing 3 Modules
        ArrayList<Student> CSITStudents = new ArrayList<Student>();
        CSITStudents.add(s1);
        CSITStudents.add(s2);
        Module SoftwareEngineering = new Module("SoftwareEngineering", "CT101", CSITStudents);
        Module MachineLearning = new Module("MachineLearning", "CT404", CSITStudents);

        ArrayList<Student> LawStudents = new ArrayList<Student>();
        LawStudents.add(s3);
        LawStudents.add(s4);
        Module CorporateLaw = new Module("CorporateLaw", "LW201", LawStudents);
        Module PatentResearch = new Module("PatentResearch", "LW202", LawStudents);

        ArrayList<Student> ArtsStudents = new ArrayList<Student>();
        ArtsStudents.add(s5);
        ArtsStudents.add(s6);
        Module History = new Module("History", "AR027", ArtsStudents);
        Module French = new Module("French", "AR056", ArtsStudents);

        // Making the Module ArrayLists for the courses
        ArrayList<Module> csitModules = new ArrayList<Module>();
        csitModules.add(SoftwareEngineering);
        csitModules.add(MachineLearning);

        ArrayList<Module> lawModules = new ArrayList<Module>();
        lawModules.add(CorporateLaw);
        lawModules.add(PatentResearch);

        ArrayList<Module> artsModules = new ArrayList<Module>();
        artsModules.add(History);
        artsModules.add(French);

        // Initailizing the Courses
        Course CSIT = new Course("ComputerScience and IT", csitModules, new DateTime(2017, 8, 12, 10, 0, 0, 0), new DateTime(2017, 12, 15, 16, 0, 0, 0));
        Course Law = new Course("Law", lawModules, new DateTime(2017, 8, 12, 12, 0, 0, 0), new DateTime(2017, 12, 15, 16, 0, 0, 0));
        Course Arts = new Course("Arts", artsModules, new DateTime(2017, 8, 12, 9, 0, 0, 0), new DateTime(2017, 12, 15, 16, 0, 0, 0));

        //printing out the information
        ArrayList<Student> allStudents = new ArrayList<Student>();
        allStudents.add(s1);
        allStudents.add(s2);
        allStudents.add(s3);
        allStudents.add(s4);
        allStudents.add(s5);
        allStudents.add(s6);

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(CSIT);
        courses.add(Law);
        courses.add(Arts);

        for (int i = 0; i < allStudents.size(); i++) {
            Student temp = allStudents.get(i);
            System.out.println("Student name: " + temp.getName());
            System.out.println("Student ID: " + temp.getID());

            for (int j = 0; j < temp.getModules().size(); j++) {
                System.out.println("Moduel name: " + temp.getModules().get(j).getName() + " - ID: " + temp.getModules().get(j).getID());
            }
            System.out.println("Course Name : " + temp.getModules().get(0).getCourse().getName() + "\n");
        }

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertTrue(true);
    }

}

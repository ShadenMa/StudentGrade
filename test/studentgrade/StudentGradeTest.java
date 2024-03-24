package studentgrade;

import junit.framework.TestCase;


/* JUnit 5.6.0 */

public class StudentGradeTest extends TestCase {
    
       public StudentGradeTest(String testName) {
        super(testName);
    }
       
    public void test_behaviour_A() {
        System.out.println("getGrade A");
        String expResult = "A";
        assertEquals(expResult, StudentGrade.getGrade(90));
        assertEquals(expResult, StudentGrade.getGrade(95));
        assertEquals(expResult, StudentGrade.getGrade(100));
    }

   public void test_behaviour_B() {
         System.out.println("getGrade B");
        String expResult = "B";
        assertEquals("B", StudentGrade.getGrade(89));
        assertEquals("B", StudentGrade.getGrade(85));
        assertEquals("B", StudentGrade.getGrade(80));
    }
    

    public void test_behaviour_F() {
         System.out.println("getGrade F");
        String expResult = "F";
        assertEquals("F", StudentGrade.getGrade(79));
        assertEquals("F", StudentGrade.getGrade(50));
        assertEquals("F", StudentGrade.getGrade(0));
    }
}

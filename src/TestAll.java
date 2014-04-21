import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * TestSuite that runs all the sample tests
 * 4th Commit
 */
public class TestAll {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite() {
        TestSuite suite = new TestSuite("All JUnit Tests");
        suite.addTestSuite(TestMoney.class);
        return suite;
    }
}
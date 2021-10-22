import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class FirstTest implements ITestListener {

    @Test
    public void firstTest(){
        Assert.assertEquals(System.getProperty("testsResults"), "passed");
    }

    @Test
    public void secondTest(){
        Assert.assertEquals(System.getProperty("testsResults"), "passed");
    }

    @Test
    public void thirdTest(){
        Assert.assertEquals(System.getProperty("testsResults"), "passed");
    }
    @Test
    public void forthTest(){
        Assert.assertEquals(System.getProperty("testsResults"), "passed");
    }

    @Test
    public void fivethTest() {
        Assert.assertEquals(System.getProperty("testsResults"), "passed");
    }
}

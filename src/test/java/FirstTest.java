import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void firstTest(){
        Assert.assertEquals(System.getProperty("testsResults"), "passed");
    }

    @Test
    public void secondTest(){
        Assert.assertEquals(System.getProperty("testsResults"), "passed");
    }
}

package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){calculator=new Calculator();}

    @Test
    public void testSquareRoot()
    {
        double x= 100.0;
        double expectedResult=10.0;
        double result=calculator.squareroot(x);
        Assert.assertEquals(expectedResult, result, 0);

    }

    @Test
    public void testFactorial()
    {
        double x=5.0;
        double expectedResult=120.0;
        double result=calculator.factorial(x);
        Assert.assertEquals(expectedResult, result, 0);

    }

    @Test
    public void testLogarithm()
    {
        double x=10.0;
        double expectedResult=2.302585092994046;
        double result=calculator.log(x);
        Assert.assertEquals(expectedResult, result, 0);

    }

    @Test
    public void testPower()
    {
        double x=5.0;
        double y=2.0;
        double expectedResult=25.0;
        double result=calculator.power(x,y);
        Assert.assertEquals(expectedResult, result, 0);

    }
}

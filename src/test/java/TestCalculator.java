import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    @Test
    public void monthlyPaymentTest(){
        //Arrange
        Calculator calculator =new Calculator();
        double excepted = 18_666;
        //Act
        int result = calculator.monthlyPayment();
        //Assert
        assertEquals(excepted, result);
    }

    @Test
    public void totalAmount(){
        //Arrange
        Calculator calculator = new Calculator();
        double excepted = 224_000;
        //Act
        int result = calculator.totalAmount();
        //Assert
        assertEquals(excepted, result);
    }

    @Test
    public void overPayment(){
        //Arrange
        Calculator calculator = new Calculator();
        double excepted = 24_000;
        //Act
        double result = calculator.overpayment();
        //Assert
        assertEquals(excepted, result);
    }
}
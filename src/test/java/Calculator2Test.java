import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Calculator2Test {

    @Test
    public void addition() {
        Calculator2 calculator = new Calculator2();
        assertEquals(15, calculator.addition(10, 5));

    }

    @Test
    void multiplication() {
        Calculator2 calculator = new Calculator2();
        assertEquals(35, calculator.multiplication(7, 5));
    }
}

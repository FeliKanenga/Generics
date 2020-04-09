import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

class GenericsTest {

    @Test
    public void printArrayContent() {
        Object[] number = {12, 324, 6, 7900};
        Assert.assertEquals(12,Generics.printArrayContent(number));
    }
}

public class genericClassTest {

    @Test
    public void setT() {
    }

    @Test
    public void getT() {
    }
}

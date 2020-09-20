import org.junit.Assert;
import org.junit.Test;
public class Usernametest {
    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        Username us = new Username();
        boolean result = us.userFirstName("Sumalika");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstNameWhenShort() {
        Username us = new Username();
        boolean result = us.userFirstName("Su");
        Assert.assertEquals(true, result);
    }
}

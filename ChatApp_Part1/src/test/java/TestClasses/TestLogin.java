package TestClasses;

import com.mycompany.chatapp_part1.Login;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestLogin
{
    @Test
    public void testUsername()
    {
        Login login = new Login();
        String expected = "user_";
        String actual = login.getUsername();
        
        assertEquals(expected, actual, "Expect the username to match user_.");
    }
    
    @Test
    public void testPassword()
    {
        Login login = new Login();
        String expected = "password";
        String actual = login.getPassword();
        
        assertEquals(expected, actual, "Expect the password to match password.");
    }
    
    @Test
    public void testCellPhoneNumber()
    {
        Login login = new Login();
        String expected = "0797862517";
        String actual = login.getCellPhoneNumber();
        
        assertEquals(expected, actual, "Expect the cellphone number to match 0797862517.");
    }
}
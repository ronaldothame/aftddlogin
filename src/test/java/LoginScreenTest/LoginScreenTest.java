package LoginScreenTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import LoginScreen.LoginScreen;

public class LoginScreenTest {

    private LoginScreen loginScreen;

    @BeforeEach
    public void setUp() {
        loginScreen = new LoginScreen();
    }

    @Test
    public void testLoginWithValidCredentials() {
        assertTrue(loginScreen.login("user", "password"));
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        assertFalse(loginScreen.login("user", "wrongpassword"));
    }

    @Test
    public void testLoginWithEmptyUsername() {
        assertFalse(loginScreen.login("", "password"));
    }

    @Test
    public void testLoginWithEmptyPassword() {
        assertFalse(loginScreen.login("user", ""));
    }
}

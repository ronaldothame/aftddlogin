package LoginScreen;

public class LoginScreen {

    private static final String VALID_USERNAME = "user";
    private static final String VALID_PASSWORD = "password";

    public boolean login(String username, String password) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            return false;
        }
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}

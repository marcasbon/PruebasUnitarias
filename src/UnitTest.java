import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UnitTest {

    @Test
    public void testHello() {
        assertEquals("Hello, Java", App.sayHello());
    }

    @Test
    public void testValidUsername() {
        User user = new User("validUser", "user@example.com", "password123");
        assertTrue(user.isValidUsername());
    }

    @Test
    public void testInvalidUsername() {
        User user = new User("usr", "user@example.com", "password123");
        assertFalse(user.isValidUsername());
    }

    @Test
    public void testValidEmail() {
        User user = new User("validUser", "user@example.com", "password123");
        assertTrue(user.isValidEmail());
    }

    @Test
    public void testInvalidEmail() {
        User user = new User("validUser", "user@com", "password123");
        assertFalse(user.isValidEmail());
    }

    @Test
    public void testValidPassword() {
        User user = new User("validUser", "user@example.com", "password123");
        assertTrue(user.isValidPassword());
    }

    @Test
    public void testInvalidPassword() {
        User user = new User("validUser", "user@example.com", "pass");
        assertFalse(user.isValidPassword());
    }

    @Test
    public void testSetUsername() {
        User user = new User("oldUsername", "user@example.com", "password123");
        user.setUsername("newUsername");
        assertEquals("newUsername", user.getUsername());
    }

    @Test
    public void testSetEmail() {
        User user = new User("validUser", "old@example.com", "password123");
        user.setEmail("new@example.com");
        assertEquals("new@example.com", user.getEmail());
    }

    @Test
    public void testSetPassword() {
        User user = new User("validUser", "user@example.com", "oldPassword");
        user.setPassword("newPassword123");
        assertEquals("newPassword123", user.getPassword());
    }
}

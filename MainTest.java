import static org.junit.Assert.*;

public class MainTest {

    Main main = new Main();

    @org.junit.Test
    public void mapWords() {
        assertTrue(main.mapWords("abc", "bcd"));
        assertFalse(main.mapWords("foo", "bar"));
        assertTrue(main.mapWords("bar", "foo"));
        assertTrue(main.mapWords("123", "321"));
    }
}
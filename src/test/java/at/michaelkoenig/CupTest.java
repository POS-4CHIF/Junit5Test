package at.michaelkoenig;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Michael König
 */
class CupTest {

    @Test
    void testObjectCreation() {
        Cup cup = new Cup("Water", 75);
        assertEquals("Water", cup.getLiquidType());
        assertEquals(75, cup.getPercentFull(), 0.001);
    }

    @Test
    void setLiquidTypeWithNull() {
        Cup cup = new Cup("Water", 80);
        cup.setLiquidType(null);
        assertNotNull(cup.getLiquidType());
    }

    @Test
    void getPercentFull() {
        Cup cup = new Cup("Water", 100);
    }

    @Test
    void setPercentFullFailed() {
        Cup cup = new Cup("Water", 80);
        assertThrows(IllegalArgumentException.class, () -> {
            cup.setPercentFull(-1);
        });
    }

    @Test
    void isEmpty() {
        Cup cup = new Cup("Water", 80);
        assertFalse(cup.isEmpty());
    }

    @Disabled("Disabled")
    @Test
    void testExternalLibrary() {
        fail();
    }

}
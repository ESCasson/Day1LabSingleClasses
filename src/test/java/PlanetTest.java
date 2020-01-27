import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    private Planet planet;

    @Before
    public void before() { planet = new Planet ( "Mars", 78664333);}

    @Test
    public void hasName(){
        assertEquals("Mars", planet.getName());
    }

    @Test
    public void hasSize(){
        assertEquals(78664333, planet.getSize());
    }

    @Test
    public void explodeReturn(){
        assertEquals("Boom! Mars has Exploded!", planet.explode());
    }

}

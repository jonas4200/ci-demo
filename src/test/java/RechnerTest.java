import org.example.Rechner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RechnerTest {

    @Test
    void addiereZweiZahlen(){
        assertEquals(5, new Rechner().addiere(2,3));
    }
}

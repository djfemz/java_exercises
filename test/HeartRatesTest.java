import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartRatesTest {

    @Test
    public void bmiTest(){
        HeartRates ashleysHeartRate = new HeartRates();
        assertNotNull(ashleysHeartRate);
    }
}

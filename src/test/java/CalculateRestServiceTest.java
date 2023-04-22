import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.CalculateRestService;

public class CalculateRestServiceTest {

    @ParameterizedTest
    /*@CsvSource({
            "2, 100000, 60000, 150000",
            "3, 10000, 3000, 20000"
    })*/
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void shouldCalcExact(int expected, int income, int expenses, int threshold) {
        CalculateRestService service = new CalculateRestService();

        //int expected = 2;
        int actual = service.calcRestService(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}

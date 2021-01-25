import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        int returnValues = Arrays.stream(numbers).filter(x -> x % 2 == 0).map(x -> x * x).reduce(0, (acc, elem) -> acc + elem);
        return returnValues;
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        int[] returnValues = Arrays.stream(numbers).filter(x -> x % 2 != 0).sorted().toArray();
        return returnValues;
    }
}

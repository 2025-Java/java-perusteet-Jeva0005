package viikko1;

import java.util.Arrays;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        // TODO
        int [] numbers = {a, b, c};
        Arrays.sort(numbers);
        
        String results = numbers[0] + "," + numbers[1] + "," + numbers[2];
        
        return results;
    }
}

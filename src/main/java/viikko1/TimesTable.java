package viikko1;


public class TimesTable {
    
    public static String table(int n) {
        // TODO

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i ++) {
            sb.append(n + " x " + i + " = " + (n * i) + "\n");
        }
             return sb.toString();
        
    }
}

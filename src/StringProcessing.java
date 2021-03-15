import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StringProcessing {
    private static final String REGEX_PROCESSING = "(\\d+\\[\\w+\\]{1}\\D?)+";
    private static final String ONE_FRAGMENT = "(^\\d+\\[{1}\\d+\\[{1}\\w+\\]{1}\\w+\\]{1}$)";
    private List<Integer> countList;
    private List<String> linetList;


    public static boolean isTrueLine(String text) {
        if (Pattern.matches(REGEX_PROCESSING, text)) {
            return true;
        } else {
            return false;
        }
    }

    public static void lineProcessing(String text) {
        List<String> allLines = new ArrayList<>();


    }
}

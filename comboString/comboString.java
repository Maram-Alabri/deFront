package comboString;

public class comboString {
    public String comboString(String a, String b) {
        String shortStr, longStr;
        if (a.length() < b.length()) {
            shortStr = a;
            longStr = b;
        } else {
            shortStr = b;
            longStr = a;
        }
        return shortStr + longStr + shortStr;

    }

}

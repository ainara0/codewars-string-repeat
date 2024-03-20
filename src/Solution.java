public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String output = "";
        for (int i = 0; i < repeat; i++) {
            output = output + string;
        }
        return output;
    }
}
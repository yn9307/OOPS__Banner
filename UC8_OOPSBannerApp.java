import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildCharacterPatterns();
        renderBanner("OOPS", patternMap);
    }

    public static Map<Character, String[]> buildCharacterPatterns() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    public static void renderBanner(String message, Map<Character, String[]> map) {

        int height = 5;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (int j = 0; j < message.length(); j++) {
                char ch = message.charAt(j);
                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}
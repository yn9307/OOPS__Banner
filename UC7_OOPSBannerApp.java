/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 */

public class UC7_OOPSBannerApp{

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Create and return array of CharacterPatternMap objects
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[] {

                new CharacterPatternMap('O', new String[] {
                        "  *****  ",
                        " **   ** ",
                        " **   ** ",
                        " **   ** ",
                        " **   ** ",
                        " **   ** ",
                        "  *****  "
                }),

                new CharacterPatternMap('P', new String[] {
                        " ******  ",
                        " **   ** ",
                        " **   ** ",
                        " ******  ",
                        " **      ",
                        " **      ",
                        " **      "
                }),

                new CharacterPatternMap('S', new String[] {
                        "  ****** ",
                        " **      ",
                        " **      ",
                        "  *****  ",
                        "       **",
                        "       **",
                        " ******  "
                }),

                new CharacterPatternMap(' ', new String[] {
                        "         ",
                        "         ",
                        "         ",
                        "         ",
                        "         ",
                        "         ",
                        "         "
                })
        };
    }

    // Retrieve pattern for a given character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {

        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    // Print the banner message
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        int height = 7; // Each character has 7 lines

        for (int i = 0; i < height; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, maps);

                if (pattern != null) {
                    lineBuilder.append(pattern[i]).append(" ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        printMessage("OOPS", maps);
    }
}
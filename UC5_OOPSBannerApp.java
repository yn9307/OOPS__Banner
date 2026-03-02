/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 */

public class UC5_OOPSBannerApp{

    public static void main(String[] args) {

        // Inline declaration and initialization of array
        String[] lines = {

            String.join("",
                    "  *****  ",
                    "  *****  ",
                    "  ****** ",
                    "  ****** "),

            String.join("",
                    " **   ** ",
                    " **   ** ",
                    " **   ** ",
                    " **      "),

            String.join("",
                    " **   ** ",
                    " **   ** ",
                    " **   ** ",
                    " **      "),

            String.join("",
                    " **   ** ",
                    " **   ** ",
                    " ******  ",
                    "  *****  "),

            String.join("",
                    " **   ** ",
                    " **   ** ",
                    " **      ",
                    "       **"),

            String.join("",
                    " **   ** ",
                    " **   ** ",
                    " **      ",
                    " **    **"),

            String.join("",
                    "  *****  ",
                    "  *****  ",
                    " **      ",
                    "  ****** ")
        };

        // Enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
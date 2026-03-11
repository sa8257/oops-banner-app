import java.util.HashMap;

public class oopsbannerapp {

    public static void main(String[] args) {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[]{
            " ******",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            "****** "
        });

        String word = "OOPS";

        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                System.out.print(map.get(ch)[i] + "  ");
            }
            System.out.println();
        }
    }
}
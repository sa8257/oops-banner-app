public class oopsbannerapp {

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
            " ******",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            "****** "
        });

        String[] o1 = O.getPattern();
        String[] o2 = O.getPattern();
        String[] p  = P.getPattern();
        String[] s  = S.getPattern();

        for(int i = 0; i < 7; i++) {
            System.out.println(o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i]);
        }
    }
} 
public class oopsbannerapp {

    static String[] O() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    static String[] P() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    static String[] S() {
        return new String[]{
            " ******",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            "****** "
        };
    }

    public static void main(String[] args) {

        String[] o1 = O();
        String[] o2 = O();
        String[] p  = P();
        String[] s  = S();

        for(int i = 0; i < 7; i++) {
            System.out.println(o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}
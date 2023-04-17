import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static enum Program {
        JAVA,
        PYTHON,
        GO
    }

    public static void switchEnum(Program p) {
        if (null == p) {
            System.out.println("program is null");
            return;
        }

        switch (p) {
            case JAVA:
                System.out.println("program is " + p.name());
                break;
            case PYTHON:
                System.out.println("program is " + p.name());
                break;
            case GO:
                System.out.println("program is " + p.name());
                break;
            default:
                System.out.println("No program");
        }
    }

    public static void instanceCheck(Object o) {
        if (null == o) {
            System.out.println("Instance is null.");
            return;
        }

        if (o instanceof String str && !str.isEmpty()) {
            System.out.println("String as : " + str);
        } else if (o instanceof Collection<?> col && !col.isEmpty()) {
            System.out.println("Collection as : " + col.toString());
        } else {
            System.out.println("Unkown : " + o.toString());
        }

    }

    public static String textBlock() {
        return """
               Here is the text block with format
               "this is in the text".
               """;
    }

    public static void main(String[] args) {
        switchEnum(Program.JAVA);
        switchEnum(Program.GO);
        switchEnum(null);

        instanceCheck("Hello instance");
        instanceCheck(Arrays.asList(new String[]{"aaa", "bbb"}));
        instanceCheck(null);

        System.out.println(textBlock());
    }
}


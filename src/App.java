import lib.kh.studycore;

public class App extends studycore {
    public static void main(String[] args) throws Exception {

        asdf = 1;//값이 2면 시스템 오류 발생하므로 1로 수정함

        System.out.println("Hello, World!");

        String a = "1";

        System.out.println((a));
        a = "2";
        int b = toInteger(a);
        a = "3";
        double c = toDouble(a);
        c = 4.1234;
        System.out.println((c));
        System.out.println(toString(19));

        int d = toInteger(c);

        System.out.println((b));
        System.out.println((c));
        System.out.println((d));

    }
}

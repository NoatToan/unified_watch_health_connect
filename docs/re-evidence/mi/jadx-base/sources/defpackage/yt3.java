package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class yt3 {
    public static int a(int i) {
        return Character.digit(i, 16);
    }

    public static boolean b(char c, char c2, boolean z) {
        if (z) {
            return Character.toLowerCase(c) == Character.toLowerCase(c2);
        }
        return c == c2;
    }

    public static boolean c(char c) {
        return d(c);
    }

    public static boolean d(int i) {
        return Character.isWhitespace(i) || Character.isSpaceChar(i) || i == 65279 || i == 8234 || i == 0;
    }

    public static boolean e(Object obj) {
        return (obj instanceof Character) || obj.getClass() == Character.TYPE;
    }

    public static boolean f(char c) {
        return '/' == c || '\\' == c;
    }

    public static boolean g(char c) {
        return h(c) || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
    }

    public static boolean h(char c) {
        return c >= '0' && c <= '9';
    }

    public static String i(char c) {
        return rb.a(c);
    }
}

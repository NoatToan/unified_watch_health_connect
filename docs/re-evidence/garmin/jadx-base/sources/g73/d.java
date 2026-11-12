package g73;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static boolean a(int i14, CharSequence charSequence) {
        if (i14 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i14);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static int b(char c14, int i14, int i15, CharSequence charSequence) {
        while (i14 < i15) {
            if (charSequence.charAt(i14) != c14) {
                return i14;
            }
            i14++;
        }
        return i15;
    }

    public static int c(int i14, int i15, CharSequence charSequence) {
        while (i14 < i15) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i14;
            }
            i14++;
        }
        return i15;
    }
}

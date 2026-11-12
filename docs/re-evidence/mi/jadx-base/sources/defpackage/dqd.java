package defpackage;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class dqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f15812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f15813b;
    public static final d c;
    public static final c d;
    public static final b e;

    public static class b implements h {
        public b() {
        }

        @Override // dqd.h
        public void a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '\f') {
                        appendable.append("\\f");
                    } else if (cCharAt == '\r') {
                        appendable.append("\\r");
                    } else if (cCharAt == '\"') {
                        appendable.append("\\\"");
                    } else if (cCharAt == '/') {
                        appendable.append("\\/");
                    } else if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                appendable.append("\\b");
                                break;
                            case '\t':
                                appendable.append("\\t");
                                break;
                            case '\n':
                                appendable.append("\\n");
                                break;
                            default:
                                if ((cCharAt < 0 || cCharAt > 31) && ((cCharAt < 127 || cCharAt > 159) && (cCharAt < 8192 || cCharAt > 8447))) {
                                    appendable.append(cCharAt);
                                } else {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\f') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\b') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt(cCharAt & 15));
                                }
                                break;
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Error");
            }
        }
    }

    public static class c implements h {
        public c() {
        }

        @Override // dqd.h
        public void a(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '\f') {
                        appendable.append("\\f");
                    } else if (cCharAt == '\r') {
                        appendable.append("\\r");
                    } else if (cCharAt == '\"') {
                        appendable.append("\\\"");
                    } else if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                appendable.append("\\b");
                                break;
                            case '\t':
                                appendable.append("\\t");
                                break;
                            case '\n':
                                appendable.append("\\n");
                                break;
                            default:
                                if ((cCharAt < 0 || cCharAt > 31) && ((cCharAt < 127 || cCharAt > 159) && (cCharAt < 8192 || cCharAt > 8447))) {
                                    appendable.append(cCharAt);
                                } else {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\f') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> '\b') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((cCharAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt(cCharAt & 15));
                                }
                                break;
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Exception");
            }
        }
    }

    public static class d implements g {
        public d() {
        }

        @Override // dqd.g
        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char cCharAt = str.charAt(0);
            if (dqd.c(cCharAt) || dqd.f(cCharAt)) {
                return true;
            }
            for (int i = 1; i < length; i++) {
                char cCharAt2 = str.charAt(i);
                if (dqd.e(cCharAt2) || dqd.f(cCharAt2)) {
                    return true;
                }
            }
            if (dqd.a(str)) {
                return true;
            }
            char cCharAt3 = str.charAt(0);
            if ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '-') {
                int i2 = 1;
                while (i2 < length) {
                    cCharAt3 = str.charAt(i2);
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
                if (cCharAt3 == '.') {
                    i2++;
                }
                while (i2 < length) {
                    cCharAt3 = str.charAt(i2);
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
                if (cCharAt3 == 'E' || cCharAt3 == 'e') {
                    int i3 = i2 + 1;
                    if (i3 == length) {
                        return false;
                    }
                    char cCharAt4 = str.charAt(i3);
                    if (cCharAt4 == '+' || cCharAt4 == '-') {
                        i2 += 2;
                        str.charAt(i2);
                    } else {
                        i2 = i3;
                    }
                }
                if (i2 == length) {
                    return false;
                }
                while (i2 < length) {
                    char cCharAt5 = str.charAt(i2);
                    if (cCharAt5 < '0' || cCharAt5 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class e implements g {
        public e() {
        }

        @Override // dqd.g
        public boolean a(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char cCharAt = str.charAt(0);
            if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-') {
                return true;
            }
            for (int i = 0; i < length; i++) {
                char cCharAt2 = str.charAt(i);
                if (dqd.b(cCharAt2) || dqd.c(cCharAt2) || dqd.d(cCharAt2) || dqd.f(cCharAt2)) {
                    return true;
                }
            }
            return dqd.a(str);
        }
    }

    public static class f implements g {
        public f() {
        }

        @Override // dqd.g
        public boolean a(String str) {
            return true;
        }
    }

    public interface g {
        boolean a(String str);
    }

    public interface h {
        void a(String str, Appendable appendable);
    }

    static {
        f15812a = new e();
        f15813b = new f();
        c = new d();
        d = new c();
        e = new b();
    }

    public static boolean a(String str) {
        if (str.length() < 3) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'n') {
            return str.equals(AbstractJsonLexerKt.NULL);
        }
        if (cCharAt == 't') {
            return str.equals("true");
        }
        if (cCharAt == 'f') {
            return str.equals("false");
        }
        if (cCharAt == 'N') {
            return str.equals("NaN");
        }
        return false;
    }

    public static boolean b(char c2) {
        return c2 == '\r' || c2 == '\n' || c2 == '\t' || c2 == ' ';
    }

    public static boolean c(char c2) {
        return c2 == '{' || c2 == '[' || c2 == ',' || c2 == '}' || c2 == ']' || c2 == ':' || c2 == '\'' || c2 == '\"';
    }

    public static boolean d(char c2) {
        return c2 == '\b' || c2 == '\f' || c2 == '\n';
    }

    public static boolean e(char c2) {
        return c2 == '}' || c2 == ']' || c2 == ',' || c2 == ':';
    }

    public static boolean f(char c2) {
        return (c2 >= 0 && c2 <= 31) || (c2 >= 127 && c2 <= 159) || (c2 >= 8192 && c2 <= 8447);
    }
}

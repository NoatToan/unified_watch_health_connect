package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class ptd {
    public static final ptd e = new ptd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ptd f30746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30747b;
    public final String c;
    public final int d;

    public ptd() {
        this.f30746a = null;
        this.c = "";
        this.d = -1;
        this.f30747b = "";
    }

    public static void a(StringBuilder sb, char c) {
        if (c == '0') {
            c = '~';
        } else if (c == '1') {
            c = '/';
        } else {
            sb.append('~');
        }
        sb.append(c);
    }

    public static final int b(String str) {
        int length = str.length();
        if (length == 0 || length > 10) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt <= '0') {
            return (length == 1 && cCharAt == '0') ? 0 : -1;
        }
        if (cCharAt > '9') {
            return -1;
        }
        for (int i = 1; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return -1;
            }
        }
        if (length != 10 || n2h.l(str) <= 2147483647L) {
            return n2h.j(str);
        }
        return -1;
    }

    public static ptd c(String str, int i) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(Math.max(16, length));
        if (i > 2) {
            sb.append((CharSequence) str, 1, i - 1);
        }
        int i2 = i + 1;
        a(sb, str.charAt(i));
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '/') {
                return new ptd(str, sb.toString(), d(str.substring(i2)));
            }
            int i3 = i2 + 1;
            if (cCharAt != '~' || i3 >= length) {
                sb.append(cCharAt);
                i2 = i3;
            } else {
                i2 += 2;
                a(sb, str.charAt(i3));
            }
        }
        return new ptd(str, sb.toString(), e);
    }

    public static ptd d(String str) {
        int length = str.length();
        int i = 1;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/') {
                return new ptd(str, str.substring(1, i), d(str.substring(i)));
            }
            i++;
            if (cCharAt == '~' && i < length) {
                return c(str, i);
            }
        }
        return new ptd(str, str.substring(1), e);
    }

    public static ptd e(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return e;
        }
        if (str.charAt(0) == '/') {
            return d(str);
        }
        throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ptd)) {
            return this.f30747b.equals(((ptd) obj).f30747b);
        }
        return false;
    }

    public ptd f(int i) {
        if (i != this.d || i < 0) {
            return null;
        }
        return this.f30746a;
    }

    public ptd g(String str) {
        if (this.f30746a == null || !this.c.equals(str)) {
            return null;
        }
        return this.f30746a;
    }

    public boolean h() {
        return this.f30746a == null;
    }

    public int hashCode() {
        return this.f30747b.hashCode();
    }

    public String toString() {
        return this.f30747b;
    }

    public ptd(String str, String str2, ptd ptdVar) {
        this.f30747b = str;
        this.f30746a = ptdVar;
        this.c = str2;
        this.d = b(str2);
    }
}

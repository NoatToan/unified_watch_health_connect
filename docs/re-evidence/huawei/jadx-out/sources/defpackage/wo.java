package defpackage;

import com.fasterxml.jackson.core.JsonStreamContext;

/* JADX INFO: loaded from: classes21.dex */
public class wo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final wo f52253a = new wo();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f52254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f52255c;
    protected final String d;
    protected final wo e;

    protected wo() {
        this.e = null;
        this.d = "";
        this.f52254b = -1;
        this.f52255c = "";
    }

    protected wo(String str, String str2, wo woVar) {
        this.f52255c = str;
        this.e = woVar;
        this.d = str2;
        this.f52254b = d(str2);
    }

    protected wo(String str, String str2, int i, wo woVar) {
        this.f52255c = str;
        this.e = woVar;
        this.d = str2;
        this.f52254b = i;
    }

    public static wo c(String str) throws IllegalArgumentException {
        if (str == null || str.length() == 0) {
            return f52253a;
        }
        if (str.charAt(0) != '/') {
            throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + str + "\"");
        }
        return a(str);
    }

    public static wo b(JsonStreamContext jsonStreamContext, boolean z) {
        if (jsonStreamContext == null) {
            return f52253a;
        }
        if (!jsonStreamContext.hasPathSegment() && (!z || !jsonStreamContext.inRoot() || !jsonStreamContext.hasCurrentIndex())) {
            jsonStreamContext = jsonStreamContext.getParent();
        }
        wo woVar = null;
        while (jsonStreamContext != null) {
            if (jsonStreamContext.inObject()) {
                String currentName = jsonStreamContext.getCurrentName();
                if (currentName == null) {
                    currentName = "";
                }
                woVar = new wo(c(woVar, currentName), currentName, woVar);
            } else if (jsonStreamContext.inArray() || z) {
                int currentIndex = jsonStreamContext.getCurrentIndex();
                String strValueOf = String.valueOf(currentIndex);
                woVar = new wo(c(woVar, strValueOf), strValueOf, currentIndex, woVar);
            }
            jsonStreamContext = jsonStreamContext.getParent();
        }
        return woVar == null ? f52253a : woVar;
    }

    private static String c(wo woVar, String str) {
        if (woVar == null) {
            StringBuilder sb = new StringBuilder(str.length() + 1);
            sb.append('/');
            c(sb, str);
            return sb.toString();
        }
        String str2 = woVar.f52255c;
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + str2.length());
        sb2.append('/');
        c(sb2, str);
        sb2.append(str2);
        return sb2.toString();
    }

    private static void c(StringBuilder sb, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/') {
                sb.append("~1");
            } else if (cCharAt == '~') {
                sb.append("~0");
            } else {
                sb.append(cCharAt);
            }
        }
    }

    public boolean b() {
        return this.e == null;
    }

    public String d() {
        return this.d;
    }

    public int c() {
        return this.f52254b;
    }

    public wo e() {
        return this.e;
    }

    public String toString() {
        return this.f52255c;
    }

    public int hashCode() {
        return this.f52255c.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof wo)) {
            return this.f52255c.equals(((wo) obj).f52255c);
        }
        return false;
    }

    private static final int d(String str) {
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
        if (length != 10 || xd.a(str) <= 2147483647L) {
            return xd.b(str);
        }
        return -1;
    }

    protected static wo a(String str) {
        int length = str.length();
        int i = 1;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '/') {
                return new wo(str, str.substring(1, i), a(str.substring(i)));
            }
            i++;
            if (cCharAt == '~' && i < length) {
                return d(str, i);
            }
        }
        return new wo(str, str.substring(1), f52253a);
    }

    protected static wo d(String str, int i) {
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
                return new wo(str, sb.toString(), a(str.substring(i2)));
            }
            int i3 = i2 + 1;
            if (cCharAt == '~' && i3 < length) {
                i2 += 2;
                a(sb, str.charAt(i3));
            } else {
                sb.append(cCharAt);
                i2 = i3;
            }
        }
        return new wo(str, sb.toString(), f52253a);
    }

    private static void a(StringBuilder sb, char c2) {
        if (c2 == '0') {
            c2 = '~';
        } else if (c2 == '1') {
            c2 = '/';
        } else {
            sb.append('~');
        }
        sb.append(c2);
    }
}

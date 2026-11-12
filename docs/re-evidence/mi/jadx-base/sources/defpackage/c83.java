package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class c83 {
    public static Pattern c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5038b;

    public c83(int i, int i2) {
        this.f5037a = i;
        this.f5038b = i2;
    }

    public static c83 b(int i) {
        b6i.b(i >= 0);
        return new c83(i, Integer.MAX_VALUE);
    }

    public static c83 c(String str) throws IllegalArgumentException {
        if (str == null) {
            return null;
        }
        if (c == null) {
            c = Pattern.compile("[-/ ]");
        }
        try {
            String[] strArrSplit = c.split(str);
            b6i.b(strArrSplit.length == 4);
            b6i.b(strArrSplit[0].equals("bytes"));
            int i = Integer.parseInt(strArrSplit[1]);
            int i2 = Integer.parseInt(strArrSplit[2]);
            int i3 = Integer.parseInt(strArrSplit[3]);
            b6i.b(i2 > i);
            b6i.b(i3 > i2);
            return i2 < i3 - 1 ? new c83(i, i2) : new c83(i, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", str), e);
        }
    }

    public static c83 e(int i) {
        b6i.b(i > 0);
        return new c83(0, i);
    }

    public static String f(int i) {
        return i == Integer.MAX_VALUE ? "" : Integer.toString(i);
    }

    public boolean a(c83 c83Var) {
        return c83Var != null && this.f5037a <= c83Var.f5037a && this.f5038b >= c83Var.f5038b;
    }

    public String d() {
        return String.format(null, "bytes=%s-%s", f(this.f5037a), f(this.f5038b));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c83)) {
            return false;
        }
        c83 c83Var = (c83) obj;
        return this.f5037a == c83Var.f5037a && this.f5038b == c83Var.f5038b;
    }

    public int hashCode() {
        return ilb.a(this.f5037a, this.f5038b);
    }

    public String toString() {
        return String.format(null, "%s-%s", f(this.f5037a), f(this.f5038b));
    }
}

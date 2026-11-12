package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class c6i {
    public static String a(int i, int i2, String str) {
        if (i < 0) {
            return qlo.c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return qlo.c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String b(int i, int i2, String str) {
        if (i < 0) {
            return qlo.c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return qlo.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return b(i, i3, "start index");
        }
        return (i2 < 0 || i2 > i3) ? b(i2, i3, "end index") : qlo.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(qlo.c(str, Integer.valueOf(i)));
        }
    }

    public static void g(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(qlo.c(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void h(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(qlo.c(str, Long.valueOf(j)));
        }
    }

    public static void i(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new IllegalArgumentException(qlo.c(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static void j(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(qlo.c(str, obj));
        }
    }

    public static void k(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(qlo.c(str, obj, obj2));
        }
    }

    public static void l(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalArgumentException(qlo.c(str, obj, obj2, obj3, obj4));
        }
    }

    public static int m(int i, int i2) {
        return n(i, i2, "index");
    }

    public static int n(int i, int i2, String str) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(a(i, i2, str));
        }
        return i;
    }

    public static <T> T o(T t) {
        t.getClass();
        return t;
    }

    public static <T> T p(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int q(int i, int i2) {
        return r(i, i2, "index");
    }

    public static int r(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(b(i, i2, str));
        }
        return i;
    }

    public static void s(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(c(i, i2, i3));
        }
    }

    public static void t(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void u(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void v(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(qlo.c(str, Integer.valueOf(i)));
        }
    }

    public static void w(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(qlo.c(str, obj));
        }
    }
}

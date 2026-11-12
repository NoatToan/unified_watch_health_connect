package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class mbq {
    public static int a(int i, int i2) {
        return ahd.d(c(i), c(i2));
    }

    public static int b(int i, int i2) {
        return (int) (f(i) / f(i2));
    }

    public static int c(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    public static int d(String str, int i) {
        c6i.o(str);
        long j = Long.parseLong(str, i);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 69);
        sb.append("Input ");
        sb.append(str);
        sb.append(" in base ");
        sb.append(i);
        sb.append(" is not in the range of an unsigned integer");
        throw new NumberFormatException(sb.toString());
    }

    public static int e(int i, int i2) {
        return (int) (f(i) % f(i2));
    }

    public static long f(int i) {
        return ((long) i) & 4294967295L;
    }

    public static String g(int i, int i2) {
        return Long.toString(((long) i) & 4294967295L, i2);
    }
}

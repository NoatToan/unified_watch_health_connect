package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class zmq {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("The validated expression is false");
        }
    }

    public static void b(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, Long.valueOf(j)));
        }
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T[] d(T[] tArr) {
        return (T[]) e(tArr, "The validated array contains null element at index: %d", new Object[0]);
    }

    public static <T> T[] e(T[] tArr, String str, Object... objArr) {
        h(tArr);
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == null) {
                throw new IllegalArgumentException(String.format(str, sj1.a(objArr, Integer.valueOf(i))));
            }
        }
        return tArr;
    }

    public static <T> T[] f(T[] tArr) {
        return (T[]) g(tArr, "The validated array is empty", new Object[0]);
    }

    public static <T> T[] g(T[] tArr, String str, Object... objArr) {
        if (tArr == null) {
            throw new NullPointerException(String.format(str, objArr));
        }
        if (tArr.length != 0) {
            return tArr;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static <T> T h(T t) {
        return (T) i(t, "The validated object is null", new Object[0]);
    }

    public static <T> T i(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.format(str, objArr));
    }
}

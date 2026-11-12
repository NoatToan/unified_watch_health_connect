package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class rk1 {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static <T> T e(T t) {
        t.getClass();
        return t;
    }

    public static <T> T f(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void g(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void h(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T i(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    public static <T> T j(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}

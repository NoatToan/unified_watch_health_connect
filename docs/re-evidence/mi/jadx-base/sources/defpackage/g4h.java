package defpackage;

import java.math.BigDecimal;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g4h {
    public static <T> T a(T t) {
        T t2 = (T) qj1.n(t);
        if (t2 == null) {
            return t instanceof Cloneable ? (T) bbk.p(t, "clone", new Object[0]) : (T) b(t);
        }
        return t2;
    }

    public static <T> T b(T t) {
        return (T) qwl.a(t);
    }

    public static <T extends Comparable<? super T>> int c(T t, T t2) {
        return t94.a(t, t2);
    }

    public static <T extends Comparable<? super T>> int d(T t, T t2, boolean z) {
        return t94.b(t, t2, z);
    }

    public static <T> T e(T t, T t2) {
        return t != null ? t : t2;
    }

    public static <T> T f(byte[] bArr) {
        return (T) qwl.b(bArr);
    }

    public static boolean g(Object obj, Object obj2) {
        return ((obj instanceof BigDecimal) && (obj2 instanceof BigDecimal)) ? s2h.m((BigDecimal) obj, (BigDecimal) obj2) : Objects.equals(obj, obj2);
    }

    public static boolean h(Object obj, Object obj2) {
        return g(obj, obj2);
    }

    public static boolean i(Object obj) {
        return obj == null || obj.equals(null);
    }

    public static <T> byte[] j(T t) {
        return qwl.c(t);
    }
}

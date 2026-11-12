package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d0i {
    public static <T> T[] a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    public static <T> T[] b(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    public static <K, V> Map<K, V> c(int i) {
        return x84.D(i);
    }

    public static <E> Set<E> d(int i) {
        return y84.m(i);
    }

    public static <K, V> Map<K, V> e(int i) {
        return a94.h0(i);
    }

    public static <E> Set<E> f(int i) {
        return b94.U(i);
    }

    public static <E> Set<E> g() {
        return y84.j();
    }

    public static <K, V> Map<K, V> h() {
        return x84.y();
    }
}

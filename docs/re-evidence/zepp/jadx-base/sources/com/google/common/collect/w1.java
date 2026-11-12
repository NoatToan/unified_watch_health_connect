package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
final class w1 {
    private w1() {
    }

    public static <T> T[] a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    public static <T> T[] b(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    public static <K, V> Map<K, V> c(int i) {
        return v.m(i);
    }

    public static <E> Set<E> d(int i) {
        return w.i(i);
    }

    public static <K, V> Map<K, V> e(int i) {
        return x.J(i);
    }

    public static <E> Set<E> f(int i) {
        return y.D(i);
    }

    public static <E> Set<E> g() {
        return w.f();
    }

    public static <K, V> Map<K, V> h() {
        return v.h();
    }

    public static int i(int i) {
        return i;
    }

    public static int j(int i) {
        return i;
    }

    public static MapMaker k(MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }
}

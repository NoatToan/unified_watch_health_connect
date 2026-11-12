package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class Platform {
    private Platform() {
    }

    public static <T> T[] copy(Object[] objArr, int i14, int i15, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i14, i15, tArr.getClass());
    }

    public static <E extends Enum<E>> Class<E> getDeclaringClassOrObjectForJ2cl(E e4) {
        return e4.getDeclaringClass();
    }

    public static <T> T[] newArray(T[] tArr, int i14) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i14);
    }

    public static <K, V> Map<K, V> newHashMapWithExpectedSize(int i14) {
        return CompactHashMap.createWithExpectedSize(i14);
    }

    public static <E> Set<E> newHashSetWithExpectedSize(int i14) {
        return CompactHashSet.createWithExpectedSize(i14);
    }

    public static <K, V> Map<K, V> newLinkedHashMapWithExpectedSize(int i14) {
        return CompactLinkedHashMap.createWithExpectedSize(i14);
    }

    public static <E> Set<E> newLinkedHashSetWithExpectedSize(int i14) {
        return CompactLinkedHashSet.createWithExpectedSize(i14);
    }

    public static <E> Set<E> preservesInsertionOrderOnAddsSet() {
        return CompactHashSet.create();
    }

    public static <K, V> Map<K, V> preservesInsertionOrderOnPutsMap() {
        return CompactHashMap.create();
    }

    public static <K, V> Map<K, V> preservesInsertionOrderOnPutsMapWithExpectedSize(int i14) {
        return Maps.newLinkedHashMapWithExpectedSize(i14);
    }

    public static int reduceExponentIfGwt(int i14) {
        return i14;
    }

    public static int reduceIterationsIfGwt(int i14) {
        return i14;
    }

    @J2ktIncompatible
    public static MapMaker tryWeakKeys(MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }
}

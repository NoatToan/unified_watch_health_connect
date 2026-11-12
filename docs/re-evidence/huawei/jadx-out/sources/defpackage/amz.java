package defpackage;

import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.MapMaker;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class amz {
    public static <K, V> Map<K, V> a(int i) {
        return CompactHashMap.d(i);
    }

    public static <K, V> Map<K, V> d(int i) {
        return all.j(i);
    }

    public static <E> Set<E> b(int i) {
        return alj.b(i);
    }

    public static <E> Set<E> e(int i) {
        return alh.d(i);
    }

    public static <K, V> Map<K, V> a() {
        return CompactHashMap.b();
    }

    static <E> Set<E> d() {
        return alj.a();
    }

    static <T> T[] e(T[] tArr, int i) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static <T> T[] d(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    public static MapMaker b(MapMaker mapMaker) {
        return mapMaker.f();
    }
}

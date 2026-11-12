package defpackage;

import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x1a<K, V> extends r1a<K, V> implements SortedMap<K, V> {
    public static int f(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }
}

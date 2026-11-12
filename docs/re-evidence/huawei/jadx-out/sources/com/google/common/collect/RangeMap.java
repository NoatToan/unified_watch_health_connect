package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import defpackage.amv;
import java.lang.Comparable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@DoNotMock("Use ImmutableRangeMap or TreeRangeMap")
@ElementTypesAreNonnullByDefault
public interface RangeMap<K extends Comparable, V> {
    Map<amv<K>, V> asDescendingMapOfRanges();

    Map<amv<K>, V> asMapOfRanges();

    void clear();

    boolean equals(@CheckForNull Object obj);

    @CheckForNull
    V get(K k);

    @CheckForNull
    Map.Entry<amv<K>, V> getEntry(K k);

    int hashCode();

    void put(amv<K> amvVar, V v);

    void putAll(RangeMap<K, ? extends V> rangeMap);

    void putCoalescing(amv<K> amvVar, V v);

    void remove(amv<K> amvVar);

    amv<K> span();

    RangeMap<K, V> subRangeMap(amv<K> amvVar);

    String toString();
}

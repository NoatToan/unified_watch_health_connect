package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.lang.Comparable;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
@DoNotMock("Use ImmutableRangeMap or TreeRangeMap")
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public interface RangeMap<K extends Comparable, V> {
    Map<Range<K>, V> asDescendingMapOfRanges();

    Map<Range<K>, V> asMapOfRanges();

    void clear();

    boolean equals(Object obj);

    V get(K k14);

    Map.Entry<Range<K>, V> getEntry(K k14);

    int hashCode();

    void put(Range<K> range, V v14);

    void putAll(RangeMap<K, ? extends V> rangeMap);

    void putCoalescing(Range<K> range, V v14);

    void remove(Range<K> range);

    Range<K> span();

    RangeMap<K, V> subRangeMap(Range<K> range);

    String toString();
}

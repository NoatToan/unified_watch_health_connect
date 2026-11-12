package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes14.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    public class StandardDescendingMap extends Maps.DescendingMap<K, V> {
        public StandardDescendingMap() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public Iterator<Map.Entry<K, V>> entryIterator() {
            return new Iterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.1
                private Map.Entry<K, V> nextOrNull;
                private Map.Entry<K, V> toRemove = null;

                {
                    this.nextOrNull = StandardDescendingMap.this.forward().lastEntry();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.nextOrNull != null;
                }

                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    Map.Entry<K, V> entry = this.nextOrNull;
                    if (entry == null) {
                        c22.t.g();
                        return null;
                    }
                    this.toRemove = entry;
                    this.nextOrNull = StandardDescendingMap.this.forward().lowerEntry(this.nextOrNull.getKey());
                    return entry;
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (this.toRemove == null) {
                        vb.h.z("no calls to next() since the last call to remove()");
                    } else {
                        StandardDescendingMap.this.forward().remove(this.toRemove.getKey());
                        this.toRemove = null;
                    }
                }
            };
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        public NavigableMap<K, V> forward() {
            return ForwardingNavigableMap.this;
        }
    }

    public class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
        public StandardNavigableKeySet() {
            super(ForwardingNavigableMap.this);
        }
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k14) {
        return delegate().ceilingEntry(k14);
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(@ParametricNullness K k14) {
        return delegate().ceilingKey(k14);
    }

    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract NavigableMap<K, V> delegate();

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return delegate().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return delegate().descendingMap();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(@ParametricNullness K k14) {
        return delegate().floorEntry(k14);
    }

    @Override // java.util.NavigableMap
    public K floorKey(@ParametricNullness K k14) {
        return delegate().floorKey(k14);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@ParametricNullness K k14, boolean z14) {
        return delegate().headMap(k14, z14);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(@ParametricNullness K k14) {
        return delegate().higherEntry(k14);
    }

    @Override // java.util.NavigableMap
    public K higherKey(@ParametricNullness K k14) {
        return delegate().higherKey(k14);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(@ParametricNullness K k14) {
        return delegate().lowerEntry(k14);
    }

    @Override // java.util.NavigableMap
    public K lowerKey(@ParametricNullness K k14) {
        return delegate().lowerKey(k14);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return delegate().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    public Map.Entry<K, V> standardCeilingEntry(@ParametricNullness K k14) {
        return tailMap(k14, true).firstEntry();
    }

    public K standardCeilingKey(@ParametricNullness K k14) {
        return (K) Maps.keyOrNull(ceilingEntry(k14));
    }

    public NavigableSet<K> standardDescendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public Map.Entry<K, V> standardFirstEntry() {
        return (Map.Entry) Iterables.getFirst(entrySet(), null);
    }

    public K standardFirstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        c22.t.g();
        return null;
    }

    public Map.Entry<K, V> standardFloorEntry(@ParametricNullness K k14) {
        return headMap(k14, true).lastEntry();
    }

    public K standardFloorKey(@ParametricNullness K k14) {
        return (K) Maps.keyOrNull(floorEntry(k14));
    }

    public SortedMap<K, V> standardHeadMap(@ParametricNullness K k14) {
        return headMap(k14, false);
    }

    public Map.Entry<K, V> standardHigherEntry(@ParametricNullness K k14) {
        return tailMap(k14, false).firstEntry();
    }

    public K standardHigherKey(@ParametricNullness K k14) {
        return (K) Maps.keyOrNull(higherEntry(k14));
    }

    public Map.Entry<K, V> standardLastEntry() {
        return (Map.Entry) Iterables.getFirst(descendingMap().entrySet(), null);
    }

    public K standardLastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        c22.t.g();
        return null;
    }

    public Map.Entry<K, V> standardLowerEntry(@ParametricNullness K k14) {
        return headMap(k14, false).lastEntry();
    }

    public K standardLowerKey(@ParametricNullness K k14) {
        return (K) Maps.keyOrNull(lowerEntry(k14));
    }

    public Map.Entry<K, V> standardPollFirstEntry() {
        return (Map.Entry) Iterators.pollNext(entrySet().iterator());
    }

    public Map.Entry<K, V> standardPollLastEntry() {
        return (Map.Entry) Iterators.pollNext(descendingMap().entrySet().iterator());
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    public SortedMap<K, V> standardSubMap(@ParametricNullness K k14, @ParametricNullness K k15) {
        return subMap(k14, true, k15, false);
    }

    public SortedMap<K, V> standardTailMap(@ParametricNullness K k14) {
        return tailMap(k14, true);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@ParametricNullness K k14, boolean z14, @ParametricNullness K k15, boolean z15) {
        return delegate().subMap(k14, z14, k15, z15);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@ParametricNullness K k14, boolean z14) {
        return delegate().tailMap(k14, z14);
    }
}

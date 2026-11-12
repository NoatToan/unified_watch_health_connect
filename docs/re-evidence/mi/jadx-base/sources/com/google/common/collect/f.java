package com.google.common.collect;

import defpackage.epd;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f<K, V> extends s.l<K, V> implements NavigableMap<K, V> {

    public final class b extends s.h<K, V> {
        public b() {
        }

        @Override // com.google.common.collect.s.h
        public Iterator<Map.Entry<K, V>> g() {
            return f.this.b();
        }

        @Override // com.google.common.collect.s.h
        public NavigableMap<K, V> j() {
            return f.this;
        }
    }

    public abstract Iterator<Map.Entry<K, V>> b();

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return tailMap(k2, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k2) {
        return (K) s.m(ceilingEntry(k2));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return new b();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) epd.m(a(), null);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k2) {
        return headMap(k2, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k2) {
        return (K) s.m(floorEntry(k2));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(K k2) {
        return headMap(k2, false);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k2) {
        return tailMap(k2, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k2) {
        return (K) s.m(higherEntry(k2));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) epd.m(b(), null);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k2) {
        return headMap(k2, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k2) {
        return (K) s.m(lowerEntry(k2));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return new s.n(this);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) epd.q(a());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) epd.q(b());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(K k2, K k3) {
        return subMap(k2, true, k3, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k2) {
        return tailMap(k2, true);
    }
}

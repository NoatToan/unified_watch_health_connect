package com.google.common.collect;

import defpackage.amn;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract NavigableMap<K, V> delegate();

    protected ForwardingNavigableMap() {
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lowerEntry(@ParametricNullness K k) {
        return delegate().lowerEntry(k);
    }

    @CheckForNull
    protected Map.Entry<K, V> standardLowerEntry(@ParametricNullness K k) {
        return headMap(k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K lowerKey(@ParametricNullness K k) {
        return delegate().lowerKey(k);
    }

    @CheckForNull
    protected K standardLowerKey(@ParametricNullness K k) {
        return (K) Maps.d(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> floorEntry(@ParametricNullness K k) {
        return delegate().floorEntry(k);
    }

    @CheckForNull
    protected Map.Entry<K, V> standardFloorEntry(@ParametricNullness K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K floorKey(@ParametricNullness K k) {
        return delegate().floorKey(k);
    }

    @CheckForNull
    protected K standardFloorKey(@ParametricNullness K k) {
        return (K) Maps.d(floorEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k) {
        return delegate().ceilingEntry(k);
    }

    @CheckForNull
    protected Map.Entry<K, V> standardCeilingEntry(@ParametricNullness K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K ceilingKey(@ParametricNullness K k) {
        return delegate().ceilingKey(k);
    }

    @CheckForNull
    protected K standardCeilingKey(@ParametricNullness K k) {
        return (K) Maps.d(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> higherEntry(@ParametricNullness K k) {
        return delegate().higherEntry(k);
    }

    @CheckForNull
    protected Map.Entry<K, V> standardHigherEntry(@ParametricNullness K k) {
        return tailMap(k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public K higherKey(@ParametricNullness K k) {
        return delegate().higherKey(k);
    }

    @CheckForNull
    protected K standardHigherKey(@ParametricNullness K k) {
        return (K) Maps.d(higherEntry(k));
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> firstEntry() {
        return delegate().firstEntry();
    }

    @CheckForNull
    protected Map.Entry<K, V> standardFirstEntry() {
        return (Map.Entry) amn.a(entrySet(), (Object) null);
    }

    protected K standardFirstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry == null) {
            throw new NoSuchElementException();
        }
        return entryFirstEntry.getKey();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> lastEntry() {
        return delegate().lastEntry();
    }

    @CheckForNull
    protected Map.Entry<K, V> standardLastEntry() {
        return (Map.Entry) amn.a(descendingMap().entrySet(), (Object) null);
    }

    protected K standardLastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return entryLastEntry.getKey();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    @CheckForNull
    protected Map.Entry<K, V> standardPollFirstEntry() {
        return (Map.Entry) Iterators.g(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public Map.Entry<K, V> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    @CheckForNull
    protected Map.Entry<K, V> standardPollLastEntry() {
        return (Map.Entry) Iterators.g(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return delegate().descendingMap();
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return delegate().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return delegate().descendingKeySet();
    }

    protected NavigableSet<K> standardDescendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // com.google.common.collect.ForwardingSortedMap
    protected SortedMap<K, V> standardSubMap(@ParametricNullness K k, @ParametricNullness K k2) {
        return subMap(k, true, k2, false);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@ParametricNullness K k, boolean z, @ParametricNullness K k2, boolean z2) {
        return delegate().subMap(k, z, k2, z2);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@ParametricNullness K k, boolean z) {
        return delegate().headMap(k, z);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@ParametricNullness K k, boolean z) {
        return delegate().tailMap(k, z);
    }

    protected SortedMap<K, V> standardHeadMap(@ParametricNullness K k) {
        return headMap(k, false);
    }

    protected SortedMap<K, V> standardTailMap(@ParametricNullness K k) {
        return tailMap(k, true);
    }
}

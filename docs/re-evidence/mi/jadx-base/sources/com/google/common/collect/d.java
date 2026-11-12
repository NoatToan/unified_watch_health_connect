package com.google.common.collect;

import defpackage.c6i;
import defpackage.epd;
import defpackage.nag;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d<K, V> implements nag<K, V> {
    private transient Map<K, Collection<V>> asMap;
    private transient Collection<Map.Entry<K, V>> entries;
    private transient Set<K> keySet;
    private transient u<K> keys;
    private transient Collection<V> values;

    public class a extends t.c<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.t.c
        public nag<K, V> e() {
            return d.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return d.this.entryIterator();
        }
    }

    public class b extends d<K, V>.a implements Set<Map.Entry<K, V>> {
        public b(d dVar) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return i0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return i0.b(this);
        }
    }

    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return d.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return d.this.valueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d.this.size();
        }
    }

    @Override // defpackage.nag
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    @Override // defpackage.nag
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean containsValue(Object obj) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> createAsMap();

    public abstract Collection<Map.Entry<K, V>> createEntries();

    public abstract Set<K> createKeySet();

    public abstract u<K> createKeys();

    public abstract Collection<V> createValues();

    @Override // defpackage.nag
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionCreateEntries = createEntries();
        this.entries = collectionCreateEntries;
        return collectionCreateEntries;
    }

    public abstract Iterator<Map.Entry<K, V>> entryIterator();

    public boolean equals(Object obj) {
        return t.a(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // defpackage.nag
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // defpackage.nag
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.keySet = setCreateKeySet;
        return setCreateKeySet;
    }

    public u<K> keys() {
        u<K> uVar = this.keys;
        if (uVar != null) {
            return uVar;
        }
        u<K> uVarCreateKeys = createKeys();
        this.keys = uVarCreateKeys;
        return uVarCreateKeys;
    }

    @Override // defpackage.nag
    public boolean put(K k2, V v) {
        return get(k2).add(v);
    }

    public boolean putAll(K k2, Iterable<? extends V> iterable) {
        c6i.o(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k2).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && epd.a(get(k2), it);
    }

    @Override // defpackage.nag
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public Collection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        c6i.o(iterable);
        Collection<V> collectionRemoveAll = removeAll(k2);
        putAll(k2, iterable);
        return collectionRemoveAll;
    }

    public String toString() {
        return asMap().toString();
    }

    public Iterator<V> valueIterator() {
        return s.D(entries().iterator());
    }

    @Override // defpackage.nag
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.values = collectionCreateValues;
        return collectionCreateValues;
    }

    public boolean putAll(nag<? extends K, ? extends V> nagVar) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : nagVar.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }
}

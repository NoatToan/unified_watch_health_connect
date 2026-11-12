package com.google.common.collect;

import defpackage.epd;
import defpackage.m44;
import defpackage.pyp;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j<R, C, V> implements q0<R, C, V> {
    private transient Set<q0.a<R, C, V>> cellSet;
    private transient Collection<V> values;

    public class a extends pyp<q0.a<R, C, V>, V> {
        public a(j jVar, Iterator it) {
            super(it);
        }

        @Override // defpackage.pyp
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(q0.a<R, C, V> aVar) {
            return aVar.getValue();
        }
    }

    public class b extends AbstractSet<q0.a<R, C, V>> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof q0.a)) {
                return false;
            }
            q0.a aVar = (q0.a) obj;
            Map map = (Map) s.v(j.this.rowMap(), aVar.a());
            return map != null && m44.c(map.entrySet(), s.i(aVar.getColumnKey(), aVar.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<q0.a<R, C, V>> iterator() {
            return j.this.cellIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof q0.a)) {
                return false;
            }
            q0.a aVar = (q0.a) obj;
            Map map = (Map) s.v(j.this.rowMap(), aVar.a());
            return map != null && m44.d(map.entrySet(), s.i(aVar.getColumnKey(), aVar.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j.this.size();
        }
    }

    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            j.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return j.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return j.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return j.this.size();
        }
    }

    public abstract Iterator<q0.a<R, C, V>> cellIterator();

    @Override // com.google.common.collect.q0
    public Set<q0.a<R, C, V>> cellSet() {
        Set<q0.a<R, C, V>> set = this.cellSet;
        if (set != null) {
            return set;
        }
        Set<q0.a<R, C, V>> setCreateCellSet = createCellSet();
        this.cellSet = setCreateCellSet;
        return setCreateCellSet;
    }

    public void clear() {
        epd.d(cellSet().iterator());
    }

    @Override // com.google.common.collect.q0
    public Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    public boolean contains(Object obj, Object obj2) {
        Map map = (Map) s.v(rowMap(), obj);
        return map != null && s.u(map, obj2);
    }

    public boolean containsColumn(Object obj) {
        return s.u(columnMap(), obj);
    }

    public boolean containsRow(Object obj) {
        return s.u(rowMap(), obj);
    }

    public boolean containsValue(Object obj) {
        Iterator<Map<C, V>> it = rowMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public Set<q0.a<R, C, V>> createCellSet() {
        return new b();
    }

    public Collection<V> createValues() {
        return new c();
    }

    public boolean equals(Object obj) {
        return r0.a(this, obj);
    }

    public V get(Object obj, Object obj2) {
        Map map = (Map) s.v(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) s.v(map, obj2);
    }

    public int hashCode() {
        return cellSet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public V put(R r2, C c2, V v) {
        return row(r2).put(c2, v);
    }

    public void putAll(q0<? extends R, ? extends C, ? extends V> q0Var) {
        for (q0.a<? extends R, ? extends C, ? extends V> aVar : q0Var.cellSet()) {
            put(aVar.a(), aVar.getColumnKey(), aVar.getValue());
        }
    }

    public V remove(Object obj, Object obj2) {
        Map map = (Map) s.v(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) s.w(map, obj2);
    }

    @Override // com.google.common.collect.q0
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public String toString() {
        return rowMap().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.values = collectionCreateValues;
        return collectionCreateValues;
    }

    public Iterator<V> valuesIterator() {
        return new a(this, cellSet().iterator());
    }
}

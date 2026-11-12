package com.google.common.collect;

import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.alf;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractTable<R, C, V> implements Table<R, C, V> {

    @CheckForNull
    @LazyInit
    private transient Set<Table.Cell<R, C, V>> cellSet;

    @CheckForNull
    @LazyInit
    private transient Collection<V> values;

    abstract Iterator<Table.Cell<R, C, V>> cellIterator();

    AbstractTable() {
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(@CheckForNull Object obj) {
        return Maps.c((Map<?, ?>) rowMap(), obj);
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(@CheckForNull Object obj) {
        return Maps.c((Map<?, ?>) columnMap(), obj);
    }

    @Override // com.google.common.collect.Table
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(@CheckForNull Object obj) {
        Iterator<Map<C, V>> it = rowMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.Table
    public boolean contains(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map = (Map) Maps.a(rowMap(), obj);
        return map != null && Maps.c((Map<?, ?>) map, obj2);
    }

    @Override // com.google.common.collect.Table
    @CheckForNull
    public V get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map = (Map) Maps.a(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) Maps.a(map, obj2);
    }

    @Override // com.google.common.collect.Table
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.Table
    public void clear() {
        Iterators.d(cellSet().iterator());
    }

    @Override // com.google.common.collect.Table
    @CheckForNull
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Map map = (Map) Maps.a(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) Maps.h(map, obj2);
    }

    @Override // com.google.common.collect.Table
    @CheckForNull
    public V put(@ParametricNullness R r, @ParametricNullness C c2, @ParametricNullness V v) {
        return row(r).put(c2, v);
    }

    @Override // com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        for (Table.Cell<? extends R, ? extends C, ? extends V> cell : table.cellSet()) {
            put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
        }
    }

    @Override // com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        Set<Table.Cell<R, C, V>> set = this.cellSet;
        if (set != null) {
            return set;
        }
        Set<Table.Cell<R, C, V>> setCreateCellSet = createCellSet();
        this.cellSet = setCreateCellSet;
        return setCreateCellSet;
    }

    protected Set<Table.Cell<R, C, V>> createCellSet() {
        return new d();
    }

    class d extends AbstractSet<Table.Cell<R, C, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.a(AbstractTable.this.rowMap(), cell.getRowKey());
            return map != null && alf.a(map.entrySet(), Maps.c(cell.getColumnKey(), cell.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Map map = (Map) Maps.a(AbstractTable.this.rowMap(), cell.getRowKey());
            return map != null && alf.c(map.entrySet(), Maps.c(cell.getColumnKey(), cell.getValue()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractTable.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Table.Cell<R, C, V>> iterator() {
            return AbstractTable.this.cellIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractTable.this.size();
        }
    }

    @Override // com.google.common.collect.Table
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.values = collectionCreateValues;
        return collectionCreateValues;
    }

    protected Collection<V> createValues() {
        return new c();
    }

    Iterator<V> valuesIterator() {
        return new TransformedIterator<Table.Cell<R, C, V>, V>(this, cellSet().iterator()) { // from class: com.google.common.collect.AbstractTable.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public V transform(Table.Cell<R, C, V> cell) {
                return cell.getValue();
            }
        };
    }

    class c extends AbstractCollection<V> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractTable.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@CheckForNull Object obj) {
            return AbstractTable.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractTable.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractTable.this.size();
        }
    }

    @Override // com.google.common.collect.Table
    public boolean equals(@CheckForNull Object obj) {
        return Tables.a(this, obj);
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return cellSet().hashCode();
    }

    public String toString() {
        return rowMap().toString();
    }
}

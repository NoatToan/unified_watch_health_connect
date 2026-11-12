package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ArrayTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImmutableList<C> f4293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableMap<R, Integer> f4294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V[][] f4295c;

    @CheckForNull
    @LazyInit
    private transient ArrayTable<R, C, V>.e d;
    private final ImmutableMap<C, Integer> e;
    private final ImmutableList<R> h;

    @CheckForNull
    @LazyInit
    private transient ArrayTable<R, C, V>.a i;

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    static abstract class ArrayMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> {
        private final ImmutableMap<K, Integer> keyIndex;

        abstract String getKeyRole();

        @ParametricNullness
        abstract V getValue(int i);

        @ParametricNullness
        abstract V setValue(int i, @ParametricNullness V v);

        private ArrayMap(ImmutableMap<K, Integer> immutableMap) {
            this.keyIndex = immutableMap;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.keyIndex.keySet();
        }

        K getKey(int i) {
            return this.keyIndex.keySet().asList().get(i);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.keyIndex.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.keyIndex.isEmpty();
        }

        Map.Entry<K, V> getEntry(final int i) {
            Preconditions.checkElementIndex(i, size());
            return new AbstractMapEntry<K, V>() { // from class: com.google.common.collect.ArrayTable.ArrayMap.3
                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public K getKey() {
                    return (K) ArrayMap.this.getKey(i);
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                @ParametricNullness
                public V getValue() {
                    return (V) ArrayMap.this.getValue(i);
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                @ParametricNullness
                public V setValue(@ParametricNullness V v) {
                    return (V) ArrayMap.this.setValue(i, v);
                }
            };
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator<Map.Entry<K, V>> entryIterator() {
            return new AbstractIndexedListIterator<Map.Entry<K, V>>(size()) { // from class: com.google.common.collect.ArrayTable.ArrayMap.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIndexedListIterator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> get(int i) {
                    return ArrayMap.this.getEntry(i);
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@CheckForNull Object obj) {
            return this.keyIndex.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            Integer num = this.keyIndex.get(obj);
            if (num == null) {
                return null;
            }
            return getValue(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V put(K k, @ParametricNullness V v) {
            Integer num = this.keyIndex.get(k);
            if (num == null) {
                throw new IllegalArgumentException(getKeyRole() + " " + k + " not in " + this.keyIndex.keySet());
            }
            return setValue(num.intValue(), v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CheckForNull
        public V remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }
    }

    @CheckForNull
    public V b(int i, int i2) {
        Preconditions.checkElementIndex(i, this.h.size());
        Preconditions.checkElementIndex(i2, this.f4293a.size());
        return this.f4295c[i][i2];
    }

    @CheckForNull
    public V a(int i, int i2, @CheckForNull V v) {
        Preconditions.checkElementIndex(i, this.h.size());
        Preconditions.checkElementIndex(i2, this.f4293a.size());
        V[] vArr = this.f4295c[i];
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return containsRow(obj) && containsColumn(obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(@CheckForNull Object obj) {
        return this.e.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(@CheckForNull Object obj) {
        return this.f4294b.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@CheckForNull Object obj) {
        for (V[] vArr : this.f4295c) {
            for (V v : vArr) {
                if (Objects.equal(obj, v)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    public V get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Integer num = this.f4294b.get(obj);
        Integer num2 = this.e.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return b(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
        return this.h.isEmpty() || this.f4293a.isEmpty();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    public V put(R r, C c2, @CheckForNull V v) {
        Preconditions.checkNotNull(r);
        Preconditions.checkNotNull(c2);
        Integer num = this.f4294b.get(r);
        Preconditions.checkArgument(num != null, "Row %s not in %s", r, this.h);
        Integer num2 = this.e.get(c2);
        Preconditions.checkArgument(num2 != null, "Column %s not in %s", c2, this.f4293a);
        return a(num.intValue(), num2.intValue(), v);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    @Deprecated
    public V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.h.size() * this.f4293a.size();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractTable
    Iterator<Table.Cell<R, C, V>> cellIterator() {
        return new AbstractIndexedListIterator<Table.Cell<R, C, V>>(size()) { // from class: com.google.common.collect.ArrayTable.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIndexedListIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Table.Cell<R, C, V> get(int i) {
                return ArrayTable.this.e(i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Table.Cell<R, C, V> e(int i) {
        return new Tables.AbstractCell<R, C, V>(i) { // from class: com.google.common.collect.ArrayTable.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final int f4297a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f4299c;
            final int e;

            {
                this.f4299c = i;
                this.e = i / ArrayTable.this.f4293a.size();
                this.f4297a = i % ArrayTable.this.f4293a.size();
            }

            @Override // com.google.common.collect.Table.Cell
            public R getRowKey() {
                return (R) ArrayTable.this.h.get(this.e);
            }

            @Override // com.google.common.collect.Table.Cell
            public C getColumnKey() {
                return (C) ArrayTable.this.f4293a.get(this.f4297a);
            }

            @Override // com.google.common.collect.Table.Cell
            @CheckForNull
            public V getValue() {
                return (V) ArrayTable.this.b(this.e, this.f4297a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckForNull
    public V c(int i) {
        return b(i / this.f4293a.size(), i % this.f4293a.size());
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c2) {
        Preconditions.checkNotNull(c2);
        Integer num = this.e.get(c2);
        if (num == null) {
            return Collections.EMPTY_MAP;
        }
        return new b(num.intValue());
    }

    class b extends ArrayMap<R, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f4303c;

        b(int i) {
            super(ArrayTable.this.f4294b);
            this.f4303c = i;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String getKeyRole() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @CheckForNull
        V getValue(int i) {
            return (V) ArrayTable.this.b(i, this.f4303c);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @CheckForNull
        V setValue(int i, @CheckForNull V v) {
            return (V) ArrayTable.this.a(i, this.f4303c, v);
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<C> columnKeySet() {
        return this.e.keySet();
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        ArrayTable<R, C, V>.e eVar = this.d;
        if (eVar != null) {
            return eVar;
        }
        ArrayTable<R, C, V>.e eVar2 = new e();
        this.d = eVar2;
        return eVar2;
    }

    class e extends ArrayMap<C, Map<R, V>> {
        private e() {
            super(ArrayTable.this.e);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String getKeyRole() {
            return "Column";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map<R, V> getValue(int i) {
            return new b(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<R, V> setValue(int i, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<R, V> put(C c2, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
        Preconditions.checkNotNull(r);
        Integer num = this.f4294b.get(r);
        if (num == null) {
            return Collections.EMPTY_MAP;
        }
        return new d(num.intValue());
    }

    class d extends ArrayMap<C, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f4304b;

        d(int i) {
            super(ArrayTable.this.e);
            this.f4304b = i;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String getKeyRole() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @CheckForNull
        V getValue(int i) {
            return (V) ArrayTable.this.b(this.f4304b, i);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        @CheckForNull
        V setValue(int i, @CheckForNull V v) {
            return (V) ArrayTable.this.a(this.f4304b, i, v);
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<R> rowKeySet() {
        return this.f4294b.keySet();
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        ArrayTable<R, C, V>.a aVar = this.i;
        if (aVar != null) {
            return aVar;
        }
        ArrayTable<R, C, V>.a aVar2 = new a();
        this.i = aVar2;
        return aVar2;
    }

    class a extends ArrayMap<R, Map<C, V>> {
        private a() {
            super(ArrayTable.this.f4294b);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String getKeyRole() {
            return "Row";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<C, V> getValue(int i) {
            return new d(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map<C, V> setValue(int i, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        @CheckForNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<C, V> put(R r, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractTable
    Iterator<V> valuesIterator() {
        return new AbstractIndexedListIterator<V>(size()) { // from class: com.google.common.collect.ArrayTable.1
            @Override // com.google.common.collect.AbstractIndexedListIterator
            @CheckForNull
            protected V get(int i) {
                return (V) ArrayTable.this.c(i);
            }
        };
    }
}

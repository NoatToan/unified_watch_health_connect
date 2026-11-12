package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
public class TreeBasedTable<R, C, V> extends t2<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> h;

    public class a implements Function<Map<C, V>, Iterator<C>> {
        public a() {
        }

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterator<C> apply(Map<C, V> map) {
            return map.keySet().iterator();
        }
    }

    public class b extends AbstractIterator<C> {

        @NullableDecl
        public C c;
        public final /* synthetic */ Iterator d;
        public final /* synthetic */ Comparator e;

        public b(Iterator it2, Comparator comparator) {
            this.d = it2;
            this.e = comparator;
        }

        @Override // com.google.common.collect.AbstractIterator
        public C computeNext() {
            while (this.d.hasNext()) {
                C c = (C) this.d.next();
                C c2 = this.c;
                if (!(c2 != null && this.e.compare(c, c2) == 0)) {
                    this.c = c;
                    return c;
                }
            }
            this.c = null;
            return endOfData();
        }
    }

    public static class c<C, V> implements Supplier<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        public final Comparator<? super C> a;

        public c(Comparator<? super C> comparator) {
            this.a = comparator;
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TreeMap<C, V> get() {
            return new TreeMap<>(this.a);
        }
    }

    public class d extends u2<R, C, V>.g implements SortedMap<C, V> {

        @NullableDecl
        public final C d;

        @NullableDecl
        public final C e;

        @NullableDecl
        public transient SortedMap<C, V> f;

        public d(TreeBasedTable treeBasedTable, R r) {
            this(r, null, null);
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return TreeBasedTable.this.columnComparator();
        }

        @Override // com.google.common.collect.u2.g, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return k(obj) && super.containsKey(obj);
        }

        @Override // com.google.common.collect.u2.g
        public void e() {
            if (l() == null || !this.f.isEmpty()) {
                return;
            }
            TreeBasedTable.this.c.remove(this.a);
            this.f = null;
            this.b = null;
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            if (c() != null) {
                return c().firstKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.u2.g
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> c() {
            return (SortedMap) super.c();
        }

        public int h(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C c) {
            Preconditions.checkArgument(k(Preconditions.checkNotNull(c)));
            return new d(this.a, this.d, c);
        }

        @Override // com.google.common.collect.u2.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> d() {
            SortedMap<C, V> sortedMapL = l();
            if (sortedMapL == null) {
                return null;
            }
            C c = this.d;
            if (c != null) {
                sortedMapL = sortedMapL.tailMap(c);
            }
            C c2 = this.e;
            return c2 != null ? sortedMapL.headMap(c2) : sortedMapL;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public SortedSet<C> keySet() {
            return new Maps.f0(this);
        }

        public boolean k(@NullableDecl Object obj) {
            C c;
            C c2;
            return obj != null && ((c = this.d) == null || h(c, obj) <= 0) && ((c2 = this.e) == null || h(c2, obj) > 0);
        }

        public SortedMap<C, V> l() {
            SortedMap<C, V> sortedMap = this.f;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.c.containsKey(this.a))) {
                this.f = (SortedMap) TreeBasedTable.this.c.get(this.a);
            }
            return this.f;
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            if (c() != null) {
                return c().lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.u2.g, java.util.AbstractMap, java.util.Map
        public V put(C c, V v) {
            Preconditions.checkArgument(k(Preconditions.checkNotNull(c)));
            return (V) super.put(c, v);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C c, C c2) {
            Preconditions.checkArgument(k(Preconditions.checkNotNull(c)) && k(Preconditions.checkNotNull(c2)));
            return new d(this.a, c, c2);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C c) {
            Preconditions.checkArgument(k(Preconditions.checkNotNull(c)));
            return new d(this.a, c, this.e);
        }

        public d(@NullableDecl R r, @NullableDecl C c, C c2) {
            super(r);
            this.d = c;
            this.e = c2;
            Preconditions.checkArgument(c == null || c2 == null || h(c, c2) <= 0);
        }
    }

    public TreeBasedTable(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new c(comparator2));
        this.h = comparator2;
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(Ordering.natural(), Ordering.natural());
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.u2, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.h;
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(@NullableDecl Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(@NullableDecl Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Object get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.u2
    public Iterator<C> j() {
        Comparator<? super C> comparatorColumnComparator = columnComparator();
        return new b(Iterators.mergeSorted(Iterables.transform(this.c.values(), new a()), comparatorColumnComparator), comparatorColumnComparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void putAll(Table table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    @Deprecated
    public Comparator<? super R> rowComparator() {
        return rowKeySet().comparator();
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.o
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(comparator2);
        return new TreeBasedTable<>(comparator, comparator2);
    }

    @Override // com.google.common.collect.u2, com.google.common.collect.Table
    public SortedMap<C, V> row(R r) {
        return new d(this, r);
    }

    @Override // com.google.common.collect.t2, com.google.common.collect.u2, com.google.common.collect.o, com.google.common.collect.Table
    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.t2, com.google.common.collect.u2, com.google.common.collect.Table
    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        TreeBasedTable<R, C, V> treeBasedTable2 = new TreeBasedTable<>(treeBasedTable.rowComparator(), treeBasedTable.columnComparator());
        treeBasedTable2.putAll(treeBasedTable);
        return treeBasedTable2;
    }
}

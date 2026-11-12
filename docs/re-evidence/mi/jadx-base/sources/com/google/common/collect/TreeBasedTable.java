package com.google.common.collect;

import com.google.common.collect.TreeBasedTable;
import defpackage.b10;
import defpackage.c6i;
import defpackage.cpd;
import defpackage.dua;
import defpackage.epd;
import defpackage.ich;
import defpackage.spo;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public class TreeBasedTable<R, C, V> extends o0<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    public class a extends b10<C> {
        public C c;
        public final /* synthetic */ Iterator d;
        public final /* synthetic */ Comparator e;

        public a(TreeBasedTable treeBasedTable, Iterator it, Comparator comparator) {
            this.d = it;
            this.e = comparator;
        }

        @Override // defpackage.b10
        public C a() {
            while (this.d.hasNext()) {
                C c = (C) this.d.next();
                C c2 = this.c;
                if (c2 == null || this.e.compare(c, c2) != 0) {
                    this.c = c;
                    return c;
                }
            }
            this.c = null;
            return b();
        }
    }

    public static class b<C, V> implements spo<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparator<? super C> f9115a;

        public b(Comparator<? super C> comparator) {
            this.f9115a = comparator;
        }

        @Override // defpackage.spo
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TreeMap<C, V> get() {
            return new TreeMap<>(this.f9115a);
        }
    }

    public class c extends p0<R, C, V>.g implements SortedMap<C, V> {
        public final C d;
        public final C e;
        public transient SortedMap<C, V> f;

        public c(TreeBasedTable treeBasedTable, R r2) {
            this(r2, null, null);
        }

        @Override // com.google.common.collect.p0.g
        public void c() {
            n();
            SortedMap<C, V> sortedMap = this.f;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            TreeBasedTable.this.backingMap.remove(this.f9217a);
            this.f = null;
            this.f9218b = null;
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return TreeBasedTable.this.columnComparator();
        }

        @Override // com.google.common.collect.p0.g, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return m(obj) && super.containsKey(obj);
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            d();
            Map<C, V> map = this.f9218b;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        public int g(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C c) {
            c6i.d(m(c6i.o(c)));
            return new c(this.f9217a, this.d, c);
        }

        @Override // com.google.common.collect.p0.g
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> b() {
            n();
            SortedMap<C, V> sortedMapTailMap = this.f;
            if (sortedMapTailMap == null) {
                return null;
            }
            C c = this.d;
            if (c != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(c);
            }
            C c2 = this.e;
            return c2 != null ? sortedMapTailMap.headMap(c2) : sortedMapTailMap;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public SortedSet<C> keySet() {
            return new s.o(this);
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            d();
            Map<C, V> map = this.f9218b;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        public boolean m(Object obj) {
            C c;
            C c2;
            return obj != null && ((c = this.d) == null || g(c, obj) <= 0) && ((c2 = this.e) == null || g(c2, obj) > 0);
        }

        public void n() {
            SortedMap<C, V> sortedMap = this.f;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.backingMap.containsKey(this.f9217a))) {
                this.f = (SortedMap) TreeBasedTable.this.backingMap.get(this.f9217a);
            }
        }

        @Override // com.google.common.collect.p0.g, java.util.AbstractMap, java.util.Map
        public V put(C c, V v) {
            c6i.d(m(c6i.o(c)));
            return (V) super.put(c, v);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C c, C c2) {
            c6i.d(m(c6i.o(c)) && m(c6i.o(c2)));
            return new c(this.f9217a, c, c2);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C c) {
            c6i.d(m(c6i.o(c)));
            return new c(this.f9217a, c, this.e);
        }

        public c(R r2, C c, C c2) {
            super(r2);
            this.d = c;
            this.e = c2;
            c6i.d(c == null || c2 == null || g(c, c2) <= 0);
        }
    }

    public TreeBasedTable(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new b(comparator2));
        this.columnComparator = comparator2;
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(ich.e(), ich.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$createColumnKeyIterator$0(Map map) {
        return map.keySet().iterator();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j, com.google.common.collect.q0
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p0
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j, com.google.common.collect.q0
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.q0
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.p0
    public Iterator<C> createColumnKeyIterator() {
        Comparator<? super C> comparatorColumnComparator = columnComparator();
        return new a(this, epd.o(cpd.n(this.backingMap.values(), new dua() { // from class: q1q
            @Override // defpackage.dua
            public final Object apply(Object obj) {
                return TreeBasedTable.lambda$createColumnKeyIterator$0((Map) obj);
            }
        }), comparatorColumnComparator), comparatorColumnComparator);
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ void putAll(q0 q0Var) {
        super.putAll(q0Var);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ Object remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Deprecated
    public Comparator<? super R> rowComparator() {
        Comparator<? super R> comparator = rowKeySet().comparator();
        Objects.requireNonNull(comparator);
        return comparator;
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.q0
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.j
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        c6i.o(comparator);
        c6i.o(comparator2);
        return new TreeBasedTable<>(comparator, comparator2);
    }

    @Override // com.google.common.collect.p0, com.google.common.collect.q0
    public SortedMap<C, V> row(R r2) {
        return new c(this, r2);
    }

    @Override // com.google.common.collect.o0, com.google.common.collect.p0, com.google.common.collect.j, com.google.common.collect.q0
    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.o0, com.google.common.collect.p0, com.google.common.collect.q0
    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        TreeBasedTable<R, C, V> treeBasedTable2 = new TreeBasedTable<>(treeBasedTable.rowComparator(), treeBasedTable.columnComparator());
        treeBasedTable2.putAll(treeBasedTable);
        return treeBasedTable2;
    }
}

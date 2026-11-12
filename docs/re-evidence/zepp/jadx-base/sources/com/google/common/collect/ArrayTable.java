package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible(emulated = true)
public final class ArrayTable<R, C, V> extends o<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final ImmutableList<R> c;
    private final ImmutableList<C> d;
    private final ImmutableMap<R, Integer> e;
    private final ImmutableMap<C, Integer> f;
    private final V[][] g;

    @MonotonicNonNullDecl
    private transient ArrayTable<R, C, V>.f h;

    @MonotonicNonNullDecl
    private transient ArrayTable<R, C, V>.h i;

    public class a extends com.google.common.collect.b<Table.Cell<R, C, V>> {
        public a(int i) {
            super(i);
        }

        @Override // com.google.common.collect.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Table.Cell<R, C, V> a(int i) {
            return ArrayTable.this.m(i);
        }
    }

    public class b extends Tables.b<R, C, V> {
        public final int a;
        public final int b;
        public final /* synthetic */ int c;

        public b(int i) {
            this.c = i;
            this.a = i / ArrayTable.this.d.size();
            this.b = i % ArrayTable.this.d.size();
        }

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
            return (C) ArrayTable.this.d.get(this.b);
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
            return (R) ArrayTable.this.c.get(this.a);
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
            return (V) ArrayTable.this.at(this.a, this.b);
        }
    }

    public class c extends com.google.common.collect.b<V> {
        public c(int i) {
            super(i);
        }

        @Override // com.google.common.collect.b
        public V a(int i) {
            return (V) ArrayTable.this.n(i);
        }
    }

    public static abstract class d<K, V> extends Maps.z<K, V> {
        private final ImmutableMap<K, Integer> a;

        public class a extends com.google.common.collect.f<K, V> {
            public final /* synthetic */ int a;

            public a(int i) {
                this.a = i;
            }

            @Override // com.google.common.collect.f, java.util.Map.Entry
            public K getKey() {
                return (K) d.this.d(this.a);
            }

            @Override // com.google.common.collect.f, java.util.Map.Entry
            public V getValue() {
                return (V) d.this.f(this.a);
            }

            @Override // com.google.common.collect.f, java.util.Map.Entry
            public V setValue(V v) {
                return (V) d.this.g(this.a, v);
            }
        }

        public class b extends com.google.common.collect.b<Map.Entry<K, V>> {
            public b(int i) {
                super(i);
            }

            @Override // com.google.common.collect.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(int i) {
                return d.this.c(i);
            }
        }

        public /* synthetic */ d(ImmutableMap immutableMap, a aVar) {
            this(immutableMap);
        }

        @Override // com.google.common.collect.Maps.z
        public Iterator<Map.Entry<K, V>> a() {
            return new b(size());
        }

        public Map.Entry<K, V> c(int i) {
            Preconditions.checkElementIndex(i, size());
            return new a(i);
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return this.a.containsKey(obj);
        }

        public K d(int i) {
            return this.a.keySet().asList().get(i);
        }

        public abstract String e();

        @NullableDecl
        public abstract V f(int i);

        @NullableDecl
        public abstract V g(int i, V v);

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
            Integer num = this.a.get(obj);
            if (num == null) {
                return null;
            }
            return f(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            Integer num = this.a.get(k);
            if (num != null) {
                return g(num.intValue(), v);
            }
            throw new IllegalArgumentException(e() + " " + k + " not in " + this.a.keySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.a.size();
        }

        private d(ImmutableMap<K, Integer> immutableMap) {
            this.a = immutableMap;
        }
    }

    public class e extends d<R, V> {
        public final int b;

        public e(int i) {
            super(ArrayTable.this.e, null);
            this.b = i;
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String e() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.d
        public V f(int i) {
            return (V) ArrayTable.this.at(i, this.b);
        }

        @Override // com.google.common.collect.ArrayTable.d
        public V g(int i, V v) {
            return (V) ArrayTable.this.set(i, this.b, v);
        }
    }

    public class f extends d<C, Map<R, V>> {
        public /* synthetic */ f(ArrayTable arrayTable, a aVar) {
            this();
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String e() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<R, V> f(int i) {
            return new e(i);
        }

        @Override // com.google.common.collect.ArrayTable.d, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<R, V> put(C c, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Map<R, V> g(int i, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        private f() {
            super(ArrayTable.this.f, null);
        }
    }

    public class g extends d<C, V> {
        public final int b;

        public g(int i) {
            super(ArrayTable.this.f, null);
            this.b = i;
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String e() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.d
        public V f(int i) {
            return (V) ArrayTable.this.at(this.b, i);
        }

        @Override // com.google.common.collect.ArrayTable.d
        public V g(int i, V v) {
            return (V) ArrayTable.this.set(this.b, i, v);
        }
    }

    public class h extends d<R, Map<C, V>> {
        public /* synthetic */ h(ArrayTable arrayTable, a aVar) {
            this();
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String e() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map<C, V> f(int i) {
            return new g(i);
        }

        @Override // com.google.common.collect.ArrayTable.d, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Map<C, V> put(R r, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Map<C, V> g(int i, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        private h() {
            super(ArrayTable.this.e, null);
        }
    }

    private ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        ImmutableList<R> immutableListCopyOf = ImmutableList.copyOf(iterable);
        this.c = immutableListCopyOf;
        ImmutableList<C> immutableListCopyOf2 = ImmutableList.copyOf(iterable2);
        this.d = immutableListCopyOf2;
        Preconditions.checkArgument(immutableListCopyOf.isEmpty() == immutableListCopyOf2.isEmpty());
        this.e = Maps.u(immutableListCopyOf);
        this.f = Maps.u(immutableListCopyOf2);
        this.g = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableListCopyOf.size(), immutableListCopyOf2.size()));
        eraseAll();
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new ArrayTable<>(iterable, iterable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Table.Cell<R, C, V> m(int i) {
        return new b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V n(int i) {
        return at(i / this.d.size(), i % this.d.size());
    }

    @Override // com.google.common.collect.o
    public Iterator<Table.Cell<R, C, V>> a() {
        return new a(size());
    }

    public V at(int i, int i2) {
        Preconditions.checkElementIndex(i, this.c.size());
        Preconditions.checkElementIndex(i2, this.d.size());
        return this.g[i][i2];
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c2) {
        Preconditions.checkNotNull(c2);
        Integer num = this.f.get(c2);
        return num == null ? ImmutableMap.of() : new e(num.intValue());
    }

    public ImmutableList<C> columnKeyList() {
        return this.d;
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        ArrayTable<R, C, V>.f fVar = this.h;
        if (fVar != null) {
            return fVar;
        }
        ArrayTable<R, C, V>.f fVar2 = new f(this, null);
        this.h = fVar2;
        return fVar2;
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return containsRow(obj) && containsColumn(obj2);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public boolean containsColumn(@NullableDecl Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public boolean containsRow(@NullableDecl Object obj) {
        return this.e.containsKey(obj);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public boolean containsValue(@NullableDecl Object obj) {
        for (V[] vArr : this.g) {
            for (V v : vArr) {
                if (Objects.equal(obj, v)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.o
    public Iterator<V> e() {
        return new c(size());
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public V erase(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Integer num = this.e.get(obj);
        Integer num2 = this.f.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    public void eraseAll() {
        for (V[] vArr : this.g) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Integer num = this.e.get(obj);
        Integer num2 = this.f.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return at(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public boolean isEmpty() {
        return this.c.isEmpty() || this.d.isEmpty();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(R r, C c2, @NullableDecl V v) {
        Preconditions.checkNotNull(r);
        Preconditions.checkNotNull(c2);
        Integer num = this.e.get(r);
        Preconditions.checkArgument(num != null, "Row %s not in %s", r, this.c);
        Integer num2 = this.f.get(c2);
        Preconditions.checkArgument(num2 != null, "Column %s not in %s", c2, this.d);
        return set(num.intValue(), num2.intValue(), v);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    @CanIgnoreReturnValue
    @Deprecated
    public V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r) {
        Preconditions.checkNotNull(r);
        Integer num = this.e.get(r);
        return num == null ? ImmutableMap.of() : new g(num.intValue());
    }

    public ImmutableList<R> rowKeyList() {
        return this.c;
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        ArrayTable<R, C, V>.h hVar = this.i;
        if (hVar != null) {
            return hVar;
        }
        ArrayTable<R, C, V>.h hVar2 = new h(this, null);
        this.i = hVar2;
        return hVar2;
    }

    @CanIgnoreReturnValue
    public V set(int i, int i2, @NullableDecl V v) {
        Preconditions.checkElementIndex(i, this.c.size());
        Preconditions.checkElementIndex(i2, this.d.size());
        V[][] vArr = this.g;
        V v2 = vArr[i][i2];
        vArr[i][i2] = v;
        return v2;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.c.size() * this.d.size();
    }

    @GwtIncompatible
    public V[][] toArray(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.c.size(), this.d.size()));
        for (int i = 0; i < this.c.size(); i++) {
            V[][] vArr2 = this.g;
            System.arraycopy(vArr2[i], 0, vArr[i], 0, vArr2[i].length);
        }
        return vArr;
    }

    @Override // com.google.common.collect.o
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public Collection<V> values() {
        return super.values();
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Table<R, C, V> table) {
        return table instanceof ArrayTable ? new ArrayTable<>((ArrayTable) table) : new ArrayTable<>(table);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public ImmutableSet<C> columnKeySet() {
        return this.f.keySet();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.Table
    public ImmutableSet<R> rowKeySet() {
        return this.e.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayTable(Table<R, C, V> table) {
        this(table.rowKeySet(), table.columnKeySet());
        putAll(table);
    }

    private ArrayTable(ArrayTable<R, C, V> arrayTable) {
        ImmutableList<R> immutableList = arrayTable.c;
        this.c = immutableList;
        ImmutableList<C> immutableList2 = arrayTable.d;
        this.d = immutableList2;
        this.e = arrayTable.e;
        this.f = arrayTable.f;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableList.size(), immutableList2.size()));
        this.g = vArr;
        for (int i = 0; i < this.c.size(); i++) {
            V[][] vArr2 = arrayTable.g;
            System.arraycopy(vArr2[i], 0, vArr[i], 0, vArr2[i].length);
        }
    }
}

package com.google.common.collect;

import defpackage.c6i;
import defpackage.f10;
import defpackage.j4h;
import defpackage.x00;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class ArrayTable<R, C, V> extends j<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableList<C> columnList;
    private transient ArrayTable<R, C, V>.f columnMap;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableList<R> rowList;
    private transient ArrayTable<R, C, V>.h rowMap;

    public class a extends x00<q0.a<R, C, V>> {
        public a(int i) {
            super(i);
        }

        @Override // defpackage.x00
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q0.a<R, C, V> a(int i) {
            return ArrayTable.this.getCell(i);
        }
    }

    public class b extends r0.b<R, C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8990b;
        public final /* synthetic */ int c;

        public b(int i) {
            this.c = i;
            this.f8989a = i / ArrayTable.this.columnList.size();
            this.f8990b = i % ArrayTable.this.columnList.size();
        }

        @Override // com.google.common.collect.q0.a
        public R a() {
            return (R) ArrayTable.this.rowList.get(this.f8989a);
        }

        @Override // com.google.common.collect.q0.a
        public C getColumnKey() {
            return (C) ArrayTable.this.columnList.get(this.f8990b);
        }

        @Override // com.google.common.collect.q0.a
        public V getValue() {
            return (V) ArrayTable.this.at(this.f8989a, this.f8990b);
        }
    }

    public class c extends x00<V> {
        public c(int i) {
            super(i);
        }

        @Override // defpackage.x00
        public V a(int i) {
            return (V) ArrayTable.this.getValue(i);
        }
    }

    public static abstract class d<K, V> extends s.l<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMap<K, Integer> f8991a;

        public class a extends f10<K, V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f8992a;

            public a(int i) {
                this.f8992a = i;
            }

            @Override // defpackage.f10, java.util.Map.Entry
            public K getKey() {
                return (K) d.this.c(this.f8992a);
            }

            @Override // defpackage.f10, java.util.Map.Entry
            public V getValue() {
                return (V) d.this.f(this.f8992a);
            }

            @Override // defpackage.f10, java.util.Map.Entry
            public V setValue(V v) {
                return (V) d.this.g(this.f8992a, v);
            }
        }

        public class b extends x00<Map.Entry<K, V>> {
            public b(int i) {
                super(i);
            }

            @Override // defpackage.x00
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a(int i) {
                return d.this.b(i);
            }
        }

        public /* synthetic */ d(ImmutableMap immutableMap, a aVar) {
            this(immutableMap);
        }

        @Override // com.google.common.collect.s.l
        public Iterator<Map.Entry<K, V>> a() {
            return new b(size());
        }

        public Map.Entry<K, V> b(int i) {
            c6i.m(i, size());
            return new a(i);
        }

        public K c(int i) {
            return this.f8991a.keySet().asList().get(i);
        }

        @Override // com.google.common.collect.s.l, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f8991a.containsKey(obj);
        }

        public abstract String d();

        public abstract V f(int i);

        public abstract V g(int i, V v);

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Integer num = this.f8991a.get(obj);
            if (num == null) {
                return null;
            }
            return f(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f8991a.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f8991a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v) {
            Integer num = this.f8991a.get(k2);
            if (num != null) {
                return g(num.intValue(), v);
            }
            String strD = d();
            String strValueOf = String.valueOf(k2);
            String strValueOf2 = String.valueOf(this.f8991a.keySet());
            StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 9 + strValueOf.length() + strValueOf2.length());
            sb.append(strD);
            sb.append(" ");
            sb.append(strValueOf);
            sb.append(" not in ");
            sb.append(strValueOf2);
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f8991a.size();
        }

        public d(ImmutableMap<K, Integer> immutableMap) {
            this.f8991a = immutableMap;
        }
    }

    public class e extends d<R, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8994b;

        public e(int i) {
            super(ArrayTable.this.rowKeyToIndex, null);
            this.f8994b = i;
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String d() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.d
        public V f(int i) {
            return (V) ArrayTable.this.at(i, this.f8994b);
        }

        @Override // com.google.common.collect.ArrayTable.d
        public V g(int i, V v) {
            return (V) ArrayTable.this.set(i, this.f8994b, v);
        }
    }

    public class f extends d<C, Map<R, V>> {
        public /* synthetic */ f(ArrayTable arrayTable, a aVar) {
            this();
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String d() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Map<R, V> f(int i) {
            return new e(i);
        }

        @Override // com.google.common.collect.ArrayTable.d, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Map<R, V> put(C c, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Map<R, V> g(int i, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        public f() {
            super(ArrayTable.this.columnKeyToIndex, null);
        }
    }

    public class g extends d<C, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8996b;

        public g(int i) {
            super(ArrayTable.this.columnKeyToIndex, null);
            this.f8996b = i;
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String d() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.d
        public V f(int i) {
            return (V) ArrayTable.this.at(this.f8996b, i);
        }

        @Override // com.google.common.collect.ArrayTable.d
        public V g(int i, V v) {
            return (V) ArrayTable.this.set(this.f8996b, i, v);
        }
    }

    public class h extends d<R, Map<C, V>> {
        public /* synthetic */ h(ArrayTable arrayTable, a aVar) {
            this();
        }

        @Override // com.google.common.collect.ArrayTable.d
        public String d() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Map<C, V> f(int i) {
            return new g(i);
        }

        @Override // com.google.common.collect.ArrayTable.d, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Map<C, V> put(R r2, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.d
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Map<C, V> g(int i, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        public h() {
            super(ArrayTable.this.rowKeyToIndex, null);
        }
    }

    private ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        ImmutableList<R> immutableListCopyOf = ImmutableList.copyOf(iterable);
        this.rowList = immutableListCopyOf;
        ImmutableList<C> immutableListCopyOf2 = ImmutableList.copyOf(iterable2);
        this.columnList = immutableListCopyOf2;
        c6i.d(immutableListCopyOf.isEmpty() == immutableListCopyOf2.isEmpty());
        this.rowKeyToIndex = s.j(immutableListCopyOf);
        this.columnKeyToIndex = s.j(immutableListCopyOf2);
        this.array = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableListCopyOf.size(), immutableListCopyOf2.size()));
        eraseAll();
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new ArrayTable<>(iterable, iterable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q0.a<R, C, V> getCell(int i) {
        return new b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V getValue(int i) {
        return at(i / this.columnList.size(), i % this.columnList.size());
    }

    public V at(int i, int i2) {
        c6i.m(i, this.rowList.size());
        c6i.m(i2, this.columnList.size());
        return this.array[i][i2];
    }

    @Override // com.google.common.collect.j
    public Iterator<q0.a<R, C, V>> cellIterator() {
        return new a(size());
    }

    @Override // com.google.common.collect.j, com.google.common.collect.q0
    public Set<q0.a<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.j
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public Map<R, V> column(C c2) {
        c6i.o(c2);
        Integer num = this.columnKeyToIndex.get(c2);
        return num == null ? Collections.emptyMap() : new e(num.intValue());
    }

    public ImmutableList<C> columnKeyList() {
        return this.columnList;
    }

    @Override // com.google.common.collect.q0
    public Map<C, Map<R, V>> columnMap() {
        ArrayTable<R, C, V>.f fVar = this.columnMap;
        if (fVar != null) {
            return fVar;
        }
        ArrayTable<R, C, V>.f fVar2 = new f(this, null);
        this.columnMap = fVar2;
        return fVar2;
    }

    @Override // com.google.common.collect.j
    public boolean contains(Object obj, Object obj2) {
        return containsRow(obj) && containsColumn(obj2);
    }

    @Override // com.google.common.collect.j
    public boolean containsColumn(Object obj) {
        return this.columnKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.j
    public boolean containsRow(Object obj) {
        return this.rowKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.j
    public boolean containsValue(Object obj) {
        for (V[] vArr : this.array) {
            for (V v : vArr) {
                if (j4h.a(obj, v)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public V erase(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    public void eraseAll() {
        for (V[] vArr : this.array) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // com.google.common.collect.j
    public V get(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return at(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.j
    public boolean isEmpty() {
        return this.rowList.isEmpty() || this.columnList.isEmpty();
    }

    @Override // com.google.common.collect.j
    public V put(R r2, C c2, V v) {
        c6i.o(r2);
        c6i.o(c2);
        Integer num = this.rowKeyToIndex.get(r2);
        c6i.k(num != null, "Row %s not in %s", r2, this.rowList);
        Integer num2 = this.columnKeyToIndex.get(c2);
        c6i.k(num2 != null, "Column %s not in %s", c2, this.columnList);
        return set(num.intValue(), num2.intValue(), v);
    }

    @Override // com.google.common.collect.j
    public void putAll(q0<? extends R, ? extends C, ? extends V> q0Var) {
        super.putAll(q0Var);
    }

    @Override // com.google.common.collect.j
    @Deprecated
    public V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q0
    public Map<C, V> row(R r2) {
        c6i.o(r2);
        Integer num = this.rowKeyToIndex.get(r2);
        return num == null ? Collections.emptyMap() : new g(num.intValue());
    }

    public ImmutableList<R> rowKeyList() {
        return this.rowList;
    }

    @Override // com.google.common.collect.q0
    public Map<R, Map<C, V>> rowMap() {
        ArrayTable<R, C, V>.h hVar = this.rowMap;
        if (hVar != null) {
            return hVar;
        }
        ArrayTable<R, C, V>.h hVar2 = new h(this, null);
        this.rowMap = hVar2;
        return hVar2;
    }

    public V set(int i, int i2, V v) {
        c6i.m(i, this.rowList.size());
        c6i.m(i2, this.columnList.size());
        V[] vArr = this.array[i];
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    @Override // com.google.common.collect.q0
    public int size() {
        return this.rowList.size() * this.columnList.size();
    }

    public V[][] toArray(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.rowList.size(), this.columnList.size()));
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = this.array[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
        return vArr;
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.j
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.j
    public Iterator<V> valuesIterator() {
        return new c(size());
    }

    public static <R, C, V> ArrayTable<R, C, V> create(q0<R, C, ? extends V> q0Var) {
        return q0Var instanceof ArrayTable ? new ArrayTable<>((ArrayTable) q0Var) : new ArrayTable<>(q0Var);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.q0
    public ImmutableSet<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.j, com.google.common.collect.q0
    public ImmutableSet<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayTable(q0<R, C, ? extends V> q0Var) {
        this(q0Var.rowKeySet(), q0Var.columnKeySet());
        putAll(q0Var);
    }

    private ArrayTable(ArrayTable<R, C, V> arrayTable) {
        ImmutableList<R> immutableList = arrayTable.rowList;
        this.rowList = immutableList;
        ImmutableList<C> immutableList2 = arrayTable.columnList;
        this.columnList = immutableList2;
        this.rowKeyToIndex = arrayTable.rowKeyToIndex;
        this.columnKeyToIndex = arrayTable.columnKeyToIndex;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableList.size(), immutableList2.size()));
        this.array = vArr;
        for (int i = 0; i < this.rowList.size(); i++) {
            V[] vArr2 = arrayTable.array[i];
            System.arraycopy(vArr2, 0, vArr[i], 0, vArr2.length);
        }
    }
}

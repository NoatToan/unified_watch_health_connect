package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.lang.reflect.Array;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Immutable(containerOf = {"R", "C", "V"})
@GwtCompatible
final class e0<R, C, V> extends h2<R, C, V> {
    private final ImmutableMap<R, Integer> c;
    private final ImmutableMap<C, Integer> d;
    private final ImmutableMap<R, ImmutableMap<C, V>> e;
    private final ImmutableMap<C, ImmutableMap<R, V>> f;
    private final int[] g;
    private final int[] h;
    private final V[][] i;
    private final int[] j;
    private final int[] k;

    public final class b extends d<R, V> {
        private final int g;

        public b(int i) {
            super(e0.this.h[i]);
            this.g = i;
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean j() {
            return true;
        }

        @Override // com.google.common.collect.e0.d
        public V o(int i) {
            return (V) e0.this.i[i][this.g];
        }

        @Override // com.google.common.collect.e0.d
        public ImmutableMap<R, Integer> q() {
            return e0.this.c;
        }
    }

    public final class c extends d<C, ImmutableMap<R, V>> {
        @Override // com.google.common.collect.ImmutableMap
        public boolean j() {
            return false;
        }

        @Override // com.google.common.collect.e0.d
        public ImmutableMap<C, Integer> q() {
            return e0.this.d;
        }

        @Override // com.google.common.collect.e0.d
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public ImmutableMap<R, V> o(int i) {
            return new b(i);
        }

        private c() {
            super(e0.this.h.length);
        }
    }

    public static abstract class d<K, V> extends ImmutableMap.b<K, V> {
        private final int f;

        public class a extends AbstractIterator<Map.Entry<K, V>> {
            private int c = -1;
            private final int d;

            public a() {
                this.d = d.this.q().size();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> computeNext() {
                int i = this.c;
                while (true) {
                    this.c = i + 1;
                    int i2 = this.c;
                    if (i2 >= this.d) {
                        return endOfData();
                    }
                    Object objO = d.this.o(i2);
                    if (objO != null) {
                        return Maps.immutableEntry(d.this.n(this.c), objO);
                    }
                    i = this.c;
                }
            }
        }

        public d(int i) {
            this.f = i;
        }

        private boolean p() {
            return this.f == q().size();
        }

        @Override // com.google.common.collect.ImmutableMap.b, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> f() {
            return p() ? q().keySet() : super.f();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public V get(@NullableDecl Object obj) {
            Integer num = q().get(obj);
            if (num == null) {
                return null;
            }
            return o(num.intValue());
        }

        @Override // com.google.common.collect.ImmutableMap.b
        public UnmodifiableIterator<Map.Entry<K, V>> m() {
            return new a();
        }

        public K n(int i) {
            return q().keySet().asList().get(i);
        }

        @NullableDecl
        public abstract V o(int i);

        public abstract ImmutableMap<K, Integer> q();

        @Override // java.util.Map
        public int size() {
            return this.f;
        }
    }

    public final class e extends d<C, V> {
        private final int g;

        public e(int i) {
            super(e0.this.g[i]);
            this.g = i;
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean j() {
            return true;
        }

        @Override // com.google.common.collect.e0.d
        public V o(int i) {
            return (V) e0.this.i[this.g][i];
        }

        @Override // com.google.common.collect.e0.d
        public ImmutableMap<C, Integer> q() {
            return e0.this.d;
        }
    }

    public final class f extends d<R, ImmutableMap<C, V>> {
        @Override // com.google.common.collect.ImmutableMap
        public boolean j() {
            return false;
        }

        @Override // com.google.common.collect.e0.d
        public ImmutableMap<R, Integer> q() {
            return e0.this.c;
        }

        @Override // com.google.common.collect.e0.d
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public ImmutableMap<C, V> o(int i) {
            return new e(i);
        }

        private f() {
            super(e0.this.g.length);
        }
    }

    public e0(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        this.i = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size()));
        ImmutableMap<R, Integer> immutableMapU = Maps.u(immutableSet);
        this.c = immutableMapU;
        ImmutableMap<C, Integer> immutableMapU2 = Maps.u(immutableSet2);
        this.d = immutableMapU2;
        this.g = new int[immutableMapU.size()];
        this.h = new int[immutableMapU2.size()];
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            Table.Cell<R, C, V> cell = immutableList.get(i);
            R rowKey = cell.getRowKey();
            C columnKey = cell.getColumnKey();
            int iIntValue = this.c.get(rowKey).intValue();
            int iIntValue2 = this.d.get(columnKey).intValue();
            Preconditions.checkArgument(this.i[iIntValue][iIntValue2] == null, "duplicate key: (%s, %s)", rowKey, columnKey);
            this.i[iIntValue][iIntValue2] = cell.getValue();
            int[] iArr3 = this.g;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.h;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i] = iIntValue;
            iArr2[i] = iIntValue2;
        }
        this.j = iArr;
        this.k = iArr2;
        this.e = new f();
        this.f = new c();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o, com.google.common.collect.Table
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Integer num = this.c.get(obj);
        Integer num2 = this.d.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.i[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.a j() {
        return ImmutableTable.a.a(this, this.j, this.k);
    }

    @Override // com.google.common.collect.h2
    public Table.Cell<R, C, V> q(int i) {
        int i2 = this.j[i];
        int i3 = this.k[i];
        return ImmutableTable.g(rowKeySet().asList().get(i2), columnKeySet().asList().get(i3), this.i[i2][i3]);
    }

    @Override // com.google.common.collect.h2
    public V r(int i) {
        return this.i[this.j[i]][this.k[i]];
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.j.length;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.f);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.e);
    }
}

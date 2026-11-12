package com.google.common.collect;

import defpackage.b10;
import defpackage.uaq;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class k<R, C, V> extends f0<R, C, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableMap<R, Integer> f9187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableMap<C, Integer> f9188b;
    public final ImmutableMap<R, ImmutableMap<C, V>> c;
    public final ImmutableMap<C, ImmutableMap<R, V>> d;
    public final int[] e;
    public final int[] f;
    public final V[][] g;
    public final int[] h;
    public final int[] i;

    public final class b extends d<R, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9189b;

        public b(int i) {
            super(k.this.f[i]);
            this.f9189b = i;
        }

        @Override // com.google.common.collect.k.d
        public V c(int i) {
            return (V) k.this.g[i][this.f9189b];
        }

        @Override // com.google.common.collect.k.d
        public ImmutableMap<R, Integer> f() {
            return k.this.f9187a;
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return true;
        }
    }

    public final class c extends d<C, ImmutableMap<R, V>> {
        @Override // com.google.common.collect.k.d
        public ImmutableMap<C, Integer> f() {
            return k.this.f9188b;
        }

        @Override // com.google.common.collect.k.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public ImmutableMap<R, V> c(int i) {
            return new b(i);
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return false;
        }

        public c() {
            super(k.this.f.length);
        }
    }

    public static abstract class d<K, V> extends ImmutableMap.c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9191a;

        public class a extends b10<Map.Entry<K, V>> {
            public int c = -1;
            public final int d;

            public a() {
                this.d = d.this.f().size();
            }

            @Override // defpackage.b10
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> a() {
                int i = this.c;
                while (true) {
                    this.c = i + 1;
                    int i2 = this.c;
                    if (i2 >= this.d) {
                        return b();
                    }
                    Object objC = d.this.c(i2);
                    if (objC != null) {
                        return s.i(d.this.b(this.c), objC);
                    }
                    i = this.c;
                }
            }
        }

        public d(int i) {
            this.f9191a = i;
        }

        @Override // com.google.common.collect.ImmutableMap.c
        public uaq<Map.Entry<K, V>> a() {
            return new a();
        }

        public K b(int i) {
            return f().keySet().asList().get(i);
        }

        public abstract V c(int i);

        @Override // com.google.common.collect.ImmutableMap.c, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return d() ? f().keySet() : super.createKeySet();
        }

        public final boolean d() {
            return this.f9191a == f().size();
        }

        public abstract ImmutableMap<K, Integer> f();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public V get(Object obj) {
            Integer num = f().get(obj);
            if (num == null) {
                return null;
            }
            return c(num.intValue());
        }

        @Override // java.util.Map
        public int size() {
            return this.f9191a;
        }
    }

    public final class e extends d<C, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9192b;

        public e(int i) {
            super(k.this.e[i]);
            this.f9192b = i;
        }

        @Override // com.google.common.collect.k.d
        public V c(int i) {
            return (V) k.this.g[this.f9192b][i];
        }

        @Override // com.google.common.collect.k.d
        public ImmutableMap<C, Integer> f() {
            return k.this.f9188b;
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return true;
        }
    }

    public final class f extends d<R, ImmutableMap<C, V>> {
        @Override // com.google.common.collect.k.d
        public ImmutableMap<R, Integer> f() {
            return k.this.f9187a;
        }

        @Override // com.google.common.collect.k.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public ImmutableMap<C, V> c(int i) {
            return new e(i);
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return false;
        }

        public f() {
            super(k.this.e.length);
        }
    }

    public k(ImmutableList<q0.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        this.g = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size()));
        ImmutableMap<R, Integer> immutableMapJ = s.j(immutableSet);
        this.f9187a = immutableMapJ;
        ImmutableMap<C, Integer> immutableMapJ2 = s.j(immutableSet2);
        this.f9188b = immutableMapJ2;
        this.e = new int[immutableMapJ.size()];
        this.f = new int[immutableMapJ2.size()];
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            q0.a<R, C, V> aVar = immutableList.get(i);
            R rA = aVar.a();
            C columnKey = aVar.getColumnKey();
            Integer num = this.f9187a.get(rA);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = this.f9188b.get(columnKey);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            b(rA, columnKey, this.g[iIntValue][iIntValue2], aVar.getValue());
            this.g[iIntValue][iIntValue2] = aVar.getValue();
            int[] iArr3 = this.e;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.f;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i] = iIntValue;
            iArr2[i] = iIntValue2;
        }
        this.h = iArr;
        this.i = iArr2;
        this.c = new f();
        this.d = new c();
    }

    @Override // com.google.common.collect.ImmutableTable
    public ImmutableTable.b createSerializedForm() {
        return ImmutableTable.b.a(this, this.h, this.i);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.j
    public V get(Object obj, Object obj2) {
        Integer num = this.f9187a.get(obj);
        Integer num2 = this.f9188b.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.g[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.f0
    public q0.a<R, C, V> getCell(int i) {
        int i2 = this.h[i];
        int i3 = this.i[i];
        R r2 = rowKeySet().asList().get(i2);
        C c2 = columnKeySet().asList().get(i3);
        V v = this.g[i2][i3];
        Objects.requireNonNull(v);
        return ImmutableTable.cellOf(r2, c2, v);
    }

    @Override // com.google.common.collect.f0
    public V getValue(int i) {
        V v = this.g[this.h[i]][this.i[i]];
        Objects.requireNonNull(v);
        return v;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q0
    public int size() {
        return this.h.length;
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q0
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.d);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.q0
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.c);
    }
}

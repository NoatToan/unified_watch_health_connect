package com.google.common.collect;

import defpackage.c6i;
import defpackage.cpd;
import defpackage.d8g;
import defpackage.uaq;
import defpackage.xhe;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImmutableTable<R, C, V> extends j<R, C, V> implements Serializable {

    public static final class a<R, C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<q0.a<R, C, V>> f9082a = xhe.g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Comparator<? super R> f9083b;
        public Comparator<? super C> c;

        public ImmutableTable<R, C, V> a() {
            return b();
        }

        public ImmutableTable<R, C, V> b() {
            int size = this.f9082a.size();
            if (size != 0) {
                return size != 1 ? f0.c(this.f9082a, this.f9083b, this.c) : new j0((q0.a) cpd.h(this.f9082a));
            }
            return ImmutableTable.of();
        }

        public a<R, C, V> c(q0.a<? extends R, ? extends C, ? extends V> aVar) {
            if (aVar instanceof r0.c) {
                c6i.p(aVar.a(), "row");
                c6i.p(aVar.getColumnKey(), "column");
                c6i.p(aVar.getValue(), "value");
                this.f9082a.add(aVar);
            } else {
                d(aVar.a(), aVar.getColumnKey(), aVar.getValue());
            }
            return this;
        }

        public a<R, C, V> d(R r2, C c, V v) {
            this.f9082a.add(ImmutableTable.cellOf(r2, c, v));
            return this;
        }
    }

    public static final class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f9084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f9085b;
        public final Object[] c;
        public final int[] d;
        public final int[] e;

        public b(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f9084a = objArr;
            this.f9085b = objArr2;
            this.c = objArr3;
            this.d = iArr;
            this.e = iArr2;
        }

        public static b a(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            return new b(immutableTable.rowKeySet().toArray(), immutableTable.columnKeySet().toArray(), immutableTable.values().toArray(), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.c;
            if (objArr.length == 0) {
                return ImmutableTable.of();
            }
            int i = 0;
            if (objArr.length == 1) {
                return ImmutableTable.of(this.f9084a[0], this.f9085b[0], objArr[0]);
            }
            ImmutableList.a aVar = new ImmutableList.a(objArr.length);
            while (true) {
                Object[] objArr2 = this.c;
                if (i >= objArr2.length) {
                    return f0.e(aVar.k(), ImmutableSet.copyOf(this.f9084a), ImmutableSet.copyOf(this.f9085b));
                }
                aVar.a(ImmutableTable.cellOf(this.f9084a[this.d[i]], this.f9085b[this.e[i]], objArr2[i]));
                i++;
            }
        }
    }

    public static <R, C, V> a<R, C, V> builder() {
        return new a<>();
    }

    public static <R, C, V> q0.a<R, C, V> cellOf(R r2, C c, V v) {
        return r0.b(c6i.p(r2, "rowKey"), c6i.p(c, "columnKey"), c6i.p(v, "value"));
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(q0<? extends R, ? extends C, ? extends V> q0Var) {
        return q0Var instanceof ImmutableTable ? (ImmutableTable) q0Var : copyOf(q0Var.cellSet());
    }

    public static <R, C, V> ImmutableTable<R, C, V> of() {
        return (ImmutableTable<R, C, V>) n0.e;
    }

    @Override // com.google.common.collect.j
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q0
    public abstract ImmutableMap<C, Map<R, V>> columnMap();

    @Override // com.google.common.collect.j
    public boolean contains(Object obj, Object obj2) {
        return get(obj, obj2) != null;
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.j
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.j
    public abstract ImmutableSet<q0.a<R, C, V>> createCellSet();

    public abstract b createSerializedForm();

    @Override // com.google.common.collect.j
    public abstract ImmutableCollection<V> createValues();

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.j
    @Deprecated
    public final V put(R r2, C c, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.j
    @Deprecated
    public final void putAll(q0<? extends R, ? extends C, ? extends V> q0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.j
    @Deprecated
    public final V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.q0
    public abstract ImmutableMap<R, Map<C, V>> rowMap();

    @Override // com.google.common.collect.q0
    public abstract /* synthetic */ int size();

    @Override // com.google.common.collect.j
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.j
    public final Iterator<V> valuesIterator() {
        throw new AssertionError("should never be called");
    }

    public final Object writeReplace() {
        return createSerializedForm();
    }

    public static <R, C, V> ImmutableTable<R, C, V> of(R r2, C c, V v) {
        return new j0(r2, c, v);
    }

    @Override // com.google.common.collect.j
    public final uaq<q0.a<R, C, V>> cellIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.j, com.google.common.collect.q0
    public ImmutableSet<q0.a<R, C, V>> cellSet() {
        return (ImmutableSet) super.cellSet();
    }

    @Override // 
    /* JADX INFO: renamed from: column */
    public ImmutableMap<R, V> mo139column(C c) {
        c6i.p(c, "columnKey");
        return (ImmutableMap) d8g.a((ImmutableMap) columnMap().get(c), ImmutableMap.of());
    }

    @Override // com.google.common.collect.j, com.google.common.collect.q0
    public ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.q0
    public ImmutableMap<C, V> row(R r2) {
        c6i.p(r2, "rowKey");
        return (ImmutableMap) d8g.a((ImmutableMap) rowMap().get(r2), ImmutableMap.of());
    }

    @Override // com.google.common.collect.j, com.google.common.collect.q0
    public ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.j
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Iterable<? extends q0.a<? extends R, ? extends C, ? extends V>> iterable) {
        a aVarBuilder = builder();
        Iterator<? extends q0.a<? extends R, ? extends C, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            aVarBuilder.c(it.next());
        }
        return aVarBuilder.a();
    }
}

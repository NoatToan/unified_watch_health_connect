package com.google.common.collect;

import com.google.common.collect.f0;
import com.google.common.collect.q0;
import defpackage.c6i;
import defpackage.r7d;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class f0<R, C, V> extends ImmutableTable<R, C, V> {

    public final class b extends r7d<q0.a<R, C, V>> {
        public b() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof q0.a)) {
                return false;
            }
            q0.a aVar = (q0.a) obj;
            Object obj2 = f0.this.get(aVar.a(), aVar.getColumnKey());
            return obj2 != null && obj2.equals(aVar.getValue());
        }

        @Override // defpackage.r7d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public q0.a<R, C, V> get(int i) {
            return f0.this.getCell(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f0.this.size();
        }
    }

    public final class c extends ImmutableList<V> {
        public c() {
        }

        @Override // java.util.List
        public V get(int i) {
            return (V) f0.this.getValue(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return f0.this.size();
        }
    }

    public static <R, C, V> f0<R, C, V> c(List<q0.a<R, C, V>> list, final Comparator<? super R> comparator, final Comparator<? super C> comparator2) {
        c6i.o(list);
        if (comparator != null || comparator2 != null) {
            Collections.sort(list, new Comparator() { // from class: edk
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return f0.f(comparator, comparator2, (q0.a) obj, (q0.a) obj2);
                }
            });
        }
        return d(list, comparator, comparator2);
    }

    public static <R, C, V> f0<R, C, V> d(Iterable<q0.a<R, C, V>> iterable, Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(iterable);
        for (q0.a<R, C, V> aVar : iterable) {
            linkedHashSet.add(aVar.a());
            linkedHashSet2.add(aVar.getColumnKey());
        }
        return e(immutableListCopyOf, comparator == null ? ImmutableSet.copyOf((Collection) linkedHashSet) : ImmutableSet.copyOf((Collection) ImmutableList.sortedCopyOf(comparator, linkedHashSet)), comparator2 == null ? ImmutableSet.copyOf((Collection) linkedHashSet2) : ImmutableSet.copyOf((Collection) ImmutableList.sortedCopyOf(comparator2, linkedHashSet2)));
    }

    public static <R, C, V> f0<R, C, V> e(ImmutableList<q0.a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        return ((long) immutableList.size()) > (((long) immutableSet.size()) * ((long) immutableSet2.size())) / 2 ? new k(immutableList, immutableSet, immutableSet2) : new n0(immutableList, immutableSet, immutableSet2);
    }

    public static /* synthetic */ int f(Comparator comparator, Comparator comparator2, q0.a aVar, q0.a aVar2) {
        int iCompare = comparator == null ? 0 : comparator.compare(aVar.a(), aVar2.a());
        if (iCompare != 0) {
            return iCompare;
        }
        if (comparator2 == null) {
            return 0;
        }
        return comparator2.compare(aVar.getColumnKey(), aVar2.getColumnKey());
    }

    public final void b(R r2, C c2, V v, V v2) {
        c6i.l(v == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", r2, c2, v2, v);
    }

    public abstract q0.a<R, C, V> getCell(int i);

    public abstract V getValue(int i);

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.j
    public final ImmutableSet<q0.a<R, C, V>> createCellSet() {
        return isEmpty() ? ImmutableSet.of() : new b();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.j
    public final ImmutableCollection<V> createValues() {
        return isEmpty() ? ImmutableList.of() : new c();
    }
}

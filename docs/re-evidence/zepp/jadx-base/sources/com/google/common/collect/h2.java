package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
abstract class h2<R, C, V> extends ImmutableTable<R, C, V> {

    public static class a implements Comparator<Table.Cell<R, C, V>> {
        public final /* synthetic */ Comparator a;
        public final /* synthetic */ Comparator b;

        public a(Comparator comparator, Comparator comparator2) {
            this.a = comparator;
            this.b = comparator2;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Table.Cell<R, C, V> cell, Table.Cell<R, C, V> cell2) {
            Comparator comparator = this.a;
            int iCompare = comparator == null ? 0 : comparator.compare(cell.getRowKey(), cell2.getRowKey());
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator comparator2 = this.b;
            if (comparator2 == null) {
                return 0;
            }
            return comparator2.compare(cell.getColumnKey(), cell2.getColumnKey());
        }
    }

    public final class b extends n1<Table.Cell<R, C, V>> {
        private b() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            Object obj2 = h2.this.get(cell.getRowKey(), cell.getColumnKey());
            return obj2 != null && obj2.equals(cell.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return false;
        }

        @Override // com.google.common.collect.n1
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Table.Cell<R, C, V> get(int i) {
            return h2.this.q(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h2.this.size();
        }

        public /* synthetic */ b(h2 h2Var, a aVar) {
            this();
        }
    }

    public final class c extends ImmutableList<V> {
        private c() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return true;
        }

        @Override // java.util.List
        public V get(int i) {
            return (V) h2.this.r(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return h2.this.size();
        }

        public /* synthetic */ c(h2 h2Var, a aVar) {
            this();
        }
    }

    public static <R, C, V> h2<R, C, V> m(Iterable<Table.Cell<R, C, V>> iterable) {
        return o(iterable, null, null);
    }

    public static <R, C, V> h2<R, C, V> n(List<Table.Cell<R, C, V>> list, @NullableDecl Comparator<? super R> comparator, @NullableDecl Comparator<? super C> comparator2) {
        Preconditions.checkNotNull(list);
        if (comparator != null || comparator2 != null) {
            Collections.sort(list, new a(comparator, comparator2));
        }
        return o(list, comparator, comparator2);
    }

    private static <R, C, V> h2<R, C, V> o(Iterable<Table.Cell<R, C, V>> iterable, @NullableDecl Comparator<? super R> comparator, @NullableDecl Comparator<? super C> comparator2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(iterable);
        for (Table.Cell<R, C, V> cell : iterable) {
            linkedHashSet.add(cell.getRowKey());
            linkedHashSet2.add(cell.getColumnKey());
        }
        return p(immutableListCopyOf, comparator == null ? ImmutableSet.copyOf((Collection) linkedHashSet) : ImmutableSet.copyOf((Collection) ImmutableList.sortedCopyOf(comparator, linkedHashSet)), comparator2 == null ? ImmutableSet.copyOf((Collection) linkedHashSet2) : ImmutableSet.copyOf((Collection) ImmutableList.sortedCopyOf(comparator2, linkedHashSet2)));
    }

    public static <R, C, V> h2<R, C, V> p(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        return ((long) immutableList.size()) > (((long) immutableSet.size()) * ((long) immutableSet2.size())) / 2 ? new e0(immutableList, immutableSet, immutableSet2) : new s2(immutableList, immutableSet, immutableSet2);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<Table.Cell<R, C, V>> b() {
        return isEmpty() ? ImmutableSet.of() : new b(this, null);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.o
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ImmutableCollection<V> c() {
        return isEmpty() ? ImmutableList.of() : new c(this, null);
    }

    public abstract Table.Cell<R, C, V> q(int i);

    public abstract V r(int i);
}

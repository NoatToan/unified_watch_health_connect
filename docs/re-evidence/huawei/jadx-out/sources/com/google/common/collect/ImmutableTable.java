package com.google.common.collect;

import com.google.android.gms.fitness.data.WorkoutExercises;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.DoNotMock;
import defpackage.aml;
import defpackage.amn;
import defpackage.ank;
import defpackage.anr;
import defpackage.ant;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 912559;

    @Override // com.google.common.collect.Table
    public abstract ImmutableMap<C, Map<R, V>> columnMap();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.AbstractTable
    public abstract ImmutableSet<Table.Cell<R, C, V>> createCellSet();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.AbstractTable
    public abstract ImmutableCollection<V> createValues();

    @Override // com.google.common.collect.Table
    public abstract ImmutableMap<R, Map<C, V>> rowMap();

    protected abstract Object writeReplace();

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(@CheckForNull Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(@CheckForNull Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    public /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3) {
        return anr.e(function, function2, function3);
    }

    static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3, BinaryOperator<V> binaryOperator) {
        return anr.e(function, function2, function3, binaryOperator);
    }

    public static <R, C, V> ImmutableTable<R, C, V> of() {
        return (ImmutableTable<R, C, V>) ant.d;
    }

    public static <R, C, V> ImmutableTable<R, C, V> of(R r, C c2, V v) {
        return new ank(r, c2, v);
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Table<? extends R, ? extends C, ? extends V> table) {
        if (table instanceof ImmutableTable) {
            return (ImmutableTable) table;
        }
        return copyOf(table.cellSet());
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Iterable<? extends Table.Cell<? extends R, ? extends C, ? extends V>> iterable) {
        a aVarBuilder = builder();
        Iterator<? extends Table.Cell<? extends R, ? extends C, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            aVarBuilder.b(it.next());
        }
        return aVarBuilder.e();
    }

    public static <R, C, V> a<R, C, V> builder() {
        return new a<>();
    }

    protected static <R, C, V> Table.Cell<R, C, V> cellOf(R r, C c2, V v) {
        return Tables.c(Preconditions.checkNotNull(r, "rowKey"), Preconditions.checkNotNull(c2, "columnKey"), Preconditions.checkNotNull(v, "value"));
    }

    @DoNotMock
    public static final class a<R, C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        private Comparator<? super R> f4390a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        private Comparator<? super C> f4391c;
        private final List<Table.Cell<R, C, V>> d = aml.e();

        public a<R, C, V> d(R r, C c2, V v) {
            this.d.add(ImmutableTable.cellOf(r, c2, v));
            return this;
        }

        public a<R, C, V> b(Table.Cell<? extends R, ? extends C, ? extends V> cell) {
            if (cell instanceof Tables.b) {
                Preconditions.checkNotNull(cell.getRowKey(), WorkoutExercises.ROW);
                Preconditions.checkNotNull(cell.getColumnKey(), "column");
                Preconditions.checkNotNull(cell.getValue(), "value");
                this.d.add(cell);
                return this;
            }
            d(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
            return this;
        }

        public a<R, C, V> e(a<R, C, V> aVar) {
            this.d.addAll(aVar.d);
            return this;
        }

        public ImmutableTable<R, C, V> e() {
            return d();
        }

        public ImmutableTable<R, C, V> d() {
            int size = this.d.size();
            if (size == 0) {
                return ImmutableTable.of();
            }
            if (size == 1) {
                return new ank((Table.Cell) amn.c(this.d));
            }
            return RegularImmutableTable.forCells(this.d, this.f4390a, this.f4391c);
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<Table.Cell<R, C, V>> cellSet() {
        return (ImmutableSet) super.cellSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractTable
    public final UnmodifiableIterator<Table.Cell<R, C, V>> cellIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }

    @Override // com.google.common.collect.AbstractTable
    final Iterator<V> valuesIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.Table
    public ImmutableMap<R, V> column(C c2) {
        Preconditions.checkNotNull(c2, "columnKey");
        return (ImmutableMap) MoreObjects.firstNonNull((ImmutableMap) columnMap().get(c2), ImmutableMap.of());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public ImmutableMap<C, V> row(R r) {
        Preconditions.checkNotNull(r, "rowKey");
        return (ImmutableMap) MoreObjects.firstNonNull((ImmutableMap) rowMap().get(r), ImmutableMap.of());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return get(obj, obj2) != null;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    @Deprecated
    public final V put(R r, C c2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @Deprecated
    public final void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    public static final class e implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f4392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object[] f4393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f4394c;
        private final int[] d;
        private final Object[] e;

        private e(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f4392a = objArr;
            this.f4393b = objArr2;
            this.e = objArr3;
            this.d = iArr;
            this.f4394c = iArr2;
        }

        public static e e(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            return new e(immutableTable.rowKeySet().toArray(), immutableTable.columnKeySet().toArray(), immutableTable.values().toArray(), iArr, iArr2);
        }

        Object readResolve() {
            Object[] objArr = this.e;
            if (objArr.length == 0) {
                return ImmutableTable.of();
            }
            int i = 0;
            if (objArr.length == 1) {
                return ImmutableTable.of(this.f4392a[0], this.f4393b[0], objArr[0]);
            }
            ImmutableList.c cVar = new ImmutableList.c(this.e.length);
            while (true) {
                Object[] objArr2 = this.e;
                if (i < objArr2.length) {
                    cVar.add(ImmutableTable.cellOf(this.f4392a[this.d[i]], this.f4393b[this.f4394c[i]], objArr2[i]));
                    i++;
                } else {
                    return RegularImmutableTable.forOrderedComponents(cVar.build(), ImmutableSet.copyOf(this.f4392a), ImmutableSet.copyOf(this.f4393b));
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}

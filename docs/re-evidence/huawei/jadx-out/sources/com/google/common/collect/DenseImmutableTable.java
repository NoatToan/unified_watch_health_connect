package com.google.common.collect;

import androidx.exifinterface.media.ExifInterface;
import com.google.errorprone.annotations.Immutable;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@Immutable(containerOf = {"R", TypeParams.SEARCH_CODE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@ElementTypesAreNonnullByDefault
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f4317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f4318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImmutableMap<C, Integer> f4319c;
    private final ImmutableMap<C, ImmutableMap<R, V>> d;
    private final int[] e;
    private final V[][] f;
    private final int[] g;
    private final ImmutableMap<R, Integer> h;
    private final ImmutableMap<R, ImmutableMap<C, V>> j;

    DenseImmutableTable(ImmutableList<Table.Cell<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        this.f = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size()));
        ImmutableMap<R, Integer> immutableMapC = Maps.c(immutableSet);
        this.h = immutableMapC;
        ImmutableMap<C, Integer> immutableMapC2 = Maps.c(immutableSet2);
        this.f4319c = immutableMapC2;
        this.g = new int[immutableMapC.size()];
        this.f4317a = new int[immutableMapC2.size()];
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i = 0; i < immutableList.size(); i++) {
            Table.Cell<R, C, V> cell = immutableList.get(i);
            R rowKey = cell.getRowKey();
            C columnKey = cell.getColumnKey();
            int iIntValue = ((Integer) Objects.requireNonNull(this.h.get(rowKey))).intValue();
            int iIntValue2 = ((Integer) Objects.requireNonNull(this.f4319c.get(columnKey))).intValue();
            checkNoDuplicate(rowKey, columnKey, this.f[iIntValue][iIntValue2], cell.getValue());
            this.f[iIntValue][iIntValue2] = cell.getValue();
            int[] iArr3 = this.g;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.f4317a;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i] = iIntValue;
            iArr2[i] = iIntValue2;
        }
        this.f4318b = iArr;
        this.e = iArr2;
        this.j = new c();
        this.d = new a();
    }

    static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
        private final int size;

        @CheckForNull
        abstract V getValue(int i);

        abstract ImmutableMap<K, Integer> keyToIndex();

        ImmutableArrayMap(int i) {
            this.size = i;
        }

        private boolean isFull() {
            return this.size == keyToIndex().size();
        }

        K getKey(int i) {
            return keyToIndex().keySet().asList().get(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        protected ImmutableSet<K> createKeySet() {
            return isFull() ? keyToIndex().keySet() : super.createKeySet();
        }

        @Override // java.util.Map
        public int size() {
            return this.size;
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        @CheckForNull
        public V get(@CheckForNull Object obj) {
            Integer num = keyToIndex().get(obj);
            if (num == null) {
                return null;
            }
            return getValue(num.intValue());
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        UnmodifiableIterator<Map.Entry<K, V>> entryIterator() {
            return new AbstractIterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f4320a;
                private int e = -1;

                {
                    this.f4320a = ImmutableArrayMap.this.keyToIndex().size();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                @CheckForNull
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> computeNext() {
                    Object value;
                    do {
                        int i = this.e + 1;
                        this.e = i;
                        if (i < this.f4320a) {
                            value = ImmutableArrayMap.this.getValue(i);
                        } else {
                            return endOfData();
                        }
                    } while (value == null);
                    return Maps.c(ImmutableArrayMap.this.getKey(this.e), value);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    final class b extends ImmutableArrayMap<C, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4322b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap
        protected boolean isPartialView() {
            return true;
        }

        b(int i) {
            super(DenseImmutableTable.this.g[i]);
            this.f4322b = i;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<C, Integer> keyToIndex() {
            return DenseImmutableTable.this.f4319c;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        @CheckForNull
        V getValue(int i) {
            return (V) DenseImmutableTable.this.f[this.f4322b][i];
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    final class d extends ImmutableArrayMap<R, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4325b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap
        protected boolean isPartialView() {
            return true;
        }

        d(int i) {
            super(DenseImmutableTable.this.f4317a[i]);
            this.f4325b = i;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<R, Integer> keyToIndex() {
            return DenseImmutableTable.this.h;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        @CheckForNull
        V getValue(int i) {
            return (V) DenseImmutableTable.this.f[i][this.f4325b];
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    final class c extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap
        protected boolean isPartialView() {
            return false;
        }

        private c() {
            super(DenseImmutableTable.this.g.length);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<R, Integer> keyToIndex() {
            return DenseImmutableTable.this.h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ImmutableMap<C, V> getValue(int i) {
            return new b(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    final class a extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap
        protected boolean isPartialView() {
            return false;
        }

        private a() {
            super(DenseImmutableTable.this.f4317a.length);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap<C, Integer> keyToIndex() {
            return DenseImmutableTable.this.f4319c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImmutableMap<R, V> getValue(int i) {
            return new d(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.d);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.j);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CheckForNull
    public V get(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Integer num = this.h.get(obj);
        Integer num2 = this.f4319c.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.f4318b.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.RegularImmutableTable
    protected Table.Cell<R, C, V> getCell(int i) {
        int i2 = this.f4318b[i];
        int i3 = this.e[i];
        return cellOf(rowKeySet().asList().get(i2), columnKeySet().asList().get(i3), Objects.requireNonNull(this.f[i2][i3]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.RegularImmutableTable
    protected V getValue(int i) {
        return (V) Objects.requireNonNull(this.f[this.f4318b[i]][this.e[i]]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    protected Object writeReplace() {
        return ImmutableTable.e.e(this, this.f4318b, this.e);
    }
}

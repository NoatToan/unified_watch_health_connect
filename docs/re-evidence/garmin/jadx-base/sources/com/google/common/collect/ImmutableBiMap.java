package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {
    private static final long serialVersionUID = 912559;

    @J2ktIncompatible
    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        public SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public Builder<K, V> makeBuilder(int i14) {
            return new Builder<>(i14);
        }
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedSize(int i14) {
        CollectPreconditions.checkNonnegative(i14, "expectedSize");
        return new Builder<>(i14);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4).putAll((Iterable) iterable).build();
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19, K k24, V v24, K k25, V v25, K k26, V v26, K k27, V v27) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        CollectPreconditions.checkEntryNotNull(k19, v19);
        CollectPreconditions.checkEntryNotNull(k24, v24);
        CollectPreconditions.checkEntryNotNull(k25, v25);
        CollectPreconditions.checkEntryNotNull(k26, v26);
        CollectPreconditions.checkEntryNotNull(k27, v27);
        return new RegularImmutableBiMap(new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19, k24, v24, k25, v25, k26, v26, k27, v27}, 10);
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> toImmutableBiMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableBiMap(function, function2);
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableBiMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V forcePut(K k14, V v14) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.BiMap
    public abstract ImmutableBiMap<V, K> inverse();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public Builder() {
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @DoNotCall
        @Deprecated
        public ImmutableBiMap<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> buildOrThrow() {
            int i14 = this.size;
            if (i14 == 0) {
                return ImmutableBiMap.of();
            }
            if (this.valueComparator != null) {
                if (this.entriesUsed) {
                    this.alternatingKeysAndValues = Arrays.copyOf(this.alternatingKeysAndValues, i14 * 2);
                }
                ImmutableMap.Builder.sortEntries(this.alternatingKeysAndValues, this.size, this.valueComparator);
            }
            this.entriesUsed = true;
            return new RegularImmutableBiMap(this.alternatingKeysAndValues, this.size);
        }

        public Builder(int i14) {
            super(i14);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> combine(ImmutableMap.Builder<K, V> builder) {
            super.combine((ImmutableMap.Builder) builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            super.orderEntriesByValue((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k14, V v14) {
            super.put((Object) k14, (Object) v14);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll((Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableBiMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k14, V v14) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        return new RegularImmutableBiMap(new Object[]{k14, v14}, 1);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k14, V v14, K k15, V v15) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        return new RegularImmutableBiMap(new Object[]{k14, v14, k15, v15}, 2);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        return new RegularImmutableBiMap(new Object[]{k14, v14, k15, v15, k16, v16}, 3);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        return new RegularImmutableBiMap(new Object[]{k14, v14, k15, v15, k16, v16, k17, v17}, 4);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        return new RegularImmutableBiMap(new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18}, 5);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        CollectPreconditions.checkEntryNotNull(k19, v19);
        return new RegularImmutableBiMap(new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19}, 6);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19, K k24, V v24) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        CollectPreconditions.checkEntryNotNull(k19, v19);
        CollectPreconditions.checkEntryNotNull(k24, v24);
        return new RegularImmutableBiMap(new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19, k24, v24}, 7);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19, K k24, V v24, K k25, V v25) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        CollectPreconditions.checkEntryNotNull(k19, v19);
        CollectPreconditions.checkEntryNotNull(k24, v24);
        CollectPreconditions.checkEntryNotNull(k25, v25);
        return new RegularImmutableBiMap(new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19, k24, v24, k25, v25}, 8);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19, K k24, V v24, K k25, V v25, K k26, V v26) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        CollectPreconditions.checkEntryNotNull(k19, v19);
        CollectPreconditions.checkEntryNotNull(k24, v24);
        CollectPreconditions.checkEntryNotNull(k25, v25);
        CollectPreconditions.checkEntryNotNull(k26, v26);
        return new RegularImmutableBiMap(new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19, k24, v24, k25, v25, k26, v26}, 9);
    }

    public static <K, V> ImmutableBiMap<K, V> of() {
        return RegularImmutableBiMap.EMPTY;
    }
}

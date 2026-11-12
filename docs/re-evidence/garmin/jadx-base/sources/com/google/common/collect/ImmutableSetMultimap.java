package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import i3.e5;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements SetMultimap<K, V> {

    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    private final transient ImmutableSet<V> emptySet;

    @RetainedWith
    @LazyInit
    private transient ImmutableSet<Map.Entry<K, V>> entries;

    @RetainedWith
    @LazyInit
    private transient ImmutableSetMultimap<V, K> inverse;

    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        @Weak
        private final transient ImmutableSetMultimap<K, V> multimap;

        public EntrySet(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.multimap = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static final class SetFieldSettersHolder {
        static final Serialization.FieldSetter<? super ImmutableSetMultimap<?, ?>> EMPTY_SET_FIELD_SETTER = Serialization.getFieldSetter(ImmutableSetMultimap.class, "emptySet");

        private SetFieldSettersHolder() {
        }
    }

    public ImmutableSetMultimap(ImmutableMap<K, ImmutableSet<V>> immutableMap, int i14, Comparator<? super V> comparator) {
        super(immutableMap, i14);
        this.emptySet = emptySet(comparator);
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedKeys(int i14) {
        CollectPreconditions.checkNonnegative(i14, "expectedKeys");
        return new Builder<>(i14);
    }

    private static <K, V> ImmutableSetMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap, Comparator<? super V> comparator) {
        Preconditions.checkNotNull(multimap);
        if (multimap.isEmpty() && comparator == null) {
            return of();
        }
        if (multimap instanceof ImmutableSetMultimap) {
            ImmutableSetMultimap<K, V> immutableSetMultimap = (ImmutableSetMultimap) multimap;
            if (!immutableSetMultimap.isPartialView()) {
                return immutableSetMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), comparator);
    }

    private static <V> ImmutableSet<V> emptySet(Comparator<? super V> comparator) {
        return comparator == null ? ImmutableSet.of() : ImmutableSortedSet.emptySet(comparator);
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        return CollectCollectors.flatteningToImmutableSetMultimap(function, function2);
    }

    public static <K, V> ImmutableSetMultimap<K, V> fromMapBuilderEntries(Collection<? extends Map.Entry<K, ImmutableCollection.Builder<V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int size = 0;
        for (Map.Entry<K, ImmutableCollection.Builder<V>> entry : collection) {
            K key = entry.getKey();
            ImmutableSet immutableSetValueSet = valueSet(comparator, ((ImmutableSet.Builder) entry.getValue()).build());
            if (!immutableSetValueSet.isEmpty()) {
                builder.put(key, immutableSetValueSet);
                size = immutableSetValueSet.size() + size;
            }
        }
        return new ImmutableSetMultimap<>(builder.buildOrThrow(), size, comparator);
    }

    public static <K, V> ImmutableSetMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            ImmutableSet immutableSetValueSet = valueSet(comparator, entry.getValue());
            if (!immutableSetValueSet.isEmpty()) {
                builder.put(key, immutableSetValueSet);
                size = immutableSetValueSet.size() + size;
            }
        }
        return new ImmutableSetMultimap<>(builder.buildOrThrow(), size, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableSetMultimap<V, K> invert() {
        Builder builder = builder();
        UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.put(entry.getValue(), entry.getKey());
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapBuild = builder.build();
        immutableSetMultimapBuild.inverse = this;
        return immutableSetMultimapBuild;
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        Builder builder = builder();
        builder.put((Object) k14, (Object) v14);
        builder.put((Object) k15, (Object) v15);
        builder.put((Object) k16, (Object) v16);
        builder.put((Object) k17, (Object) v17);
        builder.put((Object) k18, (Object) v18);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i14 = objectInputStream.readInt();
        if (i14 < 0) {
            throw new InvalidObjectException(am.j.h(i14, "Invalid key count "));
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i17 = objectInputStream.readInt();
            if (i17 <= 0) {
                throw new InvalidObjectException(am.j.h(i17, "Invalid value count "));
            }
            ImmutableSet.Builder builderValuesBuilder = valuesBuilder(comparator);
            for (int i18 = 0; i18 < i17; i18++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                builderValuesBuilder.add(object2);
            }
            ImmutableSet immutableSetBuild = builderValuesBuilder.build();
            if (immutableSetBuild.size() != i17) {
                throw new InvalidObjectException(e5.f(object, "Duplicate key-value pairs exist for key "));
            }
            builder.put(object, immutableSetBuild);
            i15 += i17;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set(this, builder.buildOrThrow());
            ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set(this, i15);
            SetFieldSettersHolder.EMPTY_SET_FIELD_SETTER.set(this, emptySet(comparator));
        } catch (IllegalArgumentException e4) {
            throw ((InvalidObjectException) new InvalidObjectException(e4.getMessage()).initCause(e4));
        }
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> toImmutableSetMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableSetMultimap(function, function2);
    }

    private static <V> ImmutableSet<V> valueSet(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? ImmutableSet.copyOf((Collection) collection) : ImmutableSortedSet.copyOf((Comparator) comparator, (Collection) collection);
    }

    private static <V> ImmutableSet.Builder<V> valuesBuilder(Comparator<? super V> comparator) {
        return comparator == null ? new ImmutableSet.Builder<>() : new ImmutableSortedSet.Builder(comparator);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        Serialization.writeMultimap(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public ImmutableSet<Map.Entry<K, V>> entries() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entries;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.entries = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableSet<V> get(K k14) {
        return (ImmutableSet) MoreObjects.firstNonNull((ImmutableSet) this.map.get(k14), this.emptySet);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableSetMultimap<V, K> inverse() {
        ImmutableSetMultimap<V, K> immutableSetMultimap = this.inverse;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<V, K> immutableSetMultimapInvert = invert();
        this.inverse = immutableSetMultimapInvert;
        return immutableSetMultimapInvert;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableSet<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableSet<V> replaceValues(K k14, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public Comparator<? super V> valueComparator() {
        ImmutableSet<V> immutableSet = this.emptySet;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        public Builder() {
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public ImmutableSetMultimap<K, V> build() {
            Map<K, ImmutableCollection.Builder<V>> map = this.builderMap;
            if (map == null) {
                return ImmutableSetMultimap.of();
            }
            Collection collectionEntrySet = map.entrySet();
            Comparator<? super K> comparator = this.keyComparator;
            if (comparator != null) {
                collectionEntrySet = Ordering.from(comparator).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return ImmutableSetMultimap.fromMapBuilderEntries(collectionEntrySet, this.valueComparator);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public int expectedValueCollectionSize(int i14, Iterable<?> iterable) {
            return iterable instanceof Set ? Math.max(i14, ((Set) iterable).size()) : i14;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public ImmutableCollection.Builder<V> newValueCollectionBuilderWithExpectedSize(int i14) {
            Comparator<? super V> comparator = this.valueComparator;
            return comparator == null ? ImmutableSet.builderWithExpectedSize(i14) : new ImmutableSortedSet.Builder(comparator, i14);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                putAll((Object) entry.getKey(), (Iterable) entry.getValue());
            }
            return this;
        }

        public Builder(int i14) {
            super(i14);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> combine(ImmutableMultimap.Builder<K, V> builder) {
            super.combine((ImmutableMultimap.Builder) builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> expectedValuesPerKey(int i14) {
            super.expectedValuesPerKey(i14);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderKeysBy(Comparator<? super K> comparator) {
            super.orderKeysBy((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderValuesBy(Comparator<? super V> comparator) {
            super.orderValuesBy((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k14, V v14) {
            super.put((Object) k14, (Object) v14);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k14, Iterable<? extends V> iterable) {
            super.putAll((Object) k14, (Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k14, V... vArr) {
            return putAll((Object) k14, (Iterable) Arrays.asList(vArr));
        }
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k14, V v14) {
        Builder builder = builder();
        builder.put((Object) k14, (Object) v14);
        return builder.build();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k14, V v14, K k15, V v15) {
        Builder builder = builder();
        builder.put((Object) k14, (Object) v14);
        builder.put((Object) k15, (Object) v15);
        return builder.build();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16) {
        Builder builder = builder();
        builder.put((Object) k14, (Object) v14);
        builder.put((Object) k15, (Object) v15);
        builder.put((Object) k16, (Object) v16);
        return builder.build();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        Builder builder = builder();
        builder.put((Object) k14, (Object) v14);
        builder.put((Object) k15, (Object) v15);
        builder.put((Object) k16, (Object) v16);
        builder.put((Object) k17, (Object) v17);
        return builder.build();
    }

    public static <K, V> ImmutableSetMultimap<K, V> of() {
        return EmptyImmutableSetMultimap.INSTANCE;
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        return copyOf(multimap, null);
    }

    public static <K, V> ImmutableSetMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder().putAll((Iterable) iterable).build();
    }
}

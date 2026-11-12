package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {

    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    @RetainedWith
    @LazyInit
    private transient ImmutableListMultimap<V, K> inverse;

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i14) {
        super(immutableMap, i14);
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedKeys(int i14) {
        CollectPreconditions.checkNonnegative(i14, "expectedKeys");
        return new Builder<>(i14);
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return of();
        }
        if (multimap instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) multimap;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), null);
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        return CollectCollectors.flatteningToImmutableListMultimap(function, function2);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapBuilderEntries(Collection<? extends Map.Entry<K, ImmutableCollection.Builder<V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int size = 0;
        for (Map.Entry<K, ImmutableCollection.Builder<V>> entry : collection) {
            K key = entry.getKey();
            ImmutableList.Builder builder2 = (ImmutableList.Builder) entry.getValue();
            ImmutableList immutableListBuild = comparator == null ? builder2.build() : builder2.buildSorted(comparator);
            builder.put(key, immutableListBuild);
            size += immutableListBuild.size();
        }
        return new ImmutableListMultimap<>(builder.buildOrThrow(), size);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            ImmutableList immutableListCopyOf = comparator == null ? ImmutableList.copyOf((Collection) value) : ImmutableList.sortedCopyOf(comparator, value);
            if (!immutableListCopyOf.isEmpty()) {
                builder.put(key, immutableListCopyOf);
                size = immutableListCopyOf.size() + size;
            }
        }
        return new ImmutableListMultimap<>(builder.buildOrThrow(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableListMultimap<V, K> invert() {
        Builder builder = builder();
        UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.put(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> immutableListMultimapBuild = builder.build();
        immutableListMultimapBuild.inverse = this;
        return immutableListMultimapBuild;
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
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
            ImmutableList.Builder builder2 = ImmutableList.builder();
            for (int i18 = 0; i18 < i17; i18++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                builder2.add(object2);
            }
            builder.put(object, builder2.build());
            i15 += i17;
        }
        try {
            ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set(this, builder.buildOrThrow());
            ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set(this, i15);
        } catch (IllegalArgumentException e4) {
            throw ((InvalidObjectException) new InvalidObjectException(e4.getMessage()).initCause(e4));
        }
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> toImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableListMultimap(function, function2);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultimap(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableList<V> get(K k14) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k14);
        return immutableList == null ? ImmutableList.of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> immutableListMultimapInvert = invert();
        this.inverse = immutableListMultimapInvert;
        return immutableListMultimapInvert;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableList<V> replaceValues(K k14, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        public Builder() {
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public ImmutableListMultimap<K, V> build() {
            return (ImmutableListMultimap) super.build();
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
            super.putAll((Object) k14, (Object[]) vArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            super.putAll((Multimap) multimap);
            return this;
        }
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k14, V v14) {
        Builder builder = builder();
        builder.put((Object) k14, (Object) v14);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k14, V v14, K k15, V v15) {
        Builder builder = builder();
        builder.put((Object) k14, (Object) v14);
        builder.put((Object) k15, (Object) v15);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16) {
        Builder builder = builder();
        builder.put((Object) k14, (Object) v14);
        builder.put((Object) k15, (Object) v15);
        builder.put((Object) k16, (Object) v16);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        Builder builder = builder();
        builder.put((Object) k14, (Object) v14);
        builder.put((Object) k15, (Object) v15);
        builder.put((Object) k16, (Object) v16);
        builder.put((Object) k17, (Object) v17);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder().putAll((Iterable) iterable).build();
    }

    public static <K, V> ImmutableListMultimap<K, V> of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }
}

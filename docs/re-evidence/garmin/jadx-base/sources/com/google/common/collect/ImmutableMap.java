package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true, serializable = true)
@DoNotMock("Use ImmutableMap.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    private static final long serialVersionUID = 912559;

    @RetainedWith
    @LazyInit
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;

    @RetainedWith
    @LazyInit
    private transient ImmutableSet<K> keySet;

    @LazyInit
    private transient ImmutableSetMultimap<K, V> multimapView;

    @RetainedWith
    @LazyInit
    private transient ImmutableCollection<V> values;

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
            return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap.1EntrySetImpl
                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
                public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedImmutableMap.this.entryIterator();
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet
                public ImmutableMap<K, V> map() {
                    return IteratorBasedImmutableMap.this;
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                @GwtIncompatible
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap
        public ImmutableCollection<V> createValues() {
            return new ImmutableMapValues(this);
        }

        public abstract UnmodifiableIterator<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }

        @Override // com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class MapViewOfValuesAsSingletonSets extends IteratorBasedImmutableMap<K, ImmutableSet<V>> {
        private MapViewOfValuesAsSingletonSets() {
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public boolean containsKey(Object obj) {
            return ImmutableMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public ImmutableSet<K> createKeySet() {
            return ImmutableMap.this.keySet();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>> entryIterator() {
            final UnmodifiableIterator<Map.Entry<K, V>> it = ImmutableMap.this.entrySet().iterator();
            return new UnmodifiableIterator<Map.Entry<K, ImmutableSet<V>>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1
                final /* synthetic */ MapViewOfValuesAsSingletonSets this$1;

                {
                    this.this$1 = this;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                public Map.Entry<K, ImmutableSet<V>> next() {
                    final Map.Entry entry = (Map.Entry) it.next();
                    return new AbstractMapEntry<K, ImmutableSet<V>>(this) { // from class: com.google.common.collect.ImmutableMap.MapViewOfValuesAsSingletonSets.1.1
                        final /* synthetic */ AnonymousClass1 this$2;

                        {
                            this.this$2 = this;
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public K getKey() {
                            return (K) entry.getKey();
                        }

                        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                        public ImmutableSet<V> getValue() {
                            return ImmutableSet.of(entry.getValue());
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public ImmutableSet<V> get(Object obj) {
            Object obj2 = ImmutableMap.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return ImmutableSet.of(obj2);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public int hashCode() {
            return ImmutableMap.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isHashCodeFast() {
            return ImmutableMap.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.ImmutableMap
        public boolean isPartialView() {
            return ImmutableMap.this.isPartialView();
        }

        @Override // java.util.Map
        public int size() {
            return ImmutableMap.this.size();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @J2ktIncompatible
    public static class SerializedForm<K, V> implements Serializable {
        private static final boolean USE_LEGACY_SERIALIZATION = true;
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
            int i14 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i14] = next.getKey();
                objArr2[i14] = next.getValue();
                i14++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object legacyReadResolve() {
            Object[] objArr = (Object[]) this.keys;
            Object[] objArr2 = (Object[]) this.values;
            Builder<K, V> builderMakeBuilder = makeBuilder(objArr.length);
            for (int i14 = 0; i14 < objArr.length; i14++) {
                builderMakeBuilder.put(objArr[i14], objArr2[i14]);
            }
            return builderMakeBuilder.buildOrThrow();
        }

        public Builder<K, V> makeBuilder(int i14) {
            return new Builder<>(i14);
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                return legacyReadResolve();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            ImmutableCollection immutableCollection = (ImmutableCollection) this.values;
            Builder<K, V> builderMakeBuilder = makeBuilder(immutableSet.size());
            UnmodifiableIterator it = immutableSet.iterator();
            UnmodifiableIterator it3 = immutableCollection.iterator();
            while (it.hasNext()) {
                builderMakeBuilder.put(it.next(), it3.next());
            }
            return builderMakeBuilder.buildOrThrow();
        }
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedSize(int i14) {
        CollectPreconditions.checkNonnegative(i14, "expectedSize");
        return new Builder<>(i14);
    }

    public static void checkNoConflict(boolean z14, String str, Object obj, Object obj2) {
        if (!z14) {
            throw conflictException(str, obj, obj2);
        }
    }

    public static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        return copyOf(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> entryOf(K k14, V v14) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        return new AbstractMap.SimpleImmutableEntry(k14, v14);
    }

    public static <K, V> ImmutableMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19, K k24, V v24, K k25, V v25, K k26, V v26, K k27, V v27) {
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
        return RegularImmutableMap.create(10, new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19, k24, v24, k25, v25, k26, v26, k27, v27});
    }

    @SafeVarargs
    public static <K, V> ImmutableMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf(Arrays.asList(entryArr));
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableMap(function, function2);
    }

    public ImmutableSetMultimap<K, V> asMultimap() {
        if (isEmpty()) {
            return ImmutableSetMultimap.of();
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap = this.multimapView;
        if (immutableSetMultimap != null) {
            return immutableSetMultimap;
        }
        ImmutableSetMultimap<K, V> immutableSetMultimap2 = new ImmutableSetMultimap<>(new MapViewOfValuesAsSingletonSets(), size(), null);
        this.multimapView = immutableSetMultimap2;
        return immutableSetMultimap2;
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    public abstract ImmutableSet<K> createKeySet();

    public abstract ImmutableCollection<V> createValues();

    @Override // java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetCreateEntrySet = createEntrySet();
        this.entrySet = immutableSetCreateEntrySet;
        return immutableSetCreateEntrySet;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return Maps.equalsImpl(this, obj);
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v14) {
        V v15 = get(obj);
        return v15 != null ? v15 : v14;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    public abstract boolean isPartialView();

    public UnmodifiableIterator<K> keyIterator() {
        final UnmodifiableIterator<Map.Entry<K, V>> it = entrySet().iterator();
        return new UnmodifiableIterator<K>(this) { // from class: com.google.common.collect.ImmutableMap.1
            final /* synthetic */ ImmutableMap this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return (K) ((Map.Entry) it.next()).getKey();
            }
        };
    }

    @Override // java.util.Map
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetCreateKeySet = createKeySet();
        this.keySet = immutableSetCreateKeySet;
        return immutableSetCreateKeySet;
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V put(K k14, V v14) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return Maps.toStringImpl(this);
    }

    @Override // java.util.Map, com.google.common.collect.BiMap
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionCreateValues = createValues();
        this.values = immutableCollectionCreateValues;
        return immutableCollectionCreateValues;
    }

    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        return CollectCollectors.toImmutableMap(function, function2, binaryOperator);
    }

    @DoNotMock
    public static class Builder<K, V> {
        Object[] alternatingKeysAndValues;
        DuplicateKey duplicateKey;
        boolean entriesUsed;
        int size;
        Comparator<? super V> valueComparator;

        public static final class DuplicateKey {
            private final Object key;
            private final Object value1;
            private final Object value2;

            public DuplicateKey(Object obj, Object obj2, Object obj3) {
                this.key = obj;
                this.value1 = obj2;
                this.value2 = obj3;
            }

            public IllegalArgumentException exception() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.key + "=" + this.value1 + " and " + this.key + "=" + this.value2);
            }
        }

        public Builder(int i14) {
            this.alternatingKeysAndValues = new Object[i14 * 2];
            this.size = 0;
            this.entriesUsed = false;
        }

        private ImmutableMap<K, V> build(boolean z14) {
            Object[] objArrLastEntryForEachKey;
            DuplicateKey duplicateKey;
            DuplicateKey duplicateKey2;
            if (z14 && (duplicateKey2 = this.duplicateKey) != null) {
                throw duplicateKey2.exception();
            }
            int length = this.size;
            if (this.valueComparator == null) {
                objArrLastEntryForEachKey = this.alternatingKeysAndValues;
            } else {
                if (this.entriesUsed) {
                    this.alternatingKeysAndValues = Arrays.copyOf(this.alternatingKeysAndValues, length * 2);
                }
                objArrLastEntryForEachKey = this.alternatingKeysAndValues;
                if (!z14) {
                    objArrLastEntryForEachKey = lastEntryForEachKey(objArrLastEntryForEachKey, this.size);
                    if (objArrLastEntryForEachKey.length < this.alternatingKeysAndValues.length) {
                        length = objArrLastEntryForEachKey.length >>> 1;
                    }
                }
                sortEntries(objArrLastEntryForEachKey, length, this.valueComparator);
            }
            this.entriesUsed = true;
            RegularImmutableMap regularImmutableMapCreate = RegularImmutableMap.create(length, objArrLastEntryForEachKey, this);
            if (!z14 || (duplicateKey = this.duplicateKey) == null) {
                return regularImmutableMapCreate;
            }
            throw duplicateKey.exception();
        }

        private void ensureCapacity(int i14) {
            int i15 = i14 * 2;
            Object[] objArr = this.alternatingKeysAndValues;
            if (i15 > objArr.length) {
                this.alternatingKeysAndValues = Arrays.copyOf(objArr, ImmutableCollection.Builder.expandedCapacity(objArr.length, i15));
                this.entriesUsed = false;
            }
        }

        private Object[] lastEntryForEachKey(Object[] objArr, int i14) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i15 = i14 - 1; i15 >= 0; i15--) {
                Object obj = objArr[i15 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i15);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i14 - bitSet.cardinality()) * 2];
            int i16 = 0;
            int i17 = 0;
            while (i16 < i14 * 2) {
                if (bitSet.get(i16 >>> 1)) {
                    i16 += 2;
                } else {
                    int i18 = i17 + 1;
                    int i19 = i16 + 1;
                    Object obj2 = objArr[i16];
                    Objects.requireNonNull(obj2);
                    objArr2[i17] = obj2;
                    i17 += 2;
                    i16 += 2;
                    Object obj3 = objArr[i19];
                    Objects.requireNonNull(obj3);
                    objArr2[i18] = obj3;
                }
            }
            return objArr2;
        }

        public static <V> void sortEntries(Object[] objArr, int i14, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = i15 * 2;
                Object obj = objArr[i16];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i16 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i15] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i14, Ordering.from(comparator).onResultOf(Maps.valueFunction()));
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = i17 * 2;
                objArr[i18] = entryArr[i17].getKey();
                objArr[i18 + 1] = entryArr[i17].getValue();
            }
        }

        public ImmutableMap<K, V> buildKeepingLast() {
            return build(false);
        }

        public ImmutableMap<K, V> buildOrThrow() {
            return build(true);
        }

        @CanIgnoreReturnValue
        public Builder<K, V> combine(Builder<K, V> builder) {
            Preconditions.checkNotNull(builder);
            ensureCapacity(this.size + builder.size);
            System.arraycopy(builder.alternatingKeysAndValues, 0, this.alternatingKeysAndValues, this.size * 2, builder.size * 2);
            this.size += builder.size;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            Preconditions.checkState(this.valueComparator == null, "valueComparator was already set");
            this.valueComparator = (Comparator) Preconditions.checkNotNull(comparator, "valueComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(K k14, V v14) {
            ensureCapacity(this.size + 1);
            CollectPreconditions.checkEntryNotNull(k14, v14);
            Object[] objArr = this.alternatingKeysAndValues;
            int i14 = this.size;
            objArr[i14 * 2] = k14;
            objArr[(i14 * 2) + 1] = v14;
            this.size = i14 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                ensureCapacity(((Collection) iterable).size() + this.size);
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        public Builder() {
            this(4);
        }

        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        public ImmutableMap<K, V> build() {
            return buildOrThrow();
        }
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Builder builder = new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        builder.putAll(iterable);
        return builder.build();
    }

    public static <K, V> ImmutableMap<K, V> of(K k14, V v14) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        return RegularImmutableMap.create(1, new Object[]{k14, v14});
    }

    public static <K, V> ImmutableMap<K, V> of(K k14, V v14, K k15, V v15) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        return RegularImmutableMap.create(2, new Object[]{k14, v14, k15, v15});
    }

    public static <K, V> ImmutableMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        return RegularImmutableMap.create(3, new Object[]{k14, v14, k15, v15, k16, v16});
    }

    public static <K, V> ImmutableMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        return RegularImmutableMap.create(4, new Object[]{k14, v14, k15, v15, k16, v16, k17, v17});
    }

    public static <K, V> ImmutableMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        return RegularImmutableMap.create(5, new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18});
    }

    public static <K, V> ImmutableMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        CollectPreconditions.checkEntryNotNull(k19, v19);
        return RegularImmutableMap.create(6, new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19});
    }

    public static <K, V> ImmutableMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19, K k24, V v24) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        CollectPreconditions.checkEntryNotNull(k19, v19);
        CollectPreconditions.checkEntryNotNull(k24, v24);
        return RegularImmutableMap.create(7, new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19, k24, v24});
    }

    public static <K, V> ImmutableMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19, K k24, V v24, K k25, V v25) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        CollectPreconditions.checkEntryNotNull(k19, v19);
        CollectPreconditions.checkEntryNotNull(k24, v24);
        CollectPreconditions.checkEntryNotNull(k25, v25);
        return RegularImmutableMap.create(8, new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19, k24, v24, k25, v25});
    }

    public static <K, V> ImmutableMap<K, V> of(K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19, K k24, V v24, K k25, V v25, K k26, V v26) {
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        CollectPreconditions.checkEntryNotNull(k19, v19);
        CollectPreconditions.checkEntryNotNull(k24, v24);
        CollectPreconditions.checkEntryNotNull(k25, v25);
        CollectPreconditions.checkEntryNotNull(k26, v26);
        return RegularImmutableMap.create(9, new Object[]{k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19, k24, v24, k25, v25, k26, v26});
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return (ImmutableMap<K, V>) RegularImmutableMap.EMPTY;
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import i3.e5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {
    private static final int ABSENT = -1;
    private static final int ENDPOINT = -2;

    @LazyInit
    private transient Set<Map.Entry<K, V>> entrySet;
    private transient int firstInInsertionOrder;
    private transient int[] hashTableKToV;
    private transient int[] hashTableVToK;

    @RetainedWith
    @LazyInit
    private transient BiMap<V, K> inverse;

    @LazyInit
    private transient Set<K> keySet;
    transient K[] keys;
    private transient int lastInInsertionOrder;
    transient int modCount;
    private transient int[] nextInBucketKToV;
    private transient int[] nextInBucketVToK;
    private transient int[] nextInInsertionOrder;
    private transient int[] prevInInsertionOrder;
    transient int size;

    @LazyInit
    private transient Set<V> valueSet;
    transient V[] values;

    public final class EntryForKey extends AbstractMapEntry<K, V> {
        int index;

        @ParametricNullness
        final K key;

        public EntryForKey(int i14) {
            this.key = (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i14]);
            this.index = i14;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            updateIndex();
            int i14 = this.index;
            return i14 == -1 ? (V) NullnessCasts.unsafeNull() : (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i14]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v14) {
            updateIndex();
            int i14 = this.index;
            HashBiMap hashBiMap = HashBiMap.this;
            if (i14 == -1) {
                hashBiMap.put(this.key, v14);
                return (V) NullnessCasts.unsafeNull();
            }
            V v15 = (V) NullnessCasts.uncheckedCastNullableTToT(hashBiMap.values[i14]);
            if (Objects.equal(v15, v14)) {
                return v14;
            }
            HashBiMap.this.replaceValueInEntry(this.index, v14, false);
            return v15;
        }

        public void updateIndex() {
            int i14 = this.index;
            if (i14 != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i14 <= hashBiMap.size && Objects.equal(hashBiMap.keys[i14], this.key)) {
                    return;
                }
            }
            this.index = HashBiMap.this.findEntryByKey(this.key);
        }
    }

    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {
        final HashBiMap<K, V> biMap;
        int index;

        @ParametricNullness
        final V value;

        public EntryForValue(HashBiMap<K, V> hashBiMap, int i14) {
            this.biMap = hashBiMap;
            this.value = (V) NullnessCasts.uncheckedCastNullableTToT(hashBiMap.values[i14]);
            this.index = i14;
        }

        private void updateIndex() {
            int i14 = this.index;
            if (i14 != -1) {
                HashBiMap<K, V> hashBiMap = this.biMap;
                if (i14 <= hashBiMap.size && Objects.equal(this.value, hashBiMap.values[i14])) {
                    return;
                }
            }
            this.index = this.biMap.findEntryByValue(this.value);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getKey() {
            return this.value;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getValue() {
            updateIndex();
            int i14 = this.index;
            return i14 == -1 ? (K) NullnessCasts.unsafeNull() : (K) NullnessCasts.uncheckedCastNullableTToT(this.biMap.keys[i14]);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K setValue(@ParametricNullness K k14) {
            updateIndex();
            int i14 = this.index;
            HashBiMap<K, V> hashBiMap = this.biMap;
            if (i14 == -1) {
                hashBiMap.putInverse(this.value, k14, false);
                return (K) NullnessCasts.unsafeNull();
            }
            K k15 = (K) NullnessCasts.uncheckedCastNullableTToT(hashBiMap.keys[i14]);
            if (Objects.equal(k15, k14)) {
                return k14;
            }
            this.biMap.replaceKeyInEntry(this.index, k14, false);
            return k15;
        }
    }

    public final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        public EntrySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByKey = HashBiMap.this.findEntryByKey(key);
                if (iFindEntryByKey != -1 && Objects.equal(value, HashBiMap.this.values[iFindEntryByKey])) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<K, V> forEntry(int i14) {
            return new EntryForKey(i14);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(key, iSmearedHash);
            if (iFindEntryByKey == -1 || !Objects.equal(value, HashBiMap.this.values[iFindEntryByKey])) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }
    }

    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {
        private final HashBiMap<K, V> forward;
        private transient Set<Map.Entry<V, K>> inverseEntrySet;

        public Inverse(HashBiMap<K, V> hashBiMap) {
            this.forward = hashBiMap;
        }

        @GwtIncompatible("serialization")
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((HashBiMap) this.forward).inverse = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.inverseEntrySet;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.forward);
            this.inverseEntrySet = inverseEntrySet;
            return inverseEntrySet;
        }

        @Override // com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        public K forcePut(@ParametricNullness V v14, @ParametricNullness K k14) {
            return this.forward.putInverse(v14, k14, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public K get(Object obj) {
            return this.forward.getInverse(obj);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<K, V> inverse() {
            return this.forward;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.forward.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        @CanIgnoreReturnValue
        public K put(@ParametricNullness V v14, @ParametricNullness K k14) {
            return this.forward.putInverse(v14, k14, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        public K remove(Object obj) {
            return this.forward.removeInverse(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.size;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<K> values() {
            return this.forward.keySet();
        }
    }

    public static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        public InverseEntrySet(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                int iFindEntryByValue = this.biMap.findEntryByValue(key);
                if (iFindEntryByValue != -1 && Objects.equal(this.biMap.keys[iFindEntryByValue], value)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.HashBiMap.View
        public Map.Entry<V, K> forEntry(int i14) {
            return new EntryForValue(this.biMap, i14);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iSmearedHash = Hashing.smearedHash(key);
            int iFindEntryByValue = this.biMap.findEntryByValue(key, iSmearedHash);
            if (iFindEntryByValue == -1 || !Objects.equal(this.biMap.keys[iFindEntryByValue], value)) {
                return false;
            }
            this.biMap.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }
    }

    public final class KeySet extends View<K, V, K> {
        public KeySet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        public K forEntry(int i14) {
            return (K) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.keys[i14]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iSmearedHash = Hashing.smearedHash(obj);
            int iFindEntryByKey = HashBiMap.this.findEntryByKey(obj, iSmearedHash);
            if (iFindEntryByKey == -1) {
                return false;
            }
            HashBiMap.this.removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            return true;
        }
    }

    public final class ValueSet extends View<K, V, V> {
        public ValueSet() {
            super(HashBiMap.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // com.google.common.collect.HashBiMap.View
        @ParametricNullness
        public V forEntry(int i14) {
            return (V) NullnessCasts.uncheckedCastNullableTToT(HashBiMap.this.values[i14]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iSmearedHash = Hashing.smearedHash(obj);
            int iFindEntryByValue = HashBiMap.this.findEntryByValue(obj, iSmearedHash);
            if (iFindEntryByValue == -1) {
                return false;
            }
            HashBiMap.this.removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
            return true;
        }
    }

    public static abstract class View<K, V, T> extends AbstractSet<T> {
        final HashBiMap<K, V> biMap;

        public View(HashBiMap<K, V> hashBiMap) {
            this.biMap = hashBiMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.biMap.clear();
        }

        @ParametricNullness
        public abstract T forEntry(int i14);

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1
                private int expectedModCount;
                private int index;
                private int indexToRemove = -1;
                private int remaining;

                {
                    this.index = ((HashBiMap) View.this.biMap).firstInInsertionOrder;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    this.expectedModCount = hashBiMap.modCount;
                    this.remaining = hashBiMap.size;
                }

                private void checkForComodification() {
                    if (View.this.biMap.modCount == this.expectedModCount) {
                        return;
                    }
                    org.apache.commons.lang3.e.h();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    checkForComodification();
                    return this.index != -2 && this.remaining > 0;
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    T t7 = (T) View.this.forEntry(this.index);
                    this.indexToRemove = this.index;
                    this.index = ((HashBiMap) View.this.biMap).nextInInsertionOrder[this.index];
                    this.remaining--;
                    return t7;
                }

                @Override // java.util.Iterator
                public void remove() {
                    checkForComodification();
                    CollectPreconditions.checkRemove(this.indexToRemove != -1);
                    View.this.biMap.removeEntry(this.indexToRemove);
                    int i14 = this.index;
                    HashBiMap<K, V> hashBiMap = View.this.biMap;
                    if (i14 == hashBiMap.size) {
                        this.index = this.indexToRemove;
                    }
                    this.indexToRemove = -1;
                    this.expectedModCount = hashBiMap.modCount;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.biMap.size;
        }
    }

    private HashBiMap(int i14) {
        init(i14);
    }

    private int bucket(int i14) {
        return i14 & (this.hashTableKToV.length - 1);
    }

    public static <K, V> HashBiMap<K, V> create(Map<? extends K, ? extends V> map) {
        HashBiMap<K, V> hashBiMapCreate = create(map.size());
        hashBiMapCreate.putAll(map);
        return hashBiMapCreate;
    }

    private static int[] createFilledWithAbsent(int i14) {
        int[] iArr = new int[i14];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int i14, int i15) {
        Preconditions.checkArgument(i14 != -1);
        int iBucket = bucket(i15);
        int[] iArr = this.hashTableKToV;
        int i16 = iArr[iBucket];
        int[] iArr2 = this.nextInBucketKToV;
        if (i16 == i14) {
            iArr[iBucket] = iArr2[i14];
            iArr2[i14] = -1;
            return;
        }
        int i17 = iArr2[i16];
        while (true) {
            int i18 = i16;
            i16 = i17;
            if (i16 == -1) {
                o2.c.l(this.keys[i14], "Expected to find entry with key ");
                return;
            }
            int[] iArr3 = this.nextInBucketKToV;
            if (i16 == i14) {
                iArr3[i18] = iArr3[i14];
                iArr3[i14] = -1;
                return;
            }
            i17 = iArr3[i16];
        }
    }

    private void deleteFromTableVToK(int i14, int i15) {
        Preconditions.checkArgument(i14 != -1);
        int iBucket = bucket(i15);
        int[] iArr = this.hashTableVToK;
        int i16 = iArr[iBucket];
        int[] iArr2 = this.nextInBucketVToK;
        if (i16 == i14) {
            iArr[iBucket] = iArr2[i14];
            iArr2[i14] = -1;
            return;
        }
        int i17 = iArr2[i16];
        while (true) {
            int i18 = i16;
            i16 = i17;
            if (i16 == -1) {
                o2.c.l(this.values[i14], "Expected to find entry with value ");
                return;
            }
            int[] iArr3 = this.nextInBucketVToK;
            if (i16 == i14) {
                iArr3[i18] = iArr3[i14];
                iArr3[i14] = -1;
                return;
            }
            i17 = iArr3[i16];
        }
    }

    private void ensureCapacity(int i14) {
        int[] iArr = this.nextInBucketKToV;
        if (iArr.length < i14) {
            int iExpandedCapacity = ImmutableCollection.Builder.expandedCapacity(iArr.length, i14);
            this.keys = (K[]) Arrays.copyOf(this.keys, iExpandedCapacity);
            this.values = (V[]) Arrays.copyOf(this.values, iExpandedCapacity);
            this.nextInBucketKToV = expandAndFillWithAbsent(this.nextInBucketKToV, iExpandedCapacity);
            this.nextInBucketVToK = expandAndFillWithAbsent(this.nextInBucketVToK, iExpandedCapacity);
            this.prevInInsertionOrder = expandAndFillWithAbsent(this.prevInInsertionOrder, iExpandedCapacity);
            this.nextInInsertionOrder = expandAndFillWithAbsent(this.nextInInsertionOrder, iExpandedCapacity);
        }
        if (this.hashTableKToV.length < i14) {
            int iClosedTableSize = Hashing.closedTableSize(i14, 1.0d);
            this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
            this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
            for (int i15 = 0; i15 < this.size; i15++) {
                int iBucket = bucket(Hashing.smearedHash(this.keys[i15]));
                int[] iArr2 = this.nextInBucketKToV;
                int[] iArr3 = this.hashTableKToV;
                iArr2[i15] = iArr3[iBucket];
                iArr3[iBucket] = i15;
                int iBucket2 = bucket(Hashing.smearedHash(this.values[i15]));
                int[] iArr4 = this.nextInBucketVToK;
                int[] iArr5 = this.hashTableVToK;
                iArr4[i15] = iArr5[iBucket2];
                iArr5[iBucket2] = i15;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] iArr, int i14) {
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        Arrays.fill(iArrCopyOf, length, i14, -1);
        return iArrCopyOf;
    }

    private void insertIntoTableKToV(int i14, int i15) {
        Preconditions.checkArgument(i14 != -1);
        int iBucket = bucket(i15);
        int[] iArr = this.nextInBucketKToV;
        int[] iArr2 = this.hashTableKToV;
        iArr[i14] = iArr2[iBucket];
        iArr2[iBucket] = i14;
    }

    private void insertIntoTableVToK(int i14, int i15) {
        Preconditions.checkArgument(i14 != -1);
        int iBucket = bucket(i15);
        int[] iArr = this.nextInBucketVToK;
        int[] iArr2 = this.hashTableVToK;
        iArr[i14] = iArr2[iBucket];
        iArr2[iBucket] = i14;
    }

    private void moveEntryToIndex(int i14, int i15) {
        int i16;
        int[] iArr;
        int i17;
        int[] iArr2;
        if (i14 == i15) {
            return;
        }
        int i18 = this.prevInInsertionOrder[i14];
        int i19 = this.nextInInsertionOrder[i14];
        setSucceeds(i18, i15);
        setSucceeds(i15, i19);
        K[] kArr = this.keys;
        K k14 = kArr[i14];
        V[] vArr = this.values;
        V v14 = vArr[i14];
        kArr[i15] = k14;
        vArr[i15] = v14;
        int iBucket = bucket(Hashing.smearedHash(k14));
        int[] iArr3 = this.hashTableKToV;
        int i24 = iArr3[iBucket];
        if (i24 == i14) {
            iArr3[iBucket] = i15;
        } else {
            int i25 = this.nextInBucketKToV[i24];
            while (true) {
                i16 = i24;
                i24 = i25;
                iArr = this.nextInBucketKToV;
                if (i24 == i14) {
                    break;
                } else {
                    i25 = iArr[i24];
                }
            }
            iArr[i16] = i15;
        }
        int[] iArr4 = this.nextInBucketKToV;
        iArr4[i15] = iArr4[i14];
        iArr4[i14] = -1;
        int iBucket2 = bucket(Hashing.smearedHash(v14));
        int[] iArr5 = this.hashTableVToK;
        int i26 = iArr5[iBucket2];
        if (i26 == i14) {
            iArr5[iBucket2] = i15;
        } else {
            int i27 = this.nextInBucketVToK[i26];
            while (true) {
                i17 = i26;
                i26 = i27;
                iArr2 = this.nextInBucketVToK;
                if (i26 == i14) {
                    break;
                } else {
                    i27 = iArr2[i26];
                }
            }
            iArr2[i17] = i15;
        }
        int[] iArr6 = this.nextInBucketVToK;
        iArr6[i15] = iArr6[i14];
        iArr6[i14] = -1;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int count = Serialization.readCount(objectInputStream);
        init(16);
        Serialization.populateMap(this, objectInputStream, count);
    }

    private void removeEntry(int i14, int i15, int i16) {
        Preconditions.checkArgument(i14 != -1);
        deleteFromTableKToV(i14, i15);
        deleteFromTableVToK(i14, i16);
        setSucceeds(this.prevInInsertionOrder[i14], this.nextInInsertionOrder[i14]);
        moveEntryToIndex(this.size - 1, i14);
        K[] kArr = this.keys;
        int i17 = this.size;
        kArr[i17 - 1] = null;
        this.values[i17 - 1] = null;
        this.size = i17 - 1;
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int i14, @ParametricNullness K k14, boolean z14) {
        int i15;
        Preconditions.checkArgument(i14 != -1);
        int iSmearedHash = Hashing.smearedHash(k14);
        int iFindEntryByKey = findEntryByKey(k14, iSmearedHash);
        int i16 = this.lastInInsertionOrder;
        if (iFindEntryByKey == -1) {
            i15 = -2;
        } else {
            if (!z14) {
                vb.h.s(e5.f(k14, "Key already present in map: "));
                return;
            }
            i16 = this.prevInInsertionOrder[iFindEntryByKey];
            i15 = this.nextInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
            if (i14 == this.size) {
                i14 = iFindEntryByKey;
            }
        }
        if (i16 == i14) {
            i16 = this.prevInInsertionOrder[i14];
        } else if (i16 == this.size) {
            i16 = iFindEntryByKey;
        }
        if (i15 == i14) {
            iFindEntryByKey = this.nextInInsertionOrder[i14];
        } else if (i15 != this.size) {
            iFindEntryByKey = i15;
        }
        setSucceeds(this.prevInInsertionOrder[i14], this.nextInInsertionOrder[i14]);
        deleteFromTableKToV(i14, Hashing.smearedHash(this.keys[i14]));
        this.keys[i14] = k14;
        insertIntoTableKToV(i14, Hashing.smearedHash(k14));
        setSucceeds(i16, i14);
        setSucceeds(i14, iFindEntryByKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int i14, @ParametricNullness V v14, boolean z14) {
        Preconditions.checkArgument(i14 != -1);
        int iSmearedHash = Hashing.smearedHash(v14);
        int iFindEntryByValue = findEntryByValue(v14, iSmearedHash);
        if (iFindEntryByValue != -1) {
            if (!z14) {
                vb.h.s(e5.f(v14, "Value already present in map: "));
                return;
            } else {
                removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
                if (i14 == this.size) {
                    i14 = iFindEntryByValue;
                }
            }
        }
        deleteFromTableVToK(i14, Hashing.smearedHash(this.values[i14]));
        this.values[i14] = v14;
        insertIntoTableVToK(i14, iSmearedHash);
    }

    private void setSucceeds(int i14, int i15) {
        if (i14 == -2) {
            this.firstInInsertionOrder = i15;
        } else {
            this.nextInInsertionOrder[i14] = i15;
        }
        if (i15 == -2) {
            this.lastInInsertionOrder = i14;
        } else {
            this.prevInInsertionOrder[i15] = i14;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMap(this, objectOutputStream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, (Object) null);
        Arrays.fill(this.hashTableKToV, -1);
        Arrays.fill(this.hashTableVToK, -1);
        Arrays.fill(this.nextInBucketKToV, 0, this.size, -1);
        Arrays.fill(this.nextInBucketVToK, 0, this.size, -1);
        Arrays.fill(this.prevInInsertionOrder, 0, this.size, -1);
        Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
        this.size = 0;
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return findEntryByKey(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return findEntryByValue(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.entrySet = entrySet;
        return entrySet;
    }

    public int findEntry(Object obj, int i14, int[] iArr, int[] iArr2, Object[] objArr) {
        int i15 = iArr[bucket(i14)];
        while (i15 != -1) {
            if (Objects.equal(objArr[i15], obj)) {
                return i15;
            }
            i15 = iArr2[i15];
        }
        return -1;
    }

    public int findEntryByKey(Object obj, int i14) {
        return findEntry(obj, i14, this.hashTableKToV, this.nextInBucketKToV, this.keys);
    }

    public int findEntryByValue(Object obj, int i14) {
        return findEntry(obj, i14, this.hashTableVToK, this.nextInBucketVToK, this.values);
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V forcePut(@ParametricNullness K k14, @ParametricNullness V v14) {
        return put(k14, v14, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int iFindEntryByKey = findEntryByKey(obj);
        if (iFindEntryByKey == -1) {
            return null;
        }
        return this.values[iFindEntryByKey];
    }

    public K getInverse(Object obj) {
        int iFindEntryByValue = findEntryByValue(obj);
        if (iFindEntryByValue == -1) {
            return null;
        }
        return this.keys[iFindEntryByValue];
    }

    public void init(int i14) {
        CollectPreconditions.checkNonnegative(i14, "expectedSize");
        int iClosedTableSize = Hashing.closedTableSize(i14, 1.0d);
        this.size = 0;
        this.keys = (K[]) new Object[i14];
        this.values = (V[]) new Object[i14];
        this.hashTableKToV = createFilledWithAbsent(iClosedTableSize);
        this.hashTableVToK = createFilledWithAbsent(iClosedTableSize);
        this.nextInBucketKToV = createFilledWithAbsent(i14);
        this.nextInBucketVToK = createFilledWithAbsent(i14);
        this.firstInInsertionOrder = -2;
        this.lastInInsertionOrder = -2;
        this.prevInInsertionOrder = createFilledWithAbsent(i14);
        this.nextInInsertionOrder = createFilledWithAbsent(i14);
    }

    @Override // com.google.common.collect.BiMap
    public BiMap<V, K> inverse() {
        BiMap<V, K> biMap = this.inverse;
        if (biMap != null) {
            return biMap;
        }
        Inverse inverse = new Inverse(this);
        this.inverse = inverse;
        return inverse;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.keySet = keySet;
        return keySet;
    }

    public V put(@ParametricNullness K k14, @ParametricNullness V v14, boolean z14) {
        int iSmearedHash = Hashing.smearedHash(k14);
        int iFindEntryByKey = findEntryByKey(k14, iSmearedHash);
        if (iFindEntryByKey != -1) {
            V v15 = this.values[iFindEntryByKey];
            if (Objects.equal(v15, v14)) {
                return v14;
            }
            replaceValueInEntry(iFindEntryByKey, v14, z14);
            return v15;
        }
        int iSmearedHash2 = Hashing.smearedHash(v14);
        int iFindEntryByValue = findEntryByValue(v14, iSmearedHash2);
        if (!z14) {
            Preconditions.checkArgument(iFindEntryByValue == -1, "Value already present: %s", v14);
        } else if (iFindEntryByValue != -1) {
            removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i14 = this.size;
        kArr[i14] = k14;
        this.values[i14] = v14;
        insertIntoTableKToV(i14, iSmearedHash);
        insertIntoTableVToK(this.size, iSmearedHash2);
        setSucceeds(this.lastInInsertionOrder, this.size);
        setSucceeds(this.size, -2);
        this.size++;
        this.modCount++;
        return null;
    }

    @CanIgnoreReturnValue
    public K putInverse(@ParametricNullness V v14, @ParametricNullness K k14, boolean z14) {
        int iSmearedHash = Hashing.smearedHash(v14);
        int iFindEntryByValue = findEntryByValue(v14, iSmearedHash);
        if (iFindEntryByValue != -1) {
            K k15 = this.keys[iFindEntryByValue];
            if (Objects.equal(k15, k14)) {
                return k14;
            }
            replaceKeyInEntry(iFindEntryByValue, k14, z14);
            return k15;
        }
        int i14 = this.lastInInsertionOrder;
        int iSmearedHash2 = Hashing.smearedHash(k14);
        int iFindEntryByKey = findEntryByKey(k14, iSmearedHash2);
        if (!z14) {
            Preconditions.checkArgument(iFindEntryByKey == -1, "Key already present: %s", k14);
        } else if (iFindEntryByKey != -1) {
            i14 = this.prevInInsertionOrder[iFindEntryByKey];
            removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash2);
        }
        ensureCapacity(this.size + 1);
        K[] kArr = this.keys;
        int i15 = this.size;
        kArr[i15] = k14;
        this.values[i15] = v14;
        insertIntoTableKToV(i15, iSmearedHash2);
        insertIntoTableVToK(this.size, iSmearedHash);
        int i16 = i14 == -2 ? this.firstInInsertionOrder : this.nextInInsertionOrder[i14];
        setSucceeds(i14, this.size);
        setSucceeds(this.size, i16);
        this.size++;
        this.modCount++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int iFindEntryByKey = findEntryByKey(obj, iSmearedHash);
        if (iFindEntryByKey == -1) {
            return null;
        }
        V v14 = this.values[iFindEntryByKey];
        removeEntryKeyHashKnown(iFindEntryByKey, iSmearedHash);
        return v14;
    }

    public void removeEntryKeyHashKnown(int i14, int i15) {
        removeEntry(i14, i15, Hashing.smearedHash(this.values[i14]));
    }

    public void removeEntryValueHashKnown(int i14, int i15) {
        removeEntry(i14, Hashing.smearedHash(this.keys[i14]), i15);
    }

    public K removeInverse(Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int iFindEntryByValue = findEntryByValue(obj, iSmearedHash);
        if (iFindEntryByValue == -1) {
            return null;
        }
        K k14 = this.keys[iFindEntryByValue];
        removeEntryValueHashKnown(iFindEntryByValue, iSmearedHash);
        return k14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    public Set<V> values() {
        Set<V> set = this.valueSet;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.valueSet = valueSet;
        return valueSet;
    }

    public static <K, V> HashBiMap<K, V> create(int i14) {
        return new HashBiMap<>(i14);
    }

    public static <K, V> HashBiMap<K, V> create() {
        return create(16);
    }

    public int findEntryByKey(Object obj) {
        return findEntryByKey(obj, Hashing.smearedHash(obj));
    }

    public int findEntryByValue(Object obj) {
        return findEntryByValue(obj, Hashing.smearedHash(obj));
    }

    public void removeEntry(int i14) {
        removeEntryKeyHashKnown(i14, Hashing.smearedHash(this.keys[i14]));
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    public V put(@ParametricNullness K k14, @ParametricNullness V v14) {
        return put(k14, v14, false);
    }
}

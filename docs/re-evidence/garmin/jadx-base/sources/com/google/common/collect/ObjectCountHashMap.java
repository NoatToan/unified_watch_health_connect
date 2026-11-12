package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
class ObjectCountHashMap<K> {
    static final float DEFAULT_LOAD_FACTOR = 1.0f;
    static final int DEFAULT_SIZE = 3;
    private static final long HASH_MASK = -4294967296L;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final long NEXT_MASK = 4294967295L;
    static final int UNSET = -1;

    @VisibleForTesting
    transient long[] entries;
    transient Object[] keys;
    private transient float loadFactor;
    transient int modCount;
    transient int size;
    private transient int[] table;
    private transient int threshold;
    transient int[] values;

    public class MapEntry extends Multisets.AbstractEntry<K> {

        @ParametricNullness
        final K key;
        int lastKnownIndex;

        public MapEntry(int i14) {
            this.key = (K) ObjectCountHashMap.this.keys[i14];
            this.lastKnownIndex = i14;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int getCount() {
            updateLastKnownIndex();
            int i14 = this.lastKnownIndex;
            if (i14 == -1) {
                return 0;
            }
            return ObjectCountHashMap.this.values[i14];
        }

        @Override // com.google.common.collect.Multiset.Entry
        @ParametricNullness
        public K getElement() {
            return this.key;
        }

        @CanIgnoreReturnValue
        public int setCount(int i14) {
            updateLastKnownIndex();
            int i15 = this.lastKnownIndex;
            ObjectCountHashMap objectCountHashMap = ObjectCountHashMap.this;
            if (i15 == -1) {
                objectCountHashMap.put(this.key, i14);
                return 0;
            }
            int[] iArr = objectCountHashMap.values;
            int i16 = iArr[i15];
            iArr[i15] = i14;
            return i16;
        }

        public void updateLastKnownIndex() {
            int i14 = this.lastKnownIndex;
            if (i14 == -1 || i14 >= ObjectCountHashMap.this.size() || !Objects.equal(this.key, ObjectCountHashMap.this.keys[this.lastKnownIndex])) {
                this.lastKnownIndex = ObjectCountHashMap.this.indexOf(this.key);
            }
        }
    }

    public ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
        init(objectCountHashMap.size(), 1.0f);
        int iFirstIndex = objectCountHashMap.firstIndex();
        while (iFirstIndex != -1) {
            put(objectCountHashMap.getKey(iFirstIndex), objectCountHashMap.getValue(iFirstIndex));
            iFirstIndex = objectCountHashMap.nextIndex(iFirstIndex);
        }
    }

    public static <K> ObjectCountHashMap<K> create() {
        return new ObjectCountHashMap<>();
    }

    public static <K> ObjectCountHashMap<K> createWithExpectedSize(int i14) {
        return new ObjectCountHashMap<>(i14);
    }

    private static int getHash(long j8) {
        return (int) (j8 >>> 32);
    }

    private static int getNext(long j8) {
        return (int) j8;
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    private static long[] newEntries(int i14) {
        long[] jArr = new long[i14];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] newTable(int i14) {
        int[] iArr = new int[i14];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int remove(Object obj, int i14) {
        int iHashTableMask = hashTableMask() & i14;
        int i15 = this.table[iHashTableMask];
        if (i15 == -1) {
            return 0;
        }
        int i16 = -1;
        while (true) {
            if (getHash(this.entries[i15]) == i14 && Objects.equal(obj, this.keys[i15])) {
                int i17 = this.values[i15];
                if (i16 == -1) {
                    this.table[iHashTableMask] = getNext(this.entries[i15]);
                } else {
                    long[] jArr = this.entries;
                    jArr[i16] = swapNext(jArr[i16], getNext(jArr[i15]));
                }
                moveLastEntry(i15);
                this.size--;
                this.modCount++;
                return i17;
            }
            int next = getNext(this.entries[i15]);
            if (next == -1) {
                return 0;
            }
            i16 = i15;
            i15 = next;
        }
    }

    private void resizeMeMaybe(int i14) {
        int length = this.entries.length;
        if (i14 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                resizeEntries(iMax);
            }
        }
    }

    private void resizeTable(int i14) {
        if (this.table.length >= 1073741824) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i15 = ((int) (i14 * this.loadFactor)) + 1;
        int[] iArrNewTable = newTable(i14);
        long[] jArr = this.entries;
        int length = iArrNewTable.length - 1;
        for (int i16 = 0; i16 < this.size; i16++) {
            int hash = getHash(jArr[i16]);
            int i17 = hash & length;
            int i18 = iArrNewTable[i17];
            iArrNewTable[i17] = i16;
            jArr[i16] = (((long) hash) << 32) | (((long) i18) & NEXT_MASK);
        }
        this.threshold = i15;
        this.table = iArrNewTable;
    }

    private static long swapNext(long j8, int i14) {
        return (j8 & HASH_MASK) | (NEXT_MASK & ((long) i14));
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, 0);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1L);
        this.size = 0;
    }

    public boolean containsKey(Object obj) {
        return indexOf(obj) != -1;
    }

    public void ensureCapacity(int i14) {
        if (i14 > this.entries.length) {
            resizeEntries(i14);
        }
        if (i14 >= this.threshold) {
            resizeTable(Math.max(2, Integer.highestOneBit(i14 - 1) << 1));
        }
    }

    public int firstIndex() {
        return this.size == 0 ? -1 : 0;
    }

    public int get(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return 0;
        }
        return this.values[iIndexOf];
    }

    public Multiset.Entry<K> getEntry(int i14) {
        Preconditions.checkElementIndex(i14, this.size);
        return new MapEntry(i14);
    }

    @ParametricNullness
    public K getKey(int i14) {
        Preconditions.checkElementIndex(i14, this.size);
        return (K) this.keys[i14];
    }

    public int getValue(int i14) {
        Preconditions.checkElementIndex(i14, this.size);
        return this.values[i14];
    }

    public int indexOf(Object obj) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int next = this.table[hashTableMask() & iSmearedHash];
        while (next != -1) {
            long j8 = this.entries[next];
            if (getHash(j8) == iSmearedHash && Objects.equal(obj, this.keys[next])) {
                return next;
            }
            next = getNext(j8);
        }
        return -1;
    }

    public void init(int i14, float f14) {
        Preconditions.checkArgument(i14 >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f14 > 0.0f, "Illegal load factor");
        int iClosedTableSize = Hashing.closedTableSize(i14, f14);
        this.table = newTable(iClosedTableSize);
        this.loadFactor = f14;
        this.keys = new Object[i14];
        this.values = new int[i14];
        this.entries = newEntries(i14);
        this.threshold = Math.max(1, (int) (iClosedTableSize * f14));
    }

    public void insertEntry(int i14, @ParametricNullness K k14, int i15, int i16) {
        this.entries[i14] = (((long) i16) << 32) | NEXT_MASK;
        this.keys[i14] = k14;
        this.values[i14] = i15;
    }

    public void moveLastEntry(int i14) {
        int size = size() - 1;
        Object[] objArr = this.keys;
        if (i14 >= size) {
            objArr[i14] = null;
            this.values[i14] = 0;
            this.entries[i14] = -1;
            return;
        }
        objArr[i14] = objArr[size];
        int[] iArr = this.values;
        iArr[i14] = iArr[size];
        objArr[size] = null;
        iArr[size] = 0;
        long[] jArr = this.entries;
        long j8 = jArr[size];
        jArr[i14] = j8;
        jArr[size] = -1;
        int hash = getHash(j8) & hashTableMask();
        int[] iArr2 = this.table;
        int i15 = iArr2[hash];
        if (i15 == size) {
            iArr2[hash] = i14;
            return;
        }
        while (true) {
            long j14 = this.entries[i15];
            int next = getNext(j14);
            if (next == size) {
                this.entries[i15] = swapNext(j14, i14);
                return;
            }
            i15 = next;
        }
    }

    public int nextIndex(int i14) {
        int i15 = i14 + 1;
        if (i15 < this.size) {
            return i15;
        }
        return -1;
    }

    public int nextIndexAfterRemove(int i14, int i15) {
        return i14 - 1;
    }

    @CanIgnoreReturnValue
    public int put(@ParametricNullness K k14, int i14) {
        CollectPreconditions.checkPositive(i14, "count");
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int iSmearedHash = Hashing.smearedHash(k14);
        int iHashTableMask = hashTableMask() & iSmearedHash;
        int i15 = this.size;
        int[] iArr2 = this.table;
        int i16 = iArr2[iHashTableMask];
        if (i16 == -1) {
            iArr2[iHashTableMask] = i15;
        } else {
            while (true) {
                long j8 = jArr[i16];
                if (getHash(j8) == iSmearedHash && Objects.equal(k14, objArr[i16])) {
                    int i17 = iArr[i16];
                    iArr[i16] = i14;
                    return i17;
                }
                int next = getNext(j8);
                if (next == -1) {
                    jArr[i16] = swapNext(j8, i15);
                    break;
                }
                i16 = next;
            }
        }
        if (i15 == Integer.MAX_VALUE) {
            vb.h.z("Cannot contain more than Integer.MAX_VALUE elements!");
            return 0;
        }
        int i18 = i15 + 1;
        resizeMeMaybe(i18);
        insertEntry(i15, k14, i14, iSmearedHash);
        this.size = i18;
        if (i15 >= this.threshold) {
            resizeTable(this.table.length * 2);
        }
        this.modCount++;
        return 0;
    }

    @CanIgnoreReturnValue
    public int removeEntry(int i14) {
        return remove(this.keys[i14], getHash(this.entries[i14]));
    }

    public void resizeEntries(int i14) {
        this.keys = Arrays.copyOf(this.keys, i14);
        this.values = Arrays.copyOf(this.values, i14);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i14);
        if (i14 > length) {
            Arrays.fill(jArrCopyOf, length, i14, -1L);
        }
        this.entries = jArrCopyOf;
    }

    public void setValue(int i14, int i15) {
        Preconditions.checkElementIndex(i14, this.size);
        this.values[i14] = i15;
    }

    public int size() {
        return this.size;
    }

    public ObjectCountHashMap() {
        init(3, 1.0f);
    }

    public ObjectCountHashMap(int i14) {
        this(i14, 1.0f);
    }

    public ObjectCountHashMap(int i14, float f14) {
        init(i14, f14);
    }

    @CanIgnoreReturnValue
    public int remove(Object obj) {
        return remove(obj, Hashing.smearedHash(obj));
    }
}

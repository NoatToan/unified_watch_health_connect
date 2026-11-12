package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;

    @VisibleForTesting
    transient long[] links;

    public ObjectCountLinkedHashMap(ObjectCountHashMap<K> objectCountHashMap) {
        init(objectCountHashMap.size(), 1.0f);
        int iFirstIndex = objectCountHashMap.firstIndex();
        while (iFirstIndex != -1) {
            put(objectCountHashMap.getKey(iFirstIndex), objectCountHashMap.getValue(iFirstIndex));
            iFirstIndex = objectCountHashMap.nextIndex(iFirstIndex);
        }
    }

    public static <K> ObjectCountLinkedHashMap<K> create() {
        return new ObjectCountLinkedHashMap<>();
    }

    public static <K> ObjectCountLinkedHashMap<K> createWithExpectedSize(int i14) {
        return new ObjectCountLinkedHashMap<>(i14);
    }

    private int getPredecessor(int i14) {
        return (int) (this.links[i14] >>> 32);
    }

    private int getSuccessor(int i14) {
        return (int) this.links[i14];
    }

    private void setPredecessor(int i14, int i15) {
        long[] jArr = this.links;
        jArr[i14] = (jArr[i14] & 4294967295L) | (((long) i15) << 32);
    }

    private void setSucceeds(int i14, int i15) {
        if (i14 == -2) {
            this.firstEntry = i15;
        } else {
            setSuccessor(i14, i15);
        }
        if (i15 == -2) {
            this.lastEntry = i14;
        } else {
            setPredecessor(i15, i14);
        }
    }

    private void setSuccessor(int i14, int i15) {
        long[] jArr = this.links;
        jArr[i14] = (jArr[i14] & (-4294967296L)) | (((long) i15) & 4294967295L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
        super.clear();
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int firstIndex() {
        int i14 = this.firstEntry;
        if (i14 == -2) {
            return -1;
        }
        return i14;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void init(int i14, float f14) {
        super.init(i14, f14);
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = new long[i14];
        this.links = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void insertEntry(int i14, @ParametricNullness K k14, int i15, int i16) {
        super.insertEntry(i14, k14, i15, i16);
        setSucceeds(this.lastEntry, i14);
        setSucceeds(i14, -2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void moveLastEntry(int i14) {
        int size = size() - 1;
        setSucceeds(getPredecessor(i14), getSuccessor(i14));
        if (i14 < size) {
            setSucceeds(getPredecessor(size), i14);
            setSucceeds(i14, getSuccessor(size));
        }
        super.moveLastEntry(i14);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndex(int i14) {
        int successor = getSuccessor(i14);
        if (successor == -2) {
            return -1;
        }
        return successor;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public int nextIndexAfterRemove(int i14, int i15) {
        return i14 == size() ? i15 : i14;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void resizeEntries(int i14) {
        super.resizeEntries(i14);
        long[] jArr = this.links;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i14);
        this.links = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i14, -1L);
    }

    public ObjectCountLinkedHashMap(int i14) {
        this(i14, 1.0f);
    }

    public ObjectCountLinkedHashMap(int i14, float f14) {
        super(i14, f14);
    }

    public ObjectCountLinkedHashMap() {
        this(3);
    }
}

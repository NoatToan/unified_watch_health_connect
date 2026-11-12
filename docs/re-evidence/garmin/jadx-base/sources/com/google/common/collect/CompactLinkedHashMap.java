package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private static final int ENDPOINT = -2;
    private final boolean accessOrder;
    private transient int firstEntry;
    private transient int lastEntry;

    @VisibleForTesting
    transient long[] links;

    public CompactLinkedHashMap(int i14, boolean z14) {
        super(i14);
        this.accessOrder = z14;
    }

    public static <K, V> CompactLinkedHashMap<K, V> create() {
        return new CompactLinkedHashMap<>();
    }

    public static <K, V> CompactLinkedHashMap<K, V> createWithExpectedSize(int i14) {
        return new CompactLinkedHashMap<>(i14);
    }

    private int getPredecessor(int i14) {
        return ((int) (link(i14) >>> 32)) - 1;
    }

    private long link(int i14) {
        return requireLinks()[i14];
    }

    private long[] requireLinks() {
        long[] jArr = this.links;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    private void setLink(int i14, long j8) {
        requireLinks()[i14] = j8;
    }

    private void setPredecessor(int i14, int i15) {
        setLink(i14, (link(i14) & 4294967295L) | (((long) (i15 + 1)) << 32));
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
        setLink(i14, (link(i14) & (-4294967296L)) | (((long) (i15 + 1)) & 4294967295L));
    }

    @Override // com.google.common.collect.CompactHashMap
    public void accessEntry(int i14) {
        if (this.accessOrder) {
            setSucceeds(getPredecessor(i14), getSuccessor(i14));
            setSucceeds(this.lastEntry, i14);
            setSucceeds(i14, -2);
            incrementModCount();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public int adjustAfterRemove(int i14, int i15) {
        return i14 >= size() ? i15 : i14;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.links = new long[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.firstEntry = -2;
        this.lastEntry = -2;
        long[] jArr = this.links;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    @CanIgnoreReturnValue
    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return mapConvertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map<K, V> createHashFloodingResistantDelegate(int i14) {
        return new LinkedHashMap(i14, 1.0f, this.accessOrder);
    }

    @Override // com.google.common.collect.CompactHashMap
    public int firstEntryIndex() {
        return this.firstEntry;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int getSuccessor(int i14) {
        return ((int) link(i14)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void init(int i14) {
        super.init(i14);
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void insertEntry(int i14, @ParametricNullness K k14, @ParametricNullness V v14, int i15, int i16) {
        super.insertEntry(i14, k14, v14, i15, i16);
        setSucceeds(this.lastEntry, i14);
        setSucceeds(i14, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void moveLastEntry(int i14, int i15) {
        int size = size() - 1;
        super.moveLastEntry(i14, i15);
        setSucceeds(getPredecessor(i14), getSuccessor(i14));
        if (i14 < size) {
            setSucceeds(getPredecessor(size), i14);
            setSucceeds(i14, getSuccessor(size));
        }
        setLink(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void resizeEntries(int i14) {
        super.resizeEntries(i14);
        this.links = Arrays.copyOf(requireLinks(), i14);
    }

    public CompactLinkedHashMap(int i14) {
        this(i14, false);
    }

    public CompactLinkedHashMap() {
        this(3);
    }
}

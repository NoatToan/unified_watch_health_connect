package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactLinkedHashSet<E> extends CompactHashSet<E> {
    private static final int ENDPOINT = -2;
    private transient int firstEntry;
    private transient int lastEntry;
    private transient int[] predecessor;
    private transient int[] successor;

    public CompactLinkedHashSet() {
    }

    public static <E> CompactLinkedHashSet<E> create(Collection<? extends E> collection) {
        CompactLinkedHashSet<E> compactLinkedHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactLinkedHashSetCreateWithExpectedSize.addAll(collection);
        return compactLinkedHashSetCreateWithExpectedSize;
    }

    public static <E> CompactLinkedHashSet<E> createWithExpectedSize(int i14) {
        return new CompactLinkedHashSet<>(i14);
    }

    private int getPredecessor(int i14) {
        return requirePredecessors()[i14] - 1;
    }

    private int[] requirePredecessors() {
        int[] iArr = this.predecessor;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private int[] requireSuccessors() {
        int[] iArr = this.successor;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private void setPredecessor(int i14, int i15) {
        requirePredecessors()[i14] = i15 + 1;
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
        requireSuccessors()[i14] = i15 + 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int adjustAfterRemove(int i14, int i15) {
        return i14 >= size() ? i15 : i14;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.predecessor = new int[iAllocArrays];
        this.successor = new int[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.firstEntry = -2;
        this.lastEntry = -2;
        int[] iArr = this.predecessor;
        if (iArr != null && this.successor != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.successor, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    @CanIgnoreReturnValue
    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> setConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.predecessor = null;
        this.successor = null;
        return setConvertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int firstEntryIndex() {
        return this.firstEntry;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int getSuccessor(int i14) {
        return requireSuccessors()[i14] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void init(int i14) {
        super.init(i14);
        this.firstEntry = -2;
        this.lastEntry = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void insertEntry(int i14, @ParametricNullness E e4, int i15, int i16) {
        super.insertEntry(i14, e4, i15, i16);
        setSucceeds(this.lastEntry, i14);
        setSucceeds(i14, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    public void moveLastEntry(int i14, int i15) {
        int size = size() - 1;
        super.moveLastEntry(i14, i15);
        setSucceeds(getPredecessor(i14), getSuccessor(i14));
        if (i14 < size) {
            setSucceeds(getPredecessor(size), i14);
            setSucceeds(i14, getSuccessor(size));
        }
        requirePredecessors()[size] = 0;
        requireSuccessors()[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void resizeEntries(int i14) {
        super.resizeEntries(i14);
        this.predecessor = Arrays.copyOf(requirePredecessors(), i14);
        this.successor = Arrays.copyOf(requireSuccessors(), i14);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return ObjectArrays.toArrayImpl(this);
    }

    public CompactLinkedHashSet(int i14) {
        super(i14);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ObjectArrays.toArrayImpl(this, tArr);
    }

    public static <E> CompactLinkedHashSet<E> create() {
        return new CompactLinkedHashSet<>();
    }

    @SafeVarargs
    public static <E> CompactLinkedHashSet<E> create(E... eArr) {
        CompactLinkedHashSet<E> compactLinkedHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactLinkedHashSetCreateWithExpectedSize, eArr);
        return compactLinkedHashSetCreateWithExpectedSize;
    }
}

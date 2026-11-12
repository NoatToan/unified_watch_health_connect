package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    @VisibleForTesting
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;

    @VisibleForTesting
    transient Object[] elements;
    private transient int[] entries;
    private transient int metadata;
    private transient int size;
    private transient Object table;

    public CompactHashSet() {
        init(3);
    }

    public static <E> CompactHashSet<E> create(Collection<? extends E> collection) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactHashSetCreateWithExpectedSize.addAll(collection);
        return compactHashSetCreateWithExpectedSize;
    }

    private Set<E> createHashFloodingResistantDelegate(int i14) {
        return new LinkedHashSet(i14, 1.0f);
    }

    public static <E> CompactHashSet<E> createWithExpectedSize(int i14) {
        return new CompactHashSet<>(i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E element(int i14) {
        return (E) requireElements()[i14];
    }

    private int entry(int i14) {
        return requireEntries()[i14];
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i14 = objectInputStream.readInt();
        if (i14 < 0) {
            throw new InvalidObjectException(am.j.h(i14, "Invalid size: "));
        }
        init(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            add(objectInputStream.readObject());
        }
    }

    private Object[] requireElements() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] requireEntries() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object requireTable() {
        Object obj = this.table;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void resizeMeMaybe(int i14) {
        int iMin;
        int length = requireEntries().length;
        if (i14 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(iMin);
    }

    @CanIgnoreReturnValue
    private int resizeTable(int i14, int i15, int i16, int i17) {
        Object objCreateTable = CompactHashing.createTable(i15);
        int i18 = i15 - 1;
        if (i17 != 0) {
            CompactHashing.tableSet(objCreateTable, i16 & i18, i17 + 1);
        }
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i19 = 0; i19 <= i14; i19++) {
            int iTableGet = CompactHashing.tableGet(objRequireTable, i19);
            while (iTableGet != 0) {
                int i24 = iTableGet - 1;
                int i25 = iArrRequireEntries[i24];
                int hashPrefix = CompactHashing.getHashPrefix(i25, i14) | i19;
                int i26 = hashPrefix & i18;
                int iTableGet2 = CompactHashing.tableGet(objCreateTable, i26);
                CompactHashing.tableSet(objCreateTable, i26, iTableGet);
                iArrRequireEntries[i24] = CompactHashing.maskCombine(hashPrefix, iTableGet2, i18);
                iTableGet = CompactHashing.getNext(i25, i14);
            }
        }
        this.table = objCreateTable;
        setHashTableMask(i18);
        return i18;
    }

    private void setElement(int i14, E e4) {
        requireElements()[i14] = e4;
    }

    private void setEntry(int i14, int i15) {
        requireEntries()[i14] = i15;
    }

    private void setHashTableMask(int i14) {
        this.metadata = CompactHashing.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i14), 31);
    }

    @J2ktIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e4) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.add(e4);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int i14 = this.size;
        int i15 = i14 + 1;
        int iSmearedHash = Hashing.smearedHash(e4);
        int iHashTableMask = hashTableMask();
        int i16 = iSmearedHash & iHashTableMask;
        int iTableGet = CompactHashing.tableGet(requireTable(), i16);
        if (iTableGet != 0) {
            int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
            int i17 = 0;
            while (true) {
                int i18 = iTableGet - 1;
                int i19 = iArrRequireEntries[i18];
                if (CompactHashing.getHashPrefix(i19, iHashTableMask) == hashPrefix && com.google.common.base.Objects.equal(e4, objArrRequireElements[i18])) {
                    return false;
                }
                int next = CompactHashing.getNext(i19, iHashTableMask);
                i17++;
                if (next != 0) {
                    iTableGet = next;
                } else {
                    if (i17 >= 9) {
                        return convertToHashFloodingResistantImplementation().add(e4);
                    }
                    if (i15 > iHashTableMask) {
                        iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i14);
                    } else {
                        iArrRequireEntries[i18] = CompactHashing.maskCombine(i19, i15, iHashTableMask);
                    }
                }
            }
        } else if (i15 > iHashTableMask) {
            iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i14);
        } else {
            CompactHashing.tableSet(requireTable(), i16, i15);
        }
        resizeMeMaybe(i15);
        insertEntry(i14, e4, iSmearedHash, iHashTableMask);
        this.size = i15;
        incrementModCount();
        return true;
    }

    public int adjustAfterRemove(int i14, int i15) {
        return i14 - 1;
    }

    @CanIgnoreReturnValue
    public int allocArrays() {
        Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i14 = this.metadata;
        int iTableSize = CompactHashing.tableSize(i14);
        this.table = CompactHashing.createTable(iTableSize);
        setHashTableMask(iTableSize - 1);
        this.entries = new int[i14];
        this.elements = new Object[i14];
        return i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, 1073741823);
            setDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireElements(), 0, this.size, (Object) null);
        CompactHashing.tableClear(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.contains(obj);
        }
        int iSmearedHash = Hashing.smearedHash(obj);
        int iHashTableMask = hashTableMask();
        int iTableGet = CompactHashing.tableGet(requireTable(), iSmearedHash & iHashTableMask);
        if (iTableGet == 0) {
            return false;
        }
        int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
        do {
            int i14 = iTableGet - 1;
            int iEntry = entry(i14);
            if (CompactHashing.getHashPrefix(iEntry, iHashTableMask) == hashPrefix && com.google.common.base.Objects.equal(obj, element(i14))) {
                return true;
            }
            iTableGet = CompactHashing.getNext(iEntry, iHashTableMask);
        } while (iTableGet != 0);
        return false;
    }

    @CanIgnoreReturnValue
    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            setCreateHashFloodingResistantDelegate.add(element(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = setCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return setCreateHashFloodingResistantDelegate;
    }

    @VisibleForTesting
    public Set<E> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    public int getSuccessor(int i14) {
        int i15 = i14 + 1;
        if (i15 < this.size) {
            return i15;
        }
        return -1;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public void init(int i14) {
        Preconditions.checkArgument(i14 >= 0, "Expected size must be >= 0");
        this.metadata = Ints.constrainToRange(i14, 1, 1073741823);
    }

    public void insertEntry(int i14, @ParametricNullness E e4, int i15, int i16) {
        setEntry(i14, CompactHashing.maskCombine(i15, 0, i16));
        setElement(i14, e4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @VisibleForTesting
    public boolean isUsingHashFloodingResistance() {
        return delegateOrNull() != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.iterator() : new Iterator<E>() { // from class: com.google.common.collect.CompactHashSet.1
            int currentIndex;
            int expectedMetadata;
            int indexToRemove = -1;

            {
                this.expectedMetadata = CompactHashSet.this.metadata;
                this.currentIndex = CompactHashSet.this.firstEntryIndex();
            }

            private void checkForConcurrentModification() {
                if (CompactHashSet.this.metadata == this.expectedMetadata) {
                    return;
                }
                org.apache.commons.lang3.e.h();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.currentIndex >= 0;
            }

            public void incrementExpectedModCount() {
                this.expectedMetadata += 32;
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public E next() {
                checkForConcurrentModification();
                if (!hasNext()) {
                    c22.t.g();
                    return null;
                }
                int i14 = this.currentIndex;
                this.indexToRemove = i14;
                E e4 = (E) CompactHashSet.this.element(i14);
                this.currentIndex = CompactHashSet.this.getSuccessor(this.currentIndex);
                return e4;
            }

            @Override // java.util.Iterator
            public void remove() {
                checkForConcurrentModification();
                CollectPreconditions.checkRemove(this.indexToRemove >= 0);
                incrementExpectedModCount();
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.remove(compactHashSet.element(this.indexToRemove));
                this.currentIndex = CompactHashSet.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
                this.indexToRemove = -1;
            }
        };
    }

    public void moveLastEntry(int i14, int i15) {
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int size = size();
        int i16 = size - 1;
        if (i14 >= i16) {
            objArrRequireElements[i14] = null;
            iArrRequireEntries[i14] = 0;
            return;
        }
        Object obj = objArrRequireElements[i16];
        objArrRequireElements[i14] = obj;
        objArrRequireElements[i16] = null;
        iArrRequireEntries[i14] = iArrRequireEntries[i16];
        iArrRequireEntries[i16] = 0;
        int iSmearedHash = Hashing.smearedHash(obj) & i15;
        int iTableGet = CompactHashing.tableGet(objRequireTable, iSmearedHash);
        if (iTableGet == size) {
            CompactHashing.tableSet(objRequireTable, iSmearedHash, i14 + 1);
            return;
        }
        while (true) {
            int i17 = iTableGet - 1;
            int i18 = iArrRequireEntries[i17];
            int next = CompactHashing.getNext(i18, i15);
            if (next == size) {
                iArrRequireEntries[i17] = CompactHashing.maskCombine(i18, i14 + 1, i15);
                return;
            }
            iTableGet = next;
        }
    }

    public boolean needsAllocArrays() {
        return this.table == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        if (needsAllocArrays()) {
            return false;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            return setDelegateOrNull.remove(obj);
        }
        int iHashTableMask = hashTableMask();
        int iRemove = CompactHashing.remove(obj, null, iHashTableMask, requireTable(), requireEntries(), requireElements(), null);
        if (iRemove == -1) {
            return false;
        }
        moveLastEntry(iRemove, iHashTableMask);
        this.size--;
        incrementModCount();
        return true;
    }

    public void resizeEntries(int i14) {
        this.entries = Arrays.copyOf(requireEntries(), i14);
        this.elements = Arrays.copyOf(requireElements(), i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.size() : this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (!needsAllocArrays()) {
            Set<E> setDelegateOrNull = delegateOrNull();
            return setDelegateOrNull != null ? (T[]) setDelegateOrNull.toArray(tArr) : (T[]) ObjectArrays.toArrayImpl(requireElements(), 0, this.size, tArr);
        }
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        if (setDelegateOrNull != null) {
            Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            setCreateHashFloodingResistantDelegate.addAll(setDelegateOrNull);
            this.table = setCreateHashFloodingResistantDelegate;
            return;
        }
        int i14 = this.size;
        if (i14 < requireEntries().length) {
            resizeEntries(i14);
        }
        int iTableSize = CompactHashing.tableSize(i14);
        int iHashTableMask = hashTableMask();
        if (iTableSize < iHashTableMask) {
            resizeTable(iHashTableMask, iTableSize, 0, 0);
        }
    }

    public CompactHashSet(int i14) {
        init(i14);
    }

    public static <E> CompactHashSet<E> create() {
        return new CompactHashSet<>();
    }

    @SafeVarargs
    public static <E> CompactHashSet<E> create(E... eArr) {
        CompactHashSet<E> compactHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactHashSetCreateWithExpectedSize, eArr);
        return compactHashSetCreateWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (needsAllocArrays()) {
            return new Object[0];
        }
        Set<E> setDelegateOrNull = delegateOrNull();
        return setDelegateOrNull != null ? setDelegateOrNull.toArray() : Arrays.copyOf(requireElements(), this.size);
    }
}

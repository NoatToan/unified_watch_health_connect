package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {

    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 0;
    transient ObjectCountHashMap<E> backingMap;
    transient long size;

    public abstract class Itr<T> implements Iterator<T> {
        int entryIndex;
        int expectedModCount;
        int toRemove = -1;

        public Itr() {
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.firstIndex();
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        }

        private void checkForConcurrentModification() {
            if (AbstractMapBasedMultiset.this.backingMap.modCount == this.expectedModCount) {
                return;
            }
            org.apache.commons.lang3.e.h();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            return this.entryIndex >= 0;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!hasNext()) {
                c22.t.g();
                return null;
            }
            T tResult = result(this.entryIndex);
            int i14 = this.entryIndex;
            this.toRemove = i14;
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndex(i14);
            return tResult;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.toRemove != -1);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.size -= (long) abstractMapBasedMultiset.backingMap.removeEntry(this.toRemove);
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndexAfterRemove(this.entryIndex, this.toRemove);
            this.toRemove = -1;
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        }

        @ParametricNullness
        public abstract T result(int i14);
    }

    public AbstractMapBasedMultiset(int i14) {
        this.backingMap = newBackingMap(i14);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int count = Serialization.readCount(objectInputStream);
        this.backingMap = newBackingMap(3);
        Serialization.populateMultiset(this, objectInputStream, count);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultiset(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int add(@ParametricNullness E e4, int i14) {
        if (i14 == 0) {
            return count(e4);
        }
        Preconditions.checkArgument(i14 > 0, "occurrences cannot be negative: %s", i14);
        int iIndexOf = this.backingMap.indexOf(e4);
        ObjectCountHashMap<E> objectCountHashMap = this.backingMap;
        if (iIndexOf == -1) {
            objectCountHashMap.put(e4, i14);
            this.size += (long) i14;
            return 0;
        }
        int value = objectCountHashMap.getValue(iIndexOf);
        long j8 = i14;
        long j14 = ((long) value) + j8;
        Preconditions.checkArgument(j14 <= 2147483647L, "too many occurrences: %s", j14);
        this.backingMap.setValue(iIndexOf, (int) j14);
        this.size += j8;
        return value;
    }

    public void addTo(Multiset<? super E> multiset) {
        Preconditions.checkNotNull(multiset);
        int iFirstIndex = this.backingMap.firstIndex();
        while (iFirstIndex >= 0) {
            multiset.add(this.backingMap.getKey(iFirstIndex), this.backingMap.getValue(iFirstIndex));
            iFirstIndex = this.backingMap.nextIndex(iFirstIndex);
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.clear();
        this.size = 0L;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(Object obj) {
        return this.backingMap.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int distinctElements() {
        return this.backingMap.size();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<E> elementIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<E>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            @ParametricNullness
            public E result(int i14) {
                return AbstractMapBasedMultiset.this.backingMap.getKey(i14);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<Multiset.Entry<E>> entryIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public Multiset.Entry<E> result(int i14) {
                return AbstractMapBasedMultiset.this.backingMap.getEntry(i14);
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    public abstract ObjectCountHashMap<E> newBackingMap(int i14);

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int remove(Object obj, int i14) {
        if (i14 == 0) {
            return count(obj);
        }
        Preconditions.checkArgument(i14 > 0, "occurrences cannot be negative: %s", i14);
        int iIndexOf = this.backingMap.indexOf(obj);
        if (iIndexOf == -1) {
            return 0;
        }
        int value = this.backingMap.getValue(iIndexOf);
        ObjectCountHashMap<E> objectCountHashMap = this.backingMap;
        if (value > i14) {
            objectCountHashMap.setValue(iIndexOf, value - i14);
        } else {
            objectCountHashMap.removeEntry(iIndexOf);
            i14 = value;
        }
        this.size -= (long) i14;
        return value;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@ParametricNullness E e4, int i14, int i15) {
        CollectPreconditions.checkNonnegative(i14, "oldCount");
        CollectPreconditions.checkNonnegative(i15, "newCount");
        int iIndexOf = this.backingMap.indexOf(e4);
        if (iIndexOf == -1) {
            if (i14 != 0) {
                return false;
            }
            if (i15 > 0) {
                this.backingMap.put(e4, i15);
                this.size += (long) i15;
            }
            return true;
        }
        if (this.backingMap.getValue(iIndexOf) != i14) {
            return false;
        }
        ObjectCountHashMap<E> objectCountHashMap = this.backingMap;
        if (i15 == 0) {
            objectCountHashMap.removeEntry(iIndexOf);
            this.size -= (long) i14;
        } else {
            objectCountHashMap.setValue(iIndexOf, i15);
            this.size += (long) (i15 - i14);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.saturatedCast(this.size);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(@ParametricNullness E e4, int i14) {
        CollectPreconditions.checkNonnegative(i14, "count");
        ObjectCountHashMap<E> objectCountHashMap = this.backingMap;
        int iRemove = i14 == 0 ? objectCountHashMap.remove(e4) : objectCountHashMap.put(e4, i14);
        this.size += (long) (i14 - iRemove);
        return iRemove;
    }
}

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import defpackage.ale;
import defpackage.amt;
import defpackage.ann;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 0;
    transient amt<E> backingMap;
    transient long size;

    protected abstract amt<E> newBackingMap(int i);

    public AbstractMapBasedMultiset(int i) {
        this.backingMap = newBackingMap(i);
    }

    @Override // com.google.common.collect.Multiset
    public final int count(@CheckForNull Object obj) {
        return this.backingMap.b(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(@ParametricNullness E e, int i) {
        if (i == 0) {
            return count(e);
        }
        Preconditions.checkArgument(i > 0, "occurrences cannot be negative: %s", i);
        int iA = this.backingMap.a(e);
        if (iA == -1) {
            this.backingMap.d(e, i);
            this.size += (long) i;
            return 0;
        }
        int iE = this.backingMap.e(iA);
        long j = i;
        long j2 = ((long) iE) + j;
        Preconditions.checkArgument(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.backingMap.a(iA, (int) j2);
        this.size += j;
        return iE;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int remove(@CheckForNull Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        Preconditions.checkArgument(i > 0, "occurrences cannot be negative: %s", i);
        int iA = this.backingMap.a(obj);
        if (iA == -1) {
            return 0;
        }
        int iE = this.backingMap.e(iA);
        if (iE > i) {
            this.backingMap.a(iA, iE - i);
        } else {
            this.backingMap.j(iA);
            i = iE;
        }
        this.size -= (long) i;
        return iE;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int setCount(@ParametricNullness E e, int i) {
        ale.b(i, "count");
        amt<E> amtVar = this.backingMap;
        int iC = i == 0 ? amtVar.c(e) : amtVar.d(e, i);
        this.size += (long) (i - iC);
        return iC;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@ParametricNullness E e, int i, int i2) {
        ale.b(i, "oldCount");
        ale.b(i2, "newCount");
        int iA = this.backingMap.a(e);
        if (iA == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.d(e, i2);
                this.size += (long) i2;
            }
            return true;
        }
        if (this.backingMap.e(iA) != i) {
            return false;
        }
        if (i2 == 0) {
            this.backingMap.j(iA);
            this.size -= (long) i;
        } else {
            this.backingMap.a(iA, i2);
            this.size += (long) (i2 - i);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.b();
        this.size = 0L;
    }

    abstract class Itr<T> implements Iterator<T> {
        int entryIndex;
        int expectedModCount;
        int toRemove = -1;

        @ParametricNullness
        abstract T result(int i);

        Itr() {
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.d();
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.e;
        }

        private void checkForConcurrentModification() {
            if (AbstractMapBasedMultiset.this.backingMap.e != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
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
                throw new NoSuchElementException();
            }
            T tResult = result(this.entryIndex);
            this.toRemove = this.entryIndex;
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.g(this.entryIndex);
            return tResult;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            ale.b(this.toRemove != -1);
            AbstractMapBasedMultiset.this.size -= (long) AbstractMapBasedMultiset.this.backingMap.j(this.toRemove);
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.b(this.entryIndex, this.toRemove);
            this.toRemove = -1;
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.e;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    final Iterator<E> elementIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<E>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.5
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            @ParametricNullness
            E result(int i) {
                return AbstractMapBasedMultiset.this.backingMap.b(i);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    final Iterator<Multiset.Entry<E>> entryIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry<E> result(int i) {
                return AbstractMapBasedMultiset.this.backingMap.a(i);
            }
        };
    }

    void addTo(Multiset<? super E> multiset) {
        Preconditions.checkNotNull(multiset);
        int iD = this.backingMap.d();
        while (iD >= 0) {
            multiset.add(this.backingMap.b(iD), this.backingMap.e(iD));
            iD = this.backingMap.g(iD);
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    final int distinctElements() {
        return this.backingMap.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.b(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.a(this.size);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ann.b(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iE = ann.e(objectInputStream);
        this.backingMap = newBackingMap(3);
        ann.a(this, objectInputStream, iE);
    }
}

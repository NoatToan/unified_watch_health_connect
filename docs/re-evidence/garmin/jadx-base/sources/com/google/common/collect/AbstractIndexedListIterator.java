package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {
    private int position;
    private final int size;

    public AbstractIndexedListIterator(int i14, int i15) {
        Preconditions.checkPositionIndex(i15, i14);
        this.size = i14;
        this.position = i15;
    }

    @ParametricNullness
    public abstract E get(int i14);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.position < this.size;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.position > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @ParametricNullness
    public final E next() {
        if (!hasNext()) {
            c22.t.g();
            return null;
        }
        int i14 = this.position;
        this.position = i14 + 1;
        return get(i14);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.position;
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final E previous() {
        if (!hasPrevious()) {
            c22.t.g();
            return null;
        }
        int i14 = this.position - 1;
        this.position = i14;
        return get(i14);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.position - 1;
    }

    public AbstractIndexedListIterator(int i14) {
        this(i14, 0);
    }
}

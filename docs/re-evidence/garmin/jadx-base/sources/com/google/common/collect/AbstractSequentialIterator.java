package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
    private T nextOrNull;

    public AbstractSequentialIterator(T t7) {
        this.nextOrNull = t7;
    }

    public abstract T computeNext(T t7);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.nextOrNull != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t7 = this.nextOrNull;
        if (t7 != null) {
            this.nextOrNull = computeNext(t7);
            return t7;
        }
        c22.t.g();
        return null;
    }
}

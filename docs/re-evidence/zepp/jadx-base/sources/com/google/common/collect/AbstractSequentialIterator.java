package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {

    @NullableDecl
    private T a;

    public AbstractSequentialIterator(@NullableDecl T t) {
        this.a = t;
    }

    @NullableDecl
    public abstract T computeNext(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return this.a;
        } finally {
            this.a = computeNext(this.a);
        }
    }
}

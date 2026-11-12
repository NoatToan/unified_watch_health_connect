package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
class b0<T> extends AbstractIterator<T> {
    private final Queue<T> c;

    public b0(T... tArr) {
        ArrayDeque arrayDeque = new ArrayDeque(tArr.length);
        this.c = arrayDeque;
        Collections.addAll(arrayDeque, tArr);
    }

    @Override // com.google.common.collect.AbstractIterator
    public T computeNext() {
        return this.c.isEmpty() ? endOfData() : this.c.remove();
    }

    public b0(Queue<T> queue) {
        this.c = (Queue) Preconditions.checkNotNull(queue);
    }
}

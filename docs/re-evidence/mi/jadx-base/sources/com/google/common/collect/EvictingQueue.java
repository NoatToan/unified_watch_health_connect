package com.google.common.collect;

import defpackage.c6i;
import defpackage.cpd;
import defpackage.u1a;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
public final class EvictingQueue<E> extends u1a<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue<E> delegate;
    final int maxSize;

    private EvictingQueue(int i) {
        c6i.f(i >= 0, "maxSize (%s) must >= 0", i);
        this.delegate = new ArrayDeque(i);
        this.maxSize = i;
    }

    public static <E> EvictingQueue<E> create(int i) {
        return new EvictingQueue<>(i);
    }

    @Override // defpackage.i1a, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        c6i.o(e);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    @Override // defpackage.i1a, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return standardAddAll(collection);
        }
        clear();
        return cpd.a(this, cpd.j(collection, size - this.maxSize));
    }

    @Override // defpackage.u1a, java.util.Queue
    public boolean offer(E e) {
        return add(e);
    }

    public int remainingCapacity() {
        return this.maxSize - size();
    }

    @Override // defpackage.i1a, java.util.Collection
    public Object[] toArray() {
        return super.toArray();
    }

    @Override // defpackage.u1a, defpackage.i1a, defpackage.t1a
    public Queue<E> delegate() {
        return this.delegate;
    }
}

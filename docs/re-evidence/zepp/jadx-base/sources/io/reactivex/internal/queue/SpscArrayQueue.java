package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes22.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {
    private static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    public final int a;
    public final AtomicLong b;
    public long c;
    public final AtomicLong d;
    public final int e;

    public SpscArrayQueue(int i) {
        super(Pow2.roundToPowerOfTwo(i));
        this.a = length() - 1;
        this.b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(i / 4, f.intValue());
    }

    public int a(long j) {
        return this.a & ((int) j);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public int f(long j, int i) {
        return ((int) j) & i;
    }

    public E g(int i) {
        return get(i);
    }

    public void h(long j) {
        this.d.lazySet(j);
    }

    public void i(int i, E e) {
        lazySet(i, e);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.b.get() == this.d.get();
    }

    public void j(long j) {
        this.b.lazySet(j);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E e) {
        Objects.requireNonNull(e, "Null is not a valid element");
        int i = this.a;
        long j = this.b.get();
        int iF = f(j, i);
        if (j >= this.c) {
            long j2 = ((long) this.e) + j;
            if (g(f(j2, i)) == null) {
                this.c = j2;
            } else if (g(iF) != null) {
                return false;
            }
        }
        i(iF, e);
        j(j + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public E poll() {
        long j = this.d.get();
        int iA = a(j);
        E eG = g(iA);
        if (eG == null) {
            return null;
        }
        h(j + 1);
        i(iA, null);
        return eG;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E e, E e2) {
        return offer(e) && offer(e2);
    }
}

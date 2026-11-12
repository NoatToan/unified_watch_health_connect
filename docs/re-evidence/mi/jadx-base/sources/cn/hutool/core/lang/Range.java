package cn.hutool.core.lang;

import defpackage.qk1;
import defpackage.qug;
import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class Range<T> implements Iterable<T>, Iterator<T>, Serializable {
    private static final long serialVersionUID = 1;
    private final T end;
    private final boolean includeEnd;
    private final boolean includeStart;
    private int index;
    private Lock lock;
    private T next;
    private final T start;
    private final a<T> stepper;

    @FunctionalInterface
    public interface a<T> {
        T a(T t, T t2, int i);
    }

    public Range(T t, a<T> aVar) {
        this(t, null, aVar);
    }

    private T nextUncheck() {
        T t;
        int i = this.index;
        if (i == 0) {
            t = this.start;
            if (!this.includeStart) {
                this.index = i + 1;
                return nextUncheck();
            }
        } else {
            t = this.next;
            this.next = safeStep(t);
        }
        this.index++;
        return t;
    }

    private T safeStep(T t) {
        try {
            return this.stepper.a(t, this.end, this.index);
        } catch (Exception unused) {
            return null;
        }
    }

    public Range<T> disableLock() {
        this.lock = new qug();
        return this;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        this.lock.lock();
        try {
            if (this.index == 0 && this.includeStart) {
                return true;
            }
            T t = this.next;
            return t != null && (this.includeEnd || !t.equals(this.end));
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public T next() {
        this.lock.lock();
        try {
            if (!hasNext()) {
                throw new NoSuchElementException("Has no next range!");
            }
            T tNextUncheck = nextUncheck();
            this.lock.unlock();
            return tNextUncheck;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Can not remove ranged element!");
    }

    public Range<T> reset() {
        this.lock.lock();
        try {
            this.index = 0;
            this.next = safeStep(this.start);
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public Range(T t, T t2, a<T> aVar) {
        this(t, t2, aVar, true, true);
    }

    public Range(T t, T t2, a<T> aVar, boolean z, boolean z2) {
        this.lock = new ReentrantLock();
        this.index = 0;
        qk1.u(t, "First element must be not null!", new Object[0]);
        this.start = t;
        this.end = t2;
        this.stepper = aVar;
        this.next = safeStep(t);
        this.includeStart = z;
        this.includeEnd = z2;
    }
}

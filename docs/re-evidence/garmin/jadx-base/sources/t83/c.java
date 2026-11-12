package t83;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes11.dex */
public final class c<T> extends AtomicReferenceArray<T> implements Queue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f163179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f163180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f163181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f163182d;

    public c(int i14) {
        super(rx.internal.util.unsafe.c.a(i14));
        int length = length();
        this.f163179a = length - 1;
        this.f163180b = length - i14;
        this.f163181c = new AtomicLong();
        this.f163182d = new AtomicLong();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(T t7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final T element() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f163181c == this.f163182d;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(T t7) {
        t7.getClass();
        AtomicLong atomicLong = this.f163181c;
        long j8 = atomicLong.get();
        int i14 = (int) (((long) this.f163180b) + j8);
        int i15 = this.f163179a;
        if (get(i14 & i15) != null) {
            return false;
        }
        atomicLong.lazySet(j8 + 1);
        lazySet(((int) j8) & i15, t7);
        return true;
    }

    @Override // java.util.Queue
    public final T peek() {
        return get(((int) this.f163182d.get()) & this.f163179a);
    }

    @Override // java.util.Queue
    public final T poll() {
        AtomicLong atomicLong = this.f163182d;
        long j8 = atomicLong.get();
        int i14 = ((int) j8) & this.f163179a;
        T t7 = get(i14);
        if (t7 == null) {
            return null;
        }
        atomicLong.lazySet(j8 + 1);
        lazySet(i14, null);
        return t7;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        AtomicLong atomicLong = this.f163182d;
        long j8 = atomicLong.get();
        while (true) {
            long j14 = this.f163181c.get();
            long j15 = atomicLong.get();
            if (j8 == j15) {
                return (int) (j14 - j15);
            }
            j8 = j15;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }
}

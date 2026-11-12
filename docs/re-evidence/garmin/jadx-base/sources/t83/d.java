package t83;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes11.dex */
public final class d<T> implements Queue<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f163183i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f163184j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f163185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f163186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f163187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f163188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray<Object> f163189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f163190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray<Object> f163191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f163192h;

    public d(int i14) {
        int iA = rx.internal.util.unsafe.c.a(Math.max(8, i14));
        int i15 = iA - 1;
        AtomicLong atomicLong = new AtomicLong();
        this.f163185a = atomicLong;
        this.f163192h = new AtomicLong();
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iA + 1);
        this.f163189e = atomicReferenceArray;
        this.f163188d = i15;
        this.f163186b = Math.min(iA / 4, f163183i);
        this.f163191g = atomicReferenceArray;
        this.f163190f = i15;
        this.f163187c = iA - 2;
        atomicLong.lazySet(0L);
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
        return this.f163185a.get() == this.f163192h.get();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(T t7) {
        t7.getClass();
        AtomicReferenceArray<Object> atomicReferenceArray = this.f163189e;
        AtomicLong atomicLong = this.f163185a;
        long j8 = atomicLong.get();
        int i14 = this.f163188d;
        int i15 = ((int) j8) & i14;
        if (j8 < this.f163187c) {
            atomicLong.lazySet(j8 + 1);
            atomicReferenceArray.lazySet(i15, t7);
            return true;
        }
        long j14 = ((long) this.f163186b) + j8;
        if (atomicReferenceArray.get(((int) j14) & i14) == null) {
            this.f163187c = j14 - 1;
            atomicLong.lazySet(j8 + 1);
            atomicReferenceArray.lazySet(i15, t7);
            return true;
        }
        long j15 = j8 + 1;
        if (atomicReferenceArray.get(((int) j15) & i14) != null) {
            atomicLong.lazySet(j15);
            atomicReferenceArray.lazySet(i15, t7);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f163189e = atomicReferenceArray2;
        this.f163187c = (j8 + ((long) i14)) - 1;
        atomicLong.lazySet(j15);
        atomicReferenceArray2.lazySet(i15, t7);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i15, f163184j);
        return true;
    }

    @Override // java.util.Queue
    public final T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f163191g;
        int i14 = ((int) this.f163192h.get()) & this.f163190f;
        T t7 = (T) atomicReferenceArray.get(i14);
        if (t7 != f163184j) {
            return t7;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
        this.f163191g = atomicReferenceArray2;
        return (T) atomicReferenceArray2.get(i14);
    }

    @Override // java.util.Queue
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f163191g;
        AtomicLong atomicLong = this.f163192h;
        long j8 = atomicLong.get();
        int i14 = this.f163190f & ((int) j8);
        T t7 = (T) atomicReferenceArray.get(i14);
        boolean z14 = t7 == f163184j;
        if (t7 != null && !z14) {
            atomicLong.lazySet(j8 + 1);
            atomicReferenceArray.lazySet(i14, null);
            return t7;
        }
        if (z14) {
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
            this.f163191g = atomicReferenceArray2;
            T t14 = (T) atomicReferenceArray2.get(i14);
            if (t14 != null) {
                atomicLong.lazySet(j8 + 1);
                atomicReferenceArray2.lazySet(i14, null);
                return t14;
            }
        }
        return null;
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
        AtomicLong atomicLong = this.f163192h;
        long j8 = atomicLong.get();
        while (true) {
            long j14 = this.f163185a.get();
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

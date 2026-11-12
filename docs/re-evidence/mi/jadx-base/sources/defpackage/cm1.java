package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.internal.util.unsafe.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cm1<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<E> f5472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5473b;

    public cm1(int i) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.f5473b = iRoundToPowerOfTwo - 1;
        this.f5472a = new AtomicReferenceArray<>(iRoundToPowerOfTwo);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final int e(long j) {
        return ((int) j) & this.f5473b;
    }

    public final int f(long j, int i) {
        return ((int) j) & i;
    }

    public final E g(int i) {
        return h(this.f5472a, i);
    }

    public final E h(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public final void i(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}

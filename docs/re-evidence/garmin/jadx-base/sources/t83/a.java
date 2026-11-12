package t83;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<E> f163172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f163173b;

    public a(int i14) {
        int iA = rx.internal.util.unsafe.c.a(i14);
        this.f163173b = iA - 1;
        this.f163172a = new AtomicReferenceArray<>(iA);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }
}

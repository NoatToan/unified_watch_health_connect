package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.atomic.LinkedQueueNode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r82<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<E>> f32307a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<LinkedQueueNode<E>> f32308b = new AtomicReference<>();

    public final LinkedQueueNode<E> e() {
        return this.f32308b.get();
    }

    public final LinkedQueueNode<E> f() {
        return this.f32307a.get();
    }

    public final LinkedQueueNode<E> g() {
        return this.f32308b.get();
    }

    public final LinkedQueueNode<E> h() {
        return this.f32307a.get();
    }

    public final void i(LinkedQueueNode<E> linkedQueueNode) {
        this.f32308b.lazySet(linkedQueueNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return g() == h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final void j(LinkedQueueNode<E> linkedQueueNode) {
        this.f32307a.lazySet(linkedQueueNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        LinkedQueueNode<E> linkedQueueNodeLvNext;
        LinkedQueueNode<E> linkedQueueNodeG = g();
        LinkedQueueNode<E> linkedQueueNodeH = h();
        int i = 0;
        while (linkedQueueNodeG != linkedQueueNodeH && i < Integer.MAX_VALUE) {
            do {
                linkedQueueNodeLvNext = linkedQueueNodeG.lvNext();
            } while (linkedQueueNodeLvNext == null);
            i++;
            linkedQueueNodeG = linkedQueueNodeLvNext;
        }
        return i;
    }
}

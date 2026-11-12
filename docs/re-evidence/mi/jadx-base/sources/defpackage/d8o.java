package defpackage;

import rx.internal.util.atomic.LinkedQueueNode;

/* JADX INFO: loaded from: classes3.dex */
public final class d8o<E> extends r82<E> {
    public d8o() {
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>();
        j(linkedQueueNode);
        i(linkedQueueNode);
        linkedQueueNode.soNext(null);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("null elements not allowed");
        }
        LinkedQueueNode<E> linkedQueueNode = new LinkedQueueNode<>(e);
        f().soNext(linkedQueueNode);
        j(linkedQueueNode);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        LinkedQueueNode<E> linkedQueueNodeLvNext = e().lvNext();
        if (linkedQueueNodeLvNext != null) {
            return linkedQueueNodeLvNext.lpValue();
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        LinkedQueueNode<E> linkedQueueNodeLvNext = e().lvNext();
        if (linkedQueueNodeLvNext == null) {
            return null;
        }
        E andNullValue = linkedQueueNodeLvNext.getAndNullValue();
        i(linkedQueueNodeLvNext);
        return andNullValue;
    }
}

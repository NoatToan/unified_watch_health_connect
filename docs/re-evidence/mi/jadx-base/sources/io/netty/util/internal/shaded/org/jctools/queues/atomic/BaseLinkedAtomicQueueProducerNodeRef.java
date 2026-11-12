package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import defpackage.q10;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseLinkedAtomicQueueProducerNodeRef<E> extends BaseLinkedAtomicQueuePad0<E> {
    private static final AtomicReferenceFieldUpdater<BaseLinkedAtomicQueueProducerNodeRef, LinkedQueueAtomicNode> P_NODE_UPDATER = AtomicReferenceFieldUpdater.newUpdater(BaseLinkedAtomicQueueProducerNodeRef.class, LinkedQueueAtomicNode.class, "producerNode");
    protected volatile LinkedQueueAtomicNode<E> producerNode;

    public final boolean casProducerNode(LinkedQueueAtomicNode<E> linkedQueueAtomicNode, LinkedQueueAtomicNode<E> linkedQueueAtomicNode2) {
        return q10.a(P_NODE_UPDATER, this, linkedQueueAtomicNode, linkedQueueAtomicNode2);
    }

    public final LinkedQueueAtomicNode<E> lpProducerNode() {
        return this.producerNode;
    }

    public final LinkedQueueAtomicNode<E> lvProducerNode() {
        return this.producerNode;
    }

    public final void spProducerNode(LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        P_NODE_UPDATER.lazySet(this, linkedQueueAtomicNode);
    }

    public final LinkedQueueAtomicNode<E> xchgProducerNode(LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        return P_NODE_UPDATER.getAndSet(this, linkedQueueAtomicNode);
    }
}

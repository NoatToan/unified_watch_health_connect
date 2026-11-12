package io.netty.util.internal.shaded.org.jctools.queues.atomic;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseLinkedAtomicQueue<E> extends BaseLinkedAtomicQueuePad2<E> {
    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int capacity() {
        return -1;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer) {
        long j = 0;
        do {
            int iDrain = drain(consumer, 4096);
            j += (long) iDrain;
            if (iDrain != 4096) {
                break;
            }
        } while (j <= 2147479551);
        return (int) j;
    }

    public E getSingleConsumerNodeValue(LinkedQueueAtomicNode<E> linkedQueueAtomicNode, LinkedQueueAtomicNode<E> linkedQueueAtomicNode2) {
        E andNullValue = linkedQueueAtomicNode2.getAndNullValue();
        linkedQueueAtomicNode.soNext(linkedQueueAtomicNode);
        spConsumerNode(linkedQueueAtomicNode2);
        return andNullValue;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final boolean isEmpty() {
        return lvConsumerNode() == lvProducerNode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final LinkedQueueAtomicNode<E> newNode() {
        return new LinkedQueueAtomicNode<>();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        LinkedQueueAtomicNode<E> linkedQueueAtomicNodeLvNext = lpConsumerNode().lvNext();
        if (linkedQueueAtomicNodeLvNext != null) {
            return linkedQueueAtomicNodeLvNext.lpValue();
        }
        return null;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        LinkedQueueAtomicNode<E> linkedQueueAtomicNodeLpConsumerNode = lpConsumerNode();
        LinkedQueueAtomicNode<E> linkedQueueAtomicNodeLvNext = linkedQueueAtomicNodeLpConsumerNode.lvNext();
        if (linkedQueueAtomicNodeLvNext != null) {
            return getSingleConsumerNodeValue(linkedQueueAtomicNodeLpConsumerNode, linkedQueueAtomicNodeLvNext);
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int size() {
        LinkedQueueAtomicNode<E> linkedQueueAtomicNodeLvConsumerNode = lvConsumerNode();
        LinkedQueueAtomicNode<E> linkedQueueAtomicNodeLvProducerNode = lvProducerNode();
        int i = 0;
        while (linkedQueueAtomicNodeLvConsumerNode != linkedQueueAtomicNodeLvProducerNode && linkedQueueAtomicNodeLvConsumerNode != null && i < Integer.MAX_VALUE) {
            LinkedQueueAtomicNode<E> linkedQueueAtomicNodeLvNext = linkedQueueAtomicNodeLvConsumerNode.lvNext();
            if (linkedQueueAtomicNodeLvNext == linkedQueueAtomicNodeLvConsumerNode) {
                return i;
            }
            i++;
            linkedQueueAtomicNodeLvConsumerNode = linkedQueueAtomicNodeLvNext;
        }
        return i;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return getClass().getName();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer, int i) {
        LinkedQueueAtomicNode<E> linkedQueueAtomicNode = this.consumerNode;
        int i2 = 0;
        while (i2 < i) {
            LinkedQueueAtomicNode<E> linkedQueueAtomicNodeLvNext = linkedQueueAtomicNode.lvNext();
            if (linkedQueueAtomicNodeLvNext == null) {
                return i2;
            }
            consumer.accept(getSingleConsumerNodeValue(linkedQueueAtomicNode, linkedQueueAtomicNodeLvNext));
            i2++;
            linkedQueueAtomicNode = linkedQueueAtomicNodeLvNext;
        }
        return i;
    }

    public final LinkedQueueAtomicNode<E> newNode(E e) {
        return new LinkedQueueAtomicNode<>(e);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(MessagePassingQueue.Consumer<E> consumer, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        LinkedQueueAtomicNode<E> linkedQueueAtomicNode = this.consumerNode;
        int iIdle = 0;
        while (exitCondition.keepRunning()) {
            for (int i = 0; i < 4096; i++) {
                LinkedQueueAtomicNode<E> linkedQueueAtomicNodeLvNext = linkedQueueAtomicNode.lvNext();
                if (linkedQueueAtomicNodeLvNext == null) {
                    iIdle = waitStrategy.idle(iIdle);
                } else {
                    consumer.accept(getSingleConsumerNodeValue(linkedQueueAtomicNode, linkedQueueAtomicNodeLvNext));
                    iIdle = 0;
                    linkedQueueAtomicNode = linkedQueueAtomicNodeLvNext;
                }
            }
        }
    }
}

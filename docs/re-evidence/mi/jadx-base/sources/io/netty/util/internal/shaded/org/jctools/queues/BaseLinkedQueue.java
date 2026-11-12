package io.netty.util.internal.shaded.org.jctools.queues;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseLinkedQueue<E> extends BaseLinkedQueuePad2<E> {
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

    public E getSingleConsumerNodeValue(LinkedQueueNode<E> linkedQueueNode, LinkedQueueNode<E> linkedQueueNode2) {
        E andNullValue = linkedQueueNode2.getAndNullValue();
        linkedQueueNode.soNext(linkedQueueNode);
        spConsumerNode(linkedQueueNode2);
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

    public final LinkedQueueNode<E> newNode() {
        return new LinkedQueueNode<>();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        return offer(e);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        LinkedQueueNode<E> linkedQueueNodeLvNext = lpConsumerNode().lvNext();
        if (linkedQueueNodeLvNext != null) {
            return linkedQueueNodeLvNext.lpValue();
        }
        return null;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        LinkedQueueNode<E> linkedQueueNodeLpConsumerNode = lpConsumerNode();
        LinkedQueueNode<E> linkedQueueNodeLvNext = linkedQueueNodeLpConsumerNode.lvNext();
        if (linkedQueueNodeLvNext != null) {
            return getSingleConsumerNodeValue(linkedQueueNodeLpConsumerNode, linkedQueueNodeLvNext);
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public final int size() {
        LinkedQueueNode<E> linkedQueueNodeLvConsumerNode = lvConsumerNode();
        LinkedQueueNode<E> linkedQueueNodeLvProducerNode = lvProducerNode();
        int i = 0;
        while (linkedQueueNodeLvConsumerNode != linkedQueueNodeLvProducerNode && linkedQueueNodeLvConsumerNode != null && i < Integer.MAX_VALUE) {
            LinkedQueueNode<E> linkedQueueNodeLvNext = linkedQueueNodeLvConsumerNode.lvNext();
            if (linkedQueueNodeLvNext == linkedQueueNodeLvConsumerNode) {
                return i;
            }
            i++;
            linkedQueueNodeLvConsumerNode = linkedQueueNodeLvNext;
        }
        return i;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return getClass().getName();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer, int i) {
        LinkedQueueNode<E> linkedQueueNode = this.consumerNode;
        int i2 = 0;
        while (i2 < i) {
            LinkedQueueNode<E> linkedQueueNodeLvNext = linkedQueueNode.lvNext();
            if (linkedQueueNodeLvNext == null) {
                return i2;
            }
            consumer.accept(getSingleConsumerNodeValue(linkedQueueNode, linkedQueueNodeLvNext));
            i2++;
            linkedQueueNode = linkedQueueNodeLvNext;
        }
        return i;
    }

    public final LinkedQueueNode<E> newNode(E e) {
        return new LinkedQueueNode<>(e);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void drain(MessagePassingQueue.Consumer<E> consumer, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        LinkedQueueNode<E> linkedQueueNode = this.consumerNode;
        int iIdle = 0;
        while (exitCondition.keepRunning()) {
            for (int i = 0; i < 4096; i++) {
                LinkedQueueNode<E> linkedQueueNodeLvNext = linkedQueueNode.lvNext();
                if (linkedQueueNodeLvNext == null) {
                    iIdle = waitStrategy.idle(iIdle);
                } else {
                    consumer.accept(getSingleConsumerNodeValue(linkedQueueNode, linkedQueueNodeLvNext));
                    iIdle = 0;
                    linkedQueueNode = linkedQueueNodeLvNext;
                }
            }
        }
    }
}

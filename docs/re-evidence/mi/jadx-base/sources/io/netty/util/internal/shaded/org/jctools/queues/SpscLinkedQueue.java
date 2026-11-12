package io.netty.util.internal.shaded.org.jctools.queues;

/* JADX INFO: loaded from: classes2.dex */
public class SpscLinkedQueue<E> extends BaseLinkedQueue<E> {
    public SpscLinkedQueue() {
        LinkedQueueNode<E> linkedQueueNodeNewNode = newNode();
        spProducerNode(linkedQueueNodeNewNode);
        spConsumerNode(linkedQueueNodeNewNode);
        linkedQueueNodeNewNode.soNext(null);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int capacity() {
        return super.capacity();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(MessagePassingQueue.Consumer consumer) {
        return super.drain(consumer);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier) {
        long j = 0;
        do {
            fill(supplier, 4096);
            j += 4096;
        } while (j <= 2147479551);
        return (int) j;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        if (e == null) {
            throw null;
        }
        LinkedQueueNode<E> linkedQueueNodeNewNode = newNode(e);
        lpProducerNode().soNext(linkedQueueNodeNewNode);
        spProducerNode(linkedQueueNodeNewNode);
        return true;
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E peek() {
        return (E) relaxedPeek();
    }

    @Override // java.util.Queue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public E poll() {
        return (E) relaxedPoll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean relaxedOffer(Object obj) {
        return super.relaxedOffer(obj);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ Object relaxedPeek() {
        return super.relaxedPeek();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ Object relaxedPoll() {
        return super.relaxedPoll();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(MessagePassingQueue.Consumer consumer, int i) {
        return super.drain(consumer, i);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier, int i) {
        if (i == 0) {
            return 0;
        }
        LinkedQueueNode<E> linkedQueueNodeNewNode = newNode(supplier.get());
        int i2 = 1;
        LinkedQueueNode<E> linkedQueueNode = linkedQueueNodeNewNode;
        while (i2 < i) {
            LinkedQueueNode<E> linkedQueueNodeNewNode2 = newNode(supplier.get());
            linkedQueueNode.soNext(linkedQueueNodeNewNode2);
            i2++;
            linkedQueueNode = linkedQueueNodeNewNode2;
        }
        lpProducerNode().soNext(linkedQueueNodeNewNode);
        spProducerNode(linkedQueueNode);
        return i;
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.BaseLinkedQueue, io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void drain(MessagePassingQueue.Consumer consumer, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        super.drain(consumer, waitStrategy, exitCondition);
    }

    @Override // io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue
    public void fill(MessagePassingQueue.Supplier<E> supplier, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        LinkedQueueNode<E> linkedQueueNode = this.producerNode;
        while (exitCondition.keepRunning()) {
            int i = 0;
            while (i < 4096) {
                LinkedQueueNode<E> linkedQueueNodeNewNode = newNode(supplier.get());
                linkedQueueNode.soNext(linkedQueueNodeNewNode);
                this.producerNode = linkedQueueNodeNewNode;
                i++;
                linkedQueueNode = linkedQueueNodeNewNode;
            }
        }
    }
}

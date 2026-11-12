package io.reactivex.rxjava3.internal.operators.flowable;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.rxjava3.internal.subscribers.SubscriberResourceWrapper;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableReplay<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T> {
    static final Supplier DEFAULT_UNBOUNDED_FACTORY = new DefaultUnboundedFactory();
    final Supplier<? extends ReplayBuffer<T>> bufferFactory;
    final AtomicReference<ReplaySubscriber<T>> current;
    final Publisher<T> onSubscribe;
    final Flowable<T> source;

    /* JADX INFO: loaded from: classes46.dex */
    interface ReplayBuffer<T> {
        void complete();

        void error(Throwable th);

        void next(T t);

        void replay(InnerSubscription<T> innerSubscription);
    }

    public static <U, R> Flowable<R> multicastSelector(Supplier<? extends ConnectableFlowable<U>> supplier, Function<? super Flowable<U>, ? extends Publisher<R>> function) {
        return new MulticastFlowable(supplier, function);
    }

    public static <T> ConnectableFlowable<T> createFrom(Flowable<? extends T> flowable) {
        return create(flowable, DEFAULT_UNBOUNDED_FACTORY);
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i, boolean z) {
        if (i == Integer.MAX_VALUE) {
            return createFrom(flowable);
        }
        return create(flowable, new ReplayBufferSupplier(i, z));
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        return create(flowable, j, timeUnit, scheduler, Integer.MAX_VALUE, z);
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler, int i, boolean z) {
        return create(flowable, new ScheduledReplayBufferSupplier(i, j, timeUnit, scheduler, z));
    }

    static <T> ConnectableFlowable<T> create(Flowable<T> flowable, Supplier<? extends ReplayBuffer<T>> supplier) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowableReplay(new ReplayPublisher(atomicReference, supplier), flowable, atomicReference, supplier));
    }

    private FlowableReplay(Publisher<T> publisher, Flowable<T> flowable, AtomicReference<ReplaySubscriber<T>> atomicReference, Supplier<? extends ReplayBuffer<T>> supplier) {
        this.onSubscribe = publisher;
        this.source = flowable;
        this.current = atomicReference;
        this.bufferFactory = supplier;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.source;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.onSubscribe.subscribe(subscriber);
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    public void reset() {
        ReplaySubscriber<T> replaySubscriber = this.current.get();
        if (replaySubscriber == null || !replaySubscriber.isDisposed()) {
            return;
        }
        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.current, replaySubscriber, null);
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        ReplaySubscriber<T> replaySubscriber;
        while (true) {
            replaySubscriber = this.current.get();
            if (replaySubscriber != null && !replaySubscriber.isDisposed()) {
                break;
            }
            try {
                ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>(this.bufferFactory.get(), this.current);
                if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.current, replaySubscriber, replaySubscriber2)) {
                    replaySubscriber = replaySubscriber2;
                    break;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                throw ExceptionHelper.wrapOrThrow(th);
            }
        }
        boolean z = !replaySubscriber.shouldConnect.get() && replaySubscriber.shouldConnect.compareAndSet(false, true);
        try {
            consumer.accept(replaySubscriber);
            if (z) {
                this.source.subscribe((FlowableSubscriber) replaySubscriber);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (z) {
                replaySubscriber.shouldConnect.compareAndSet(true, false);
            }
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class ReplaySubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscription[] EMPTY = new InnerSubscription[0];
        static final InnerSubscription[] TERMINATED = new InnerSubscription[0];
        private static final long serialVersionUID = 7224554242710036740L;
        final ReplayBuffer<T> buffer;
        final AtomicReference<ReplaySubscriber<T>> current;
        boolean done;
        long requestedFromUpstream;
        final AtomicInteger management = new AtomicInteger();
        final AtomicReference<InnerSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        ReplaySubscriber(ReplayBuffer<T> replayBuffer, AtomicReference<ReplaySubscriber<T>> atomicReference) {
            this.buffer = replayBuffer;
            this.current = atomicReference;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.subscribers.set(TERMINATED);
            LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.current, this, null);
            SubscriptionHelper.cancel(this);
        }

        boolean add(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.subscribers.get();
                if (innerSubscriptionArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new InnerSubscription[length + 1];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.subscribers, innerSubscriptionArr, innerSubscriptionArr2));
            return true;
        }

        void remove(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.subscribers.get();
                int length = innerSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriptionArr[i].equals(innerSubscription)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr2 = EMPTY;
                } else {
                    InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                    System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i);
                    System.arraycopy(innerSubscriptionArr, i + 1, innerSubscriptionArr3, i, (length - i) - 1);
                    innerSubscriptionArr2 = innerSubscriptionArr3;
                }
            } while (!LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.subscribers, innerSubscriptionArr, innerSubscriptionArr2));
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                manageRequests();
                for (InnerSubscription<T> innerSubscription : this.subscribers.get()) {
                    this.buffer.replay(innerSubscription);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            this.buffer.next(t);
            for (InnerSubscription<T> innerSubscription : this.subscribers.get()) {
                this.buffer.replay(innerSubscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.error(th);
                for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                    this.buffer.replay(innerSubscription);
                }
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.buffer.complete();
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                this.buffer.replay(innerSubscription);
            }
        }

        void manageRequests() {
            AtomicInteger atomicInteger = this.management;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                Subscription subscription = get();
                if (subscription != null) {
                    long j = this.requestedFromUpstream;
                    long jMax = j;
                    for (InnerSubscription<T> innerSubscription : this.subscribers.get()) {
                        jMax = Math.max(jMax, innerSubscription.totalRequested.get());
                    }
                    long j2 = jMax - j;
                    if (j2 != 0) {
                        this.requestedFromUpstream = jMax;
                        subscription.request(j2);
                    }
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class InnerSubscription<T> extends AtomicLong implements Subscription, Disposable {
        static final long CANCELLED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final Subscriber<? super T> child;
        boolean emitting;
        Object index;
        boolean missed;
        final ReplaySubscriber<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        InnerSubscription(ReplaySubscriber<T> replaySubscriber, Subscriber<? super T> subscriber) {
            this.parent = replaySubscriber;
            this.child = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (!SubscriptionHelper.validate(j) || BackpressureHelper.addCancel(this, j) == Long.MIN_VALUE) {
                return;
            }
            BackpressureHelper.add(this.totalRequested, j);
            this.parent.manageRequests();
            this.parent.buffer.replay(this);
        }

        public long produced(long j) {
            return BackpressureHelper.producedCancel(this, j);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.manageRequests();
                this.index = null;
            }
        }

        <U> U index() {
            return (U) this.index;
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        UnboundedReplayBuffer(int i) {
            super(i);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void next(T t) {
            add(NotificationLite.next(t));
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void error(Throwable th) {
            add(NotificationLite.error(th));
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void complete() {
            add(NotificationLite.complete());
            this.size++;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public void replay(InnerSubscription<T> innerSubscription) {
            synchronized (innerSubscription) {
                if (innerSubscription.emitting) {
                    innerSubscription.missed = true;
                    return;
                }
                innerSubscription.emitting = true;
                Subscriber<? super T> subscriber = innerSubscription.child;
                while (!innerSubscription.isDisposed()) {
                    int i = this.size;
                    Integer num = (Integer) innerSubscription.index();
                    int iIntValue = num != null ? num.intValue() : 0;
                    long j = innerSubscription.get();
                    long j2 = j;
                    long j3 = 0;
                    while (j2 != 0 && iIntValue < i) {
                        Object obj = get(iIntValue);
                        try {
                            if (NotificationLite.accept(obj, subscriber) || innerSubscription.isDisposed()) {
                                return;
                            }
                            iIntValue++;
                            j2--;
                            j3++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            innerSubscription.dispose();
                            if (!NotificationLite.isError(obj) && !NotificationLite.isComplete(obj)) {
                                subscriber.onError(th);
                                return;
                            } else {
                                RxJavaPlugins.onError(th);
                                return;
                            }
                        }
                    }
                    if (j3 != 0) {
                        innerSubscription.index = Integer.valueOf(iIntValue);
                        if (j != Long.MAX_VALUE) {
                            innerSubscription.produced(j3);
                        }
                    }
                    synchronized (innerSubscription) {
                        if (!innerSubscription.missed) {
                            innerSubscription.emitting = false;
                            return;
                        }
                        innerSubscription.missed = false;
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final Object value;

        Node(Object obj, long j) {
            this.value = obj;
            this.index = j;
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        final boolean eagerTruncate;
        long index;
        int size;
        Node tail;

        Object enterTransform(Object obj, boolean z) {
            return obj;
        }

        Object leaveTransform(Object obj) {
            return obj;
        }

        abstract void truncate();

        BoundedReplayBuffer(boolean z) {
            this.eagerTruncate = z;
            Node node = new Node(null, 0L);
            this.tail = node;
            set(node);
        }

        final void addLast(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        final void removeFirst() {
            Node node = get().get();
            if (node == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.size--;
            setFirst(node);
        }

        final void removeSome(int i) {
            Node node = get();
            while (i > 0) {
                node = node.get();
                i--;
                this.size--;
            }
            setFirst(node);
            Node node2 = get();
            if (node2.get() == null) {
                this.tail = node2;
            }
        }

        final void setFirst(Node node) {
            if (this.eagerTruncate) {
                Node node2 = new Node(null, node.index);
                node2.lazySet(node.get());
                node = node2;
            }
            set(node);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void next(T t) {
            Object objEnterTransform = enterTransform(NotificationLite.next(t), false);
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(objEnterTransform, j));
            truncate();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void error(Throwable th) {
            Object objEnterTransform = enterTransform(NotificationLite.error(th), true);
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(objEnterTransform, j));
            truncateFinal();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void complete() {
            Object objEnterTransform = enterTransform(NotificationLite.complete(), true);
            long j = this.index + 1;
            this.index = j;
            addLast(new Node(objEnterTransform, j));
            truncateFinal();
        }

        final void trimHead() {
            Node node = get();
            if (node.value != null) {
                Node node2 = new Node(null, 0L);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void replay(InnerSubscription<T> innerSubscription) {
            synchronized (innerSubscription) {
                if (innerSubscription.emitting) {
                    innerSubscription.missed = true;
                    return;
                }
                innerSubscription.emitting = true;
                while (true) {
                    long j = innerSubscription.get();
                    boolean z = j == Long.MAX_VALUE;
                    Node head = (Node) innerSubscription.index();
                    if (head == null) {
                        head = getHead();
                        innerSubscription.index = head;
                        BackpressureHelper.add(innerSubscription.totalRequested, head.index);
                    }
                    long j2 = 0;
                    while (j != 0) {
                        if (innerSubscription.isDisposed()) {
                            innerSubscription.index = null;
                            return;
                        }
                        Node node = head.get();
                        if (node == null) {
                            break;
                        }
                        Object objLeaveTransform = leaveTransform(node.value);
                        try {
                            if (NotificationLite.accept(objLeaveTransform, innerSubscription.child)) {
                                innerSubscription.index = null;
                                return;
                            } else {
                                j2++;
                                j--;
                                head = node;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            innerSubscription.index = null;
                            innerSubscription.dispose();
                            if (!NotificationLite.isError(objLeaveTransform) && !NotificationLite.isComplete(objLeaveTransform)) {
                                innerSubscription.child.onError(th);
                                return;
                            } else {
                                RxJavaPlugins.onError(th);
                                return;
                            }
                        }
                    }
                    if (j == 0 && innerSubscription.isDisposed()) {
                        innerSubscription.index = null;
                        return;
                    }
                    if (j2 != 0) {
                        innerSubscription.index = head;
                        if (!z) {
                            innerSubscription.produced(j2);
                        }
                    }
                    synchronized (innerSubscription) {
                        if (!innerSubscription.missed) {
                            innerSubscription.emitting = false;
                            return;
                        }
                        innerSubscription.missed = false;
                    }
                }
            }
        }

        void truncateFinal() {
            trimHead();
        }

        final void collect(Collection<? super T> collection) {
            Node head = getHead();
            while (true) {
                head = head.get();
                if (head == null) {
                    return;
                }
                Object objLeaveTransform = leaveTransform(head.value);
                if (NotificationLite.isComplete(objLeaveTransform) || NotificationLite.isError(objLeaveTransform)) {
                    return;
                } else {
                    collection.add((Object) NotificationLite.getValue(objLeaveTransform));
                }
            }
        }

        boolean hasError() {
            return this.tail.value != null && NotificationLite.isError(leaveTransform(this.tail.value));
        }

        boolean hasCompleted() {
            return this.tail.value != null && NotificationLite.isComplete(leaveTransform(this.tail.value));
        }

        Node getHead() {
            return get();
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        SizeBoundReplayBuffer(int i, boolean z) {
            super(z);
            this.limit = i;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final Scheduler scheduler;
        final TimeUnit unit;

        SizeAndTimeBoundReplayBuffer(int i, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
            super(z);
            this.scheduler = scheduler;
            this.limit = i;
            this.maxAge = j;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        Object enterTransform(Object obj, boolean z) {
            return new Timed(obj, z ? Long.MAX_VALUE : this.scheduler.now(this.unit), this.unit);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        Object leaveTransform(Object obj) {
            return ((Timed) obj).value();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void truncate() {
            Node node;
            long jNow = this.scheduler.now(this.unit);
            long j = this.maxAge;
            Node node2 = (Node) get();
            Node node3 = node2.get();
            int i = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (this.size > 1) {
                    if (this.size <= this.limit) {
                        if (((Timed) node2.value).time() > jNow - j) {
                            break;
                        }
                        i++;
                        this.size--;
                        node3 = node2.get();
                    } else {
                        i++;
                        this.size--;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                setFirst(node);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        void truncateFinal() {
            Node node;
            long jNow = this.scheduler.now(this.unit);
            long j = this.maxAge;
            Node node2 = (Node) get();
            Node node3 = node2.get();
            int i = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (this.size <= 1 || ((Timed) node2.value).time() > jNow - j) {
                    break;
                }
                i++;
                this.size--;
                node3 = node2.get();
            }
            if (i != 0) {
                setFirst(node);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        Node getHead() {
            Node node;
            long jNow = this.scheduler.now(this.unit);
            long j = this.maxAge;
            Node node2 = (Node) get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                Timed timed = (Timed) node2.value;
                if (NotificationLite.isComplete(timed.value()) || NotificationLite.isError(timed.value()) || timed.time() > jNow - j) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class MulticastFlowable<R, U> extends Flowable<R> {
        private final Supplier<? extends ConnectableFlowable<U>> connectableFactory;
        private final Function<? super Flowable<U>, ? extends Publisher<R>> selector;

        MulticastFlowable(Supplier<? extends ConnectableFlowable<U>> supplier, Function<? super Flowable<U>, ? extends Publisher<R>> function) {
            this.connectableFactory = supplier;
            this.selector = function;
        }

        @Override // io.reactivex.rxjava3.core.Flowable
        public void subscribeActual(Subscriber<? super R> subscriber) {
            try {
                ConnectableFlowable connectableFlowable = (ConnectableFlowable) ExceptionHelper.nullCheck(this.connectableFactory.get(), "The connectableFactory returned a null ConnectableFlowable.");
                try {
                    Publisher publisher = (Publisher) ExceptionHelper.nullCheck(this.selector.apply(connectableFlowable), "The selector returned a null Publisher.");
                    SubscriberResourceWrapper subscriberResourceWrapper = new SubscriberResourceWrapper(subscriber);
                    publisher.subscribe(subscriberResourceWrapper);
                    connectableFlowable.connect(new DisposableConsumer(subscriberResourceWrapper));
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, subscriber);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, subscriber);
            }
        }

        final class DisposableConsumer implements Consumer<Disposable> {
            private final SubscriberResourceWrapper<R> srw;

            DisposableConsumer(SubscriberResourceWrapper<R> subscriberResourceWrapper) {
                this.srw = subscriberResourceWrapper;
            }

            @Override // io.reactivex.rxjava3.functions.Consumer
            public void accept(Disposable disposable) {
                this.srw.setResource(disposable);
            }
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class ReplayBufferSupplier<T> implements Supplier<ReplayBuffer<T>> {
        final int bufferSize;
        final boolean eagerTruncate;

        ReplayBufferSupplier(int i, boolean z) {
            this.bufferSize = i;
            this.eagerTruncate = z;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ReplayBuffer<T> get() {
            return new SizeBoundReplayBuffer(this.bufferSize, this.eagerTruncate);
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class ScheduledReplayBufferSupplier<T> implements Supplier<ReplayBuffer<T>> {
        private final int bufferSize;
        final boolean eagerTruncate;
        private final long maxAge;
        private final Scheduler scheduler;
        private final TimeUnit unit;

        ScheduledReplayBufferSupplier(int i, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
            this.bufferSize = i;
            this.maxAge = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.eagerTruncate = z;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public ReplayBuffer<T> get() {
            return new SizeAndTimeBoundReplayBuffer(this.bufferSize, this.maxAge, this.unit, this.scheduler, this.eagerTruncate);
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class ReplayPublisher<T> implements Publisher<T> {
        private final Supplier<? extends ReplayBuffer<T>> bufferFactory;
        private final AtomicReference<ReplaySubscriber<T>> curr;

        ReplayPublisher(AtomicReference<ReplaySubscriber<T>> atomicReference, Supplier<? extends ReplayBuffer<T>> supplier) {
            this.curr = atomicReference;
            this.bufferFactory = supplier;
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
            ReplaySubscriber<T> replaySubscriber;
            while (true) {
                replaySubscriber = this.curr.get();
                if (replaySubscriber != null) {
                    break;
                }
                try {
                    ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>(this.bufferFactory.get(), this.curr);
                    if (LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.curr, null, replaySubscriber2)) {
                        replaySubscriber = replaySubscriber2;
                        break;
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, subscriber);
                    return;
                }
            }
            InnerSubscription<T> innerSubscription = new InnerSubscription<>(replaySubscriber, subscriber);
            subscriber.onSubscribe(innerSubscription);
            replaySubscriber.add(innerSubscription);
            if (innerSubscription.isDisposed()) {
                replaySubscriber.remove(innerSubscription);
            } else {
                replaySubscriber.manageRequests();
                replaySubscriber.buffer.replay(innerSubscription);
            }
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class DefaultUnboundedFactory implements Supplier<Object> {
        DefaultUnboundedFactory() {
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public Object get() {
            return new UnboundedReplayBuffer(16);
        }
    }
}

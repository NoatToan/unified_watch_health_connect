package io.reactivex.rxjava3.internal.operators.flowable;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends Publisher<? extends R>> mapper;

    public FlowableSwitchMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends R>> function, int i, boolean z) {
        super(flowable);
        this.mapper = function;
        this.bufferSize = i;
        this.delayErrors = z;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) new SwitchMapSubscriber(subscriber, this.mapper, this.bufferSize, this.delayErrors));
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        static final SwitchMapInnerSubscriber<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Subscriber<? super R> downstream;
        final Function<? super T, ? extends Publisher<? extends R>> mapper;
        volatile long unique;
        Subscription upstream;
        final AtomicReference<SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable errors = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = new SwitchMapInnerSubscriber<>(null, -1L, 1);
            CANCELLED = switchMapInnerSubscriber;
            switchMapInnerSubscriber.cancel();
        }

        SwitchMapSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i, boolean z) {
            this.downstream = subscriber;
            this.mapper = function;
            this.bufferSize = i;
            this.delayErrors = z;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) throws Throwable {
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber;
            if (this.done) {
                return;
            }
            long j = this.unique + 1;
            this.unique = j;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.active.get();
            if (switchMapInnerSubscriber2 != null) {
                switchMapInnerSubscriber2.cancel();
            }
            try {
                Publisher publisher = (Publisher) Objects.requireNonNull(this.mapper.apply(t), "The publisher returned is null");
                SwitchMapInnerSubscriber switchMapInnerSubscriber3 = new SwitchMapInnerSubscriber(this, j, this.bufferSize);
                do {
                    switchMapInnerSubscriber = this.active.get();
                    if (switchMapInnerSubscriber == CANCELLED) {
                        return;
                    }
                } while (!LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.active, switchMapInnerSubscriber, switchMapInnerSubscriber3));
                publisher.subscribe(switchMapInnerSubscriber3);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) throws Throwable {
            if (!this.done && this.errors.tryAddThrowable(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() throws Throwable {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) throws Throwable {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                if (this.unique == 0) {
                    this.upstream.request(Long.MAX_VALUE);
                } else {
                    drain();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
            this.errors.tryTerminateAndReport();
        }

        void disposeInner() {
            AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference = this.active;
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = CANCELLED;
            SwitchMapInnerSubscriber<T, R> andSet = atomicReference.getAndSet((SwitchMapInnerSubscriber<T, R>) switchMapInnerSubscriber);
            if (andSet == switchMapInnerSubscriber || andSet == null) {
                return;
            }
            andSet.cancel();
        }

        /* JADX WARN: Code duplicated, block: B:107:0x0120 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:113:0x000d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x0113  */
        void drain() throws Throwable {
            boolean z;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.done) {
                    if (this.delayErrors) {
                        if (this.active.get() == null) {
                            this.errors.tryTerminateConsumer(subscriber);
                            return;
                        }
                    } else if (this.errors.get() != null) {
                        disposeInner();
                        this.errors.tryTerminateConsumer(subscriber);
                        return;
                    } else if (this.active.get() == null) {
                        subscriber.onComplete();
                        return;
                    }
                }
                SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.active.get();
                SimpleQueue<R> simpleQueue = switchMapInnerSubscriber != null ? switchMapInnerSubscriber.queue : null;
                if (simpleQueue != null) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (true) {
                        if (j2 != j) {
                            if (this.cancelled) {
                                return;
                            }
                            boolean z2 = switchMapInnerSubscriber.done;
                            try {
                                objPoll = simpleQueue.poll();
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                switchMapInnerSubscriber.cancel();
                                this.errors.tryAddThrowableOrReport(th);
                                objPoll = null;
                                z2 = true;
                            }
                            boolean z3 = objPoll == null;
                            if (switchMapInnerSubscriber == this.active.get()) {
                                if (z2) {
                                    if (this.delayErrors) {
                                        if (z3) {
                                            LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.active, switchMapInnerSubscriber, null);
                                        }
                                    } else if (this.errors.get() != null) {
                                        this.errors.tryTerminateConsumer(subscriber);
                                        return;
                                    } else if (z3) {
                                        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.active, switchMapInnerSubscriber, null);
                                    }
                                }
                                if (!z3) {
                                    subscriber.onNext(objPoll);
                                    j2++;
                                }
                            }
                            z = true;
                            if (j2 != j && switchMapInnerSubscriber.done) {
                                if (!this.delayErrors) {
                                    if (this.errors.get() != null) {
                                        disposeInner();
                                        this.errors.tryTerminateConsumer(subscriber);
                                        return;
                                    } else if (simpleQueue.isEmpty()) {
                                        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.active, switchMapInnerSubscriber, null);
                                    }
                                } else if (simpleQueue.isEmpty()) {
                                    LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.active, switchMapInnerSubscriber, null);
                                }
                            }
                            if (j2 != 0 && !this.cancelled) {
                                if (j != Long.MAX_VALUE) {
                                    this.requested.addAndGet(-j2);
                                }
                                switchMapInnerSubscriber.request(j2);
                            }
                            if (z) {
                                continue;
                            }
                        }
                        z = false;
                        if (j2 != j) {
                        }
                        if (j2 != 0) {
                            if (j != Long.MAX_VALUE) {
                                this.requested.addAndGet(-j2);
                            }
                            switchMapInnerSubscriber.request(j2);
                        }
                        if (z) {
                            continue;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final SwitchMapSubscriber<T, R> parent;
        volatile SimpleQueue<R> queue;

        SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j, int i) {
            this.parent = switchMapSubscriber;
            this.index = j;
            this.bufferSize = i;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) throws Throwable {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        subscription.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                subscription.request(this.bufferSize);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) throws Throwable {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                if (this.fusionMode == 0 && !this.queue.offer(r)) {
                    onError(new QueueOverflowException());
                } else {
                    switchMapSubscriber.drain();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) throws Throwable {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique && switchMapSubscriber.errors.tryAddThrowable(th)) {
                if (!switchMapSubscriber.delayErrors) {
                    switchMapSubscriber.upstream.cancel();
                    switchMapSubscriber.done = true;
                }
                this.done = true;
                switchMapSubscriber.drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() throws Throwable {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                this.done = true;
                switchMapSubscriber.drain();
            }
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        public void request(long j) {
            if (this.fusionMode != 1) {
                get().request(j);
            }
        }
    }
}

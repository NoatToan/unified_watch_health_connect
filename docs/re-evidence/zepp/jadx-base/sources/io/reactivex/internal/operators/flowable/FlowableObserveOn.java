package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableObserveOn<T> extends io.reactivex.internal.operators.flowable.a<T, T> {
    public final Scheduler b;
    public final boolean c;
    public final int d;

    public static abstract class a<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        public final Scheduler.Worker a;
        public final boolean b;
        public final int c;
        public final int d;
        public final AtomicLong e = new AtomicLong();
        public Subscription f;
        public SimpleQueue<T> g;
        public volatile boolean h;
        public volatile boolean i;
        public Throwable j;
        public int k;
        public long l;
        public boolean m;

        public a(Scheduler.Worker worker, boolean z, int i) {
            this.a = worker;
            this.b = z;
            this.c = i;
            this.d = i - (i >> 2);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.h) {
                return;
            }
            this.h = true;
            this.f.cancel();
            this.a.dispose();
            if (getAndIncrement() == 0) {
                this.g.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.g.clear();
        }

        public final boolean f(boolean z, boolean z2, Subscriber<?> subscriber) {
            if (this.h) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.b) {
                if (!z2) {
                    return false;
                }
                this.h = true;
                Throwable th = this.j;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                this.a.dispose();
                return true;
            }
            Throwable th2 = this.j;
            if (th2 != null) {
                this.h = true;
                clear();
                subscriber.onError(th2);
                this.a.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.h = true;
            subscriber.onComplete();
            this.a.dispose();
            return true;
        }

        public abstract void g();

        public abstract void h();

        public abstract void i();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.g.isEmpty();
        }

        public final void j() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.a.schedule(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.i) {
                return;
            }
            this.i = true;
            j();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th) {
            if (this.i) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.j = th;
            this.i = true;
            j();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.i) {
                return;
            }
            if (this.k == 2) {
                j();
                return;
            }
            if (!this.g.offer(t)) {
                this.f.cancel();
                this.j = new MissingBackpressureException("Queue is full?!");
                this.i = true;
            }
            j();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.e, j);
                j();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.m = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.m) {
                h();
            } else if (this.k == 1) {
                i();
            } else {
                g();
            }
        }
    }

    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = 644624475404284533L;
        public final ConditionalSubscriber<? super T> n;
        public long o;

        public b(ConditionalSubscriber<? super T> conditionalSubscriber, Scheduler.Worker worker, boolean z, int i) {
            super(worker, z, i);
            this.n = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.a
        public void g() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.n;
            SimpleQueue<T> simpleQueue = this.g;
            long j = this.l;
            long j2 = this.o;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.e.get();
                while (j != j3) {
                    boolean z = this.i;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z2 = tPoll == null;
                        if (f(z, z2, conditionalSubscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.d) {
                            this.f.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.h = true;
                        this.f.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (j == j3 && f(this.i, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.l = j;
                    this.o = j2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.a
        public void h() {
            int iAddAndGet = 1;
            while (!this.h) {
                boolean z = this.i;
                this.n.onNext(null);
                if (z) {
                    this.h = true;
                    Throwable th = this.j;
                    if (th != null) {
                        this.n.onError(th);
                    } else {
                        this.n.onComplete();
                    }
                    this.a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.a
        public void i() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.n;
            SimpleQueue<T> simpleQueue = this.g;
            long j = this.l;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.e.get();
                while (j != j2) {
                    try {
                        T tPoll = simpleQueue.poll();
                        if (this.h) {
                            return;
                        }
                        if (tPoll == null) {
                            this.h = true;
                            conditionalSubscriber.onComplete();
                            this.a.dispose();
                            return;
                        } else if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.h = true;
                        this.f.cancel();
                        conditionalSubscriber.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (this.h) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.h = true;
                    conditionalSubscriber.onComplete();
                    this.a.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.l = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f, subscription)) {
                this.f = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.k = 1;
                        this.g = queueSubscription;
                        this.i = true;
                        this.n.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.k = 2;
                        this.g = queueSubscription;
                        this.n.onSubscribe(this);
                        subscription.request(this.c);
                        return;
                    }
                }
                this.g = new SpscArrayQueue(this.c);
                this.n.onSubscribe(this);
                subscription.request(this.c);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.g.poll();
            if (tPoll != null && this.k != 1) {
                long j = this.o + 1;
                if (j == this.d) {
                    this.o = 0L;
                    this.f.request(j);
                } else {
                    this.o = j;
                }
            }
            return tPoll;
        }
    }

    public static final class c<T> extends a<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        public final Subscriber<? super T> n;

        public c(Subscriber<? super T> subscriber, Scheduler.Worker worker, boolean z, int i) {
            super(worker, z, i);
            this.n = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.a
        public void g() {
            Subscriber<? super T> subscriber = this.n;
            SimpleQueue<T> simpleQueue = this.g;
            long j = this.l;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.e.get();
                while (j != jAddAndGet) {
                    boolean z = this.i;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z2 = tPoll == null;
                        if (f(z, z2, subscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        subscriber.onNext(tPoll);
                        j++;
                        if (j == this.d) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.e.addAndGet(-j);
                            }
                            this.f.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.h = true;
                        this.f.cancel();
                        simpleQueue.clear();
                        subscriber.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && f(this.i, simpleQueue.isEmpty(), subscriber)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.l = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.a
        public void h() {
            int iAddAndGet = 1;
            while (!this.h) {
                boolean z = this.i;
                this.n.onNext(null);
                if (z) {
                    this.h = true;
                    Throwable th = this.j;
                    if (th != null) {
                        this.n.onError(th);
                    } else {
                        this.n.onComplete();
                    }
                    this.a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.a
        public void i() {
            Subscriber<? super T> subscriber = this.n;
            SimpleQueue<T> simpleQueue = this.g;
            long j = this.l;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.e.get();
                while (j != j2) {
                    try {
                        T tPoll = simpleQueue.poll();
                        if (this.h) {
                            return;
                        }
                        if (tPoll == null) {
                            this.h = true;
                            subscriber.onComplete();
                            this.a.dispose();
                            return;
                        }
                        subscriber.onNext(tPoll);
                        j++;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.h = true;
                        this.f.cancel();
                        subscriber.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (this.h) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.h = true;
                    subscriber.onComplete();
                    this.a.dispose();
                    return;
                } else {
                    int i = get();
                    if (iAddAndGet == i) {
                        this.l = j;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f, subscription)) {
                this.f = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.k = 1;
                        this.g = queueSubscription;
                        this.i = true;
                        this.n.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.k = 2;
                        this.g = queueSubscription;
                        this.n.onSubscribe(this);
                        subscription.request(this.c);
                        return;
                    }
                }
                this.g = new SpscArrayQueue(this.c);
                this.n.onSubscribe(this);
                subscription.request(this.c);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.g.poll();
            if (tPoll != null && this.k != 1) {
                long j = this.l + 1;
                if (j == this.d) {
                    this.l = 0L;
                    this.f.request(j);
                } else {
                    this.l = j;
                }
            }
            return tPoll;
        }
    }

    public FlowableObserveOn(Flowable<T> flowable, Scheduler scheduler, boolean z, int i) {
        super(flowable);
        this.b = scheduler;
        this.c = z;
        this.d = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.b.createWorker();
        if (subscriber instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new b((ConditionalSubscriber) subscriber, workerCreateWorker, this.c, this.d));
        } else {
            this.source.subscribe((FlowableSubscriber) new c(subscriber, workerCreateWorker, this.c, this.d));
        }
    }
}

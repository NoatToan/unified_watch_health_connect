package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableFlattenIterable<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {
    public final Function<? super T, ? extends Iterable<? extends R>> b;
    public final int c;

    public static final class a<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        public final Subscriber<? super R> a;
        public final Function<? super T, ? extends Iterable<? extends R>> b;
        public final int c;
        public final int d;
        public Subscription f;
        public SimpleQueue<T> g;
        public volatile boolean h;
        public volatile boolean i;
        public Iterator<? extends R> k;
        public int l;
        public int m;
        public final AtomicReference<Throwable> j = new AtomicReference<>();
        public final AtomicLong e = new AtomicLong();

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends Iterable<? extends R>> function, int i) {
            this.a = subscriber;
            this.b = function;
            this.c = i;
            this.d = i - (i >> 2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.f.cancel();
            if (getAndIncrement() == 0) {
                this.g.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.k = null;
            this.g.clear();
        }

        /* JADX WARN: Code duplicated, block: B:69:0x0124 A[PHI: r6
          0x0124: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:30:0x0080, B:67:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:89:0x012b A[SYNTHETIC] */
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<?> subscriber = this.a;
            SimpleQueue<T> simpleQueue = this.g;
            boolean z = this.m != 1;
            Iterator<? extends R> it2 = this.k;
            int iAddAndGet = 1;
            while (true) {
                if (it2 == null) {
                    boolean z2 = this.h;
                    try {
                        T tPoll = simpleQueue.poll();
                        if (f(z2, tPoll == null, subscriber, simpleQueue)) {
                            return;
                        }
                        if (tPoll != null) {
                            try {
                                it2 = this.b.apply(tPoll).iterator();
                                if (it2.hasNext()) {
                                    this.k = it2;
                                } else {
                                    g(z);
                                    it2 = null;
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.f.cancel();
                                ExceptionHelper.addThrowable(this.j, th);
                                subscriber.onError(ExceptionHelper.terminate(this.j));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.f.cancel();
                        ExceptionHelper.addThrowable(this.j, th2);
                        Throwable thTerminate = ExceptionHelper.terminate(this.j);
                        this.k = null;
                        simpleQueue.clear();
                        subscriber.onError(thTerminate);
                        return;
                    }
                }
                if (it2 != null) {
                    long j = this.e.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (f(this.h, false, subscriber, simpleQueue)) {
                            return;
                        }
                        try {
                            subscriber.onNext((Object) ObjectHelper.requireNonNull(it2.next(), "The iterator returned a null value"));
                            if (f(this.h, false, subscriber, simpleQueue)) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it2.hasNext()) {
                                    g(z);
                                    this.k = null;
                                    it2 = null;
                                    break;
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.k = null;
                                this.f.cancel();
                                ExceptionHelper.addThrowable(this.j, th3);
                                subscriber.onError(ExceptionHelper.terminate(this.j));
                                return;
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            this.k = null;
                            this.f.cancel();
                            ExceptionHelper.addThrowable(this.j, th4);
                            subscriber.onError(ExceptionHelper.terminate(this.j));
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (f(this.h, simpleQueue.isEmpty() && it2 == null, subscriber, simpleQueue)) {
                            return;
                        }
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.e.addAndGet(-j2);
                    }
                    if (it2 != null) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        public boolean f(boolean z, boolean z2, Subscriber<?> subscriber, SimpleQueue<?> simpleQueue) {
            if (this.i) {
                this.k = null;
                simpleQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.j.get() == null) {
                if (!z2) {
                    return false;
                }
                subscriber.onComplete();
                return true;
            }
            Throwable thTerminate = ExceptionHelper.terminate(this.j);
            this.k = null;
            simpleQueue.clear();
            subscriber.onError(thTerminate);
            return true;
        }

        public void g(boolean z) {
            if (z) {
                int i = this.l + 1;
                if (i != this.d) {
                    this.l = i;
                } else {
                    this.l = 0;
                    this.f.request(i);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.k == null && this.g.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.h || !ExceptionHelper.addThrowable(this.j, th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.h = true;
                drain();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.h) {
                return;
            }
            if (this.m != 0 || this.g.offer(t)) {
                drain();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f, subscription)) {
                this.f = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.m = iRequestFusion;
                        this.g = queueSubscription;
                        this.h = true;
                        this.a.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.m = iRequestFusion;
                        this.g = queueSubscription;
                        this.a.onSubscribe(this);
                        subscription.request(this.c);
                        return;
                    }
                }
                this.g = new SpscArrayQueue(this.c);
                this.a.onSubscribe(this);
                subscription.request(this.c);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Iterator<? extends R> it2 = this.k;
            while (it2 == null) {
                T tPoll = this.g.poll();
                if (tPoll != null) {
                    it2 = this.b.apply(tPoll).iterator();
                    if (it2.hasNext()) {
                        this.k = it2;
                        break;
                    }
                    it2 = null;
                } else {
                    return null;
                }
            }
            R r = (R) ObjectHelper.requireNonNull(it2.next(), "The iterator returned a null value");
            if (!it2.hasNext()) {
                this.k = null;
            }
            return r;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.e, j);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            return ((i & 1) == 0 || this.m != 1) ? 0 : 1;
        }
    }

    public FlowableFlattenIterable(Flowable<T> flowable, Function<? super T, ? extends Iterable<? extends R>> function, int i) {
        super(flowable);
        this.b = function;
        this.c = i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        Flowable<T> flowable = this.source;
        if (!(flowable instanceof Callable)) {
            flowable.subscribe((FlowableSubscriber) new a(subscriber, this.b, this.c));
            return;
        }
        try {
            Object objCall = ((Callable) flowable).call();
            if (objCall == null) {
                EmptySubscription.complete(subscriber);
                return;
            }
            try {
                FlowableFromIterable.subscribe(subscriber, this.b.apply(objCall).iterator());
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, subscriber);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}

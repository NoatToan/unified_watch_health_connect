package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableSequenceEqual<T> extends Flowable<Boolean> {
    public final Publisher<? extends T> b;
    public final Publisher<? extends T> c;
    public final BiPredicate<? super T, ? super T> d;
    public final int e;

    public static final class a<T> extends DeferredScalarSubscription<Boolean> implements b {
        private static final long serialVersionUID = -6178010334400373240L;
        public final BiPredicate<? super T, ? super T> i;
        public final c<T> j;
        public final c<T> k;
        public final AtomicThrowable l;
        public final AtomicInteger m;
        public T n;
        public T o;

        public a(Subscriber<? super Boolean> subscriber, int i, BiPredicate<? super T, ? super T> biPredicate) {
            super(subscriber);
            this.i = biPredicate;
            this.m = new AtomicInteger();
            this.j = new c<>(this, i);
            this.k = new c<>(this, i);
            this.l = new AtomicThrowable();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.b
        public void a(Throwable th) {
            if (this.l.addThrowable(th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.j.a();
            this.k.a();
            if (this.m.getAndIncrement() == 0) {
                this.j.b();
                this.k.b();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.b
        public void drain() {
            if (this.m.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue<T> simpleQueue = this.j.e;
                SimpleQueue<T> simpleQueue2 = this.k.e;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (true) {
                        if (isCancelled()) {
                            this.j.b();
                            this.k.b();
                            return;
                        }
                        if (this.l.get() != null) {
                            f();
                            this.downstream.onError(this.l.terminate());
                            return;
                        }
                        boolean z = this.j.f;
                        T tPoll = this.n;
                        if (tPoll == null) {
                            try {
                                tPoll = simpleQueue.poll();
                                this.n = tPoll;
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                f();
                                this.l.addThrowable(th);
                                this.downstream.onError(this.l.terminate());
                                return;
                            }
                        }
                        boolean z2 = tPoll == null;
                        boolean z3 = this.k.f;
                        T tPoll2 = this.o;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = simpleQueue2.poll();
                                this.o = tPoll2;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                f();
                                this.l.addThrowable(th2);
                                this.downstream.onError(this.l.terminate());
                                return;
                            }
                        }
                        boolean z4 = tPoll2 == null;
                        if (z && z3 && z2 && z4) {
                            complete(Boolean.TRUE);
                            return;
                        }
                        if (z && z3 && z2 != z4) {
                            f();
                            complete(Boolean.FALSE);
                            return;
                        }
                        if (z2 || z4) {
                            break;
                        }
                        try {
                            if (!this.i.test(tPoll, tPoll2)) {
                                f();
                                complete(Boolean.FALSE);
                                return;
                            } else {
                                this.n = null;
                                this.o = null;
                                this.j.c();
                                this.k.c();
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            f();
                            this.l.addThrowable(th3);
                            this.downstream.onError(this.l.terminate());
                            return;
                        }
                    }
                } else if (isCancelled()) {
                    this.j.b();
                    this.k.b();
                    return;
                } else if (this.l.get() != null) {
                    f();
                    this.downstream.onError(this.l.terminate());
                    return;
                }
                iAddAndGet = this.m.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void f() {
            this.j.a();
            this.j.b();
            this.k.a();
            this.k.b();
        }

        public void g(Publisher<? extends T> publisher, Publisher<? extends T> publisher2) {
            publisher.subscribe(this.j);
            publisher2.subscribe(this.k);
        }
    }

    public interface b {
        void a(Throwable th);

        void drain();
    }

    public static final class c<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4804128302091633067L;
        public final b a;
        public final int b;
        public final int c;
        public long d;
        public volatile SimpleQueue<T> e;
        public volatile boolean f;
        public int g;

        public c(b bVar, int i) {
            this.a = bVar;
            this.c = i - (i >> 2);
            this.b = i;
        }

        public void a() {
            SubscriptionHelper.cancel(this);
        }

        public void b() {
            SimpleQueue<T> simpleQueue = this.e;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        public void c() {
            if (this.g != 1) {
                long j = this.d + 1;
                if (j < this.c) {
                    this.d = j;
                } else {
                    this.d = 0L;
                    get().request(j);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f = true;
            this.a.drain();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.a.a(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.g != 0 || this.e.offer(t)) {
                this.a.drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.g = iRequestFusion;
                        this.e = queueSubscription;
                        this.f = true;
                        this.a.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.g = iRequestFusion;
                        this.e = queueSubscription;
                        subscription.request(this.b);
                        return;
                    }
                }
                this.e = new SpscArrayQueue(this.b);
                subscription.request(this.b);
            }
        }
    }

    public FlowableSequenceEqual(Publisher<? extends T> publisher, Publisher<? extends T> publisher2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.b = publisher;
        this.c = publisher2;
        this.d = biPredicate;
        this.e = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Boolean> subscriber) {
        a aVar = new a(subscriber, this.e, this.d);
        subscriber.onSubscribe(aVar);
        aVar.g(this.b, this.c);
    }
}

package io.reactivex.internal.operators.flowable;

import defpackage.a05;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableSwitchMap<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {
    public final Function<? super T, ? extends Publisher<? extends R>> b;
    public final int c;
    public final boolean d;

    public static final class a<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        public final b<T, R> a;
        public final long b;
        public final int c;
        public volatile SimpleQueue<R> d;
        public volatile boolean e;
        public int f;

        public a(b<T, R> bVar, long j, int i) {
            this.a = bVar;
            this.b = j;
            this.c = i;
        }

        public void a() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            b<T, R> bVar = this.a;
            if (this.b == bVar.k) {
                this.e = true;
                bVar.b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            b<T, R> bVar = this.a;
            if (this.b != bVar.k || !bVar.f.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!bVar.d) {
                bVar.h.cancel();
            }
            this.e = true;
            bVar.b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
            b<T, R> bVar = this.a;
            if (this.b == bVar.k) {
                if (this.f != 0 || this.d.offer(r)) {
                    bVar.b();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f = iRequestFusion;
                        this.d = queueSubscription;
                        this.e = true;
                        this.a.b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f = iRequestFusion;
                        this.d = queueSubscription;
                        subscription.request(this.c);
                        return;
                    }
                }
                this.d = new SpscArrayQueue(this.c);
                subscription.request(this.c);
            }
        }
    }

    public static final class b<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final a<Object, Object> l;
        private static final long serialVersionUID = -3491074160481096299L;
        public final Subscriber<? super R> a;
        public final Function<? super T, ? extends Publisher<? extends R>> b;
        public final int c;
        public final boolean d;
        public volatile boolean e;
        public volatile boolean g;
        public Subscription h;
        public volatile long k;
        public final AtomicReference<a<T, R>> i = new AtomicReference<>();
        public final AtomicLong j = new AtomicLong();
        public final AtomicThrowable f = new AtomicThrowable();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            l = aVar;
            aVar.a();
        }

        public b(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i, boolean z) {
            this.a = subscriber;
            this.b = function;
            this.c = i;
            this.d = z;
        }

        public void a() {
            a<T, R> andSet;
            a<T, R> aVar = this.i.get();
            a<Object, Object> aVar2 = l;
            if (aVar == aVar2 || (andSet = this.i.getAndSet((a<T, R>) aVar2)) == aVar2 || andSet == null) {
                return;
            }
            andSet.a();
        }

        public void b() {
            boolean z;
            a05 a05VarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.a;
            int iAddAndGet = 1;
            while (!this.g) {
                if (this.e) {
                    if (this.d) {
                        if (this.i.get() == null) {
                            if (this.f.get() != null) {
                                subscriber.onError(this.f.terminate());
                                return;
                            } else {
                                subscriber.onComplete();
                                return;
                            }
                        }
                    } else if (this.f.get() != null) {
                        a();
                        subscriber.onError(this.f.terminate());
                        return;
                    } else if (this.i.get() == null) {
                        subscriber.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = this.i.get();
                SimpleQueue<R> simpleQueue = aVar != null ? aVar.d : null;
                if (simpleQueue != null) {
                    if (aVar.e) {
                        if (this.d) {
                            if (simpleQueue.isEmpty()) {
                                this.i.compareAndSet(aVar, null);
                            }
                        } else if (this.f.get() != null) {
                            a();
                            subscriber.onError(this.f.terminate());
                            return;
                        } else if (simpleQueue.isEmpty()) {
                            this.i.compareAndSet(aVar, null);
                        }
                    }
                    long j = this.j.get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 != j) {
                            if (!this.g) {
                                boolean z2 = aVar.e;
                                try {
                                    a05VarPoll = simpleQueue.poll();
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    aVar.a();
                                    this.f.addThrowable(th);
                                    a05VarPoll = null;
                                    z2 = true;
                                }
                                boolean z3 = a05VarPoll == null;
                                if (aVar == this.i.get()) {
                                    if (z2) {
                                        if (this.d) {
                                            if (z3) {
                                                this.i.compareAndSet(aVar, null);
                                            }
                                        } else if (this.f.get() != null) {
                                            subscriber.onError(this.f.terminate());
                                            return;
                                        } else if (z3) {
                                            this.i.compareAndSet(aVar, null);
                                        }
                                    }
                                    if (z3) {
                                        break;
                                    }
                                    subscriber.onNext(a05VarPoll);
                                    j2++;
                                }
                                z = true;
                                break;
                            }
                            return;
                        }
                        break;
                    }
                    if (j2 != 0 && !this.g) {
                        if (j != Long.MAX_VALUE) {
                            this.j.addAndGet(-j2);
                        }
                        aVar.get().request(j2);
                    }
                    if (z) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.i.lazySet(null);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.h.cancel();
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.e || !this.f.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.d) {
                a();
            }
            this.e = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            a<T, R> aVar;
            if (this.e) {
                return;
            }
            long j = this.k + 1;
            this.k = j;
            a<T, R> aVar2 = this.i.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.b.apply(t), "The publisher returned is null");
                a<T, R> aVar3 = new a<>(this, j, this.c);
                do {
                    aVar = this.i.get();
                    if (aVar == l) {
                        return;
                    }
                } while (!this.i.compareAndSet(aVar, aVar3));
                publisher.subscribe(aVar3);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.h.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.h, subscription)) {
                this.h = subscription;
                this.a.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.j, j);
                if (this.k == 0) {
                    this.h.request(Long.MAX_VALUE);
                } else {
                    b();
                }
            }
        }
    }

    public FlowableSwitchMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends R>> function, int i, boolean z) {
        super(flowable);
        this.b = function;
        this.c = i;
        this.d = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.b)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) new b(subscriber, this.b, this.c, this.d));
    }
}

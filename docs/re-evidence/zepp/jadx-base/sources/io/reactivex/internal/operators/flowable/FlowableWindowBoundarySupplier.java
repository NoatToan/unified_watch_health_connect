package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableWindowBoundarySupplier<T, B> extends io.reactivex.internal.operators.flowable.a<T, Flowable<T>> {
    public final Callable<? extends Publisher<B>> b;
    public final int c;

    public static final class a<T, B> extends DisposableSubscriber<B> {
        public final b<T, B> b;
        public boolean c;

        public a(b<T, B> bVar) {
            this.b = bVar;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.b.c();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.onError(th);
            } else {
                this.c = true;
                this.b.e(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(B b) {
            if (this.c) {
                return;
            }
            this.c = true;
            dispose();
            this.b.f(this);
        }
    }

    public static final class b<T, B> extends AtomicInteger implements FlowableSubscriber<T>, Subscription, Runnable {
        public static final a<Object, Object> n = new a<>(null);
        public static final Object o = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        public final Subscriber<? super Flowable<T>> a;
        public final int b;
        public final Callable<? extends Publisher<B>> h;
        public Subscription j;
        public volatile boolean k;
        public UnicastProcessor<T> l;
        public long m;
        public final AtomicReference<a<T, B>> c = new AtomicReference<>();
        public final AtomicInteger d = new AtomicInteger(1);
        public final MpscLinkedQueue<Object> e = new MpscLinkedQueue<>();
        public final AtomicThrowable f = new AtomicThrowable();
        public final AtomicBoolean g = new AtomicBoolean();
        public final AtomicLong i = new AtomicLong();

        public b(Subscriber<? super Flowable<T>> subscriber, int i, Callable<? extends Publisher<B>> callable) {
            this.a = subscriber;
            this.b = i;
            this.h = callable;
        }

        public void a() {
            AtomicReference<a<T, B>> atomicReference = this.c;
            a<Object, Object> aVar = n;
            a<T, B> andSet = atomicReference.getAndSet((a<T, B>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.dispose();
        }

        public void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Flowable<T>> subscriber = this.a;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.e;
            AtomicThrowable atomicThrowable = this.f;
            long j = this.m;
            int iAddAndGet = 1;
            while (this.d.get() != 0) {
                UnicastProcessor<T> unicastProcessor = this.l;
                boolean z = this.k;
                if (z && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (unicastProcessor != null) {
                        this.l = null;
                        unicastProcessor.onError(thTerminate);
                    }
                    subscriber.onError(thTerminate);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    Throwable thTerminate2 = atomicThrowable.terminate();
                    if (thTerminate2 == null) {
                        if (unicastProcessor != null) {
                            this.l = null;
                            unicastProcessor.onComplete();
                        }
                        subscriber.onComplete();
                        return;
                    }
                    if (unicastProcessor != null) {
                        this.l = null;
                        unicastProcessor.onError(thTerminate2);
                    }
                    subscriber.onError(thTerminate2);
                    return;
                }
                if (z2) {
                    this.m = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != o) {
                    unicastProcessor.onNext((T) objPoll);
                } else {
                    if (unicastProcessor != null) {
                        this.l = null;
                        unicastProcessor.onComplete();
                    }
                    if (!this.g.get()) {
                        if (j != this.i.get()) {
                            UnicastProcessor<T> unicastProcessorCreate = UnicastProcessor.create(this.b, this);
                            this.l = unicastProcessorCreate;
                            this.d.getAndIncrement();
                            try {
                                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.h.call(), "The other Callable returned a null Publisher");
                                a<T, B> aVar = new a<>(this);
                                if (this.c.compareAndSet(null, aVar)) {
                                    publisher.subscribe(aVar);
                                    j++;
                                    subscriber.onNext(unicastProcessorCreate);
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                atomicThrowable.addThrowable(th);
                                this.k = true;
                            }
                        } else {
                            this.j.cancel();
                            a();
                            atomicThrowable.addThrowable(new MissingBackpressureException("Could not deliver a window due to lack of requests"));
                            this.k = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.l = null;
        }

        public void c() {
            this.j.cancel();
            this.k = true;
            b();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.g.compareAndSet(false, true)) {
                a();
                if (this.d.decrementAndGet() == 0) {
                    this.j.cancel();
                }
            }
        }

        public void e(Throwable th) {
            this.j.cancel();
            if (!this.f.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.k = true;
                b();
            }
        }

        public void f(a<T, B> aVar) {
            this.c.compareAndSet(aVar, null);
            this.e.offer(o);
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            a();
            this.k = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            a();
            if (!this.f.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.k = true;
                b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.e.offer(t);
            b();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.j, subscription)) {
                this.j = subscription;
                this.a.onSubscribe(this);
                this.e.offer(o);
                b();
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            BackpressureHelper.add(this.i, j);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.decrementAndGet() == 0) {
                this.j.cancel();
            }
        }
    }

    public FlowableWindowBoundarySupplier(Flowable<T> flowable, Callable<? extends Publisher<B>> callable, int i) {
        super(flowable);
        this.b = callable;
        this.c = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super Flowable<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber) new b(subscriber, this.c, this.b));
    }
}

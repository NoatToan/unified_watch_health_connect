package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableSamplePublisher<T> extends Flowable<T> {
    public final Publisher<T> b;
    public final Publisher<?> c;
    public final boolean d;

    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        public final AtomicInteger f;
        public volatile boolean g;

        public a(Subscriber<? super T> subscriber, Publisher<?> publisher) {
            super(subscriber, publisher);
            this.f = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.c
        public void b() {
            this.g = true;
            if (this.f.getAndIncrement() == 0) {
                e();
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.c
        public void c() {
            this.g = true;
            if (this.f.getAndIncrement() == 0) {
                e();
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.c
        public void g() {
            if (this.f.getAndIncrement() == 0) {
                do {
                    boolean z = this.g;
                    e();
                    if (z) {
                        this.a.onComplete();
                        return;
                    }
                } while (this.f.decrementAndGet() != 0);
            }
        }
    }

    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public b(Subscriber<? super T> subscriber, Publisher<?> publisher) {
            super(subscriber, publisher);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.c
        public void b() {
            this.a.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.c
        public void c() {
            this.a.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.c
        public void g() {
            e();
        }
    }

    public static abstract class c<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -3517602651313910099L;
        public final Subscriber<? super T> a;
        public final Publisher<?> b;
        public final AtomicLong c = new AtomicLong();
        public final AtomicReference<Subscription> d = new AtomicReference<>();
        public Subscription e;

        public c(Subscriber<? super T> subscriber, Publisher<?> publisher) {
            this.a = subscriber;
            this.b = publisher;
        }

        public void a() {
            this.e.cancel();
            c();
        }

        public abstract void b();

        public abstract void c();

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.cancel(this.d);
            this.e.cancel();
        }

        public void e() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.c.get() != 0) {
                    this.a.onNext(andSet);
                    BackpressureHelper.produced(this.c, 1L);
                } else {
                    cancel();
                    this.a.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        public void f(Throwable th) {
            this.e.cancel();
            this.a.onError(th);
        }

        public abstract void g();

        public void h(Subscription subscription) {
            SubscriptionHelper.setOnce(this.d, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            SubscriptionHelper.cancel(this.d);
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.d);
            this.a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.e, subscription)) {
                this.e = subscription;
                this.a.onSubscribe(this);
                if (this.d.get() == null) {
                    this.b.subscribe(new d(this));
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.c, j);
            }
        }
    }

    public static final class d<T> implements FlowableSubscriber<Object> {
        public final c<T> a;

        public d(c<T> cVar) {
            this.a = cVar;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.a.a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.a.f(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.a.g();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            this.a.h(subscription);
        }
    }

    public FlowableSamplePublisher(Publisher<T> publisher, Publisher<?> publisher2, boolean z) {
        this.b = publisher;
        this.c = publisher2;
        this.d = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        if (this.d) {
            this.b.subscribe(new a(serializedSubscriber, this.c));
        } else {
            this.b.subscribe(new b(serializedSubscriber, this.c));
        }
    }
}

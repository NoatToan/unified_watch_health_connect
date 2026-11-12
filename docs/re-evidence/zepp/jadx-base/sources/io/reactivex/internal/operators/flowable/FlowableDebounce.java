package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableDebounce<T, U> extends io.reactivex.internal.operators.flowable.a<T, T> {
    public final Function<? super T, ? extends Publisher<U>> b;

    public static final class a<T, U> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 6725975399620862591L;
        public final Subscriber<? super T> a;
        public final Function<? super T, ? extends Publisher<U>> b;
        public Subscription c;
        public final AtomicReference<Disposable> d = new AtomicReference<>();
        public volatile long e;
        public boolean f;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableDebounce$a$a, reason: collision with other inner class name */
        public static final class C1096a<T, U> extends DisposableSubscriber<U> {
            public final a<T, U> b;
            public final long c;
            public final T d;
            public boolean e;
            public final AtomicBoolean f = new AtomicBoolean();

            public C1096a(a<T, U> aVar, long j, T t) {
                this.b = aVar;
                this.c = j;
                this.d = t;
            }

            public void a() {
                if (this.f.compareAndSet(false, true)) {
                    this.b.a(this.c, this.d);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                if (this.e) {
                    return;
                }
                this.e = true;
                a();
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable th) {
                if (this.e) {
                    RxJavaPlugins.onError(th);
                } else {
                    this.e = true;
                    this.b.onError(th);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(U u) {
                if (this.e) {
                    return;
                }
                this.e = true;
                cancel();
                a();
            }
        }

        public a(Subscriber<? super T> subscriber, Function<? super T, ? extends Publisher<U>> function) {
            this.a = subscriber;
            this.b = function;
        }

        public void a(long j, T t) {
            if (j == this.e) {
                if (get() != 0) {
                    this.a.onNext(t);
                    BackpressureHelper.produced(this, 1L);
                } else {
                    cancel();
                    this.a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.c.cancel();
            DisposableHelper.dispose(this.d);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            Disposable disposable = this.d.get();
            if (DisposableHelper.isDisposed(disposable)) {
                return;
            }
            ((C1096a) disposable).a();
            DisposableHelper.dispose(this.d);
            this.a.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.d);
            this.a.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f) {
                return;
            }
            long j = this.e + 1;
            this.e = j;
            Disposable disposable = this.d.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.b.apply(t), "The publisher supplied is null");
                C1096a c1096a = new C1096a(this, j, t);
                if (this.d.compareAndSet(disposable, c1096a)) {
                    publisher.subscribe(c1096a);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.a.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.c, subscription)) {
                this.c = subscription;
                this.a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this, j);
            }
        }
    }

    public FlowableDebounce(Flowable<T> flowable, Function<? super T, ? extends Publisher<U>> function) {
        super(flowable);
        this.b = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(new SerializedSubscriber(subscriber), this.b));
    }
}

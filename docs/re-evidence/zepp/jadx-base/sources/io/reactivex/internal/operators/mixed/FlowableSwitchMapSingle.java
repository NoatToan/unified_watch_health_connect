package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {
    public final Flowable<T> b;
    public final Function<? super T, ? extends SingleSource<? extends R>> c;
    public final boolean d;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final C1124a<Object> k = new C1124a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        public final Subscriber<? super R> a;
        public final Function<? super T, ? extends SingleSource<? extends R>> b;
        public final boolean c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final AtomicLong e = new AtomicLong();
        public final AtomicReference<C1124a<R>> f = new AtomicReference<>();
        public Subscription g;
        public volatile boolean h;
        public volatile boolean i;
        public long j;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$a$a, reason: collision with other inner class name */
        public static final class C1124a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            public final a<?, R> a;
            public volatile R b;

            public C1124a(a<?, R> aVar) {
                this.a = aVar;
            }

            public void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.a.c(this, th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                this.b = r;
                this.a.b();
            }
        }

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.a = subscriber;
            this.b = function;
            this.c = z;
        }

        public void a() {
            AtomicReference<C1124a<R>> atomicReference = this.f;
            C1124a<Object> c1124a = k;
            C1124a<R> andSet = atomicReference.getAndSet((C1124a<R>) c1124a);
            if (andSet == null || andSet == c1124a) {
                return;
            }
            andSet.a();
        }

        public void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.a;
            AtomicThrowable atomicThrowable = this.d;
            AtomicReference<C1124a<R>> atomicReference = this.f;
            AtomicLong atomicLong = this.e;
            long j = this.j;
            int iAddAndGet = 1;
            while (!this.i) {
                if (atomicThrowable.get() != null && !this.c) {
                    subscriber.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.h;
                C1124a<R> c1124a = atomicReference.get();
                boolean z2 = c1124a == null;
                if (z && z2) {
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate != null) {
                        subscriber.onError(thTerminate);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (z2 || c1124a.b == null || j == atomicLong.get()) {
                    this.j = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    atomicReference.compareAndSet(c1124a, null);
                    subscriber.onNext(c1124a.b);
                    j++;
                }
            }
        }

        public void c(C1124a<R> c1124a, Throwable th) {
            if (!this.f.compareAndSet(c1124a, null) || !this.d.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.c) {
                this.g.cancel();
                a();
            }
            b();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.i = true;
            this.g.cancel();
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.h = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!this.d.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.c) {
                a();
            }
            this.h = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            C1124a<R> c1124a;
            C1124a<R> c1124a2 = this.f.get();
            if (c1124a2 != null) {
                c1124a2.a();
            }
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.b.apply(t), "The mapper returned a null SingleSource");
                C1124a<R> c1124a3 = new C1124a<>(this);
                do {
                    c1124a = this.f.get();
                    if (c1124a == k) {
                        return;
                    }
                } while (!this.f.compareAndSet(c1124a, c1124a3));
                singleSource.subscribe(c1124a3);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.g.cancel();
                this.f.getAndSet((C1124a<R>) k);
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.g, subscription)) {
                this.g = subscription;
                this.a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            BackpressureHelper.add(this.e, j);
            b();
        }
    }

    public FlowableSwitchMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        this.b = flowable;
        this.c = function;
        this.d = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.b.subscribe((FlowableSubscriber) new a(subscriber, this.c, this.d));
    }
}

package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableConcatMapMaybe<T, R> extends Flowable<R> {
    public final Flowable<T> b;
    public final Function<? super T, ? extends MaybeSource<? extends R>> c;
    public final ErrorMode d;
    public final int e;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final int p = 0;
        public static final int q = 1;
        public static final int r = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        public final Subscriber<? super R> a;
        public final Function<? super T, ? extends MaybeSource<? extends R>> b;
        public final int c;
        public final AtomicLong d = new AtomicLong();
        public final AtomicThrowable e = new AtomicThrowable();
        public final C1120a<R> f = new C1120a<>(this);
        public final SimplePlainQueue<T> g;
        public final ErrorMode h;
        public Subscription i;
        public volatile boolean j;
        public volatile boolean k;
        public long l;
        public int m;
        public R n;
        public volatile int o;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe$a$a, reason: collision with other inner class name */
        public static final class C1120a<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            public final a<?, R> a;

            public C1120a(a<?, R> aVar) {
                this.a = aVar;
            }

            public void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.a.b();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                this.a.c(th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                this.a.e(r);
            }
        }

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, int i, ErrorMode errorMode) {
            this.a = subscriber;
            this.b = function;
            this.c = i;
            this.h = errorMode;
            this.g = new SpscArrayQueue(i);
        }

        public void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.a;
            ErrorMode errorMode = this.h;
            SimplePlainQueue<T> simplePlainQueue = this.g;
            AtomicThrowable atomicThrowable = this.e;
            AtomicLong atomicLong = this.d;
            int i = this.c;
            int i2 = i - (i >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (!this.k) {
                    int i3 = this.o;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i3 == 0))) {
                        break;
                    }
                    if (i3 == 0) {
                        boolean z = this.j;
                        T tPoll = simplePlainQueue.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(thTerminate);
                                return;
                            }
                        }
                        if (!z2) {
                            int i4 = this.m + 1;
                            if (i4 == i2) {
                                this.m = 0;
                                this.i.request(i2);
                            } else {
                                this.m = i4;
                            }
                            try {
                                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.b.apply(tPoll), "The mapper returned a null MaybeSource");
                                this.o = 1;
                                maybeSource.subscribe(this.f);
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.i.cancel();
                                simplePlainQueue.clear();
                                atomicThrowable.addThrowable(th);
                                subscriber.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } else if (i3 == 2) {
                        long j = this.l;
                        if (j != atomicLong.get()) {
                            R r2 = this.n;
                            this.n = null;
                            subscriber.onNext(r2);
                            this.l = j + 1;
                            this.o = 0;
                        }
                    }
                } else {
                    simplePlainQueue.clear();
                    this.n = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
            this.n = null;
            subscriber.onError(atomicThrowable.terminate());
        }

        public void b() {
            this.o = 0;
            a();
        }

        public void c(Throwable th) {
            if (!this.e.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.h != ErrorMode.END) {
                this.i.cancel();
            }
            this.o = 0;
            a();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.k = true;
            this.i.cancel();
            this.f.a();
            if (getAndIncrement() == 0) {
                this.g.clear();
                this.n = null;
            }
        }

        public void e(R r2) {
            this.n = r2;
            this.o = 2;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.j = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!this.e.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.h == ErrorMode.IMMEDIATE) {
                this.f.a();
            }
            this.j = true;
            a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.g.offer(t)) {
                a();
            } else {
                this.i.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.i, subscription)) {
                this.i = subscription;
                this.a.onSubscribe(this);
                subscription.request(this.c);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            BackpressureHelper.add(this.d, j);
            a();
        }
    }

    public FlowableConcatMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, ErrorMode errorMode, int i) {
        this.b = flowable;
        this.c = function;
        this.d = errorMode;
        this.e = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.b.subscribe((FlowableSubscriber) new a(subscriber, this.c, this.e, this.d));
    }
}

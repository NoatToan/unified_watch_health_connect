package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableConcatMap<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {
    public final Function<? super T, ? extends Publisher<? extends R>> b;
    public final int c;
    public final ErrorMode d;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            a = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<T, R> extends AtomicInteger implements FlowableSubscriber<T>, f<R>, Subscription {
        private static final long serialVersionUID = -3511336836796789179L;
        public final Function<? super T, ? extends Publisher<? extends R>> b;
        public final int c;
        public final int d;
        public Subscription e;
        public int f;
        public SimpleQueue<T> g;
        public volatile boolean h;
        public volatile boolean i;
        public volatile boolean k;
        public int l;
        public final e<R> a = new e<>(this);
        public final AtomicThrowable j = new AtomicThrowable();

        public b(Function<? super T, ? extends Publisher<? extends R>> function, int i) {
            this.b = function;
            this.c = i;
            this.d = i - (i >> 2);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.f
        public final void b() {
            this.k = false;
            e();
        }

        public abstract void e();

        public abstract void f();

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.h = true;
            e();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.l == 2 || this.g.offer(t)) {
                e();
            } else {
                this.e.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.e, subscription)) {
                this.e = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.l = iRequestFusion;
                        this.g = queueSubscription;
                        this.h = true;
                        f();
                        e();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.l = iRequestFusion;
                        this.g = queueSubscription;
                        f();
                        subscription.request(this.c);
                        return;
                    }
                }
                this.g = new SpscArrayQueue(this.c);
                f();
                subscription.request(this.c);
            }
        }
    }

    public static final class c<T, R> extends b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        public final Subscriber<? super R> m;
        public final boolean n;

        public c(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i, boolean z) {
            super(function, i);
            this.m = subscriber;
            this.n = z;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.f
        public void a(Throwable th) {
            if (!this.j.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.n) {
                this.e.cancel();
                this.h = true;
            }
            this.k = false;
            e();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.f
        public void c(R r) {
            this.m.onNext(r);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.a.cancel();
            this.e.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void e() {
            if (getAndIncrement() == 0) {
                while (!this.i) {
                    if (!this.k) {
                        boolean z = this.h;
                        if (z && !this.n && this.j.get() != null) {
                            this.m.onError(this.j.terminate());
                            return;
                        }
                        try {
                            T tPoll = this.g.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                Throwable thTerminate = this.j.terminate();
                                if (thTerminate != null) {
                                    this.m.onError(thTerminate);
                                    return;
                                } else {
                                    this.m.onComplete();
                                    return;
                                }
                            }
                            if (!z2) {
                                try {
                                    Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.b.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.l != 1) {
                                        int i = this.f + 1;
                                        if (i == this.d) {
                                            this.f = 0;
                                            this.e.request(i);
                                        } else {
                                            this.f = i;
                                        }
                                    }
                                    if (publisher instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) publisher).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (this.a.isUnbounded()) {
                                                this.m.onNext(objCall);
                                            } else {
                                                this.k = true;
                                                e<R> eVar = this.a;
                                                eVar.setSubscription(new g(objCall, eVar));
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            this.e.cancel();
                                            this.j.addThrowable(th);
                                            this.m.onError(this.j.terminate());
                                            return;
                                        }
                                    } else {
                                        this.k = true;
                                        publisher.subscribe(this.a);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.e.cancel();
                                    this.j.addThrowable(th2);
                                    this.m.onError(this.j.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.e.cancel();
                            this.j.addThrowable(th3);
                            this.m.onError(this.j.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void f() {
            this.m.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!this.j.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.h = true;
                e();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.a.request(j);
        }
    }

    public static final class d<T, R> extends b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        public final Subscriber<? super R> m;
        public final AtomicInteger n;

        public d(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i) {
            super(function, i);
            this.m = subscriber;
            this.n = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.f
        public void a(Throwable th) {
            if (!this.j.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.e.cancel();
            if (getAndIncrement() == 0) {
                this.m.onError(this.j.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.f
        public void c(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.m.onNext(r);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.m.onError(this.j.terminate());
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.a.cancel();
            this.e.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void e() {
            if (this.n.getAndIncrement() == 0) {
                while (!this.i) {
                    if (!this.k) {
                        boolean z = this.h;
                        try {
                            T tPoll = this.g.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                this.m.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.b.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.l != 1) {
                                        int i = this.f + 1;
                                        if (i == this.d) {
                                            this.f = 0;
                                            this.e.request(i);
                                        } else {
                                            this.f = i;
                                        }
                                    }
                                    if (publisher instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) publisher).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.a.isUnbounded()) {
                                                this.k = true;
                                                e<R> eVar = this.a;
                                                eVar.setSubscription(new g(objCall, eVar));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.m.onNext(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    this.m.onError(this.j.terminate());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            this.e.cancel();
                                            this.j.addThrowable(th);
                                            this.m.onError(this.j.terminate());
                                            return;
                                        }
                                    } else {
                                        this.k = true;
                                        publisher.subscribe(this.a);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.e.cancel();
                                    this.j.addThrowable(th2);
                                    this.m.onError(this.j.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.e.cancel();
                            this.j.addThrowable(th3);
                            this.m.onError(this.j.terminate());
                            return;
                        }
                    }
                    if (this.n.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void f() {
            this.m.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!this.j.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.a.cancel();
            if (getAndIncrement() == 0) {
                this.m.onError(this.j.terminate());
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            this.a.request(j);
        }
    }

    public static final class e<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        public final f<R> h;
        public long i;

        public e(f<R> fVar) {
            super(false);
            this.h = fVar;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            long j = this.i;
            if (j != 0) {
                this.i = 0L;
                produced(j);
            }
            this.h.b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            long j = this.i;
            if (j != 0) {
                this.i = 0L;
                produced(j);
            }
            this.h.a(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
            this.i++;
            this.h.c(r);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            setSubscription(subscription);
        }
    }

    public interface f<T> {
        void a(Throwable th);

        void b();

        void c(T t);
    }

    public static final class g<T> implements Subscription {
        public final Subscriber<? super T> a;
        public final T b;
        public boolean c;

        public g(T t, Subscriber<? super T> subscriber) {
            this.b = t;
            this.a = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (j <= 0 || this.c) {
                return;
            }
            this.c = true;
            Subscriber<? super T> subscriber = this.a;
            subscriber.onNext(this.b);
            subscriber.onComplete();
        }
    }

    public FlowableConcatMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends R>> function, int i, ErrorMode errorMode) {
        super(flowable);
        this.b = function;
        this.c = i;
        this.d = errorMode;
    }

    public static <T, R> Subscriber<T> subscribe(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i, ErrorMode errorMode) {
        int i2 = a.a[errorMode.ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? new d(subscriber, function, i) : new c(subscriber, function, i, true);
        }
        return new c(subscriber, function, i, false);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.b)) {
            return;
        }
        this.source.subscribe(subscribe(subscriber, this.b, this.c, this.d));
    }
}

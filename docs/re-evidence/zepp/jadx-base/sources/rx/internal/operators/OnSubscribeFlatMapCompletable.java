package rx.internal.operators;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.internal.util.ExceptionsUtils;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeFlatMapCompletable<T> implements Observable.OnSubscribe<T> {
    public final Observable<T> a;
    public final Func1<? super T, ? extends Completable> b;
    public final boolean c;
    public final int d;

    public static final class a<T> extends Subscriber<T> {
        public final Subscriber<? super T> f;
        public final Func1<? super T, ? extends Completable> g;
        public final boolean h;
        public final int i;
        public final AtomicInteger j = new AtomicInteger(1);
        public final AtomicReference<Throwable> l = new AtomicReference<>();
        public final CompositeSubscription k = new CompositeSubscription();

        /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeFlatMapCompletable$a$a, reason: collision with other inner class name */
        public final class C1231a extends AtomicReference<Subscription> implements CompletableSubscriber, Subscription {
            private static final long serialVersionUID = -8588259593722659900L;

            public C1231a() {
            }

            @Override // rx.Subscription
            public boolean isUnsubscribed() {
                return get() == this;
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                a.this.c(this);
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                a.this.d(this, th);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                if (compareAndSet(null, subscription)) {
                    return;
                }
                subscription.unsubscribe();
                if (get() != this) {
                    RxJavaHooks.onError(new IllegalStateException("Subscription already set!"));
                }
            }

            @Override // rx.Subscription
            public void unsubscribe() {
                Subscription andSet = getAndSet(this);
                if (andSet == null || andSet == this) {
                    return;
                }
                andSet.unsubscribe();
            }
        }

        public a(Subscriber<? super T> subscriber, Func1<? super T, ? extends Completable> func1, boolean z, int i) {
            this.f = subscriber;
            this.g = func1;
            this.h = z;
            this.i = i;
            request(i != Integer.MAX_VALUE ? i : Long.MAX_VALUE);
        }

        public boolean b() {
            if (this.j.decrementAndGet() != 0) {
                return false;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.l);
            if (thTerminate != null) {
                this.f.onError(thTerminate);
                return true;
            }
            this.f.onCompleted();
            return true;
        }

        public void c(a<T>.C1231a c1231a) {
            this.k.remove(c1231a);
            if (b() || this.i == Integer.MAX_VALUE) {
                return;
            }
            request(1L);
        }

        public void d(a<T>.C1231a c1231a, Throwable th) {
            this.k.remove(c1231a);
            if (this.h) {
                ExceptionsUtils.addThrowable(this.l, th);
                if (b() || this.i == Integer.MAX_VALUE) {
                    return;
                }
                request(1L);
                return;
            }
            this.k.unsubscribe();
            unsubscribe();
            if (this.l.compareAndSet(null, th)) {
                this.f.onError(ExceptionsUtils.terminate(this.l));
            } else {
                RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            b();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.h) {
                ExceptionsUtils.addThrowable(this.l, th);
                onCompleted();
                return;
            }
            this.k.unsubscribe();
            if (this.l.compareAndSet(null, th)) {
                this.f.onError(ExceptionsUtils.terminate(this.l));
            } else {
                RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                Completable completableCall = this.g.call(t);
                if (completableCall == null) {
                    throw new NullPointerException("The mapper returned a null Completable");
                }
                C1231a c1231a = new C1231a();
                this.k.add(c1231a);
                this.j.getAndIncrement();
                completableCall.unsafeSubscribe(c1231a);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public OnSubscribeFlatMapCompletable(Observable<T> observable, Func1<? super T, ? extends Completable> func1, boolean z, int i) {
        Objects.requireNonNull(func1, "mapper is null");
        if (i <= 0) {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i);
        }
        this.a = observable;
        this.b = func1;
        this.c = z;
        this.d = i;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber, this.b, this.c, this.d);
        subscriber.add(aVar);
        subscriber.add(aVar.k);
        this.a.unsafeSubscribe(aVar);
    }
}

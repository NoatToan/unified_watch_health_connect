package rx.internal.operators;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.atomic.MpscLinkedAtomicQueue;
import rx.internal.util.unsafe.MpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeFlatMapSingle<T, R> implements Observable.OnSubscribe<R> {
    public final Observable<T> a;
    public final Func1<? super T, ? extends Single<? extends R>> b;
    public final boolean c;
    public final int d;

    public static final class a<T, R> extends Subscriber<T> {
        public final Subscriber<? super R> f;
        public final Func1<? super T, ? extends Single<? extends R>> g;
        public final boolean h;
        public final int i;
        public final Queue<Object> n;
        public volatile boolean p;
        public volatile boolean q;
        public final AtomicInteger j = new AtomicInteger();
        public final AtomicReference<Throwable> m = new AtomicReference<>();
        public final a<T, R>.b o = new b();
        public final CompositeSubscription l = new CompositeSubscription();
        public final AtomicInteger k = new AtomicInteger();

        /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeFlatMapSingle$a$a, reason: collision with other inner class name */
        public final class C1232a extends SingleSubscriber<R> {
            public C1232a() {
            }

            @Override // rx.SingleSubscriber
            public void onError(Throwable th) {
                a.this.c(this, th);
            }

            @Override // rx.SingleSubscriber
            public void onSuccess(R r) {
                a.this.d(this, r);
            }
        }

        public final class b extends AtomicLong implements Producer, Subscription {
            private static final long serialVersionUID = -887187595446742742L;

            public b() {
            }

            public void a(long j) {
                BackpressureUtils.produced(this, j);
            }

            @Override // rx.Subscription
            public boolean isUnsubscribed() {
                return a.this.q;
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j > 0) {
                    BackpressureUtils.getAndAddRequest(this, j);
                    a.this.b();
                }
            }

            @Override // rx.Subscription
            public void unsubscribe() {
                a.this.q = true;
                a.this.unsubscribe();
                if (a.this.j.getAndIncrement() == 0) {
                    a.this.n.clear();
                }
            }
        }

        public a(Subscriber<? super R> subscriber, Func1<? super T, ? extends Single<? extends R>> func1, boolean z, int i) {
            this.f = subscriber;
            this.g = func1;
            this.h = z;
            this.i = i;
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.n = new MpscLinkedQueue();
            } else {
                this.n = new MpscLinkedAtomicQueue();
            }
            request(i != Integer.MAX_VALUE ? i : Long.MAX_VALUE);
        }

        public void b() {
            if (this.j.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f;
            Queue<Object> queue = this.n;
            boolean z = this.h;
            AtomicInteger atomicInteger = this.k;
            int iAddAndGet = 1;
            do {
                long j = this.o.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.q) {
                        queue.clear();
                        return;
                    }
                    boolean z2 = this.p;
                    if (!z && z2 && this.m.get() != null) {
                        queue.clear();
                        subscriber.onError(ExceptionsUtils.terminate(this.m));
                        return;
                    }
                    Object objPoll = queue.poll();
                    boolean z3 = objPoll == null;
                    if (z2 && atomicInteger.get() == 0 && z3) {
                        if (this.m.get() != null) {
                            subscriber.onError(ExceptionsUtils.terminate(this.m));
                            return;
                        } else {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                    if (z3) {
                        break;
                    }
                    subscriber.onNext((Object) NotificationLite.getValue(objPoll));
                    j2++;
                }
                if (j2 == j) {
                    if (this.q) {
                        queue.clear();
                        return;
                    }
                    if (this.p) {
                        if (z) {
                            if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                if (this.m.get() != null) {
                                    subscriber.onError(ExceptionsUtils.terminate(this.m));
                                    return;
                                } else {
                                    subscriber.onCompleted();
                                    return;
                                }
                            }
                        } else if (this.m.get() != null) {
                            queue.clear();
                            subscriber.onError(ExceptionsUtils.terminate(this.m));
                            return;
                        } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                            subscriber.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    this.o.a(j2);
                    if (!this.p && this.i != Integer.MAX_VALUE) {
                        request(j2);
                    }
                }
                iAddAndGet = this.j.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public void c(a<T, R>.C1232a c1232a, Throwable th) {
            if (this.h) {
                ExceptionsUtils.addThrowable(this.m, th);
                this.l.remove(c1232a);
                if (!this.p && this.i != Integer.MAX_VALUE) {
                    request(1L);
                }
            } else {
                this.l.unsubscribe();
                unsubscribe();
                if (!this.m.compareAndSet(null, th)) {
                    RxJavaHooks.onError(th);
                    return;
                }
                this.p = true;
            }
            this.k.decrementAndGet();
            b();
        }

        public void d(a<T, R>.C1232a c1232a, R r) {
            this.n.offer(NotificationLite.next(r));
            this.l.remove(c1232a);
            this.k.decrementAndGet();
            b();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.p = true;
            b();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.h) {
                ExceptionsUtils.addThrowable(this.m, th);
            } else {
                this.l.unsubscribe();
                if (!this.m.compareAndSet(null, th)) {
                    RxJavaHooks.onError(th);
                    return;
                }
            }
            this.p = true;
            b();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                Single<? extends R> singleCall = this.g.call(t);
                if (singleCall == null) {
                    throw new NullPointerException("The mapper returned a null Single");
                }
                C1232a c1232a = new C1232a();
                this.l.add(c1232a);
                this.k.incrementAndGet();
                singleCall.subscribe(c1232a);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public OnSubscribeFlatMapSingle(Observable<T> observable, Func1<? super T, ? extends Single<? extends R>> func1, boolean z, int i) {
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
    public void call(Subscriber<? super R> subscriber) {
        a aVar = new a(subscriber, this.b, this.c, this.d);
        subscriber.add(aVar.l);
        subscriber.add(aVar.o);
        subscriber.setProducer(aVar.o);
        this.a.unsafeSubscribe(aVar);
    }
}

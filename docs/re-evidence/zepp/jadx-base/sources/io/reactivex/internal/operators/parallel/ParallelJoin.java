package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class ParallelJoin<T> extends Flowable<T> {
    public final ParallelFlowable<? extends T> b;
    public final int c;
    public final boolean d;

    public static final class a<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 8410034718427740355L;
        public final c<T> a;
        public final int b;
        public final int c;
        public long d;
        public volatile SimplePlainQueue<T> e;

        public a(c<T> cVar, int i) {
            this.a = cVar;
            this.b = i;
            this.c = i - (i >> 2);
        }

        public boolean a() {
            return SubscriptionHelper.cancel(this);
        }

        public SimplePlainQueue<T> b() {
            SimplePlainQueue<T> simplePlainQueue = this.e;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.b);
            this.e = spscArrayQueue;
            return spscArrayQueue;
        }

        public void c(long j) {
            long j2 = this.d + j;
            if (j2 < this.c) {
                this.d = j2;
            } else {
                this.d = 0L;
                get().request(j2);
            }
        }

        public void e() {
            long j = this.d + 1;
            if (j != this.c) {
                this.d = j;
            } else {
                this.d = 0L;
                get().request(j);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.a.e();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.a.f(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.a.g(this, t);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, this.b);
        }
    }

    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        public b(Subscriber<? super T> subscriber, int i, int i2) {
            super(subscriber, i, i2);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            h();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public void e() {
            this.f.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public void f(Throwable th) {
            if (this.c.compareAndSet(null, th)) {
                a();
                c();
            } else if (th != this.c.get()) {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public void g(a<T> aVar, T t) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.d.get() != 0) {
                    this.a.onNext(t);
                    if (this.d.get() != Long.MAX_VALUE) {
                        this.d.decrementAndGet();
                    }
                    aVar.c(1L);
                } else if (!aVar.b().offer(t)) {
                    a();
                    MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Queue full?!");
                    if (this.c.compareAndSet(null, missingBackpressureException)) {
                        this.a.onError(missingBackpressureException);
                        return;
                    } else {
                        RxJavaPlugins.onError(missingBackpressureException);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!aVar.b().offer(t)) {
                a();
                f(new MissingBackpressureException("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            h();
        }

        public void h() {
            boolean z;
            T tPoll;
            a<T>[] aVarArr = this.b;
            int length = aVarArr.length;
            Subscriber<? super T> subscriber = this.a;
            int i = 1;
            while (true) {
                long j = this.d.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.e) {
                        b();
                        return;
                    }
                    Throwable th = this.c.get();
                    if (th != null) {
                        b();
                        subscriber.onError(th);
                        return;
                    }
                    boolean z2 = this.f.get() == 0;
                    boolean z3 = true;
                    for (a<T> aVar : aVarArr) {
                        SimplePlainQueue<T> simplePlainQueue = aVar.e;
                        if (simplePlainQueue != null && (tPoll = simplePlainQueue.poll()) != null) {
                            subscriber.onNext(tPoll);
                            aVar.e();
                            j2++;
                            if (j2 == j) {
                                break;
                            } else {
                                z3 = false;
                            }
                        }
                    }
                    if (!z2 || !z3) {
                        if (z3) {
                            break;
                        }
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (j2 == j) {
                    if (this.e) {
                        b();
                        return;
                    }
                    Throwable th2 = this.c.get();
                    if (th2 != null) {
                        b();
                        subscriber.onError(th2);
                        return;
                    }
                    boolean z4 = this.f.get() == 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = true;
                            break;
                        }
                        SimplePlainQueue<T> simplePlainQueue2 = aVarArr[i2].e;
                        if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    if (z4 && z) {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.d.addAndGet(-j2);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i && (iAddAndGet = addAndGet(-i)) == 0) {
                    return;
                } else {
                    i = iAddAndGet;
                }
            }
        }
    }

    public static abstract class c<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 3100232009247827843L;
        public final Subscriber<? super T> a;
        public final a<T>[] b;
        public volatile boolean e;
        public final AtomicThrowable c = new AtomicThrowable();
        public final AtomicLong d = new AtomicLong();
        public final AtomicInteger f = new AtomicInteger();

        public c(Subscriber<? super T> subscriber, int i, int i2) {
            this.a = subscriber;
            a<T>[] aVarArr = new a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new a<>(this, i2);
            }
            this.b = aVarArr;
            this.f.lazySet(i);
        }

        public void a() {
            int i = 0;
            while (true) {
                a<T>[] aVarArr = this.b;
                if (i >= aVarArr.length) {
                    return;
                }
                aVarArr[i].a();
                i++;
            }
        }

        public void b() {
            int i = 0;
            while (true) {
                a<T>[] aVarArr = this.b;
                if (i >= aVarArr.length) {
                    return;
                }
                aVarArr[i].e = null;
                i++;
            }
        }

        public abstract void c();

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.e) {
                return;
            }
            this.e = true;
            a();
            if (getAndIncrement() == 0) {
                b();
            }
        }

        public abstract void e();

        public abstract void f(Throwable th);

        public abstract void g(a<T> aVar, T t);

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.d, j);
                c();
            }
        }
    }

    public static final class d<T> extends c<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        public d(Subscriber<? super T> subscriber, int i, int i2) {
            super(subscriber, i, i2);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            h();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public void e() {
            this.f.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public void f(Throwable th) {
            this.c.addThrowable(th);
            this.f.decrementAndGet();
            c();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.c
        public void g(a<T> aVar, T t) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.d.get() != 0) {
                    this.a.onNext(t);
                    if (this.d.get() != Long.MAX_VALUE) {
                        this.d.decrementAndGet();
                    }
                    aVar.c(1L);
                } else if (!aVar.b().offer(t)) {
                    aVar.a();
                    this.c.addThrowable(new MissingBackpressureException("Queue full?!"));
                    this.f.decrementAndGet();
                    h();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!aVar.b().offer(t) && aVar.a()) {
                    this.c.addThrowable(new MissingBackpressureException("Queue full?!"));
                    this.f.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            h();
        }

        public void h() {
            boolean z;
            T tPoll;
            a<T>[] aVarArr = this.b;
            int length = aVarArr.length;
            Subscriber<? super T> subscriber = this.a;
            int i = 1;
            while (true) {
                long j = this.d.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.e) {
                        b();
                        return;
                    }
                    boolean z2 = this.f.get() == 0;
                    boolean z3 = true;
                    for (a<T> aVar : aVarArr) {
                        SimplePlainQueue<T> simplePlainQueue = aVar.e;
                        if (simplePlainQueue != null && (tPoll = simplePlainQueue.poll()) != null) {
                            subscriber.onNext(tPoll);
                            aVar.e();
                            j2++;
                            if (j2 == j) {
                                break;
                            } else {
                                z3 = false;
                            }
                        }
                    }
                    if (z2 && z3) {
                        if (this.c.get() != null) {
                            subscriber.onError(this.c.terminate());
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (z3) {
                        break;
                    }
                }
                if (j2 == j) {
                    if (this.e) {
                        b();
                        return;
                    }
                    boolean z4 = this.f.get() == 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = true;
                            break;
                        }
                        SimplePlainQueue<T> simplePlainQueue2 = aVarArr[i2].e;
                        if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    if (z4 && z) {
                        if (this.c.get() != null) {
                            subscriber.onError(this.c.terminate());
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.d.addAndGet(-j2);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i && (iAddAndGet = addAndGet(-i)) == 0) {
                    return;
                } else {
                    i = iAddAndGet;
                }
            }
        }
    }

    public ParallelJoin(ParallelFlowable<? extends T> parallelFlowable, int i, boolean z) {
        this.b = parallelFlowable;
        this.c = i;
        this.d = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        c dVar = this.d ? new d(subscriber, this.b.parallelism(), this.c) : new b(subscriber, this.b.parallelism(), this.c);
        subscriber.onSubscribe(dVar);
        this.b.subscribe(dVar.b);
    }
}

package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableFlatMap<T, U> extends io.reactivex.internal.operators.flowable.a<T, U> {
    public final Function<? super T, ? extends Publisher<? extends U>> b;
    public final boolean c;
    public final int d;
    public final int e;

    public static final class a<T, U> extends AtomicReference<Subscription> implements FlowableSubscriber<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        public final long a;
        public final b<T, U> b;
        public final int c;
        public final int d;
        public volatile boolean e;
        public volatile SimpleQueue<U> f;
        public long g;
        public int h;

        public a(b<T, U> bVar, long j) {
            this.a = j;
            this.b = bVar;
            int i = bVar.e;
            this.d = i;
            this.c = i >> 2;
        }

        public void a(long j) {
            if (this.h != 1) {
                long j2 = this.g + j;
                if (j2 < this.c) {
                    this.g = j2;
                } else {
                    this.g = 0L;
                    get().request(j2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.e = true;
            this.b.f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.b.j(this, th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U u) {
            if (this.h != 2) {
                this.b.m(u, this);
            } else {
                this.b.f();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.h = iRequestFusion;
                        this.f = queueSubscription;
                        this.e = true;
                        this.b.f();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.h = iRequestFusion;
                        this.f = queueSubscription;
                    }
                }
                subscription.request(this.d);
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        public static final a<?, ?>[] r = new a[0];
        public static final a<?, ?>[] s = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        public final Subscriber<? super U> a;
        public final Function<? super T, ? extends Publisher<? extends U>> b;
        public final boolean c;
        public final int d;
        public final int e;
        public volatile SimplePlainQueue<U> f;
        public volatile boolean g;
        public final AtomicThrowable h = new AtomicThrowable();
        public volatile boolean i;
        public final AtomicReference<a<?, ?>[]> j;
        public final AtomicLong k;
        public Subscription l;
        public long m;
        public long n;
        public int o;
        public int p;
        public final int q;

        public b(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i, int i2) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.j = atomicReference;
            this.k = new AtomicLong();
            this.a = subscriber;
            this.b = function;
            this.c = z;
            this.d = i;
            this.e = i2;
            this.q = Math.max(1, i >> 1);
            atomicReference.lazySet(r);
        }

        public boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.j.get();
                if (aVarArr == s) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.j.compareAndSet(aVarArr, (a<?, ?>[]) aVarArr2));
            return true;
        }

        public boolean b() {
            if (this.i) {
                c();
                return true;
            }
            if (this.c || this.h.get() == null) {
                return false;
            }
            c();
            Throwable thTerminate = this.h.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.a.onError(thTerminate);
            }
            return true;
        }

        public void c() {
            SimplePlainQueue<U> simplePlainQueue = this.f;
            if (simplePlainQueue != null) {
                simplePlainQueue.clear();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SimplePlainQueue<U> simplePlainQueue;
            if (this.i) {
                return;
            }
            this.i = true;
            this.l.cancel();
            e();
            if (getAndIncrement() != 0 || (simplePlainQueue = this.f) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        public void e() {
            a<?, ?>[] andSet;
            a<?, ?>[] aVarArr = this.j.get();
            a<?, ?>[] aVarArr2 = s;
            if (aVarArr == aVarArr2 || (andSet = this.j.getAndSet(aVarArr2)) == aVarArr2) {
                return;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.dispose();
            }
            Throwable thTerminate = this.h.terminate();
            if (thTerminate == null || thTerminate == ExceptionHelper.TERMINATED) {
                return;
            }
            RxJavaPlugins.onError(thTerminate);
        }

        public void f() {
            if (getAndIncrement() == 0) {
                g();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g() {
            long j;
            long j2;
            boolean z;
            a<T, U>[] aVarArr;
            int i;
            long j3;
            Object obj;
            Subscriber<? super U> subscriber = this.a;
            int iAddAndGet = 1;
            while (!b()) {
                SimplePlainQueue<U> simplePlainQueue = this.f;
                long jAddAndGet = this.k.get();
                boolean z2 = jAddAndGet == Long.MAX_VALUE;
                long j4 = 0;
                long j5 = 0;
                if (simplePlainQueue != null) {
                    do {
                        long j6 = 0;
                        obj = null;
                        while (jAddAndGet != 0) {
                            U uPoll = simplePlainQueue.poll();
                            if (b()) {
                                return;
                            }
                            if (uPoll == null) {
                                obj = uPoll;
                                break;
                            }
                            subscriber.onNext(uPoll);
                            j5++;
                            j6++;
                            jAddAndGet--;
                            obj = uPoll;
                        }
                        if (j6 != 0) {
                            jAddAndGet = z2 ? Long.MAX_VALUE : this.k.addAndGet(-j6);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                }
                boolean z3 = this.g;
                SimplePlainQueue<U> simplePlainQueue2 = this.f;
                a<?, ?>[] aVarArr2 = this.j.get();
                int length = aVarArr2.length;
                if (z3 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    Throwable thTerminate = this.h.terminate();
                    if (thTerminate != ExceptionHelper.TERMINATED) {
                        if (thTerminate == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(thTerminate);
                            return;
                        }
                    }
                    return;
                }
                int i2 = iAddAndGet;
                if (length != 0) {
                    long j7 = this.n;
                    int i3 = this.o;
                    if (length <= i3 || aVarArr2[i3].a != j7) {
                        if (length <= i3) {
                            i3 = 0;
                        }
                        for (int i4 = 0; i4 < length && aVarArr2[i3].a != j7; i4++) {
                            i3++;
                            if (i3 == length) {
                                i3 = 0;
                            }
                        }
                        this.o = i3;
                        this.n = aVarArr2[i3].a;
                    }
                    int i5 = i3;
                    boolean z4 = false;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            aVarArr = aVarArr2;
                            z = z4;
                            break;
                        }
                        if (b()) {
                            return;
                        }
                        a<T, U> aVar = aVarArr2[i5];
                        U uPoll2 = null;
                        while (!b()) {
                            SimpleQueue<U> simpleQueue = aVar.f;
                            if (simpleQueue == null) {
                                aVarArr = aVarArr2;
                                i = length;
                            } else {
                                aVarArr = aVarArr2;
                                i = length;
                                long j8 = j4;
                                while (jAddAndGet != j4) {
                                    try {
                                        uPoll2 = simpleQueue.poll();
                                        if (uPoll2 == null) {
                                            break;
                                        }
                                        subscriber.onNext(uPoll2);
                                        if (b()) {
                                            return;
                                        }
                                        jAddAndGet--;
                                        j8++;
                                    } catch (Throwable th) {
                                        Exceptions.throwIfFatal(th);
                                        aVar.dispose();
                                        this.h.addThrowable(th);
                                        if (!this.c) {
                                            this.l.cancel();
                                        }
                                        if (b()) {
                                            return;
                                        }
                                        k(aVar);
                                        i6++;
                                        length = i;
                                        z4 = true;
                                    }
                                }
                                if (j8 != j4) {
                                    jAddAndGet = !z2 ? this.k.addAndGet(-j8) : Long.MAX_VALUE;
                                    aVar.a(j8);
                                    j3 = 0;
                                } else {
                                    j3 = j4;
                                }
                                if (jAddAndGet != j3 && uPoll2 != null) {
                                    aVarArr2 = aVarArr;
                                    length = i;
                                    j4 = 0;
                                }
                            }
                            boolean z5 = aVar.e;
                            SimpleQueue<U> simpleQueue2 = aVar.f;
                            if (z5 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                k(aVar);
                                if (b()) {
                                    return;
                                }
                                j5++;
                                z4 = true;
                            }
                            if (jAddAndGet == 0) {
                                z = z4;
                                break;
                            }
                            i5++;
                            length = i;
                            if (i5 == length) {
                                i5 = 0;
                            }
                            i6++;
                            aVarArr2 = aVarArr;
                            j4 = 0;
                        }
                        return;
                    }
                    this.o = i5;
                    this.n = aVarArr[i5].a;
                    j2 = j5;
                    j = 0;
                } else {
                    j = 0;
                    j2 = j5;
                    z = false;
                }
                if (j2 != j && !this.i) {
                    this.l.request(j2);
                }
                if (z) {
                    iAddAndGet = i2;
                } else {
                    iAddAndGet = addAndGet(-i2);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        public SimpleQueue<U> h(a<T, U> aVar) {
            SimpleQueue<U> simpleQueue = aVar.f;
            if (simpleQueue != null) {
                return simpleQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.e);
            aVar.f = spscArrayQueue;
            return spscArrayQueue;
        }

        public SimpleQueue<U> i() {
            SimplePlainQueue<U> spscLinkedArrayQueue = this.f;
            if (spscLinkedArrayQueue == null) {
                spscLinkedArrayQueue = this.d == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.e) : new SpscArrayQueue<>(this.d);
                this.f = spscLinkedArrayQueue;
            }
            return spscLinkedArrayQueue;
        }

        public void j(a<T, U> aVar, Throwable th) {
            if (!this.h.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            aVar.e = true;
            if (!this.c) {
                this.l.cancel();
                for (a<?, ?> aVar2 : this.j.getAndSet(s)) {
                    aVar2.dispose();
                }
            }
            f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void k(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.j.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = r;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                    System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!this.j.compareAndSet(aVarArr, aVarArr2));
        }

        public void m(U u, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.k.get();
                SimpleQueue<U> simpleQueueH = aVar.f;
                if (j == 0 || !(simpleQueueH == null || simpleQueueH.isEmpty())) {
                    if (simpleQueueH == null) {
                        simpleQueueH = h(aVar);
                    }
                    if (!simpleQueueH.offer(u)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.a.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.k.decrementAndGet();
                    }
                    aVar.a(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscArrayQueue = aVar.f;
                if (spscArrayQueue == null) {
                    spscArrayQueue = new SpscArrayQueue(this.e);
                    aVar.f = spscArrayQueue;
                }
                if (!spscArrayQueue.offer(u)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            g();
        }

        public void n(U u) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.k.get();
                SimpleQueue<U> simpleQueueI = this.f;
                if (j == 0 || !(simpleQueueI == null || simpleQueueI.isEmpty())) {
                    if (simpleQueueI == null) {
                        simpleQueueI = i();
                    }
                    if (!simpleQueueI.offer(u)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.a.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.k.decrementAndGet();
                    }
                    if (this.d != Integer.MAX_VALUE && !this.i) {
                        int i = this.p + 1;
                        this.p = i;
                        int i2 = this.q;
                        if (i == i2) {
                            this.p = 0;
                            this.l.request(i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!i().offer(u)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            g();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.onError(th);
            } else if (!this.h.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.g = true;
                f();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.g) {
                return;
            }
            try {
                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.b.apply(t), "The mapper returned a null Publisher");
                if (!(publisher instanceof Callable)) {
                    long j = this.m;
                    this.m = 1 + j;
                    a aVar = new a(this, j);
                    if (a(aVar)) {
                        publisher.subscribe(aVar);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) publisher).call();
                    if (objCall != null) {
                        n(objCall);
                        return;
                    }
                    if (this.d == Integer.MAX_VALUE || this.i) {
                        return;
                    }
                    int i = this.p + 1;
                    this.p = i;
                    int i2 = this.q;
                    if (i == i2) {
                        this.p = 0;
                        this.l.request(i2);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.h.addThrowable(th);
                    f();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.l.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.l, subscription)) {
                this.l = subscription;
                this.a.onSubscribe(this);
                if (this.i) {
                    return;
                }
                int i = this.d;
                if (i == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.k, j);
                f();
            }
        }
    }

    public FlowableFlatMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i, int i2) {
        super(flowable);
        this.b = function;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(Subscriber<? super U> subscriber, Function<? super T, ? extends Publisher<? extends U>> function, boolean z, int i, int i2) {
        return new b(subscriber, function, z, i, i2);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.b)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) subscribe(subscriber, this.b, this.c, this.d, this.e));
    }
}

package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {
    public final Publisher<? extends T> a;
    public final int b;
    public final int c;

    public static final class a<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        public final Subscriber<? super T>[] a;
        public final AtomicLongArray b;
        public final long[] c;
        public final int d;
        public final int e;
        public Subscription f;
        public SimpleQueue<T> g;
        public Throwable h;
        public volatile boolean i;
        public int j;
        public volatile boolean k;
        public final AtomicInteger l = new AtomicInteger();
        public int m;
        public int n;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.parallel.ParallelFromPublisher$a$a, reason: collision with other inner class name */
        public final class C1149a implements Subscription {
            public final int a;
            public final int b;

            public C1149a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            @Override // org.reactivestreams.Subscription
            public void cancel() {
                if (a.this.b.compareAndSet(this.a + this.b, 0L, 1L)) {
                    a aVar = a.this;
                    int i = this.b;
                    aVar.a(i + i);
                }
            }

            @Override // org.reactivestreams.Subscription
            public void request(long j) {
                long j2;
                if (SubscriptionHelper.validate(j)) {
                    AtomicLongArray atomicLongArray = a.this.b;
                    do {
                        j2 = atomicLongArray.get(this.a);
                        if (j2 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.a, j2, BackpressureHelper.addCap(j2, j)));
                    if (a.this.l.get() == this.b) {
                        a.this.b();
                    }
                }
            }
        }

        public a(Subscriber<? super T>[] subscriberArr, int i) {
            this.a = subscriberArr;
            this.d = i;
            this.e = i - (i >> 2);
            int length = subscriberArr.length;
            int i2 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i2 + 1);
            this.b = atomicLongArray;
            atomicLongArray.lazySet(i2, length);
            this.c = new long[length];
        }

        public void a(int i) {
            if (this.b.decrementAndGet(i) == 0) {
                this.k = true;
                this.f.cancel();
                if (getAndIncrement() == 0) {
                    this.g.clear();
                }
            }
        }

        public void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.n == 1) {
                e();
            } else {
                c();
            }
        }

        public void c() {
            Throwable th;
            SimpleQueue<T> simpleQueue = this.g;
            Subscriber<? super T>[] subscriberArr = this.a;
            AtomicLongArray atomicLongArray = this.b;
            long[] jArr = this.c;
            int length = jArr.length;
            int i = this.j;
            int i2 = this.m;
            int iAddAndGet = 1;
            while (true) {
                int i3 = 0;
                int i4 = 0;
                do {
                    if (this.k) {
                        simpleQueue.clear();
                        return;
                    }
                    boolean z = this.i;
                    if (z && (th = this.h) != null) {
                        simpleQueue.clear();
                        int length2 = subscriberArr.length;
                        while (i3 < length2) {
                            subscriberArr[i3].onError(th);
                            i3++;
                        }
                        return;
                    }
                    boolean zIsEmpty = simpleQueue.isEmpty();
                    if (z && zIsEmpty) {
                        int length3 = subscriberArr.length;
                        while (i3 < length3) {
                            subscriberArr[i3].onComplete();
                            i3++;
                        }
                        return;
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    long j = atomicLongArray.get(i);
                    long j2 = jArr[i];
                    if (j == j2 || atomicLongArray.get(length + i) != 0) {
                        i4++;
                    } else {
                        try {
                            T tPoll = simpleQueue.poll();
                            if (tPoll == null) {
                                break;
                            }
                            subscriberArr[i].onNext(tPoll);
                            jArr[i] = j2 + 1;
                            i2++;
                            if (i2 == this.e) {
                                this.f.request(i2);
                                i2 = 0;
                            }
                            i4 = 0;
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.f.cancel();
                            int length4 = subscriberArr.length;
                            while (i3 < length4) {
                                subscriberArr[i3].onError(th2);
                                i3++;
                            }
                            return;
                        }
                    }
                    i++;
                    if (i == length) {
                        i = 0;
                    }
                } while (i4 != length);
                int i5 = get();
                if (i5 == iAddAndGet) {
                    this.j = i;
                    this.m = i2;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i5;
                }
            }
        }

        public void e() {
            SimpleQueue<T> simpleQueue = this.g;
            Subscriber<? super T>[] subscriberArr = this.a;
            AtomicLongArray atomicLongArray = this.b;
            long[] jArr = this.c;
            int length = jArr.length;
            int i = this.j;
            int iAddAndGet = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                do {
                    if (this.k) {
                        simpleQueue.clear();
                        return;
                    }
                    if (simpleQueue.isEmpty()) {
                        int length2 = subscriberArr.length;
                        while (i2 < length2) {
                            subscriberArr[i2].onComplete();
                            i2++;
                        }
                        return;
                    }
                    long j = atomicLongArray.get(i);
                    long j2 = jArr[i];
                    if (j == j2 || atomicLongArray.get(length + i) != 0) {
                        i3++;
                    } else {
                        try {
                            T tPoll = simpleQueue.poll();
                            if (tPoll == null) {
                                int length3 = subscriberArr.length;
                                while (i2 < length3) {
                                    subscriberArr[i2].onComplete();
                                    i2++;
                                }
                                return;
                            }
                            subscriberArr[i].onNext(tPoll);
                            jArr[i] = j2 + 1;
                            i3 = 0;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.f.cancel();
                            int length4 = subscriberArr.length;
                            while (i2 < length4) {
                                subscriberArr[i2].onError(th);
                                i2++;
                            }
                            return;
                        }
                    }
                    i++;
                    if (i == length) {
                        i = 0;
                    }
                } while (i3 != length);
                int i4 = get();
                if (i4 == iAddAndGet) {
                    this.j = i;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i4;
                }
            }
        }

        public void f() {
            Subscriber<? super T>[] subscriberArr = this.a;
            int length = subscriberArr.length;
            int i = 0;
            while (i < length && !this.k) {
                int i2 = i + 1;
                this.l.lazySet(i2);
                subscriberArr[i].onSubscribe(new C1149a(i, length));
                i = i2;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.i = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.h = th;
            this.i = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.n != 0 || this.g.offer(t)) {
                b();
            } else {
                this.f.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f, subscription)) {
                this.f = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.n = iRequestFusion;
                        this.g = queueSubscription;
                        this.i = true;
                        f();
                        b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.n = iRequestFusion;
                        this.g = queueSubscription;
                        f();
                        subscription.request(this.d);
                        return;
                    }
                }
                this.g = new SpscArrayQueue(this.d);
                f();
                subscription.request(this.d);
            }
        }
    }

    public ParallelFromPublisher(Publisher<? extends T> publisher, int i, int i2) {
        this.a = publisher;
        this.b = i;
        this.c = i2;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.b;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            this.a.subscribe(new a(subscriberArr, this.c));
        }
    }
}

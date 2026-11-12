package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T> {
    public static final long f = Long.MIN_VALUE;
    public final Flowable<T> b;
    public final AtomicReference<c<T>> c;
    public final int d;
    public final Publisher<T> e;

    public static final class a<T> implements Publisher<T> {
        private final AtomicReference<c<T>> a;
        private final int b;

        public a(AtomicReference<c<T>> atomicReference, int i) {
            this.a = atomicReference;
            this.b = i;
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
            c<T> cVar;
            b<T> bVar = new b<>(subscriber);
            subscriber.onSubscribe(bVar);
            while (true) {
                cVar = this.a.get();
                if (cVar == null || cVar.isDisposed()) {
                    c<T> cVar2 = new c<>(this.a, this.b);
                    if (this.a.compareAndSet(cVar, cVar2)) {
                        cVar = cVar2;
                    } else {
                        continue;
                    }
                }
                if (cVar.a(bVar)) {
                    break;
                }
            }
            if (bVar.get() == Long.MIN_VALUE) {
                cVar.e(bVar);
            } else {
                bVar.b = cVar;
            }
            cVar.c();
        }
    }

    public static final class b<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        public final Subscriber<? super T> a;
        public volatile c<T> b;
        public long c;

        public b(Subscriber<? super T> subscriber) {
            this.a = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            c<T> cVar;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (cVar = this.b) == null) {
                return;
            }
            cVar.e(this);
            cVar.c();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.addCancel(this, j);
                c<T> cVar = this.b;
                if (cVar != null) {
                    cVar.c();
                }
            }
        }
    }

    public static final class c<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        public static final b[] i = new b[0];
        public static final b[] j = new b[0];
        private static final long serialVersionUID = -202316842419149694L;
        public final AtomicReference<c<T>> a;
        public final int b;
        public volatile Object f;
        public int g;
        public volatile SimpleQueue<T> h;
        public final AtomicReference<Subscription> e = new AtomicReference<>();
        public final AtomicReference<b<T>[]> c = new AtomicReference<>(i);
        public final AtomicBoolean d = new AtomicBoolean();

        public c(AtomicReference<c<T>> atomicReference, int i2) {
            this.a = atomicReference;
            this.b = i2;
        }

        public boolean a(b<T> bVar) {
            b<T>[] bVarArr;
            b<T>[] bVarArr2;
            do {
                bVarArr = this.c.get();
                if (bVarArr == j) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!this.c.compareAndSet(bVarArr, bVarArr2));
            return true;
        }

        public boolean b(Object obj, boolean z) {
            int i2 = 0;
            if (obj != null) {
                if (!NotificationLite.isComplete(obj)) {
                    Throwable error = NotificationLite.getError(obj);
                    this.a.compareAndSet(this, null);
                    b<T>[] andSet = this.c.getAndSet(j);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i2 < length) {
                            andSet[i2].a.onError(error);
                            i2++;
                        }
                    } else {
                        RxJavaPlugins.onError(error);
                    }
                    return true;
                }
                if (z) {
                    this.a.compareAndSet(this, null);
                    b<T>[] andSet2 = this.c.getAndSet(j);
                    int length2 = andSet2.length;
                    while (i2 < length2) {
                        andSet2[i2].a.onComplete();
                        i2++;
                    }
                    return true;
                }
            }
            return false;
        }

        public void c() {
            T tPoll;
            T tPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<b<T>[]> atomicReference = this.c;
            int i2 = 1;
            b<T>[] bVarArr = atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                Object obj = this.f;
                SimpleQueue<T> simpleQueue = this.h;
                boolean z = simpleQueue == null || simpleQueue.isEmpty();
                if (b(obj, z)) {
                    return;
                }
                if (!z) {
                    int length = bVarArr.length;
                    int i3 = 0;
                    long jMin = Long.MAX_VALUE;
                    for (b<T> bVar : bVarArr) {
                        long j2 = bVar.get();
                        if (j2 != Long.MIN_VALUE) {
                            jMin = Math.min(jMin, j2 - bVar.c);
                        } else {
                            i3++;
                        }
                    }
                    if (length == i3) {
                        Object objError = this.f;
                        try {
                            tPoll = simpleQueue.poll();
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.e.get().cancel();
                            objError = NotificationLite.error(th);
                            this.f = objError;
                            tPoll = null;
                        }
                        if (b(objError, tPoll == null)) {
                            return;
                        }
                        if (this.g != i2) {
                            this.e.get().request(1L);
                        }
                    } else {
                        int i4 = 0;
                        while (true) {
                            long j3 = i4;
                            if (j3 < jMin) {
                                Object objError2 = this.f;
                                try {
                                    tPoll2 = simpleQueue.poll();
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.e.get().cancel();
                                    objError2 = NotificationLite.error(th2);
                                    this.f = objError2;
                                    tPoll2 = null;
                                }
                                boolean z2 = tPoll2 == null;
                                if (b(objError2, z2)) {
                                    return;
                                }
                                if (z2) {
                                    z = z2;
                                } else {
                                    Object value = NotificationLite.getValue(tPoll2);
                                    int length2 = bVarArr.length;
                                    int i5 = 0;
                                    boolean z3 = false;
                                    while (i5 < length2) {
                                        b<T> bVar2 = bVarArr[i5];
                                        long j4 = bVar2.get();
                                        if (j4 != Long.MIN_VALUE) {
                                            if (j4 != Long.MAX_VALUE) {
                                                bVar2.c++;
                                            }
                                            bVar2.a.onNext(value);
                                        } else {
                                            z3 = true;
                                        }
                                        i5++;
                                        simpleQueue = simpleQueue;
                                        z2 = z2;
                                    }
                                    SimpleQueue<T> simpleQueue2 = simpleQueue;
                                    boolean z4 = z2;
                                    i4++;
                                    b<T>[] bVarArr2 = atomicReference.get();
                                    if (z3 || bVarArr2 != bVarArr) {
                                        bVarArr = bVarArr2;
                                        i2 = 1;
                                    } else {
                                        simpleQueue = simpleQueue2;
                                        z = z4;
                                    }
                                }
                            }
                            if (i4 > 0) {
                                i2 = 1;
                                if (this.g != 1) {
                                    this.e.get().request(j3);
                                }
                            } else {
                                i2 = 1;
                            }
                            if (jMin == 0 || z) {
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    bVarArr = atomicReference.get();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            b<T>[] bVarArr = this.c.get();
            b<T>[] bVarArr2 = j;
            if (bVarArr == bVarArr2 || this.c.getAndSet(bVarArr2) == bVarArr2) {
                return;
            }
            this.a.compareAndSet(this, null);
            SubscriptionHelper.cancel(this.e);
        }

        public void e(b<T> bVar) {
            b<T>[] bVarArr;
            b<T>[] bVarArr2;
            do {
                bVarArr = this.c.get();
                int length = bVarArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = -1;
                for (int i3 = 0; i3 < length; i3++) {
                    if (bVarArr[i3].equals(bVar)) {
                        i2 = i3;
                        break;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr2 = i;
                } else {
                    b<T>[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr3, 0, i2);
                    System.arraycopy(bVarArr, i2 + 1, bVarArr3, i2, (length - i2) - 1);
                    bVarArr2 = bVarArr3;
                }
            } while (!this.c.compareAndSet(bVarArr, bVarArr2));
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.c.get() == j;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f == null) {
                this.f = NotificationLite.complete();
                c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f != null) {
                RxJavaPlugins.onError(th);
            } else {
                this.f = NotificationLite.error(th);
                c();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.g != 0 || this.h.offer(t)) {
                c();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.e, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.g = iRequestFusion;
                        this.h = queueSubscription;
                        this.f = NotificationLite.complete();
                        c();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.g = iRequestFusion;
                        this.h = queueSubscription;
                        subscription.request(this.b);
                        return;
                    }
                }
                this.h = new SpscArrayQueue(this.b);
                subscription.request(this.b);
            }
        }
    }

    private FlowablePublish(Publisher<T> publisher, Flowable<T> flowable, AtomicReference<c<T>> atomicReference, int i) {
        this.e = publisher;
        this.b = flowable;
        this.c = atomicReference;
        this.d = i;
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowablePublish(new a(atomicReference, i), flowable, atomicReference, i));
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        c<T> cVar;
        while (true) {
            cVar = this.c.get();
            if (cVar != null && !cVar.isDisposed()) {
                break;
            }
            c<T> cVar2 = new c<>(this.c, this.d);
            if (this.c.compareAndSet(cVar, cVar2)) {
                cVar = cVar2;
                break;
            }
        }
        boolean z = !cVar.d.get() && cVar.d.compareAndSet(false, true);
        try {
            consumer.accept(cVar);
            if (z) {
                this.b.subscribe((FlowableSubscriber) cVar);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.e.subscribe(subscriber);
    }
}

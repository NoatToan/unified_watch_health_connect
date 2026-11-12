package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribePublishMulticast<T> extends AtomicInteger implements Observable.OnSubscribe<T>, Observer<T>, Subscription {
    public static final b<?>[] i = new b[0];
    public static final b<?>[] j = new b[0];
    private static final long serialVersionUID = -3741892510772238743L;
    public final Queue<T> a;
    public final int b;
    public final boolean c;
    public final a<T> d;
    public volatile boolean e;
    public Throwable f;
    public volatile Producer g;
    public volatile b<T>[] h;

    public static final class a<T> extends Subscriber<T> {
        public final OnSubscribePublishMulticast<T> f;

        public a(OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.f = onSubscribePublishMulticast;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(t);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f.setProducer(producer);
        }
    }

    public static final class b<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = 960704844171597367L;
        public final Subscriber<? super T> a;
        public final OnSubscribePublishMulticast<T> b;
        public final AtomicBoolean c = new AtomicBoolean();

        public b(Subscriber<? super T> subscriber, OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.a = subscriber;
            this.b = onSubscribePublishMulticast;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.c.get();
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j != 0) {
                BackpressureUtils.getAndAddRequest(this, j);
                this.b.c();
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.c.compareAndSet(false, true)) {
                this.b.e(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnSubscribePublishMulticast(int i2, boolean z) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("prefetch > 0 required but it was " + i2);
        }
        this.b = i2;
        this.c = z;
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.a = new SpscArrayQueue(i2);
        } else {
            this.a = new SpscAtomicArrayQueue(i2);
        }
        this.h = (b<T>[]) i;
        this.d = new a<>(this);
    }

    public boolean a(b<T> bVar) {
        b<T>[] bVarArr = this.h;
        b<?>[] bVarArr2 = j;
        if (bVarArr == bVarArr2) {
            return false;
        }
        synchronized (this) {
            b<T>[] bVarArr3 = this.h;
            if (bVarArr3 == bVarArr2) {
                return false;
            }
            int length = bVarArr3.length;
            b<T>[] bVarArr4 = new b[length + 1];
            System.arraycopy(bVarArr3, 0, bVarArr4, 0, length);
            bVarArr4[length] = bVar;
            this.h = bVarArr4;
            return true;
        }
    }

    public boolean b(boolean z, boolean z2) {
        int i2 = 0;
        if (z) {
            if (!this.c) {
                Throwable th = this.f;
                if (th != null) {
                    this.a.clear();
                    b<T>[] bVarArrF = f();
                    int length = bVarArrF.length;
                    while (i2 < length) {
                        bVarArrF[i2].a.onError(th);
                        i2++;
                    }
                    return true;
                }
                if (z2) {
                    b<T>[] bVarArrF2 = f();
                    int length2 = bVarArrF2.length;
                    while (i2 < length2) {
                        bVarArrF2[i2].a.onCompleted();
                        i2++;
                    }
                    return true;
                }
            } else if (z2) {
                b<T>[] bVarArrF3 = f();
                Throwable th2 = this.f;
                if (th2 != null) {
                    int length3 = bVarArrF3.length;
                    while (i2 < length3) {
                        bVarArrF3[i2].a.onError(th2);
                        i2++;
                    }
                } else {
                    int length4 = bVarArrF3.length;
                    while (i2 < length4) {
                        bVarArrF3[i2].a.onCompleted();
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        Queue<T> queue = this.a;
        int iAddAndGet = 0;
        do {
            long jMin = Long.MAX_VALUE;
            b<T>[] bVarArr = this.h;
            int length = bVarArr.length;
            for (b<T> bVar : bVarArr) {
                jMin = Math.min(jMin, bVar.get());
            }
            if (length != 0) {
                long j2 = 0;
                while (j2 != jMin) {
                    boolean z = this.e;
                    T tPoll = queue.poll();
                    boolean z2 = tPoll == null;
                    if (b(z, z2)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    for (b<T> bVar2 : bVarArr) {
                        bVar2.a.onNext(tPoll);
                    }
                    j2++;
                }
                if (j2 == jMin && b(this.e, queue.isEmpty())) {
                    return;
                }
                if (j2 != 0) {
                    Producer producer = this.g;
                    if (producer != null) {
                        producer.request(j2);
                    }
                    for (b<T> bVar3 : bVarArr) {
                        BackpressureUtils.produced(bVar3, j2);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    public void e(b<T> bVar) {
        b<?>[] bVarArr;
        b[] bVarArr2;
        b<T>[] bVarArr3 = this.h;
        b<?>[] bVarArr4 = j;
        if (bVarArr3 == bVarArr4 || bVarArr3 == (bVarArr = i)) {
            return;
        }
        synchronized (this) {
            b<T>[] bVarArr5 = this.h;
            if (bVarArr5 != bVarArr4 && bVarArr5 != bVarArr) {
                int i2 = -1;
                int length = bVarArr5.length;
                for (int i3 = 0; i3 < length; i3++) {
                    if (bVarArr5[i3] == bVar) {
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
                    b[] bVarArr6 = new b[length - 1];
                    System.arraycopy(bVarArr5, 0, bVarArr6, 0, i2);
                    System.arraycopy(bVarArr5, i2 + 1, bVarArr6, i2, (length - i2) - 1);
                    bVarArr2 = bVarArr6;
                }
                this.h = bVarArr2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b<T>[] f() {
        b<T>[] bVarArr = this.h;
        b<T>[] bVarArr2 = (b<T>[]) j;
        if (bVarArr != bVarArr2) {
            synchronized (this) {
                bVarArr = this.h;
                if (bVarArr != bVarArr2) {
                    this.h = bVarArr2;
                }
            }
        }
        return bVarArr;
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.d.isUnsubscribed();
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.e = true;
        c();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.f = th;
        this.e = true;
        c();
    }

    @Override // rx.Observer
    public void onNext(T t) {
        if (!this.a.offer(t)) {
            this.d.unsubscribe();
            this.f = new MissingBackpressureException("Queue full?!");
            this.e = true;
        }
        c();
    }

    public void setProducer(Producer producer) {
        this.g = producer;
        producer.request(this.b);
    }

    public Subscriber<T> subscriber() {
        return this.d;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.d.unsubscribe();
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        b<T> bVar = new b<>(subscriber, this);
        subscriber.add(bVar);
        subscriber.setProducer(bVar);
        if (a(bVar)) {
            if (bVar.isUnsubscribed()) {
                e(bVar);
                return;
            } else {
                c();
                return;
            }
        }
        Throwable th = this.f;
        if (th != null) {
            subscriber.onError(th);
        } else {
            subscriber.onCompleted();
        }
    }
}

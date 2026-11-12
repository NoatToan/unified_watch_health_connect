package rx.internal.operators;

import defpackage.a6h;
import defpackage.b8o;
import defpackage.cbi;
import defpackage.hx1;
import defpackage.koo;
import defpackage.p4h;
import defpackage.xno;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribePublishMulticast<T> extends AtomicInteger implements p4h.a<T>, a6h<T>, koo {
    static final b<?>[] EMPTY = new b[0];
    static final b<?>[] TERMINATED = new b[0];
    private static final long serialVersionUID = -3741892510772238743L;
    final boolean delayError;
    volatile boolean done;
    Throwable error;
    final a<T> parent;
    final int prefetch;
    volatile cbi producer;
    final Queue<T> queue;
    volatile b<T>[] subscribers;

    public static final class a<T> extends xno<T> {
        public final OnSubscribePublishMulticast<T> c;

        public a(OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.c = onSubscribePublishMulticast;
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            this.c.onCompleted();
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            this.c.onError(th);
        }

        @Override // defpackage.a6h
        public void onNext(T t) {
            this.c.onNext(t);
        }

        @Override // defpackage.xno
        public void setProducer(cbi cbiVar) {
            this.c.setProducer(cbiVar);
        }
    }

    public static final class b<T> extends AtomicLong implements cbi, koo {
        private static final long serialVersionUID = 960704844171597367L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xno<? super T> f32999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OnSubscribePublishMulticast<T> f33000b;
        public final AtomicBoolean c = new AtomicBoolean();

        public b(xno<? super T> xnoVar, OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.f32999a = xnoVar;
            this.f33000b = onSubscribePublishMulticast;
        }

        @Override // defpackage.koo
        public boolean isUnsubscribed() {
            return this.c.get();
        }

        @Override // defpackage.cbi
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j != 0) {
                hx1.b(this, j);
                this.f33000b.drain();
            }
        }

        @Override // defpackage.koo
        public void unsubscribe() {
            if (this.c.compareAndSet(false, true)) {
                this.f33000b.remove(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnSubscribePublishMulticast(int i, boolean z) {
        if (i <= 0) {
            throw new IllegalArgumentException("prefetch > 0 required but it was " + i);
        }
        this.prefetch = i;
        this.delayError = z;
        if (UnsafeAccess.isUnsafeAvailable()) {
            this.queue = new SpscArrayQueue(i);
        } else {
            this.queue = new b8o(i);
        }
        this.subscribers = (b<T>[]) EMPTY;
        this.parent = new a<>(this);
    }

    public boolean add(b<T> bVar) {
        b<T>[] bVarArr = this.subscribers;
        b<?>[] bVarArr2 = TERMINATED;
        if (bVarArr == bVarArr2) {
            return false;
        }
        synchronized (this) {
            try {
                b<T>[] bVarArr3 = this.subscribers;
                if (bVarArr3 == bVarArr2) {
                    return false;
                }
                int length = bVarArr3.length;
                b<T>[] bVarArr4 = new b[length + 1];
                System.arraycopy(bVarArr3, 0, bVarArr4, 0, length);
                bVarArr4[length] = bVar;
                this.subscribers = bVarArr4;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean checkTerminated(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            if (!this.delayError) {
                Throwable th = this.error;
                if (th != null) {
                    this.queue.clear();
                    b<T>[] bVarArrTerminate = terminate();
                    int length = bVarArrTerminate.length;
                    while (i < length) {
                        bVarArrTerminate[i].f32999a.onError(th);
                        i++;
                    }
                    return true;
                }
                if (z2) {
                    b<T>[] bVarArrTerminate2 = terminate();
                    int length2 = bVarArrTerminate2.length;
                    while (i < length2) {
                        bVarArrTerminate2[i].f32999a.onCompleted();
                        i++;
                    }
                    return true;
                }
            } else if (z2) {
                b<T>[] bVarArrTerminate3 = terminate();
                Throwable th2 = this.error;
                if (th2 != null) {
                    int length3 = bVarArrTerminate3.length;
                    while (i < length3) {
                        bVarArrTerminate3[i].f32999a.onError(th2);
                        i++;
                    }
                } else {
                    int length4 = bVarArrTerminate3.length;
                    while (i < length4) {
                        bVarArrTerminate3[i].f32999a.onCompleted();
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        Queue<T> queue = this.queue;
        int iAddAndGet = 0;
        do {
            b<T>[] bVarArr = this.subscribers;
            int length = bVarArr.length;
            long jMin = Long.MAX_VALUE;
            for (b<T> bVar : bVarArr) {
                jMin = Math.min(jMin, bVar.get());
            }
            if (length != 0) {
                long j = 0;
                while (j != jMin) {
                    boolean z = this.done;
                    T tPoll = queue.poll();
                    boolean z2 = tPoll == null;
                    if (checkTerminated(z, z2)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    for (b<T> bVar2 : bVarArr) {
                        bVar2.f32999a.onNext(tPoll);
                    }
                    j++;
                }
                if (j == jMin && checkTerminated(this.done, queue.isEmpty())) {
                    return;
                }
                if (j != 0) {
                    cbi cbiVar = this.producer;
                    if (cbiVar != null) {
                        cbiVar.request(j);
                    }
                    for (b<T> bVar3 : bVarArr) {
                        hx1.c(bVar3, j);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // defpackage.koo
    public boolean isUnsubscribed() {
        return this.parent.isUnsubscribed();
    }

    @Override // defpackage.a6h
    public void onCompleted() {
        this.done = true;
        drain();
    }

    @Override // defpackage.a6h
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // defpackage.a6h
    public void onNext(T t) {
        if (!this.queue.offer(t)) {
            this.parent.unsubscribe();
            this.error = new MissingBackpressureException("Queue full?!");
            this.done = true;
        }
        drain();
    }

    public void remove(b<T> bVar) {
        b<?>[] bVarArr;
        b[] bVarArr2;
        b<T>[] bVarArr3 = this.subscribers;
        b<?>[] bVarArr4 = TERMINATED;
        if (bVarArr3 == bVarArr4 || bVarArr3 == (bVarArr = EMPTY)) {
            return;
        }
        synchronized (this) {
            try {
                b<T>[] bVarArr5 = this.subscribers;
                if (bVarArr5 != bVarArr4 && bVarArr5 != bVarArr) {
                    int length = bVarArr5.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (bVarArr5[i] == bVar) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        bVarArr2 = EMPTY;
                    } else {
                        b[] bVarArr6 = new b[length - 1];
                        System.arraycopy(bVarArr5, 0, bVarArr6, 0, i);
                        System.arraycopy(bVarArr5, i + 1, bVarArr6, i, (length - i) - 1);
                        bVarArr2 = bVarArr6;
                    }
                    this.subscribers = bVarArr2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setProducer(cbi cbiVar) {
        this.producer = cbiVar;
        cbiVar.request(this.prefetch);
    }

    public xno<T> subscriber() {
        return this.parent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b<T>[] terminate() {
        b<T>[] bVarArr = this.subscribers;
        b<T>[] bVarArr2 = (b<T>[]) TERMINATED;
        if (bVarArr != bVarArr2) {
            synchronized (this) {
                try {
                    bVarArr = this.subscribers;
                    if (bVarArr != bVarArr2) {
                        this.subscribers = bVarArr2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bVarArr;
    }

    @Override // defpackage.koo
    public void unsubscribe() {
        this.parent.unsubscribe();
    }

    @Override // defpackage.tc0
    public void call(xno<? super T> xnoVar) {
        b<T> bVar = new b<>(xnoVar, this);
        xnoVar.add(bVar);
        xnoVar.setProducer(bVar);
        if (add(bVar)) {
            if (bVar.isUnsubscribed()) {
                remove(bVar);
                return;
            } else {
                drain();
                return;
            }
        }
        Throwable th = this.error;
        if (th != null) {
            xnoVar.onError(th);
        } else {
            xnoVar.onCompleted();
        }
    }
}

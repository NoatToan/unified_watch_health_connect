package rx.internal.operators;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.observables.ConnectableObservable;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorPublish<T> extends ConnectableObservable<T> {
    public final Observable<? extends T> b;
    public final AtomicReference<d<T>> c;

    public static class a implements Observable.OnSubscribe<T> {
        public final /* synthetic */ AtomicReference a;

        public a(AtomicReference atomicReference) {
            this.a = atomicReference;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            while (true) {
                d dVar = (d) this.a.get();
                if (dVar == null || dVar.isUnsubscribed()) {
                    d dVar2 = new d(this.a);
                    dVar2.e();
                    if (this.a.compareAndSet(dVar, dVar2)) {
                        dVar = dVar2;
                    } else {
                        continue;
                    }
                }
                c<T> cVar = new c<>(dVar, subscriber);
                if (dVar.b(cVar)) {
                    subscriber.add(cVar);
                    subscriber.setProducer(cVar);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class b<R> implements Observable.OnSubscribe<R> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Func1 b;
        public final /* synthetic */ Observable c;

        public class a extends Subscriber<R> {
            public final /* synthetic */ Subscriber f;
            public final /* synthetic */ OnSubscribePublishMulticast g;

            public a(Subscriber subscriber, OnSubscribePublishMulticast onSubscribePublishMulticast) {
                this.f = subscriber;
                this.g = onSubscribePublishMulticast;
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.g.unsubscribe();
                this.f.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                this.g.unsubscribe();
                this.f.onError(th);
            }

            @Override // rx.Observer
            public void onNext(R r) {
                this.f.onNext(r);
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                this.f.setProducer(producer);
            }
        }

        public b(boolean z, Func1 func1, Observable observable) {
            this.a = z;
            this.b = func1;
            this.c = observable;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super R> subscriber) {
            OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(RxRingBuffer.SIZE, this.a);
            a aVar = new a(subscriber, onSubscribePublishMulticast);
            subscriber.add(onSubscribePublishMulticast);
            subscriber.add(aVar);
            ((Observable) this.b.call(Observable.unsafeCreate(onSubscribePublishMulticast))).unsafeSubscribe(aVar);
            this.c.unsafeSubscribe(onSubscribePublishMulticast.subscriber());
        }
    }

    public static final class c<T> extends AtomicLong implements Producer, Subscription {
        public static final long c = Long.MIN_VALUE;
        public static final long d = -4611686018427387904L;
        private static final long serialVersionUID = -4453897557930727610L;
        public final d<T> a;
        public final Subscriber<? super T> b;

        public c(d<T> dVar, Subscriber<? super T> subscriber) {
            this.a = dVar;
            this.b = subscriber;
            lazySet(-4611686018427387904L);
        }

        public long a(long j) {
            long j2;
            long j3;
            if (j <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j2 = get();
                if (j2 == -4611686018427387904L) {
                    throw new IllegalStateException("Produced without request");
                }
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j3 = j2 - j;
                if (j3 < 0) {
                    throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + ")");
                }
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Producer
        public void request(long j) throws Throwable {
            long j2;
            long j3;
            if (j < 0) {
                return;
            }
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return;
                }
                if (j2 >= 0 && j == 0) {
                    return;
                }
                if (j2 == -4611686018427387904L) {
                    j3 = j;
                } else {
                    j3 = j2 + j;
                    if (j3 < 0) {
                        j3 = Long.MAX_VALUE;
                    }
                }
            } while (!compareAndSet(j2, j3));
            this.a.d();
        }

        @Override // rx.Subscription
        public void unsubscribe() throws Throwable {
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.a.f(this);
            this.a.d();
        }
    }

    public static final class d<T> extends Subscriber<T> implements Subscription {
        public static final c[] m = new c[0];
        public static final c[] n = new c[0];
        public final Queue<Object> f;
        public final AtomicReference<d<T>> g;
        public volatile Object h;
        public final AtomicReference<c[]> i;
        public final AtomicBoolean j;
        public boolean k;
        public boolean l;

        public class a implements Action0 {
            public a() {
            }

            @Override // rx.functions.Action0
            public void call() {
                d.this.i.getAndSet(d.n);
                d<T> dVar = d.this;
                dVar.g.compareAndSet(dVar, null);
            }
        }

        public d(AtomicReference<d<T>> atomicReference) {
            this.f = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(RxRingBuffer.SIZE) : new SpscAtomicArrayQueue<>(RxRingBuffer.SIZE);
            this.i = new AtomicReference<>(m);
            this.g = atomicReference;
            this.j = new AtomicBoolean();
        }

        public boolean b(c<T> cVar) {
            c[] cVarArr;
            c[] cVarArr2;
            Objects.requireNonNull(cVar);
            do {
                cVarArr = this.i.get();
                if (cVarArr == n) {
                    return false;
                }
                int length = cVarArr.length;
                cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
            } while (!this.i.compareAndSet(cVarArr, cVarArr2));
            return true;
        }

        public boolean c(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!NotificationLite.isCompleted(obj)) {
                    Throwable error = NotificationLite.getError(obj);
                    this.g.compareAndSet(this, null);
                    try {
                        c[] andSet = this.i.getAndSet(n);
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].b.onError(error);
                            i++;
                        }
                        unsubscribe();
                        return true;
                    } catch (Throwable th) {
                        unsubscribe();
                        throw th;
                    }
                }
                if (z) {
                    this.g.compareAndSet(this, null);
                    try {
                        c[] andSet2 = this.i.getAndSet(n);
                        int length2 = andSet2.length;
                        while (i < length2) {
                            andSet2[i].b.onCompleted();
                            i++;
                        }
                        unsubscribe();
                        return true;
                    } catch (Throwable th2) {
                        unsubscribe();
                        throw th2;
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x00de */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void d() throws Throwable {
            boolean z;
            long j;
            synchronized (this) {
                if (this.k) {
                    this.l = true;
                    return;
                }
                this.k = true;
                this.l = false;
                while (true) {
                    try {
                        Object obj = this.h;
                        boolean zIsEmpty = this.f.isEmpty();
                        if (c(obj, zIsEmpty)) {
                            return;
                        }
                        if (!zIsEmpty) {
                            c[] cVarArr = this.i.get();
                            int length = cVarArr.length;
                            long jMin = Long.MAX_VALUE;
                            int i = 0;
                            for (c cVar : cVarArr) {
                                long j2 = cVar.get();
                                if (j2 >= 0) {
                                    jMin = Math.min(jMin, j2);
                                } else if (j2 == Long.MIN_VALUE) {
                                    i++;
                                }
                            }
                            if (length != i) {
                                int i2 = 0;
                                while (true) {
                                    j = i2;
                                    if (j >= jMin) {
                                        break;
                                    }
                                    Object obj2 = this.h;
                                    Object objPoll = this.f.poll();
                                    boolean z2 = objPoll == null;
                                    if (c(obj2, z2)) {
                                        return;
                                    }
                                    if (z2) {
                                        zIsEmpty = z2;
                                        break;
                                    }
                                    Object value = NotificationLite.getValue(objPoll);
                                    for (c cVar2 : cVarArr) {
                                        if (cVar2.get() > 0) {
                                            try {
                                                cVar2.b.onNext(value);
                                                cVar2.a(1L);
                                            } catch (Throwable th) {
                                                cVar2.unsubscribe();
                                                Exceptions.throwOrReport(th, cVar2.b, value);
                                            }
                                        }
                                    }
                                    i2++;
                                    zIsEmpty = z2;
                                }
                                if (i2 > 0) {
                                    request(j);
                                }
                                if (jMin == 0 || zIsEmpty) {
                                }
                            } else if (c(this.h, this.f.poll() == null)) {
                                return;
                            } else {
                                request(1L);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (this.l) {
                                    this.l = false;
                                } else {
                                    this.k = false;
                                    try {
                                        return;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = true;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z = false;
                            }
                            while (true) {
                            }
                        }
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = false;
                    }
                    if (!z) {
                        synchronized (this) {
                            this.k = false;
                        }
                    }
                    throw th;
                }
            }
        }

        public void e() {
            add(Subscriptions.create(new a()));
        }

        public void f(c<T> cVar) {
            c[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = this.i.get();
                if (cVarArr == m || cVarArr == n) {
                    return;
                }
                int i = -1;
                int length = cVarArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (cVarArr[i2].equals(cVar)) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    cVarArr2 = m;
                } else {
                    c[] cVarArr3 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr3, 0, i);
                    System.arraycopy(cVarArr, i + 1, cVarArr3, i, (length - i) - 1);
                    cVarArr2 = cVarArr3;
                }
            } while (!this.i.compareAndSet(cVarArr, cVarArr2));
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            if (this.h == null) {
                this.h = NotificationLite.completed();
                d();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) throws Throwable {
            if (this.h == null) {
                this.h = NotificationLite.error(th);
                d();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) throws Throwable {
            if (this.f.offer(NotificationLite.next(t))) {
                d();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(RxRingBuffer.SIZE);
        }
    }

    private OperatorPublish(Observable.OnSubscribe<T> onSubscribe, Observable<? extends T> observable, AtomicReference<d<T>> atomicReference) {
        super(onSubscribe);
        this.b = observable;
        this.c = atomicReference;
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new a(atomicReference), observable, atomicReference);
    }

    @Override // rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        d<T> dVar;
        while (true) {
            dVar = this.c.get();
            if (dVar != null && !dVar.isUnsubscribed()) {
                break;
            }
            d<T> dVar2 = new d<>(this.c);
            dVar2.e();
            if (this.c.compareAndSet(dVar, dVar2)) {
                dVar = dVar2;
                break;
            }
        }
        boolean z = !dVar.j.get() && dVar.j.compareAndSet(false, true);
        action1.call(dVar);
        if (z) {
            this.b.unsafeSubscribe(dVar);
        }
    }

    public static <T, R> Observable<R> create(Observable<? extends T> observable, Func1<? super Observable<T>, ? extends Observable<R>> func1) {
        return create(observable, func1, false);
    }

    public static <T, R> Observable<R> create(Observable<? extends T> observable, Func1<? super Observable<T>, ? extends Observable<R>> func1, boolean z) {
        return Observable.unsafeCreate(new b(z, func1, observable));
    }
}

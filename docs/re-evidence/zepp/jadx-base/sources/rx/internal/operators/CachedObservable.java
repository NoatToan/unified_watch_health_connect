package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.internal.util.LinkedArrayList;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class CachedObservable<T> extends Observable<T> {
    private final a<T> b;

    public static final class a<T> extends LinkedArrayList implements Observer<T> {
        public static final c<?>[] k = new c[0];
        public final Observable<? extends T> f;
        public final SerialSubscription g;
        public volatile c<?>[] h;
        public volatile boolean i;
        public boolean j;

        /* JADX INFO: renamed from: rx.internal.operators.CachedObservable$a$a, reason: collision with other inner class name */
        public class C1227a extends Subscriber<T> {
            public C1227a() {
            }

            @Override // rx.Observer
            public void onCompleted() throws Throwable {
                a.this.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) throws Throwable {
                a.this.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) throws Throwable {
                a.this.onNext(t);
            }
        }

        public a(Observable<? extends T> observable, int i) {
            super(i);
            this.f = observable;
            this.h = k;
            this.g = new SerialSubscription();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b(c<T> cVar) {
            synchronized (this.g) {
                c<?>[] cVarArr = this.h;
                int length = cVarArr.length;
                c<?>[] cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
                this.h = cVarArr2;
            }
        }

        public void c() {
            C1227a c1227a = new C1227a();
            this.g.set(c1227a);
            this.f.unsafeSubscribe(c1227a);
            this.i = true;
        }

        public void d() throws Throwable {
            for (c<?> cVar : this.h) {
                cVar.b();
            }
        }

        public void e(c<T> cVar) {
            synchronized (this.g) {
                c<?>[] cVarArr = this.h;
                int length = cVarArr.length;
                int i = -1;
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
                    this.h = k;
                    return;
                }
                c<?>[] cVarArr2 = new c[length - 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, i);
                System.arraycopy(cVarArr, i + 1, cVarArr2, i, (length - i) - 1);
                this.h = cVarArr2;
            }
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            if (this.j) {
                return;
            }
            this.j = true;
            add(NotificationLite.completed());
            this.g.unsubscribe();
            d();
        }

        @Override // rx.Observer
        public void onError(Throwable th) throws Throwable {
            if (this.j) {
                return;
            }
            this.j = true;
            add(NotificationLite.error(th));
            this.g.unsubscribe();
            d();
        }

        @Override // rx.Observer
        public void onNext(T t) throws Throwable {
            if (this.j) {
                return;
            }
            add(NotificationLite.next(t));
            d();
        }
    }

    public static final class b<T> extends AtomicBoolean implements Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -2817751667698696782L;
        public final a<T> a;

        public b(a<T> aVar) {
            this.a = aVar;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            c<T> cVar = new c<>(subscriber, this.a);
            this.a.b(cVar);
            subscriber.add(cVar);
            subscriber.setProducer(cVar);
            if (get() || !compareAndSet(false, true)) {
                return;
            }
            this.a.c();
        }
    }

    public static final class c<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = -2557562030197141021L;
        public final Subscriber<? super T> a;
        public final a<T> b;
        public Object[] c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;

        public c(Subscriber<? super T> subscriber, a<T> aVar) {
            this.a = subscriber;
            this.b = aVar;
        }

        public long a(long j) {
            return addAndGet(-j);
        }

        /* JADX WARN: Code duplicated, block: B:87:0x00db  */
        /* JADX WARN: Code duplicated, block: B:98:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public void b() throws Throwable {
            boolean z;
            synchronized (this) {
                boolean z2 = true;
                if (this.f) {
                    this.g = true;
                    return;
                }
                this.f = true;
                try {
                    Subscriber<? super T> subscriber = this.a;
                    while (true) {
                        long j = get();
                        if (j < 0) {
                            return;
                        }
                        int size = this.b.size();
                        if (size != 0) {
                            Object[] objArrHead = this.c;
                            if (objArrHead == null) {
                                objArrHead = this.b.head();
                                this.c = objArrHead;
                            }
                            int length = objArrHead.length - 1;
                            int i = this.e;
                            int i2 = this.d;
                            try {
                                if (j == 0) {
                                    Object obj = objArrHead[i2];
                                    if (NotificationLite.isCompleted(obj)) {
                                        subscriber.onCompleted();
                                        unsubscribe();
                                        return;
                                    } else if (NotificationLite.isError(obj)) {
                                        subscriber.onError(NotificationLite.getError(obj));
                                        unsubscribe();
                                        return;
                                    }
                                } else if (j > 0) {
                                    int i3 = 0;
                                    while (i < size && j > 0) {
                                        if (subscriber.isUnsubscribed()) {
                                            return;
                                        }
                                        if (i2 == length) {
                                            objArrHead = (Object[]) objArrHead[length];
                                            i2 = 0;
                                        }
                                        Object obj2 = objArrHead[i2];
                                        try {
                                            if (NotificationLite.accept(subscriber, obj2)) {
                                                try {
                                                    unsubscribe();
                                                    return;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    z = true;
                                                    try {
                                                        Exceptions.throwIfFatal(th);
                                                        unsubscribe();
                                                        if (NotificationLite.isError(obj2) || NotificationLite.isCompleted(obj2)) {
                                                            return;
                                                        }
                                                        subscriber.onError(OnErrorThrowable.addValueAsLastCause(th, NotificationLite.getValue(obj2)));
                                                        return;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        if (!z) {
                                                            synchronized (this) {
                                                                this.f = false;
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            }
                                            i2++;
                                            i++;
                                            j--;
                                            i3++;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z = false;
                                        }
                                    }
                                    if (subscriber.isUnsubscribed()) {
                                        return;
                                    }
                                    this.e = i;
                                    this.d = i2;
                                    this.c = objArrHead;
                                    a(i3);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                z = true;
                            }
                        }
                        try {
                            synchronized (this) {
                                try {
                                    if (!this.g) {
                                        this.f = false;
                                        return;
                                    }
                                    this.g = false;
                                } catch (Throwable th5) {
                                    th = th5;
                                    z2 = false;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        try {
                            throw th;
                        } catch (Throwable th7) {
                            z = z2;
                            th = th7;
                            if (!z) {
                                synchronized (this) {
                                    this.f = false;
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    z = false;
                }
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // rx.Producer
        public void request(long j) throws Throwable {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 < 0) {
                    return;
                }
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j2, j3));
            b();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (get() < 0 || getAndSet(-1L) < 0) {
                return;
            }
            this.b.e(this);
        }
    }

    private CachedObservable(Observable.OnSubscribe<T> onSubscribe, a<T> aVar) {
        super(onSubscribe);
        this.b = aVar;
    }

    public static <T> CachedObservable<T> from(Observable<? extends T> observable) {
        return from(observable, 16);
    }

    public boolean c() {
        return this.b.i;
    }

    public boolean hasObservers() {
        return this.b.h.length != 0;
    }

    public static <T> CachedObservable<T> from(Observable<? extends T> observable, int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacityHint > 0 required");
        }
        a aVar = new a(observable, i);
        return new CachedObservable<>(new b(aVar), aVar);
    }
}

package rx.internal.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.functions.FuncN;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeCombineLatest<T, R> implements Observable.OnSubscribe<R> {
    public final Observable<? extends T>[] a;
    public final Iterable<? extends Observable<? extends T>> b;
    public final FuncN<? extends R> c;
    public final int d;
    public final boolean e;

    public static final class a<T, R> extends Subscriber<T> {
        public final b<T, R> f;
        public final int g;
        public boolean h;

        public a(b<T, R> bVar, int i) {
            this.f = bVar;
            this.g = i;
            request(bVar.d);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.h) {
                return;
            }
            this.h = true;
            this.f.c(null, this.g);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.h) {
                RxJavaHooks.onError(th);
                return;
            }
            this.f.f(th);
            this.h = true;
            this.f.c(null, this.g);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.h) {
                return;
            }
            this.f.c(NotificationLite.next(t), this.g);
        }

        public void requestMore(long j) {
            request(j);
        }
    }

    public static final class b<T, R> extends AtomicInteger implements Producer, Subscription {
        public static final Object n = new Object();
        private static final long serialVersionUID = 8567835998786448817L;
        public final Subscriber<? super R> a;
        public final FuncN<? extends R> b;
        public final a<T, R>[] c;
        public final int d;
        public final Object[] e;
        public final SpscLinkedArrayQueue<Object> f;
        public final boolean g;
        public volatile boolean h;
        public volatile boolean i;
        public final AtomicLong j;
        public final AtomicReference<Throwable> k;
        public int l;
        public int m;

        public b(Subscriber<? super R> subscriber, FuncN<? extends R> funcN, int i, int i2, boolean z) {
            this.a = subscriber;
            this.b = funcN;
            this.d = i2;
            this.g = z;
            Object[] objArr = new Object[i];
            this.e = objArr;
            Arrays.fill(objArr, n);
            this.c = new a[i];
            this.f = new SpscLinkedArrayQueue<>(i2);
            this.j = new AtomicLong();
            this.k = new AtomicReference<>();
        }

        public void a(Queue<?> queue) {
            queue.clear();
            for (a<T, R> aVar : this.c) {
                aVar.unsubscribe();
            }
        }

        public boolean b(boolean z, boolean z2, Subscriber<?> subscriber, Queue<?> queue, boolean z3) {
            if (this.h) {
                a(queue);
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.k.get();
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onCompleted();
                }
                return true;
            }
            Throwable th2 = this.k.get();
            if (th2 != null) {
                a(queue);
                subscriber.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        public void c(Object obj, int i) {
            boolean z;
            a<T, R> aVar = this.c[i];
            synchronized (this) {
                Object[] objArr = this.e;
                int length = objArr.length;
                Object obj2 = objArr[i];
                int i2 = this.l;
                Object obj3 = n;
                if (obj2 == obj3) {
                    i2++;
                    this.l = i2;
                }
                int i3 = this.m;
                if (obj == null) {
                    i3++;
                    this.m = i3;
                } else {
                    objArr[i] = NotificationLite.getValue(obj);
                }
                boolean z2 = false;
                z = i2 == length;
                if (i3 == length || (obj == null && obj2 == obj3)) {
                    z2 = true;
                }
                if (z2) {
                    this.i = true;
                } else if (obj != null && z) {
                    this.f.offer(aVar, this.e.clone());
                } else if (obj == null && this.k.get() != null && (obj2 == obj3 || !this.g)) {
                    this.i = true;
                }
            }
            if (z || obj == null) {
                e();
            } else {
                aVar.requestMore(1L);
            }
        }

        public void e() {
            long j;
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.f;
            Subscriber<? super R> subscriber = this.a;
            boolean z = this.g;
            AtomicLong atomicLong = this.j;
            int iAddAndGet = 1;
            while (!b(this.i, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue, z)) {
                long j2 = atomicLong.get();
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j = j3;
                        break;
                    }
                    boolean z2 = this.i;
                    a aVar = (a) spscLinkedArrayQueue.peek();
                    boolean z3 = aVar == null;
                    long j4 = j3;
                    if (b(z2, z3, subscriber, spscLinkedArrayQueue, z)) {
                        return;
                    }
                    if (z3) {
                        j = j4;
                        break;
                    }
                    spscLinkedArrayQueue.poll();
                    Object[] objArr = (Object[]) spscLinkedArrayQueue.poll();
                    if (objArr == null) {
                        this.h = true;
                        a(spscLinkedArrayQueue);
                        subscriber.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                        return;
                    }
                    try {
                        subscriber.onNext(this.b.call(objArr));
                        aVar.requestMore(1L);
                        j3 = j4 + 1;
                    } catch (Throwable th) {
                        this.h = true;
                        a(spscLinkedArrayQueue);
                        subscriber.onError(th);
                        return;
                    }
                }
                if (j != 0 && j2 != Long.MAX_VALUE) {
                    BackpressureUtils.produced(atomicLong, j);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public void f(Throwable th) {
            Throwable th2;
            Throwable compositeException;
            AtomicReference<Throwable> atomicReference = this.k;
            do {
                th2 = atomicReference.get();
                if (th2 == null) {
                    compositeException = th;
                } else if (th2 instanceof CompositeException) {
                    ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
                    arrayList.add(th);
                    compositeException = new CompositeException(arrayList);
                } else {
                    compositeException = new CompositeException(Arrays.asList(th2, th));
                }
            } while (!atomicReference.compareAndSet(th2, compositeException));
        }

        public void g(Observable<? extends T>[] observableArr) {
            a<T, R>[] aVarArr = this.c;
            int length = aVarArr.length;
            for (int i = 0; i < length; i++) {
                aVarArr[i] = new a<>(this, i);
            }
            lazySet(0);
            this.a.add(this);
            this.a.setProducer(this);
            for (int i2 = 0; i2 < length && !this.h; i2++) {
                observableArr[i2].subscribe((Subscriber<? super Object>) aVarArr[i2]);
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.h;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
            if (j != 0) {
                BackpressureUtils.getAndAddRequest(this.j, j);
                e();
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.h) {
                return;
            }
            this.h = true;
            if (getAndIncrement() == 0) {
                a(this.f);
            }
        }
    }

    public OnSubscribeCombineLatest(Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN) {
        this(null, iterable, funcN, RxRingBuffer.SIZE, false);
    }

    public OnSubscribeCombineLatest(Observable<? extends T>[] observableArr, Iterable<? extends Observable<? extends T>> iterable, FuncN<? extends R> funcN, int i, boolean z) {
        this.a = observableArr;
        this.b = iterable;
        this.c = funcN;
        this.d = i;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        int length;
        int i;
        Observable<? extends T>[] observableArr = this.a;
        if (observableArr == null) {
            Iterable<? extends Observable<? extends T>> iterable = this.b;
            if (iterable instanceof List) {
                List list = (List) iterable;
                observableArr = (Observable[]) list.toArray(new Observable[list.size()]);
                length = observableArr.length;
            } else {
                Observable<? extends T>[] observableArr2 = new Observable[8];
                int i2 = 0;
                for (Observable<? extends T> observable : iterable) {
                    if (i2 == observableArr2.length) {
                        Observable<? extends T>[] observableArr3 = new Observable[(i2 >> 2) + i2];
                        System.arraycopy(observableArr2, 0, observableArr3, 0, i2);
                        observableArr2 = observableArr3;
                    }
                    observableArr2[i2] = observable;
                    i2++;
                }
                observableArr = observableArr2;
                i = i2;
            }
            if (i == 0) {
                subscriber.onCompleted();
            } else {
                new b(subscriber, this.c, i, this.d, this.e).g(observableArr);
            }
        }
        length = observableArr.length;
        i = length;
        if (i == 0) {
            subscriber.onCompleted();
        } else {
            new b(subscriber, this.c, i, this.d, this.e).g(observableArr);
        }
    }
}

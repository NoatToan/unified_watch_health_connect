package rx.internal.operators;

import defpackage.a05;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.functions.Action0;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorSwitch<T> implements Observable.Operator<T, Observable<? extends T>> {
    public final boolean a;

    public static final class a {
        public static final OperatorSwitch<Object> a = new OperatorSwitch<>(false);
    }

    public static final class b {
        public static final OperatorSwitch<Object> a = new OperatorSwitch<>(true);
    }

    public static final class c<T> extends Subscriber<T> {
        private final long f;
        private final d<T> g;

        public c(long j, d<T> dVar) {
            this.f = j;
            this.g = dVar;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.g.e(this.f);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.h(th, this.f);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.g.g(t, this);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.g.j(producer, this.f);
        }
    }

    public static final class d<T> extends Subscriber<Observable<? extends T>> {
        public static final Throwable r = new Throwable("Terminal error");
        public final Subscriber<? super T> f;
        public final boolean h;
        public boolean k;
        public boolean l;
        public long m;
        public Producer n;
        public volatile boolean o;
        public Throwable p;
        public boolean q;
        public final SerialSubscription g = new SerialSubscription();
        public final AtomicLong i = new AtomicLong();
        public final SpscLinkedArrayQueue<Object> j = new SpscLinkedArrayQueue<>(RxRingBuffer.SIZE);

        public class a implements Action0 {
            public a() {
            }

            @Override // rx.functions.Action0
            public void call() {
                d.this.d();
            }
        }

        public class b implements Producer {
            public b() {
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j > 0) {
                    d.this.c(j);
                } else {
                    if (j >= 0) {
                        return;
                    }
                    throw new IllegalArgumentException("n >= 0 expected but it was " + j);
                }
            }
        }

        public d(Subscriber<? super T> subscriber, boolean z) {
            this.f = subscriber;
            this.h = z;
        }

        public boolean b(boolean z, boolean z2, Throwable th, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue, Subscriber<? super T> subscriber, boolean z3) {
            if (this.h) {
                if (!z || z2 || !z3) {
                    return false;
                }
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onCompleted();
                }
                return true;
            }
            if (th != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z || z2 || !z3) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        public void c(long j) {
            Producer producer;
            synchronized (this) {
                producer = this.n;
                this.m = BackpressureUtils.addCap(this.m, j);
            }
            if (producer != null) {
                producer.request(j);
            }
            f();
        }

        public void d() {
            synchronized (this) {
                this.n = null;
            }
        }

        public void e(long j) {
            synchronized (this) {
                if (this.i.get() != j) {
                    return;
                }
                this.q = false;
                this.n = null;
                f();
            }
        }

        public void f() {
            Throwable th;
            Throwable th2;
            synchronized (this) {
                if (this.k) {
                    this.l = true;
                    return;
                }
                this.k = true;
                boolean z = this.q;
                long j = this.m;
                Throwable th3 = this.p;
                if (th3 != null && th3 != (th2 = r) && !this.h) {
                    this.p = th2;
                }
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.j;
                AtomicLong atomicLong = this.i;
                Subscriber<? super T> subscriber = this.f;
                long j2 = j;
                Throwable th4 = th3;
                boolean z2 = this.o;
                while (true) {
                    long j3 = 0;
                    while (j3 != j2) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        boolean zIsEmpty = spscLinkedArrayQueue.isEmpty();
                        if (b(z2, z, th4, spscLinkedArrayQueue, subscriber, zIsEmpty)) {
                            return;
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        c cVar = (c) spscLinkedArrayQueue.poll();
                        a05 a05Var = (Object) NotificationLite.getValue(spscLinkedArrayQueue.poll());
                        if (atomicLong.get() == cVar.f) {
                            subscriber.onNext(a05Var);
                            j3++;
                        }
                    }
                    if (j3 == j2) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        if (b(this.o, z, th4, spscLinkedArrayQueue, subscriber, spscLinkedArrayQueue.isEmpty())) {
                            return;
                        }
                    }
                    synchronized (this) {
                        long j4 = this.m;
                        if (j4 != Long.MAX_VALUE) {
                            j4 -= j3;
                            this.m = j4;
                        }
                        j2 = j4;
                        if (!this.l) {
                            this.k = false;
                            return;
                        }
                        this.l = false;
                        z2 = this.o;
                        z = this.q;
                        th4 = this.p;
                        if (th4 != null && th4 != (th = r) && !this.h) {
                            this.p = th;
                        }
                    }
                }
            }
        }

        public void g(T t, c<T> cVar) {
            synchronized (this) {
                if (this.i.get() != ((c) cVar).f) {
                    return;
                }
                this.j.offer(cVar, NotificationLite.next(t));
                f();
            }
        }

        public void h(Throwable th, long j) {
            boolean zM;
            synchronized (this) {
                if (this.i.get() == j) {
                    zM = m(th);
                    this.q = false;
                    this.n = null;
                } else {
                    zM = true;
                }
            }
            if (zM) {
                f();
            } else {
                l(th);
            }
        }

        public void i() {
            this.f.add(this.g);
            this.f.add(Subscriptions.create(new a()));
            this.f.setProducer(new b());
        }

        public void j(Producer producer, long j) {
            synchronized (this) {
                if (this.i.get() != j) {
                    return;
                }
                long j2 = this.m;
                this.n = producer;
                producer.request(j2);
            }
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onNext(Observable<? extends T> observable) {
            c cVar;
            long jIncrementAndGet = this.i.incrementAndGet();
            Subscription subscription = this.g.get();
            if (subscription != null) {
                subscription.unsubscribe();
            }
            synchronized (this) {
                cVar = new c(jIncrementAndGet, this);
                this.q = true;
                this.n = null;
            }
            this.g.set(cVar);
            observable.unsafeSubscribe(cVar);
        }

        public void l(Throwable th) {
            RxJavaHooks.onError(th);
        }

        public boolean m(Throwable th) {
            Throwable th2 = this.p;
            if (th2 == r) {
                return false;
            }
            if (th2 == null) {
                this.p = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
                arrayList.add(th);
                this.p = new CompositeException(arrayList);
            } else {
                this.p = new CompositeException(th2, th);
            }
            return true;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.o = true;
            f();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            boolean zM;
            synchronized (this) {
                zM = m(th);
            }
            if (!zM) {
                l(th);
            } else {
                this.o = true;
                f();
            }
        }
    }

    public OperatorSwitch(boolean z) {
        this.a = z;
    }

    public static <T> OperatorSwitch<T> instance(boolean z) {
        return z ? (OperatorSwitch<T>) b.a : (OperatorSwitch<T>) a.a;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        d dVar = new d(subscriber, this.a);
        subscriber.add(dVar);
        dVar.i();
        return dVar;
    }
}

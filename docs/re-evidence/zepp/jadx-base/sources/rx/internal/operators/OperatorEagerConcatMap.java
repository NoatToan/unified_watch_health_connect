package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorEagerConcatMap<T, R> implements Observable.Operator<R, T> {
    public final Func1<? super T, ? extends Observable<? extends R>> a;
    public final int b;
    private final int c;

    public static final class a<T> extends Subscriber<T> {
        public final c<?, T> f;
        public final Queue<Object> g;
        public volatile boolean h;
        public Throwable i;

        public a(c<?, T> cVar, int i) {
            this.f = cVar;
            this.g = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new SpscAtomicArrayQueue<>(i);
            request(i);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.h = true;
            this.f.c();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.i = th;
            this.h = true;
            this.f.c();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.g.offer(NotificationLite.next(t));
            this.f.c();
        }

        public void requestMore(long j) {
            request(j);
        }
    }

    public static final class b extends AtomicLong implements Producer {
        private static final long serialVersionUID = -657299606803478389L;
        public final c<?, ?> a;

        public b(c<?, ?> cVar) {
            this.a = cVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalStateException("n >= 0 required but it was " + j);
            }
            if (j > 0) {
                BackpressureUtils.getAndAddRequest(this, j);
                this.a.c();
            }
        }
    }

    public static final class c<T, R> extends Subscriber<T> {
        public final Func1<? super T, ? extends Observable<? extends R>> f;
        public final int g;
        public final Subscriber<? super R> h;
        public volatile boolean j;
        public Throwable k;
        public volatile boolean l;
        private b n;
        public final Queue<a<R>> i = new LinkedList();
        public final AtomicInteger m = new AtomicInteger();

        public class a implements Action0 {
            public a() {
            }

            @Override // rx.functions.Action0
            public void call() {
                c.this.l = true;
                if (c.this.m.getAndIncrement() == 0) {
                    c.this.b();
                }
            }
        }

        public c(Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2, Subscriber<? super R> subscriber) {
            this.f = func1;
            this.g = i;
            this.h = subscriber;
            request(i2 == Integer.MAX_VALUE ? Long.MAX_VALUE : i2);
        }

        public void b() {
            ArrayList arrayList;
            synchronized (this.i) {
                arrayList = new ArrayList(this.i);
                this.i.clear();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Subscription) it2.next()).unsubscribe();
            }
        }

        /* JADX WARN: Code duplicated, block: B:47:0x007e  */
        public void c() {
            a<R> aVarPeek;
            int i;
            if (this.m.getAndIncrement() != 0) {
                return;
            }
            b bVar = this.n;
            Subscriber<? super R> subscriber = this.h;
            int iAddAndGet = 1;
            while (!this.l) {
                boolean z = this.j;
                synchronized (this.i) {
                    aVarPeek = this.i.peek();
                }
                boolean z2 = false;
                boolean z3 = aVarPeek == null;
                if (z) {
                    Throwable th = this.k;
                    if (th != null) {
                        b();
                        subscriber.onError(th);
                        return;
                    } else if (z3) {
                        subscriber.onCompleted();
                        return;
                    }
                }
                if (z3) {
                    i = iAddAndGet;
                } else {
                    long j = bVar.get();
                    Queue<Object> queue = aVarPeek.g;
                    long j2 = 0;
                    while (true) {
                        boolean z4 = aVarPeek.h;
                        Object objPeek = queue.peek();
                        i = iAddAndGet;
                        boolean z5 = objPeek == null;
                        if (!z4) {
                            if (!z5 || j == j2) {
                                break;
                            }
                            queue.poll();
                            try {
                                subscriber.onNext((Object) NotificationLite.getValue(objPeek));
                                j2++;
                                iAddAndGet = i;
                            } catch (Throwable th2) {
                                Exceptions.throwOrReport(th2, subscriber, objPeek);
                                return;
                            }
                        } else {
                            Throwable th3 = aVarPeek.i;
                            if (th3 != null) {
                                b();
                                subscriber.onError(th3);
                                return;
                            }
                            if (z5) {
                                synchronized (this.i) {
                                    this.i.poll();
                                }
                                aVarPeek.unsubscribe();
                                request(1L);
                                z2 = true;
                                break;
                            }
                            if (!z5) {
                                break;
                            }
                            queue.poll();
                            subscriber.onNext((Object) NotificationLite.getValue(objPeek));
                            j2++;
                            iAddAndGet = i;
                        }
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            BackpressureUtils.produced(bVar, j2);
                        }
                        if (!z2) {
                            aVarPeek.requestMore(j2);
                        }
                    }
                    if (z2) {
                        iAddAndGet = i;
                    }
                }
                iAddAndGet = this.m.addAndGet(-i);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            b();
        }

        public void d() {
            this.n = new b(this);
            add(Subscriptions.create(new a()));
            this.h.add(this);
            this.h.setProducer(this.n);
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.j = true;
            c();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.k = th;
            this.j = true;
            c();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                Observable<? extends R> observableCall = this.f.call(t);
                if (this.l) {
                    return;
                }
                a<R> aVar = new a<>(this, this.g);
                synchronized (this.i) {
                    if (this.l) {
                        return;
                    }
                    this.i.add(aVar);
                    if (this.l) {
                        return;
                    }
                    observableCall.unsafeSubscribe(aVar);
                    c();
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.h, t);
            }
        }
    }

    public OperatorEagerConcatMap(Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2) {
        this.a = func1;
        this.b = i;
        this.c = i2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        c cVar = new c(this.a, this.b, this.c, subscriber);
        cVar.d();
        return cVar;
    }
}

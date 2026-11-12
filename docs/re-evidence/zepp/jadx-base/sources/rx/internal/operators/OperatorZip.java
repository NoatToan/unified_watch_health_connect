package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;
import rx.functions.FuncN;
import rx.functions.Functions;
import rx.internal.util.RxRingBuffer;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorZip<R> implements Observable.Operator<R, Observable<?>[]> {
    public final FuncN<? extends R> a;

    public static final class a<R> extends AtomicLong {
        public static final int g = (int) (((double) RxRingBuffer.SIZE) * 0.7d);
        private static final long serialVersionUID = 5995274816189928317L;
        public final Observer<? super R> a;
        private final FuncN<? extends R> b;
        private final CompositeSubscription c;
        public int d;
        private volatile Object[] e;
        private AtomicLong f;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorZip$a$a, reason: collision with other inner class name */
        public final class C1255a extends Subscriber {
            public final RxRingBuffer f = RxRingBuffer.getSpmcInstance();

            public C1255a() {
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.f.onCompleted();
                a.this.b();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.a.onError(th);
            }

            @Override // rx.Observer
            public void onNext(Object obj) {
                try {
                    this.f.onNext(obj);
                } catch (MissingBackpressureException e) {
                    onError(e);
                }
                a.this.b();
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void onStart() {
                request(RxRingBuffer.SIZE);
            }

            public void requestMore(long j) {
                request(j);
            }
        }

        public a(Subscriber<? super R> subscriber, FuncN<? extends R> funcN) {
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.c = compositeSubscription;
            this.a = subscriber;
            this.b = funcN;
            subscriber.add(compositeSubscription);
        }

        public void a(Observable[] observableArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[observableArr.length];
            for (int i = 0; i < observableArr.length; i++) {
                C1255a c1255a = new C1255a();
                objArr[i] = c1255a;
                this.c.add(c1255a);
            }
            this.f = atomicLong;
            this.e = objArr;
            for (int i2 = 0; i2 < observableArr.length; i2++) {
                observableArr[i2].unsafeSubscribe((C1255a) objArr[i2]);
            }
        }

        public void b() {
            Object[] objArr = this.e;
            if (objArr == null || getAndIncrement() != 0) {
                return;
            }
            int length = objArr.length;
            Observer<? super R> observer = this.a;
            AtomicLong atomicLong = this.f;
            while (true) {
                Object[] objArr2 = new Object[length];
                boolean z = true;
                for (int i = 0; i < length; i++) {
                    RxRingBuffer rxRingBuffer = ((C1255a) objArr[i]).f;
                    Object objPeek = rxRingBuffer.peek();
                    if (objPeek == null) {
                        z = false;
                    } else {
                        if (rxRingBuffer.isCompleted(objPeek)) {
                            observer.onCompleted();
                            this.c.unsubscribe();
                            return;
                        }
                        objArr2[i] = rxRingBuffer.getValue(objPeek);
                    }
                }
                if (z && atomicLong.get() > 0) {
                    try {
                        observer.onNext(this.b.call(objArr2));
                        atomicLong.decrementAndGet();
                        this.d++;
                        for (Object obj : objArr) {
                            RxRingBuffer rxRingBuffer2 = ((C1255a) obj).f;
                            rxRingBuffer2.poll();
                            if (rxRingBuffer2.isCompleted(rxRingBuffer2.peek())) {
                                observer.onCompleted();
                                this.c.unsubscribe();
                                return;
                            }
                        }
                        if (this.d > g) {
                            for (Object obj2 : objArr) {
                                ((C1255a) obj2).requestMore(this.d);
                            }
                            this.d = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, observer, objArr2);
                        return;
                    }
                } else if (decrementAndGet() <= 0) {
                    return;
                }
            }
        }
    }

    public static final class b<R> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1216676403723546796L;
        public final a<R> a;

        public b(a<R> aVar) {
            this.a = aVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            BackpressureUtils.getAndAddRequest(this, j);
            this.a.b();
        }
    }

    public final class c extends Subscriber<Observable[]> {
        public final Subscriber<? super R> f;
        public final a<R> g;
        public final b<R> h;
        public boolean i;

        public c(Subscriber<? super R> subscriber, a<R> aVar, b<R> bVar) {
            this.f = subscriber;
            this.g = aVar;
            this.h = bVar;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Observable[] observableArr) {
            if (observableArr == null || observableArr.length == 0) {
                this.f.onCompleted();
            } else {
                this.i = true;
                this.g.a(observableArr, this.h);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.i) {
                return;
            }
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
        }
    }

    public OperatorZip(FuncN<? extends R> funcN) {
        this.a = funcN;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super Observable[]> call(Subscriber<? super R> subscriber) {
        a aVar = new a(subscriber, this.a);
        b bVar = new b(aVar);
        c cVar = new c(subscriber, aVar, bVar);
        subscriber.add(cVar);
        subscriber.setProducer(bVar);
        return cVar;
    }

    public OperatorZip(Func2 func2) {
        this.a = Functions.fromFunc(func2);
    }

    public OperatorZip(Func3 func3) {
        this.a = Functions.fromFunc(func3);
    }

    public OperatorZip(Func4 func4) {
        this.a = Functions.fromFunc(func4);
    }

    public OperatorZip(Func5 func5) {
        this.a = Functions.fromFunc(func5);
    }

    public OperatorZip(Func6 func6) {
        this.a = Functions.fromFunc(func6);
    }

    public OperatorZip(Func7 func7) {
        this.a = Functions.fromFunc(func7);
    }

    public OperatorZip(Func8 func8) {
        this.a = Functions.fromFunc(func8);
    }

    public OperatorZip(Func9 func9) {
        this.a = Functions.fromFunc(func9);
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableFlatMap<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {
    public final Function<? super T, ? extends ObservableSource<? extends U>> a;
    public final boolean b;
    public final int c;
    public final int d;

    public static final class a<T, U> extends AtomicReference<Disposable> implements Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        public final long a;
        public final b<T, U> b;
        public volatile boolean c;
        public volatile SimpleQueue<U> d;
        public int e;

        public a(b<T, U> bVar, long j) {
            this.a = j;
            this.b = bVar;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.c = true;
            this.b.e();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.b.h.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            b<T, U> bVar = this.b;
            if (!bVar.c) {
                bVar.c();
            }
            this.c = true;
            this.b.e();
        }

        @Override // io.reactivex.Observer
        public void onNext(U u) {
            if (this.e == 0) {
                this.b.i(u, this);
            } else {
                this.b.e();
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iRequestFusion = queueDisposable.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.e = iRequestFusion;
                    this.d = queueDisposable;
                    this.c = true;
                    this.b.e();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.e = iRequestFusion;
                    this.d = queueDisposable;
                }
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements Disposable, Observer<T> {
        public static final a<?, ?>[] q = new a[0];
        public static final a<?, ?>[] r = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;
        public final Observer<? super U> a;
        public final Function<? super T, ? extends ObservableSource<? extends U>> b;
        public final boolean c;
        public final int d;
        public final int e;
        public volatile SimplePlainQueue<U> f;
        public volatile boolean g;
        public final AtomicThrowable h = new AtomicThrowable();
        public volatile boolean i;
        public final AtomicReference<a<?, ?>[]> j;
        public Disposable k;
        public long l;
        public long m;
        public int n;
        public Queue<ObservableSource<? extends U>> o;
        public int p;

        public b(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
            this.a = observer;
            this.b = function;
            this.c = z;
            this.d = i;
            this.e = i2;
            if (i != Integer.MAX_VALUE) {
                this.o = new ArrayDeque(i);
            }
            this.j = new AtomicReference<>(q);
        }

        public boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.j.get();
                if (aVarArr == r) {
                    aVar.a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.j.compareAndSet(aVarArr, (a<?, ?>[]) aVarArr2));
            return true;
        }

        public boolean b() {
            if (this.i) {
                return true;
            }
            Throwable th = this.h.get();
            if (this.c || th == null) {
                return false;
            }
            c();
            Throwable thTerminate = this.h.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.a.onError(thTerminate);
            }
            return true;
        }

        public boolean c() {
            a<?, ?>[] andSet;
            this.k.dispose();
            a<?, ?>[] aVarArr = this.j.get();
            a<?, ?>[] aVarArr2 = r;
            if (aVarArr == aVarArr2 || (andSet = this.j.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.a();
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Throwable thTerminate;
            if (this.i) {
                return;
            }
            this.i = true;
            if (!c() || (thTerminate = this.h.terminate()) == null || thTerminate == ExceptionHelper.TERMINATED) {
                return;
            }
            RxJavaPlugins.onError(thTerminate);
        }

        public void e() {
            if (getAndIncrement() == 0) {
                f();
            }
        }

        /* JADX WARN: Code duplicated, block: B:120:0x00ea A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:133:0x00f2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:85:0x00f1 A[PHI: r4
          0x00f1: PHI (r4v10 int) = (r4v8 int), (r4v11 int) binds: [B:72:0x00d0, B:84:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        public void f() {
            int size;
            boolean z;
            Observer<? super U> observer = this.a;
            int iAddAndGet = 1;
            while (!b()) {
                SimplePlainQueue<U> simplePlainQueue = this.f;
                if (simplePlainQueue != null) {
                    while (!b()) {
                        U uPoll = simplePlainQueue.poll();
                        if (uPoll != null) {
                            observer.onNext(uPoll);
                        }
                    }
                    return;
                }
                boolean z2 = this.g;
                SimplePlainQueue<U> simplePlainQueue2 = this.f;
                a<?, ?>[] aVarArr = this.j.get();
                int length = aVarArr.length;
                int i = 0;
                if (this.d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        size = this.o.size();
                    }
                } else {
                    size = 0;
                }
                if (z2 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && size == 0)) {
                    Throwable thTerminate = this.h.terminate();
                    if (thTerminate != ExceptionHelper.TERMINATED) {
                        if (thTerminate == null) {
                            observer.onComplete();
                            return;
                        } else {
                            observer.onError(thTerminate);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j = this.m;
                    int i2 = this.n;
                    if (length <= i2 || aVarArr[i2].a != j) {
                        if (length <= i2) {
                            i2 = 0;
                        }
                        for (int i3 = 0; i3 < length && aVarArr[i2].a != j; i3++) {
                            i2++;
                            if (i2 == length) {
                                i2 = 0;
                            }
                        }
                        this.n = i2;
                        this.m = aVarArr[i2].a;
                    }
                    int i4 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        if (b()) {
                            return;
                        }
                        a<T, U> aVar = aVarArr[i2];
                        SimpleQueue<U> simpleQueue = aVar.d;
                        if (simpleQueue != null) {
                            do {
                                try {
                                    U uPoll2 = simpleQueue.poll();
                                    if (uPoll2 == null) {
                                        z = aVar.c;
                                        SimpleQueue<U> simpleQueue2 = aVar.d;
                                        if (z && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                            g(aVar);
                                            if (b()) {
                                                return;
                                            } else {
                                                i4++;
                                            }
                                        }
                                        i2++;
                                        if (i2 == length) {
                                            i2 = 0;
                                        }
                                    } else {
                                        observer.onNext(uPoll2);
                                    }
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    aVar.a();
                                    this.h.addThrowable(th);
                                    if (b()) {
                                        return;
                                    }
                                    g(aVar);
                                    i4++;
                                    i2++;
                                    if (i2 == length) {
                                    }
                                }
                            } while (!b());
                            return;
                        }
                        z = aVar.c;
                        SimpleQueue<U> simpleQueue3 = aVar.d;
                        if (z) {
                            g(aVar);
                            if (b()) {
                                return;
                            } else {
                                i4++;
                            }
                        }
                        i2++;
                        if (i2 == length) {
                            i2 = 0;
                        }
                    }
                    this.n = i2;
                    this.m = aVarArr[i2].a;
                    i = i4;
                }
                if (i == 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (this.d != Integer.MAX_VALUE) {
                    while (true) {
                        int i6 = i - 1;
                        if (i != 0) {
                            synchronized (this) {
                                ObservableSource<? extends U> observableSourcePoll = this.o.poll();
                                if (observableSourcePoll == null) {
                                    this.p--;
                                } else {
                                    h(observableSourcePoll);
                                }
                            }
                            i = i6;
                        }
                    }
                } else {
                    continue;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.j.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = q;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                    System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!this.j.compareAndSet(aVarArr, aVarArr2));
        }

        public void h(ObservableSource<? extends U> observableSource) {
            ObservableSource<? extends U> observableSourcePoll;
            while (observableSource instanceof Callable) {
                if (!j((Callable) observableSource) || this.d == Integer.MAX_VALUE) {
                    return;
                }
                boolean z = false;
                synchronized (this) {
                    observableSourcePoll = this.o.poll();
                    if (observableSourcePoll == null) {
                        this.p--;
                        z = true;
                    }
                }
                if (z) {
                    e();
                    return;
                }
                observableSource = observableSourcePoll;
            }
            long j = this.l;
            this.l = 1 + j;
            a<T, U> aVar = new a<>(this, j);
            if (a(aVar)) {
                observableSource.subscribe(aVar);
            }
        }

        public void i(U u, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.a.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue spscLinkedArrayQueue = aVar.d;
                if (spscLinkedArrayQueue == null) {
                    spscLinkedArrayQueue = new SpscLinkedArrayQueue(this.e);
                    aVar.d = spscLinkedArrayQueue;
                }
                spscLinkedArrayQueue.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            f();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.i;
        }

        public boolean j(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.a.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    SimplePlainQueue<U> spscLinkedArrayQueue = this.f;
                    if (spscLinkedArrayQueue == null) {
                        spscLinkedArrayQueue = this.d == Integer.MAX_VALUE ? new SpscLinkedArrayQueue<>(this.e) : new SpscArrayQueue<>(this.d);
                        this.f = spscLinkedArrayQueue;
                    }
                    if (!spscLinkedArrayQueue.offer(uCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                f();
                return true;
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.h.addThrowable(th);
                e();
                return true;
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            e();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.onError(th);
            } else if (!this.h.addThrowable(th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.g = true;
                e();
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.g) {
                return;
            }
            try {
                ObservableSource<? extends U> observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.b.apply(t), "The mapper returned a null ObservableSource");
                if (this.d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i = this.p;
                        if (i == this.d) {
                            this.o.offer(observableSource);
                            return;
                        }
                        this.p = i + 1;
                    }
                }
                h(observableSource);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.k.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.k, disposable)) {
                this.k = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
        super(observableSource);
        this.a = function;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.a)) {
            return;
        }
        this.source.subscribe(new b(observer, this.a, this.b, this.c, this.d));
    }
}

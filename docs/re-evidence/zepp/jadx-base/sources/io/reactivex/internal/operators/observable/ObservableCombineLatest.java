package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableCombineLatest<T, R> extends Observable<R> {
    public final ObservableSource<? extends T>[] a;
    public final Iterable<? extends ObservableSource<? extends T>> b;
    public final Function<? super Object[], ? extends R> c;
    public final int d;
    public final boolean e;

    public static final class a<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        public final b<T, R> a;
        public final int b;

        public a(b<T, R> bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.a.e(this.b);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.a.f(this.b, th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.a.g(this.b, t);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public static final class b<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        public final Observer<? super R> a;
        public final Function<? super Object[], ? extends R> b;
        public final a<T, R>[] c;
        public Object[] d;
        public final SpscLinkedArrayQueue<Object[]> e;
        public final boolean f;
        public volatile boolean g;
        public volatile boolean h;
        public final AtomicThrowable i = new AtomicThrowable();
        public int j;
        public int k;

        public b(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.a = observer;
            this.b = function;
            this.f = z;
            this.d = new Object[i];
            a<T, R>[] aVarArr = new a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new a<>(this, i3);
            }
            this.c = aVarArr;
            this.e = new SpscLinkedArrayQueue<>(i2);
        }

        public void a() {
            for (a<T, R> aVar : this.c) {
                aVar.a();
            }
        }

        public void b(SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            synchronized (this) {
                this.d = null;
            }
            spscLinkedArrayQueue.clear();
        }

        public void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object[]> spscLinkedArrayQueue = this.e;
            Observer<? super R> observer = this.a;
            boolean z = this.f;
            int iAddAndGet = 1;
            while (!this.g) {
                if (!z && this.i.get() != null) {
                    a();
                    b(spscLinkedArrayQueue);
                    observer.onError(this.i.terminate());
                    return;
                }
                boolean z2 = this.h;
                Object[] objArrPoll = spscLinkedArrayQueue.poll();
                boolean z3 = objArrPoll == null;
                if (z2 && z3) {
                    b(spscLinkedArrayQueue);
                    Throwable thTerminate = this.i.terminate();
                    if (thTerminate == null) {
                        observer.onComplete();
                        return;
                    } else {
                        observer.onError(thTerminate);
                        return;
                    }
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        observer.onNext((Object) ObjectHelper.requireNonNull(this.b.apply(objArrPoll), "The combiner returned a null value"));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.i.addThrowable(th);
                        a();
                        b(spscLinkedArrayQueue);
                        observer.onError(this.i.terminate());
                        return;
                    }
                }
            }
            b(spscLinkedArrayQueue);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.g) {
                return;
            }
            this.g = true;
            a();
            if (getAndIncrement() == 0) {
                b(this.e);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0019 A[Catch: all -> 0x0025, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0007, B:12:0x0011, B:15:0x001b, B:14:0x0019), top: B:23:0x0001 }] */
        public void e(int i) {
            synchronized (this) {
                Object[] objArr = this.d;
                if (objArr == null) {
                    return;
                }
                boolean z = objArr[i] == null;
                if (z) {
                    this.h = true;
                } else {
                    int i2 = this.k + 1;
                    this.k = i2;
                    if (i2 == objArr.length) {
                        this.h = true;
                    }
                }
                if (z) {
                    a();
                }
                c();
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0025 A[Catch: all -> 0x002a, TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0012, B:11:0x0014, B:16:0x001d, B:19:0x0027, B:18:0x0025), top: B:29:0x000e }] */
        public void f(int i, Throwable th) {
            if (!this.i.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            boolean z = true;
            if (this.f) {
                synchronized (this) {
                    Object[] objArr = this.d;
                    if (objArr == null) {
                        return;
                    }
                    boolean z2 = objArr[i] == null;
                    if (z2) {
                        this.h = true;
                    } else {
                        int i2 = this.k + 1;
                        this.k = i2;
                        if (i2 == objArr.length) {
                            this.h = true;
                        }
                    }
                    z = z2;
                }
            }
            if (z) {
                a();
            }
            c();
        }

        public void g(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.d;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i];
                int i2 = this.j;
                if (obj == null) {
                    i2++;
                    this.j = i2;
                }
                objArr[i] = t;
                if (i2 == objArr.length) {
                    this.e.offer((Object[]) objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c();
                }
            }
        }

        public void h(ObservableSource<? extends T>[] observableSourceArr) {
            a<T, R>[] aVarArr = this.c;
            int length = aVarArr.length;
            this.a.onSubscribe(this);
            for (int i = 0; i < length && !this.h && !this.g; i++) {
                observableSourceArr[i].subscribe(aVarArr[i]);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.g;
        }
    }

    public ObservableCombineLatest(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.a = observableSourceArr;
        this.b = iterable;
        this.c = function;
        this.d = i;
        this.e = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.a;
        if (observableSourceArr == null) {
            observableSourceArr = new Observable[8];
            length = 0;
            for (ObservableSource<? extends T> observableSource : this.b) {
                if (length == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                    observableSourceArr = observableSourceArr2;
                }
                observableSourceArr[length] = observableSource;
                length++;
            }
        } else {
            length = observableSourceArr.length;
        }
        int i = length;
        if (i == 0) {
            EmptyDisposable.complete(observer);
        } else {
            new b(observer, this.c, i, this.d, this.e).h(observableSourceArr);
        }
    }
}

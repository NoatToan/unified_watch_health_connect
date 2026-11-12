package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableCache<T> extends io.reactivex.internal.operators.observable.a<T, T> implements Observer<T> {
    public static final a[] j = new a[0];
    public static final a[] k = new a[0];
    public final AtomicBoolean a;
    public final int b;
    public final AtomicReference<a<T>[]> c;
    public volatile long d;
    public final b<T> e;
    public b<T> f;
    public int g;
    public Throwable h;
    public volatile boolean i;

    public static final class a<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 6770240836423125754L;
        public final Observer<? super T> a;
        public final ObservableCache<T> b;
        public b<T> c;
        public int d;
        public long e;
        public volatile boolean f;

        public a(Observer<? super T> observer, ObservableCache<T> observableCache) {
            this.a = observer;
            this.b = observableCache;
            this.c = observableCache.e;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.b.g(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f;
        }
    }

    public static final class b<T> {
        public final T[] a;
        public volatile b<T> b;

        public b(int i) {
            this.a = (T[]) new Object[i];
        }
    }

    public ObservableCache(Observable<T> observable, int i) {
        super(observable);
        this.b = i;
        this.a = new AtomicBoolean();
        b<T> bVar = new b<>(i);
        this.e = bVar;
        this.f = bVar;
        this.c = new AtomicReference<>(j);
    }

    public void d(a<T> aVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        do {
            aVarArr = this.c.get();
            if (aVarArr == k) {
                return;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.c.compareAndSet(aVarArr, aVarArr2));
    }

    public long e() {
        return this.d;
    }

    public boolean f() {
        return this.a.get();
    }

    public void g(a<T> aVar) {
        a<T>[] aVarArr;
        a<T>[] aVarArr2;
        do {
            aVarArr = this.c.get();
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
                aVarArr2 = j;
            } else {
                a<T>[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!this.c.compareAndSet(aVarArr, aVarArr2));
    }

    public void h(a<T> aVar) {
        if (aVar.getAndIncrement() != 0) {
            return;
        }
        long j2 = aVar.e;
        int i = aVar.d;
        b<T> bVar = aVar.c;
        Observer<? super T> observer = aVar.a;
        int i2 = this.b;
        int iAddAndGet = 1;
        while (!aVar.f) {
            boolean z = this.i;
            boolean z2 = this.d == j2;
            if (z && z2) {
                aVar.c = null;
                Throwable th = this.h;
                if (th != null) {
                    observer.onError(th);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            if (z2) {
                aVar.e = j2;
                aVar.d = i;
                aVar.c = bVar;
                iAddAndGet = aVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i == i2) {
                    bVar = bVar.b;
                    i = 0;
                }
                observer.onNext(bVar.a[i]);
                i++;
                j2++;
            }
        }
        aVar.c = null;
    }

    public boolean hasObservers() {
        return this.c.get().length != 0;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.i = true;
        for (a<T> aVar : this.c.getAndSet(k)) {
            h(aVar);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        this.h = th;
        this.i = true;
        for (a<T> aVar : this.c.getAndSet(k)) {
            h(aVar);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        int i = this.g;
        if (i == this.b) {
            b<T> bVar = new b<>(i);
            bVar.a[0] = t;
            this.g = 1;
            this.f.b = bVar;
            this.f = bVar;
        } else {
            this.f.a[i] = t;
            this.g = i + 1;
        }
        this.d++;
        for (a<T> aVar : this.c.get()) {
            h(aVar);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a<T> aVar = new a<>(observer, this);
        observer.onSubscribe(aVar);
        d(aVar);
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            h(aVar);
        } else {
            this.source.subscribe(this);
        }
    }
}

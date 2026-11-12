package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableAmb<T> extends Observable<T> {
    public final ObservableSource<? extends T>[] a;
    public final Iterable<? extends ObservableSource<? extends T>> b;

    public static final class a<T> implements Disposable {
        public final Observer<? super T> a;
        public final b<T>[] b;
        public final AtomicInteger c = new AtomicInteger();

        public a(Observer<? super T> observer, int i) {
            this.a = observer;
            this.b = new b[i];
        }

        public void a(ObservableSource<? extends T>[] observableSourceArr) {
            b<T>[] bVarArr = this.b;
            int length = bVarArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bVarArr[i] = new b<>(this, i2, this.a);
                i = i2;
            }
            this.c.lazySet(0);
            this.a.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.c.get() == 0; i3++) {
                observableSourceArr[i3].subscribe(bVarArr[i3]);
            }
        }

        public boolean b(int i) {
            int i2 = this.c.get();
            int i3 = 0;
            if (i2 != 0) {
                return i2 == i;
            }
            if (!this.c.compareAndSet(0, i)) {
                return false;
            }
            b<T>[] bVarArr = this.b;
            int length = bVarArr.length;
            while (i3 < length) {
                int i4 = i3 + 1;
                if (i4 != i) {
                    bVarArr[i3].a();
                }
                i3 = i4;
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.c.get() != -1) {
                this.c.lazySet(-1);
                for (b<T> bVar : this.b) {
                    bVar.a();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.c.get() == -1;
        }
    }

    public static final class b<T> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        public final a<T> a;
        public final int b;
        public final Observer<? super T> c;
        public boolean d;

        public b(a<T> aVar, int i, Observer<? super T> observer) {
            this.a = aVar;
            this.b = i;
            this.c = observer;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.d) {
                this.c.onComplete();
            } else if (this.a.b(this.b)) {
                this.d = true;
                this.c.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.d) {
                this.c.onError(th);
            } else if (!this.a.b(this.b)) {
                RxJavaPlugins.onError(th);
            } else {
                this.d = true;
                this.c.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.d) {
                this.c.onNext(t);
            } else if (!this.a.b(this.b)) {
                get().dispose();
            } else {
                this.d = true;
                this.c.onNext(t);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableAmb(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable) {
        this.a = observableSourceArr;
        this.b = iterable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.a;
        if (observableSourceArr == null) {
            observableSourceArr = new Observable[8];
            try {
                length = 0;
                for (ObservableSource<? extends T> observableSource : this.b) {
                    if (observableSource == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), observer);
                        return;
                    }
                    if (length == observableSourceArr.length) {
                        ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                        System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                        observableSourceArr = observableSourceArr2;
                    }
                    int i = length + 1;
                    observableSourceArr[length] = observableSource;
                    length = i;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptyDisposable.error(th, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(observer);
        } else if (length == 1) {
            observableSourceArr[0].subscribe(observer);
        } else {
            new a(observer, length).a(observableSourceArr);
        }
    }
}

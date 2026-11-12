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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableZip<T, R> extends Observable<R> {
    public final ObservableSource<? extends T>[] a;
    public final Iterable<? extends ObservableSource<? extends T>> b;
    public final Function<? super Object[], ? extends R> c;
    public final int d;
    public final boolean e;

    public static final class a<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2983708048395377667L;
        public final Observer<? super R> a;
        public final Function<? super Object[], ? extends R> b;
        public final b<T, R>[] c;
        public final T[] d;
        public final boolean e;
        public volatile boolean f;

        public a(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i, boolean z) {
            this.a = observer;
            this.b = function;
            this.c = new b[i];
            this.d = (T[]) new Object[i];
            this.e = z;
        }

        public void a() {
            e();
            b();
        }

        public void b() {
            for (b<T, R> bVar : this.c) {
                bVar.a();
            }
        }

        public boolean c(boolean z, boolean z2, Observer<? super R> observer, boolean z3, b<?, ?> bVar) {
            if (this.f) {
                a();
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = bVar.d;
                a();
                if (th != null) {
                    observer.onError(th);
                } else {
                    observer.onComplete();
                }
                return true;
            }
            Throwable th2 = bVar.d;
            if (th2 != null) {
                a();
                observer.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            a();
            observer.onComplete();
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.f) {
                return;
            }
            this.f = true;
            b();
            if (getAndIncrement() == 0) {
                e();
            }
        }

        public void e() {
            for (b<T, R> bVar : this.c) {
                bVar.b.clear();
            }
        }

        public void f() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T, R>[] bVarArr = this.c;
            Observer<? super R> observer = this.a;
            T[] tArr = this.d;
            boolean z = this.e;
            int iAddAndGet = 1;
            while (true) {
                int i = 0;
                int i2 = 0;
                for (b<T, R> bVar : bVarArr) {
                    if (tArr[i2] == null) {
                        boolean z2 = bVar.c;
                        T tPoll = bVar.b.poll();
                        boolean z3 = tPoll == null;
                        if (c(z2, z3, observer, z, bVar)) {
                            return;
                        }
                        if (z3) {
                            i++;
                        } else {
                            tArr[i2] = tPoll;
                        }
                    } else if (bVar.c && !z && (th = bVar.d) != null) {
                        a();
                        observer.onError(th);
                        return;
                    }
                    i2++;
                }
                if (i != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        observer.onNext((Object) ObjectHelper.requireNonNull(this.b.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        a();
                        observer.onError(th2);
                        return;
                    }
                }
            }
        }

        public void g(ObservableSource<? extends T>[] observableSourceArr, int i) {
            b<T, R>[] bVarArr = this.c;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new b<>(this, i);
            }
            lazySet(0);
            this.a.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.f; i3++) {
                observableSourceArr[i3].subscribe(bVarArr[i3]);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f;
        }
    }

    public static final class b<T, R> implements Observer<T> {
        public final a<T, R> a;
        public final SpscLinkedArrayQueue<T> b;
        public volatile boolean c;
        public Throwable d;
        public final AtomicReference<Disposable> e = new AtomicReference<>();

        public b(a<T, R> aVar, int i) {
            this.a = aVar;
            this.b = new SpscLinkedArrayQueue<>(i);
        }

        public void a() {
            DisposableHelper.dispose(this.e);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.c = true;
            this.a.f();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.d = th;
            this.c = true;
            this.a.f();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.b.offer(t);
            this.a.f();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.e, disposable);
        }
    }

    public ObservableZip(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
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
        if (length == 0) {
            EmptyDisposable.complete(observer);
        } else {
            new a(observer, this.c, length, this.e).g(observableSourceArr, this.d);
        }
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableSampleWithObservable<T> extends io.reactivex.internal.operators.observable.a<T, T> {
    public final ObservableSource<?> a;
    public final boolean b;

    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        public final AtomicInteger e;
        public volatile boolean f;

        public a(Observer<? super T> observer, ObservableSource<?> observableSource) {
            super(observer, observableSource);
            this.e = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.c
        public void b() {
            this.f = true;
            if (this.e.getAndIncrement() == 0) {
                e();
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.c
        public void c() {
            this.f = true;
            if (this.e.getAndIncrement() == 0) {
                e();
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.c
        public void g() {
            if (this.e.getAndIncrement() == 0) {
                do {
                    boolean z = this.f;
                    e();
                    if (z) {
                        this.a.onComplete();
                        return;
                    }
                } while (this.e.decrementAndGet() != 0);
            }
        }
    }

    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public b(Observer<? super T> observer, ObservableSource<?> observableSource) {
            super(observer, observableSource);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.c
        public void b() {
            this.a.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.c
        public void c() {
            this.a.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.c
        public void g() {
            e();
        }
    }

    public static abstract class c<T> extends AtomicReference<T> implements Observer<T>, Disposable {
        private static final long serialVersionUID = -3517602651313910099L;
        public final Observer<? super T> a;
        public final ObservableSource<?> b;
        public final AtomicReference<Disposable> c = new AtomicReference<>();
        public Disposable d;

        public c(Observer<? super T> observer, ObservableSource<?> observableSource) {
            this.a = observer;
            this.b = observableSource;
        }

        public void a() {
            this.d.dispose();
            c();
        }

        public abstract void b();

        public abstract void c();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.c);
            this.d.dispose();
        }

        public void e() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.a.onNext(andSet);
            }
        }

        public void f(Throwable th) {
            this.d.dispose();
            this.a.onError(th);
        }

        public abstract void g();

        public boolean h(Disposable disposable) {
            return DisposableHelper.setOnce(this.c, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.c.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            DisposableHelper.dispose(this.c);
            b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.c);
            this.a.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
                if (this.c.get() == null) {
                    this.b.subscribe(new d(this));
                }
            }
        }
    }

    public static final class d<T> implements Observer<Object> {
        public final c<T> a;

        public d(c<T> cVar) {
            this.a = cVar;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.a.a();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.a.f(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.a.g();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.a.h(disposable);
        }
    }

    public ObservableSampleWithObservable(ObservableSource<T> observableSource, ObservableSource<?> observableSource2, boolean z) {
        super(observableSource);
        this.a = observableSource2;
        this.b = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        if (this.b) {
            this.source.subscribe(new a(serializedObserver, this.a));
        } else {
            this.source.subscribe(new b(serializedObserver, this.a));
        }
    }
}

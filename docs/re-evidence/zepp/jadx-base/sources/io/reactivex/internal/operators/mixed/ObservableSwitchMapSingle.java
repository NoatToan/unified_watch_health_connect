package io.reactivex.internal.operators.mixed;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableSwitchMapSingle<T, R> extends Observable<R> {
    public final Observable<T> a;
    public final Function<? super T, ? extends SingleSource<? extends R>> b;
    public final boolean c;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public static final C1130a<Object> i = new C1130a<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        public final Observer<? super R> a;
        public final Function<? super T, ? extends SingleSource<? extends R>> b;
        public final boolean c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final AtomicReference<C1130a<R>> e = new AtomicReference<>();
        public Disposable f;
        public volatile boolean g;
        public volatile boolean h;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$a$a, reason: collision with other inner class name */
        public static final class C1130a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            public final a<?, R> a;
            public volatile R b;

            public C1130a(a<?, R> aVar) {
                this.a = aVar;
            }

            public void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.a.c(this, th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                this.b = r;
                this.a.b();
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.a = observer;
            this.b = function;
            this.c = z;
        }

        public void a() {
            AtomicReference<C1130a<R>> atomicReference = this.e;
            C1130a<Object> c1130a = i;
            C1130a<R> andSet = atomicReference.getAndSet((C1130a<R>) c1130a);
            if (andSet == null || andSet == c1130a) {
                return;
            }
            andSet.a();
        }

        public void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.a;
            AtomicThrowable atomicThrowable = this.d;
            AtomicReference<C1130a<R>> atomicReference = this.e;
            int iAddAndGet = 1;
            while (!this.h) {
                if (atomicThrowable.get() != null && !this.c) {
                    observer.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.g;
                C1130a<R> c1130a = atomicReference.get();
                boolean z2 = c1130a == null;
                if (z && z2) {
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate != null) {
                        observer.onError(thTerminate);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z2 || c1130a.b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    atomicReference.compareAndSet(c1130a, null);
                    observer.onNext(c1130a.b);
                }
            }
        }

        public void c(C1130a<R> c1130a, Throwable th) {
            if (!this.e.compareAndSet(c1130a, null) || !this.d.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.c) {
                this.f.dispose();
                a();
            }
            b();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.h = true;
            this.f.dispose();
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.h;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.g = true;
            b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.d.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.c) {
                a();
            }
            this.g = true;
            b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            C1130a<R> c1130a;
            C1130a<R> c1130a2 = this.e.get();
            if (c1130a2 != null) {
                c1130a2.a();
            }
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.b.apply(t), "The mapper returned a null SingleSource");
                C1130a<R> c1130a3 = new C1130a<>(this);
                do {
                    c1130a = this.e.get();
                    if (c1130a == i) {
                        return;
                    }
                } while (!this.e.compareAndSet(c1130a, c1130a3));
                singleSource.subscribe(c1130a3);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.f.dispose();
                this.e.getAndSet((C1130a<R>) i);
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f, disposable)) {
                this.f = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapSingle(Observable<T> observable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        this.a = observable;
        this.b = function;
        this.c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (io.reactivex.internal.operators.mixed.a.c(this.a, this.b, observer)) {
            return;
        }
        this.a.subscribe(new a(observer, this.b, this.c));
    }
}

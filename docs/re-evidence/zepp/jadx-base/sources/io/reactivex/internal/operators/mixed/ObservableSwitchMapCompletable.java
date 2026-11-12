package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableSwitchMapCompletable<T> extends Completable {
    public final Observable<T> a;
    public final Function<? super T, ? extends CompletableSource> b;
    public final boolean c;

    public static final class a<T> implements Observer<T>, Disposable {
        public static final C1128a h = new C1128a(null);
        public final CompletableObserver a;
        public final Function<? super T, ? extends CompletableSource> b;
        public final boolean c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final AtomicReference<C1128a> e = new AtomicReference<>();
        public volatile boolean f;
        public Disposable g;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable$a$a, reason: collision with other inner class name */
        public static final class C1128a extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -8003404460084760287L;
            public final a<?> a;

            public C1128a(a<?> aVar) {
                this.a = aVar;
            }

            public void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.a.b(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                this.a.c(this, th);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.a = completableObserver;
            this.b = function;
            this.c = z;
        }

        public void a() {
            AtomicReference<C1128a> atomicReference = this.e;
            C1128a c1128a = h;
            C1128a andSet = atomicReference.getAndSet(c1128a);
            if (andSet == null || andSet == c1128a) {
                return;
            }
            andSet.a();
        }

        public void b(C1128a c1128a) {
            if (this.e.compareAndSet(c1128a, null) && this.f) {
                Throwable thTerminate = this.d.terminate();
                if (thTerminate == null) {
                    this.a.onComplete();
                } else {
                    this.a.onError(thTerminate);
                }
            }
        }

        public void c(C1128a c1128a, Throwable th) {
            if (!this.e.compareAndSet(c1128a, null) || !this.d.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.c) {
                if (this.f) {
                    this.a.onError(this.d.terminate());
                    return;
                }
                return;
            }
            dispose();
            Throwable thTerminate = this.d.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.a.onError(thTerminate);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.g.dispose();
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.e.get() == h;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f = true;
            if (this.e.get() == null) {
                Throwable thTerminate = this.d.terminate();
                if (thTerminate == null) {
                    this.a.onComplete();
                } else {
                    this.a.onError(thTerminate);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.d.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.c) {
                onComplete();
                return;
            }
            a();
            Throwable thTerminate = this.d.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.a.onError(thTerminate);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            C1128a c1128a;
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.b.apply(t), "The mapper returned a null CompletableSource");
                C1128a c1128a2 = new C1128a(this);
                do {
                    c1128a = this.e.get();
                    if (c1128a == h) {
                        return;
                    }
                } while (!this.e.compareAndSet(c1128a, c1128a2));
                if (c1128a != null) {
                    c1128a.a();
                }
                completableSource.subscribe(c1128a2);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.g.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.g, disposable)) {
                this.g = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapCompletable(Observable<T> observable, Function<? super T, ? extends CompletableSource> function, boolean z) {
        this.a = observable;
        this.b = function;
        this.c = z;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        if (io.reactivex.internal.operators.mixed.a.a(this.a, this.b, completableObserver)) {
            return;
        }
        this.a.subscribe(new a(completableObserver, this.b, this.c));
    }
}

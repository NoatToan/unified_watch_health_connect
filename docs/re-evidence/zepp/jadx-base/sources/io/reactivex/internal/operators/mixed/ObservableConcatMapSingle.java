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
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableConcatMapSingle<T, R> extends Observable<R> {
    public final Observable<T> a;
    public final Function<? super T, ? extends SingleSource<? extends R>> b;
    public final ErrorMode c;
    public final int d;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public static final int l = 0;
        public static final int m = 1;
        public static final int n = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        public final Observer<? super R> a;
        public final Function<? super T, ? extends SingleSource<? extends R>> b;
        public final AtomicThrowable c = new AtomicThrowable();
        public final C1127a<R> d = new C1127a<>(this);
        public final SimplePlainQueue<T> e;
        public final ErrorMode f;
        public Disposable g;
        public volatile boolean h;
        public volatile boolean i;
        public R j;
        public volatile int k;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.ObservableConcatMapSingle$a$a, reason: collision with other inner class name */
        public static final class C1127a<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            public final a<?, R> a;

            public C1127a(a<?, R> aVar) {
                this.a = aVar;
            }

            public void a() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.a.b(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                this.a.c(r);
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, int i, ErrorMode errorMode) {
            this.a = observer;
            this.b = function;
            this.f = errorMode;
            this.e = new SpscLinkedArrayQueue(i);
        }

        public void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.a;
            ErrorMode errorMode = this.f;
            SimplePlainQueue<T> simplePlainQueue = this.e;
            AtomicThrowable atomicThrowable = this.c;
            int iAddAndGet = 1;
            while (true) {
                if (!this.i) {
                    int i = this.k;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i == 0))) {
                        break;
                    }
                    if (i == 0) {
                        boolean z = this.h;
                        T tPoll = simplePlainQueue.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate == null) {
                                observer.onComplete();
                                return;
                            } else {
                                observer.onError(thTerminate);
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.b.apply(tPoll), "The mapper returned a null SingleSource");
                                this.k = 1;
                                singleSource.subscribe(this.d);
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.g.dispose();
                                simplePlainQueue.clear();
                                atomicThrowable.addThrowable(th);
                                observer.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } else if (i == 2) {
                        R r = this.j;
                        this.j = null;
                        observer.onNext(r);
                        this.k = 0;
                    }
                } else {
                    simplePlainQueue.clear();
                    this.j = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
            this.j = null;
            observer.onError(atomicThrowable.terminate());
        }

        public void b(Throwable th) {
            if (!this.c.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.f != ErrorMode.END) {
                this.g.dispose();
            }
            this.k = 0;
            a();
        }

        public void c(R r) {
            this.j = r;
            this.k = 2;
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.i = true;
            this.g.dispose();
            this.d.a();
            if (getAndIncrement() == 0) {
                this.e.clear();
                this.j = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.i;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.h = true;
            a();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.c.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.f == ErrorMode.IMMEDIATE) {
                this.d.a();
            }
            this.h = true;
            a();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.e.offer(t);
            a();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.g, disposable)) {
                this.g = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapSingle(Observable<T> observable, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode, int i) {
        this.a = observable;
        this.b = function;
        this.c = errorMode;
        this.d = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (io.reactivex.internal.operators.mixed.a.c(this.a, this.b, observer)) {
            return;
        }
        this.a.subscribe(new a(observer, this.b, this.d, this.c));
    }
}

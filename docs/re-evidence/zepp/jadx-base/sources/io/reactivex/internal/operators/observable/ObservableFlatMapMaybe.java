package io.reactivex.internal.operators.observable;

import defpackage.a05;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableFlatMapMaybe<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {
    public final Function<? super T, ? extends MaybeSource<? extends R>> a;
    public final boolean b;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8600231336733376951L;
        public final Observer<? super R> a;
        public final boolean b;
        public final Function<? super T, ? extends MaybeSource<? extends R>> f;
        public Disposable h;
        public volatile boolean i;
        public final CompositeDisposable c = new CompositeDisposable();
        public final AtomicThrowable e = new AtomicThrowable();
        public final AtomicInteger d = new AtomicInteger(1);
        public final AtomicReference<SpscLinkedArrayQueue<R>> g = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableFlatMapMaybe$a$a, reason: collision with other inner class name */
        public final class C1139a extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            public C1139a() {
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                a.this.f(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                a.this.g(this, th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                a.this.h(this, r);
            }
        }

        public a(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
            this.a = observer;
            this.f = function;
            this.b = z;
        }

        public void a() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.g.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        public void c() {
            Observer<? super R> observer = this.a;
            AtomicInteger atomicInteger = this.d;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.g;
            int iAddAndGet = 1;
            while (!this.i) {
                if (!this.b && this.e.get() != null) {
                    Throwable thTerminate = this.e.terminate();
                    a();
                    observer.onError(thTerminate);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue = atomicReference.get();
                a05 a05VarPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z2 = a05VarPoll == null;
                if (z && z2) {
                    Throwable thTerminate2 = this.e.terminate();
                    if (thTerminate2 != null) {
                        observer.onError(thTerminate2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(a05VarPoll);
                }
            }
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.i = true;
            this.h.dispose();
            this.c.dispose();
        }

        public SpscLinkedArrayQueue<R> e() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
            do {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = this.g.get();
                if (spscLinkedArrayQueue2 != null) {
                    return spscLinkedArrayQueue2;
                }
                spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Observable.bufferSize());
            } while (!this.g.compareAndSet(null, spscLinkedArrayQueue));
            return spscLinkedArrayQueue;
        }

        public void f(a<T, R>.C1139a c1139a) {
            this.c.delete(c1139a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z = this.d.decrementAndGet() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.g.get();
                    if (!z || (spscLinkedArrayQueue != null && !spscLinkedArrayQueue.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        c();
                        return;
                    } else {
                        Throwable thTerminate = this.e.terminate();
                        if (thTerminate != null) {
                            this.a.onError(thTerminate);
                            return;
                        } else {
                            this.a.onComplete();
                            return;
                        }
                    }
                }
            }
            this.d.decrementAndGet();
            b();
        }

        public void g(a<T, R>.C1139a c1139a, Throwable th) {
            this.c.delete(c1139a);
            if (!this.e.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.b) {
                this.h.dispose();
                this.c.dispose();
            }
            this.d.decrementAndGet();
            b();
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:28:0x0062 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public void h(a<T, R>.C1139a c1139a, R r) {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueueE;
            this.c.delete(c1139a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    this.a.onNext(r);
                    boolean z = this.d.decrementAndGet() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.g.get();
                    if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                        Throwable thTerminate = this.e.terminate();
                        if (thTerminate != null) {
                            this.a.onError(thTerminate);
                            return;
                        } else {
                            this.a.onComplete();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    spscLinkedArrayQueueE = e();
                    synchronized (spscLinkedArrayQueueE) {
                        spscLinkedArrayQueueE.offer(r);
                    }
                    this.d.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            } else {
                spscLinkedArrayQueueE = e();
                synchronized (spscLinkedArrayQueueE) {
                    spscLinkedArrayQueueE.offer(r);
                    this.d.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            }
            c();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.i;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.d.decrementAndGet();
            b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.d.decrementAndGet();
            if (!this.e.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.b) {
                this.c.dispose();
            }
            b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.f.apply(t), "The mapper returned a null MaybeSource");
                this.d.getAndIncrement();
                C1139a c1139a = new C1139a();
                if (this.i || !this.c.add(c1139a)) {
                    return;
                }
                maybeSource.subscribe(c1139a);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.h.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.h, disposable)) {
                this.h = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapMaybe(ObservableSource<T> observableSource, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        super(observableSource);
        this.a = function;
        this.b = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new a(observer, this.a, this.b));
    }
}

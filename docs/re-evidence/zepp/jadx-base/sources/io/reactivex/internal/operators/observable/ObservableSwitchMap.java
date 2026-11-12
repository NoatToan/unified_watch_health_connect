package io.reactivex.internal.operators.observable;

import defpackage.a05;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableSwitchMap<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {
    public final Function<? super T, ? extends ObservableSource<? extends R>> a;
    public final int b;
    public final boolean c;

    public static final class a<T, R> extends AtomicReference<Disposable> implements Observer<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        public final b<T, R> a;
        public final long b;
        public final int c;
        public volatile SimpleQueue<R> d;
        public volatile boolean e;

        public a(b<T, R> bVar, long j, int i) {
            this.a = bVar;
            this.b = j;
            this.c = i;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.b == this.a.j) {
                this.e = true;
                this.a.b();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.a.c(this, th);
        }

        @Override // io.reactivex.Observer
        public void onNext(R r) {
            if (this.b == this.a.j) {
                if (r != null) {
                    this.d.offer(r);
                }
                this.a.b();
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.d = queueDisposable;
                        this.e = true;
                        this.a.b();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.d = queueDisposable;
                        return;
                    }
                }
                this.d = new SpscLinkedArrayQueue(this.c);
            }
        }
    }

    public static final class b<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        public static final a<Object, Object> k;
        private static final long serialVersionUID = -3491074160481096299L;
        public final Observer<? super R> a;
        public final Function<? super T, ? extends ObservableSource<? extends R>> b;
        public final int c;
        public final boolean d;
        public volatile boolean f;
        public volatile boolean g;
        public Disposable h;
        public volatile long j;
        public final AtomicReference<a<T, R>> i = new AtomicReference<>();
        public final AtomicThrowable e = new AtomicThrowable();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            k = aVar;
            aVar.a();
        }

        public b(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
            this.a = observer;
            this.b = function;
            this.c = i;
            this.d = z;
        }

        public void a() {
            a<T, R> andSet;
            a<T, R> aVar = this.i.get();
            a<Object, Object> aVar2 = k;
            if (aVar == aVar2 || (andSet = this.i.getAndSet((a<T, R>) aVar2)) == aVar2 || andSet == null) {
                return;
            }
            andSet.a();
        }

        /* JADX WARN: Code duplicated, block: B:101:0x000f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x00e9 A[SYNTHETIC] */
        public void b() {
            SimpleQueue<R> simpleQueue;
            a05 a05VarPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.a;
            AtomicReference<a<T, R>> atomicReference = this.i;
            boolean z = this.d;
            int iAddAndGet = 1;
            while (!this.g) {
                if (this.f) {
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        if (z2) {
                            Throwable th = this.e.get();
                            if (th != null) {
                                observer.onError(th);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                    } else if (this.e.get() != null) {
                        observer.onError(this.e.terminate());
                        return;
                    } else if (z2) {
                        observer.onComplete();
                        return;
                    }
                }
                a<T, R> aVar = atomicReference.get();
                if (aVar != null && (simpleQueue = aVar.d) != null) {
                    if (aVar.e) {
                        boolean zIsEmpty = simpleQueue.isEmpty();
                        if (z) {
                            if (zIsEmpty) {
                                atomicReference.compareAndSet(aVar, null);
                            }
                        } else if (this.e.get() != null) {
                            observer.onError(this.e.terminate());
                            return;
                        } else if (zIsEmpty) {
                            atomicReference.compareAndSet(aVar, null);
                        }
                    }
                    boolean z3 = false;
                    while (!this.g) {
                        if (aVar == atomicReference.get()) {
                            if (!z && this.e.get() != null) {
                                observer.onError(this.e.terminate());
                                return;
                            }
                            boolean z4 = aVar.e;
                            try {
                                a05VarPoll = simpleQueue.poll();
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.e.addThrowable(th2);
                                atomicReference.compareAndSet(aVar, null);
                                if (z) {
                                    aVar.a();
                                } else {
                                    a();
                                    this.h.dispose();
                                    this.f = true;
                                }
                                a05VarPoll = null;
                                z3 = true;
                            }
                            boolean z5 = a05VarPoll == null;
                            if (z4 && z5) {
                                atomicReference.compareAndSet(aVar, null);
                            } else if (!z5) {
                                observer.onNext(a05VarPoll);
                            }
                            if (z3) {
                                continue;
                            }
                        }
                        z3 = true;
                        if (z3) {
                            continue;
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public void c(a<T, R> aVar, Throwable th) {
            if (aVar.b != this.j || !this.e.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.d) {
                this.h.dispose();
            }
            aVar.e = true;
            b();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.h.dispose();
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.g;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f) {
                return;
            }
            this.f = true;
            b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f || !this.e.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.d) {
                a();
            }
            this.f = true;
            b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            a<T, R> aVar;
            long j = this.j + 1;
            this.j = j;
            a<T, R> aVar2 = this.i.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.b.apply(t), "The ObservableSource returned is null");
                a<T, R> aVar3 = new a<>(this, j, this.c);
                do {
                    aVar = this.i.get();
                    if (aVar == k) {
                        return;
                    }
                } while (!this.i.compareAndSet(aVar, aVar3));
                observableSource.subscribe(aVar3);
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

    public ObservableSwitchMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
        super(observableSource);
        this.a = function;
        this.b = i;
        this.c = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.a)) {
            return;
        }
        this.source.subscribe(new b(observer, this.a, this.b, this.c));
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends io.reactivex.internal.operators.observable.a<T, Observable<T>> {
    public final ObservableSource<B> a;
    public final Function<? super B, ? extends ObservableSource<V>> b;
    public final int c;

    public static final class a<T, V> extends DisposableObserver<V> {
        public final c<T, ?, V> b;
        public final UnicastSubject<T> c;
        public boolean d;

        public a(c<T, ?, V> cVar, UnicastSubject<T> unicastSubject) {
            this.b = cVar;
            this.c = unicastSubject;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.b.a(this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.onError(th);
            } else {
                this.d = true;
                this.b.d(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(V v) {
            dispose();
            onComplete();
        }
    }

    public static final class b<T, B> extends DisposableObserver<B> {
        public final c<T, B, ?> b;

        public b(c<T, B, ?> cVar) {
            this.b = cVar;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.b.d(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(B b) {
            this.b.e(b);
        }
    }

    public static final class c<T, B, V> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {
        public final ObservableSource<B> F;
        public final Function<? super B, ? extends ObservableSource<V>> G;
        public final int H;
        public final CompositeDisposable I;
        public Disposable J;
        public final AtomicReference<Disposable> K;
        public final List<UnicastSubject<T>> L;
        public final AtomicLong M;

        public c(Observer<? super Observable<T>> observer, ObservableSource<B> observableSource, Function<? super B, ? extends ObservableSource<V>> function, int i) {
            super(observer, new MpscLinkedQueue());
            this.K = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.M = atomicLong;
            this.F = observableSource;
            this.G = function;
            this.H = i;
            this.I = new CompositeDisposable();
            this.L = new ArrayList();
            atomicLong.lazySet(1L);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void a(a<T, V> aVar) {
            this.I.delete(aVar);
            this.queue.offer((U) new d(aVar.c, null));
            if (enter()) {
                c();
            }
        }

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public void accept(Observer<? super Observable<T>> observer, Object obj) {
        }

        public void b() {
            this.I.dispose();
            DisposableHelper.dispose(this.K);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            List<UnicastSubject<T>> list = this.L;
            int iLeave = 1;
            while (true) {
                boolean z = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    b();
                    Throwable th = this.error;
                    if (th != null) {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it3 = list.iterator();
                        while (it3.hasNext()) {
                            it3.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll instanceof d) {
                    d dVar = (d) objPoll;
                    UnicastSubject<T> unicastSubject = dVar.a;
                    if (unicastSubject != null) {
                        if (list.remove(unicastSubject)) {
                            dVar.a.onComplete();
                            if (this.M.decrementAndGet() == 0) {
                                b();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.cancelled) {
                        UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.H);
                        list.add(unicastSubjectCreate);
                        observer.onNext(unicastSubjectCreate);
                        try {
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.G.apply(dVar.b), "The ObservableSource supplied is null");
                            a aVar = new a(this, unicastSubjectCreate);
                            if (this.I.add(aVar)) {
                                this.M.getAndIncrement();
                                observableSource.subscribe(aVar);
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.cancelled = true;
                            observer.onError(th2);
                        }
                    }
                } else {
                    Iterator<UnicastSubject<T>> it4 = list.iterator();
                    while (it4.hasNext()) {
                        it4.next().onNext(NotificationLite.getValue(objPoll));
                    }
                }
            }
        }

        public void d(Throwable th) {
            this.J.dispose();
            this.I.dispose();
            onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void e(B b) {
            this.queue.offer((U) new d(null, b));
            if (enter()) {
                c();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                c();
            }
            if (this.M.decrementAndGet() == 0) {
                this.I.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (enter()) {
                c();
            }
            if (this.M.decrementAndGet() == 0) {
                this.I.dispose();
            }
            this.downstream.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (fastEnter()) {
                Iterator<UnicastSubject<T>> it2 = this.L.iterator();
                while (it2.hasNext()) {
                    it2.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            c();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.J, disposable)) {
                this.J = disposable;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                b bVar = new b(this);
                if (this.K.compareAndSet(null, bVar)) {
                    this.M.getAndIncrement();
                    this.F.subscribe(bVar);
                }
            }
        }
    }

    public static final class d<T, B> {
        public final UnicastSubject<T> a;
        public final B b;

        public d(UnicastSubject<T> unicastSubject, B b) {
            this.a = unicastSubject;
            this.b = b;
        }
    }

    public ObservableWindowBoundarySelector(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, Function<? super B, ? extends ObservableSource<V>> function, int i) {
        super(observableSource);
        this.a = observableSource2;
        this.b = function;
        this.c = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        this.source.subscribe(new c(new SerializedObserver(observer), this.a, this.b, this.c));
    }
}

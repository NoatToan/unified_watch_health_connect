package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.a<TLeft, R> {
    public final ObservableSource<? extends TRight> a;
    public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> b;
    public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> c;
    public final BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> d;

    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, b {
        public static final Integer n = 1;
        public static final Integer o = 2;
        public static final Integer p = 3;
        public static final Integer q = 4;
        private static final long serialVersionUID = -6071216598687999801L;
        public final Observer<? super R> a;
        public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> g;
        public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> h;
        public final BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> i;
        public int k;
        public int l;
        public volatile boolean m;
        public final CompositeDisposable c = new CompositeDisposable();
        public final SpscLinkedArrayQueue<Object> b = new SpscLinkedArrayQueue<>(Observable.bufferSize());
        public final Map<Integer, UnicastSubject<TRight>> d = new LinkedHashMap();
        public final Map<Integer, TRight> e = new LinkedHashMap();
        public final AtomicReference<Throwable> f = new AtomicReference<>();
        public final AtomicInteger j = new AtomicInteger(2);

        public a(Observer<? super R> observer, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> biFunction) {
            this.a = observer;
            this.g = function;
            this.h = function2;
            this.i = biFunction;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public void a(Throwable th) {
            if (!ExceptionHelper.addThrowable(this.f, th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.j.decrementAndGet();
                h();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public void b(Throwable th) {
            if (ExceptionHelper.addThrowable(this.f, th)) {
                h();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public void c(boolean z, Object obj) {
            synchronized (this) {
                this.b.offer(z ? n : o, obj);
            }
            h();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.m) {
                return;
            }
            this.m = true;
            g();
            if (getAndIncrement() == 0) {
                this.b.clear();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public void e(boolean z, c cVar) {
            synchronized (this) {
                this.b.offer(z ? p : q, cVar);
            }
            h();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public void f(d dVar) {
            this.c.delete(dVar);
            this.j.decrementAndGet();
            h();
        }

        public void g() {
            this.c.dispose();
        }

        public void h() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.b;
            Observer<? super R> observer = this.a;
            int iAddAndGet = 1;
            while (!this.m) {
                if (this.f.get() != null) {
                    spscLinkedArrayQueue.clear();
                    g();
                    i(observer);
                    return;
                }
                boolean z = this.j.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    Iterator<UnicastSubject<TRight>> it2 = this.d.values().iterator();
                    while (it2.hasNext()) {
                        it2.next().onComplete();
                    }
                    this.d.clear();
                    this.e.clear();
                    this.c.dispose();
                    observer.onComplete();
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == n) {
                        UnicastSubject unicastSubjectCreate = UnicastSubject.create();
                        int i = this.k;
                        this.k = i + 1;
                        this.d.put(Integer.valueOf(i), (UnicastSubject<TRight>) unicastSubjectCreate);
                        try {
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.g.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            c cVar = new c(this, true, i);
                            this.c.add(cVar);
                            observableSource.subscribe(cVar);
                            if (this.f.get() != null) {
                                spscLinkedArrayQueue.clear();
                                g();
                                i(observer);
                                return;
                            } else {
                                try {
                                    observer.onNext((Object) ObjectHelper.requireNonNull(this.i.apply(objPoll, unicastSubjectCreate), "The resultSelector returned a null value"));
                                    Iterator<TRight> it3 = this.e.values().iterator();
                                    while (it3.hasNext()) {
                                        unicastSubjectCreate.onNext(it3.next());
                                    }
                                } catch (Throwable th) {
                                    j(th, observer, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            j(th2, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == o) {
                        int i2 = this.l;
                        this.l = i2 + 1;
                        this.e.put(Integer.valueOf(i2), (TRight) objPoll);
                        try {
                            ObservableSource observableSource2 = (ObservableSource) ObjectHelper.requireNonNull(this.h.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            c cVar2 = new c(this, false, i2);
                            this.c.add(cVar2);
                            observableSource2.subscribe(cVar2);
                            if (this.f.get() != null) {
                                spscLinkedArrayQueue.clear();
                                g();
                                i(observer);
                                return;
                            } else {
                                Iterator<UnicastSubject<TRight>> it4 = this.d.values().iterator();
                                while (it4.hasNext()) {
                                    it4.next().onNext(objPoll);
                                }
                            }
                        } catch (Throwable th3) {
                            j(th3, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == p) {
                        c cVar3 = (c) objPoll;
                        UnicastSubject<TRight> unicastSubjectRemove = this.d.remove(Integer.valueOf(cVar3.c));
                        this.c.remove(cVar3);
                        if (unicastSubjectRemove != null) {
                            unicastSubjectRemove.onComplete();
                        }
                    } else if (num == q) {
                        c cVar4 = (c) objPoll;
                        this.e.remove(Integer.valueOf(cVar4.c));
                        this.c.remove(cVar4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void i(Observer<?> observer) {
            Throwable thTerminate = ExceptionHelper.terminate(this.f);
            Iterator<UnicastSubject<TRight>> it2 = this.d.values().iterator();
            while (it2.hasNext()) {
                it2.next().onError(thTerminate);
            }
            this.d.clear();
            this.e.clear();
            observer.onError(thTerminate);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.m;
        }

        public void j(Throwable th, Observer<?> observer, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            Exceptions.throwIfFatal(th);
            ExceptionHelper.addThrowable(this.f, th);
            spscLinkedArrayQueue.clear();
            g();
            i(observer);
        }
    }

    public interface b {
        void a(Throwable th);

        void b(Throwable th);

        void c(boolean z, Object obj);

        void e(boolean z, c cVar);

        void f(d dVar);
    }

    public static final class c extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        public final b a;
        public final boolean b;
        public final int c;

        public c(b bVar, boolean z, int i) {
            this.a = bVar;
            this.b = z;
            this.c = i;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.a.e(this.b, this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.a.b(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (DisposableHelper.dispose(this)) {
                this.a.e(this.b, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public static final class d extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        public final b a;
        public final boolean b;

        public d(b bVar, boolean z) {
            this.a = bVar;
            this.b = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.a.f(this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.a.a(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.a.c(this.b, obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableGroupJoin(ObservableSource<TLeft> observableSource, ObservableSource<? extends TRight> observableSource2, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> biFunction) {
        super(observableSource);
        this.a = observableSource2;
        this.b = function;
        this.c = function2;
        this.d = biFunction;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        a aVar = new a(observer, this.b, this.c, this.d);
        observer.onSubscribe(aVar);
        d dVar = new d(aVar, true);
        aVar.c.add(dVar);
        d dVar2 = new d(aVar, false);
        aVar.c.add(dVar2);
        this.source.subscribe(dVar);
        this.a.subscribe(dVar2);
    }
}

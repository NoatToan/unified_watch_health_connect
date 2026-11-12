package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.observable.a<TLeft, R> {
    public final ObservableSource<? extends TRight> a;
    public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> b;
    public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> c;
    public final BiFunction<? super TLeft, ? super TRight, ? extends R> d;

    public static final class a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, ObservableGroupJoin.b {
        public static final Integer n = 1;
        public static final Integer o = 2;
        public static final Integer p = 3;
        public static final Integer q = 4;
        private static final long serialVersionUID = -6071216598687999801L;
        public final Observer<? super R> a;
        public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> g;
        public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> h;
        public final BiFunction<? super TLeft, ? super TRight, ? extends R> i;
        public int k;
        public int l;
        public volatile boolean m;
        public final CompositeDisposable c = new CompositeDisposable();
        public final SpscLinkedArrayQueue<Object> b = new SpscLinkedArrayQueue<>(Observable.bufferSize());
        public final Map<Integer, TLeft> d = new LinkedHashMap();
        public final Map<Integer, TRight> e = new LinkedHashMap();
        public final AtomicReference<Throwable> f = new AtomicReference<>();
        public final AtomicInteger j = new AtomicInteger(2);

        public a(Observer<? super R> observer, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
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
        public void e(boolean z, ObservableGroupJoin.c cVar) {
            synchronized (this) {
                this.b.offer(z ? p : q, cVar);
            }
            h();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.b
        public void f(ObservableGroupJoin.d dVar) {
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
                        int i = this.k;
                        this.k = i + 1;
                        this.d.put(Integer.valueOf(i), (TLeft) objPoll);
                        try {
                            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.g.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            ObservableGroupJoin.c cVar = new ObservableGroupJoin.c(this, true, i);
                            this.c.add(cVar);
                            observableSource.subscribe(cVar);
                            if (this.f.get() != null) {
                                spscLinkedArrayQueue.clear();
                                g();
                                i(observer);
                                return;
                            } else {
                                Iterator<TRight> it2 = this.e.values().iterator();
                                while (it2.hasNext()) {
                                    try {
                                        observer.onNext((Object) ObjectHelper.requireNonNull(this.i.apply(objPoll, it2.next()), "The resultSelector returned a null value"));
                                    } catch (Throwable th) {
                                        j(th, observer, spscLinkedArrayQueue);
                                        return;
                                    }
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
                            ObservableGroupJoin.c cVar2 = new ObservableGroupJoin.c(this, false, i2);
                            this.c.add(cVar2);
                            observableSource2.subscribe(cVar2);
                            if (this.f.get() != null) {
                                spscLinkedArrayQueue.clear();
                                g();
                                i(observer);
                                return;
                            } else {
                                Iterator<TLeft> it3 = this.d.values().iterator();
                                while (it3.hasNext()) {
                                    try {
                                        observer.onNext((Object) ObjectHelper.requireNonNull(this.i.apply(it3.next(), objPoll), "The resultSelector returned a null value"));
                                    } catch (Throwable th3) {
                                        j(th3, observer, spscLinkedArrayQueue);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            j(th4, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == p) {
                        ObservableGroupJoin.c cVar3 = (ObservableGroupJoin.c) objPoll;
                        this.d.remove(Integer.valueOf(cVar3.c));
                        this.c.remove(cVar3);
                    } else {
                        ObservableGroupJoin.c cVar4 = (ObservableGroupJoin.c) objPoll;
                        this.e.remove(Integer.valueOf(cVar4.c));
                        this.c.remove(cVar4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void i(Observer<?> observer) {
            Throwable thTerminate = ExceptionHelper.terminate(this.f);
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

    public ObservableJoin(ObservableSource<TLeft> observableSource, ObservableSource<? extends TRight> observableSource2, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
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
        ObservableGroupJoin.d dVar = new ObservableGroupJoin.d(aVar, true);
        aVar.c.add(dVar);
        ObservableGroupJoin.d dVar2 = new ObservableGroupJoin.d(aVar, false);
        aVar.c.add(dVar2);
        this.source.subscribe(dVar);
        this.a.subscribe(dVar2);
    }
}

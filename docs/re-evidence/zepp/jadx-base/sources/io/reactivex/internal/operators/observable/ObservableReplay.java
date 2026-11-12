package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableReplay<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T>, ResettableConnectable {
    public static final b e = new o();
    public final ObservableSource<T> a;
    public final AtomicReference<j<T>> b;
    public final b<T> c;
    public final ObservableSource<T> d;

    public static abstract class a<T> extends AtomicReference<f> implements h<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        public f a;
        public int b;

        public a() {
            f fVar = new f(null);
            this.a = fVar;
            set(fVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void a(T t) {
            c(new f(f(NotificationLite.next(t))));
            p();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void b(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                f fVarG = (f) dVar.a();
                if (fVarG == null) {
                    fVarG = g();
                    dVar.c = fVarG;
                }
                while (!dVar.isDisposed()) {
                    f fVar = fVarG.get();
                    if (fVar == null) {
                        dVar.c = fVarG;
                        iAddAndGet = dVar.addAndGet(-iAddAndGet);
                    } else {
                        if (NotificationLite.accept(j(fVar.a), dVar.b)) {
                            dVar.c = null;
                            return;
                        }
                        fVarG = fVar;
                    }
                }
                return;
            } while (iAddAndGet != 0);
        }

        public final void c(f fVar) {
            this.a.set(fVar);
            this.a = fVar;
            this.b++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void complete() {
            c(new f(f(NotificationLite.complete())));
            q();
        }

        public final void e(Collection<? super T> collection) {
            f fVarG = g();
            while (true) {
                fVarG = fVarG.get();
                if (fVarG == null) {
                    return;
                }
                Object objJ = j(fVarG.a);
                if (NotificationLite.isComplete(objJ) || NotificationLite.isError(objJ)) {
                    return;
                } else {
                    collection.add((Object) NotificationLite.getValue(objJ));
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public final void error(Throwable th) {
            c(new f(f(NotificationLite.error(th))));
            q();
        }

        public Object f(Object obj) {
            return obj;
        }

        public f g() {
            return get();
        }

        public boolean h() {
            Object obj = this.a.a;
            return obj != null && NotificationLite.isComplete(j(obj));
        }

        public boolean i() {
            Object obj = this.a.a;
            return obj != null && NotificationLite.isError(j(obj));
        }

        public Object j(Object obj) {
            return obj;
        }

        public final void k() {
            f fVar = get().get();
            this.b--;
            n(fVar);
        }

        public final void m(int i) {
            f fVar = get();
            while (i > 0) {
                fVar = fVar.get();
                i--;
                this.b--;
            }
            n(fVar);
        }

        public final void n(f fVar) {
            set(fVar);
        }

        public final void o() {
            f fVar = get();
            if (fVar.a != null) {
                f fVar2 = new f(null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        public abstract void p();

        public void q() {
            o();
        }
    }

    public interface b<T> {
        h<T> call();
    }

    public static final class c<R> implements Consumer<Disposable> {
        private final ObserverResourceWrapper<R> a;

        public c(ObserverResourceWrapper<R> observerResourceWrapper) {
            this.a = observerResourceWrapper;
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Disposable disposable) {
            this.a.setResource(disposable);
        }
    }

    public static final class d<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2728361546769921047L;
        public final j<T> a;
        public final Observer<? super T> b;
        public Object c;
        public volatile boolean d;

        public d(j<T> jVar, Observer<? super T> observer) {
            this.a = jVar;
            this.b = observer;
        }

        public <U> U a() {
            return (U) this.c;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.b(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.d;
        }
    }

    public static final class e<R, U> extends Observable<R> {
        private final Callable<? extends ConnectableObservable<U>> a;
        private final Function<? super Observable<U>, ? extends ObservableSource<R>> b;

        public e(Callable<? extends ConnectableObservable<U>> callable, Function<? super Observable<U>, ? extends ObservableSource<R>> function) {
            this.a = callable;
            this.b = function;
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(Observer<? super R> observer) {
            try {
                ConnectableObservable connectableObservable = (ConnectableObservable) ObjectHelper.requireNonNull(this.a.call(), "The connectableFactory returned a null ConnectableObservable");
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.b.apply(connectableObservable), "The selector returned a null ObservableSource");
                ObserverResourceWrapper observerResourceWrapper = new ObserverResourceWrapper(observer);
                observableSource.subscribe(observerResourceWrapper);
                connectableObservable.connect(new c(observerResourceWrapper));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptyDisposable.error(th, observer);
            }
        }
    }

    public static final class f extends AtomicReference<f> {
        private static final long serialVersionUID = 245354315435971818L;
        public final Object a;

        public f(Object obj) {
            this.a = obj;
        }
    }

    public static final class g<T> extends ConnectableObservable<T> {
        private final ConnectableObservable<T> a;
        private final Observable<T> b;

        public g(ConnectableObservable<T> connectableObservable, Observable<T> observable) {
            this.a = connectableObservable;
            this.b = observable;
        }

        @Override // io.reactivex.observables.ConnectableObservable
        public void connect(Consumer<? super Disposable> consumer) {
            this.a.connect(consumer);
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(Observer<? super T> observer) {
            this.b.subscribe(observer);
        }
    }

    public interface h<T> {
        void a(T t);

        void b(d<T> dVar);

        void complete();

        void error(Throwable th);
    }

    public static final class i<T> implements b<T> {
        private final int a;

        public i(int i) {
            this.a = i;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public h<T> call() {
            return new n(this.a);
        }
    }

    public static final class j<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        public static final d[] e = new d[0];
        public static final d[] f = new d[0];
        private static final long serialVersionUID = -533785617179540163L;
        public final h<T> a;
        public boolean b;
        public final AtomicReference<d[]> c = new AtomicReference<>(e);
        public final AtomicBoolean d = new AtomicBoolean();

        public j(h<T> hVar) {
            this.a = hVar;
        }

        public boolean a(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.c.get();
                if (dVarArr == f) {
                    return false;
                }
                int length = dVarArr.length;
                dVarArr2 = new d[length + 1];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
            } while (!this.c.compareAndSet(dVarArr, dVarArr2));
            return true;
        }

        public void b(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.c.get();
                int length = dVarArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (dVarArr[i2].equals(dVar)) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    dVarArr2 = e;
                } else {
                    d[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr, 0, dVarArr3, 0, i);
                    System.arraycopy(dVarArr, i + 1, dVarArr3, i, (length - i) - 1);
                    dVarArr2 = dVarArr3;
                }
            } while (!this.c.compareAndSet(dVarArr, dVarArr2));
        }

        public void c() {
            for (d<T> dVar : this.c.get()) {
                this.a.b(dVar);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.c.set(f);
            DisposableHelper.dispose(this);
        }

        public void e() {
            for (d<T> dVar : this.c.getAndSet(f)) {
                this.a.b(dVar);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.c.get() == f;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.complete();
            e();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.b) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.b = true;
            this.a.error(th);
            e();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.b) {
                return;
            }
            this.a.a(t);
            c();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                c();
            }
        }
    }

    public static final class k<T> implements ObservableSource<T> {
        private final AtomicReference<j<T>> a;
        private final b<T> b;

        public k(AtomicReference<j<T>> atomicReference, b<T> bVar) {
            this.a = atomicReference;
            this.b = bVar;
        }

        @Override // io.reactivex.ObservableSource
        public void subscribe(Observer<? super T> observer) {
            j<T> jVar;
            while (true) {
                jVar = this.a.get();
                if (jVar != null) {
                    break;
                }
                j<T> jVar2 = new j<>(this.b.call());
                if (this.a.compareAndSet(null, jVar2)) {
                    jVar = jVar2;
                    break;
                }
            }
            d<T> dVar = new d<>(jVar, observer);
            observer.onSubscribe(dVar);
            jVar.a(dVar);
            if (dVar.isDisposed()) {
                jVar.b(dVar);
            } else {
                jVar.a.b(dVar);
            }
        }
    }

    public static final class l<T> implements b<T> {
        private final int a;
        private final long b;
        private final TimeUnit c;
        private final Scheduler d;

        public l(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.a = i;
            this.b = j;
            this.c = timeUnit;
            this.d = scheduler;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public h<T> call() {
            return new m(this.a, this.b, this.c, this.d);
        }
    }

    public static final class m<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        public final Scheduler c;
        public final long d;
        public final TimeUnit e;
        public final int f;

        public m(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.c = scheduler;
            this.f = i;
            this.d = j;
            this.e = timeUnit;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public Object f(Object obj) {
            return new Timed(obj, this.c.now(this.e), this.e);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public f g() {
            f fVar;
            long jNow = this.c.now(this.e) - this.d;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                Timed timed = (Timed) fVar2.a;
                if (NotificationLite.isComplete(timed.value()) || NotificationLite.isError(timed.value()) || timed.time() > jNow) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public Object j(Object obj) {
            return ((Timed) obj).value();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public void p() {
            f fVar;
            long jNow = this.c.now(this.e) - this.d;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 != null) {
                    int i2 = this.b;
                    if (i2 <= this.f) {
                        if (((Timed) fVar2.a).time() > jNow) {
                            break;
                        }
                        i++;
                        this.b--;
                        fVar3 = fVar2.get();
                    } else {
                        i++;
                        this.b = i2 - 1;
                        fVar3 = fVar2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                n(fVar);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public void q() {
            f fVar;
            long jNow = this.c.now(this.e) - this.d;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || this.b <= 1 || ((Timed) fVar2.a).time() > jNow) {
                    break;
                }
                i++;
                this.b--;
                fVar3 = fVar2.get();
            }
            if (i != 0) {
                n(fVar);
            }
        }
    }

    public static final class n<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        public final int c;

        public n(int i) {
            this.c = i;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public void p() {
            if (this.b > this.c) {
                k();
            }
        }
    }

    public static final class o implements b<Object> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.b
        public h<Object> call() {
            return new p(16);
        }
    }

    public static final class p<T> extends ArrayList<Object> implements h<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        public volatile int a;

        public p(int i) {
            super(i);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public void a(T t) {
            add(NotificationLite.next(t));
            this.a++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public void b(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = dVar.b;
            int iAddAndGet = 1;
            while (!dVar.isDisposed()) {
                int i = this.a;
                Integer num = (Integer) dVar.a();
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i) {
                    if (NotificationLite.accept(get(iIntValue), observer) || dVar.isDisposed()) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                dVar.c = Integer.valueOf(iIntValue);
                iAddAndGet = dVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public void complete() {
            add(NotificationLite.complete());
            this.a++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.h
        public void error(Throwable th) {
            add(NotificationLite.error(th));
            this.a++;
        }
    }

    private ObservableReplay(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<j<T>> atomicReference, b<T> bVar) {
        this.d = observableSource;
        this.a = observableSource2;
        this.b = atomicReference;
        this.c = bVar;
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, int i2) {
        return i2 == Integer.MAX_VALUE ? createFrom(observableSource) : d(observableSource, new i(i2));
    }

    public static <T> ConnectableObservable<T> createFrom(ObservableSource<? extends T> observableSource) {
        return d(observableSource, e);
    }

    public static <T> ConnectableObservable<T> d(ObservableSource<T> observableSource, b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableObservable) new ObservableReplay(new k(atomicReference, bVar), observableSource, atomicReference, bVar));
    }

    public static <U, R> Observable<R> multicastSelector(Callable<? extends ConnectableObservable<U>> callable, Function<? super Observable<U>, ? extends ObservableSource<R>> function) {
        return RxJavaPlugins.onAssembly(new e(callable, function));
    }

    public static <T> ConnectableObservable<T> observeOn(ConnectableObservable<T> connectableObservable, Scheduler scheduler) {
        return RxJavaPlugins.onAssembly((ConnectableObservable) new g(connectableObservable, connectableObservable.observeOn(scheduler)));
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public void connect(Consumer<? super Disposable> consumer) {
        j<T> jVar;
        while (true) {
            jVar = this.b.get();
            if (jVar != null && !jVar.isDisposed()) {
                break;
            }
            j<T> jVar2 = new j<>(this.c.call());
            if (this.b.compareAndSet(jVar, jVar2)) {
                jVar = jVar2;
                break;
            }
        }
        boolean z = !jVar.d.get() && jVar.d.compareAndSet(false, true);
        try {
            consumer.accept(jVar);
            if (z) {
                this.a.subscribe(jVar);
            }
        } catch (Throwable th) {
            if (z) {
                jVar.d.compareAndSet(true, false);
            }
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable) {
        this.b.compareAndSet((j) disposable, null);
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource<T> source() {
        return this.a;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.d.subscribe(observer);
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return create(observableSource, j2, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource, long j2, TimeUnit timeUnit, Scheduler scheduler, int i2) {
        return d(observableSource, new l(i2, j2, timeUnit, scheduler));
    }
}

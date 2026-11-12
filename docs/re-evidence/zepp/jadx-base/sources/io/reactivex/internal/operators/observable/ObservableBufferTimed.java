package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableBufferTimed<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U> {
    public final long a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final Callable<U> e;
    public final int f;
    public final boolean g;

    public static final class a<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public final Callable<U> F;
        public final long G;
        public final TimeUnit H;
        public final int I;
        public final boolean J;
        public final Scheduler.Worker K;
        public U L;
        public Disposable M;
        public Disposable N;
        public long O;
        public long P;

        public a(Observer<? super U> observer, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.F = callable;
            this.G = j;
            this.H = timeUnit;
            this.I = i;
            this.J = z;
            this.K = worker;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Observer<? super U> observer, U u) {
            observer.onNext(u);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.N.dispose();
            this.K.dispose();
            synchronized (this) {
                this.L = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u;
            this.K.dispose();
            synchronized (this) {
                u = this.L;
                this.L = null;
            }
            this.queue.offer(u);
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                this.L = null;
            }
            this.downstream.onError(th);
            this.K.dispose();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            synchronized (this) {
                U u = this.L;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.I) {
                    return;
                }
                this.L = null;
                this.O++;
                if (this.J) {
                    this.M.dispose();
                }
                fastPathOrderedEmit(u, false, this);
                try {
                    U u2 = (U) ObjectHelper.requireNonNull(this.F.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.L = u2;
                        this.P++;
                    }
                    if (this.J) {
                        Scheduler.Worker worker = this.K;
                        long j = this.G;
                        this.M = worker.schedulePeriodically(this, j, j, this.H);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                    dispose();
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.N, disposable)) {
                this.N = disposable;
                try {
                    this.L = (U) ObjectHelper.requireNonNull(this.F.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.K;
                    long j = this.G;
                    this.M = worker.schedulePeriodically(this, j, j, this.H);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    EmptyDisposable.error(th, this.downstream);
                    this.K.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) ObjectHelper.requireNonNull(this.F.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.L;
                    if (u2 != null && this.O == this.P) {
                        this.L = u;
                        fastPathOrderedEmit(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                dispose();
                this.downstream.onError(th);
            }
        }
    }

    public static final class b<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public final Callable<U> F;
        public final long G;
        public final TimeUnit H;
        public final Scheduler I;
        public Disposable J;
        public U K;
        public final AtomicReference<Disposable> L;

        public b(Observer<? super U> observer, Callable<U> callable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            super(observer, new MpscLinkedQueue());
            this.L = new AtomicReference<>();
            this.F = callable;
            this.G = j;
            this.H = timeUnit;
            this.I = scheduler;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Observer<? super U> observer, U u) {
            this.downstream.onNext((Object) u);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.L);
            this.J.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.L.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.K;
                this.K = null;
            }
            if (u != null) {
                this.queue.offer(u);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainLoop(this.queue, this.downstream, false, null, this);
                }
            }
            DisposableHelper.dispose(this.L);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            synchronized (this) {
                this.K = null;
            }
            this.downstream.onError(th);
            DisposableHelper.dispose(this.L);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            synchronized (this) {
                U u = this.K;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.J, disposable)) {
                this.J = disposable;
                try {
                    this.K = (U) ObjectHelper.requireNonNull(this.F.call(), "The buffer supplied is null");
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    Scheduler scheduler = this.I;
                    long j = this.G;
                    Disposable disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j, j, this.H);
                    if (this.L.compareAndSet(null, disposableSchedulePeriodicallyDirect)) {
                        return;
                    }
                    disposableSchedulePeriodicallyDirect.dispose();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    dispose();
                    EmptyDisposable.error(th, this.downstream);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u;
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.F.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.K;
                    if (u != null) {
                        this.K = u2;
                    }
                }
                if (u == null) {
                    DisposableHelper.dispose(this.L);
                } else {
                    fastPathEmit(u, false, this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
                dispose();
            }
        }
    }

    public static final class c<T, U extends Collection<? super T>> extends QueueDrainObserver<T, U, U> implements Runnable, Disposable {
        public final Callable<U> F;
        public final long G;
        public final long H;
        public final TimeUnit I;
        public final Scheduler.Worker J;
        public final List<U> K;
        public Disposable L;

        public final class a implements Runnable {
            private final U a;

            public a(U u) {
                this.a = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.K.remove(this.a);
                }
                c cVar = c.this;
                cVar.fastPathOrderedEmit(this.a, false, cVar.J);
            }
        }

        public final class b implements Runnable {
            private final U a;

            public b(U u) {
                this.a = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.K.remove(this.a);
                }
                c cVar = c.this;
                cVar.fastPathOrderedEmit(this.a, false, cVar.J);
            }
        }

        public c(Observer<? super U> observer, Callable<U> callable, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(observer, new MpscLinkedQueue());
            this.F = callable;
            this.G = j;
            this.H = j2;
            this.I = timeUnit;
            this.J = worker;
            this.K = new LinkedList();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Observer<? super U> observer, U u) {
            observer.onNext(u);
        }

        public void d() {
            synchronized (this) {
                this.K.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            d();
            this.L.dispose();
            this.J.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.K);
                this.K.clear();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.queue.offer((U) ((Collection) it2.next()));
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainLoop(this.queue, this.downstream, false, this.J, this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.done = true;
            d();
            this.downstream.onError(th);
            this.J.dispose();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            synchronized (this) {
                Iterator<U> it2 = this.K.iterator();
                while (it2.hasNext()) {
                    it2.next().add(t);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.L, disposable)) {
                this.L = disposable;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.F.call(), "The buffer supplied is null");
                    this.K.add((U) collection);
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.J;
                    long j = this.H;
                    worker.schedulePeriodically(this, j, j, this.I);
                    this.J.schedule(new b(collection), this.G, this.I);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    EmptyDisposable.error(th, this.downstream);
                    this.J.dispose();
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                return;
            }
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.F.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    this.K.add((U) collection);
                    this.J.schedule(new a(collection), this.G, this.I);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
                dispose();
            }
        }
    }

    public ObservableBufferTimed(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i, boolean z) {
        super(observableSource);
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = callable;
        this.f = i;
        this.g = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (this.a == this.b && this.f == Integer.MAX_VALUE) {
            this.source.subscribe(new b(new SerializedObserver(observer), this.e, this.a, this.c, this.d));
            return;
        }
        Scheduler.Worker workerCreateWorker = this.d.createWorker();
        if (this.a == this.b) {
            this.source.subscribe(new a(new SerializedObserver(observer), this.e, this.a, this.c, this.f, this.g, workerCreateWorker));
        } else {
            this.source.subscribe(new c(new SerializedObserver(observer), this.e, this.a, this.b, this.c, workerCreateWorker));
        }
    }
}

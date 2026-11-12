package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableWindowTimed<T> extends io.reactivex.internal.operators.observable.a<T, Observable<T>> {
    public final long a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final long e;
    public final int f;
    public final boolean g;

    public static final class a<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {
        public final long F;
        public final TimeUnit G;
        public final Scheduler H;
        public final int I;
        public final boolean J;
        public final long K;
        public final Scheduler.Worker L;
        public long M;
        public long N;
        public Disposable O;
        public UnicastSubject<T> P;
        public volatile boolean Q;
        public final AtomicReference<Disposable> R;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableWindowTimed$a$a, reason: collision with other inner class name */
        public static final class RunnableC1148a implements Runnable {
            public final long a;
            public final a<?> b;

            public RunnableC1148a(long j, a<?> aVar) {
                this.a = j;
                this.b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a<?> aVar = this.b;
                if (aVar.cancelled) {
                    aVar.Q = true;
                    aVar.c();
                } else {
                    aVar.queue.offer(this);
                }
                if (aVar.enter()) {
                    aVar.d();
                }
            }
        }

        public a(Observer<? super Observable<T>> observer, long j, TimeUnit timeUnit, Scheduler scheduler, int i, long j2, boolean z) {
            super(observer, new MpscLinkedQueue());
            this.R = new AtomicReference<>();
            this.F = j;
            this.G = timeUnit;
            this.H = scheduler;
            this.I = i;
            this.K = j2;
            this.J = z;
            if (z) {
                this.L = scheduler.createWorker();
            } else {
                this.L = null;
            }
        }

        public void c() {
            DisposableHelper.dispose(this.R);
            Scheduler.Worker worker = this.L;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void d() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject<T> unicastSubject = this.P;
            int iLeave = 1;
            while (!this.Q) {
                boolean z = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof RunnableC1148a;
                if (z && (z2 || z3)) {
                    this.P = null;
                    mpscLinkedQueue.clear();
                    c();
                    Throwable th = this.error;
                    if (th != null) {
                        unicastSubject.onError(th);
                        return;
                    } else {
                        unicastSubject.onComplete();
                        return;
                    }
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z3) {
                    RunnableC1148a runnableC1148a = (RunnableC1148a) objPoll;
                    if (this.J || this.N == runnableC1148a.a) {
                        unicastSubject.onComplete();
                        this.M = 0L;
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.I);
                        this.P = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                    long j = this.M + 1;
                    if (j >= this.K) {
                        this.N++;
                        this.M = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.I);
                        this.P = unicastSubject;
                        this.downstream.onNext(unicastSubject);
                        if (this.J) {
                            Disposable disposable = this.R.get();
                            disposable.dispose();
                            Scheduler.Worker worker = this.L;
                            RunnableC1148a runnableC1148a2 = new RunnableC1148a(this.N, this);
                            long j2 = this.F;
                            Disposable disposableSchedulePeriodically = worker.schedulePeriodically(runnableC1148a2, j2, j2, this.G);
                            if (!this.R.compareAndSet(disposable, disposableSchedulePeriodically)) {
                                disposableSchedulePeriodically.dispose();
                            }
                        }
                    } else {
                        this.M = j;
                    }
                }
            }
            this.O.dispose();
            mpscLinkedQueue.clear();
            c();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                d();
            }
            this.downstream.onComplete();
            c();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                d();
            }
            this.downstream.onError(th);
            c();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.Q) {
                return;
            }
            if (fastEnter()) {
                UnicastSubject<T> unicastSubject = this.P;
                unicastSubject.onNext(t);
                long j = this.M + 1;
                if (j >= this.K) {
                    this.N++;
                    this.M = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.I);
                    this.P = unicastSubjectCreate;
                    this.downstream.onNext(unicastSubjectCreate);
                    if (this.J) {
                        this.R.get().dispose();
                        Scheduler.Worker worker = this.L;
                        RunnableC1148a runnableC1148a = new RunnableC1148a(this.N, this);
                        long j2 = this.F;
                        DisposableHelper.replace(this.R, worker.schedulePeriodically(runnableC1148a, j2, j2, this.G));
                    }
                } else {
                    this.M = j;
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
            d();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            Disposable disposableSchedulePeriodicallyDirect;
            if (DisposableHelper.validate(this.O, disposable)) {
                this.O = disposable;
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.I);
                this.P = unicastSubjectCreate;
                observer.onNext(unicastSubjectCreate);
                RunnableC1148a runnableC1148a = new RunnableC1148a(this.N, this);
                if (this.J) {
                    Scheduler.Worker worker = this.L;
                    long j = this.F;
                    disposableSchedulePeriodicallyDirect = worker.schedulePeriodically(runnableC1148a, j, j, this.G);
                } else {
                    Scheduler scheduler = this.H;
                    long j2 = this.F;
                    disposableSchedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(runnableC1148a, j2, j2, this.G);
                }
                DisposableHelper.replace(this.R, disposableSchedulePeriodicallyDirect);
            }
        }
    }

    public static final class b<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Observer<T>, Disposable, Runnable {
        public static final Object N = new Object();
        public final long F;
        public final TimeUnit G;
        public final Scheduler H;
        public final int I;
        public Disposable J;
        public UnicastSubject<T> K;
        public final AtomicReference<Disposable> L;
        public volatile boolean M;

        public b(Observer<? super Observable<T>> observer, long j, TimeUnit timeUnit, Scheduler scheduler, int i) {
            super(observer, new MpscLinkedQueue());
            this.L = new AtomicReference<>();
            this.F = j;
            this.G = timeUnit;
            this.H = scheduler;
            this.I = i;
        }

        public void a() {
            DisposableHelper.dispose(this.L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void b() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject<T> unicastSubject = this.K;
            int iLeave = 1;
            while (true) {
                boolean z = this.M;
                boolean z2 = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                if (z2 && (objPoll == null || objPoll == N)) {
                    break;
                }
                if (objPoll == null) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (objPoll == N) {
                    unicastSubject.onComplete();
                    if (z) {
                        this.J.dispose();
                    } else {
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.I);
                        this.K = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                }
            }
            this.K = null;
            mpscLinkedQueue.clear();
            a();
            Throwable th = this.error;
            if (th != null) {
                unicastSubject.onError(th);
            } else {
                unicastSubject.onComplete();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                b();
            }
            a();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                b();
            }
            a();
            this.downstream.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.M) {
                return;
            }
            if (fastEnter()) {
                this.K.onNext(t);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            b();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.J, disposable)) {
                this.J = disposable;
                this.K = UnicastSubject.create(this.I);
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                observer.onNext(this.K);
                if (this.cancelled) {
                    return;
                }
                Scheduler scheduler = this.H;
                long j = this.F;
                DisposableHelper.replace(this.L, scheduler.schedulePeriodicallyDirect(this, j, j, this.G));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.M = true;
                a();
            }
            this.queue.offer((U) N);
            if (enter()) {
                b();
            }
        }
    }

    public static final class c<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {
        public final long F;
        public final long G;
        public final TimeUnit H;
        public final Scheduler.Worker I;
        public final int J;
        public final List<UnicastSubject<T>> K;
        public Disposable L;
        public volatile boolean M;

        public final class a implements Runnable {
            private final UnicastSubject<T> a;

            public a(UnicastSubject<T> unicastSubject) {
                this.a = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a(this.a);
            }
        }

        public static final class b<T> {
            public final UnicastSubject<T> a;
            public final boolean b;

            public b(UnicastSubject<T> unicastSubject, boolean z) {
                this.a = unicastSubject;
                this.b = z;
            }
        }

        public c(Observer<? super Observable<T>> observer, long j, long j2, TimeUnit timeUnit, Scheduler.Worker worker, int i) {
            super(observer, new MpscLinkedQueue());
            this.F = j;
            this.G = j2;
            this.H = timeUnit;
            this.I = worker;
            this.J = i;
            this.K = new LinkedList();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void a(UnicastSubject<T> unicastSubject) {
            this.queue.offer((U) new b(unicastSubject, false));
            if (enter()) {
                c();
            }
        }

        public void b() {
            this.I.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void c() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            List<UnicastSubject<T>> list = this.K;
            int iLeave = 1;
            while (!this.M) {
                boolean z = this.done;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof b;
                if (z && (z2 || z3)) {
                    mpscLinkedQueue.clear();
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
                    b();
                    list.clear();
                    return;
                }
                if (z2) {
                    iLeave = leave(-iLeave);
                    if (iLeave == 0) {
                        return;
                    }
                } else if (z3) {
                    b bVar = (b) objPoll;
                    if (!bVar.b) {
                        list.remove(bVar.a);
                        bVar.a.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.M = true;
                        }
                    } else if (!this.cancelled) {
                        UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.J);
                        list.add(unicastSubjectCreate);
                        observer.onNext(unicastSubjectCreate);
                        this.I.schedule(new a(unicastSubjectCreate), this.F, this.H);
                    }
                } else {
                    Iterator<UnicastSubject<T>> it4 = list.iterator();
                    while (it4.hasNext()) {
                        it4.next().onNext(objPoll);
                    }
                }
            }
            this.L.dispose();
            b();
            mpscLinkedQueue.clear();
            list.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                c();
            }
            this.downstream.onComplete();
            b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                c();
            }
            this.downstream.onError(th);
            b();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (fastEnter()) {
                Iterator<UnicastSubject<T>> it2 = this.K.iterator();
                while (it2.hasNext()) {
                    it2.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer((U) t);
                if (!enter()) {
                    return;
                }
            }
            c();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.L, disposable)) {
                this.L = disposable;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject<T> unicastSubjectCreate = UnicastSubject.create(this.J);
                this.K.add(unicastSubjectCreate);
                this.downstream.onNext(unicastSubjectCreate);
                this.I.schedule(new a(unicastSubjectCreate), this.F, this.H);
                Scheduler.Worker worker = this.I;
                long j = this.G;
                worker.schedulePeriodically(this, j, j, this.H);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object bVar = new b(UnicastSubject.create(this.J), true);
            if (!this.cancelled) {
                this.queue.offer((U) bVar);
            }
            if (enter()) {
                c();
            }
        }
    }

    public ObservableWindowTimed(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, long j3, int i, boolean z) {
        super(observableSource);
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = j3;
        this.f = i;
        this.g = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        long j = this.a;
        long j2 = this.b;
        if (j != j2) {
            this.source.subscribe(new c(serializedObserver, j, j2, this.c, this.d.createWorker(), this.f));
            return;
        }
        long j3 = this.e;
        if (j3 == Long.MAX_VALUE) {
            this.source.subscribe(new b(serializedObserver, this.a, this.c, this.d, this.f));
        } else {
            this.source.subscribe(new a(serializedObserver, j, this.c, this.d, this.f, j3, this.g));
        }
    }
}

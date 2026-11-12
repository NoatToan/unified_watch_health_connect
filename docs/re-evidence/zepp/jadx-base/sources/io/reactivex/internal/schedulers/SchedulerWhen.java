package io.reactivex.internal.schedulers;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public class SchedulerWhen extends Scheduler implements Disposable {
    public static final Disposable e = new g();
    public static final Disposable f = Disposables.disposed();
    private final Scheduler b;
    private final FlowableProcessor<Flowable<Completable>> c;
    private Disposable d;

    public static final class a implements Function<f, Completable> {
        public final Scheduler.Worker a;

        /* JADX INFO: renamed from: io.reactivex.internal.schedulers.SchedulerWhen$a$a, reason: collision with other inner class name */
        public final class C1153a extends Completable {
            public final f a;

            public C1153a(f fVar) {
                this.a = fVar;
            }

            @Override // io.reactivex.Completable
            public void subscribeActual(CompletableObserver completableObserver) {
                completableObserver.onSubscribe(this.a);
                this.a.a(a.this.a, completableObserver);
            }
        }

        public a(Scheduler.Worker worker) {
            this.a = worker;
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Completable apply(f fVar) {
            return new C1153a(fVar);
        }
    }

    public static class b extends f {
        private final Runnable a;
        private final long b;
        private final TimeUnit c;

        public b(Runnable runnable, long j, TimeUnit timeUnit) {
            this.a = runnable;
            this.b = j;
            this.c = timeUnit;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.f
        public Disposable b(Scheduler.Worker worker, CompletableObserver completableObserver) {
            return worker.schedule(new d(this.a, completableObserver), this.b, this.c);
        }
    }

    public static class c extends f {
        private final Runnable a;

        public c(Runnable runnable) {
            this.a = runnable;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.f
        public Disposable b(Scheduler.Worker worker, CompletableObserver completableObserver) {
            return worker.schedule(new d(this.a, completableObserver));
        }
    }

    public static class d implements Runnable {
        public final CompletableObserver a;
        public final Runnable b;

        public d(Runnable runnable, CompletableObserver completableObserver) {
            this.b = runnable;
            this.a = completableObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
            } finally {
                this.a.onComplete();
            }
        }
    }

    public static abstract class f extends AtomicReference<Disposable> implements Disposable {
        public f() {
            super(SchedulerWhen.e);
        }

        public void a(Scheduler.Worker worker, CompletableObserver completableObserver) {
            Disposable disposable;
            Disposable disposable2 = get();
            if (disposable2 != SchedulerWhen.f && disposable2 == (disposable = SchedulerWhen.e)) {
                Disposable disposableB = b(worker, completableObserver);
                if (compareAndSet(disposable, disposableB)) {
                    return;
                }
                disposableB.dispose();
            }
        }

        public abstract Disposable b(Scheduler.Worker worker, CompletableObserver completableObserver);

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable;
            Disposable disposable2 = SchedulerWhen.f;
            do {
                disposable = get();
                if (disposable == SchedulerWhen.f) {
                    return;
                }
            } while (!compareAndSet(disposable, disposable2));
            if (disposable != SchedulerWhen.e) {
                disposable.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get().isDisposed();
        }
    }

    public static final class g implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SchedulerWhen(Function<Flowable<Flowable<Completable>>, Completable> function, Scheduler scheduler) {
        this.b = scheduler;
        FlowableProcessor serialized = UnicastProcessor.create().toSerialized();
        this.c = serialized;
        try {
            this.d = ((Completable) function.apply(serialized)).subscribe();
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        Scheduler.Worker workerCreateWorker = this.b.createWorker();
        FlowableProcessor<T> serialized = UnicastProcessor.create().toSerialized();
        Flowable<Completable> map = serialized.map(new a(workerCreateWorker));
        e eVar = new e(serialized, workerCreateWorker);
        this.c.onNext(map);
        return eVar;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.d.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.d.isDisposed();
    }

    public static final class e extends Scheduler.Worker {
        private final AtomicBoolean a = new AtomicBoolean();
        private final FlowableProcessor<f> b;
        private final Scheduler.Worker c;

        public e(FlowableProcessor<f> flowableProcessor, Scheduler.Worker worker) {
            this.b = flowableProcessor;
            this.c = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.a.compareAndSet(false, true)) {
                this.b.onComplete();
                this.c.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.a.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            b bVar = new b(runnable, j, timeUnit);
            this.b.onNext(bVar);
            return bVar;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            c cVar = new c(runnable);
            this.b.onNext(cVar);
            return cVar;
        }
    }
}

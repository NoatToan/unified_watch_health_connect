package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.schedulers.ComputationScheduler;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.NewThreadScheduler;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import io.reactivex.internal.schedulers.SingleScheduler;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes22.dex */
public final class Schedulers {

    @NonNull
    public static final Scheduler a = RxJavaPlugins.initSingleScheduler(new h());

    @NonNull
    public static final Scheduler b = RxJavaPlugins.initComputationScheduler(new b());

    @NonNull
    public static final Scheduler c = RxJavaPlugins.initIoScheduler(new c());

    @NonNull
    public static final Scheduler d = TrampolineScheduler.instance();

    @NonNull
    public static final Scheduler e = RxJavaPlugins.initNewThreadScheduler(new f());

    public static final class a {
        public static final Scheduler a = new ComputationScheduler();
    }

    public static final class b implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Scheduler call() throws Exception {
            return a.a;
        }
    }

    public static final class c implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Scheduler call() throws Exception {
            return d.a;
        }
    }

    public static final class d {
        public static final Scheduler a = new IoScheduler();
    }

    public static final class e {
        public static final Scheduler a = new NewThreadScheduler();
    }

    public static final class f implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Scheduler call() throws Exception {
            return e.a;
        }
    }

    public static final class g {
        public static final Scheduler a = new SingleScheduler();
    }

    public static final class h implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Scheduler call() throws Exception {
            return g.a;
        }
    }

    private Schedulers() {
        throw new IllegalStateException("No instances!");
    }

    @NonNull
    public static Scheduler computation() {
        return RxJavaPlugins.onComputationScheduler(b);
    }

    @NonNull
    public static Scheduler from(@NonNull Executor executor) {
        return new ExecutorScheduler(executor);
    }

    @NonNull
    public static Scheduler io() {
        return RxJavaPlugins.onIoScheduler(c);
    }

    @NonNull
    public static Scheduler newThread() {
        return RxJavaPlugins.onNewThreadScheduler(e);
    }

    public static void shutdown() {
        computation().shutdown();
        io().shutdown();
        newThread().shutdown();
        single().shutdown();
        trampoline().shutdown();
        SchedulerPoolFactory.shutdown();
    }

    @NonNull
    public static Scheduler single() {
        return RxJavaPlugins.onSingleScheduler(a);
    }

    public static void start() {
        computation().start();
        io().start();
        newThread().start();
        single().start();
        trampoline().start();
        SchedulerPoolFactory.start();
    }

    @NonNull
    public static Scheduler trampoline() {
        return d;
    }
}

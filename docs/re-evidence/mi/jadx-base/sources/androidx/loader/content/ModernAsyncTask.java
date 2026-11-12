package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ModernAsyncTask<Params, Progress, Result> {
    public static final ThreadFactory f;
    public static final BlockingQueue<Runnable> g;
    public static final Executor h;
    public static f i;
    public static volatile Executor j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<Params, Result> f2595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FutureTask<Result> f2596b;
    public volatile Status c = Status.PENDING;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f2597a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f2597a.getAndIncrement());
        }
    }

    public class b extends g<Params, Result> {
        public b() {
        }

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
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            ModernAsyncTask.this.e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) ModernAsyncTask.this.b(this.f2603a);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.l(result);
                return result;
            } catch (Throwable th) {
                try {
                    ModernAsyncTask.this.d.set(true);
                    throw th;
                } catch (Throwable th2) {
                    ModernAsyncTask.this.l(result);
                    throw th2;
                }
            }
        }
    }

    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                ModernAsyncTask.this.m(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                ModernAsyncTask.this.m(null);
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2600a;

        static {
            int[] iArr = new int[Status.values().length];
            f2600a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2600a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class e<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ModernAsyncTask f2601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Data[] f2602b;

        public e(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f2601a = modernAsyncTask;
            this.f2602b = dataArr;
        }
    }

    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f2601a.d(eVar.f2602b[0]);
            } else {
                if (i != 2) {
                    return;
                }
                eVar.f2601a.k(eVar.f2602b);
            }
        }
    }

    public static abstract class g<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Params[] f2603a;
    }

    static {
        a aVar = new a();
        f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        h = threadPoolExecutor;
        j = threadPoolExecutor;
    }

    public ModernAsyncTask() {
        b bVar = new b();
        this.f2595a = bVar;
        this.f2596b = new c(bVar);
    }

    public static Handler e() {
        f fVar;
        synchronized (ModernAsyncTask.class) {
            try {
                if (i == null) {
                    i = new f();
                }
                fVar = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public final boolean a(boolean z) {
        this.d.set(true);
        return this.f2596b.cancel(z);
    }

    public abstract Result b(Params... paramsArr);

    public final ModernAsyncTask<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.c == Status.PENDING) {
            this.c = Status.RUNNING;
            j();
            this.f2595a.f2603a = paramsArr;
            executor.execute(this.f2596b);
            return this;
        }
        int i2 = d.f2600a[this.c.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.c = Status.FINISHED;
    }

    public final boolean f() {
        return this.d.get();
    }

    public void g() {
    }

    public void h(Result result) {
        g();
    }

    public void i(Result result) {
    }

    public void j() {
    }

    public void k(Progress... progressArr) {
    }

    public Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public void m(Result result) {
        if (this.e.get()) {
            return;
        }
        l(result);
    }
}

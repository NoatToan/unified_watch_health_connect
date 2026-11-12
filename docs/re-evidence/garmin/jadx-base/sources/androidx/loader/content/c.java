package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<Params, Progress, Result> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadPoolExecutor f8089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f8090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile ThreadPoolExecutor f8091h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f8092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0116c f8093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile g f8094c = g.PENDING;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f8095d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f8096e = new AtomicBoolean();

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f8097a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f8097a.getAndIncrement());
        }
    }

    public class b extends h<Params, Result> {
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
        public final Result call() {
            c cVar = c.this;
            cVar.f8096e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) cVar.a();
                Binder.flushPendingCommands();
                cVar.d(result);
                return result;
            } catch (Throwable th3) {
                try {
                    cVar.f8095d.set(true);
                    throw th3;
                } catch (Throwable th4) {
                    cVar.d(result);
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    public class C0116c extends FutureTask<Result> {
        public C0116c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            c cVar = c.this;
            try {
                Result result = get();
                if (cVar.f8096e.get()) {
                    return;
                }
                cVar.d(result);
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                if (cVar.f8096e.get()) {
                    return;
                }
                cVar.d(null);
            } catch (ExecutionException e4) {
                q2.v("An error occurred while executing doInBackground()", e4.getCause());
            } catch (Throwable th3) {
                q2.v("An error occurred while executing doInBackground()", th3);
            }
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8100a;

        static {
            int[] iArr = new int[g.values().length];
            f8100a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8100a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class e<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f8101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Data[] f8102b;

        public e(c cVar, Data... dataArr) {
            this.f8101a = cVar;
            this.f8102b = dataArr;
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
        public final void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i14 = message.what;
            if (i14 != 1) {
                if (i14 != 2) {
                    return;
                }
                eVar.f8101a.getClass();
            } else {
                c cVar = eVar.f8101a;
                Object obj = eVar.f8102b[0];
                if (cVar.f8095d.get()) {
                    cVar.b(obj);
                } else {
                    cVar.c(obj);
                }
                cVar.f8094c = g.FINISHED;
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static abstract class h<Params, Result> implements Callable<Result> {
    }

    static {
        a aVar = new a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
        f8089f = threadPoolExecutor;
        f8091h = threadPoolExecutor;
    }

    public c() {
        b bVar = new b();
        this.f8092a = bVar;
        this.f8093b = new C0116c(bVar);
    }

    public abstract Object a();

    public void b(Result result) {
    }

    public void c(Result result) {
    }

    public final void d(Object obj) {
        f fVar;
        synchronized (c.class) {
            try {
                if (f8090g == null) {
                    f8090g = new f();
                }
                fVar = f8090g;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        fVar.obtainMessage(1, new e(this, obj)).sendToTarget();
    }
}

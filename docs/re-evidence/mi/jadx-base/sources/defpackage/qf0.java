package defpackage;

import android.os.Process;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class qf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f31463b;

    @VisibleForTesting
    public final Map<pzd, c> c;
    public final ReferenceQueue<ub8<?>> d;
    public ub8.a e;
    public volatile boolean f;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: qf0$a$a, reason: collision with other inner class name */
        public class RunnableC1088a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f31464a;

            public RunnableC1088a(Runnable runnable) {
                this.f31464a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f31464a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC1088a(runnable), "glide-active-resources");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qf0.this.b();
        }
    }

    @VisibleForTesting
    public static final class c extends WeakReference<ub8<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pzd f31467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f31468b;
        public kqk<?> c;

        public c(pzd pzdVar, ub8<?> ub8Var, ReferenceQueue<? super ub8<?>> referenceQueue, boolean z) {
            super(ub8Var, referenceQueue);
            this.f31467a = (pzd) a6i.d(pzdVar);
            this.c = (ub8Var.d() && z) ? (kqk) a6i.d(ub8Var.c()) : null;
            this.f31468b = ub8Var.d();
        }

        public void a() {
            this.c = null;
            clear();
        }
    }

    public qf0(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }

    public synchronized void a(pzd pzdVar, ub8<?> ub8Var) {
        c cVarPut = this.c.put(pzdVar, new c(pzdVar, ub8Var, this.d, this.f31462a));
        if (cVarPut != null) {
            cVarPut.a();
        }
    }

    public void b() {
        while (!this.f) {
            try {
                c((c) this.d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(c cVar) {
        kqk<?> kqkVar;
        synchronized (this) {
            this.c.remove(cVar.f31467a);
            if (cVar.f31468b && (kqkVar = cVar.c) != null) {
                this.e.a(cVar.f31467a, new ub8<>(kqkVar, true, false, cVar.f31467a, this.e));
            }
        }
    }

    public synchronized void d(pzd pzdVar) {
        c cVarRemove = this.c.remove(pzdVar);
        if (cVarRemove != null) {
            cVarRemove.a();
        }
    }

    public synchronized ub8<?> e(pzd pzdVar) {
        c cVar = this.c.get(pzdVar);
        if (cVar == null) {
            return null;
        }
        ub8<?> ub8Var = cVar.get();
        if (ub8Var == null) {
            c(cVar);
        }
        return ub8Var;
    }

    public void f(ub8.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.e = aVar;
            }
        }
    }

    @VisibleForTesting
    public qf0(boolean z, Executor executor) {
        this.c = new HashMap();
        this.d = new ReferenceQueue<>();
        this.f31462a = z;
        this.f31463b = executor;
        executor.execute(new b());
    }
}

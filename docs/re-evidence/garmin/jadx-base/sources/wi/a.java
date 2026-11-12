package wi;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f185271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f185272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f185273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReferenceQueue<p<?>> f185274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f185275e;

    /* JADX INFO: renamed from: wi.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC3437a implements ThreadFactory {

        /* JADX INFO: renamed from: wi.a$a$a, reason: collision with other inner class name */
        public class RunnableC3438a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f185276a;

            public RunnableC3438a(ThreadFactoryC3437a threadFactoryC3437a, Runnable runnable) {
                this.f185276a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(10);
                this.f185276a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC3438a(this, runnable), "glide-active-resources");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.getClass();
            while (true) {
                try {
                    aVar.b((c) aVar.f185274d.remove());
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static final class c extends WeakReference<p<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ui.e f185278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f185279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u<?> f185280c;

        public c(ui.e eVar, p<?> pVar, ReferenceQueue<? super p<?>> referenceQueue, boolean z14) {
            u<?> uVar;
            super(pVar, referenceQueue);
            qj.l.c(eVar, "Argument must not be null");
            this.f185278a = eVar;
            if (pVar.f185433a && z14) {
                uVar = pVar.f185435c;
                qj.l.c(uVar, "Argument must not be null");
            } else {
                uVar = null;
            }
            this.f185280c = uVar;
            this.f185279b = pVar.f185433a;
        }
    }

    public a(boolean z14, Executor executor) {
        this.f185273c = new HashMap();
        this.f185274d = new ReferenceQueue<>();
        this.f185271a = z14;
        this.f185272b = executor;
        executor.execute(new b());
    }

    public final synchronized void a(ui.e eVar, p<?> pVar) {
        c cVar = (c) this.f185273c.put(eVar, new c(eVar, pVar, this.f185274d, this.f185271a));
        if (cVar != null) {
            cVar.f185280c = null;
            cVar.clear();
        }
    }

    public final void b(c cVar) {
        u<?> uVar;
        synchronized (this) {
            this.f185273c.remove(cVar.f185278a);
            if (cVar.f185279b && (uVar = cVar.f185280c) != null) {
                this.f185275e.a(cVar.f185278a, new p<>(uVar, true, false, cVar.f185278a, this.f185275e));
            }
        }
    }

    public a(boolean z14) {
        this(z14, Executors.newSingleThreadExecutor(new ThreadFactoryC3437a()));
    }
}

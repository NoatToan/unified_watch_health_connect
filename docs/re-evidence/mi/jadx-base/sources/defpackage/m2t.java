package defpackage;

import android.content.Context;
import android.os.Looper;
import com.amap.api.col.p0003sl.ik;
import com.amap.api.col.p0003sl.j1;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class m2t extends j2t implements Thread.UncaughtExceptionHandler {
    public static ExecutorService e;
    public static WeakReference<Context> g;
    public Context d;
    public static Set<Integer> f = Collections.synchronizedSet(new HashSet());
    public static final ThreadFactory h = new b();

    public class a extends f7t {
        public final /* synthetic */ o0t d;
        public final /* synthetic */ boolean e;

        public a(o0t o0tVar, boolean z) {
            this.d = o0tVar;
            this.e = z;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            try {
                synchronized (Looper.getMainLooper()) {
                    k2t.e(this.d);
                }
                if (this.e) {
                    o2t.e(m2t.this.d);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f25694a = new AtomicInteger(1);

        public class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                try {
                    super.run();
                } catch (Throwable unused) {
                }
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new a(runnable, "pama#" + this.f25694a.getAndIncrement());
        }
    }

    public m2t(Context context) {
        this.d = context;
        try {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            this.f22362a = defaultUncaughtExceptionHandler;
            if (defaultUncaughtExceptionHandler == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.f22363b = true;
                return;
            }
            String string = defaultUncaughtExceptionHandler.toString();
            if (!string.startsWith("com.amap.apis.utils.core.dynamiccore") && (string.indexOf("com.amap.api") != -1 || string.indexOf("com.loc") != -1)) {
                this.f22363b = false;
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.f22363b = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static synchronized m2t g(Context context, o0t o0tVar) throws ik {
        if (o0tVar == null) {
            throw new ik("sdk info is null");
        }
        if (o0tVar.a() == null || "".equals(o0tVar.a())) {
            throw new ik("sdk name is invalid");
        }
        try {
            if (!f.add(Integer.valueOf(o0tVar.hashCode()))) {
                return (m2t) j2t.c;
            }
            j2t j2tVar = j2t.c;
            if (j2tVar == null) {
                j2t.c = new m2t(context);
            } else {
                j2tVar.f22363b = false;
            }
            j2t j2tVar2 = j2t.c;
            j2tVar2.c(o0tVar, j2tVar2.f22363b);
            return (m2t) j2t.c;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            g = new WeakReference<>(context.getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    public static void i(Context context, o0t o0tVar, String str, String str2, String str3) {
        o2t.g(context, o0tVar, str, 0, str2, str3);
    }

    public static void j(o0t o0tVar, String str, ik ikVar) {
        if (ikVar != null) {
            l(o0tVar, str, ikVar.c(), ikVar.d(), ikVar.e(), ikVar.b());
        }
    }

    public static void k(o0t o0tVar, String str, String str2, String str3, String str4) {
        l(o0tVar, str, str2, str3, "", str4);
    }

    public static void l(o0t o0tVar, String str, String str2, String str3, String str4, String str5) {
        try {
            if (j2t.c != null) {
                j2t.c.b(o0tVar, "path:" + str + ",type:" + str2 + ",gsid:" + str3 + ",csid:" + str4 + ",code:" + str5, "networkError");
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void m() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            ExecutorService executorService = e;
            if (executorService != null) {
                executorService.shutdown();
            }
            q4t.d();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            if (j2t.c != null) {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                j2t j2tVar = j2t.c;
                if (defaultUncaughtExceptionHandler == j2tVar && (uncaughtExceptionHandler = j2tVar.f22362a) != null) {
                    Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
            }
            j2t.c = null;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void n(Context context, o0t o0tVar, String str, String str2, String str3) {
        o2t.g(context, o0tVar, str, 1, str2, str3);
    }

    public static void o(o0t o0tVar, String str, String str2) {
        try {
            j2t j2tVar = j2t.c;
            if (j2tVar != null) {
                j2tVar.b(o0tVar, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void q() {
        WeakReference<Context> weakReference = g;
        if (weakReference != null && weakReference.get() != null) {
            k2t.c(g.get());
            return;
        }
        j2t j2tVar = j2t.c;
        if (j2tVar != null) {
            j2tVar.a();
        }
    }

    public static void r(Throwable th, String str, String str2) {
        try {
            j2t j2tVar = j2t.c;
            if (j2tVar != null) {
                j2tVar.d(th, 1, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public static synchronized ExecutorService s() {
        try {
            ExecutorService executorService = e;
            if (executorService == null || executorService.isShutdown()) {
                e = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), h);
            }
        } catch (Throwable unused) {
        }
        return e;
    }

    public static synchronized m2t t() {
        return (m2t) j2t.c;
    }

    @Override // defpackage.j2t
    public final void a() {
        k2t.c(this.d);
    }

    @Override // defpackage.j2t
    public final void b(o0t o0tVar, String str, String str2) {
        o2t.l(o0tVar, this.d, str2, str);
    }

    @Override // defpackage.j2t
    public final void c(o0t o0tVar, boolean z) {
        try {
            j1.h().b(new a(o0tVar, z));
        } catch (RejectedExecutionException unused) {
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // defpackage.j2t
    public final void d(Throwable th, int i, String str, String str2) {
        o2t.i(this.d, th, i, str, str2);
    }

    public final void p(Throwable th, String str, String str2) {
        if (th == null) {
            return;
        }
        try {
            d(th, 1, str, str2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th == null) {
            return;
        }
        d(th, 0, null, null);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f22362a;
        if (uncaughtExceptionHandler != null) {
            try {
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            } catch (Throwable unused) {
            }
            this.f22362a.uncaughtException(thread, th);
        }
    }
}

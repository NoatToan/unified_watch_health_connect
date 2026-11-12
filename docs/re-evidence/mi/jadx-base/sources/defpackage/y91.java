package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class y91 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y91 f39943b = new y91();
    public static final int c;
    public static final int d;
    public static final int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f39944a = new b();

    public static class b implements Executor {
        public b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors;
        d = iAvailableProcessors + 1;
        e = (iAvailableProcessors * 2) + 1;
    }

    @SuppressLint({"NewApi"})
    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        threadPoolExecutor.allowCoreThreadTimeOut(z);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(d, e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f39943b.f39944a;
    }
}

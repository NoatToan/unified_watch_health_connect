package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class fx5 extends n1p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18337a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f18338b = Executors.newFixedThreadPool(4, new a());
    public volatile Handler c;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f18339a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f18339a.getAndIncrement());
            return thread;
        }
    }

    @RequiresApi(28)
    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // defpackage.n1p
    public void a(Runnable runnable) {
        this.f18338b.execute(runnable);
    }

    @Override // defpackage.n1p
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // defpackage.n1p
    public void d(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.f18337a) {
                try {
                    if (this.c == null) {
                        this.c = e(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.c.post(runnable);
    }
}

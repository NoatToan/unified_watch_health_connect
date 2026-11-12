package defpackage;

import androidx.annotation.RequiresApi;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class aid implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Executor f1051b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f1052a = Executors.newFixedThreadPool(2, new a());

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f1053a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f1053a.getAndIncrement())));
            return thread;
        }
    }

    public static Executor a() {
        if (f1051b != null) {
            return f1051b;
        }
        synchronized (aid.class) {
            try {
                if (f1051b == null) {
                    f1051b = new aid();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1051b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f1052a.execute(runnable);
    }
}

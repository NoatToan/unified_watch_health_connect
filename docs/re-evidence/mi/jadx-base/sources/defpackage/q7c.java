package defpackage;

import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class q7c implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Executor f31197b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f31198a = Executors.newSingleThreadExecutor(new a());

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    public static Executor a() {
        if (f31197b != null) {
            return f31197b;
        }
        synchronized (q7c.class) {
            try {
                if (f31197b == null) {
                    f31197b = new q7c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f31197b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f31198a.execute(runnable);
    }
}

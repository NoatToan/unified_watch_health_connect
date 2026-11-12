package k0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile e f101937b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f101938a = Executors.newSingleThreadExecutor(new a(this));

    public class a implements ThreadFactory {
        public a(e eVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f101938a.execute(runnable);
    }
}

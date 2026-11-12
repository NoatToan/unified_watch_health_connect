package k0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile f f101939b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f101940a = Executors.newFixedThreadPool(2, new a(this));

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f101941a = new AtomicInteger(0);

        public a(f fVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-camerax_io_" + this.f101941a.getAndIncrement());
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f101940a.execute(runnable);
    }
}

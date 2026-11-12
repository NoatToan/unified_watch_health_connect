package k0;

import b0.n;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class a implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f101923b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f101924a = Executors.newFixedThreadPool(2, new ThreadFactoryC1956a(this));

    /* JADX INFO: renamed from: k0.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC1956a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f101925a = new AtomicInteger(0);

        public ThreadFactoryC1956a(a aVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(new n(runnable, 1));
            Locale locale = Locale.US;
            thread.setName("CameraX-camerax_audio_" + this.f101925a.getAndIncrement());
            return thread;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f101924a.execute(runnable);
    }
}

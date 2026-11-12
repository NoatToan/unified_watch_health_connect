package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public class iw implements ThreadFactory {
    private static final AtomicInteger e = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38112a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f38113c = new AtomicInteger(1);
    private final ThreadGroup d;

    public iw() {
        SecurityManager securityManager = System.getSecurityManager();
        this.d = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f38112a = "lottie-" + e.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.d, runnable, this.f38112a + this.f38113c.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}

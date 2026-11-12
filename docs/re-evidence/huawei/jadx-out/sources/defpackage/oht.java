package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class oht implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f44347a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44348c;
    private final ThreadGroup d;
    private final String e;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.d, runnable, this.e + this.f44347a.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int priority = thread.getPriority();
        int i = this.f44348c;
        if (priority != i) {
            thread.setPriority(i);
        }
        return thread;
    }

    public oht(String str, int i) {
        this.f44347a = new AtomicInteger(1);
        this.f44348c = i;
        SecurityManager securityManager = System.getSecurityManager();
        this.d = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.e = "PPS-" + str + "-pool-thread-";
    }

    public oht(String str) {
        this(str, 5);
    }
}

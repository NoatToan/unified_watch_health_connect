package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class ayq implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f802c;
    private final ThreadGroup d;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.d, runnable, this.f802c + this.f800a.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int priority = thread.getPriority();
        int i = this.f801b;
        if (priority != i) {
            thread.setPriority(i);
        }
        return thread;
    }

    public ayq(String str, int i) {
        this.f800a = new AtomicInteger(1);
        this.f801b = i;
        SecurityManager securityManager = System.getSecurityManager();
        this.d = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.f802c = "PPS-" + str + "-threadpool-";
    }

    public ayq(String str) {
        this(str, 5);
    }
}

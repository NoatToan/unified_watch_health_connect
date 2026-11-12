package defpackage;

import com.alibaba.android.arouter.facade.template.ILogger;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class gx5 implements ThreadFactory {
    public static final AtomicInteger d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f19425a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadGroup f19426b;
    public final String c;

    public class a implements Thread.UncaughtExceptionHandler {
        public a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            kb.c.info(ILogger.defaultTag, "Running task appeared exception! Thread [" + thread.getName() + "], because [" + th.getMessage() + "]");
        }
    }

    public gx5() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f19426b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        this.c = "ARouter task pool No." + d.getAndIncrement() + ", thread No.";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.c + this.f19425a.getAndIncrement();
        kb.c.info(ILogger.defaultTag, "Thread production, name is [" + str + "]");
        Thread thread = new Thread(this.f19426b, runnable, str, 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        thread.setUncaughtExceptionHandler(new a());
        return thread;
    }
}

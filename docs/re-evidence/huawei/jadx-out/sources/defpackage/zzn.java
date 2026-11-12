package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes20.dex */
public class zzn implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadGroup f54823a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadGroup f54824c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54825b;
    private final ThreadGroup d;
    private final AtomicInteger e = new AtomicInteger(1);

    protected boolean b() {
        return false;
    }

    static {
        ThreadGroup threadGroup = new ThreadGroup("Californium");
        f54824c = threadGroup;
        ThreadGroup threadGroup2 = new ThreadGroup("Scandium");
        f54823a = threadGroup2;
        threadGroup.setDaemon(false);
        threadGroup2.setDaemon(false);
    }

    public zzn(String str, ThreadGroup threadGroup) {
        this.d = threadGroup == null ? f54824c : threadGroup;
        this.f54825b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.d, runnable, this.f54825b + this.e.getAndIncrement(), 0L);
        thread.setDaemon(b());
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}

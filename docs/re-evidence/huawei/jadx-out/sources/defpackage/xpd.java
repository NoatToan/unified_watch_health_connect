package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes20.dex */
public final class xpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f53268a = new byte[0];
    private static volatile xpd d;
    private final ExecutorService e;

    private xpd() {
        xnd.d("ThreadPoolManager", "ThreadPool init");
        this.e = Executors.newSingleThreadExecutor();
    }

    public static xpd e() {
        if (d == null) {
            synchronized (f53268a) {
                if (d == null) {
                    d = new xpd();
                }
            }
        }
        return d;
    }

    public ExecutorService a() {
        return this.e;
    }

    public void c(Runnable runnable) {
        this.e.execute(runnable);
    }
}

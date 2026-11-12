package defpackage;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class pe4 extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile pe4 f30311a;

    public static class a extends Thread {
        public a(String str, Runnable runnable) {
            super(runnable);
            String str2 = str + "-" + getId();
            setName(str2);
            jpe.h("ConnectThreadPool", "InnerThread name:" + str2);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
        }
    }

    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30312a;

        public b(String str) {
            this.f30312a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            jpe.h("ConnectThreadPool", "new thread " + runnable);
            return new a(this.f30312a, runnable);
        }
    }

    public pe4(int i, int i2, long j, TimeUnit timeUnit, String str) {
        super(i, i2, j, timeUnit, new SynchronousQueue(), new b(str));
    }

    public static void a(int i, int i2, long j, TimeUnit timeUnit, String str) {
        if (f30311a == null) {
            synchronized (pe4.class) {
                try {
                    if (f30311a == null) {
                        f30311a = new pe4(i, i2, j, timeUnit, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

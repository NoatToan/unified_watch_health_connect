package i7;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public class n implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91944b;

    public static class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91945a;

        public a(Runnable runnable, String str, int i14) {
            super(runnable, str);
            this.f91945a = i14;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f91945a);
            super.run();
        }
    }

    public n(String str, int i14) {
        this.f91943a = str;
        this.f91944b = i14;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f91943a, this.f91944b);
    }
}

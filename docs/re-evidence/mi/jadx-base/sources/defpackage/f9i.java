package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class f9i implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17564b;
    public final boolean c;
    public final AtomicInteger d = new AtomicInteger(1);

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f17565a;

        public a(Runnable runnable) {
            this.f17565a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(f9i.this.f17563a);
            } catch (Throwable unused) {
            }
            this.f17565a.run();
        }
    }

    public f9i(int i, String str, boolean z) {
        this.f17563a = i;
        this.f17564b = str;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        a aVar = new a(runnable);
        if (this.c) {
            str = this.f17564b + "-" + this.d.getAndIncrement();
        } else {
            str = this.f17564b;
        }
        return new Thread(aVar, str);
    }
}

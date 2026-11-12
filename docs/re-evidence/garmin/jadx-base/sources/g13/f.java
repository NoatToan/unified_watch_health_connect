package g13;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f74982c;

    public static final class a extends Thread {
        public a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public f(String str, int i14, boolean z14) {
        this.f74980a = str;
        this.f74981b = i14;
        this.f74982c = z14;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f74980a + '-' + incrementAndGet();
        Thread aVar = this.f74982c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f74981b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return am.j.o(this.f74980a, "]", new StringBuilder("RxThreadFactory["));
    }

    public f(String str, int i14) {
        this(str, i14, false);
    }

    public f(String str) {
        this(str, 5, false);
    }
}

package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class gns implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f19171b = new AtomicInteger();
    public final String c;

    public class a extends Thread {
        public a(Runnable runnable, String str) {
            super(runnable, str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setPriority(gns.this.f19170a);
            super.run();
        }
    }

    public gns(String str, int i) {
        this.c = str;
        this.f19170a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new a(runnable, "AIVS-" + this.c + '-' + this.f19171b.getAndIncrement());
    }
}

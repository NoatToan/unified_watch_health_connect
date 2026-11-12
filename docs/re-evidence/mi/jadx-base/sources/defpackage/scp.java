package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class scp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33511a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Deque<Runnable> f33512b = new ArrayDeque();
    public final Executor c;

    public scp(Executor executor) {
        this.c = (Executor) b6i.g(executor);
    }

    public synchronized void a(Runnable runnable) {
        try {
            if (this.f33511a) {
                this.f33512b.add(runnable);
            } else {
                this.c.execute(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(Runnable runnable) {
        this.f33512b.remove(runnable);
    }
}

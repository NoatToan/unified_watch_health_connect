package o43;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public class c implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lock f129092b;

    public /* synthetic */ c(Lock lock, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new ReentrantLock() : lock);
    }

    @Override // o43.l
    public void lock() {
        this.f129092b.lock();
    }

    @Override // o43.l
    public final void unlock() {
        this.f129092b.unlock();
    }

    public c(Lock lock) {
        lock.getClass();
        this.f129092b = lock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

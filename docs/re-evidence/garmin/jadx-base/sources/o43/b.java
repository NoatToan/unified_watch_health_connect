package o43;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f129090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<InterruptedException, Unit> f129091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Lock lock, Runnable runnable, e23.l<? super InterruptedException, Unit> lVar) {
        super(lock);
        lock.getClass();
        runnable.getClass();
        lVar.getClass();
        this.f129090c = runnable;
        this.f129091d = lVar;
    }

    @Override // o43.c, o43.l
    public final void lock() {
        while (!this.f129092b.tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f129090c.run();
            } catch (InterruptedException e4) {
                this.f129091d.invoke(e4);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Runnable runnable, e23.l<? super InterruptedException, Unit> lVar) {
        this(new ReentrantLock(), runnable, lVar);
        runnable.getClass();
        lVar.getClass();
    }
}

package g13;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends AtomicReference<Future<?>> implements s03.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FutureTask<Void> f74941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FutureTask<Void> f74942d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f74943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f74944b;

    static {
        w03.a.f fVar = w03.a.f181170a;
        f74941c = new FutureTask<>(fVar, null);
        f74942d = new FutureTask<>(fVar, null);
    }

    public a(Runnable runnable) {
        this.f74943a = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f74941c) {
                return;
            }
            if (future2 == f74942d) {
                future.cancel(this.f74944b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // s03.b
    public final boolean b() {
        Future<?> future = get();
        return future == f74941c || future == f74942d;
    }

    @Override // s03.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f74941c || future == (futureTask = f74942d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f74944b != Thread.currentThread());
    }
}

package g13;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends a implements Callable<Void> {
    public g(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        FutureTask<Void> futureTask = a.f74941c;
        this.f74944b = Thread.currentThread();
        try {
            this.f74943a.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f74944b = null;
        }
    }
}

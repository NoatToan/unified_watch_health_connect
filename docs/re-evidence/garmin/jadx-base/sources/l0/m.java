package l0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class m<V> implements ListenableFuture<V> {

    public static class a<V> extends m<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f107816a;

        public a(Throwable th3) {
            this.f107816a = th3;
        }

        @Override // java.util.concurrent.Future
        public final V get() throws ExecutionException {
            throw new ExecutionException(this.f107816a);
        }

        public final String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f107816a + "]]";
        }
    }

    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        public b(Throwable th3) {
            super(th3);
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    public static final class c<V> extends m<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f107817b = new c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final V f107818a;

        public c(V v14) {
            this.f107818a = v14;
        }

        @Override // java.util.concurrent.Future
        public final V get() {
            return this.f107818a;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(super.toString());
            sb3.append("[status=SUCCESS, result=[");
            return am.j.k(this.f107818a, "]]", sb3);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            runnable.toString();
            executor.toString();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z14) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j8, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}

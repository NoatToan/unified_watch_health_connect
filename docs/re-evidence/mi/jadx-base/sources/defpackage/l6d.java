package defpackage;

import androidx.annotation.RequiresApi;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class l6d<V> implements lhe<V> {

    public static class a<V> extends l6d<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f24718a;

        public a(Throwable th) {
            this.f24718a = th;
        }

        @Override // defpackage.l6d, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f24718a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f24718a + "]]";
        }
    }

    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        public b(Throwable th) {
            super(th);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    public static final class c<V> extends l6d<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l6d<Object> f24719b = new c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final V f24720a;

        public c(V v) {
            this.f24720a = v;
        }

        @Override // defpackage.l6d, java.util.concurrent.Future
        public V get() {
            return this.f24720a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f24720a + "]]";
        }
    }

    public static <V> lhe<V> a() {
        return c.f24719b;
    }

    @Override // defpackage.lhe
    public void addListener(Runnable runnable, Executor executor) {
        g6i.g(runnable);
        g6i.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            zpe.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        g6i.g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}

package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ParametricNullness;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class aqv<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ParametricNullness
    private final V f701b;
    static final ListenableFuture<?> d = new aqv(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final aqy f700a = new aqy(aqv.class);

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    aqv(@ParametricNullness V v) {
        this.f701b = v;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f700a.b().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    @ParametricNullness
    public V get() {
        return this.f701b;
    }

    @Override // java.util.concurrent.Future
    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        Preconditions.checkNotNull(timeUnit);
        return get();
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f701b + "]]";
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class b<V> extends AbstractFuture.TrustedFuture<V> {
        b(Throwable th) {
            setException(th);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class c<V> extends AbstractFuture.TrustedFuture<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        static final c<Object> f702b;

        static {
            f702b = AbstractFuture.GENERATE_CANCELLATION_CAUSES ? null : new c<>();
        }

        c() {
            cancel(false);
        }
    }
}

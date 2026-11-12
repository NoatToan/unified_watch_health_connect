package t53;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.Uninterruptibles;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o53.l1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt53/b;", "T", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lo53/l1;", "jobToCancel", "<init>", "(Lo53/l1;)V", "kotlinx-coroutines-guava"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<T> implements ListenableFuture<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f162556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SettableFuture<Object> f162557b = SettableFuture.create();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f162558c;

    public b(l1 l1Var) {
        this.f162556a = l1Var;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f162557b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z14) {
        if (!this.f162557b.cancel(z14)) {
            return false;
        }
        this.f162556a.c(null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Future
    public final T get() throws Throwable {
        T t7 = (T) this.f162557b.get();
        if (t7 instanceof a) {
            throw new CancellationException().initCause(((a) t7).f162555a);
        }
        return t7;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        boolean z14;
        SettableFuture<Object> settableFuture = this.f162557b;
        if (settableFuture.isCancelled()) {
            return true;
        }
        if (settableFuture.isDone() && !this.f162558c) {
            try {
                z14 = Uninterruptibles.getUninterruptibly(settableFuture) instanceof a;
            } catch (CancellationException unused) {
                z14 = true;
            } catch (ExecutionException unused2) {
                this.f162558c = true;
                z14 = false;
            }
            if (z14) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f162557b.isDone();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("[status=");
        SettableFuture<Object> settableFuture = this.f162557b;
        if (settableFuture.isDone()) {
            try {
                Object uninterruptibly = Uninterruptibles.getUninterruptibly(settableFuture);
                if (uninterruptibly instanceof a) {
                    sb3.append("CANCELLED, cause=[" + ((a) uninterruptibly).f162555a + ']');
                } else {
                    sb3.append("SUCCESS, result=[" + uninterruptibly + ']');
                }
            } catch (CancellationException unused) {
                sb3.append("CANCELLED");
            } catch (ExecutionException e4) {
                sb3.append("FAILURE, cause=[" + e4.getCause() + ']');
            } catch (Throwable th3) {
                sb3.append("UNKNOWN, cause=[" + th3.getClass() + " thrown from get()]");
            }
        } else {
            sb3.append("PENDING, delegate=[" + settableFuture + ']');
        }
        sb3.append(']');
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Future
    public final T get(long j8, TimeUnit timeUnit) throws Throwable {
        T t7 = (T) this.f162557b.get(j8, timeUnit);
        if (t7 instanceof a) {
            throw new CancellationException().initCause(((a) t7).f162555a);
        }
        return t7;
    }
}

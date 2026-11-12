package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
final class arm<V> extends FluentFuture.TrustedFuture<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private ListenableFuture<V> f716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private ScheduledFuture<?> f717c;

    static <V> ListenableFuture<V> d(ListenableFuture<V> listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        arm armVar = new arm(listenableFuture);
        b bVar = new b(armVar);
        armVar.f717c = scheduledExecutorService.schedule(bVar, j, timeUnit);
        listenableFuture.addListener(bVar, aqx.e());
        return armVar;
    }

    private arm(ListenableFuture<V> listenableFuture) {
        this.f716b = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    static final class b<V> implements Runnable {

        @CheckForNull
        arm<V> d;

        b(arm<V> armVar) {
            this.d = armVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture<? extends V> listenableFuture;
            arm<V> armVar = this.d;
            if (armVar == null || (listenableFuture = ((arm) armVar).f716b) == null) {
                return;
            }
            this.d = null;
            if (!listenableFuture.isDone()) {
                try {
                    ScheduledFuture scheduledFuture = ((arm) armVar).f717c;
                    ((arm) armVar).f717c = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                            }
                        } catch (Throwable th) {
                            armVar.setException(new e(str));
                            throw th;
                        }
                    }
                    armVar.setException(new e(str + ": " + listenableFuture));
                    listenableFuture.cancel(true);
                    return;
                } catch (Throwable th2) {
                    listenableFuture.cancel(true);
                    throw th2;
                }
            }
            armVar.setFuture(listenableFuture);
        }
    }

    static final class e extends TimeoutException {
        private e(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            synchronized (this) {
                setStackTrace(new StackTraceElement[0]);
            }
            return this;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    public String pendingToString() {
        ListenableFuture<V> listenableFuture = this.f716b;
        ScheduledFuture<?> scheduledFuture = this.f717c;
        if (listenableFuture == null) {
            return null;
        }
        String str = "inputFuture=[" + listenableFuture + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public void afterDone() {
        maybePropagateCancellationTo(this.f716b);
        ScheduledFuture<?> scheduledFuture = this.f717c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f716b = null;
        this.f717c = null;
    }
}

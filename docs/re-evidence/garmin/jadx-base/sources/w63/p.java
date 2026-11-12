package w63;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lw63/p;", "Lw63/h0;", "delegate", "<init>", "(Lw63/h0;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class p extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f183390a;

    public p(h0 h0Var) {
        h0Var.getClass();
        this.f183390a = h0Var;
    }

    @Override // w63.h0
    public final void awaitSignal(Condition condition) throws InterruptedIOException {
        condition.getClass();
        this.f183390a.awaitSignal(condition);
    }

    @Override // w63.h0
    public final void cancel() {
        this.f183390a.cancel();
    }

    @Override // w63.h0
    public final h0 clearDeadline() {
        return this.f183390a.clearDeadline();
    }

    @Override // w63.h0
    public final h0 clearTimeout() {
        return this.f183390a.clearTimeout();
    }

    @Override // w63.h0
    public final long deadlineNanoTime() {
        return this.f183390a.deadlineNanoTime();
    }

    @Override // w63.h0
    /* JADX INFO: renamed from: hasDeadline */
    public final boolean getHasDeadline() {
        return this.f183390a.getHasDeadline();
    }

    @Override // w63.h0
    public final void throwIfReached() throws InterruptedIOException {
        this.f183390a.throwIfReached();
    }

    @Override // w63.h0
    public final h0 timeout(long j8, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f183390a.timeout(j8, timeUnit);
    }

    @Override // w63.h0
    /* JADX INFO: renamed from: timeoutNanos */
    public final long getTimeoutNanos() {
        return this.f183390a.getTimeoutNanos();
    }

    @Override // w63.h0
    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        obj.getClass();
        this.f183390a.waitUntilNotified(obj);
    }

    @Override // w63.h0
    public final h0 deadlineNanoTime(long j8) {
        return this.f183390a.deadlineNanoTime(j8);
    }
}

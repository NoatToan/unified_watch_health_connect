package h7;

import android.os.OutcomeReceiver;
import ch.qos.logback.core.CoreConstants;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import o13.q;
import o13.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lh7/f;", "R", "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lt13/d;", "continuation", "<init>", "(Lt13/d;)V", "core-ktx"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.d<R> f82326a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(t13.d<? super R> dVar) {
        super(false);
        this.f82326a = dVar;
    }

    public final void onError(E e4) {
        if (compareAndSet(false, true)) {
            int i14 = q.f128596b;
            this.f82326a.resumeWith(r.a(e4));
        }
    }

    public final void onResult(R r14) {
        if (compareAndSet(false, true)) {
            int i14 = q.f128596b;
            this.f82326a.resumeWith(r14);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

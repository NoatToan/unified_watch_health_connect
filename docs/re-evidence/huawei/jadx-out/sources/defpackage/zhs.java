package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class zhs {
    public static final void a(CoroutineContext coroutineContext, CancellationException cancellationException) {
        C0468zhz.c(coroutineContext, cancellationException);
    }

    public static final void b(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        cancelFutureOnCancellation.c(cancellableContinuation, future);
    }

    public static final void c(Job job) {
        C0468zhz.a(job);
    }

    public static final CompletableJob d(Job job) {
        return C0468zhz.d(job);
    }

    public static final void e(CoroutineContext coroutineContext) {
        C0468zhz.c(coroutineContext);
    }
}

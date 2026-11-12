package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.createFailure;
import defpackage.yyt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "R", "run"}, k = 3, mv = {1, 8, 0}, xi = 176)
public final class ListenableFutureKt$await$2$1 implements Runnable {
    final /* synthetic */ CancellableContinuation<R> $cancellableContinuation;
    final /* synthetic */ ListenableFuture<R> $this_await;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation continuation = this.$cancellableContinuation;
            yyt.c cVar = yyt.f53903b;
            continuation.resumeWith(yyt.e(this.$this_await.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.cancel(cause);
                return;
            }
            Continuation continuation2 = this.$cancellableContinuation;
            yyt.c cVar2 = yyt.f53903b;
            continuation2.resumeWith(yyt.e(createFailure.a(cause)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFutureKt$await$2$1(CancellableContinuation<? super R> cancellableContinuation, ListenableFuture<R> listenableFuture) {
        this.$cancellableContinuation = cancellableContinuation;
        this.$this_await = listenableFuture;
    }
}

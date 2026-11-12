package androidx.concurrent.futures;

import defpackage.lhe;
import defpackage.p10;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/concurrent/futures/ToContinuation;", "T", "Ljava/lang/Runnable;", "", "run", "()V", "Llhe;", "futureToObserve", "Llhe;", "getFutureToObserve", "()Llhe;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "<init>", "(Llhe;Lkotlinx/coroutines/CancellableContinuation;)V", "concurrent-futures-ktx"}, k = 1, mv = {1, 4, 0})
final class ToContinuation<T> implements Runnable {

    @NotNull
    private final CancellableContinuation<T> continuation;

    @NotNull
    private final lhe<T> futureToObserve;

    /* JADX WARN: Multi-variable type inference failed */
    public ToContinuation(@NotNull lhe<T> lheVar, @NotNull CancellableContinuation<? super T> cancellableContinuation) {
        this.futureToObserve = lheVar;
        this.continuation = cancellableContinuation;
    }

    @NotNull
    public final CancellableContinuation<T> getContinuation() {
        return this.continuation;
    }

    @NotNull
    public final lhe<T> getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            CancellableContinuation.DefaultImpls.cancel$default(this.continuation, null, 1, null);
            return;
        }
        try {
            CancellableContinuation<T> cancellableContinuation = this.continuation;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m886constructorimpl(p10.j(this.futureToObserve)));
        } catch (ExecutionException e) {
            CancellableContinuation<T> cancellableContinuation2 = this.continuation;
            Throwable thNonNullCause = ListenableFutureKt.nonNullCause(e);
            Result.Companion companion2 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(thNonNullCause)));
        }
    }
}

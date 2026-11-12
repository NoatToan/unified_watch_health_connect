package kotlinx.coroutines.guava;

import defpackage.l9q;
import defpackage.lhe;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003B#\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/guava/ToContinuation;", "T", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "run", "()V", "Llhe;", "futureToObserve", "Llhe;", "getFutureToObserve", "()Llhe;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "<init>", "(Llhe;Lkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-guava"}, k = 1, mv = {1, 8, 0})
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
            cancellableContinuation.resumeWith(Result.m886constructorimpl(l9q.a(this.futureToObserve)));
        } catch (ExecutionException e) {
            CancellableContinuation<T> cancellableContinuation2 = this.continuation;
            Result.Companion companion2 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m886constructorimpl(ResultKt.createFailure(ListenableFutureKt.nonNullCause(e))));
        }
    }
}

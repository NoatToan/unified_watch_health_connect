package kotlinx.coroutines.guava;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.AbstractCoroutine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0010R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/guava/ListenableFutureCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "future", "Lkotlinx/coroutines/guava/JobListenableFuture;", "onCancelled", "", "cause", "", "handled", "", "onCompleted", "value", "(Ljava/lang/Object;)V", "kotlinx-coroutines-guava"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ListenableFutureCoroutine<T> extends AbstractCoroutine<T> {

    @JvmField
    @NotNull
    public final JobListenableFuture<T> future;

    public ListenableFutureCoroutine(@NotNull CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.future = new JobListenableFuture<>(this);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(@NotNull Throwable cause, boolean handled) {
        this.future.completeExceptionallyOrCancel(cause);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(T value) {
        this.future.complete(value);
    }
}

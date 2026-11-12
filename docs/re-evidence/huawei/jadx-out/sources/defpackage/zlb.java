package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/guava/ToContinuation;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "futureToObserve", "Lcom/google/common/util/concurrent/ListenableFuture;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "(Lcom/google/common/util/concurrent/ListenableFuture;Lkotlinx/coroutines/CancellableContinuation;)V", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "getFutureToObserve", "()Lcom/google/common/util/concurrent/ListenableFuture;", "run", "", "kotlinx-coroutines-guava"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class zlb<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ListenableFuture<T> f54260a;
    private final CancellableContinuation<T> d;

    /* JADX WARN: Multi-variable type inference failed */
    public zlb(ListenableFuture<T> listenableFuture, CancellableContinuation<? super T> cancellableContinuation) {
        this.f54260a = listenableFuture;
        this.d = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f54260a.isCancelled()) {
            CancellableContinuation.b.e(this.d, null, 1, null);
            return;
        }
        try {
            CancellableContinuation<T> cancellableContinuation = this.d;
            yyt.c cVar = yyt.f53903b;
            cancellableContinuation.resumeWith(yyt.e(aro.d(this.f54260a)));
        } catch (ExecutionException e) {
            CancellableContinuation<T> cancellableContinuation2 = this.d;
            yyt.c cVar2 = yyt.f53903b;
            cancellableContinuation2.resumeWith(yyt.e(createFailure.a(asDeferred.d(e))));
        }
    }
}

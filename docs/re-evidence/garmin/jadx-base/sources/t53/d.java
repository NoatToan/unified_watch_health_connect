package t53;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.Uninterruptibles;
import java.util.concurrent.ExecutionException;
import o13.q;
import o53.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt53/d;", "T", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lcom/google/common/util/concurrent/ListenableFuture;", "futureToObserve", "Lo53/j;", "continuation", "<init>", "(Lcom/google/common/util/concurrent/ListenableFuture;Lo53/j;)V", "kotlinx-coroutines-guava"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListenableFuture<T> f162562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j<T> f162563b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(ListenableFuture<T> listenableFuture, j<? super T> jVar) {
        this.f162562a = listenableFuture;
        this.f162563b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<T> listenableFuture = this.f162562a;
        boolean zIsCancelled = listenableFuture.isCancelled();
        j<T> jVar = this.f162563b;
        if (zIsCancelled) {
            jVar.u(null);
            return;
        }
        try {
            int i14 = q.f128596b;
            jVar.resumeWith(Uninterruptibles.getUninterruptibly(listenableFuture));
        } catch (ExecutionException e4) {
            int i15 = q.f128596b;
            Throwable cause = e4.getCause();
            cause.getClass();
            jVar.resumeWith(new q.b(cause));
        }
    }
}

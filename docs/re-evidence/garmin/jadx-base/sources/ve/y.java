package ve;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lve/y;", "T", "Ljava/lang/Runnable;", "Lcom/google/common/util/concurrent/ListenableFuture;", "futureToObserve", "Lo53/j;", "continuation", "<init>", "(Lcom/google/common/util/concurrent/ListenableFuture;Lo53/j;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListenableFuture<T> f177631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.j<T> f177632b;

    /* JADX WARN: Multi-variable type inference failed */
    public y(ListenableFuture<T> listenableFuture, o53.j<? super T> jVar) {
        listenableFuture.getClass();
        jVar.getClass();
        this.f177631a = listenableFuture;
        this.f177632b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t7;
        ListenableFuture<T> listenableFuture = this.f177631a;
        boolean zIsCancelled = listenableFuture.isCancelled();
        o53.j<T> jVar = this.f177632b;
        if (zIsCancelled) {
            jVar.u(null);
            return;
        }
        try {
            int i14 = o13.q.f128596b;
            int i15 = d1.f177564a;
            boolean z14 = false;
            while (true) {
                try {
                    t7 = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z14 = true;
                } catch (Throwable th3) {
                    if (z14) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            }
            if (z14) {
                Thread.currentThread().interrupt();
            }
            jVar.resumeWith(t7);
        } catch (ExecutionException e4) {
            int i16 = o13.q.f128596b;
            int i17 = d1.f177564a;
            Throwable cause = e4.getCause();
            cause.getClass();
            jVar.resumeWith(new o13.q.b(cause));
        }
    }
}

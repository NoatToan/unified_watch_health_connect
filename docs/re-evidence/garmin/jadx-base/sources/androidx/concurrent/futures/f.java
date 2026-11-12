package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import o13.q;
import o53.j;
import p005kotlin.KotlinNullPointerException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/concurrent/futures/f;", "T", "Ljava/lang/Runnable;", "Lcom/google/common/util/concurrent/ListenableFuture;", "futureToObserve", "Lo53/j;", "continuation", "<init>", "(Lcom/google/common/util/concurrent/ListenableFuture;Lo53/j;)V", "concurrent-futures-ktx"}, k = 1, mv = {1, 4, 0})
public final class f<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListenableFuture<T> f6089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j<T> f6090b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(ListenableFuture<T> listenableFuture, j<? super T> jVar) {
        listenableFuture.getClass();
        jVar.getClass();
        this.f6089a = listenableFuture;
        this.f6090b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture<T> listenableFuture = this.f6089a;
        boolean zIsCancelled = listenableFuture.isCancelled();
        j<T> jVar = this.f6090b;
        if (zIsCancelled) {
            jVar.u(null);
            return;
        }
        try {
            int i14 = q.f128596b;
            jVar.resumeWith(a.getUninterruptibly(listenableFuture));
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause != null) {
                int i15 = q.f128596b;
                jVar.resumeWith(new q.b(cause));
            } else {
                KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                s.j(kotlinNullPointerException, s.class.getName());
                throw kotlinNullPointerException;
            }
        }
    }
}

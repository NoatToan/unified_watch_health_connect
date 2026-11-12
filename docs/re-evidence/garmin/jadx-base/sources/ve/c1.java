package ve;

import androidx.work.impl.WorkerStoppedException;
import com.google.common.util.concurrent.ListenableFuture;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class c1 implements e23.l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.work.d f177560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture<Object> f177561b;

    public c1(androidx.work.d dVar, ListenableFuture<Object> listenableFuture) {
        this.f177560a = dVar;
        this.f177561b = listenableFuture;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        Throwable th4 = th3;
        if (th4 instanceof WorkerStoppedException) {
            this.f177560a.f11471c.compareAndSet(-256, ((WorkerStoppedException) th4).getReason());
        }
        this.f177561b.cancel(false);
        return Unit.INSTANCE;
    }
}

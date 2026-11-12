package y92;

import com.google.common.util.concurrent.ListenableFuture;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class h implements e23.l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture<Object> f195330a;

    public h(ListenableFuture<Object> listenableFuture) {
        this.f195330a = listenableFuture;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        this.f195330a.cancel(false);
        return Unit.INSTANCE;
    }
}

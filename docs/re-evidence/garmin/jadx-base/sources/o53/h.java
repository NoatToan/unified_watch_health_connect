package o53;

import java.util.concurrent.Future;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo53/h;", "Lo53/i;", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future<?> f129343a;

    public h(Future<?> future) {
        this.f129343a = future;
    }

    @Override // o53.i
    public final void a(Throwable th3) {
        this.f129343a.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f129343a + ']';
    }
}

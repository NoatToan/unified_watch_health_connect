package y92;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<Object> f195328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture<Object> f195329b;

    public g(o53.j<Object> jVar, ListenableFuture<Object> listenableFuture) {
        this.f195328a = jVar;
        this.f195329b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o53.j<Object> jVar = this.f195328a;
        try {
            int i14 = o13.q.f128596b;
            jVar.resumeWith(this.f195329b.get());
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                cause = th3;
            }
            if (th3 instanceof CancellationException) {
                jVar.u(cause);
            } else {
                int i15 = o13.q.f128596b;
                jVar.resumeWith(new o13.q.b(cause));
            }
        }
    }
}

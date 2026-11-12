package ve;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f177564a = 0;

    static {
        ue.u.b("WorkerWrapper");
    }

    public static final Object a(ListenableFuture listenableFuture, androidx.work.d dVar, v13.i iVar) throws Throwable {
        V v14;
        try {
            if (!listenableFuture.isDone()) {
                o53.k kVar = new o53.k(u13.f.b(iVar), 1);
                kVar.q();
                listenableFuture.addListener(new y(listenableFuture, kVar), ue.j.INSTANCE);
                kVar.r(new c1(dVar, listenableFuture));
                Object objP = kVar.p();
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                return objP;
            }
            boolean z14 = false;
            while (true) {
                try {
                    v14 = listenableFuture.get();
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
            return v14;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            cause.getClass();
            throw cause;
        }
    }
}

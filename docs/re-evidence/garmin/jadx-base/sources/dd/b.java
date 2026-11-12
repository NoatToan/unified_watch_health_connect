package dd;

import o53.j0;
import v.h;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static androidx.concurrent.futures.b.d a(j0 j0Var) {
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = h.class;
        try {
            j0Var.J(new a(aVar, j0Var));
            aVar.f6079a = "Deferred.asListenableFuture";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        return dVar;
    }
}

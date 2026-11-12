package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w9.d f8053a = new w9.d();

    public static final w9.a a(u1 u1Var) {
        w9.a aVar;
        t13.g gVarH;
        u1Var.getClass();
        synchronized (f8053a) {
            aVar = (w9.a) u1Var.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                try {
                    try {
                        x53.c cVar = o53.s0.f129406a;
                        gVarH = u53.o.f168762a.H();
                    } catch (o13.o unused) {
                        gVarH = t13.h.f161748a;
                    }
                } catch (IllegalStateException unused2) {
                    gVarH = t13.h.f161748a;
                }
                w9.a aVar2 = new w9.a(gVarH.plus(ge1.b.h()));
                u1Var.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }
}

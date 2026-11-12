package p3;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {
    public static final e1 a(t13.g gVar) {
        e1 e1Var = (e1) gVar.get(e1.f135069m0);
        if (e1Var != null) {
            return e1Var;
        }
        vb.h.z("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final Object b(e23.l lVar, v13.i iVar) {
        return a(iVar.getF129302c()).v(new f1(lVar), iVar);
    }
}

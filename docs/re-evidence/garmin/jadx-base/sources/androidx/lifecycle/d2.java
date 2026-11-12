package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class d2 {
    public static final Object a(b0 b0Var, b0.b bVar, boolean z14, o53.t1 t1Var, e23.a aVar, v13.i iVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(iVar), 1);
        kVar.q();
        c2 c2Var = new c2(bVar, b0Var, kVar, aVar);
        if (z14) {
            t1Var.dispatch(t13.h.f161748a, new z1(b0Var, c2Var));
        } else {
            b0Var.a(c2Var);
        }
        kVar.r(new b2(t1Var, b0Var, c2Var));
        Object objP = kVar.p();
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }
}

package s53;

import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t13.d[] f157467a = new t13.d[0];

    public static final Object a(t13.g gVar, Object obj, Object obj2, e23.p pVar, t13.d dVar) {
        Object objInvoke;
        Object objC = u53.z.c(gVar, obj2);
        try {
            a0 a0Var = new a0(dVar, gVar);
            if (pVar == null) {
                objInvoke = u13.f.c(pVar, obj, a0Var);
            } else {
                y0.e(2, pVar);
                objInvoke = pVar.invoke(obj, a0Var);
            }
            u53.z.a(gVar, objC);
            if (objInvoke == u13.a.COROUTINE_SUSPENDED) {
                dVar.getClass();
            }
            return objInvoke;
        } catch (Throwable th3) {
            u53.z.a(gVar, objC);
            throw th3;
        }
    }
}

package o53;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {
    public static final void a(k kVar, t13.d dVar, boolean z14) {
        Object objF;
        Object obj = k.f129359g.get(kVar);
        Throwable thD = kVar.d(obj);
        if (thD != null) {
            int i14 = o13.q.f128596b;
            objF = new o13.q.b(thD);
        } else {
            int i15 = o13.q.f128596b;
            objF = kVar.f(obj);
        }
        if (!z14) {
            dVar.resumeWith(objF);
            return;
        }
        dVar.getClass();
        u53.f fVar = (u53.f) dVar;
        t13.d<T> dVar2 = fVar.f168733e;
        Object obj2 = fVar.f168735g;
        t13.g f129302c = dVar2.getF157466b();
        Object objC = u53.z.c(f129302c, obj2);
        l2<?> l2VarC = objC != u53.z.f168776a ? y.c(dVar2, f129302c, objC) : null;
        try {
            dVar2.resumeWith(objF);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (l2VarC == null || l2VarC.x0()) {
                u53.z.a(f129302c, objC);
            }
        }
    }
}

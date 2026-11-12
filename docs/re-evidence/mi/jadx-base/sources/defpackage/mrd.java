package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class mrd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<pzd, qb8<?>> f27126a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<pzd, qb8<?>> f27127b = new HashMap();

    public qb8<?> a(pzd pzdVar, boolean z) {
        return b(z).get(pzdVar);
    }

    public final Map<pzd, qb8<?>> b(boolean z) {
        return z ? this.f27127b : this.f27126a;
    }

    public void c(pzd pzdVar, qb8<?> qb8Var) {
        b(qb8Var.p()).put(pzdVar, qb8Var);
    }

    public void d(pzd pzdVar, qb8<?> qb8Var) {
        Map<pzd, qb8<?>> mapB = b(qb8Var.p());
        if (qb8Var.equals(mapB.get(pzdVar))) {
            mapB.remove(pzdVar);
        }
    }
}

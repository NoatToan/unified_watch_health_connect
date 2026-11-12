package bv1;

import c80.m0;
import c80.n0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbv1/k;", "Lzd0/e0;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ww1.l f21418i;

    public k(ww1.l lVar) {
        this.f21418i = lVar;
    }

    @Override // zd0.e0
    public final m0 a() {
        return null;
    }

    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        boolean zContains;
        String str;
        List<String> list = n0Var.f25485j;
        if (list != null) {
            ww1.l lVar = this.f21418i;
            if (lVar == null || (str = lVar.f187825a) == null) {
                str = "";
            }
            zContains = list.contains(str);
        } else {
            zContains = false;
        }
        return e0.b(zContains);
    }
}

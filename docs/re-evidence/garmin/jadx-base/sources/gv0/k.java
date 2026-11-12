package gv0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.m1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k implements e23.l<m1, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<r53.i<ge2.e>> f79301a;

    /* JADX WARN: Multi-variable type inference failed */
    public k(o53.j<? super r53.i<ge2.e>> jVar) {
        this.f79301a = jVar;
    }

    @Override // e23.l
    public final Unit invoke(m1 m1Var) {
        Object mVar;
        m1 m1Var2 = m1Var;
        m1Var2.getClass();
        androidx.lifecycle.w0 w0VarB = m1Var2.b(false);
        if (w0VarB == null || (mVar = androidx.lifecycle.v.a(w0VarB)) == null) {
            mVar = new r53.m(null);
        }
        int i14 = o13.q.f128596b;
        this.f79301a.resumeWith(mVar);
        return Unit.INSTANCE;
    }
}

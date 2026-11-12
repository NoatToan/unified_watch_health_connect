package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class r9 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.x3<Float> f89508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m9 f89509b;

    public r9(p3.x3<Float> x3Var, m9 m9Var) {
        this.f89508a = x3Var;
        this.f89509b = m9Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarE = f5.g0.e(h4.r.S, "indicator");
            p3.x3<Float> x3Var = this.f89508a;
            boolean zB = mVar2.B(x3Var);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new i5(x3Var, 1);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i5(x3Var, 1);
                    mVar2.K(objQ);
                }
            }
            h4.r rVarA = o4.s0.a(rVarE, (e23.l) objQ);
            long j8 = this.f89509b.f88960c;
            n3.j0.f122993a.getClass();
            c2.q.a(u1.n.e(rVarA, j8, fc.c(n3.j0.f122996d, mVar2)), mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

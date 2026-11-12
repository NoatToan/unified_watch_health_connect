package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class u4 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c5 f89875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3 f89876b;

    public u4(c5 c5Var, b3 b3Var) {
        this.f89875a = c5Var;
        this.f89876b = b3Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarX = c2.l.x(h4.r.S, x3.f90194d);
            c5 c5Var = this.f89875a;
            int iF = c5Var.f();
            boolean zB = mVar2.B(c5Var);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new t4(c5Var, 0);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new t4(c5Var, 0);
                    mVar2.K(objQ);
                }
            }
            x3.f(rVarX, iF, (e23.l) objQ, this.f89876b, mVar2, 6);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

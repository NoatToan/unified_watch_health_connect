package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class pg implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q<List<wf>, p3.m, Integer, Unit> f89330c;

    /* JADX WARN: Multi-variable type inference failed */
    public pg(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.q<? super List<wf>, ? super p3.m, ? super Integer, Unit> qVar) {
        this.f89328a = pVar;
        this.f89329b = pVar2;
        this.f89330c = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
            e23.p<p3.m, Integer, Unit> pVar = this.f89328a;
            boolean zB = mVar2.B(pVar);
            e23.p<p3.m, Integer, Unit> pVar2 = this.f89329b;
            boolean zB2 = zB | mVar2.B(pVar2);
            e23.q<List<wf>, p3.m, Integer, Unit> qVar = this.f89330c;
            boolean zB3 = zB2 | mVar2.B(qVar);
            Object objQ = mVar2.q();
            if (zB3) {
                objQ = new gw1.c(pVar, 14, pVar2, qVar);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gw1.c(pVar, 14, pVar2, qVar);
                    mVar2.K(objQ);
                }
            }
            f5.i2.b(rVarF, (e23.p) objQ, mVar2, 6, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

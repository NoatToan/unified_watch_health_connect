package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class y4 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f90398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3.h0 f90399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3.e0 f90400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<p5.g> f90401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b3 f90402e;

    public y4(l3 l3Var, l3.h0 h0Var, l3.e0 e0Var, List<p5.g> list, b3 b3Var) {
        this.f90398a = l3Var;
        this.f90399b = h0Var;
        this.f90400c = e0Var;
        this.f90401d = list;
        this.f90402e = b3Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            String strA = this.f90398a.a(Long.valueOf(this.f90399b.f109264e), this.f90400c.f109226a);
            if (strA == null) {
                strA = "-";
            }
            h4.r rVarX = c2.l.x(h4.r.S, w4.f90071a);
            List<p5.g> list = this.f90401d;
            boolean zR = mVar2.r(list);
            Object objQ = mVar2.q();
            if (zR) {
                objQ = new aq1.d0(list, 11);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new aq1.d0(list, 11);
                    mVar2.K(objQ);
                }
            }
            mh.c(strA, p5.v.c((e23.l) objQ, rVarX, false), this.f90402e.f87541e, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262136);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}

package r22;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149635a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f149636b;

    public /* synthetic */ d2(e2 e2Var) {
        this.f149636b = e2Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f149635a;
        e2 e2Var = this.f149636b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new p3.y1(e2Var.f149640b);
                        mVar.K(objQ);
                    }
                    p3.l1 l1Var = (p3.l1) objQ;
                    l72.c1 c1Var = l72.c1.f110940a;
                    String strInvoke = e2Var.f149643e.invoke(Double.valueOf(l1Var.getDoubleValue()));
                    String strQ = gl1.y.Q(mVar, R.string.lbl_done);
                    String strQ2 = gl1.y.Q(mVar, R.string.lbl_cancel);
                    boolean zR = mVar.r(e2Var);
                    Object objQ2 = mVar.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new e2.a(e2Var);
                        mVar.K(objQ2);
                    }
                    k23.g gVar = (k23.g) objQ2;
                    z3.e eVarC = z3.f.c(872810510, new q72.f(20, e2Var, l1Var), mVar);
                    boolean zR2 = mVar.r(e2Var);
                    Object objQ3 = mVar.q();
                    if (zR2 || objQ3 == c2565a) {
                        objQ3 = new qn0.f(19, e2Var, l1Var);
                        mVar.K(objQ3);
                    }
                    c1Var.a(true, strInvoke, null, eVarC, null, strQ, false, false, (e23.a) objQ3, strQ2, (e23.a) gVar, mVar, 3078, 0, 212);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                e2Var.u6((p3.m) obj, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d2(e2 e2Var, int i14) {
        this.f149636b = e2Var;
    }
}

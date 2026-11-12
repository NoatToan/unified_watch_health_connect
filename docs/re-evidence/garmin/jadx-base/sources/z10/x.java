package z10;

import com.garmin.android.apps.connectmobile.consent.ChildConsentsFlowActivity;
import com.garmin.android.apps.connectmobile.consent.ChildConsentsFlowActivity.c;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChildConsentsFlowActivity f201289b;

    public /* synthetic */ x(ChildConsentsFlowActivity childConsentsFlowActivity, int i14) {
        this.f201288a = i14;
        this.f201289b = childConsentsFlowActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f201288a;
        ChildConsentsFlowActivity childConsentsFlowActivity = this.f201289b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ChildConsentsFlowActivity.a aVar = ChildConsentsFlowActivity.f32139f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1554474374, new x(childConsentsFlowActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ChildConsentsFlowActivity.a aVar2 = ChildConsentsFlowActivity.f32139f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    p3.p1 p1VarC = s9.c.c(r53.s.d(childConsentsFlowActivity.ha().f200892b), mVar2);
                    p3.p1 p1VarC2 = s9.c.c(r53.s.d(childConsentsFlowActivity.ha().f200893c), mVar2);
                    boolean zR = mVar2.r(childConsentsFlowActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new v(childConsentsFlowActivity, 3);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new v(childConsentsFlowActivity, 3);
                            mVar2.K(objQ);
                        }
                    }
                    c.w.a(0, 1, (e23.a) objQ, mVar2, false);
                    c0 c0Var = (c0) p1VarC.getF182175a();
                    boolean zB = mVar2.B(p1VarC) | mVar2.r(childConsentsFlowActivity);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = childConsentsFlowActivity.new c(p1VarC, null);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = childConsentsFlowActivity.new c(p1VarC, null);
                            mVar2.K(objQ2);
                        }
                    }
                    p3.l0.e((e23.p) objQ2, c0Var, mVar2);
                    z02.d.a(((c0) p1VarC.getF182175a()) == c0.LOADING || ((i2) p1VarC2.getF182175a()).f201043a, z3.f.c(-1532981291, new xm0.h(21, childConsentsFlowActivity, p1VarC), mVar2), null, null, null, z3.f.c(-2077090479, new xk1.e(childConsentsFlowActivity, 25, p1VarC, p1VarC2), mVar2), mVar2, 196656, 28);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

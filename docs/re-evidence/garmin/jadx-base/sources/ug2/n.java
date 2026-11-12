package ug2;

import android.app.Activity;
import l72.h3;
import p005kotlin.Unit;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f170898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f170899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3 f170900d;

    public /* synthetic */ n(Activity activity, lc.m0 m0Var, x3 x3Var, int i14) {
        this.f170897a = i14;
        this.f170898b = activity;
        this.f170899c = m0Var;
        this.f170900d = x3Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f170897a;
        p3.m.a aVar = p3.m.f135153a;
        x3 x3Var = this.f170900d;
        lc.m0 m0Var = this.f170899c;
        Activity activity = this.f170898b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    int i15 = b3.a.f15501a;
                    u4.d dVarA = c3.a.a();
                    String str = (String) x3Var.getF182175a();
                    boolean zR = mVar.r(activity) | mVar.r(m0Var);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new ot1.x(activity, m0Var, 2);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ot1.x(activity, m0Var, 2);
                            mVar.K(objQ);
                        }
                    }
                    h3.e(dVarA, str, null, null, (e23.a) objQ, null, null, mVar, 0, 108);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i16 = b3.a.f15501a;
                    u4.d dVarA2 = c3.a.a();
                    String str2 = (String) x3Var.getF182175a();
                    boolean zR2 = mVar2.r(activity) | mVar2.r(m0Var);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new ot1.x(activity, m0Var, 1);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ot1.x(activity, m0Var, 1);
                            mVar2.K(objQ2);
                        }
                    }
                    h3.e(dVarA2, str2, null, null, (e23.a) objQ2, null, null, mVar2, 0, 108);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

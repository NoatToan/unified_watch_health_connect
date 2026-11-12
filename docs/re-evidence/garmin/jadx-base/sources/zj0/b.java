package zj0;

import com.garmin.android.apps.connectmobile.gcplus.presentation.feedback.GCPlusFeedbackActivity;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCPlusFeedbackActivity f204893b;

    public /* synthetic */ b(GCPlusFeedbackActivity gCPlusFeedbackActivity, int i14) {
        this.f204892a = i14;
        this.f204893b = gCPlusFeedbackActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f204892a;
        GCPlusFeedbackActivity gCPlusFeedbackActivity = this.f204893b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GCPlusFeedbackActivity.a aVar = GCPlusFeedbackActivity.f35317b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, true, f.c(949312691, new b(gCPlusFeedbackActivity, i16), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                GCPlusFeedbackActivity.a aVar2 = GCPlusFeedbackActivity.f35317b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(gCPlusFeedbackActivity.getOnBackPressedDispatcher()), f.c(1700467059, new b(gCPlusFeedbackActivity, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                GCPlusFeedbackActivity.a aVar3 = GCPlusFeedbackActivity.f35317b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    e eVar = (e) gCPlusFeedbackActivity.f35318a.getValue();
                    boolean zR = mVar3.r(gCPlusFeedbackActivity);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new a(gCPlusFeedbackActivity, 1);
                        mVar3.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new a(gCPlusFeedbackActivity, 1);
                            mVar3.K(objQ);
                        }
                    }
                    c.a(eVar, (e23.a) objQ, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

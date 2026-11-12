package uq0;

import com.garmin.android.apps.connectmobile.insights.presentation.InsightsActivity;
import e23.p;
import g02.d;
import gl1.y;
import lc.m0;
import lc.v0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import ty1.f1;
import z02.b;
import z3.f;
import zq0.c;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InsightsActivity f172275b;

    public /* synthetic */ a(InsightsActivity insightsActivity, int i14) {
        this.f172274a = i14;
        this.f172275b = insightsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f172274a;
        InsightsActivity insightsActivity = this.f172275b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                InsightsActivity.a aVar = InsightsActivity.f36903f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    b.a(false, null, null, null, false, f.c(1758448853, new a(insightsActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                InsightsActivity.a aVar2 = InsightsActivity.f36903f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    insightsActivity.f36904e = y.I(new v0[0], mVar2);
                    v.a(d.f74342a.c(insightsActivity.getOnBackPressedDispatcher()), f.c(1260572693, new a(insightsActivity, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                InsightsActivity.a aVar3 = InsightsActivity.f36903f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    m0 m0Var = insightsActivity.f36904e;
                    if (m0Var == null) {
                        s.m("navHostController");
                        throw null;
                    }
                    c cVar = c.INSTANCE;
                    boolean zR = mVar3.r(insightsActivity);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new f1(insightsActivity, 16);
                        mVar3.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new f1(insightsActivity, 16);
                            mVar3.K(objQ);
                        }
                    }
                    zq0.d.a(m0Var, cVar, (e23.a) objQ, mVar3, 48);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}

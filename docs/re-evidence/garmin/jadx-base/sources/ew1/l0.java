package ew1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f66563b;

    public /* synthetic */ l0(m0 m0Var, int i14) {
        this.f66562a = i14;
        this.f66563b = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strH;
        int i14 = this.f66562a;
        m0 m0Var = this.f66563b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m0.a aVar = m0.f66573c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1878548486, new l0(m0Var, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m0.a aVar2 = m0.f66573c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    aw1.h hVarY6 = m0Var.y6();
                    androidx.fragment.app.m mVarRequireActivity = m0Var.requireActivity();
                    mVarRequireActivity.getClass();
                    int i16 = aw1.h.S1;
                    String strT5 = hVarY6.t5(mVarRequireActivity, false);
                    if (m0Var.y6().c7() || strT5.length() == 0) {
                        strH = sn.a.h(mVar2, -413884492, R.string.find_a_race, mVar2);
                    } else {
                        mVar2.C(-413794623);
                        strH = gl1.y.P(R.string.find_a_race_type, new Object[]{strT5}, mVar2);
                        mVar2.f();
                    }
                    g3 g3Var = (g3) o53.f0.G((androidx.lifecycle.s0) m0Var.y6().f13369c1.getValue(), mVar2).getF182175a();
                    g02.s0.a(null, (g3Var != null ? g3Var.f35300a : null) == fw.p.LOADING, z3.f.c(29032688, new e11.f0(m0Var, strH, 8, strT5), mVar2), mVar2, 384, 1);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

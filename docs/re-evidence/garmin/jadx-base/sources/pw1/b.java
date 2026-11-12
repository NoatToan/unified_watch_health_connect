package pw1;

import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.s0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity;
import e23.p;
import o53.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import p40.o0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ITPDashboardActivity f141712b;

    public /* synthetic */ b(ITPDashboardActivity iTPDashboardActivity, int i14) {
        this.f141711a = i14;
        this.f141712b = iTPDashboardActivity;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 1;
        switch (this.f141711a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ITPDashboardActivity.a aVar = ITPDashboardActivity.f45618m;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1995819270, new b(this.f141712b, i14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ITPDashboardActivity.a aVar2 = ITPDashboardActivity.f45618m;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    ITPDashboardActivity iTPDashboardActivity = this.f141712b;
                    p1 p1VarG = f0.G((s0) iTPDashboardActivity.oa().Y.getValue(), mVar2);
                    g3 g3Var = (g3) p1VarG.getF182175a();
                    fw.p pVar = g3Var != null ? g3Var.f35300a : null;
                    int i15 = pVar == null ? -1 : ITPDashboardActivity.b.f45627a[pVar.ordinal()];
                    if (i15 != 1) {
                        m.a aVar3 = m.f135153a;
                        if (i15 == 2) {
                            mVar2.C(2075817858);
                            iTPDashboardActivity.hideProgressOverlay();
                            g3 g3Var2 = (g3) p1VarG.getF182175a();
                            sw1.a aVar4 = g3Var2 != null ? (sw1.a) g3Var2.f35301b : null;
                            if (aVar4 != null) {
                                tw1.m mVar3 = aVar4.f161085a;
                                mVar2.C(2075977539);
                                String trainingPlanName = mVar3.getTrainingPlanName();
                                if (trainingPlanName == null) {
                                    trainingPlanName = "";
                                }
                                iTPDashboardActivity.setTitle(trainingPlanName);
                                ComposeView composeView = iTPDashboardActivity.f45623i;
                                if (composeView == null) {
                                    s.m("composeView");
                                    throw null;
                                }
                                composeView.setVisibility(0);
                                boolean zR = mVar2.r(iTPDashboardActivity) | mVar2.r(aVar4);
                                Object objQ = mVar2.q();
                                if (zR) {
                                    objQ = new o0(14, iTPDashboardActivity, aVar4);
                                    mVar2.K(objQ);
                                } else {
                                    aVar3.getClass();
                                    if (objQ == m.a.f135155b) {
                                        objQ = new o0(14, iTPDashboardActivity, aVar4);
                                        mVar2.K(objQ);
                                    }
                                }
                                e23.a aVar5 = (e23.a) objQ;
                                boolean zR2 = mVar2.r(iTPDashboardActivity);
                                Object objQ2 = mVar2.q();
                                if (zR2) {
                                    objQ2 = new a(iTPDashboardActivity, 6);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar3.getClass();
                                    if (objQ2 == m.a.f135155b) {
                                        objQ2 = new a(iTPDashboardActivity, 6);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar6 = (e23.a) objQ2;
                                boolean zR3 = mVar2.r(iTPDashboardActivity);
                                Object objQ3 = mVar2.q();
                                if (zR3) {
                                    objQ3 = new a(iTPDashboardActivity, 0);
                                    mVar2.K(objQ3);
                                } else {
                                    aVar3.getClass();
                                    if (objQ3 == m.a.f135155b) {
                                        objQ3 = new a(iTPDashboardActivity, 0);
                                        mVar2.K(objQ3);
                                    }
                                }
                                rw1.a.a(iTPDashboardActivity, aVar4, aVar5, aVar6, (e23.a) objQ3, mVar2, 0);
                                ge1.b.T(f0.w(iTPDashboardActivity), null, null, new c(!mVar3.e0(), iTPDashboardActivity, null), 3);
                                mVar2.f();
                            } else {
                                mVar2.C(2077120168);
                                mVar2.f();
                            }
                            mVar2.f();
                        } else if (i15 != 3) {
                            mVar2.C(2077365254);
                            mVar2.f();
                        } else {
                            mVar2.C(2077191189);
                            iTPDashboardActivity.hideProgressOverlay();
                            boolean zR4 = mVar2.r(iTPDashboardActivity);
                            Object objQ4 = mVar2.q();
                            if (zR4) {
                                objQ4 = new a(iTPDashboardActivity, 1);
                                mVar2.K(objQ4);
                            } else {
                                aVar3.getClass();
                                if (objQ4 == m.a.f135155b) {
                                    objQ4 = new a(iTPDashboardActivity, 1);
                                    mVar2.K(objQ4);
                                }
                            }
                            iTPDashboardActivity.ma(false, (e23.a) objQ4);
                            mVar2.f();
                        }
                    } else {
                        mVar2.C(2075558419);
                        mVar2.f();
                        ComposeView composeView2 = iTPDashboardActivity.f45623i;
                        if (composeView2 == null) {
                            s.m("composeView");
                            throw null;
                        }
                        composeView2.setVisibility(8);
                        wt1.b bVar = iTPDashboardActivity.f45624j;
                        if (bVar == null) {
                            s.m("errorViewHolder");
                            throw null;
                        }
                        bVar.e();
                        iTPDashboardActivity.showProgressOverlay();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}

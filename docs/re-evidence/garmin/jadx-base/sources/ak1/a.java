package ak1;

import a03.t0;
import ak0.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.thirdparty.GCMSettingsThirdPartyAppsActivity;
import e23.p;
import g02.d;
import gl1.y;
import l72.c1;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.v;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCMSettingsThirdPartyAppsActivity f3694b;

    public /* synthetic */ a(GCMSettingsThirdPartyAppsActivity gCMSettingsThirdPartyAppsActivity, int i14) {
        this.f3693a = i14;
        this.f3694b = gCMSettingsThirdPartyAppsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f3693a;
        GCMSettingsThirdPartyAppsActivity gCMSettingsThirdPartyAppsActivity = this.f3694b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = GCMSettingsThirdPartyAppsActivity.f43944b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(957797813, new a(gCMSettingsThirdPartyAppsActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = GCMSettingsThirdPartyAppsActivity.f43944b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    Object objQ = mVar2.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        mVar2.K(objQ);
                    }
                    p1 p1Var = (p1) objQ;
                    v.a(d.f74342a.c(gCMSettingsThirdPartyAppsActivity.getOnBackPressedDispatcher()), f.c(210557173, new t0(8, gCMSettingsThirdPartyAppsActivity, p1Var), mVar2), mVar2, 56);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar2.C(-2007005789);
                        c1 c1Var = c1.f110940a;
                        hk1.v vVar = hk1.v.f84199e;
                        String strP = y.P(R.string.lbl_unable_to_connect_to_app, new Object[]{vVar.f84204a}, mVar2);
                        String strP2 = y.P(R.string.msg_unable_to_connect_to_app, new Object[]{vVar.f84204a}, mVar2);
                        String strQ = y.Q(mVar2, R.string.lbl_ok);
                        Object objQ2 = mVar2.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new z(p1Var, i15);
                            mVar2.K(objQ2);
                        }
                        c1Var.a(false, strP, strP2, null, null, strQ, false, false, (e23.a) objQ2, null, null, mVar2, 100663302, 0, 1752);
                        mVar2.f();
                    } else {
                        mVar2.C(-2006473395);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

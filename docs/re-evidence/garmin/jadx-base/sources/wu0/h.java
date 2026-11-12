package wu0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.consent.LivetrackGroupRideEnabledActivity;
import e23.p;
import i3.kb;
import i3.nj;
import i3.y;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import t21.v0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LivetrackGroupRideEnabledActivity f187267b;

    public /* synthetic */ h(LivetrackGroupRideEnabledActivity livetrackGroupRideEnabledActivity, int i14) {
        this.f187266a = i14;
        this.f187267b = livetrackGroupRideEnabledActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f187266a;
        LivetrackGroupRideEnabledActivity livetrackGroupRideEnabledActivity = this.f187267b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i17 = LivetrackGroupRideEnabledActivity.f38673a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(379994616, new h(livetrackGroupRideEnabledActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i18 = LivetrackGroupRideEnabledActivity.f38673a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    Context context = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    long jE = vb.h.e(d92.b.f58623a, mVar2);
                    z3.e eVarC = z3.f.c(2135962044, new h(livetrackGroupRideEnabledActivity, i15), mVar2);
                    z3.e eVarC2 = z3.f.c(-1115217283, new br2.a(context, 17), mVar2);
                    a.f187235a.getClass();
                    kb.a(null, eVarC, eVarC2, null, null, 0, jE, 0L, null, a.f187239e, mVar2, 805306800, 441);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = LivetrackGroupRideEnabledActivity.f38673a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    a.f187235a.getClass();
                    z3.e eVar = a.f187236b;
                    z3.e eVarC3 = z3.f.c(-165039187, new v0(livetrackGroupRideEnabledActivity, 20), mVar3);
                    nj njVar = nj.f89109a;
                    d92.b.f58623a.getClass();
                    long jC = d92.b.a(mVar3).c().c();
                    njVar.getClass();
                    y.b(eVar, null, null, eVarC3, 0.0f, null, nj.b(jC, 0L, 0L, mVar3, 62), mVar3, 3078, 182);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

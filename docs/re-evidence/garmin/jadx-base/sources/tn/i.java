package tn;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.p2;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn.f f165471b;

    public /* synthetic */ i(sn.f fVar, int i14) {
        this.f165470a = i14;
        this.f165471b = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f165470a;
        sn.f fVar = this.f165471b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String deviceName = fVar.getDeviceName();
                    if (deviceName == null) {
                        deviceName = sn.a.h(mVar, -1050719764, R.string.lbl_unknown, mVar);
                    } else {
                        mVar.C(-1050720663);
                        mVar.f();
                    }
                    String str = deviceName;
                    String deviceVersion = fVar.getDeviceVersion();
                    p2 p2Var = p2.f111205a;
                    if (deviceVersion == null) {
                        deviceVersion = "";
                    }
                    p2Var.h(str, deviceVersion, null, null, null, false, false, z3.f.c(1769774202, new i(fVar, i15), mVar), null, null, null, mVar, 12582912, 0, 1916);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    wf.f.a aVar = new wf.f.a((Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b));
                    aVar.f184930c = fVar.getImageUrl();
                    wf.g.a(aVar);
                    wf.f fVarA = aVar.a();
                    t4.d dVarA = n5.c.a(2131231969, mVar2, 0);
                    t4.d dVarA2 = n5.c.a(2131231969, mVar2, 0);
                    String strQ = y.Q(mVar2, R.string.image_content_description);
                    g6.f.a aVar2 = g6.f.f75994b;
                    float f14 = 48;
                    jf.r.b(fVarA, strQ, x2.u(x2.h(c2.l.C(h4.r.S, 0.0f, 0.0f, 12, 0.0f, 11), f14), f14), dVarA, dVarA2, null, null, null, null, null, null, null, mVar2, 384, 0, 32736);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

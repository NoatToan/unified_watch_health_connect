package mh1;

import com.garmin.android.apps.connectmobile.R;
import l72.c1;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118485a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.index.a f118486b;

    public /* synthetic */ n(com.garmin.android.apps.connectmobile.settings.devices.index.a aVar) {
        this.f118486b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f118485a;
        com.garmin.android.apps.connectmobile.settings.devices.index.a aVar = this.f118486b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.devices.index.a.C0800a c0800a = com.garmin.android.apps.connectmobile.settings.devices.index.a.f43064a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    c1 c1Var = c1.f110940a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_sync_device_to_update);
                    String strQ2 = gl1.y.Q(mVar, R.string.msg_sync_device_to_update);
                    String strQ3 = gl1.y.Q(mVar, R.string.lbl_ok);
                    boolean zR = mVar.r(aVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new i(aVar, 1);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new i(aVar, 1);
                            mVar.K(objQ);
                        }
                    }
                    c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ, null, null, mVar, 6, 0, 1752);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.settings.devices.index.a.C0800a c0800a2 = com.garmin.android.apps.connectmobile.settings.devices.index.a.f43064a;
                aVar.u6((p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(com.garmin.android.apps.connectmobile.settings.devices.index.a aVar, int i14) {
        this.f118486b = aVar;
    }
}

package cd0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class t extends n {
    @Override // cd0.n
    public final void a() {
    }

    @Override // cd0.n
    public final void b(Context context, bm2.d dVar, byte[] bArr) {
        String str;
        super.b(context, dVar, bArr);
        String strValueOf = String.valueOf(dVar.getF172495c());
        HashMap map = zb0.u0.f203782n6;
        boolean z14 = (map.containsKey(strValueOf) && (str = ((zb0.u0) map.get(strValueOf)).f203855b) != null && str.contains(q.class.getSimpleName())) ? false : true;
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "EdgeNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "shouldRegisterDevice [" + z14 + "] for deviceProductNbr [" + dVar.getF172495c() + "]");
        if (!z14) {
            d();
            e();
        } else {
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EdgeNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "registerDevice: BEGIN ****");
            new bd0.v(false, dVar.getF172494b(), dVar.getF172495c(), new s(this), this.f26833d, zb0.u0.r(Integer.toString(dVar.getF172495c()))).a(hb2.h.c(this.f26830a), this.f26832c, false);
        }
    }

    @Override // cd0.n
    public void c() {
    }

    public final void d() {
        i2.a(a2.DEVICES, "EdgeNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "registerDevice: checkForSoftwareUpdateCallSuper");
        super.a();
    }

    public final void e() {
        i2.a(a2.DEVICES, "EdgeNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "registerDevice: requestSyncCallSuper");
        super.c();
    }
}

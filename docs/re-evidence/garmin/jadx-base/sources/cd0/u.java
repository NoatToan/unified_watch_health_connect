package cd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class u extends k {
    @Override // cd0.k, cd0.z, cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        i2.a(a2.DEVICES, "Fenix3NonSetupFlowHandshakeCompleteStrategy", "handleHandshakeCompleted");
        super.d(dVar, false);
        if (i.h(dVar.getF172494b())) {
            return;
        }
        rd2.h hVarD = rd2.h.d();
        long f172494b = dVar.getF172494b();
        hVarD.getClass();
        rd2.h.g(f172494b, 3, false);
    }

    @Override // cd0.i
    public final void m() {
        n();
    }
}

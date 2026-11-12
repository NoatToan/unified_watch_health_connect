package cd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class o0 extends i {
    @Override // cd0.i
    public void d(bm2.d dVar, boolean z14) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "VivofitNonSetupFlowHandshakeCompleteStrategy", "handleHandshakeCompleted");
        rd2.j jVar = rd2.f.a().f152045a;
        long f172494b = dVar.getF172494b();
        jVar.getClass();
        if (rd2.j.h(f172494b) == null) {
            String str = "Ignoring handshake completed for unit ID [" + dVar.getF172494b() + "]. Device needs to be paired from within the app first.";
            i2.f36769a.getClass();
            i2.a.p(a2Var, "VivofitNonSetupFlowHandshakeCompleteStrategy", str);
            return;
        }
        super.d(dVar, false);
        if (!this.f26817e.n(dVar.getF172497e(), dVar.getF172494b())) {
            a(dVar);
            i();
        } else {
            i2.f36769a.getClass();
            i2.a.b(a2Var, "VivofitNonSetupFlowHandshakeCompleteStrategy", "Device firmware version is greater than the cached XML firmware version... requesting device XML download.");
            this.f26818f.d(dVar.getF172494b());
        }
    }
}

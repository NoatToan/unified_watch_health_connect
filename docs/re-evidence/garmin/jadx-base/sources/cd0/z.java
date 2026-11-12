package cd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class z extends i {
    @Override // cd0.i
    public void d(bm2.d dVar, boolean z14) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "ForerunnerNonSetupFlowHandshakeCompleteStrategy", ".handleHandshakeCompleted()");
        super.d(dVar, false);
        if (!this.f26817e.n(dVar.getF172497e(), dVar.getF172494b())) {
            a(dVar);
            i();
        } else {
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ForerunnerNonSetupFlowHandshakeCompleteStrategy", "Device firmware version is greater than the cached XML firmware version... requesting device XML download.");
            this.f26818f.d(dVar.getF172494b());
        }
    }

    @Override // cd0.i
    public final void k() {
        i2.a(a2.DEVICES, "ForerunnerNonSetupFlowHandshakeCompleteStrategy", ".saveAutoUploadPermissionAsOn()");
        if (!g(1)) {
            super.k();
        } else if (f(1)) {
            super.k();
        } else {
            j();
        }
    }
}

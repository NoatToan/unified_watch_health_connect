package cd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class g0 extends i {
    @Override // cd0.i
    public final void d(bm2.d dVar, boolean z14) {
        super.d(dVar, false);
        if (this.f26817e.n(dVar.getF172497e(), dVar.getF172494b())) {
            i2.a(a2.DEVICES, "OutdoorNonSetupFlowHandshakeCompleteStrategy", "Device firmware version is greater than the cached XML firmware version... requesting device XML download.");
            this.f26818f.d(dVar.getF172494b());
        } else {
            a(dVar);
            i();
        }
    }

    @Override // cd0.i
    public final void k() {
        i2.a(a2.DEVICES, "OutdoorNonSetupFlowHandshakeCompleteStrategy", ".saveAutoUploadPermissionAsOn()");
        if (!g(1)) {
            super.k();
        } else if (f(1)) {
            super.k();
        } else {
            j();
        }
    }

    @Override // cd0.i
    public final void m() {
        n();
    }
}

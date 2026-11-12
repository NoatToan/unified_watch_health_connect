package cd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class k extends z {
    @Override // cd0.z, cd0.i
    public void d(bm2.d dVar, boolean z14) {
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "BaseHybridNonSetupFlowHandshakeCompleteStrategy", ".handleHandshakeCompleted()");
        rd2.j jVar = rd2.f.a().f152045a;
        long f172494b = dVar.getF172494b();
        jVar.getClass();
        if (rd2.j.h(f172494b) != null) {
            super.d(dVar, false);
            return;
        }
        String str = "Ignoring handshake completed for unit ID [" + dVar.getF172494b() + "]. Device needs to be paired from within the app first.";
        i2.f36769a.getClass();
        i2.a.p(a2Var, "BaseHybridNonSetupFlowHandshakeCompleteStrategy", str);
    }
}

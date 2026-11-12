package cd0;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.lib.connectdevicesync.DeviceSyncService;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class p {
    public static String a(String str) {
        return am.j.m("requestSync (called from ", str, "): ");
    }

    public static void b(bm2.d dVar, String str) {
        if (dVar == null) {
            i2.l("LegacyDeviceSyncUtil", a(str).concat("device is null"));
            return;
        }
        Context contextC = ((c22.o) KoinJavaComponent.get(c22.o.class)).c();
        boolean zL = ((l80.a) KoinJavaComponent.get(l80.a.class)).l();
        if (hk0.e.f(contextC).j(dVar.f())) {
            hk0.a aVarF = hk0.a.f();
            String strF = dVar.f();
            aVarF.getClass();
            if (TextUtils.isEmpty(strF)) {
                aVarF.c("syncReady");
            } else {
                ea2.a aVar = (ea2.a) hk0.s.a().getCapability(strF, ea2.a.class);
                if (aVar != null) {
                    aVar.completeHandshake();
                }
            }
            i2.d("LegacyDeviceSyncUtil", a(str) + "setup flow [" + zL + "], remote device initiates sync capability [yes], called DeviceManager.syncReady()");
        } else {
            ((l80.b) KoinJavaComponent.get(l80.b.class)).u();
            DeviceSyncService.d(dVar.getF172494b(), -1L, contextC, dVar.f());
            i2.d("LegacyDeviceSyncUtil", a(str) + "setup flow [" + zL + "], remote device initiates sync capability [no], called DeviceSyncService to request sync");
        }
        if (zL) {
            i2.d("LegacyDeviceSyncUtil", a(str).concat("user is in setup flow, NOT notifying connected devices of app visibility"));
        } else if (((c22.o) KoinJavaComponent.get(c22.o.class)).i()) {
            i2.d("LegacyDeviceSyncUtil", a(str).concat("app is in background, NOT notifying connected devices of app visibility"));
        } else {
            yr1.d.c(dVar.getF172494b(), false);
            i2.d("LegacyDeviceSyncUtil", a(str).concat("app is in foreground, notified connected devices"));
        }
    }
}

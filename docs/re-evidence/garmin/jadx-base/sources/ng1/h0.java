package ng1;

import com.garmin.android.apps.connectmobile.settings.devices.DeviceUserSettingsActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class h0 implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceUserSettingsActivity f125939a;

    public h0(DeviceUserSettingsActivity deviceUserSettingsActivity) {
        this.f125939a = deviceUserSettingsActivity;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        int i14 = DeviceUserSettingsActivity.f42010c1;
        this.f125939a.ca();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        DeviceUserSettingsActivity deviceUserSettingsActivity = this.f125939a;
        deviceUserSettingsActivity.f42014b1 = (ArrayList) obj;
        rd2.j jVar = rd2.f.a().f152045a;
        long j8 = deviceUserSettingsActivity.f42013b;
        jVar.getClass();
        bm2.c cVar = null;
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null) {
            fVarI.getSoftwareVersion();
        }
        ArrayList<bm2.c> arrayList = deviceUserSettingsActivity.f42014b1;
        if (arrayList != null) {
            for (bm2.c cVar2 : arrayList) {
                if (deviceUserSettingsActivity.f42013b == cVar2.f18942x) {
                    cVar = cVar2;
                    break;
                }
            }
        }
        if (cVar != null && cVar.N0 && cVar.M0) {
            deviceUserSettingsActivity.F.setOnClickListener(deviceUserSettingsActivity.X0);
        } else {
            deviceUserSettingsActivity.F.setOnClickListener(deviceUserSettingsActivity.W0);
        }
        deviceUserSettingsActivity.ca();
    }
}

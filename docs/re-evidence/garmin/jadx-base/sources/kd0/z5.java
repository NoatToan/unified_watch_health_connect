package kd0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsActivityTrackerSetupDefault;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import java.util.ArrayList;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/z5;", "Lnr1/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z5 implements nr1.a {
    @Override // nr1.a
    public final void a(Context context, sd2.f fVar) {
        context.getClass();
        fVar.getClass();
        if (zb0.u0.n(fVar.getProductNumber(), zb0.u0.f203844y2) || zb0.u0.n(fVar.getProductNumber(), zb0.u0.f203850z2) || zb0.u0.n(fVar.getProductNumber(), zb0.u0.U3) || zb0.u0.n(fVar.getProductNumber(), zb0.u0.A2) || zb0.u0.n(fVar.getProductNumber(), zb0.u0.B2) || zb0.u0.n(fVar.getProductNumber(), zb0.u0.C2) || zb0.u0.n(fVar.getProductNumber(), zb0.u0.D2) || zb0.u0.n(fVar.getProductNumber(), zb0.u0.f203838x2)) {
            ni1.a.f126196a.getClass();
            ni1.a.C2424a.b(context, fVar, GDIRealtimeSettingsProto.WellKnownCompositionId.STRESS_ALERT_SETTINGS);
            return;
        }
        ni1.a.C2424a c2424a = ni1.a.f126196a;
        DeviceSettingsActivityTrackerSetupDefault.a aVar = DeviceSettingsActivityTrackerSetupDefault.a.RELAX_REMINDER;
        long unitID = fVar.getUnitID();
        String productNumber = fVar.getProductNumber();
        productNumber.getClass();
        String displayName = fVar.getDisplayName();
        if (displayName == null) {
            displayName = "";
        }
        boolean zS2 = fVar.s2();
        c2424a.getClass();
        aVar.getClass();
        Intent intentA = ni1.a.C2424a.a(context, aVar, unitID, productNumber, displayName);
        intentA.putExtra("GCM_low_hr_alert_capable", zS2);
        context.startActivity(intentA);
    }

    @Override // nr1.a
    public final p1.z<sd2.f> b() {
        Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
        p1.z<sd2.f> zVar = new p1.z<>();
        rd2.f.a().f152045a.getClass();
        ArrayList<sd2.f> arrayListE = rd2.j.e();
        if (arrayListE != null && !arrayListE.isEmpty()) {
            for (sd2.f fVar : arrayListE) {
                if (zb0.n0.f203582f.contains((zb0.u0) zb0.u0.f203782n6.get(fVar.getProductNumber()))) {
                    zVar.f(fVar.getUnitID(), fVar);
                }
            }
        }
        return zVar;
    }
}

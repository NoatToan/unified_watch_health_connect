package kd0;

import android.app.Activity;
import android.content.Context;
import com.garmin.android.apps.connectmobile.acclimation.reports.presentation.activity.PulseOxAcclimationReportsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsActivityTrackerSetupDefault;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/i5;", "Lic1/e;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i5 implements ic1.e {
    @Override // ic1.e
    public final void b(Context context, long j8, String str, String str2) {
        if (context == null || g8.i.w(context) == null || j8 <= -1 || str == null || str2 == null) {
            return;
        }
        if (km2.a.i(j8, null, SupportedCapability.REALTIME_SETTINGS.ordinal())) {
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = rd2.j.i(j8, null);
            ni1.a.f126196a.getClass();
            ni1.a.C2424a.b(context, fVarI, GDIRealtimeSettingsProto.WellKnownCompositionId.PULSE_OX_SETTINGS);
            return;
        }
        Activity activityW = g8.i.w(context);
        if (activityW != null) {
            ni1.a.C2424a c2424a = ni1.a.f126196a;
            DeviceSettingsActivityTrackerSetupDefault.a aVar = DeviceSettingsActivityTrackerSetupDefault.a.PULSE_OX_SETTINGS;
            c2424a.getClass();
            aVar.getClass();
            activityW.startActivityForResult(ni1.a.C2424a.a(activityW, aVar, j8, str, str2), 999);
        }
    }

    @Override // ic1.e
    public final void c(Context context, DateTime dateTime) {
        context.getClass();
        PulseOxAcclimationReportsActivity.f28764a.getClass();
        PulseOxAcclimationReportsActivity.a.a(context, dateTime);
    }

    @Override // ic1.e
    public final void d(ic1.i.b bVar) {
        zb0.n0.g(new zb0.j1(bVar));
    }

    @Override // ic1.e
    public final void e(Context context, DateTime dateTime) {
        context.startActivity(SleepReportsActivity.a.b(SleepReportsActivity.f44239b, context, dateTime, en1.c.SCORE, false, rl1.i.PULSE_OX, null, 32));
    }

    @Override // ic1.e
    public final com.garmin.android.apps.connectmobile.pulseox.data.a f() {
        return new com.garmin.android.apps.connectmobile.pulseox.data.a();
    }
}

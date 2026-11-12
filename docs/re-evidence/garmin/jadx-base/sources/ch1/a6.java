package ch1;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;

/* JADX INFO: loaded from: classes10.dex */
public class a6 extends fb2.a<Object> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f27302j;

    public a6(Context context, long j8) {
        super(context);
        this.f27301i = View.generateViewId();
        this.f27302j = j8;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        int iOrdinal = SupportedCapability.WEATHER_CONDITIONS.ordinal();
        long j8 = this.f27302j;
        return km2.a.i(j8, null, iOrdinal) && km2.a.i(j8, null, SupportedCapability.WEATHER_ALERTS.ordinal());
    }

    @Override // fb2.a
    public final boolean q(Object obj) {
        rd2.h.d().getClass();
        return rd2.h.e(3, this.f27302j);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return this.f27301i;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.DeviceSettingsWeatherAlerts);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        rd2.h.d().getClass();
        long j8 = this.f27302j;
        rd2.h.g(j8, 3, z14);
        hk0.a aVarF = hk0.a.f();
        aVarF.getClass();
        String strA = c22.u1.a(j8);
        if (strA == null) {
            aVarF.d(j8, "setWeatherAlertsEnabled");
            return;
        }
        if (TextUtils.isEmpty(strA)) {
            aVarF.c("setWeatherAlertsEnabled");
            return;
        }
        DeviceProfile deviceProfileA = da2.d.c(aVarF.f84094a).a(strA);
        if (deviceProfileA != null) {
            if (z14) {
                sm2.g.e(deviceProfileA, 3, true);
            } else {
                sm2.g.e(deviceProfileA, 3, false);
            }
        }
    }
}

package com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus;

import ch1.b5;
import ch1.f3;
import ch1.g2;
import ch1.h2;
import ch1.j;
import ch1.r1;
import ch1.y0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Observable;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class InstinctSoundsAndAlertsSettingActivity extends Fenix5PlusSoundsAndAlertsSettingActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusSoundsAndAlertsSettingActivity, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new y2(this));
        arrayList.add(new g2(this));
        arrayList.add(new h2(this));
        arrayList.add(new j(this));
        arrayList.add(new b5(this, R.string.device_settings_alert_vibration));
        arrayList.add(new f3(this));
        u0 u0Var = u0.f203733h;
        String str = this.f125981g;
        Locale locale = Locale.ENGLISH;
        if (str.toLowerCase(locale).contains("tactical") || this.f125981g.toLowerCase(locale).contains("esports") || this.f125980f == u0.Y2) {
            arrayList.add(new r1(this, this.f125957n));
        }
        arrayList.add(new y0(this, R.string.device_settings_do_not_disturb_during_sleep));
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusSoundsAndAlertsSettingActivity, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj != null) {
            if (observable instanceof r1) {
                ja();
            } else {
                super.update(observable, obj);
            }
        }
    }
}

package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class u1 extends fb2.t<DeviceSettingsDTO, com.garmin.android.apps.connectmobile.devices.model.o.c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.o.c[] f27472f;

    public u1(Context context) {
        super(context);
        this.f27471e = View.generateViewId();
    }

    @Override // fb2.t
    public final Map<com.garmin.android.apps.connectmobile.devices.model.o.c, CharSequence> q(com.garmin.android.apps.connectmobile.devices.model.o.c[] cVarArr) {
        com.garmin.android.apps.connectmobile.devices.model.o.c[] cVarArr2 = cVarArr;
        HashMap map = new HashMap();
        if (cVarArr2 != null) {
            for (com.garmin.android.apps.connectmobile.devices.model.o.c cVar : cVarArr2) {
                map.put(cVar, this.f70343a.getString(cVar.f34304c));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final int t() {
        return this.f27471e;
    }

    @Override // fb2.t
    public String u() {
        return this.f70343a.getString(R.string.device_setting_home_screen);
    }
}

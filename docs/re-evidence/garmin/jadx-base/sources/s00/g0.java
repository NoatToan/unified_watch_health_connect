package s00;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public class g0 extends j {
    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        if (y80.p0.f195202c) {
            return;
        }
        String string = bundle.getString("message");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        j.e(garminConnectMobileApp, sz0.e.f161383x, d(cVar), garminConnectMobileApp.getString(R.string.launcher_name_garmin_connect), string, j.c(garminConnectMobileApp, new Intent(garminConnectMobileApp, (Class<?>) GCMActivityStartup.class)));
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.PLAIN_MESSAGE};
    }
}

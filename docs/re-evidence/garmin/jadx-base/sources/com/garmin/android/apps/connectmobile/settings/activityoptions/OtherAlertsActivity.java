package com.garmin.android.apps.connectmobile.settings.activityoptions;

import ig1.g2;
import java.util.ArrayList;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class OtherAlertsActivity extends AlertsActivity implements Observer {
    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.AlertsActivity
    public final ArrayList ea(vk1.b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g2(this));
        arrayList.add(ca());
        arrayList.add(da(bVar));
        return arrayList;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.AlertsActivity
    public final String fa() {
        return "OtherAlertsActivity";
    }
}

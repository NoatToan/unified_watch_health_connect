package com.garmin.android.apps.connectmobile.settings.devices.fr45;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import ch1.h1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.f;
import com.garmin.android.apps.connectmobile.settings.activityoptions.DataFieldsActivity;
import com.garmin.android.apps.connectmobile.settings.activityoptions.OtherAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.activityoptions.WellnessAlertsActivity;
import fb2.g;
import ig1.e;
import ig1.i;
import ig1.y;
import ig1.y0;
import ih1.d;
import java.util.ArrayList;
import java.util.Observable;
import p005kotlin.Metadata;
import rd2.j;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr45/FR45ActivityAlertsActivity;", "Lcom/garmin/android/apps/connectmobile/settings/activityoptions/WellnessAlertsActivity;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FR45ActivityAlertsActivity extends WellnessAlertsActivity {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f42990m = new a(null);

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.WellnessAlertsActivity
    public final void ca() {
        ArrayList arrayList = this.f41697a;
        arrayList.clear();
        View viewFindViewById = findViewById(R.id.page_content);
        viewFindViewById.getClass();
        ((LinearLayout) viewFindViewById).addView(g.a(this));
        arrayList.add(new d(this));
        arrayList.add(new e(this, this.f41699c));
        arrayList.add(new y0(this));
        arrayList.add(new i(this));
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = this.f41699c;
        if ((aVar == com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING && this.f41700d == com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC) || ((aVar == com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING && this.f41700d == com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC) || ((aVar == com.garmin.android.apps.connectmobile.settings.devices.e.a.CARDIO && this.f41700d == com.garmin.android.apps.connectmobile.settings.devices.e.b.CARDIO_TRAINING) || ((aVar == com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING && this.f41700d == com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC) || (aVar == com.garmin.android.apps.connectmobile.settings.devices.e.a.GENERIC && this.f41700d == com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC))))) {
            arrayList.add(new h1(this));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.WellnessAlertsActivity, java.util.Observer
    public final void update(Observable observable, Object obj) {
        String productDisplayName;
        observable.getClass();
        if (obj != null) {
            if (observable instanceof d) {
                if (this.f41699c == com.garmin.android.apps.connectmobile.settings.devices.e.a.OTHER) {
                    f fVar = this.f41698b;
                    long j8 = this.f41702f;
                    u0 u0Var = this.f41703g;
                    Intent intent = new Intent(this, (Class<?>) OtherAlertsActivity.class);
                    intent.putExtra("GCM_deviceActivityOptions", fVar);
                    intent.putExtra("GCM_deviceUnitID", j8);
                    intent.putExtra("GCM_deviceEnumValue", u0Var);
                    startActivityForResult(intent, 20);
                } else {
                    j jVar = rd2.f.a().f152045a;
                    long j14 = this.f41702f;
                    jVar.getClass();
                    sd2.f fVarI = j.i(j14, null);
                    FR45AlertsActivity.a aVar = FR45AlertsActivity.f42992f;
                    f fVar2 = this.f41698b;
                    fVar2.getClass();
                    long j15 = this.f41702f;
                    if (fVarI == null || (productDisplayName = fVarI.getProductDisplayName()) == null) {
                        productDisplayName = "";
                    }
                    aVar.getClass();
                    Intent intent2 = new Intent(this, (Class<?>) FR45AlertsActivity.class);
                    intent2.putExtra("GCM_deviceActivityOptions", fVar2);
                    intent2.putExtra("GCM_deviceUnitID", j15);
                    intent2.putExtra("GCM_deviceDisplayName", productDisplayName);
                    startActivityForResult(intent2, 20);
                }
            }
            if (observable instanceof y) {
                DataFieldsActivity.ca(this, this.f41698b, this.f41703g, false, 20);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr45/FR45ActivityAlertsActivity$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

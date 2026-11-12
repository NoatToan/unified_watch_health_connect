package com.garmin.android.apps.connectmobile.settings.devices.fr45;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.f;
import com.garmin.android.apps.connectmobile.settings.activityoptions.AlertsActivity;
import ig1.d0;
import ig1.g2;
import ig1.m0;
import ig1.m1;
import ig1.t;
import ig1.x0;
import java.util.ArrayList;
import java.util.Observable;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vk1.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr45/FR45AlertsActivity;", "Lcom/garmin/android/apps/connectmobile/settings/activityoptions/AlertsActivity;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FR45AlertsActivity extends AlertsActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f42992f = new a(null);

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.AlertsActivity
    public final ArrayList ea(b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new x0(this));
        arrayList.add(new m1(this));
        arrayList.add(new m0(this, bVar));
        arrayList.add(new g2(this));
        arrayList.add(new d0(this));
        arrayList.add(new t(this));
        return super.ea(bVar);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.AlertsActivity
    public final String fa() {
        return "FR45AlertsActivity";
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.AlertsActivity, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_activity_options_dynamic_content);
        initActionBar(true, R.string.device_alerts);
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) extras.getParcelable("GCM_deviceActivityOptions", f.class);
        } else {
            Parcelable parcelable2 = extras.getParcelable("GCM_deviceActivityOptions");
            if (!(parcelable2 instanceof f)) {
                parcelable2 = null;
            }
            parcelable = (f) parcelable2;
        }
        this.f41617c = (f) parcelable;
        this.f41615a = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.AlertsActivity, java.util.Observer
    @e
    public final void update(Observable observable, Object obj) {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr45/FR45AlertsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

package com.garmin.android.apps.connectmobile.settings.devices.fr45;

import android.os.Bundle;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity;
import ih1.b;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr45/FR45ActivityOptionsActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FR45ActivityOptionsActivity extends ActivityOptionsActivity {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f42991n = new a(null);

    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity
    public final void da() {
        b bVar = new b(this);
        this.f42538l = bVar;
        bVar.b(this.f42528b);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity
    public final com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a ea(ArrayList arrayList, ActivityOptionsActivity.a aVar) {
        return new ih1.a(this, arrayList, aVar);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.device_settings_displayed_activities);
        TextView textView = this.f42531e;
        if (textView != null) {
            textView.setText(getString(R.string.device_settings_displayed_activities_footer_2, Integer.valueOf(this.f42527a)));
        } else {
            s.m("mMaximumAllowedLabel");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr45/FR45ActivityOptionsActivity$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

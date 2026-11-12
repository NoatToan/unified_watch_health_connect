package com.garmin.android.apps.connectmobile.settings.devices.common.smartnotifications;

import android.content.Intent;
import android.os.Bundle;
import ch1.f4;
import ch1.i4;
import ch1.k4;
import ch1.p2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.gncs.GNCSOptOutSettingsActivity;
import fb2.k;
import java.util.Observable;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import vg1.f0;
import vg1.k0;
import wd.c;
import wg1.b;
import wg1.d;
import wg1.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/smartnotifications/SmartNotificationsActivity;", "Lvg1/f0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SmartNotificationsActivity extends f0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f42849j = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f42850i = m.b(new c(this, 2));

    @Override // vg1.f0
    public final void da() {
        wg1.c cVar = new wg1.c(this);
        b bVar = new b(this);
        ca(new k4(this, cVar), 0);
        ca(new k4(this, bVar), 0);
        d dVarNa = na();
        if (dVarNa != null && dVarNa.f185127c) {
            ca(new i4(this), 0);
            ca(new k(this, true), 2);
        }
        d dVarNa2 = na();
        if (dVarNa2 != null && dVarNa2.f185128d) {
            ca(new f4(this), 0);
            ca(new k(this, true), 2);
        }
        ca(new p2(this), 2);
    }

    @Override // vg1.f0
    public final int ea() {
        return 2;
    }

    @Override // vg1.f0
    public final k0 fa() {
        return new k0(this, this, 2);
    }

    @Override // vg1.f0
    public final String ga() {
        String string = getString(R.string.lbl_smart_notifications);
        string.getClass();
        return string;
    }

    public final d na() {
        return (d) this.f42850i.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        if (i15 == -1 && i14 == 1) {
            ma((DeviceSettingsDTO) ((intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("GCM_deviceSettings")));
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof k4) {
            boolean zA = ((k4) observable).f27399f.a();
            j jVar = null;
            d dVarNa = na();
            if (zA) {
                if (dVarNa != null) {
                    jVar = dVarNa.f185126b;
                }
            } else if (dVarNa != null) {
                jVar = dVarNa.f185125a;
            }
            SmartNotificationsValueActivity.f42853o.getClass();
            Intent intent = new Intent(this, (Class<?>) SmartNotificationsValueActivity.class);
            intent.putExtra("extra_during_activity", zA);
            intent.putExtra("extra_configuration", jVar);
            intent.putExtras(ha());
            startActivityForResult(intent, 1);
            return;
        }
        if (observable instanceof i4) {
            SmartNotificationsTimeoutActivity.f42852i.getClass();
            Intent intent2 = new Intent(this, (Class<?>) SmartNotificationsTimeoutActivity.class);
            intent2.putExtras(ha());
            startActivityForResult(intent2, 1);
            return;
        }
        if (observable instanceof f4) {
            SmartNotificationsPrivacyActivity.f42851i.getClass();
            Intent intent3 = new Intent(this, (Class<?>) SmartNotificationsPrivacyActivity.class);
            intent3.putExtras(ha());
            startActivityForResult(intent3, 1);
            return;
        }
        if (observable instanceof p2) {
            GNCSOptOutSettingsActivity.f35738a.getClass();
            startActivity(new Intent(this, (Class<?>) GNCSOptOutSettingsActivity.class));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/smartnotifications/SmartNotificationsActivity$a;", "", "<init>", "()V", "", "REQUEST_CODE_SMART_NOTIFICATIONS", "I", "", "EXTRA_CONFIGURATION", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(com.garmin.android.apps.connectmobile.c cVar, d dVar) {
            Intent intent = new Intent(cVar, (Class<?>) SmartNotificationsActivity.class);
            intent.putExtra("extra_configuration", dVar);
            return intent;
        }

        private a() {
        }
    }
}

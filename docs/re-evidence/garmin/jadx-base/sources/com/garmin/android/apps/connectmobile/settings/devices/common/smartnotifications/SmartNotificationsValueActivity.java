package com.garmin.android.apps.connectmobile.settings.devices.common.smartnotifications;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import ch1.b4;
import ch1.c4;
import ch1.g4;
import ch1.j4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.smartnotifications.SmartNotificationsValueActivity;
import fb2.k;
import java.util.Observable;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vg1.f0;
import vg1.k0;
import wg1.f;
import wg1.g;
import wg1.i;
import wg1.j;
import wi1.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/smartnotifications/SmartNotificationsValueActivity;", "Lvg1/f0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SmartNotificationsValueActivity extends f0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f42853o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h.d f42854p = h.d.SHOW_ALL;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f42855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f42856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c4 f42857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j4 f42858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g4 f42859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b4 f42860n;

    public SmartNotificationsValueActivity() {
        final int i14 = 0;
        this.f42855i = m.b(new e23.a(this) { // from class: wg1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SmartNotificationsValueActivity f185130b;

            {
                this.f185130b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i15 = i14;
                SmartNotificationsValueActivity smartNotificationsValueActivity = this.f185130b;
                switch (i15) {
                    case 0:
                        SmartNotificationsValueActivity.a aVar = SmartNotificationsValueActivity.f42853o;
                        Bundle extras = smartNotificationsValueActivity.getIntent().getExtras();
                        return Boolean.valueOf(extras != null ? extras.getBoolean("extra_during_activity") : false);
                    default:
                        SmartNotificationsValueActivity.a aVar2 = SmartNotificationsValueActivity.f42853o;
                        Bundle extras2 = smartNotificationsValueActivity.getIntent().getExtras();
                        if (extras2 == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable = (Parcelable) extras2.getParcelable("extra_configuration", j.class);
                        } else {
                            Parcelable parcelable2 = extras2.getParcelable("extra_configuration");
                            parcelable = (j) (parcelable2 instanceof j ? parcelable2 : null);
                        }
                        return (j) parcelable;
                }
            }
        });
        final int i15 = 1;
        this.f42856j = m.b(new e23.a(this) { // from class: wg1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SmartNotificationsValueActivity f185130b;

            {
                this.f185130b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i16 = i15;
                SmartNotificationsValueActivity smartNotificationsValueActivity = this.f185130b;
                switch (i16) {
                    case 0:
                        SmartNotificationsValueActivity.a aVar = SmartNotificationsValueActivity.f42853o;
                        Bundle extras = smartNotificationsValueActivity.getIntent().getExtras();
                        return Boolean.valueOf(extras != null ? extras.getBoolean("extra_during_activity") : false);
                    default:
                        SmartNotificationsValueActivity.a aVar2 = SmartNotificationsValueActivity.f42853o;
                        Bundle extras2 = smartNotificationsValueActivity.getIntent().getExtras();
                        if (extras2 == null) {
                            return null;
                        }
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable = (Parcelable) extras2.getParcelable("extra_configuration", j.class);
                        } else {
                            Parcelable parcelable2 = extras2.getParcelable("extra_configuration");
                            parcelable = (j) (parcelable2 instanceof j ? parcelable2 : null);
                        }
                        return (j) parcelable;
                }
            }
        });
    }

    public static final h na(SmartNotificationsValueActivity smartNotificationsValueActivity, DeviceSettingsDTO deviceSettingsDTO) {
        return ((Boolean) smartNotificationsValueActivity.f42855i.getValue()).booleanValue() ? deviceSettingsDTO.f33863b1 : deviceSettingsDTO.f33865c1;
    }

    @Override // vg1.f0
    public final void da() {
        g gVar = new g(this);
        i iVar = new i(this);
        wg1.h hVar = new wg1.h(this);
        f fVar = new f(this);
        c4 c4Var = new c4(this, gVar);
        this.f42857k = c4Var;
        ca(c4Var, 0);
        j4 j4Var = new j4(this, iVar);
        this.f42858l = j4Var;
        ca(j4Var, 0);
        t tVar = this.f42856j;
        j jVar = (j) tVar.getValue();
        if (jVar != null && jVar.f185135a) {
            ca(new k(this, true), 2);
            g4 g4Var = new g4(this, hVar);
            this.f42859m = g4Var;
            ca(g4Var, 0);
        }
        j jVar2 = (j) tVar.getValue();
        if (jVar2 == null || !jVar2.f185136b) {
            return;
        }
        if (this.f42859m == null) {
            ca(new k(this, true), 2);
        }
        b4 b4Var = new b4(this, fVar);
        this.f42860n = b4Var;
        ca(b4Var, 0);
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
        String string = getString(((Boolean) this.f42855i.getValue()).booleanValue() ? R.string.device_settings_during_activity : R.string.lbl_general_use);
        string.getClass();
        return string;
    }

    @Override // vg1.f0
    public final void la() {
        c4 c4Var = this.f42857k;
        if (c4Var != null) {
            oa(c4Var.x());
        } else {
            s.m("smartNotificationsEnabledField");
            throw null;
        }
    }

    public final void oa(boolean z14) {
        j4 j4Var = this.f42858l;
        if (z14) {
            if (j4Var == null) {
                s.m("visibilityField");
                throw null;
            }
            j4Var.m(true);
            b4 b4Var = this.f42860n;
            if (b4Var != null) {
                b4Var.m(true);
                return;
            }
            return;
        }
        if (j4Var == null) {
            s.m("visibilityField");
            throw null;
        }
        j4Var.m(false);
        b4 b4Var2 = this.f42860n;
        if (b4Var2 != null) {
            b4Var2.m(false);
        }
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
        if (observable instanceof c4) {
            oa(((c4) observable).x());
            ma(this.f178102a.e());
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/smartnotifications/SmartNotificationsValueActivity$a;", "", "<init>", "()V", "", "EXTRA_DURING_ACTIVITY", "Ljava/lang/String;", "EXTRA_CONFIGURATION", "", "REQUEST_CODE_SMART_NOTIFICATIONS", "I", "Lwi1/h$d;", "DEFAULT_SMART_NOTIFICATIONS_STATUS", "Lwi1/h$d;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

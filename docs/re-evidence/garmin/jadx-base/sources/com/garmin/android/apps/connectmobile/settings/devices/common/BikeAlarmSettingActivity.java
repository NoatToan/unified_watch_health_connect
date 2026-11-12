package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft.AntiTheftDisableRequestEvent;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft.AntiTheftEventListener;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft.AntiTheftMovementAlertEvent;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft.AntiTheftSettingChangeRequestEvent;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIAntiTheftAlarmProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.Internal;
import n23.j;
import o53.c2;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import pi2.g;
import pi2.h;
import ro0.l;
import v.b0;
import zb0.p0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/BikeAlarmSettingActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/settings/devices/common/c$a;", "Lcom/garmin/android/apps/connectmobile/settings/devices/common/b$a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BikeAlarmSettingActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.settings.devices.common.c.a, com.garmin.android.apps.connectmobile.settings.devices.common.b.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f42584f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.devices.common.c f42585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f42586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f42587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f42588d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f42589e = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/BikeAlarmSettingActivity$a;", "", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        DEVICE_NOT_CONNECTED,
        DEVICE_BIKE_ALARM_NOT_SETUP
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/common/BikeAlarmSettingActivity$b", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/antitheft/AntiTheftEventListener;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends AntiTheftEventListener {
        public b() {
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft.AntiTheftEventListener
        public final void disableRequestReceived(AntiTheftDisableRequestEvent antiTheftDisableRequestEvent) {
            antiTheftDisableRequestEvent.getClass();
            BikeAlarmSettingActivity bikeAlarmSettingActivity = BikeAlarmSettingActivity.this;
            bikeAlarmSettingActivity.runOnUiThread(new b0(bikeAlarmSettingActivity, 8));
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft.AntiTheftEventListener
        public final void movementAlertNotificationReceived(AntiTheftMovementAlertEvent antiTheftMovementAlertEvent) {
            antiTheftMovementAlertEvent.getClass();
            BikeAlarmSettingActivity bikeAlarmSettingActivity = BikeAlarmSettingActivity.this;
            bikeAlarmSettingActivity.runOnUiThread(new vg1.d(2, bikeAlarmSettingActivity, antiTheftMovementAlertEvent));
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft.AntiTheftEventListener
        public final void settingChangeRequestReceived(AntiTheftSettingChangeRequestEvent antiTheftSettingChangeRequestEvent) {
            antiTheftSettingChangeRequestEvent.getClass();
            BikeAlarmSettingActivity bikeAlarmSettingActivity = BikeAlarmSettingActivity.this;
            bikeAlarmSettingActivity.runOnUiThread(new vg1.d(1, bikeAlarmSettingActivity, antiTheftSettingChangeRequestEvent));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/common/BikeAlarmSettingActivity$c", "Lxf0/b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends xf0.b {
        public c() {
        }

        @Override // xf0.b
        public final void deviceConnected(g gVar) {
            gVar.getClass();
            int i14 = BikeAlarmSettingActivity.f42584f;
            BikeAlarmSettingActivity.this.ca();
        }

        @Override // xf0.b
        public final void deviceDisconnected(h hVar) {
            hVar.getClass();
            int i14 = BikeAlarmSettingActivity.f42584f;
            BikeAlarmSettingActivity.this.ca();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.common.b.a
    public final void c7(int i14) {
        Long l14 = this.f42586b;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            BikeAlarmResetPassCodeActivity.a aVar = BikeAlarmResetPassCodeActivity.f42565o;
            Long lValueOf = Long.valueOf(jLongValue);
            aVar.getClass();
            Intent intent = new Intent(this, (Class<?>) BikeAlarmResetPassCodeActivity.class);
            intent.putExtra("PIN_KEY", i14);
            intent.putExtra("PIN_DEVICE_ID", lValueOf);
            startActivity(intent);
        }
    }

    public final void ca() {
        Long l14 = this.f42586b;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            if (!((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).a(jLongValue)) {
                ea("BIKE_ALARM_NOT_CONNECTED_FRAG_TAG", a.DEVICE_NOT_CONNECTED);
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.common.c cVar = new com.garmin.android.apps.connectmobile.settings.devices.common.c(jLongValue, this);
            this.f42585a = cVar;
            cVar.a();
        }
    }

    public final com.garmin.android.apps.connectmobile.settings.devices.common.b da() {
        Fragment fragmentG = getSupportFragmentManager().G("BIKE_ALARM_OPTIONS_FRAG_TAG");
        if (fragmentG != null) {
            return (com.garmin.android.apps.connectmobile.settings.devices.common.b) fragmentG;
        }
        return null;
    }

    public final void ea(String str, a aVar) {
        Fragment fragmentG = getSupportFragmentManager().G(str);
        if (fragmentG != null) {
            v supportFragmentManager = getSupportFragmentManager();
            j.c(supportFragmentManager, supportFragmentManager, R.id.bike_alarm_setup_container, fragmentG, str).s(true, true);
            return;
        }
        d.f42829a.getClass();
        aVar.getClass();
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putString("CONNECTION_STATUS_KEY", aVar.name());
        dVar.setArguments(bundle);
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
        aVar2.l(R.id.bike_alarm_setup_container, dVar, str);
        aVar2.s(true, true);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.common.c.a
    public final void i5(com.garmin.android.apps.connectmobile.settings.devices.common.c.b bVar, GDISmartProto.Smart smart) {
        Internal.EnumLite response;
        bVar.getClass();
        if (smart != null && vg1.f.a(smart).hasSettingResponse()) {
            a2 a2Var = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.k(a2Var, "BikeAlarmSettingActivity", "Received Setting Response");
            GDIAntiTheftAlarmProto.SettingResponse settingResponse = vg1.f.a(smart).getSettingResponse();
            com.garmin.android.apps.connectmobile.settings.devices.common.c.b bVar2 = com.garmin.android.apps.connectmobile.settings.devices.common.c.b.SUCCESS;
            if (bVar == bVar2 && settingResponse != null && settingResponse.hasPin()) {
                c2 c2Var = this.f42587c;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                this.f42587c = null;
                com.garmin.android.apps.connectmobile.settings.devices.common.b.C0798b c0798b = com.garmin.android.apps.connectmobile.settings.devices.common.b.f42819d;
                Long l14 = this.f42586b;
                c0798b.getClass();
                com.garmin.android.apps.connectmobile.settings.devices.common.b bVar3 = new com.garmin.android.apps.connectmobile.settings.devices.common.b();
                Bundle bundle = new Bundle();
                bundle.putBoolean("ARM_BIKE_ALARM_KEY", settingResponse.getIsEnabled());
                bundle.putInt("PASS_CODE_KEY", settingResponse.getPin());
                bundle.putBoolean("SOUND_ALARM_KEY", settingResponse.getIsTriggered());
                if (l14 != null) {
                    bundle.putLong("DEVICE_ID_KEY", l14.longValue());
                }
                bVar3.setArguments(bundle);
                v supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.l(R.id.bike_alarm_setup_container, bVar3, "BIKE_ALARM_OPTIONS_FRAG_TAG");
                aVar.s(true, true);
            } else if (bVar != bVar2 || settingResponse == null || settingResponse.hasPin()) {
                c2 c2Var2 = this.f42587c;
                if (c2Var2 != null) {
                    c2Var2.c(null);
                }
                this.f42587c = null;
                ea("BIKE_ALARM_NOT_CONNECTED_FRAG_TAG", a.DEVICE_NOT_CONNECTED);
            } else {
                ea("BIKE_ALARM_INSTRUCTIONS_FRAG_TAG", a.DEVICE_BIKE_ALARM_NOT_SETUP);
                c2 c2Var3 = this.f42587c;
                if (c2Var3 == null || !c2Var3.isActive()) {
                    this.f42587c = ge1.b.T(f0.w(this), null, null, new vg1.e(this, null), 3);
                }
            }
        } else if (smart != null && vg1.f.a(smart).hasSettingChangeResponse()) {
            a2 a2Var2 = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.k(a2Var2, "BikeAlarmSettingActivity", "Received Setting Change Response");
            com.garmin.android.apps.connectmobile.settings.devices.common.b bVarDa = da();
            if (bVarDa != null) {
                GDIAntiTheftAlarmProto.SettingChangeResponse settingChangeResponse = vg1.f.a(smart).getSettingChangeResponse();
                if ((settingChangeResponse != null ? settingChangeResponse.getResponse() : null) != GDIAntiTheftAlarmProto.SettingChangeResponse.Response.ERROR) {
                    SwitchCompat switchCompat = bVarDa.f42821b;
                    if (switchCompat == null) {
                        s.m("bikeAlarmOptionsArmSwitch");
                        throw null;
                    }
                    if (!switchCompat.isChecked()) {
                        bVarDa.u6("BIKE_ALARM_DISABLE_TAG", false);
                    }
                }
            }
        } else if (smart != null && vg1.f.a(smart).hasTriggerResponse()) {
            a2 a2Var3 = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.k(a2Var3, "BikeAlarmSettingActivity", "Received Trigger Response");
            com.garmin.android.apps.connectmobile.settings.devices.common.b bVarDa2 = da();
            if (bVarDa2 != null) {
                GDIAntiTheftAlarmProto.TriggerResponse triggerResponse = vg1.f.a(smart).getTriggerResponse();
                response = triggerResponse != null ? triggerResponse.getResponse() : null;
                if (response != null) {
                    if (response == GDIAntiTheftAlarmProto.TriggerResponse.Response.SUCCESS || response == GDIAntiTheftAlarmProto.TriggerResponse.Response.ERROR_ALREADY_IN_PROGRESS) {
                        bVarDa2.u6("BIKE_ALARM_SOUND_TAG", true);
                    } else {
                        Toast.makeText(bVarDa2.getContext(), R.string.txt_something_went_wrong_try_again, 0).show();
                    }
                }
            }
        } else if (smart == null || !vg1.f.a(smart).hasDisableResponse()) {
            Toast.makeText(this, R.string.txt_something_went_wrong_try_again, 0).show();
        } else {
            a2 a2Var4 = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.k(a2Var4, "BikeAlarmSettingActivity", "Received Disable Trigger Response");
            com.garmin.android.apps.connectmobile.settings.devices.common.b bVarDa3 = da();
            if (bVarDa3 != null) {
                GDIAntiTheftAlarmProto.DisableResponse disableResponse = vg1.f.a(smart).getDisableResponse();
                response = disableResponse != null ? disableResponse.getResponse() : null;
                if (response != null) {
                    if (response == GDIAntiTheftAlarmProto.DisableResponse.Response.SUCCESS || response == GDIAntiTheftAlarmProto.DisableResponse.Response.ERROR_ALREADY_CANCELLED) {
                        bVarDa3.u6("BIKE_ALARM_DISABLE_TAG", false);
                    } else {
                        Toast.makeText(bVarDa3.getContext(), R.string.txt_something_went_wrong_try_again, 0).show();
                    }
                }
            }
        }
        Long l15 = this.f42586b;
        if (l15 != null) {
            p0 p0Var = new p0(this, l15.longValue());
            new com.garmin.android.apps.connectmobile.settings.devices.common.c(p0Var.f203612a, p0Var).a();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bike_alarm_setting);
        initActionBar(R.string.lbl_bike_alarm, 2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            long j8 = extras.getLong("GCM_deviceUnitID");
            this.f42586b = Long.valueOf(j8);
            new com.garmin.android.apps.connectmobile.settings.devices.common.a(this, j8);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, l.BIKE_ALARM, null, null, 12);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.c(this.f42588d);
        oi2.a.C2513a.c(this.f42589e);
        c2 c2Var = this.f42587c;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f42587c = null;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        ca();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(this.f42588d);
        oi2.a.C2513a.b(this.f42589e);
    }
}

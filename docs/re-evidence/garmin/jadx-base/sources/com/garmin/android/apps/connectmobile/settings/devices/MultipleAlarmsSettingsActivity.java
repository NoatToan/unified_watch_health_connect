package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.i;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import mt0.h0;
import ng1.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/MultipleAlarmsSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/settings/devices/d$b;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultipleAlarmsSettingsActivity extends com.garmin.android.apps.connectmobile.c implements d.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f42152i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f42153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceSettingsDTO f42154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f42155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f42156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f42157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f42158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42160h;

    public static final void fa(j jVar, DeviceSettingsDTO deviceSettingsDTO, long j8) {
        f42152i.getClass();
        Intent intent = new Intent(jVar, (Class<?>) MultipleAlarmsSettingsActivity.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceUnitID", j8);
        jVar.startActivityForResult(intent, 12);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.d.b
    public final void C7(int i14, i iVar) {
        Vivosmart3CreateEditDeviceAlarmActivity.a aVar = Vivosmart3CreateEditDeviceAlarmActivity.f42315o;
        boolean z14 = this.f42159g;
        aVar.getClass();
        Intent intent = new Intent(this, (Class<?>) Vivosmart3CreateEditDeviceAlarmActivity.class);
        intent.putExtra("extras_device_alarm", iVar);
        intent.putExtra("extras_alarm_id", i14);
        intent.putExtra("extras_twelve_hour_format", z14);
        startActivityForResult(intent, 101);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.d.b
    public final void Y6(int i14) {
        String string = getString(R.string.remove_alarm_confirmation);
        string.getClass();
        new androidx.appcompat.app.e.a(this).setMessage(string).setPositiveButton(R.string.lbl_delete, new ha1.c(this, i14, 2)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create().show();
    }

    public final void ca() {
        if (!this.f42160h) {
            d dVar = this.f42155c;
            dVar.getClass();
            if (!dVar.f42890d) {
                finish();
                return;
            }
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f42154b;
        if (deviceSettingsDTO != null) {
            d dVar2 = this.f42155c;
            dVar2.getClass();
            deviceSettingsDTO.f33876i = dVar2.f42891e;
            deviceSettingsDTO.S1("alarms");
            getIntent().putExtra("GCM_deviceSettings", this.f42154b);
            setResult(-1, getIntent());
            finish();
        }
    }

    public final void da(DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO.D() != null) {
            List<i> listD = deviceSettingsDTO.D();
            listD.getClass();
            int size = listD.size();
            Button button = this.f42156d;
            button.getClass();
            Integer num = deviceSettingsDTO.f33883l;
            if (num == null) {
                num = 0;
            }
            button.setEnabled(size < num.intValue());
        }
    }

    public final void ea(DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO.D() != null) {
            List<i> listD = deviceSettingsDTO.D();
            listD.getClass();
            int size = listD.size();
            LinearLayout linearLayout = this.f42157e;
            linearLayout.getClass();
            linearLayout.setVisibility(size == 0 ? 0 : 8);
            LinearLayout linearLayout2 = this.f42158f;
            linearLayout2.getClass();
            linearLayout2.setVisibility(size != 0 ? 0 : 8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && intent != null && i14 == 101) {
            int intExtra = intent.getIntExtra("extras_alarm_id", -1);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("extras_device_alarm", i.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("extras_device_alarm");
                if (!(parcelableExtra instanceof i)) {
                    parcelableExtra = null;
                }
                parcelable = (i) parcelableExtra;
            }
            i iVar = (i) parcelable;
            if (iVar != null) {
                if (intExtra == -1) {
                    DeviceSettingsDTO deviceSettingsDTO = this.f42154b;
                    deviceSettingsDTO.getClass();
                    List<i> listD = deviceSettingsDTO.D();
                    listD.getClass();
                    listD.add(iVar);
                    d dVar = this.f42155c;
                    dVar.getClass();
                    DeviceSettingsDTO deviceSettingsDTO2 = this.f42154b;
                    deviceSettingsDTO2.getClass();
                    List<i> listD2 = deviceSettingsDTO2.D();
                    listD2.getClass();
                    dVar.d(listD2);
                    DeviceSettingsDTO deviceSettingsDTO3 = this.f42154b;
                    deviceSettingsDTO3.getClass();
                    da(deviceSettingsDTO3);
                    DeviceSettingsDTO deviceSettingsDTO4 = this.f42154b;
                    deviceSettingsDTO4.getClass();
                    ea(deviceSettingsDTO4);
                } else {
                    d dVar2 = this.f42155c;
                    dVar2.getClass();
                    dVar2.e(intExtra, iVar);
                }
            }
            if (intent.getBooleanExtra("extras_alarm_deleted", false)) {
                d dVar3 = this.f42155c;
                dVar3.getClass();
                dVar3.a(intExtra);
                DeviceSettingsDTO deviceSettingsDTO5 = this.f42154b;
                deviceSettingsDTO5.getClass();
                da(deviceSettingsDTO5);
                DeviceSettingsDTO deviceSettingsDTO6 = this.f42154b;
                deviceSettingsDTO6.getClass();
                ea(deviceSettingsDTO6);
            }
            this.f42160h = true;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ca();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_alarms_settings_list);
        initActionBar(true, R.string.device_setting_alarms);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f42153a = extras.getLong("GCM_deviceUnitID", -1L);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_deviceSettings", DeviceSettingsDTO.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_deviceSettings");
                if (!(parcelable2 instanceof DeviceSettingsDTO)) {
                    parcelable2 = null;
                }
                parcelable = (DeviceSettingsDTO) parcelable2;
            }
            this.f42154b = (DeviceSettingsDTO) parcelable;
        }
        if (this.f42153a < 0) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar.getClass();
            i2.a.f(a2Var, "MultipleAlarmsSettingsActivity", "Invalid alarm settings object while entering device settings alarm screen!");
            finish();
            return;
        }
        View viewFindViewById = findViewById(R.id.alarm_settings_list);
        viewFindViewById.getClass();
        d dVar = new d(this, this);
        this.f42155c = dVar;
        ((ListView) viewFindViewById).setAdapter((ListAdapter) dVar);
        View viewFindViewById2 = findViewById(R.id.create_edit_alarm);
        viewFindViewById2.getClass();
        Button button = (Button) viewFindViewById2;
        this.f42156d = button;
        button.setOnClickListener(new h0(this, 17));
        View viewFindViewById3 = findViewById(R.id.no_alarms_message_icon);
        viewFindViewById3.getClass();
        this.f42157e = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.alarm_list_container);
        viewFindViewById4.getClass();
        this.f42158f = (LinearLayout) viewFindViewById4;
        DeviceSettingsDTO deviceSettingsDTO = this.f42154b;
        if (deviceSettingsDTO != null) {
            this.f42159g = deviceSettingsDTO.h0() == DeviceSettingsDTO.p.TWELVE_HOUR;
            d dVar2 = this.f42155c;
            dVar2.getClass();
            dVar2.f42889c = this.f42159g;
            d dVar3 = this.f42155c;
            dVar3.getClass();
            DeviceSettingsDTO deviceSettingsDTO2 = this.f42154b;
            deviceSettingsDTO2.getClass();
            List<i> listD = deviceSettingsDTO2.D();
            listD.getClass();
            dVar3.d(listD);
            DeviceSettingsDTO deviceSettingsDTO3 = this.f42154b;
            deviceSettingsDTO3.getClass();
            da(deviceSettingsDTO3);
            DeviceSettingsDTO deviceSettingsDTO4 = this.f42154b;
            deviceSettingsDTO4.getClass();
            ea(deviceSettingsDTO4);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ca();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/MultipleAlarmsSettingsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_EDIT_ALARM", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

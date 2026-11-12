package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatEditText;
import ch1.q0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Observable;
import java.util.Observer;
import ng1.k0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vg1.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/DeviceNameWidgetActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Ljava/util/Observer;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceNameWidgetActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f42633g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatEditText f42634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DeviceSettingsDTO f42638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q0 f42639f;

    @Override // android.app.Activity
    public final void finish() {
        q0 q0Var = this.f42639f;
        if (q0Var != null) {
            q0Var.n();
        }
        setResult(-1, new Intent().putExtra("GCM_deviceSettings", this.f42638e));
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_name_input_field);
        AppCompatEditText appCompatEditText = (AppCompatEditText) findViewById(R.id.deviceNameInputField);
        this.f42634a = appCompatEditText;
        appCompatEditText.getClass();
        appCompatEditText.addTextChangedListener(new n(this));
        initActionBar(true, R.string.lbl_display_name);
        Bundle extras = getIntent().getExtras();
        DeviceSettingsDTO deviceSettingsDTO = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_deviceSettings", DeviceSettingsDTO.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_deviceSettings");
                parcelable = (DeviceSettingsDTO) (parcelable2 instanceof DeviceSettingsDTO ? parcelable2 : null);
            }
            deviceSettingsDTO = (DeviceSettingsDTO) parcelable;
        }
        this.f42638e = deviceSettingsDTO;
        if (deviceSettingsDTO == null) {
            a2 a2Var = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "DeviceNameWidgetActivity", "onCreate: mDeviceSettingsDTO is null. Finishing activity.");
            finish();
            return;
        }
        q0 q0Var = new q0(this);
        this.f42639f = q0Var;
        DeviceSettingsDTO deviceSettingsDTO2 = this.f42638e;
        deviceSettingsDTO2.getClass();
        boolean zG = q0Var.g(this, deviceSettingsDTO2);
        q0Var.addObserver(this);
        q0Var.m(zG);
    }

    @Override // java.util.Observer
    @o13.e
    public final void update(Observable observable, Object obj) {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/DeviceNameWidgetActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(k0 k0Var, DeviceSettingsDTO deviceSettingsDTO, int i14) {
            Intent intent = new Intent(k0Var, (Class<?>) DeviceNameWidgetActivity.class);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
            k0Var.startActivityForResult(intent, i14);
        }

        private a() {
        }
    }
}

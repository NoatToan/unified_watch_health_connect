package vg1;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatEditText;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvg1/b;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f178068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ch1.s0 f178069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f178070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f178071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f178072e;

    public abstract int ca();

    public abstract int da();

    @Override // android.app.Activity
    public final void finish() {
        ch1.s0 s0Var = this.f178069b;
        if (s0Var != null) {
            s0Var.n();
        }
        Intent intent = new Intent();
        DeviceSettingsDTO deviceSettingsDTO = this.f178068a;
        if (deviceSettingsDTO == null) {
            p005kotlin.jvm.internal.s.m("deviceSettings");
            throw null;
        }
        setResult(-1, intent.putExtra("GCM_deviceSettings", deviceSettingsDTO));
        super.finish();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DeviceSettingsDTO deviceSettingsDTO;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_scale_device_name_input_field);
        initActionBar(true, ca());
        AppCompatEditText appCompatEditText = (AppCompatEditText) findViewById(R.id.deviceNameInputField);
        if (appCompatEditText != null) {
            appCompatEditText.addTextChangedListener(new a(this, appCompatEditText));
        }
        Intent intent = getIntent();
        if (intent == null) {
            deviceSettingsDTO = new DeviceSettingsDTO();
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("GCM_extra_user_personal_information", DeviceSettingsDTO.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("GCM_extra_user_personal_information");
                if (!(parcelableExtra instanceof DeviceSettingsDTO)) {
                    parcelableExtra = null;
                }
                parcelable = (DeviceSettingsDTO) parcelableExtra;
            }
            deviceSettingsDTO = (DeviceSettingsDTO) parcelable;
            if (deviceSettingsDTO == null) {
                deviceSettingsDTO = new DeviceSettingsDTO();
            }
        }
        this.f178068a = deviceSettingsDTO;
        ch1.s0 s0Var = new ch1.s0(this, da());
        this.f178069b = s0Var;
        DeviceSettingsDTO deviceSettingsDTO2 = this.f178068a;
        if (deviceSettingsDTO2 != null) {
            s0Var.m(s0Var.g(this, deviceSettingsDTO2));
        } else {
            p005kotlin.jvm.internal.s.m("deviceSettings");
            throw null;
        }
    }
}

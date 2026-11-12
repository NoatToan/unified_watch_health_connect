package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class Vivoactive3DeviceSettingsCrownOrientation extends com.garmin.android.apps.connectmobile.c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageButton f42197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageButton f42198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42199c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42200d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DeviceSettingsDTO f42201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42205i;

    public final void ca() {
        DeviceSettingsDTO.v vVarE0 = this.f42201e.e0();
        DeviceSettingsDTO.v vVar = DeviceSettingsDTO.v.RIGHT;
        boolean z14 = this.f42199c;
        if (vVarE0 == vVar) {
            ImageButton imageButton = this.f42197a;
            if (z14) {
                imageButton.setImageResource(this.f42203g);
                this.f42198b.setImageResource(this.f42204h);
                return;
            } else {
                imageButton.setImageResource(this.f42202f);
                this.f42198b.setImageResource(this.f42205i);
                return;
            }
        }
        ImageButton imageButton2 = this.f42198b;
        if (z14) {
            imageButton2.setImageResource(this.f42203g);
            this.f42197a.setImageResource(this.f42204h);
        } else {
            imageButton2.setImageResource(this.f42202f);
            this.f42197a.setImageResource(this.f42205i);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f42201e.e0() == DeviceSettingsDTO.v.LEFT) {
            boolean z14 = this.f42199c;
            DeviceSettingsDTO deviceSettingsDTO = this.f42201e;
            if (z14) {
                DeviceSettingsDTO.r rVar = DeviceSettingsDTO.r.LANDSCAPE;
                deviceSettingsDTO.getClass();
                rVar.getClass();
                deviceSettingsDTO.C = rVar.f34046a;
            } else {
                DeviceSettingsDTO.r rVar2 = DeviceSettingsDTO.r.LANDSCAPE_FLIPPED;
                deviceSettingsDTO.getClass();
                rVar2.getClass();
                deviceSettingsDTO.C = rVar2.f34046a;
            }
        } else if (this.f42201e.e0() == DeviceSettingsDTO.v.RIGHT) {
            boolean z15 = this.f42199c;
            DeviceSettingsDTO deviceSettingsDTO2 = this.f42201e;
            if (z15) {
                DeviceSettingsDTO.r rVar3 = DeviceSettingsDTO.r.LANDSCAPE_FLIPPED;
                deviceSettingsDTO2.getClass();
                rVar3.getClass();
                deviceSettingsDTO2.C = rVar3.f34046a;
            } else {
                DeviceSettingsDTO.r rVar4 = DeviceSettingsDTO.r.LANDSCAPE;
                deviceSettingsDTO2.getClass();
                rVar4.getClass();
                deviceSettingsDTO2.C = rVar4.f34046a;
            }
        }
        getIntent().putExtra("GCM_deviceSettings", this.f42201e);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view2) {
        int id3 = view2.getId();
        if (id3 == R.id.vivoactive3_orientation_crown_facing_left) {
            if (this.f42199c) {
                this.f42200d = true;
                this.f42199c = false;
                ca();
                return;
            } else {
                this.f42199c = true;
                this.f42200d = false;
                ca();
                return;
            }
        }
        if (id3 == R.id.vivoactive3_orientation_crown_facing_right) {
            if (this.f42200d) {
                this.f42199c = true;
                this.f42200d = false;
                ca();
            } else {
                this.f42200d = true;
                this.f42199c = false;
                ca();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_vivoactive3_orientation);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        this.f42201e = (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings");
        initActionBar(getString(R.string.device_setting_orientation), 2);
        this.f42197a = (ImageButton) findViewById(R.id.vivoactive3_orientation_crown_facing_left);
        this.f42198b = (ImageButton) findViewById(R.id.vivoactive3_orientation_crown_facing_right);
        if (this.f42201e.e0() == null) {
            finish();
        } else if (this.f42201e.e0() == DeviceSettingsDTO.v.LEFT) {
            this.f42202f = 2131233583;
            this.f42203g = 2131233584;
            this.f42204h = 2131233580;
            this.f42205i = 2131233581;
            ca();
        } else {
            this.f42204h = 2131233589;
            this.f42205i = 2131233590;
            this.f42202f = 2131233586;
            this.f42203g = 2131233587;
            ca();
        }
        this.f42197a.setOnClickListener(this);
        this.f42198b.setOnClickListener(this);
        DeviceSettingsDTO.v vVarE0 = this.f42201e.e0();
        DeviceSettingsDTO.v vVar = DeviceSettingsDTO.v.LEFT;
        DeviceSettingsDTO deviceSettingsDTO = this.f42201e;
        if (vVarE0 == vVar) {
            if (deviceSettingsDTO.j0() == DeviceSettingsDTO.r.LANDSCAPE) {
                this.f42199c = true;
                this.f42200d = false;
                ca();
                return;
            } else {
                this.f42200d = true;
                this.f42199c = false;
                ca();
                return;
            }
        }
        if (deviceSettingsDTO.e0() != DeviceSettingsDTO.v.RIGHT) {
            finish();
            return;
        }
        if (this.f42201e.j0() == DeviceSettingsDTO.r.LANDSCAPE) {
            this.f42200d = true;
            this.f42199c = false;
            ca();
        } else {
            this.f42199c = true;
            this.f42200d = false;
            ca();
        }
    }
}

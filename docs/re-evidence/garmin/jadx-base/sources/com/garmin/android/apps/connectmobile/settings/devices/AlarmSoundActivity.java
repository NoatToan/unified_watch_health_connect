package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.i;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmSoundActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/AlarmSoundActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AlarmSoundActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f41849e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMCheckableRow f41850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMCheckableRow f41851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMCheckableRow f41852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f41853d;

    public final void ca() {
        i iVar = this.f41853d;
        iVar.getClass();
        if (iVar.f34184d != null) {
            i iVar2 = this.f41853d;
            iVar2.getClass();
            String str = iVar2.f34184d;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode == -1590230414) {
                    if (str.equals("VIBRATION")) {
                        GCMCheckableRow gCMCheckableRow = this.f41850a;
                        gCMCheckableRow.getClass();
                        gCMCheckableRow.setChecked(false);
                        GCMCheckableRow gCMCheckableRow2 = this.f41852c;
                        gCMCheckableRow2.getClass();
                        gCMCheckableRow2.setChecked(true);
                        GCMCheckableRow gCMCheckableRow3 = this.f41851b;
                        gCMCheckableRow3.getClass();
                        gCMCheckableRow3.setChecked(false);
                        return;
                    }
                    return;
                }
                if (iHashCode == -456571427) {
                    if (str.equals("TONE_AND_VIBRATION")) {
                        GCMCheckableRow gCMCheckableRow4 = this.f41850a;
                        gCMCheckableRow4.getClass();
                        gCMCheckableRow4.setChecked(false);
                        GCMCheckableRow gCMCheckableRow5 = this.f41852c;
                        gCMCheckableRow5.getClass();
                        gCMCheckableRow5.setChecked(false);
                        GCMCheckableRow gCMCheckableRow6 = this.f41851b;
                        gCMCheckableRow6.getClass();
                        gCMCheckableRow6.setChecked(true);
                        return;
                    }
                    return;
                }
                if (iHashCode == 2580850 && str.equals("TONE")) {
                    GCMCheckableRow gCMCheckableRow7 = this.f41850a;
                    gCMCheckableRow7.getClass();
                    gCMCheckableRow7.setChecked(true);
                    GCMCheckableRow gCMCheckableRow8 = this.f41852c;
                    gCMCheckableRow8.getClass();
                    gCMCheckableRow8.setChecked(false);
                    GCMCheckableRow gCMCheckableRow9 = this.f41851b;
                    gCMCheckableRow9.getClass();
                    gCMCheckableRow9.setChecked(false);
                }
            }
        }
    }

    public final void da() {
        Intent intent = new Intent();
        intent.putExtra("EXTRAS_DEVICE_ALARM", this.f41853d);
        setResult(-1, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_alarms_sound_settings);
        initActionBar(true, R.string.device_settings_alarm_sound);
        Bundle extras = getIntent().getExtras();
        this.f41853d = null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("EXTRAS_DEVICE_ALARM", i.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("EXTRAS_DEVICE_ALARM");
                parcelable = (i) (parcelable2 instanceof i ? parcelable2 : null);
            }
            this.f41853d = (i) parcelable;
        }
        if (this.f41853d == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar.getClass();
            i2.a.f(a2Var, "AlarmSoundActivity", "Missing required DeviceAlarmDTO parameter");
            finish();
            return;
        }
        this.f41850a = (GCMCheckableRow) findViewById(R.id.alarms_sound_tones);
        this.f41852c = (GCMCheckableRow) findViewById(R.id.alarms_sound_vibration);
        this.f41851b = (GCMCheckableRow) findViewById(R.id.alarms_sound_tones_vibration);
        i iVar = this.f41853d;
        iVar.getClass();
        if (iVar.f34184d == null) {
            i iVar2 = this.f41853d;
            iVar2.getClass();
            iVar2.f34184d = "TONE_AND_VIBRATION";
        }
        da();
        ca();
        GCMCheckableRow gCMCheckableRow = this.f41850a;
        if (gCMCheckableRow != null) {
            final int i14 = 0;
            gCMCheckableRow.setOnClickListener(new View.OnClickListener(this) { // from class: ng1.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AlarmSoundActivity f125920b;

                {
                    this.f125920b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i14) {
                        case 0:
                            AlarmSoundActivity alarmSoundActivity = this.f125920b;
                            com.garmin.android.apps.connectmobile.devices.model.i iVar3 = alarmSoundActivity.f41853d;
                            iVar3.getClass();
                            iVar3.f34184d = "TONE";
                            alarmSoundActivity.da();
                            alarmSoundActivity.ca();
                            break;
                        case 1:
                            AlarmSoundActivity alarmSoundActivity2 = this.f125920b;
                            com.garmin.android.apps.connectmobile.devices.model.i iVar4 = alarmSoundActivity2.f41853d;
                            iVar4.getClass();
                            iVar4.f34184d = "VIBRATION";
                            alarmSoundActivity2.da();
                            alarmSoundActivity2.ca();
                            break;
                        default:
                            AlarmSoundActivity alarmSoundActivity3 = this.f125920b;
                            com.garmin.android.apps.connectmobile.devices.model.i iVar5 = alarmSoundActivity3.f41853d;
                            iVar5.getClass();
                            iVar5.f34184d = "TONE_AND_VIBRATION";
                            alarmSoundActivity3.da();
                            alarmSoundActivity3.ca();
                            break;
                    }
                }
            });
        }
        GCMCheckableRow gCMCheckableRow2 = this.f41852c;
        if (gCMCheckableRow2 != null) {
            final int i15 = 1;
            gCMCheckableRow2.setOnClickListener(new View.OnClickListener(this) { // from class: ng1.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AlarmSoundActivity f125920b;

                {
                    this.f125920b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i15) {
                        case 0:
                            AlarmSoundActivity alarmSoundActivity = this.f125920b;
                            com.garmin.android.apps.connectmobile.devices.model.i iVar3 = alarmSoundActivity.f41853d;
                            iVar3.getClass();
                            iVar3.f34184d = "TONE";
                            alarmSoundActivity.da();
                            alarmSoundActivity.ca();
                            break;
                        case 1:
                            AlarmSoundActivity alarmSoundActivity2 = this.f125920b;
                            com.garmin.android.apps.connectmobile.devices.model.i iVar4 = alarmSoundActivity2.f41853d;
                            iVar4.getClass();
                            iVar4.f34184d = "VIBRATION";
                            alarmSoundActivity2.da();
                            alarmSoundActivity2.ca();
                            break;
                        default:
                            AlarmSoundActivity alarmSoundActivity3 = this.f125920b;
                            com.garmin.android.apps.connectmobile.devices.model.i iVar5 = alarmSoundActivity3.f41853d;
                            iVar5.getClass();
                            iVar5.f34184d = "TONE_AND_VIBRATION";
                            alarmSoundActivity3.da();
                            alarmSoundActivity3.ca();
                            break;
                    }
                }
            });
        }
        GCMCheckableRow gCMCheckableRow3 = this.f41851b;
        if (gCMCheckableRow3 != null) {
            final int i16 = 2;
            gCMCheckableRow3.setOnClickListener(new View.OnClickListener(this) { // from class: ng1.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AlarmSoundActivity f125920b;

                {
                    this.f125920b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
                        case 0:
                            AlarmSoundActivity alarmSoundActivity = this.f125920b;
                            com.garmin.android.apps.connectmobile.devices.model.i iVar3 = alarmSoundActivity.f41853d;
                            iVar3.getClass();
                            iVar3.f34184d = "TONE";
                            alarmSoundActivity.da();
                            alarmSoundActivity.ca();
                            break;
                        case 1:
                            AlarmSoundActivity alarmSoundActivity2 = this.f125920b;
                            com.garmin.android.apps.connectmobile.devices.model.i iVar4 = alarmSoundActivity2.f41853d;
                            iVar4.getClass();
                            iVar4.f34184d = "VIBRATION";
                            alarmSoundActivity2.da();
                            alarmSoundActivity2.ca();
                            break;
                        default:
                            AlarmSoundActivity alarmSoundActivity3 = this.f125920b;
                            com.garmin.android.apps.connectmobile.devices.model.i iVar5 = alarmSoundActivity3.f41853d;
                            iVar5.getClass();
                            iVar5.f34184d = "TONE_AND_VIBRATION";
                            alarmSoundActivity3.da();
                            alarmSoundActivity3.ca();
                            break;
                    }
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/AlarmSoundActivity$a;", "", "<init>", "()V", "", "EXTRA_DEVICE_ALARM", "Ljava/lang/String;", "TAG", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

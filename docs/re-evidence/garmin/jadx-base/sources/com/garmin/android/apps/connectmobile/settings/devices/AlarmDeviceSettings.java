package com.garmin.android.apps.connectmobile.settings.devices;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.i;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmDeviceSettings;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import ng1.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/AlarmDeviceSettings;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AlarmDeviceSettings extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f41833n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f41834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexTwoLineButton f41835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexTwoLineButton f41836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewGroup f41837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f41838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DeviceSettingsDTO f41839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f41840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<String> f41841h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ng1.c f41844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ng1.c f41845l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41842i = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.google.android.material.chip.a f41846m = new com.google.android.material.chip.a(this, 7);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/AlarmDeviceSettings$b", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMCheckableRow;", "", "checked", "", "setChecked", "(Z)V", "enabled", "setEnabled", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends GCMCheckableRow {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<String> f41848m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> list) {
            super(AlarmDeviceSettings.this);
            this.f41848m = list;
        }

        @Override // com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow, android.widget.Checkable
        public void setChecked(boolean checked) {
            if (!checked) {
                List<String> list = this.f41848m;
                list.getClass();
                if (list.size() <= 1) {
                    return;
                }
            }
            super.setChecked(checked);
        }

        @Override // android.view.View
        public void setEnabled(boolean enabled) {
            super.setEnabled(enabled);
            AlarmDeviceSettings alarmDeviceSettings = AlarmDeviceSettings.this;
            if (enabled) {
                getDefaultTextView().setTextColor(alarmDeviceSettings.getColor(R.color.gcm_text_primary));
            } else {
                getDefaultTextView().setTextColor(alarmDeviceSettings.getColor(R.color.gcm_text_primary_disabled));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ng1.c] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ng1.c] */
    public AlarmDeviceSettings() {
        final int i14 = 0;
        this.f41844k = new View.OnClickListener(this) { // from class: ng1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlarmDeviceSettings f125915b;

            {
                this.f125915b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        AlarmDeviceSettings alarmDeviceSettings = this.f125915b;
                        com.garmin.android.apps.connectmobile.devices.model.i iVar = alarmDeviceSettings.f41840g;
                        iVar.getClass();
                        int i15 = iVar.f34182b;
                        TimePickerDialog timePickerDialog = new TimePickerDialog(alarmDeviceSettings, R.style.GCMTimePicker, new ls0.m(alarmDeviceSettings, 1), i15 / 60, i15 % 60, DateFormat.is24HourFormat(alarmDeviceSettings));
                        timePickerDialog.show();
                        og.a.w(timePickerDialog, alarmDeviceSettings);
                        og.a.W(timePickerDialog, alarmDeviceSettings);
                        break;
                    default:
                        AlarmDeviceSettings alarmDeviceSettings2 = this.f125915b;
                        DeviceSettingsDTO deviceSettingsDTO = alarmDeviceSettings2.f41839f;
                        deviceSettingsDTO.getClass();
                        List<String> list = deviceSettingsDTO.f33880k;
                        list.getClass();
                        com.garmin.android.apps.connectmobile.devices.model.i iVar2 = alarmDeviceSettings2.f41840g;
                        iVar2.getClass();
                        String str = iVar2.f34181a;
                        str.getClass();
                        int iIndexOf = list.indexOf(str);
                        if (iIndexOf < 0) {
                            iIndexOf = 0;
                        }
                        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(alarmDeviceSettings2);
                        androidx.appcompat.app.e.a title = aVar.setTitle(R.string.device_setting_alarm_frequency);
                        com.garmin.android.apps.connectmobile.devices.model.c.a aVar2 = com.garmin.android.apps.connectmobile.devices.model.c.f34112c;
                        DeviceSettingsDTO deviceSettingsDTO2 = alarmDeviceSettings2.f41839f;
                        deviceSettingsDTO2.getClass();
                        List<String> list2 = deviceSettingsDTO2.f33880k;
                        list2.getClass();
                        aVar2.getClass();
                        CharSequence[] charSequenceArr = new CharSequence[list2.size()];
                        int size = list2.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            charSequenceArr[i16] = alarmDeviceSettings2.getString(com.garmin.android.apps.connectmobile.devices.model.c.a.a(list2.get(i16)).f34119b);
                        }
                        title.setSingleChoiceItems(charSequenceArr, iIndexOf, new kx0.f(alarmDeviceSettings2, 13));
                        aVar.create().show();
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f41845l = new View.OnClickListener(this) { // from class: ng1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlarmDeviceSettings f125915b;

            {
                this.f125915b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        AlarmDeviceSettings alarmDeviceSettings = this.f125915b;
                        com.garmin.android.apps.connectmobile.devices.model.i iVar = alarmDeviceSettings.f41840g;
                        iVar.getClass();
                        int i16 = iVar.f34182b;
                        TimePickerDialog timePickerDialog = new TimePickerDialog(alarmDeviceSettings, R.style.GCMTimePicker, new ls0.m(alarmDeviceSettings, 1), i16 / 60, i16 % 60, DateFormat.is24HourFormat(alarmDeviceSettings));
                        timePickerDialog.show();
                        og.a.w(timePickerDialog, alarmDeviceSettings);
                        og.a.W(timePickerDialog, alarmDeviceSettings);
                        break;
                    default:
                        AlarmDeviceSettings alarmDeviceSettings2 = this.f125915b;
                        DeviceSettingsDTO deviceSettingsDTO = alarmDeviceSettings2.f41839f;
                        deviceSettingsDTO.getClass();
                        List<String> list = deviceSettingsDTO.f33880k;
                        list.getClass();
                        com.garmin.android.apps.connectmobile.devices.model.i iVar2 = alarmDeviceSettings2.f41840g;
                        iVar2.getClass();
                        String str = iVar2.f34181a;
                        str.getClass();
                        int iIndexOf = list.indexOf(str);
                        if (iIndexOf < 0) {
                            iIndexOf = 0;
                        }
                        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(alarmDeviceSettings2);
                        androidx.appcompat.app.e.a title = aVar.setTitle(R.string.device_setting_alarm_frequency);
                        com.garmin.android.apps.connectmobile.devices.model.c.a aVar2 = com.garmin.android.apps.connectmobile.devices.model.c.f34112c;
                        DeviceSettingsDTO deviceSettingsDTO2 = alarmDeviceSettings2.f41839f;
                        deviceSettingsDTO2.getClass();
                        List<String> list2 = deviceSettingsDTO2.f33880k;
                        list2.getClass();
                        aVar2.getClass();
                        CharSequence[] charSequenceArr = new CharSequence[list2.size()];
                        int size = list2.size();
                        for (int i17 = 0; i17 < size; i17++) {
                            charSequenceArr[i17] = alarmDeviceSettings2.getString(com.garmin.android.apps.connectmobile.devices.model.c.a.a(list2.get(i17)).f34119b);
                        }
                        title.setSingleChoiceItems(charSequenceArr, iIndexOf, new kx0.f(alarmDeviceSettings2, 13));
                        aVar.create().show();
                        break;
                }
            }
        };
    }

    public static final void ca(Activity activity, DeviceSettingsDTO deviceSettingsDTO, int i14) {
        f41833n.getClass();
        activity.getClass();
        Intent intent = new Intent(activity, (Class<?>) AlarmDeviceSettings.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_alarmIndex", 0);
        activity.startActivityForResult(intent, i14);
    }

    public static final void da(j jVar, DeviceSettingsDTO deviceSettingsDTO, i iVar) {
        f41833n.getClass();
        Intent intent = new Intent(jVar, (Class<?>) AlarmDeviceSettings.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_defaultAlarm", iVar);
        jVar.startActivityForResult(intent, 12);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    public final void ea(boolean z14) {
        boolean z15;
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        i iVar = this.f41840g;
        iVar.getClass();
        calendar.set(11, iVar.f34182b / 60);
        i iVar2 = this.f41840g;
        iVar2.getClass();
        calendar.set(12, iVar2.f34182b % 60);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41835b;
        gCMComplexTwoLineButton.getClass();
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(DateFormat.getTimeFormat(this).format(calendar.getTime()));
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f41835b;
        gCMComplexTwoLineButton2.getClass();
        gCMComplexTwoLineButton2.setEnabled(z14);
        List<String> list = this.f41841h;
        if (list == null || list.isEmpty()) {
            z15 = false;
        } else {
            DeviceSettingsDTO deviceSettingsDTO = this.f41839f;
            deviceSettingsDTO.getClass();
            Boolean bool = deviceSettingsDTO.f33878j;
            if (bool != null ? bool.booleanValue() : false) {
                z15 = false;
            } else {
                z15 = true;
            }
        }
        if (z15) {
            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f41836c;
            if (z14) {
                gCMComplexTwoLineButton3.getClass();
                com.garmin.android.apps.connectmobile.devices.model.c.a aVar = com.garmin.android.apps.connectmobile.devices.model.c.f34112c;
                i iVar3 = this.f41840g;
                iVar3.getClass();
                String str = iVar3.f34181a;
                aVar.getClass();
                gCMComplexTwoLineButton3.setButtonBottomLeftLabel(getString(com.garmin.android.apps.connectmobile.devices.model.c.a.a(str).f34119b));
            } else {
                gCMComplexTwoLineButton3.getClass();
                com.garmin.android.apps.connectmobile.devices.model.c.a aVar2 = com.garmin.android.apps.connectmobile.devices.model.c.f34112c;
                List<String> list2 = this.f41841h;
                list2.getClass();
                String str2 = list2.get(0);
                aVar2.getClass();
                gCMComplexTwoLineButton3.setButtonBottomLeftLabel(getString(com.garmin.android.apps.connectmobile.devices.model.c.a.a(str2).f34119b));
            }
            GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f41836c;
            gCMComplexTwoLineButton4.getClass();
            gCMComplexTwoLineButton4.setEnabled(z14);
        }
        i iVar4 = this.f41840g;
        iVar4.getClass();
        ArrayList arrayList = iVar4.f34183c;
        if ((arrayList == null || arrayList.isEmpty()) ? false : true) {
            ViewGroup viewGroup = this.f41837d;
            viewGroup.getClass();
            viewGroup.setEnabled(z14);
            ViewGroup viewGroup2 = this.f41837d;
            viewGroup2.getClass();
            int childCount = viewGroup2.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                ViewGroup viewGroup3 = this.f41837d;
                viewGroup3.getClass();
                viewGroup3.getChildAt(i14).setEnabled(z14);
            }
        }
        LinearLayout linearLayout = this.f41838e;
        linearLayout.getClass();
        linearLayout.setVisibility(z14 ? 0 : 8);
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f41839f);
        setResult(-1, getIntent());
        super.finish();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0179  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z14;
        com.garmin.android.apps.connectmobile.devices.model.a[] aVarArr;
        List<i> listD;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_alarm);
        initActionBar(true, R.string.device_setting_alarm);
        if (getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            extras.getClass();
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_deviceSettings", DeviceSettingsDTO.class);
            } else {
                Parcelable parcelable3 = extras.getParcelable("GCM_deviceSettings");
                if (!(parcelable3 instanceof DeviceSettingsDTO)) {
                    parcelable3 = null;
                }
                parcelable = (DeviceSettingsDTO) parcelable3;
            }
            this.f41839f = (DeviceSettingsDTO) parcelable;
            Bundle extras2 = getIntent().getExtras();
            extras2.getClass();
            this.f41842i = extras2.getInt("GCM_alarmIndex", -1);
            Bundle extras3 = getIntent().getExtras();
            extras3.getClass();
            if (i14 >= 33) {
                parcelable2 = (Parcelable) extras3.getParcelable("GCM_defaultAlarm", i.class);
            } else {
                Parcelable parcelable4 = extras3.getParcelable("GCM_defaultAlarm");
                parcelable2 = (i) (parcelable4 instanceof i ? parcelable4 : null);
            }
            this.f41840g = (i) parcelable2;
            Bundle extras4 = getIntent().getExtras();
            extras4.getClass();
            this.f41843j = extras4.getBoolean("is_vivofit");
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f41839f;
        if (deviceSettingsDTO == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar.getClass();
            i2.a.f(a2Var, "AlarmDeviceSettings", "Invalid device settings object while entering device settings alarm screen!");
            finish();
            return;
        }
        if (this.f41842i != -1 && deviceSettingsDTO.M0()) {
            int i15 = this.f41842i;
            DeviceSettingsDTO deviceSettingsDTO2 = this.f41839f;
            deviceSettingsDTO2.getClass();
            List<i> listD2 = deviceSettingsDTO2.D();
            listD2.getClass();
            if (i15 >= listD2.size()) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.SETTINGS;
                aVar2.getClass();
                i2.a.f(a2Var2, "AlarmDeviceSettings", "Invalid alarm index while entering device settings alarm screen!");
                finish();
                return;
            }
        }
        if (this.f41842i == -1 && this.f41840g == null) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.SETTINGS;
            aVar3.getClass();
            i2.a.f(a2Var3, "AlarmDeviceSettings", "Invalid new alarm object while entering device settings alarm screen!");
            finish();
            return;
        }
        i iVar = this.f41840g;
        DeviceSettingsDTO deviceSettingsDTO3 = this.f41839f;
        if (iVar == null) {
            deviceSettingsDTO3.getClass();
            List<i> listD3 = deviceSettingsDTO3.D();
            listD3.getClass();
            this.f41840g = listD3.get(this.f41842i);
        } else if (deviceSettingsDTO3 != null && (listD = deviceSettingsDTO3.D()) != null) {
            i iVar2 = this.f41840g;
            iVar2.getClass();
            listD.add(iVar2);
        }
        DeviceSettingsDTO deviceSettingsDTO4 = this.f41839f;
        deviceSettingsDTO4.getClass();
        this.f41841h = deviceSettingsDTO4.f33880k;
        View viewFindViewById = findViewById(R.id.device_settings_vivosmart_alarm_btn);
        viewFindViewById.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById;
        this.f41834a = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnCheckedChangeListener(this.f41846m);
        View viewFindViewById2 = findViewById(R.id.device_settings_vivosmart_alarm_time_btn);
        viewFindViewById2.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById2;
        this.f41835b = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f41844k);
        View viewFindViewById3 = findViewById(R.id.device_settings_vivosmart_alarm_frequency_btn);
        viewFindViewById3.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) viewFindViewById3;
        this.f41836c = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.f41845l);
        List<String> list = this.f41841h;
        if (list == null || list.isEmpty()) {
            z14 = false;
        } else {
            DeviceSettingsDTO deviceSettingsDTO5 = this.f41839f;
            deviceSettingsDTO5.getClass();
            Boolean bool = deviceSettingsDTO5.f33878j;
            if (bool != null ? bool.booleanValue() : false) {
                z14 = false;
            } else {
                z14 = true;
            }
        }
        if (!z14) {
            GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f41836c;
            gCMComplexTwoLineButton3.getClass();
            gCMComplexTwoLineButton3.setVisibility(8);
        }
        View viewFindViewById4 = findViewById(R.id.device_settings_repeat_alarm_days);
        viewFindViewById4.getClass();
        this.f41837d = (ViewGroup) viewFindViewById4;
        i iVar3 = this.f41840g;
        iVar3.getClass();
        ArrayList arrayList = iVar3.f34183c;
        boolean z15 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        ViewGroup viewGroup = this.f41837d;
        if (z15) {
            viewGroup.getClass();
            viewGroup.setVisibility(0);
            i iVar4 = this.f41840g;
            iVar4.getClass();
            ArrayList arrayList2 = iVar4.f34183c;
            if (this.f41843j) {
                aVarArr = new com.garmin.android.apps.connectmobile.devices.model.a[7];
                w13.c cVar = com.garmin.android.apps.connectmobile.devices.model.a.f34085m;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                int i16 = 0;
                while (bVarN.hasNext()) {
                    com.garmin.android.apps.connectmobile.devices.model.a aVar4 = (com.garmin.android.apps.connectmobile.devices.model.a) bVarN.next();
                    if (aVar4 != com.garmin.android.apps.connectmobile.devices.model.a.ONCE) {
                        aVarArr[i16] = aVar4;
                        i16++;
                    }
                }
            } else {
                w13.c cVar2 = com.garmin.android.apps.connectmobile.devices.model.a.f34085m;
                cVar2.getClass();
                aVarArr = (com.garmin.android.apps.connectmobile.devices.model.a[]) p005kotlin.jvm.internal.i.d(cVar2, new com.garmin.android.apps.connectmobile.devices.model.a[0]);
            }
            for (com.garmin.android.apps.connectmobile.devices.model.a aVar5 : aVarArr) {
                b bVar = new b(arrayList2);
                aVar5.getClass();
                bVar.setDefaultText(getString(aVar5.f34087b));
                bVar.b(false);
                arrayList2.getClass();
                bVar.setChecked(arrayList2.contains(aVar5.f34086a));
                bVar.setOnCheckChangeListener(new hc0.c(29, arrayList2, aVar5));
                ViewGroup viewGroup2 = this.f41837d;
                viewGroup2.getClass();
                viewGroup2.addView(bVar);
            }
        } else {
            viewGroup.getClass();
            viewGroup.setVisibility(8);
        }
        View viewFindViewById5 = findViewById(R.id.device_settings_alarm_details);
        viewFindViewById5.getClass();
        this.f41838e = (LinearLayout) viewFindViewById5;
        com.garmin.android.apps.connectmobile.devices.model.c.a aVar6 = com.garmin.android.apps.connectmobile.devices.model.c.f34112c;
        i iVar5 = this.f41840g;
        iVar5.getClass();
        String str = iVar5.f34181a;
        aVar6.getClass();
        com.garmin.android.apps.connectmobile.devices.model.c cVarA = com.garmin.android.apps.connectmobile.devices.model.c.a.a(str);
        com.garmin.android.apps.connectmobile.devices.model.c cVar3 = com.garmin.android.apps.connectmobile.devices.model.c.OFF;
        GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f41834a;
        if (cVarA == cVar3) {
            gCMComplexOneLineButton2.getClass();
            gCMComplexOneLineButton2.j();
            ea(false);
        } else {
            gCMComplexOneLineButton2.getClass();
            gCMComplexOneLineButton2.k();
            ea(true);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/AlarmDeviceSettings$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INVALID_ALARM_INDEX", "I", "IS_VIVOFIT", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

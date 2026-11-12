package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.activityoptions.HeartRateAlertsActivity;
import com.garmin.android.apps.connectmobile.view.GCMComplexOneLineButton;
import i3.e5;
import java.text.NumberFormat;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import uk1.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/activityoptions/HeartRateAlertsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClickComplexOneLineButton", "(Landroid/view/View;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HeartRateAlertsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f41672k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f41673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f41674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f41675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f41676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public vk1.f f41677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f41678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f41679g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f41680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f41682j;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/activityoptions/HeartRateAlertsActivity$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            HeartRateAlertsActivity heartRateAlertsActivity = HeartRateAlertsActivity.this;
            heartRateAlertsActivity.f41679g = -1L;
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                sn.a.s("getHRZonesConfig: ", cVar.name(), i2.f36769a, a2.SETTINGS, "HeartRateAlertsActivity");
                Toast.makeText(heartRateAlertsActivity, R.string.txt_something_went_wrong_try_again, 0).show();
                heartRateAlertsActivity.finish();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
            HeartRateAlertsActivity heartRateAlertsActivity = HeartRateAlertsActivity.this;
            heartRateAlertsActivity.f41679g = -1L;
            vk1.b bVar = (vk1.b) obj;
            vk1.f fVar = bVar.f178581a ? bVar.f178586f : bVar.f178585e;
            heartRateAlertsActivity.f41677e = fVar;
            fVar.getClass();
            if (fVar.f178621k == 0) {
                vk1.f fVar2 = heartRateAlertsActivity.f41677e;
                fVar2.getClass();
                fVar2.f178621k = 250;
            }
            heartRateAlertsActivity.f41680h = new String[6];
            NumberFormat numberFormat = NumberFormat.getInstance();
            String[] strArr = heartRateAlertsActivity.f41680h;
            strArr.getClass();
            String string = heartRateAlertsActivity.getString(R.string.heart_rate_zone_name, numberFormat.format(1L));
            vk1.f fVar3 = heartRateAlertsActivity.f41677e;
            fVar3.getClass();
            String string2 = heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar3.f178615e));
            vk1.f fVar4 = heartRateAlertsActivity.f41677e;
            fVar4.getClass();
            StringBuilder sbL = e5.l(string, " (", string2, " - ", heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar4.f178616f) - 1)));
            sbL.append(")");
            strArr[0] = sbL.toString();
            String[] strArr2 = heartRateAlertsActivity.f41680h;
            strArr2.getClass();
            String string3 = heartRateAlertsActivity.getString(R.string.heart_rate_zone_name, numberFormat.format(2L));
            vk1.f fVar5 = heartRateAlertsActivity.f41677e;
            fVar5.getClass();
            String string4 = heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar5.f178616f));
            vk1.f fVar6 = heartRateAlertsActivity.f41677e;
            fVar6.getClass();
            StringBuilder sbL2 = e5.l(string3, " (", string4, " - ", heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar6.f178617g) - 1)));
            sbL2.append(")");
            strArr2[1] = sbL2.toString();
            String[] strArr3 = heartRateAlertsActivity.f41680h;
            strArr3.getClass();
            String string5 = heartRateAlertsActivity.getString(R.string.heart_rate_zone_name, numberFormat.format(3L));
            vk1.f fVar7 = heartRateAlertsActivity.f41677e;
            fVar7.getClass();
            String string6 = heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar7.f178617g));
            vk1.f fVar8 = heartRateAlertsActivity.f41677e;
            fVar8.getClass();
            StringBuilder sbL3 = e5.l(string5, " (", string6, " - ", heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar8.f178618h) - 1)));
            sbL3.append(")");
            strArr3[2] = sbL3.toString();
            String[] strArr4 = heartRateAlertsActivity.f41680h;
            strArr4.getClass();
            String string7 = heartRateAlertsActivity.getString(R.string.heart_rate_zone_name, numberFormat.format(4L));
            vk1.f fVar9 = heartRateAlertsActivity.f41677e;
            fVar9.getClass();
            String string8 = heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar9.f178618h));
            vk1.f fVar10 = heartRateAlertsActivity.f41677e;
            fVar10.getClass();
            StringBuilder sbL4 = e5.l(string7, " (", string8, " - ", heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(((long) fVar10.f178619i) - 1)));
            sbL4.append(")");
            strArr4[3] = sbL4.toString();
            String[] strArr5 = heartRateAlertsActivity.f41680h;
            strArr5.getClass();
            String string9 = heartRateAlertsActivity.getString(R.string.heart_rate_zone_name, numberFormat.format(5L));
            vk1.f fVar11 = heartRateAlertsActivity.f41677e;
            fVar11.getClass();
            String string10 = heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar11.f178619i));
            vk1.f fVar12 = heartRateAlertsActivity.f41677e;
            fVar12.getClass();
            StringBuilder sbL5 = e5.l(string9, " (", string10, " - ", heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat.format(fVar12.f178621k)));
            sbL5.append(")");
            strArr5[4] = sbL5.toString();
            String[] strArr6 = heartRateAlertsActivity.f41680h;
            strArr6.getClass();
            strArr6[5] = heartRateAlertsActivity.getString(R.string.lbl_custom);
            heartRateAlertsActivity.hideProgressOverlay();
            View viewFindViewById = heartRateAlertsActivity.findViewById(R.id.hrAlertTypeExpandableLayout);
            viewFindViewById.getClass();
            heartRateAlertsActivity.f41673a = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = heartRateAlertsActivity.findViewById(R.id.heartRateAlertsSwitch);
            viewFindViewById2.getClass();
            SwitchCompat switchCompat = (SwitchCompat) viewFindViewById2;
            switchCompat.setOnCheckedChangeListener(new com.google.android.material.chip.a(heartRateAlertsActivity, 5));
            LinearLayout linearLayout = (LinearLayout) heartRateAlertsActivity.findViewById(R.id.customZonesDetailsLayout);
            heartRateAlertsActivity.f41676d = (TextView) heartRateAlertsActivity.findViewById(R.id.heartRateZoneValueTextViewLabel);
            GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) heartRateAlertsActivity.findViewById(R.id.lowZoneComplexBtn1);
            heartRateAlertsActivity.f41674b = gCMComplexOneLineButton;
            if (gCMComplexOneLineButton != null) {
                NumberFormat numberFormat2 = NumberFormat.getInstance();
                com.garmin.android.apps.connectmobile.devices.model.f fVar13 = heartRateAlertsActivity.f41681i;
                fVar13.getClass();
                gCMComplexOneLineButton.setButtonRightLabel(heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat2.format(fVar13.g0())));
            }
            GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) heartRateAlertsActivity.findViewById(R.id.highZoneComplexBtn2);
            heartRateAlertsActivity.f41675c = gCMComplexOneLineButton2;
            if (gCMComplexOneLineButton2 != null) {
                NumberFormat numberFormat3 = NumberFormat.getInstance();
                com.garmin.android.apps.connectmobile.devices.model.f fVar14 = heartRateAlertsActivity.f41681i;
                fVar14.getClass();
                gCMComplexOneLineButton2.setButtonRightLabel(heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, numberFormat3.format(fVar14.f0())));
            }
            com.garmin.android.apps.connectmobile.devices.model.f fVar15 = heartRateAlertsActivity.f41681i;
            fVar15.getClass();
            if (fVar15.h1().booleanValue()) {
                switchCompat.setChecked(true);
                LinearLayout linearLayout2 = heartRateAlertsActivity.f41673a;
                linearLayout2.getClass();
                linearLayout2.setVisibility(0);
            } else {
                switchCompat.setChecked(false);
                LinearLayout linearLayout3 = heartRateAlertsActivity.f41673a;
                linearLayout3.getClass();
                linearLayout3.setVisibility(8);
            }
            View viewFindViewById3 = heartRateAlertsActivity.findViewById(R.id.hrAlertTypeLayout);
            viewFindViewById3.getClass();
            LinearLayout linearLayout4 = (LinearLayout) viewFindViewById3;
            com.garmin.android.apps.connectmobile.devices.model.f fVar16 = heartRateAlertsActivity.f41681i;
            fVar16.getClass();
            int iH0 = fVar16.h0();
            if (iH0 == 0) {
                linearLayout.setVisibility(0);
                TextView textView = heartRateAlertsActivity.f41676d;
                if (textView != null) {
                    String[] strArr7 = heartRateAlertsActivity.f41680h;
                    strArr7.getClass();
                    textView.setText(strArr7[5]);
                }
                String[] strArr8 = heartRateAlertsActivity.f41680h;
                strArr8.getClass();
                String strA = oi0.d.a(heartRateAlertsActivity, strArr8[5], new cg1.e(23));
                TextView textView2 = heartRateAlertsActivity.f41676d;
                if (textView2 != null) {
                    textView2.setContentDescription(strA);
                }
            } else {
                linearLayout.setVisibility(4);
                TextView textView3 = heartRateAlertsActivity.f41676d;
                if (textView3 != null) {
                    String[] strArr9 = heartRateAlertsActivity.f41680h;
                    strArr9.getClass();
                    textView3.setText(strArr9[iH0 - 1]);
                }
                String[] strArr10 = heartRateAlertsActivity.f41680h;
                strArr10.getClass();
                String strA2 = oi0.d.a(heartRateAlertsActivity, strArr10[iH0 - 1], new cg1.e(24));
                TextView textView4 = heartRateAlertsActivity.f41676d;
                if (textView4 != null) {
                    textView4.setContentDescription(strA2);
                }
            }
            linearLayout4.setOnClickListener(new cw2.b(24, heartRateAlertsActivity, linearLayout));
        }
    }

    static {
        new a(null);
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f41681i != null) {
            getIntent().putExtra("GCM_deviceActivityOptions", this.f41681i);
            setResult(-1, getIntent());
        } else {
            setResult(0);
        }
        super.finish();
    }

    public final void onClickComplexOneLineButton(View v14) {
        v14.getClass();
        Object parent = v14.getParent();
        parent.getClass();
        int id3 = ((View) parent).getId();
        if (id3 == R.id.lowZoneComplexBtn1) {
            final int i14 = 0;
            com.garmin.android.apps.connectmobile.settings.activityoptions.b.a aVar = new com.garmin.android.apps.connectmobile.settings.activityoptions.b.a(this) { // from class: hg1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ HeartRateAlertsActivity f83680b;

                {
                    this.f83680b = this;
                }

                @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.b.a
                public final void e(double d14) {
                    switch (i14) {
                        case 0:
                            HeartRateAlertsActivity heartRateAlertsActivity = this.f83680b;
                            GCMComplexOneLineButton gCMComplexOneLineButton = heartRateAlertsActivity.f41674b;
                            gCMComplexOneLineButton.getClass();
                            int i15 = (int) d14;
                            gCMComplexOneLineButton.setButtonRightLabel(heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, NumberFormat.getInstance().format(i15)));
                            com.garmin.android.apps.connectmobile.devices.model.f fVar = heartRateAlertsActivity.f41681i;
                            fVar.getClass();
                            if (i15 < 30 || i15 > 250) {
                                i15 = 120;
                            }
                            fVar.y1("heartRateAlertCustomLow", Integer.valueOf(i15));
                            break;
                        default:
                            HeartRateAlertsActivity heartRateAlertsActivity2 = this.f83680b;
                            GCMComplexOneLineButton gCMComplexOneLineButton2 = heartRateAlertsActivity2.f41675c;
                            gCMComplexOneLineButton2.getClass();
                            int i16 = (int) d14;
                            gCMComplexOneLineButton2.setButtonRightLabel(heartRateAlertsActivity2.getString(R.string.devices_lbl_bpm_with_format, NumberFormat.getInstance().format(i16)));
                            com.garmin.android.apps.connectmobile.devices.model.f fVar2 = heartRateAlertsActivity2.f41681i;
                            fVar2.getClass();
                            if (i16 < 30 || i16 > 250) {
                                i16 = 180;
                            }
                            fVar2.y1("heartRateAlertCustomHigh", Integer.valueOf(i16));
                            break;
                    }
                }
            };
            com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f41681i;
            fVar.getClass();
            String strValueOf = String.valueOf(fVar.g0());
            String string = getString(R.string.txt_activity_level_low_label);
            String string2 = getString(R.string.devices_lbl_bpm);
            com.garmin.android.apps.connectmobile.devices.model.f fVar2 = this.f41681i;
            fVar2.getClass();
            new com.garmin.android.apps.connectmobile.settings.activityoptions.b(this, aVar, strValueOf, string, 2, string2, "0123456789", null, -1, fVar2.f0());
            return;
        }
        if (id3 == R.id.highZoneComplexBtn2) {
            final int i15 = 1;
            com.garmin.android.apps.connectmobile.settings.activityoptions.b.a aVar2 = new com.garmin.android.apps.connectmobile.settings.activityoptions.b.a(this) { // from class: hg1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ HeartRateAlertsActivity f83680b;

                {
                    this.f83680b = this;
                }

                @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.b.a
                public final void e(double d14) {
                    switch (i15) {
                        case 0:
                            HeartRateAlertsActivity heartRateAlertsActivity = this.f83680b;
                            GCMComplexOneLineButton gCMComplexOneLineButton = heartRateAlertsActivity.f41674b;
                            gCMComplexOneLineButton.getClass();
                            int i16 = (int) d14;
                            gCMComplexOneLineButton.setButtonRightLabel(heartRateAlertsActivity.getString(R.string.devices_lbl_bpm_with_format, NumberFormat.getInstance().format(i16)));
                            com.garmin.android.apps.connectmobile.devices.model.f fVar3 = heartRateAlertsActivity.f41681i;
                            fVar3.getClass();
                            if (i16 < 30 || i16 > 250) {
                                i16 = 120;
                            }
                            fVar3.y1("heartRateAlertCustomLow", Integer.valueOf(i16));
                            break;
                        default:
                            HeartRateAlertsActivity heartRateAlertsActivity2 = this.f83680b;
                            GCMComplexOneLineButton gCMComplexOneLineButton2 = heartRateAlertsActivity2.f41675c;
                            gCMComplexOneLineButton2.getClass();
                            int i17 = (int) d14;
                            gCMComplexOneLineButton2.setButtonRightLabel(heartRateAlertsActivity2.getString(R.string.devices_lbl_bpm_with_format, NumberFormat.getInstance().format(i17)));
                            com.garmin.android.apps.connectmobile.devices.model.f fVar4 = heartRateAlertsActivity2.f41681i;
                            fVar4.getClass();
                            if (i17 < 30 || i17 > 250) {
                                i17 = 180;
                            }
                            fVar4.y1("heartRateAlertCustomHigh", Integer.valueOf(i17));
                            break;
                    }
                }
            };
            com.garmin.android.apps.connectmobile.devices.model.f fVar3 = this.f41681i;
            fVar3.getClass();
            String strValueOf2 = String.valueOf(fVar3.f0());
            String string3 = getString(R.string.txt_activity_level_high_label);
            String string4 = getString(R.string.devices_lbl_bpm);
            com.garmin.android.apps.connectmobile.devices.model.f fVar4 = this.f41681i;
            fVar4.getClass();
            new com.garmin.android.apps.connectmobile.settings.activityoptions.b(this, aVar2, strValueOf2, string3, 2, string4, "0123456789", null, fVar4.g0(), -1);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        this.f41678f = longExtra;
        if (longExtra == -1) {
            Toast.makeText(this, R.string.msg_error_no_device_unit_id_specified, 0).show();
            finish();
        }
        setContentView(R.layout.gcm_run_options_hr_alerts_3_0);
        initActionBar(true, getString(R.string.hr_alerts_setting_title));
        Intent intent = getIntent();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("GCM_deviceActivityOptions") : null;
            parcelable = (com.garmin.android.apps.connectmobile.devices.model.f) (parcelableExtra instanceof com.garmin.android.apps.connectmobile.devices.model.f ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("GCM_deviceActivityOptions", com.garmin.android.apps.connectmobile.devices.model.f.class);
        }
        this.f41681i = (com.garmin.android.apps.connectmobile.devices.model.f) parcelable;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        long j8 = this.f41679g;
        if (j8 != -1) {
            com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(j8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f41677e == null) {
            showProgressOverlay();
            this.f41682j = new b();
            i iVarA = i.f171903b.a();
            long j8 = this.f41678f;
            b bVar = this.f41682j;
            bVar.getClass();
            this.f41679g = iVarA.N(j8, bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/activityoptions/HeartRateAlertsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "NUMBER_OF_HR_ZONES", "I", "CUSTOM_ZONE_INDEX", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

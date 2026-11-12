package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.GCMComplexOneLineButton;
import ew1.h1;
import hg1.j;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import oi0.g;
import oi0.h;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public class GCMRunModeAlertsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m3[] f41654i = {m3.MILE, m3.KILOMETER};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f41655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f41656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f41657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f41658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexOneLineButton f41659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f41660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.appcompat.app.e f41661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41662h;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f41664b;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.settings.devices.e.a.values().length];
            f41664b = iArr;
            try {
                iArr[com.garmin.android.apps.connectmobile.settings.devices.e.a.CARDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41664b[com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41664b[com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41664b[com.garmin.android.apps.connectmobile.settings.devices.e.a.TRAINING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41664b[com.garmin.android.apps.connectmobile.settings.devices.e.a.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[j.values().length];
            f41663a = iArr2;
            try {
                iArr2[j.ALERT_TYPE_RUN_WALK_INTERVALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41663a[j.ALERT_TYPE_VIRTUAL_PACER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41663a[j.ALERT_TYPE_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41663a[j.ALERT_TYPE_DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41663a[j.ALERT_TYPE_CALORIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41663a[j.ALERT_TYPE_REP_COUNTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public final String ca() {
        String string = getResources().getString(R.string.run_options_run_alerts);
        int i14 = a.f41664b[com.garmin.android.apps.connectmobile.settings.devices.e.a.valueOf(((String) this.f41662h.f34132b.get("sport")).toUpperCase(Locale.US)).ordinal()];
        if (i14 == 1) {
            return getResources().getString(R.string.run_options_cardio_alerts);
        }
        if (i14 == 2) {
            return getResources().getString(R.string.run_options_run_alerts);
        }
        if (i14 == 3) {
            return getResources().getString(R.string.run_options_walk_alerts);
        }
        if (i14 != 4) {
            return i14 != 5 ? string : getResources().getString(R.string.run_options_other_mode_alerts);
        }
        return getResources().getString(R.string.strength_training_alerts);
    }

    public final void da(j jVar) {
        if (jVar != null) {
            this.f41655a = jVar;
            switch (a.f41663a[jVar.ordinal()]) {
                case 1:
                    ea(jVar, this.f41662h.j1().booleanValue());
                    break;
                case 2:
                    ea(jVar, this.f41662h.x1().booleanValue());
                    break;
                case 3:
                    ea(jVar, this.f41662h.v1().booleanValue());
                    break;
                case 4:
                    ea(jVar, this.f41662h.e1().booleanValue());
                    break;
                case 5:
                    ea(jVar, this.f41662h.c1().booleanValue());
                    break;
                case 6:
                    ea(jVar, this.f41662h.t1().booleanValue());
                    break;
            }
        }
    }

    public final void ea(j jVar, boolean z14) {
        int iIntValue;
        if (jVar != null) {
            this.f41655a = jVar;
            this.f41657c.setButtonRightLabel(getString(jVar.f83698a));
            switch (a.f41663a[jVar.ordinal()]) {
                case 1:
                    this.f41658d.setButtonLeftLabel(getString(R.string.run_mode_alerts_setting_run_time));
                    String strD = new h(this).d(this.f41662h.i0(), true);
                    GCMComplexOneLineButton gCMComplexOneLineButton = this.f41658d;
                    int iI0 = this.f41662h.i0();
                    l3.a aVar = l3.f23124b;
                    gCMComplexOneLineButton.a(aVar.p0(iI0, this), strD);
                    this.f41659e.setButtonLeftLabel(getString(R.string.run_mode_alerts_setting_walk_time));
                    this.f41659e.a(aVar.p0(this.f41662h.j0(), this), new h(this).d(this.f41662h.j0(), true));
                    this.f41660f.setText(getString(R.string.run_mode_alerts_setting_run_walk_time_footer));
                    this.f41658d.setVisibility(0);
                    this.f41659e.setVisibility(0);
                    this.f41662h.C();
                    this.f41662h.y1("intervalAlertsEnabled", Boolean.valueOf(z14));
                    break;
                case 2:
                    this.f41658d.setButtonLeftLabel(getString(R.string.lbl_pace));
                    String strG = e5.g(new h(this).d(this.f41662h.J0(), true), StringUtils.SPACE, new g(this).a(this.f41662h.s1()));
                    GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f41658d;
                    double dJ0 = this.f41662h.J0();
                    boolean zS1 = this.f41662h.s1();
                    l3.a aVar2 = l3.f23124b;
                    aVar2.getClass();
                    gCMComplexOneLineButton2.a(aVar2.r0(this, dJ0, zS1, true, ""), strG);
                    this.f41660f.setText(getString(R.string.run_mode_alerts_setting_virtual_pacer_footer));
                    this.f41658d.setVisibility(0);
                    this.f41659e.setVisibility(8);
                    this.f41662h.C();
                    this.f41662h.y1("virtualPacerEnabled", Boolean.valueOf(z14));
                    break;
                case 3:
                    this.f41658d.setButtonLeftLabel(getString(R.string.lbl_time));
                    int iE0 = this.f41662h.E0();
                    l3.f23124b.getClass();
                    this.f41658d.a(l3.a.n1(iE0), new h(this).d(this.f41662h.E0(), true));
                    this.f41660f.setText(getString(R.string.run_mode_alerts_setting_time_footer));
                    this.f41658d.setVisibility(0);
                    this.f41659e.setVisibility(8);
                    this.f41662h.C();
                    this.f41662h.y1("timeAlertEnabled", Boolean.valueOf(z14));
                    break;
                case 4:
                    this.f41660f.setText(getString(R.string.run_mode_alerts_setting_distance_footer));
                    this.f41658d.setButtonLeftLabel(getString(R.string.lbl_distance));
                    double dZ = this.f41662h.Z();
                    m3 m3VarW0 = this.f41662h.w0();
                    DecimalFormat decimalFormatN = l3.n();
                    l3.f23124b.getClass();
                    this.f41658d.setButtonRightLabel(l3.a.N(dZ, m3VarW0, decimalFormatN));
                    this.f41659e.setButtonLeftLabel(getString(R.string.lbl_unit_of_measure));
                    m3 m3VarW1 = this.f41662h.w0();
                    this.f41659e.a(getString(m3VarW1.f23164e), oi0.d.a(this, getString(m3VarW1.f23164e), new cg1.e(21)));
                    this.f41658d.setVisibility(0);
                    this.f41659e.setVisibility(0);
                    this.f41662h.C();
                    this.f41662h.y1("distanceAlertEnabled", Boolean.valueOf(z14));
                    break;
                case 5:
                    this.f41660f.setText(getString(R.string.run_mode_alerts_setting_calories_footer));
                    this.f41658d.setButtonLeftLabel(getString(R.string.lbl_calories));
                    String strC = l3.c(new l22.a(this), this.f41662h.H(), true);
                    this.f41658d.a(strC, oi0.d.a(this, strC, new cg1.e(20)));
                    this.f41658d.setVisibility(0);
                    this.f41659e.setVisibility(8);
                    this.f41662h.C();
                    this.f41662h.y1("caloriesAlertEnabled", Boolean.valueOf(z14));
                    break;
                case 6:
                    this.f41660f.setText(getString(R.string.run_mode_alerts_setting_strength_training_alert));
                    this.f41658d.setButtonLeftLabel(getString(R.string.strength_training_reps));
                    GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f41658d;
                    HashMap<String, Object> map = this.f41662h.f34132b;
                    if (map.containsKey("repsAlertValue")) {
                        Object obj = map.get("repsAlertValue");
                        obj.getClass();
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        iIntValue = 10;
                    }
                    gCMComplexOneLineButton3.setButtonRightLabel(l3.j(iIntValue, this, true));
                    this.f41658d.setVisibility(0);
                    this.f41659e.setVisibility(8);
                    this.f41662h.C();
                    this.f41662h.y1("repsAlertEnabled", Boolean.valueOf(z14));
                    break;
            }
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f41662h != null) {
            getIntent().putExtra("GCM_deviceActivityOptions", this.f41662h);
            setResult(-1, getIntent());
        } else {
            setResult(0);
        }
        super.finish();
    }

    public void onClickComplexOneLineButton(View view2) {
        m3[] m3VarArr;
        int iIntValue;
        int id3 = ((View) view2.getParent()).getId();
        int i14 = 0;
        if (id3 == R.id.alertTypeComplexBtn) {
            ArrayList arrayListA0 = this.f41662h.A0();
            if (arrayListA0.isEmpty()) {
                return;
            }
            int iIndexOf = arrayListA0.indexOf(this.f41655a);
            if (iIndexOf == -1) {
                iIndexOf = 0;
            }
            androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(this).setTitle(R.string.run_mode_alerts_setting_alert_type);
            CharSequence[] charSequenceArr = new CharSequence[arrayListA0.size()];
            while (i14 < arrayListA0.size()) {
                charSequenceArr[i14] = getString(((j) arrayListA0.get(i14)).f83698a);
                i14++;
            }
            androidx.appcompat.app.e eVarCreate = title.setSingleChoiceItems(charSequenceArr, iIndexOf, new ag0.d(29, this, arrayListA0)).create();
            this.f41661g = eVarCreate;
            eVarCreate.show();
            return;
        }
        if (id3 == R.id.firstAlertComplexBtn1) {
            switch (a.f41663a[this.f41655a.ordinal()]) {
                case 1:
                    new d(this, getString(R.string.run_mode_alerts_setting_run_time), new hg1.d(this, 2), this.f41655a, this.f41662h.i0());
                    break;
                case 2:
                    new d(this, getString(R.string.run_mode_alerts_setting_virtual_pacer), new hg1.d(this, 3), this.f41655a, this.f41662h.J0());
                    break;
                case 3:
                    new e(this, new hg1.d(this, 4), this.f41662h.E0());
                    break;
                case 4:
                    new b(this, new hg1.d(this, 5), this.f41658d.getButtonRightLabel(), getString(R.string.lbl_distance), 8192, getString(this.f41662h.w0().f23164e), "0123456789.", this.f41655a, -1, -1).f41720h.setContentDescription(oi0.d.a(this, getString(this.f41662h.w0().f23164e), new cg1.e(22)));
                    break;
                case 5:
                    new b(this, new hg1.d(this, 6), l3.c(new l22.a(this), this.f41662h.H(), false), getString(R.string.lbl_calories), 2, getString(R.string.calories_abbreviation), "0123456789", this.f41655a, -1, -1).f41720h.setContentDescription(getString(R.string.lbl_calories));
                    break;
                case 6:
                    hg1.d dVar = new hg1.d(this, 0);
                    HashMap<String, Object> map = this.f41662h.f34132b;
                    if (map.containsKey("repsAlertValue")) {
                        Object obj = map.get("repsAlertValue");
                        obj.getClass();
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        iIntValue = 10;
                    }
                    new b(this, dVar, l3.j(iIntValue, this, false), getString(R.string.strength_training_reps), 2, getString(R.string.strength_training_reps), "0123456789", this.f41655a, -1, -1);
                    break;
            }
            return;
        }
        if (id3 == R.id.secondAlertComplexBtn2) {
            int i15 = a.f41663a[this.f41655a.ordinal()];
            if (i15 == 1) {
                new d(this, getString(R.string.run_mode_alerts_setting_walk_time), new hg1.d(this, 1), this.f41655a, this.f41662h.j0());
                return;
            }
            if (i15 != 4) {
                return;
            }
            m3 m3VarW0 = this.f41662h.w0();
            int i16 = 0;
            while (true) {
                m3VarArr = f41654i;
                if (i16 >= m3VarArr.length) {
                    i16 = 0;
                    break;
                } else if (m3VarW0 == m3VarArr[i16]) {
                    break;
                } else {
                    i16++;
                }
            }
            CharSequence[] charSequenceArr2 = new CharSequence[m3VarArr.length];
            while (i14 < m3VarArr.length) {
                charSequenceArr2[i14] = getString(m3VarArr[i14].f23164e);
                i14++;
            }
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
            aVar.setTitle(R.string.lbl_unit_of_measure).setSingleChoiceItems(charSequenceArr2, i16, new h1(this, 15));
            aVar.create().show();
            oe2.f.f0(aVar.show(), getString(R.string.lbl_miles), getString(R.string.lbl_kilometers));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_run_mode_alerts_3_0);
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) getIntent().getParcelableExtra("GCM_deviceActivityOptions");
        this.f41662h = fVar;
        if (fVar == null) {
            i2.f(a2.SETTINGS, "GCMRunModeAlertsActivity", "Invalid device activity options object!");
            finish();
        } else {
            SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.runModeAlertsSwitch);
            this.f41656b = (LinearLayout) findViewById(R.id.alertTypeExpandableLayout);
            this.f41657c = (GCMComplexOneLineButton) findViewById(R.id.alertTypeComplexBtn);
            this.f41658d = (GCMComplexOneLineButton) findViewById(R.id.firstAlertComplexBtn1);
            this.f41659e = (GCMComplexOneLineButton) findViewById(R.id.secondAlertComplexBtn2);
            this.f41660f = (TextView) findViewById(R.id.toolTipTextViewLabel);
            ((TextView) findViewById(R.id.runModeAlertsTextViewLabel)).setText(ca());
            boolean z14 = this.f41662h.j1().booleanValue() || this.f41662h.x1().booleanValue() || this.f41662h.e1().booleanValue() || this.f41662h.v1().booleanValue() || this.f41662h.c1().booleanValue() || this.f41662h.t1().booleanValue();
            switchCompat.setChecked(z14);
            LinearLayout linearLayout = this.f41656b;
            if (z14) {
                linearLayout.setVisibility(0);
                this.f41660f.setVisibility(0);
            } else {
                linearLayout.setVisibility(8);
                this.f41660f.setVisibility(8);
            }
            switchCompat.setOnCheckedChangeListener(new com.google.android.material.chip.a(this, 4));
        }
        super.initActionBar(true, ca());
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        androidx.appcompat.app.e eVar = this.f41661g;
        if (eVar != null) {
            eVar.dismiss();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        j jVar = this.f41655a;
        if (jVar != null) {
            da(jVar);
            return;
        }
        ArrayList arrayListC0 = this.f41662h.c0();
        if (!arrayListC0.isEmpty()) {
            da((j) arrayListC0.get(0));
            return;
        }
        ArrayList arrayListA0 = this.f41662h.A0();
        if (arrayListA0.isEmpty()) {
            finish();
        } else {
            da((j) arrayListA0.get(0));
        }
    }
}

package com.huawei.ui.homehealth.runcard;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.healthcloud.plugintrack.model.SportBeat;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homehealth.R;
import defpackage.cyf;
import defpackage.ies;
import defpackage.iwy;
import defpackage.jaq;
import defpackage.jbf;
import defpackage.jhi;
import defpackage.jwz;
import defpackage.jxk;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qhq;
import defpackage.qrs;
import defpackage.vdo;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class SportMetronomeActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f25802b = c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f25803c = {R.string.IDS_track_metronome_sound1, R.string.IDS_track_metronome_sound2, R.string.IDS_track_metronome_sound3, R.string.IDS_track_metronome_sound4};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthCardView f25804a;
    private int aa;
    private HealthTextView ab;
    private HealthTextView ad;
    private HealthSwitchButton ae;
    private jwz ag;
    private HealthTextView ai;
    private HealthTextView d;
    private HealthSwitchButton e;
    private CustomTitleBar f;
    private Context g;
    private HealthCardView h;
    private int i;
    private HealthCardView j;
    private int k;
    private boolean l;
    private LinearLayout n;
    private boolean o;
    private HealthTextView p;
    private LinearLayout q;
    private ConstraintLayout r;
    private ConstraintLayout s;
    private LinearLayout t;
    private HealthImageView u;
    private HealthTextView v;
    private HealthTextView w;
    private HealthTextView x;
    private HealthImageView y;
    private HealthSwitchButton z;
    private SportBeat ac = new SportBeat(false, 170, 0);
    private boolean m = false;
    private int ah = 0;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sport_metronome);
        b();
        this.g = BaseApplication.b();
        j();
        h();
        g();
    }

    private void b() {
        Intent intent = getIntent();
        if (intent != null) {
            this.k = intent.getIntExtra("jump_source", 0);
            this.l = intent.getBooleanExtra("is_support_metronome", true);
            this.ah = intent.getIntExtra("jump_from_sport_type", 0);
        }
    }

    private void j() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.ctb_metronome_title);
        this.f = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(ContextCompat.getColor(this, com.huawei.ui.main.R.color.common_transparent));
        this.j = (HealthCardView) findViewById(R.id.card_metronome);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_metronome_switch);
        this.t = linearLayout;
        this.ab = (HealthTextView) linearLayout.findViewById(R.id.reminder_switch_title);
        this.p = (HealthTextView) this.t.findViewById(R.id.reminder_switch_description);
        this.z = (HealthSwitchButton) this.t.findViewById(R.id.reminder_switch_btn);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.layout_metronome_frequency);
        this.r = constraintLayout;
        this.v = (HealthTextView) constraintLayout.findViewById(R.id.htv_item_left_text);
        this.x = (HealthTextView) this.r.findViewById(R.id.htv_item_right_text);
        this.u = (HealthImageView) this.r.findViewById(R.id.hiv_right_arrow);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.layout_metronome_sound_effects);
        this.s = constraintLayout2;
        this.w = (HealthTextView) constraintLayout2.findViewById(R.id.htv_item_left_text);
        this.ad = (HealthTextView) this.s.findViewById(R.id.htv_item_right_text);
        this.y = (HealthImageView) this.s.findViewById(R.id.hiv_right_arrow);
        d();
        this.h = (HealthCardView) findViewById(R.id.card_voice_broadcast);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.layout_voice_broadcast);
        this.q = linearLayout2;
        this.ai = (HealthTextView) linearLayout2.findViewById(R.id.voice_switch_title);
        this.ae = (HealthSwitchButton) this.q.findViewById(R.id.voice_switch_btn);
        f();
    }

    private void d() {
        this.f25804a = (HealthCardView) findViewById(R.id.card_bike_pause_broadcast);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_bike_pause_broadcast);
        this.n = linearLayout;
        this.e = (HealthSwitchButton) linearLayout.findViewById(R.id.bike_pause_switch_btn);
        this.d = (HealthTextView) this.n.findViewById(R.id.bike_pause_switch_title);
    }

    private void f() {
        if (LanguageUtil.ba(this.g)) {
            this.u.setBackgroundResource(R.drawable.common_ui_arrow_left);
            this.y.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            this.u.setBackgroundResource(R.drawable.common_ui_arrow_right);
            this.y.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
    }

    private void h() {
        this.r.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportMetronomeActivity$$ExternalSyntheticLambda11
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.e.a(compoundButton, z);
            }
        });
        this.ae.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportMetronomeActivity$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f25805a.c(compoundButton, z);
            }
        });
        if (this.ah == 259) {
            this.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportMetronomeActivity$$ExternalSyntheticLambda2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    SportMetronomeActivity.d(compoundButton, z);
                }
            });
        }
        this.f.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: swu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
    }

    /* synthetic */ void a(CompoundButton compoundButton, boolean z) {
        b(z);
        this.o = z;
        if (!this.m) {
            LogUtil.a("Track_SportMetronomeActivity", "mMetronomeSwitch is not click event");
        } else {
            m();
        }
    }

    /* synthetic */ void c(CompoundButton compoundButton, boolean z) {
        a(z);
    }

    static /* synthetic */ void d(CompoundButton compoundButton, final boolean z) {
        LogUtil.a("Track_SportMetronomeActivity", "mBikePauseBroadcastSwitch setOnCheckedChangeListener");
        jbf jbfVar = new jbf();
        jbfVar.d(z);
        iwy.a(BaseApplication.b()).k(z);
        qhq.d("9002", "900200038", ies.c(jbfVar), new HiDataOperateListener() { // from class: swx
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                ReleaseLogUtil.d("Track_SportMetronomeActivity", "CYCLING_AUTO set ", Boolean.valueOf(z), " result: ", Integer.valueOf(i));
            }
        }, System.currentTimeMillis());
    }

    public /* synthetic */ void e(View view) {
        n();
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("Track_SportMetronomeActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (jxk.a(this.ah)) {
            jhi.b(getWindow(), true);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LogUtil.a("Track_SportMetronomeActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        if (jxk.a(this.ah)) {
            jhi.b(getWindow(), false);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        n();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            n();
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void n() {
        if (this.ac != null) {
            Intent intent = new Intent();
            intent.putExtra("sportBeatData", this.ac);
            setResult(-1, intent);
        }
    }

    private void g() {
        if (this.k == 1 || UnitUtil.f()) {
            this.f.setTitleText(getString(R.string.IDS_track_metronome));
            this.h.setVisibility(8);
            this.f25804a.setVisibility(8);
        } else {
            this.f.setTitleText(getString(R.string.IDS_hwh_motiontrack_sport_setting));
            this.h.setVisibility(0);
            this.ai.setText(getString(R.string.IDS_hwh_motiontrack_sport_voice_broadcast));
            this.ae.setChecked(jaq.c() == 1);
            if (this.ah == 259) {
                this.f25804a.setVisibility(0);
                this.d.setText(getString(R.string.IDS_outdoor_cycling_auto_pause_title));
                jxk.a((ResponseCallback<Boolean>) new ResponseCallback() { // from class: sxh
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        this.f48786b.c(i, (Boolean) obj);
                    }
                });
            } else {
                this.f25804a.setVisibility(8);
            }
        }
        if (!this.l) {
            LogUtil.a("Track_SportMetronomeActivity", "initData, not support metronome");
            this.j.setVisibility(8);
        } else {
            SharedPreferenceManager.a(Integer.toString(20002), "metronome_page_show", true);
            b(new c());
        }
    }

    public /* synthetic */ void c(int i, Boolean bool) {
        if (i == 0) {
            this.e.setChecked(bool.booleanValue());
        } else {
            this.e.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        runOnUiThread(new Runnable() { // from class: sxc
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
            }
        });
    }

    public /* synthetic */ void e() {
        this.ab.setText(getString(R.string.IDS_track_metronome));
        this.p.setText(getString(R.string.IDS_track_metronome_description));
        boolean zIsOpen = this.ac.isOpen();
        this.o = zIsOpen;
        this.z.setChecked(zIsOpen);
        b(this.o);
        this.v.setText(getString(R.string.IDS_track_metronome_frequency));
        int frequency = this.ac.getFrequency();
        this.i = frequency;
        if (frequency < 10 || frequency > 240) {
            LogUtil.a("Track_SportMetronomeActivity", "initData, frequencyValue is ", Integer.valueOf(frequency));
            this.i = 170;
        }
        this.x.setText(getResources().getQuantityString(R.plurals.IDS_steps_rate, this.i, e(this.i)));
        this.w.setText(getString(R.string.IDS_track_metronome_sound));
        int audio = this.ac.getAudio();
        this.aa = audio;
        if (audio < 0 || audio > f25803c.length) {
            LogUtil.a("Track_SportMetronomeActivity", "initData, soundEffectsValue is ", Integer.valueOf(audio));
            this.aa = 0;
        }
        this.ad.setText(getString(f25803c[this.aa]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        k();
    }

    private void m() {
        this.ac.setIsOpen(this.o);
        this.ac.setFrequency(this.i);
        this.ac.setAudio(this.aa);
        l();
    }

    private void l() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: swz
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        });
    }

    public /* synthetic */ void a() {
        String strD = HiJsonUtil.d(this.ac);
        ReleaseLogUtil.d("R_Track_SportMetronomeActivity", "saveSportBeatToDb, configId is ", "900200020", ", configData is ", strD);
        vdo.b("9002", "900200020", strD, new d());
    }

    public static void b(final HiDataReadResultListener hiDataReadResultListener) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: swv
            @Override // java.lang.Runnable
            public final void run() {
                vdo.e("9002", "900200020", hiDataReadResultListener);
            }
        });
    }

    private void b(boolean z) {
        if (z) {
            this.v.setAlpha(1.0f);
            this.x.setAlpha(1.0f);
            this.u.setAlpha(1.0f);
            this.r.setClickable(true);
            this.w.setAlpha(1.0f);
            this.ad.setAlpha(1.0f);
            this.y.setAlpha(1.0f);
            this.s.setClickable(true);
            return;
        }
        this.v.setAlpha(0.4f);
        this.x.setAlpha(0.4f);
        this.u.setAlpha(0.4f);
        this.r.setClickable(false);
        this.w.setAlpha(0.4f);
        this.ad.setAlpha(0.4f);
        this.y.setAlpha(0.4f);
        this.s.setClickable(false);
    }

    private void a(boolean z) {
        iwy.a(BaseApplication.b()).f(z);
        HashMap map = new HashMap(16);
        if (z) {
            map.put("click", 1);
        } else {
            map.put("click", 0);
        }
        lmf.d().c(this.g, AnalyticsValue.MOTION_TRACK_1040023.value(), map, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.c(500)) {
            LogUtil.j("Track_SportMetronomeActivity", "click too fast");
            return;
        }
        if (view == this.r) {
            LogUtil.a("Track_SportMetronomeActivity", "onClick click view mLayoutMetronomeFrequency");
            c(1);
        } else {
            if (view == this.s) {
                LogUtil.a("Track_SportMetronomeActivity", "onClick click view mLayoutMetronomeSoundEffects");
                c(2);
                i();
                return;
            }
            LogUtil.j("Track_SportMetronomeActivity", "onClick click view not find");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        jwz jwzVar = this.ag;
        if (jwzVar != null) {
            jwzVar.e();
            this.ag = null;
        }
    }

    private void c(final int i) {
        final HealthNumberPicker healthNumberPicker = new HealthNumberPicker(this);
        final String[] strArrD = d(i);
        int iB = b(i);
        healthNumberPicker.setDisplayedValues(strArrD);
        healthNumberPicker.setMaxValue(strArrD.length - 1);
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setValue(iB);
        healthNumberPicker.setWrapSelectorWheel(true);
        healthNumberPicker.setSelectionDivider(ContextCompat.getDrawable(this, R.drawable.numberpicker_line_title));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = this.g.getResources().getDimensionPixelSize(R.dimen.health_common_16dp);
        healthNumberPicker.setLayoutParams(marginLayoutParams);
        if (i == 2) {
            healthNumberPicker.setOnValuePickedListener(new HealthNumberPicker.OnPickedListener() { // from class: sxb
                @Override // com.huawei.ui.commonui.numberpicker.HealthNumberPicker.OnPickedListener
                public final void onValuePicked(int i2, int i3) {
                    this.e.e(i2, i3);
                }
            });
        }
        LinearLayout linearLayout = new LinearLayout(this.g);
        linearLayout.setOrientation(1);
        linearLayout.addView(healthNumberPicker);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        builder.b("").a(linearLayout).d(R.string.IDS_hw_common_ui_dialog_confirm, new DialogInterface.OnClickListener() { // from class: sxd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.d.d(healthNumberPicker, i, strArrD, dialogInterface, i2);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new DialogInterface.OnClickListener() { // from class: sxa
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.e.b(i, dialogInterface, i2);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    public /* synthetic */ void e(int i, int i2) {
        LogUtil.a("Track_SportMetronomeActivity", "newValue is ", Integer.valueOf(i2));
        if (i != i2) {
            a(i2);
        }
    }

    public /* synthetic */ void d(HealthNumberPicker healthNumberPicker, int i, String[] strArr, DialogInterface dialogInterface, int i2) {
        int value = healthNumberPicker.getValue();
        LogUtil.a("Track_SportMetronomeActivity", "showPickerView click positive button, index is ", Integer.valueOf(value));
        if (i == 2 && this.ag != null) {
            LogUtil.a("Track_SportMetronomeActivity", "mSportBeatPlayer stopBeat");
            this.ag.j();
        }
        if (value < 0 || value > strArr.length - 1) {
            LogUtil.e("Track_SportMetronomeActivity", "showPickerView index out of bounds");
        } else {
            c(i, value);
        }
    }

    public /* synthetic */ void b(int i, DialogInterface dialogInterface, int i2) {
        LogUtil.a("Track_SportMetronomeActivity", "showPickerView click negative button");
        if (i != 2 || this.ag == null) {
            return;
        }
        LogUtil.a("Track_SportMetronomeActivity", "mSportBeatPlayer stopBeat");
        this.ag.j();
    }

    private void i() {
        if (this.ag == null) {
            jwz jwzVar = new jwz(new SportBeat(true, this.i, this.aa));
            this.ag = jwzVar;
            jwzVar.g();
        } else {
            this.ag.c(new SportBeat(true, this.i, this.aa));
            this.ag.f();
        }
    }

    private void a(int i) {
        this.ag.i();
        this.ag.c(new SportBeat(true, this.i, i));
        this.ag.f();
    }

    private void c(int i, int i2) {
        if (i == 1) {
            int i3 = i2 + 10;
            this.i = i3;
            this.x.setText(getResources().getQuantityString(R.plurals.IDS_steps_rate, this.i, e(i3)));
        } else {
            this.aa = i2;
            this.ad.setText(getString(f25803c[i2]));
        }
        m();
    }

    private String[] d(int i) {
        int i2 = 0;
        if (i == 1) {
            int length = f25802b.length;
            String[] strArr = new String[length];
            while (i2 < length) {
                Resources resources = getResources();
                int i3 = R.plurals.IDS_steps_rate;
                int i4 = f25802b[i2];
                strArr[i2] = resources.getQuantityString(i3, i4, e(i4));
                i2++;
            }
            return strArr;
        }
        String[] strArr2 = new String[f25803c.length];
        while (true) {
            int[] iArr = f25803c;
            if (i2 >= iArr.length) {
                return strArr2;
            }
            strArr2[i2] = getString(iArr[i2]);
            i2++;
        }
    }

    private int b(int i) {
        if (i == 1) {
            return this.i - 10;
        }
        if (i == 2) {
            return this.aa;
        }
        LogUtil.j("Track_SportMetronomeActivity", "getDefaultPosition, pickerType is ", Integer.valueOf(i));
        return 0;
    }

    private String e(int i) {
        return UnitUtil.e(i, 1, 0);
    }

    private static int[] c() {
        ArrayList arrayList = new ArrayList();
        for (int i = 10; i <= 240; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        int[] iArr = new int[arrayList.size()];
        return arrayList.stream().mapToInt(new cyf()).toArray();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.m && motionEvent.getAction() == 0) {
                this.m = true;
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            LogUtil.a("Track_SportMetronomeActivity", "dispatchTouchEvent, exception:", LogAnonymous.b(e));
            return false;
        }
    }

    static class d implements HiDataOperateListener {
        private d() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            ReleaseLogUtil.d("Track_SportMetronomeActivity", "saveSportBeatToDb, errorCode is ", Integer.valueOf(i));
        }
    }

    static class c implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<SportMetronomeActivity> f25806b;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        private c(SportMetronomeActivity sportMetronomeActivity) {
            this.f25806b = new WeakReference<>(sportMetronomeActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            SportMetronomeActivity sportMetronomeActivity = this.f25806b.get();
            if (sportMetronomeActivity == null) {
                LogUtil.j("Track_SportMetronomeActivity", "onResponse: activity is null");
                return;
            }
            if (!njy.b(obj, HiSampleConfig.class)) {
                LogUtil.j("Track_SportMetronomeActivity", "onResponse: objData is not instanceof HiSampleConfig");
                sportMetronomeActivity.o();
                return;
            }
            List list = (List) obj;
            if (!njy.e(list)) {
                sportMetronomeActivity.ac = (SportBeat) HiJsonUtil.d(((HiSampleConfig) list.get(0)).getConfigData(), SportBeat.class);
                if (sportMetronomeActivity.ac == null) {
                    LogUtil.j("Track_SportMetronomeActivity", "onResponse: activity.mSportBeat is null, loading default value");
                    sportMetronomeActivity.o();
                    return;
                } else {
                    ReleaseLogUtil.d("Track_SportMetronomeActivity", "onResponse: refreshMetronomeLayout mSportBeat is ", sportMetronomeActivity.ac);
                    sportMetronomeActivity.k();
                    return;
                }
            }
            LogUtil.j("Track_SportMetronomeActivity", "onResponse: list is empty");
            sportMetronomeActivity.o();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

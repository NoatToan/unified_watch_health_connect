package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.fragment.PressureCalibrateQuestionActivity;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.view.NoTimeClockView;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.view.TimeClockView;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity;
import defpackage.fua;
import defpackage.idy;
import defpackage.qrs;
import defpackage.uey;
import defpackage.ugb;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class PressureCalibrateResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f26955a;
    private FrameLayout aa;
    private LinearLayout ab;
    private int ac;
    private TimeClockView ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f26956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f26957c;
    private MessageReceiver d;
    private FrameLayout e;
    private LinearLayout f;
    private HealthTextView g;
    private HealthTextView h;
    private Context i;
    private HealthTextView j;
    private int k;
    private c l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean r;
    private boolean s;
    private HealthTextView u;
    private NoTimeClockView v;
    private FrameLayout w;
    private HealthTextView x;
    private HealthTextView z;
    private boolean q = false;
    private boolean t = false;
    private boolean y = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pressure_calibrate_result);
        this.i = this;
        this.l = new c(this);
        c();
        b();
        Intent intent = getIntent();
        if (intent != null) {
            this.m = intent.getBooleanExtra("pressure_is_have_datas", false);
            this.s = intent.getBooleanExtra("press_auto_monitor", false);
            this.o = intent.getBooleanExtra("from_health_record", false);
            this.r = intent.getBooleanExtra("stopTimer", false);
            this.p = intent.getBooleanExtra("MovementMode", false);
            this.k = intent.getIntExtra(ArkUIXConstants.FROM_TYPE, 0);
            boolean booleanExtra = intent.getBooleanExtra("no_privacy", false);
            this.n = booleanExtra;
            LogUtil.a("PressureCalibrateResultActivity", "data mIsAutoMonitorBack: ", Boolean.valueOf(this.s), " mIsStopTimers: ", Boolean.valueOf(this.r), "mIsMovementMode: ", Boolean.valueOf(this.p), " mHasNoPrivacy ", Boolean.valueOf(booleanExtra));
        }
        a();
    }

    private void c() {
        ugb.b().f(true);
        ugb.b().j(true);
        uey.a().i(false);
    }

    private void b() {
        this.d = new MessageReceiver(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.ui.pressure.calibrate");
        intentFilter.addAction("com.huawei.ui.pressure.measure.calibrate.stop");
        intentFilter.addAction("com.huawei.ui.pressure.calibrate.err");
        BroadcastManagerUtil.d(this, this.d, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void a() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.hw_pressure_calibrate_result_title_layout);
        customTitleBar.setLeftButtonClickable(true);
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: uex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50001b.a(view);
            }
        });
        this.f26955a = (LinearLayout) findViewById(R.id.hw_pressure_calibrate_result_linearlayout);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.hw_pressure_calibrate_time_clock_framelayout);
        this.e = frameLayout;
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.hw_pressure_calibrate_time_clock_frame);
        this.f26957c = frameLayout2;
        frameLayout2.setVisibility(0);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.hw_pressure_calibrate_no_time_clock_frame);
        this.w = frameLayout3;
        frameLayout3.setVisibility(8);
        HealthButton healthButton = (HealthButton) findViewById(R.id.hw_pressure_calibrate_result_complete_btn);
        this.f26956b = healthButton;
        healthButton.setVisibility(8);
        this.aa = (FrameLayout) findViewById(R.id.hw_pressure_calibrate_result_show);
        this.ab = (LinearLayout) findViewById(R.id.hw_pressure_calibrate_result_linear);
        this.g = (HealthTextView) findViewById(R.id.hw_pressure_calibrate_result_tv);
        this.h = (HealthTextView) findViewById(R.id.hw_pressure_calibrate_result_number);
        this.f = (LinearLayout) findViewById(R.id.hw_pressure_calibrate_result_fail_linear);
        this.j = (HealthTextView) findViewById(R.id.hw_pressure_calibrate_result_fail_tv);
        this.z = (HealthTextView) findViewById(R.id.hw_pressure_calibrate_result_notify);
        this.x = (HealthTextView) findViewById(R.id.hw_pressure_calibrate_result_knowledge);
        this.u = (HealthTextView) findViewById(R.id.hw_pressure_calibrate_tip_knowledge);
        this.ad = (TimeClockView) findViewById(R.id.hw_pressure_calibrate_time_clock_view);
        this.z.setVisibility(0);
        this.x.setVisibility(0);
        this.u.setVisibility(0);
        ((HealthTextView) findViewById(R.id.hw_pressure_calibrate_technic_tv)).setVisibility(0);
        initViewTahiti();
        boolean zJ = uey.a().j();
        ReleaseLogUtil.d("PressureCalibrateResultActivity", "initView isGameOver: ", Boolean.valueOf(zJ));
        if (this.r) {
            g();
        } else if (zJ) {
            f();
        } else {
            e();
        }
    }

    public /* synthetic */ void a(View view) {
        if (!this.t) {
            h();
        } else {
            d();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        boolean zAf = qrs.af(getApplicationContext());
        super.initViewTahiti();
        if (zAf) {
            this.x.setGravity(17);
        } else {
            this.x.setGravity(GravityCompat.START);
        }
    }

    private void e() {
        int i;
        boolean zB = uey.a().b();
        if (uey.a().m()) {
            f();
            return;
        }
        uey.a().w();
        if (!zB) {
            LogUtil.a("PressureCalibrateResultActivity", "No Devices!");
            i();
            return;
        }
        LogUtil.a("PressureCalibrateResultActivity", "Have Devices!");
        int iC = (int) (ugb.b().c() - ugb.b().p());
        LogUtil.a("PressureCalibrateResultActivity", "time = ", Integer.valueOf(iC));
        if (iC >= 60000 || ((i = 60000 - iC) > 0 && i < 1000)) {
            i = 1000;
        }
        if (i > 0) {
            int i2 = 60 - (i / 1000);
            this.ac = i2;
            LogUtil.a("PressureCalibrateResultActivity", "startTime= ", Integer.valueOf(i2));
            this.ad.a(this.ac, 60, this.z);
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        HashMap map = new HashMap(4);
        map.put("CalibrateSuccessed", 0);
        idy.b(AnalyticsValue.HEALTH_PRESSUER_ADJUST_SUCCESS_2160007.value(), map);
        this.t = true;
        TimeClockView timeClockView = this.ad;
        if (timeClockView != null) {
            timeClockView.e();
            this.ad.setVisibility(8);
            this.f26957c.setVisibility(8);
        }
        if (this.v == null) {
            this.v = new NoTimeClockView(this.i);
        }
        this.ab.setVisibility(8);
        this.v = new NoTimeClockView(this.i);
        this.f26957c.setVisibility(8);
        this.w.setVisibility(0);
        this.w.addView(this.v);
        this.aa.setVisibility(0);
        this.f.setVisibility(0);
        this.j.setVisibility(0);
        this.j.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_answer_fail_text));
        this.z.setTextSize(15.0f);
        if (this.p) {
            this.z.setText(this.i.getResources().getString(R.string.IDS_hw_adjust_show_pressure_in_move_mode));
            m();
        } else if (this.n) {
            this.z.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_no_privacy));
        } else {
            this.z.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_notify_stop));
        }
        this.x.setVisibility(8);
        this.u.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.t = true;
        this.v = new NoTimeClockView(this.i);
        this.f26957c.setVisibility(8);
        TimeClockView timeClockView = this.ad;
        if (timeClockView != null) {
            timeClockView.e();
            this.ad.setVisibility(8);
        }
        this.w.setVisibility(0);
        this.w.addView(this.v);
        this.aa.setVisibility(0);
        this.ab.setVisibility(8);
        this.f.setVisibility(0);
        this.j.setVisibility(0);
        LogUtil.a("PressureCalibrateResultActivity", "pressure calibrate fail");
        this.j.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_answer_fail_text));
        this.z.setTextSize(15.0f);
        this.z.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_notify_stop));
        this.x.setVisibility(8);
        this.u.setVisibility(8);
        this.f26956b.setVisibility(8);
        this.f26956b.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_again));
        this.t = true;
        HashMap map = new HashMap(4);
        map.put("CalibrateSuccessed", 0);
        idy.b(AnalyticsValue.HEALTH_PRESSUER_ADJUST_SUCCESS_2160007.value(), map);
    }

    private void j() {
        int i = this.ac;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        this.x.setText(String.format(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_answer_question_leaving_time_notification), stringBuffer.append(this.i.getResources().getQuantityString(R.plurals.IDS_hw_show_card_pressure_calibrate_answer_second, 60, 60)).toString(), stringBuffer2.append(this.i.getResources().getQuantityString(R.plurals.IDS_hw_show_card_pressure_calibrate_answer_second, i, Integer.valueOf(i))).toString()).trim());
        this.u.setVisibility(8);
        this.aa.setVisibility(8);
        this.ab.setVisibility(8);
        this.f.setVisibility(8);
        this.f26956b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.t = true;
        this.v = new NoTimeClockView(this.i);
        this.f26957c.setVisibility(8);
        TimeClockView timeClockView = this.ad;
        if (timeClockView != null) {
            timeClockView.e();
            this.ad.setVisibility(8);
        }
        this.w.setVisibility(0);
        this.w.addView(this.v);
        this.aa.setVisibility(0);
        this.f.setVisibility(8);
        float[] fArrD = uey.a().d(2);
        LogUtil.a("PressureCalibrateResultActivity", "backSo is ", Arrays.toString(fArrD));
        boolean zE = uey.a().e(fArrD);
        ReleaseLogUtil.d("PressureCalibrateResultActivity", "isCalibrateSuccess: ", Boolean.valueOf(zE));
        if (zE) {
            b(fArrD);
            d(fArrD);
        } else {
            HashMap map = new HashMap(4);
            map.put("CalibrateSuccessed", 0);
            idy.b(AnalyticsValue.HEALTH_PRESSUER_ADJUST_SUCCESS_2160007.value(), map);
            this.ab.setVisibility(8);
            this.f.setVisibility(0);
            this.j.setVisibility(0);
            this.j.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_answer_fail_text));
            this.z.setTextSize(15.0f);
            this.z.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_notify_stop));
            this.x.setVisibility(8);
            this.u.setVisibility(8);
            this.f26956b.setVisibility(8);
            this.f26956b.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_again));
        }
        this.t = true;
    }

    private void b(float[] fArr) {
        TimeClockView timeClockView = this.ad;
        if (timeClockView != null) {
            timeClockView.e();
            this.ad.setVisibility(8);
        }
        HashMap map = new HashMap(4);
        map.put("CalibrateSuccessed", 1);
        idy.b(AnalyticsValue.HEALTH_PRESSUER_ADJUST_SUCCESS_2160007.value(), map);
        this.q = true;
        this.ab.setVisibility(0);
        this.g.setVisibility(0);
        this.g.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_current_pressure));
        this.h.setVisibility(0);
        this.h.setText(UnitUtil.e(uey.a().b(fArr), 1, 0));
        int iC = uey.a().c(fArr);
        this.z.setText(String.format(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_grade), uey.a().a(iC)));
        this.x.setVisibility(0);
        this.u.setVisibility(0);
        if (iC == 1) {
            this.x.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_1));
        } else if (iC == 2) {
            this.x.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_2));
        } else if (iC == 3) {
            this.x.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_3));
        } else if (iC == 4) {
            this.x.setText(this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_4));
        } else {
            LogUtil.a("PressureCalibrateResultActivity", "processPressureCalibrateSuccess is err!!");
        }
        this.f26956b.setVisibility(8);
    }

    private void d(float[] fArr) {
        uey.a().a(2, this.i, fArr);
        this.t = true;
        LogUtil.a("PressureCalibrateResultActivity", " setDataToDatas !!!");
    }

    public static class MessageReceiver extends BroadcastReceiver {
        private WeakReference<PressureCalibrateResultActivity> e;

        MessageReceiver(PressureCalibrateResultActivity pressureCalibrateResultActivity) {
            this.e = new WeakReference<>(pressureCalibrateResultActivity);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PressureCalibrateResultActivity pressureCalibrateResultActivity = this.e.get();
            if (pressureCalibrateResultActivity == null || intent == null || context == null) {
                LogUtil.j("PressureCalibrateResultActivity", "onReceive activity or intent or content is null");
                return;
            }
            if (uey.a().l()) {
                LogUtil.j("PressureCalibrateResultActivity", "onReceive getIsStopMeasureTimer is true");
                return;
            }
            uey.a().j(true);
            String action = intent.getAction();
            if ("com.huawei.ui.pressure.calibrate".equals(action)) {
                LogUtil.a("PressureCalibrateResultActivity", "calibrate MessageReceiver is end !!!action ==", action);
                pressureCalibrateResultActivity.l.sendEmptyMessage(100);
                return;
            }
            if ("com.huawei.ui.pressure.measure.calibrate.stop".equals(action)) {
                pressureCalibrateResultActivity.l.sendEmptyMessage(200);
                LogUtil.a("PressureCalibrateResultActivity", "calibrate MessageReceiver is suddenness stop !!!");
                uey.a().aa();
                uey.a().b(4);
                return;
            }
            if (!"com.huawei.ui.pressure.calibrate.err".equals(action)) {
                LogUtil.a("PressureCalibrateResultActivity", "onReceive MessageReceiver is err!!");
                return;
            }
            uey.a().a(intent.getBooleanExtra("isFromNoData", false));
            pressureCalibrateResultActivity.l.sendEmptyMessage(614);
            LogUtil.a("PressureCalibrateResultActivity", "calibrate MessageReceiver is err!!");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("PressureCalibrateResultActivity", "calibrate result onDestroy()");
        TimeClockView timeClockView = this.ad;
        if (timeClockView != null) {
            timeClockView.e();
            this.ad = null;
        }
        if (!this.t && !this.y) {
            uey.a().x();
            LogUtil.a("PressureCalibrateResultActivity", "stopAllTimer");
        }
        c cVar = this.l;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
        m();
        this.t = false;
        this.y = false;
        uey.a().u();
        ugb.b().w();
        super.onDestroy();
    }

    private void m() {
        MessageReceiver messageReceiver = this.d;
        if (messageReceiver != null) {
            unregisterReceiver(messageReceiver);
            this.d = null;
        }
    }

    private void h() {
        String string = this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_dialog_notify);
        String string2 = this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_dialog_text);
        String string3 = this.i.getResources().getString(R.string.IDS_hw_common_ui_dialog_cancel);
        String string4 = this.i.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_dialog_button_stop);
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.i);
        builder.e(string).a(string2).b(string4, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.PressureCalibrateResultActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                uey.a().g(false);
                PressureCalibrateResultActivity.this.d();
            }
        }).a(string3, new View.OnClickListener() { // from class: uev
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PressureCalibrateResultActivity", "calibrate button click cancel");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private void b(Class cls) {
        PressureCalibrateQuestionActivity pressureCalibrateQuestionActivityE = uey.a().e();
        if (pressureCalibrateQuestionActivityE != null) {
            pressureCalibrateQuestionActivityE.finish();
        }
        if (!this.t) {
            uey.a().x();
            this.y = true;
            LogUtil.a("PressureCalibrateResultActivity", "stopAllTimer");
        }
        if (this.s || this.o) {
            uey.a().u();
            ugb.b().w();
            finish();
        } else {
            Intent intent = new Intent(this.i, (Class<?>) cls);
            intent.putExtra("pressure_is_have_datas", this.m);
            startActivity(intent);
            uey.a().u();
            ugb.b().w();
            finish();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (!this.t) {
                LogUtil.a("PressureCalibrateResultActivity", "isIsPressureCalibratedOver == ", Boolean.valueOf(uey.a().m()));
                h();
                return false;
            }
            d();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.k == 1 || fua.d()) {
            finish();
        } else if (!this.m && uey.a().g()) {
            this.m = true;
            b(KnitPressureActivity.class);
        } else {
            b(KnitPressureActivity.class);
        }
        finish();
    }

    static class c extends BaseHandler<PressureCalibrateResultActivity> {
        c(PressureCalibrateResultActivity pressureCalibrateResultActivity) {
            super(pressureCalibrateResultActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PressureCalibrateResultActivity pressureCalibrateResultActivity, Message message) {
            if (message == null) {
                LogUtil.e("PressureCalibrateResultActivity", "handleMessageWhenReferenceNotNull msg is null");
                return;
            }
            int i = message.what;
            if (i == 100) {
                pressureCalibrateResultActivity.f();
                return;
            }
            if (i == 200) {
                pressureCalibrateResultActivity.i();
            } else if (i == 614) {
                pressureCalibrateResultActivity.g();
            } else {
                LogUtil.a("PressureCalibrateResultActivity", "no case match!");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

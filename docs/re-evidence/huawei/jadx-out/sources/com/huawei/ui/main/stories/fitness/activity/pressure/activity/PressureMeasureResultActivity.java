package com.huawei.ui.main.stories.fitness.activity.pressure.activity;

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
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.view.NoTimeClockView;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.view.TimeClockView;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity;
import defpackage.fua;
import defpackage.idy;
import defpackage.iov;
import defpackage.qrs;
import defpackage.uey;
import defpackage.ugb;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class PressureMeasureResultActivity extends BaseActivity {
    private static e d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageReceiver f26947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f26948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f26949c;
    private HealthTextView f;
    private Context g;
    private HealthTextView h;
    private HealthButton i;
    private HealthTextView j;
    private Intent k;
    private LinearLayout l;
    private int n;
    private HealthTextView p;
    private boolean q;
    private FrameLayout s;
    private NoTimeClockView t;
    private FrameLayout u;
    private RelativeLayout v;
    private HealthTextView w;
    private LinearLayout x;
    private HealthTextView y;
    private TimeClockView z;
    private boolean o = false;
    private boolean r = false;
    private boolean e = false;
    private boolean m = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pressure_measure_result);
        this.g = this;
        ugb.b().b(true);
        this.f26947a = new MessageReceiver();
        d = new e(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.ui.pressure.measure");
        intentFilter.addAction("com.huawei.ui.pressure.measure.suddenness");
        intentFilter.addAction("com.huawei.ui.pressure.measure.err");
        BroadcastManagerUtil.d(this.g, this.f26947a, intentFilter, LocalBroadcast.f36595c, null);
        Intent intent = getIntent();
        this.k = intent;
        if (intent != null) {
            this.q = intent.getBooleanExtra("pressure_is_have_datas", false);
            this.e = this.k.getBooleanExtra("isOpenMeasure", false);
            this.n = this.k.getIntExtra(ArkUIXConstants.FROM_TYPE, 0);
        }
        i();
        this.v = (RelativeLayout) findViewById(R.id.hw_pressure_measure_time_clock_linerlayout);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.hw_pressure_measure_time_clock_framelayout);
        this.f26948b = frameLayout;
        frameLayout.setVisibility(0);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.hw_pressure_measure_time_clock_frame);
        this.f26949c = frameLayout2;
        frameLayout2.setVisibility(0);
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.hw_pressure_measure_no_time_clock_frame);
        this.s = frameLayout3;
        frameLayout3.setVisibility(8);
        HealthButton healthButton = (HealthButton) findViewById(R.id.hw_pressure_measure_result_complete_btn);
        this.i = healthButton;
        healthButton.setVisibility(8);
        this.u = (FrameLayout) findViewById(R.id.hw_pressure_measure_result_show);
        this.x = (LinearLayout) findViewById(R.id.hw_pressure_measure_result_linear);
        this.j = (HealthTextView) findViewById(R.id.hw_pressure_measure_result_tv);
        this.h = (HealthTextView) findViewById(R.id.hw_pressure_measure_result_number);
        this.l = (LinearLayout) findViewById(R.id.hw_pressure_measure_result_fail_linear);
        this.f = (HealthTextView) findViewById(R.id.hw_pressure_measure_result_fail_tv);
        this.p = (HealthTextView) findViewById(R.id.hw_pressure_measure_result_notify);
        this.y = (HealthTextView) findViewById(R.id.hw_pressure_measure_result_knowledge);
        this.w = (HealthTextView) findViewById(R.id.hw_pressure_measure_tip_knowledge);
        TimeClockView timeClockView = (TimeClockView) findViewById(R.id.hw_pressure_measure_time_clock_view);
        this.z = timeClockView;
        timeClockView.a(60, 60, this.p);
        this.p.setVisibility(0);
        this.y.setVisibility(8);
        this.w.setVisibility(8);
        ((HealthTextView) findViewById(R.id.hw_pressure_measure_technic_tv)).setVisibility(0);
        a();
        initViewTahiti();
    }

    private void a() {
        boolean zB = uey.a().b();
        LogUtil.a("PressureMeasureResultActivity", "isHaveConnected = ", Boolean.valueOf(zB));
        if (zB && this.e) {
            uey.a().d(0, new a());
            uey.a().e(4, 60, 0);
            d();
            return;
        }
        h();
    }

    static class a implements IBaseResponseCallback {
        private final WeakReference<PressureMeasureResultActivity> d;

        private a(PressureMeasureResultActivity pressureMeasureResultActivity) {
            this.d = new WeakReference<>(pressureMeasureResultActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (this.d.get() == null) {
                LogUtil.e("PressureMeasureResultActivity", "mReference is null");
            } else if (i == 126007) {
                PressureMeasureResultActivity.d.sendEmptyMessage(126007);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        uey.a().aa();
        f();
        HealthTextView healthTextView = this.p;
        if (healthTextView != null) {
            healthTextView.setText(this.g.getResources().getString(R.string.IDS_hw_measure_show_pressure_in_move_mode));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
    }

    private void i() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.hw_pressure_measure_result_title_layout);
        customTitleBar.setLeftButtonClickable(true);
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: uet
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49997c.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        if (!this.o) {
            g();
        } else {
            c();
        }
    }

    private void h() {
        this.o = true;
        this.t = new NoTimeClockView(this.g);
        this.f26949c.setVisibility(8);
        this.s.setVisibility(0);
        this.s.addView(this.t);
        this.u.setVisibility(0);
        this.x.setVisibility(8);
        this.l.setVisibility(0);
        this.f.setVisibility(0);
        this.f.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_fail));
        this.p.setTextSize(15.0f);
        this.p.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_notify_stop));
    }

    private void d() {
        this.u.setVisibility(8);
        this.x.setVisibility(8);
        this.l.setVisibility(8);
        this.i.setVisibility(8);
        this.y.setVisibility(0);
        this.w.setVisibility(8);
        this.y.setGravity(1);
        this.y.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_notify_stop));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!uey.a().h()) {
            uey.a().c(0, false);
        }
        uey.a().s();
        float[] fArrD = uey.a().d(0);
        LogUtil.a("PressureMeasureResultActivity", "backSo is ", Arrays.toString(fArrD));
        this.t = new NoTimeClockView(this.g);
        this.f26949c.setVisibility(8);
        TimeClockView timeClockView = this.z;
        if (timeClockView != null) {
            timeClockView.e();
            this.z.setVisibility(8);
        }
        this.s.setVisibility(0);
        this.s.addView(this.t);
        this.u.setVisibility(0);
        this.o = true;
        boolean zI = uey.a().i(fArrD);
        LogUtil.a("PressureMeasureResultActivity", "remove clock isMeasureSuccessed = ", Boolean.valueOf(zI));
        if (zI) {
            c(fArrD);
            d(fArrD);
            return;
        }
        HashMap map = new HashMap(4);
        map.put("MeasureSuccessed", 0);
        idy.b(AnalyticsValue.HEALTH_PRESSUER_MEASUREMENT_SUCCESS_2160010.value(), map);
        this.x.setVisibility(8);
        this.l.setVisibility(0);
        this.f.setVisibility(0);
        this.f.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_fail));
        this.p.setTextSize(15.0f);
        this.p.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_notify_stop));
        this.y.setVisibility(8);
        this.w.setVisibility(8);
    }

    private void c(float[] fArr) {
        TimeClockView timeClockView = this.z;
        if (timeClockView != null) {
            timeClockView.e();
            this.z.setVisibility(8);
        }
        HashMap map = new HashMap(4);
        map.put("MeasureSuccessed", 1);
        idy.b(AnalyticsValue.HEALTH_PRESSUER_MEASUREMENT_SUCCESS_2160010.value(), map);
        this.r = true;
        this.x.setVisibility(0);
        this.j.setVisibility(0);
        this.j.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_current_pressure));
        this.h.setVisibility(0);
        this.h.setText(String.valueOf(uey.a().d(fArr)));
        int iA = uey.a().a(fArr);
        String str = String.format(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_grade), uey.a().a(iA));
        this.y.setGravity(GravityCompat.START);
        this.p.setText(str);
        this.y.setVisibility(0);
        this.w.setVisibility(0);
        if (qrs.af(this.g)) {
            this.y.setGravity(17);
        }
        if (iA == 1) {
            this.y.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_1));
        } else if (iA == 2) {
            this.y.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_2));
        } else if (iA == 3) {
            this.y.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_3));
        } else if (iA == 4) {
            this.y.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_4));
        } else {
            LogUtil.a("PressureMeasureResultActivity", " controlMeasureSucess gradeFlag err !!!");
        }
        this.i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        HashMap map = new HashMap(4);
        map.put("MeasureSuccessed", 0);
        idy.b(AnalyticsValue.HEALTH_PRESSUER_MEASUREMENT_SUCCESS_2160010.value(), map);
        this.o = true;
        TimeClockView timeClockView = this.z;
        if (timeClockView != null) {
            timeClockView.e();
            this.z.setVisibility(8);
        }
        this.f26949c.setVisibility(8);
        this.x.setVisibility(8);
        this.t = new NoTimeClockView(this.g);
        this.s.setVisibility(0);
        this.s.addView(this.t);
        this.u.setVisibility(0);
        this.l.setVisibility(0);
        this.f.setVisibility(0);
        this.f.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_fail));
        this.p.setTextSize(15.0f);
        if (z) {
            this.p.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_no_privacy));
        } else {
            this.p.setText(this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_notify_stop));
        }
        this.y.setVisibility(8);
        this.w.setVisibility(8);
    }

    private void d(float[] fArr) {
        this.o = true;
        LogUtil.a("PressureMeasureResultActivity", " setDataToDatas start !!!");
        uey.a().a(0, this.g, fArr);
        LogUtil.a("PressureMeasureResultActivity", " setDataToDatas end !!!");
    }

    public static class MessageReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (uey.a().l()) {
                return;
            }
            uey.a().j(true);
            if (context == null || intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("com.huawei.ui.pressure.measure".equals(action)) {
                LogUtil.a("PressureMeasureResultActivity", "measure MessageReceiver is end !!!");
                PressureMeasureResultActivity.d.sendEmptyMessage(100);
                return;
            }
            if ("com.huawei.ui.pressure.measure.suddenness".equals(action)) {
                LogUtil.a("PressureMeasureResultActivity", "MEASURE MessageReceiver is suddenness stop !!!");
                PressureMeasureResultActivity.d.sendEmptyMessage(200);
                uey.a().aa();
                uey.a().b(4);
                return;
            }
            if ("com.huawei.ui.pressure.measure.err".equals(action)) {
                uey.a().a(intent.getBooleanExtra("isFromNoData", false));
                Message messageObtain = Message.obtain();
                messageObtain.what = 1000;
                messageObtain.obj = Boolean.valueOf(intent.getBooleanExtra("no_privacy", false));
                PressureMeasureResultActivity.d.sendMessage(messageObtain);
                LogUtil.a("PressureMeasureResultActivity", "MEASURE MessageReceiver is err !!!");
                return;
            }
            LogUtil.a("PressureMeasureResultActivity", "MessageReceiver onReceive action err !!!");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Intent intent = getIntent();
        if (intent != null) {
            intent.putExtra("isOpenMeasure", false);
        }
        TimeClockView timeClockView = this.z;
        if (timeClockView != null) {
            timeClockView.e();
            this.z = null;
        }
        if (!this.o && !this.m) {
            uey.a().x();
            LogUtil.a("PressureMeasureResultActivity", "onDestroycalibrateResultStopAllTimer");
        }
        e eVar = d;
        if (eVar != null) {
            eVar.removeMessages(1000);
            d.removeMessages(200);
            d.removeMessages(100);
        }
        unregisterReceiver(this.f26947a);
        this.o = false;
        this.m = false;
        uey.a().u();
        finish();
        super.onDestroy();
    }

    private void g() {
        String string = this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_dialog_notify);
        String string2 = this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_dialog_text);
        String string3 = this.g.getResources().getString(R.string.IDS_hw_common_ui_dialog_cancel);
        String string4 = this.g.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_dialog_button_stop);
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.g);
        builder.e(string).a(string2).b(string4, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.pressure.activity.PressureMeasureResultActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PressureMeasureResultActivity.this.c();
            }
        }).a(string3, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.pressure.activity.PressureMeasureResultActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("PressureMeasureResultActivity", "button click cancel");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private void c(Class cls) {
        if (!this.o) {
            uey.a().x();
            this.m = true;
            LogUtil.a("PressureMeasureResultActivity", "jumpTOActivitycalibrateResultStopAllTimer");
        }
        Intent intent = new Intent(this.g, (Class<?>) cls);
        this.k = intent;
        intent.putExtra("pressure_is_have_datas", this.q);
        iov.d(this.g, this.k);
        uey.a().u();
        finish();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (!this.o) {
                g();
                return false;
            }
            c();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.n == 1 || fua.d()) {
            finish();
            return;
        }
        if (this.q) {
            c(KnitPressureActivity.class);
        } else if (uey.a().g()) {
            this.q = true;
            c(KnitPressureActivity.class);
        } else {
            c(KnitPressureActivity.class);
        }
    }

    static class e extends BaseHandler<PressureMeasureResultActivity> {
        e(PressureMeasureResultActivity pressureMeasureResultActivity) {
            super(pressureMeasureResultActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(PressureMeasureResultActivity pressureMeasureResultActivity, Message message) {
            if (message == null) {
                LogUtil.e("PressureMeasureResultActivity", "handleMessageWhenReferenceNotNull msg is null");
                return;
            }
            LogUtil.a("PressureMeasureResultActivity", "msg.what is ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 100) {
                pressureMeasureResultActivity.f();
                return;
            }
            if (i == 200) {
                pressureMeasureResultActivity.f();
                return;
            }
            if (i != 1000) {
                if (i != 126007) {
                    return;
                }
                pressureMeasureResultActivity.b();
            } else if (message.obj instanceof Boolean) {
                pressureMeasureResultActivity.e(((Boolean) message.obj).booleanValue());
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

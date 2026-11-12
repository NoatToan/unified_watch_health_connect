package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.view.NoTimeClockView;
import defpackage.iov;
import defpackage.qrs;
import defpackage.uey;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class WifiDevicePressureCalibrateResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f26962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f26963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f26964c;
    private HealthTextView d;
    private Context e;
    private boolean f;
    private FrameLayout g;
    private NoTimeClockView h;
    private Intent i;
    private HealthTextView j;
    private HealthButton k;
    private HealthTextView n;
    private HealthTextView o;
    private CustomTitleBar p;
    private String l = "";
    private String q = "";
    private String m = "";

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifi_device_pressure_calibrate_result);
        this.e = this;
        uey.a().e(true);
        Intent intent = getIntent();
        this.i = intent;
        if (intent != null) {
            this.q = intent.getStringExtra("health_wifi_device_userId");
            this.m = this.i.getStringExtra("health_wifi_device_productId");
            boolean booleanExtra = this.i.getBooleanExtra("pressure_is_have_datas", false);
            this.f = booleanExtra;
            if (booleanExtra) {
                this.l = this.i.getStringExtra("mResultHrv");
            } else {
                LogUtil.a("WifiDevicePressureCalibrateResultActivity", "mIsHavedDatas is false");
            }
        }
        this.p = (CustomTitleBar) findViewById(R.id.hw_wifi_device_result_pressure_calibrate_title_layout);
        this.g = (FrameLayout) findViewById(R.id.hw_pressure_calibrate_no_time_clock_frame);
        this.f26963b = (LinearLayout) findViewById(R.id.hw_pressure_calibrate_result_success);
        this.d = (HealthTextView) findViewById(R.id.hw_pressure_calibrate_result_number);
        this.f26964c = (LinearLayout) findViewById(R.id.hw_pressure_calibrate_result_fail);
        this.j = (HealthTextView) findViewById(R.id.hw_pressure_calibrate_result_fail_tv);
        this.f26962a = (HealthTextView) findViewById(R.id.hw_wifi_device_pressure_calibrate_result_fail_reason);
        this.o = (HealthTextView) findViewById(R.id.hw_wifi_device_pressure_calibrate_result_level);
        this.n = (HealthTextView) findViewById(R.id.hw_wifi_device_pressure_calibrate_result_knowledge);
        this.k = (HealthButton) findViewById(R.id.hw_wifi_device_pressure_calibrate_result_button);
        NoTimeClockView noTimeClockView = new NoTimeClockView(this.e);
        this.h = noTimeClockView;
        this.g.addView(noTimeClockView);
        b();
        a();
    }

    private void b() {
        this.p.setLeftButtonClickable(true);
        this.p.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: ufb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50026c.b(view);
            }
        });
        this.k.setOnClickListener(new View.OnClickListener() { // from class: ufh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50032b.c(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        finish();
    }

    public /* synthetic */ void c(View view) {
        if (this.f) {
            finish();
        } else {
            e();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            finish();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void a() {
        LogUtil.a("WifiDevicePressureCalibrateResultActivity", "initData()");
        if (this.f) {
            this.f26963b.setVisibility(0);
            this.f26964c.setVisibility(8);
            this.f26962a.setVisibility(8);
            this.o.setVisibility(0);
            this.n.setVisibility(0);
            this.d.setText(this.l);
            this.o.setText(String.format(this.e.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_grade), uey.a().a(b(CommonUtil.n(this.e, this.l)))));
            this.n.setText(d(b(CommonUtil.n(this.e, this.l))));
            this.k.setText(this.e.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_result_complete));
            return;
        }
        this.f26963b.setVisibility(8);
        this.f26964c.setVisibility(0);
        this.j.setVisibility(0);
        this.f26962a.setVisibility(0);
        this.o.setVisibility(8);
        this.n.setVisibility(8);
        this.j.setText(this.e.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_answer_fail_text));
        this.f26962a.setText(new SpannableStringBuilder(this.e.getResources().getString(R.string.IDS_device_mgr_not_found_device_tips1) + System.lineSeparator() + String.format(qrs.d(this.e, R.string.IDS_device_wifi_pressure_calibrate_result_fail_tips1), UnitUtil.e(1.0d, 1, 0)) + System.lineSeparator() + String.format(this.e.getResources().getString(R.string.IDS_device_wifi_pressure_calibrate_result_fail_tips2), UnitUtil.e(2.0d, 1, 0)) + System.lineSeparator() + System.lineSeparator() + this.e.getResources().getString(R.string.IDS_device_wifi_pressure_calibrate_result_fail_tips3)));
        this.k.setText(this.e.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_again));
    }

    private int b(int i) {
        if (i >= 1 && i <= 29) {
            return 1;
        }
        if (i >= 30 && i <= 59) {
            return 2;
        }
        if (i >= 60 && i <= 79) {
            return 3;
        }
        if (i >= 80 && i <= 99) {
            return 4;
        }
        LogUtil.a("WifiDevicePressureCalibrateResultActivity", "checkPressureLevel() err");
        return 0;
    }

    private String d(int i) {
        if (i == 1) {
            return this.e.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_1);
        }
        if (i == 2) {
            return this.e.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_2);
        }
        if (i == 3) {
            return this.e.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_3);
        }
        if (i == 4) {
            return this.e.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_text_4);
        }
        LogUtil.a("WifiDevicePressureCalibrateResultActivity", "getPressureKnowledge() err");
        return "";
    }

    private void e() {
        Intent intent = new Intent(this.e, (Class<?>) WifiDevicePressureCalibrateGuideActivity.class);
        intent.putExtra("health_wifi_device_userId", this.q);
        intent.putExtra("health_wifi_device_productId", this.m);
        iov.d(this.e, intent);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

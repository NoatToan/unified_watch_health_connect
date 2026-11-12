package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.fragment.PressureCalibrateQuestionActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity;
import defpackage.fhz;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.uey;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes3.dex */
public class PressureCalibrateActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26954c;
    private boolean e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pressure_calibrate_main);
        uey.a().e(true);
        Intent intent = getIntent();
        if (intent != null) {
            this.f26954c = intent.getBooleanExtra("pressure_is_have_datas", false);
            this.e = intent.getBooleanExtra("press_auto_monitor", false);
            this.f26952a = intent.getBooleanExtra("from_health_record", false);
            this.f26953b = intent.getIntExtra(ArkUIXConstants.FROM_TYPE, 0);
            uey.a().a(this.f26954c);
        }
        LogUtil.a("PressureMeasureMessage", "mFromHealthRecord is ", Boolean.valueOf(this.f26952a));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        e();
        if (fhz.d() != null) {
            ReleaseLogUtil.d("R_PressureMeasureMessage", "getInstance of Mediator success");
        }
        ReleaseLogUtil.d("R_PressureMeasureMessage", "onCreate finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void e() {
        a();
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.hw_pressure_calibrate_title_layout);
        customTitleBar.setLeftButtonClickable(true);
        customTitleBar.setLeftButtonClickable(true);
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: uew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
        ((HealthButton) findViewById(R.id.hw_pressure_calibrate_start_btn)).setOnClickListener(new View.OnClickListener() { // from class: uez
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(view);
            }
        });
        ((HealthTextView) findViewById(R.id.hw_pressure_calibrate_notify_text_click)).setText(String.format(getString(R.string.IDS_hw_show_card_pressure_calibrate_notify_textcontent), 60));
    }

    public /* synthetic */ void c(View view) {
        b();
    }

    public /* synthetic */ void e(View view) {
        if (qrs.r()) {
            return;
        }
        ReleaseLogUtil.d("R_PressureMeasureMessage", "TO PressureCalibrateResultActivity time = ", Long.valueOf(System.currentTimeMillis()));
        a(PressureCalibrateQuestionActivity.class);
        finish();
    }

    private void a() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hw_pressure_calibrate_iv_layout);
        ImageView imageView = (ImageView) findViewById(R.id.hw_pressure_calibrate_iv);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = qrs.m() / 3;
        linearLayout.setLayoutParams(layoutParams);
        imageView.getLayoutParams().height = linearLayout.getLayoutParams().height;
        imageView.getLayoutParams().width = linearLayout.getLayoutParams().width;
        imageView.setImageBitmap(qqf.e(qqf.e(R.drawable.hw_pressure_bracelet, BaseApplication.getContext()), imageView));
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            b();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void b() {
        if (this.e || this.f26952a || this.f26953b == 1) {
            finish();
        } else {
            a(KnitPressureActivity.class);
            finish();
        }
    }

    private void a(Class cls) {
        Intent intent = new Intent(this, (Class<?>) cls);
        intent.putExtra("pressure_is_have_datas", this.f26954c);
        intent.putExtra("press_auto_monitor", this.e);
        intent.putExtra("from_health_record", this.f26952a);
        intent.putExtra(ArkUIXConstants.FROM_TYPE, this.f26953b);
        LogUtil.a("PressureMeasureMessage", "go to Question have data = ", Boolean.valueOf(this.f26954c));
        startActivity(intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

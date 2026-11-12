package com.huawei.ui.main.stories.fitness.activity.pressure.activity;

import android.content.Context;
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
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity;
import defpackage.fhz;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.uey;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes3.dex */
public class PressureMeasureActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f26943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f26944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f26945c;
    private int d;
    private Context e;
    private boolean f;
    private Intent h;
    private HealthButton i;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pressure_measure_main);
        uey.a().f(true);
        Intent intent = getIntent();
        this.h = intent;
        if (intent != null) {
            this.f = intent.getBooleanExtra("pressure_is_have_datas", false);
            this.d = this.h.getIntExtra(ArkUIXConstants.FROM_TYPE, 0);
            uey.a().a(this.f);
            LogUtil.a("PressureMeasureMessage", "mIsHaveDatas == ", Boolean.valueOf(this.f));
        }
        this.e = this;
        this.f26944b = (CustomTitleBar) findViewById(R.id.hw_pressure_measure_title_layout);
        this.i = (HealthButton) findViewById(R.id.hw_pressure_measure_start_btn);
        this.f26945c = (ImageView) findViewById(R.id.hw_pressure_measure_iv);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.hw_pressure_measure_img_layout);
        this.f26943a = linearLayout;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = qrs.m() / 3;
        this.f26943a.setLayoutParams(layoutParams);
        this.f26945c.getLayoutParams().height = this.f26943a.getLayoutParams().height;
        this.f26945c.getLayoutParams().width = this.f26943a.getLayoutParams().width;
        this.f26945c.setImageBitmap(qqf.e(qqf.e(R.drawable.hw_pressure_bracelet, BaseApplication.getContext()), this.f26945c));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        b();
        if (fhz.d() != null) {
            ReleaseLogUtil.d("R_PressureMeasureMessage", "getInstance of Mediator success");
        }
        ReleaseLogUtil.d("R_PressureMeasureMessage", "onCreate finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void b() {
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.pressure.activity.PressureMeasureActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    return;
                }
                LogUtil.a("PressureMeasureMessage", "TO PressureMeasureResultActivity time = ", Long.valueOf(System.currentTimeMillis()));
                PressureMeasureActivity.this.h = new Intent(PressureMeasureActivity.this.e, (Class<?>) PressureMeasureResultActivity.class);
                PressureMeasureActivity.this.h.putExtra("isOpenMeasure", true);
                PressureMeasureActivity.this.h.putExtra("pressure_is_have_datas", PressureMeasureActivity.this.f);
                PressureMeasureActivity.this.h.putExtra(ArkUIXConstants.FROM_TYPE, PressureMeasureActivity.this.d);
                PressureMeasureActivity pressureMeasureActivity = PressureMeasureActivity.this;
                pressureMeasureActivity.startActivity(pressureMeasureActivity.h);
                PressureMeasureActivity.this.finish();
            }
        });
        this.f26944b.setLeftButtonClickable(true);
        this.f26944b.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.pressure.activity.PressureMeasureActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PressureMeasureActivity.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.d == 1) {
            finish();
            return;
        }
        Intent intent = new Intent(this.e, (Class<?>) KnitPressureActivity.class);
        this.h = intent;
        intent.putExtra("pressure_is_have_datas", this.f);
        startActivity(this.h);
        finish();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            d();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

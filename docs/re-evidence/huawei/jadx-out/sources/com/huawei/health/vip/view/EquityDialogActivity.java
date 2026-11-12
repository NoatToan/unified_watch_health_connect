package com.huawei.health.vip.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.tradeservice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import defpackage.ddv;
import defpackage.qre;
import defpackage.qrs;

/* JADX INFO: loaded from: classes.dex */
public class EquityDialogActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H5ProWebView f10404a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthCardView f10405c;
    private Handler d = new Handler();
    private FrameLayout e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("EquityDialogActivity", "start EquityRenewalDialogActivity.");
        setBackgroundDrawableResource(R.color.common_black_20alpha);
        setContentView(R.layout.activity_equity_dialog_view);
        this.f10404a = (H5ProWebView) findViewById(R.id.blood_pressure_webview);
        this.f10405c = (HealthCardView) findViewById(R.id.blood_pressure_pay_cardview);
        a();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.blood_pressure_pay_view_background);
        this.e = frameLayout;
        BaseActivity.setViewSafeRegion(true, frameLayout);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.vip.view.EquityDialogActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("EquityDialogActivity", "destroy EquityRenewalDialogActivity.");
                EquityDialogActivity.this.onBackPressed();
            }
        });
        this.d.postDelayed(new Runnable() { // from class: com.huawei.health.vip.view.EquityDialogActivity.5
            @Override // java.lang.Runnable
            public void run() {
                EquityDialogActivity.this.c();
            }
        }, 50L);
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        a();
    }

    private void a() {
        if (this.f10405c.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f10405c.getLayoutParams();
            if (qrs.af(this)) {
                layoutParams.topMargin = qre.b(com.huawei.ui.commonui.R.dimen.health_common_72dp);
                layoutParams.bottomMargin = qre.b(com.huawei.ui.commonui.R.dimen.health_common_72dp);
                layoutParams.gravity = 17;
                this.f10405c.setRadius(qre.b(com.huawei.ui.commonui.R.dimen.health_common_32dp));
                layoutParams.width = qre.b(com.huawei.ui.commonui.R.dimen.health_common_480dp);
            } else {
                layoutParams.topMargin = qre.b(com.huawei.ui.commonui.R.dimen.health_common_36dp);
                layoutParams.bottomMargin = qre.b(com.huawei.ui.commonui.R.dimen.health_common_0dp);
                layoutParams.gravity = 80;
                this.f10405c.setRadius(0.0f);
                this.f10405c.setCardBackgroundColor(ContextCompat.getColor(getBaseContext(), R.color.common_transparent));
            }
            this.f10405c.setLayoutParams(layoutParams);
        }
    }

    private void b() {
        LogUtil.a("EquityDialogActivity", "START H5 PRO view");
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.vip.view.EquityDialogActivity.1
            @Override // java.lang.Runnable
            public void run() {
                ddv.b().loadEmbeddedH5(EquityDialogActivity.this.f10404a, "com.huawei.health.h5.vip", new H5ProLaunchOption.Builder().addPath("#/ExclusiveDoctorDialog?from=2"));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f10405c, "translationY", 800.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    private void e() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f10405c, "translationY", 0.0f, 800.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        e();
        this.d.postDelayed(new Runnable() { // from class: com.huawei.health.vip.view.EquityDialogActivity.2
            @Override // java.lang.Runnable
            public void run() {
                EquityDialogActivity.this.finish();
            }
        }, 200L);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }
}

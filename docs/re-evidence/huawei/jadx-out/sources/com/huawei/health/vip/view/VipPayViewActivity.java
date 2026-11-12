package com.huawei.health.vip.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProBridgeManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebView;
import com.huawei.health.h5pro.vengine.H5ProAppLoader;
import com.huawei.health.tradeservice.R;
import com.huawei.health.vip.VipInnerApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.cardview.HealthCardView;
import defpackage.ddv;

/* JADX INFO: loaded from: classes.dex */
public class VipPayViewActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthCardView f10411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f10413c;
    private String d;
    private Handler e = new Handler();
    private H5ProWebView g;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("VipPayViewActivity", "start VipPayViewActivity.");
        Intent intent = getIntent();
        if (intent != null) {
            this.d = intent.getStringExtra("packageName");
            this.f10412b = intent.getStringExtra(BleConstants.KEY_PATH);
        }
        setContentView(R.layout.activity_vip_pay_view);
        b();
        this.g.setVisibility(0);
        this.f10411a = (HealthCardView) findViewById(R.id.vip_pay_cardview);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.vip_pay_view_background);
        this.f10413c = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.vip.view.VipPayViewActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("VipPayViewActivity", "destroy VipPayViewActivity.");
                VipPayViewActivity.this.onBackPressed();
            }
        });
        this.e.postDelayed(new Runnable() { // from class: com.huawei.health.vip.view.VipPayViewActivity.5
            @Override // java.lang.Runnable
            public void run() {
                VipPayViewActivity.this.e();
            }
        }, 50L);
        c();
    }

    private void b() {
        if (TextUtils.isEmpty(this.f10412b)) {
            this.g = (H5ProWebView) findViewById(R.id.vip_pay_webview);
        } else if (this.f10412b.contains("is3dDynamic")) {
            LogUtil.a("VipPayViewActivity", "open high view.");
            this.g = (H5ProWebView) findViewById(R.id.vip_pay_high_webview);
        } else {
            this.g = (H5ProWebView) findViewById(R.id.vip_pay_webview);
        }
    }

    private void c() {
        LogUtil.a("VipPayViewActivity", "START H5 PRO view");
        ddv.b().initH5Pro();
        if (TextUtils.isEmpty(this.d)) {
            this.d = "com.huawei.health.h5.vip";
        }
        if (TextUtils.isEmpty(this.f10412b)) {
            this.f10412b = "#/PayPopup?isShowDetail=true";
        }
        H5ProClient.preLoadH5MiniProgram(this, "com.huawei.health.h5.vip", new H5ProAppLoader.H5ProPreloadCbk() { // from class: com.huawei.health.vip.view.VipPayViewActivity.2
            @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
            public void onSuccess() {
                LogUtil.a("VipPayViewActivity", "preload success");
                VipPayViewActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.health.vip.view.VipPayViewActivity.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        H5ProClient.startH5MiniProgram(VipPayViewActivity.this.d, VipPayViewActivity.this.g, new H5ProLaunchOption.Builder().addPath(VipPayViewActivity.this.f10412b).setForceDarkMode(1).addCustomizeJsModule("VipInnerApi", VipInnerApi.class).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).build());
                    }
                });
            }

            @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
            public void onFailure(int i, String str) {
                LogUtil.a("VipPayViewActivity", "preload failed");
            }
        });
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int intExtra = intent != null ? intent.getIntExtra("shoppingResult", -1) : -1;
        H5ProBridgeManager.getInstance().notifyActivityResult(this.g.getInstance(), i, i2, intent);
        LogUtil.a("VipPayViewActivity", "shoppingResult:", Integer.valueOf(intExtra));
        if (intExtra == 0) {
            LogUtil.a("VipPayViewActivity", "shoppingResult success.");
            onBackPressed();
        } else {
            LogUtil.j("VipPayViewActivity", "shoppingResult fail. resultCode = ", Integer.valueOf(intExtra));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f10411a, "translationY", 800.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    private void d() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f10411a, "translationY", 0.0f, 800.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        d();
        this.e.postDelayed(new Runnable() { // from class: com.huawei.health.vip.view.VipPayViewActivity.1
            @Override // java.lang.Runnable
            public void run() {
                VipPayViewActivity.this.finish();
            }
        }, 200L);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

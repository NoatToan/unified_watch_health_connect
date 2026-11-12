package com.huawei.pluginachievement.ui;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.LevelConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.qqs;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveLevelRuleCNActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebView f22076b;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.achieve_level_cn_rule);
        clearBackgroundDrawable();
        cancelAdaptRingRegion();
        c();
    }

    private void c() {
        LogUtil.a("PLGACHIEVE_AchieveLevelRuleCNActivity", "initView()");
        WebView webView = new WebView(getApplicationContext());
        this.f22076b = webView;
        qqs.c(this, webView);
        this.f22076b.setVerticalScrollBarEnabled(false);
        this.f22076b.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.service_item_linear);
        setViewSafeRegion(false, linearLayout);
        linearLayout.addView(this.f22076b);
        WebSettings settings = this.f22076b.getSettings();
        settings.setSupportZoom(true);
        settings.setTextSize(WebSettings.TextSize.SMALLER);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowContentAccess(false);
        settings.setGeolocationEnabled(false);
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(false);
        this.f22076b.loadUrl(LevelConstants.URL);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        LogUtil.a("PLGACHIEVE_AchieveLevelRuleCNActivity", "AchieveLevelRuleCNActivity onRestart()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("PLGACHIEVE_AchieveLevelRuleCNActivity", "AchieveLevelRuleCNActivity onResume()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LogUtil.a("PLGACHIEVE_AchieveLevelRuleCNActivity", "AchieveLevelRuleCNActivity onPause()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b();
        LogUtil.a("PLGACHIEVE_AchieveLevelRuleCNActivity", "AchieveLevelRuleCNActivity onDestroy");
    }

    private void b() {
        LogUtil.a("PLGACHIEVE_AchieveLevelRuleCNActivity", "destroyWebView");
        if (this.f22076b != null) {
            LogUtil.a("PLGACHIEVE_AchieveLevelRuleCNActivity", "onDestroy destroyWebView");
            ViewParent parent = this.f22076b.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f22076b);
            }
            this.f22076b.destroy();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

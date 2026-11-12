package com.huawei.health.bundleadapter;

import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.huawei.haf.bundle.guide.BundleInstallGuideHolder;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.commonui.base.BaseActivity;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class HealthBundleInstallActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BundleInstallGuideHolder f6250b = new BundleInstallGuideHolder("Bundle_InstallActivity");

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.b("Bundle_InstallActivity", "onCreate");
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setFinishOnTouchOutside(false);
        this.f6250b.c(this);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.b("Bundle_InstallActivity", "onDestroy");
        this.f6250b.a();
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

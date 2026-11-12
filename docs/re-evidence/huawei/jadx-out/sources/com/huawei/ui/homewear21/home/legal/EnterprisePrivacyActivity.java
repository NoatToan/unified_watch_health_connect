package com.huawei.ui.homewear21.home.legal;

import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homewear21.R;
import defpackage.qsp;

/* JADX INFO: loaded from: classes18.dex */
public class EnterprisePrivacyActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_enterprise_privacy);
        c();
    }

    private void c() {
        LogUtil.a("EnterprisePrivacyActivity", "EnterprisePrivacyActivity enter");
        ((CustomTitleBar) qsp.a(this, R.id.privacy_title_bar)).setTitleText(BaseApplication.getContext().getString(R.string.IDS_enterprise_statement));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

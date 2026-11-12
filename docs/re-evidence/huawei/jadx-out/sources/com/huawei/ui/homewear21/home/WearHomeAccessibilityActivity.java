package com.huawei.ui.homewear21.home;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homewear21.R;
import defpackage.eey;
import defpackage.fej;
import defpackage.prf;
import defpackage.thf;
import defpackage.thh;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeAccessibilityActivity extends WearHomeBaseActivity {
    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("WearHomeAccessibilityActivity", "onCreate");
        this.mCustomTitleBar.setTitleText(BaseApplication.getContext().getString(R.string.IDS_settings_accessibility));
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity
    protected void initGeneralList() {
        this.mGeneralList.clear();
        b();
    }

    private void b() {
        boolean zIsSupportEcgAuth = this.mDeviceCapability != null ? this.mDeviceCapability.isSupportEcgAuth() : false;
        boolean z = eey.d(this.mCurrentDeviceInfo, 106) && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ecgce");
        boolean zO = Utils.o();
        LogUtil.a("WearHomeAccessibilityActivity", "showEcgItem isSupportEcgAuth:", Boolean.valueOf(zIsSupportEcgAuth), ", isSupportEcgAnalysis:", Boolean.valueOf(z), ", isOversea:", Boolean.valueOf(zO));
        if (z && zIsSupportEcgAuth && !zO) {
            addGeneralSettingItem(this.mIsConnected, new thh(R.mipmap.ic_setting_ecg, 121, 3), new thf(getString(R.string.IDS_quick_app_ecg), "", ""), new CompoundButton.OnCheckedChangeListener[0]);
        }
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.huawei.ui.homewear21.home.WearHomeBaseActivity
    protected void setItemClick(int i) {
        LogUtil.a("WearHomeAccessibilityActivity", "setItemClick index = ", Integer.valueOf(i), ";size = ", Integer.valueOf(this.mGeneralList.size()));
        if (i >= this.mGeneralList.size()) {
            return;
        }
        if (this.mGeneralList.get(i).b() == 121) {
            prf.d(BaseApplication.getContext(), "com.huawei.health.ecg.collection", 3, (String) null);
        } else {
            LogUtil.j("WearHomeAccessibilityActivity", "setItemClick else branch");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

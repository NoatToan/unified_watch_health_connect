package com.huawei.health.wxapi;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hms.iapfull.IapFullSdkAPI;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/* JADX INFO: loaded from: classes33.dex */
public class WXEntryActivity extends BaseActivity implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IWXAPI f10428b = null;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("R_WXEntryActivity", "onCreate");
        super.onCreate(bundle);
        this.f10428b = WXAPIFactory.createWXAPI(this, "wx36bda3d35fbcfd06");
        b();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        LogUtil.a("R_WXEntryActivity", "onNewIntent");
        super.onNewIntent(intent);
        setIntent(intent);
        b();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        LogUtil.a("R_WXEntryActivity", "onReq");
        if (IapFullSdkAPI.handleWXSignResult(this, baseReq)) {
            ReleaseLogUtil.c("R_WXEntryActivity", "handleWXSignResult");
        }
        finish();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        ReleaseLogUtil.c("R_WXEntryActivity", "onResp");
        finish();
    }

    private void b() {
        IWXAPI iwxapi = this.f10428b;
        if (iwxapi == null) {
            ReleaseLogUtil.c("R_WXEntryActivity", "WXEntryActivity mApi is null.");
            finish();
            return;
        }
        try {
            if (iwxapi.handleIntent(getIntent(), this)) {
                return;
            }
            ReleaseLogUtil.e("R_WXEntryActivity", "there is some parameter illegal");
            finish();
        } catch (Exception e) {
            ReleaseLogUtil.e("R_WXEntryActivity", "An unKnow exception was caught in wxApi", e.getMessage());
            finish();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

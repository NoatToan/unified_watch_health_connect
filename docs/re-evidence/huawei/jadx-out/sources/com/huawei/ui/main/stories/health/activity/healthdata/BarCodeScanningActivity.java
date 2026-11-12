package com.huawei.ui.main.stories.health.activity.healthdata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.gsm;
import defpackage.qrs;

/* JADX INFO: loaded from: classes3.dex */
public class BarCodeScanningActivity extends BaseActivity {
    private Context e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = this;
        a();
    }

    private void a() {
        LogUtil.a("BarCodeScanningActivity", "startBarCodeScan");
        gsm.b(this, 1001);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            if (i2 != -1) {
                LogUtil.e("BarCodeScanningActivity", "scan failed...");
                finish();
                return;
            }
            int iC = gsm.c(intent);
            LogUtil.a("BarCodeScanningActivity", "status code from scanKit: " + iC);
            if (iC == 0) {
                String strB = gsm.b(intent);
                LogUtil.a("BarCodeScanningActivity", "scan success, result: " + strB);
                setResult(-1, new Intent().putExtra("result", strB));
            } else if (iC == 2) {
                LogUtil.j("BarCodeScanningActivity", "aborting, no Storage permission...");
                qrs.e((Activity) this, 1001);
            }
        }
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

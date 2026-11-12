package com.huawei.ui.device.activity.pairing;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.BuildConfig;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.watchface.api.HwWatchFaceManager;
import defpackage.mgh;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class VerifyAccountActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReleaseLogUtil.d("VerifyAccountActivity", "onCreate");
        Window window = getWindow();
        window.setFlags(67108864, 67108864);
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = 0;
        attributes.height = 0;
        onWindowAttributesChanged(attributes);
        b();
    }

    private void b() {
        if (CommonUtil.z(BaseApplication.b())) {
            c();
        } else {
            e();
        }
    }

    private void c() {
        String str;
        if (!TextUtils.equals(LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1019), "2")) {
            str = "0";
        } else {
            str = "1";
        }
        ThirdPartyLoginManager.getInstance().checkUserPassword(this, str, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.pairing.VerifyAccountActivity.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_VerifyAccountActivity", "check pass : ", Integer.valueOf(i));
                if (i == 0) {
                    VerifyAccountActivity.this.setResult(-1);
                } else {
                    VerifyAccountActivity.this.setResult(0);
                }
                VerifyAccountActivity.this.finish();
            }
        });
    }

    private void e() {
        int i = TextUtils.equals(LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1019), "2") ? 3 : 0;
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(HwWatchFaceManager.VERIFY_PASSWORD_URI));
            intent.setPackage(HMSPackageManager.getInstance(BaseApplication.b()).getHMSPackageName());
            intent.putExtra("VERIFY_PWD_TYPE", i);
            intent.putExtra("callingpackage", BaseApplication.d());
            intent.putExtra(HwWatchFaceManager.CLIENT_ID, String.valueOf(BuildConfig.HMS_APPLICATION_ID));
            startActivityForResult(intent, 10006);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("VerifyAccountActivity", "startAccount, activity is not found");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ReleaseLogUtil.d("R_VerifyAccountActivity", "onActivityResult requestCode=", Integer.valueOf(i), "resultCode=", Integer.valueOf(i2));
        if (i != 10006) {
            return;
        }
        mgh.a(i2, intent, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.pairing.VerifyAccountActivity.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                ReleaseLogUtil.d("R_VerifyAccountActivity", "verify account code :", Integer.valueOf(i3));
                if (i3 == 0) {
                    VerifyAccountActivity.this.setResult(-1);
                } else {
                    VerifyAccountActivity.this.setResult(0);
                }
                VerifyAccountActivity.this.finish();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("VerifyAccountActivity", "onDestroy :");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

package com.huawei.watchface.mvp.ui.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.pay.HuaweiPay;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.watchface.g3;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes45.dex */
public class HMSPayAgentActivity extends BaseAgentActivity {
    public static final int DESTORY_CODE = 10086;
    private static final int REQUEST_PAY = 2000;
    public static final String TAG = "HMSPayAgentActivity";

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SafeIntent safeIntent = new SafeIntent(intent);
        HwLog.i(TAG, "resultCode=" + i2);
        if (i == 2000) {
            if (i2 == -1) {
                PayResultInfo payResultInfoFromIntent = HuaweiPay.HuaweiPayApi.getPayResultInfoFromIntent(safeIntent);
                if (payResultInfoFromIntent != null) {
                    g3.b().a(payResultInfoFromIntent.getReturnCode(), payResultInfoFromIntent);
                } else {
                    HwLog.e(TAG, "payResultInfo is null");
                    g3.b().a(-1, (PayResultInfo) null);
                }
            } else {
                g3.b().a(-1, (PayResultInfo) null);
            }
            finish();
        }
    }

    @Override // com.huawei.watchface.mvp.ui.activity.BaseAgentActivity, com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Status statusD = g3.b().d();
        if (statusD != null) {
            try {
                HwLog.i(TAG, "start pay:statusForPay");
                statusD.startResolutionForResult(this, 2000);
            } catch (Exception e) {
                HwLog.e(TAG, "start activity error:" + HwLog.printException(e));
                g3.b().a(-1, (PayResultInfo) null);
                finish();
            }
        } else {
            HwLog.e(TAG, "statusForPay is null");
            g3.b().a(-1, (PayResultInfo) null);
            finish();
        }
        g3.b().c();
    }

    @Override // com.huawei.secure.android.common.activity.SafeFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        g3.b().a(10086, (PayResultInfo) null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

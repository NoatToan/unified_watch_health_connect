package com.huawei.health.tradeservice.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.tradeservice.R;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iap.entity.RedeemCodeResultInfo;
import com.huawei.hms.iap.entity.ScanRedeemCodeResult;
import com.huawei.ui.commonui.base.BaseActivity;
import health.compact.a.LogUtil;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes2.dex */
public class RedeemCodeScanActivity extends BaseActivity {
    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    private void d() {
        Iap.getIapClient((Activity) this).scanRedeemCode().addOnSuccessListener(new OnSuccessListener() { // from class: ilk
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f37777b.a((ScanRedeemCodeResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: ilj
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f37776c.c(exc);
            }
        });
        overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
    }

    public /* synthetic */ void a(ScanRedeemCodeResult scanRedeemCodeResult) {
        if (scanRedeemCodeResult != null) {
            scanRedeemCodeResult.startActivityForResult(this, 20230330);
            LogUtil.b("RedeemCodeScanActivity", "start iap redeem scan activity success");
        }
    }

    public /* synthetic */ void c(Exception exc) {
        if (exc instanceof IapApiException) {
            LogUtil.d("RedeemCodeScanActivity", "start iap redeem scan activity failed, iap throws exception, code: " + ((IapApiException) exc).getStatusCode());
        } else {
            LogUtil.d("RedeemCodeScanActivity", "start iap redeem scan activity failed, e:" + exc);
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String redeemCode;
        super.onActivityResult(i, i2, intent);
        if (i == 20230330) {
            RedeemCodeResultInfo redeemCodeResultInfoFromIntent = Iap.getIapClient((Activity) this).parseRedeemCodeResultInfoFromIntent(intent);
            int returnCode = redeemCodeResultInfoFromIntent.getReturnCode();
            LogUtil.b("RedeemCodeScanActivity", "Iap redeem scan finished, redeemReturnCode: " + returnCode);
            if (returnCode == -1) {
                redeemCode = EventType.FAILED;
            } else if (returnCode == 0) {
                redeemCode = redeemCodeResultInfoFromIntent.getRedeemCode();
            } else if (returnCode == 60000) {
                redeemCode = "cancel";
            } else if (returnCode == 70000) {
                redeemCode = "not_support";
            } else {
                LogUtil.b("RedeemCodeScanActivity", "unexpected error code from iap, do nothing");
                redeemCode = null;
            }
            setResult(-1, new Intent().putExtra("result", redeemCode));
        }
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

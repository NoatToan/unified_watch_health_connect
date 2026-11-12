package com.braintreepayments.api;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hms.iapfull.n0;
import com.huawei.hms.iapfull.webpay.thirdpay.PaypalActivity;
import com.huawei.hms.iapfull.y0;
import com.huawei.secure.android.common.intent.SafeIntent;

/* JADX INFO: loaded from: classes21.dex */
public class BraintreeBrowserSwitchActivity extends n0 {
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        y0.b("BraintreeBrowserSwitchActivity", "onNewIntent");
        setIntent(intent);
    }

    @Override // com.huawei.hms.iapfull.n0, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        y0.b("BraintreeBrowserSwitchActivity", "Braintree onCreate");
        super.onCreate(bundle);
        SafeIntent safeIntent = new SafeIntent(getIntent());
        if (!b(safeIntent)) {
            safeIntent.setClass(this, PaypalActivity.class);
            startActivity(safeIntent);
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    private boolean b(Intent intent) {
        try {
            intent.getStringExtra("ANYTHING");
            return false;
        } catch (Exception unused) {
            return true;
        }
    }
}

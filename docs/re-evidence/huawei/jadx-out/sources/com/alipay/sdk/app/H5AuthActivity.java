package com.alipay.sdk.app;

import android.content.res.Configuration;
import com.huawei.haf.language.LanguageInstallHelper;

/* JADX INFO: loaded from: classes4.dex */
public class H5AuthActivity extends H5PayActivity {
    @Override // com.alipay.sdk.app.H5PayActivity
    public void c() {
        Object obj = AuthTask.f2060c;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

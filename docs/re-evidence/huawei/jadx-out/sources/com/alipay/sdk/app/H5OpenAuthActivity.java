package com.alipay.sdk.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.operation.utils.Constants;
import defpackage.mu;
import defpackage.on;

/* JADX INFO: loaded from: classes21.dex */
public class H5OpenAuthActivity extends H5PayActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2065b = false;

    @Override // com.alipay.sdk.app.H5PayActivity
    public void c() {
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        if (this.f2065b) {
            try {
                on onVarD = on.b.d(getIntent());
                if (onVarD != null) {
                    mu.b(this, onVarD, "", onVarD.f44353a);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            on onVarD = on.b.d(intent);
            try {
                super.startActivity(intent);
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || !data.toString().startsWith("alipays://platformapi/startapp")) {
                    return;
                }
                finish();
            } catch (Throwable th) {
                String string = (intent == null || intent.getData() == null) ? Constants.NULL : intent.getData().toString();
                if (onVarD != null) {
                    mu.e(onVarD, "biz", "StartActivityEx", th, string);
                }
                this.f2065b = true;
                throw th;
            }
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

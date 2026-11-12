package com.alipay.sdk.app;

import android.content.Intent;
import android.net.Uri;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class H5OpenAuthActivity extends H5PayActivity {
    public boolean h = false;

    @Override // com.alipay.sdk.app.H5PayActivity
    public void a() {
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        if (this.h) {
            try {
                com.alipay.sdk.sys.a aVarA = com.alipay.sdk.sys.a.C0120a.a(getIntent());
                if (aVarA != null) {
                    com.alipay.sdk.app.statistic.a.g(this, aVarA, "", aVarA.d);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            com.alipay.sdk.sys.a aVarA = com.alipay.sdk.sys.a.C0120a.a(intent);
            if (aVarA == null) {
                finish();
                return;
            }
            try {
                super.startActivity(intent);
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || !data.toString().startsWith("alipays://platformapi/startapp")) {
                    return;
                }
                finish();
            } catch (Throwable th) {
                com.alipay.sdk.app.statistic.a.e(aVarA, "biz", "StartActivityEx", th, (intent == null || intent.getData() == null) ? AbstractJsonLexerKt.NULL : intent.getData().toString());
                this.h = true;
                throw th;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}

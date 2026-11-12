package com.alipay.sdk.app;

import android.content.Intent;
import android.net.Uri;
import com.google.maps.android.BuildConfig;
import lh.a;

/* JADX INFO: loaded from: classes7.dex */
public class H5OpenAuthActivity extends H5PayActivity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28407i = false;

    @Override // com.alipay.sdk.app.H5PayActivity
    public final void a() {
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public final void onDestroy() {
        if (this.f28407i) {
            try {
                a aVarA = a.C2158a.a(getIntent());
                if (aVarA != null) {
                    wg.a.f("", aVarA.f112379d, this, aVarA);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        try {
            a aVarA = a.C2158a.a(intent);
            try {
                super.startActivity(intent);
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || !data.toString().startsWith("alipays://platformapi/startapp")) {
                    return;
                }
                finish();
            } catch (Throwable th3) {
                String string = (intent == null || intent.getData() == null) ? BuildConfig.TRAVIS : intent.getData().toString();
                if (aVarA != null) {
                    wg.a.e(aVarA, "StartActivityEx", th3, string);
                }
                this.f28407i = true;
                throw th3;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}

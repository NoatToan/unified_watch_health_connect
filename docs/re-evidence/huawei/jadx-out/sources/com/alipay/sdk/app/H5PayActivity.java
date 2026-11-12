package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.alipay.sdk.m.a0.c;
import com.alipay.sdk.m.l.d;
import com.huawei.haf.language.LanguageInstallHelper;
import defpackage.mp;
import defpackage.mu;
import defpackage.mx;
import defpackage.on;
import defpackage.oq;
import defpackage.ox;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class H5PayActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2066a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2067c;
    public String d;
    public c e;
    public String f = null;
    public WeakReference<on> g;
    public boolean h;
    public String i;
    public String j;

    public void c() {
        Object obj = PayTask.h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    public final void e() {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable th) {
            oq.c(th);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        c();
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1010) {
            d.c((on) ox.e(this.g), i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c cVar = this.e;
        if (cVar == null) {
            finish();
            return;
        }
        if (cVar.a()) {
            cVar.b();
            return;
        }
        if (!cVar.b()) {
            super.onBackPressed();
        }
        mp.e(mp.d());
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        e();
        super.onCreate(bundle);
        try {
            on onVarD = on.b.d(getIntent());
            if (onVarD == null) {
                finish();
                return;
            }
            this.g = new WeakReference<>(onVarD);
            if (mx.c().ad()) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.d = string;
                if (!ox.g(string)) {
                    finish();
                    return;
                }
                this.f2067c = extras.getString("cookie", null);
                this.f2066a = extras.getString("method", null);
                this.i = extras.getString("title", null);
                this.j = extras.getString("version", "v1");
                this.h = extras.getBoolean("backisexit", false);
                this.f = extras.getString("cashierBizData", "");
                try {
                    com.alipay.sdk.m.a0.d dVar = new com.alipay.sdk.m.a0.d(this, onVarD, this.j);
                    setContentView(dVar);
                    dVar.a(this.i, this.f2066a, this.h);
                    dVar.setCashierBizData(this.f);
                    dVar.a(this.d, this.f2067c);
                    dVar.a(this.d);
                    this.e = dVar;
                } catch (Throwable th) {
                    mu.c(onVarD, "biz", "GetInstalledAppEx", th);
                    finish();
                }
            } catch (Exception unused) {
                finish();
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.e;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            try {
                mu.c((on) ox.e(this.g), "biz", "H5PayDataAnalysisError", th);
            } catch (Throwable unused) {
            }
        }
    }
}

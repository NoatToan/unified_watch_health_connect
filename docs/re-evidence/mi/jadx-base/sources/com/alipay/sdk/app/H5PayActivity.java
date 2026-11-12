package com.alipay.sdk.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.alipay.sdk.util.k;
import com.alipay.sdk.widget.d;

/* JADX INFO: loaded from: classes.dex */
public class H5PayActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.alipay.sdk.widget.c f5800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5801b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public String g;

    public void a() {
        Object obj = PayTask.h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    public final void b() {
        try {
            super.requestWindowFeature(1);
        } catch (Throwable th) {
            com.alipay.sdk.util.c.d(th);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        a();
        super.finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.alipay.sdk.widget.c cVar = this.f5800a;
        if (cVar == null) {
            finish();
            return;
        }
        if (cVar.n()) {
            cVar.m();
            return;
        }
        if (!cVar.m()) {
            super.onBackPressed();
        }
        b.c(b.f());
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        b();
        super.onCreate(bundle);
        try {
            com.alipay.sdk.sys.a aVarA = com.alipay.sdk.sys.a.C0120a.a(getIntent());
            if (aVarA == null) {
                finish();
                return;
            }
            if (com.alipay.sdk.data.a.w().i()) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.f5801b = string;
                if (!k.B(string)) {
                    finish();
                    return;
                }
                this.d = extras.getString("cookie", null);
                this.c = extras.getString("method", null);
                this.e = extras.getString("title", null);
                this.g = extras.getString("version", "v1");
                this.f = extras.getBoolean("backisexit", false);
                try {
                    d dVar = new d(this, aVarA, this.g);
                    setContentView(dVar);
                    dVar.r(this.e, this.c, this.f);
                    dVar.l(this.f5801b, this.d);
                    dVar.p(this.f5801b);
                    this.f5800a = dVar;
                } catch (Throwable th) {
                    com.alipay.sdk.app.statistic.a.d(aVarA, "biz", "GetInstalledAppEx", th);
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
        com.alipay.sdk.widget.c cVar = this.f5800a;
        if (cVar != null) {
            cVar.j();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            try {
                com.alipay.sdk.app.statistic.a.d(com.alipay.sdk.sys.a.C0120a.a(getIntent()), "biz", "H5PayDataAnalysisError", th);
            } catch (Throwable unused) {
            }
        }
    }
}

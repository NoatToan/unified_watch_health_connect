package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import defpackage.mp;
import defpackage.mu;
import defpackage.on;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class APayEntranceActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f2057c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public on f2058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2059b;
    public String e;

    public interface a {
        void a(String str);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.e;
        mu.d(this.f2058a, "biz", "BSAFinish", str + "|" + TextUtils.isEmpty(this.f2059b));
        if (TextUtils.isEmpty(this.f2059b)) {
            this.f2059b = mp.d();
            on onVar = this.f2058a;
            if (onVar != null) {
                onVar.d(true);
            }
        }
        if (str != null) {
            a aVarRemove = f2057c.remove(str);
            if (aVarRemove != null) {
                aVarRemove.a(this.f2059b);
            } else {
                mu.e(this.f2058a, "wr", "refNull", "session=" + str);
            }
        }
        try {
            super.finish();
        } catch (Throwable th) {
            mu.c(this.f2058a, "wr", "APStartFinish", th);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mu.d(this.f2058a, "biz", "BSAOnAR", this.e + "|" + i + "," + i2);
        if (i == 1000) {
            if (intent != null) {
                try {
                    this.f2059b = intent.getStringExtra("result");
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString("ap_order_info");
            String string2 = extras.getString("ap_target_packagename");
            this.e = extras.getString("ap_session");
            String string3 = extras.getString("ap_local_info", "{}");
            if (!TextUtils.isEmpty(this.e)) {
                on onVarB = on.b.b(this.e);
                this.f2058a = onVarB;
                mu.d(onVarB, "biz", "BSAEntryCreate", this.e + "|" + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th) {
                mu.c(this.f2058a, "wr", "APStartEx", th);
                finish();
            }
            if (this.f2058a != null) {
                Context applicationContext = getApplicationContext();
                on onVar = this.f2058a;
                mu.d(applicationContext, onVar, string, onVar.f44353a);
                this.f2058a.e(true);
            }
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

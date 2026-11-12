package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import defpackage.mp;
import defpackage.mu;
import defpackage.on;
import defpackage.oq;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class PayResultActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<String, Object> f2069a = new HashMap<>();
    public on e = null;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static volatile String f2070b;
        public static volatile String d;
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f2071b;

        public d(Activity activity) {
            this.f2071b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2071b.finish();
        }
    }

    public static void a(Activity activity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent();
        try {
            intent.setPackage("hk.alipay.wallet");
            intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
        } catch (UnsupportedEncodingException e) {
            oq.c(e);
        }
        if (activity != null) {
            try {
                activity.startActivity(intent);
            } catch (Throwable unused) {
                activity.finish();
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra("orderSuffix"))) {
                a.d = intent.getStringExtra("phonecashier.pay.hash");
                String stringExtra = intent.getStringExtra("orderSuffix");
                String stringExtra2 = intent.getStringExtra("externalPkgName");
                on onVarD = on.b.d(intent);
                this.e = onVarD;
                if (onVarD == null) {
                    finish();
                }
                a(this, a.d, stringExtra, stringExtra2);
                a(this, 300);
                return;
            }
            if (this.e == null) {
                finish();
            }
            String stringExtra3 = intent.getStringExtra("phonecashier.pay.result");
            int intExtra = intent.getIntExtra("phonecashier.pay.resultOrderHash", 0);
            if (intExtra != 0 && TextUtils.equals(a.d, String.valueOf(intExtra))) {
                if (TextUtils.isEmpty(stringExtra3)) {
                    e(a.d);
                } else {
                    e(stringExtra3, a.d);
                }
                a.d = "";
                a(this, 300);
                return;
            }
            mu.e(this.e, "biz", "SchemePayWrongHashEx", "Expected " + a.d + ", got " + intExtra);
            e(a.d);
            a(this, 300);
        } catch (Throwable unused) {
            finish();
        }
    }

    public static void e(String str) {
        a.f2070b = mp.d();
        e(f2069a, str);
    }

    public static void e(String str, String str2) {
        a.f2070b = str;
        e(f2069a, str2);
    }

    public static void a(Activity activity, int i) {
        new Handler().postDelayed(new d(activity), i);
    }

    public static boolean e(HashMap<String, Object> map, String str) {
        Object obj;
        if (map == null || str == null || (obj = map.get(str)) == null) {
            return false;
        }
        synchronized (obj) {
            obj.notifyAll();
        }
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}

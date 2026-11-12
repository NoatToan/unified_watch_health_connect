package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class PayResultActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, Object> f5807b = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.alipay.sdk.sys.a f5808a = null;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile String f5810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static volatile String f5811b;
    }

    public static void a(final Activity activity, int i) {
        new Handler().postDelayed(new Runnable() { // from class: com.alipay.sdk.app.PayResultActivity.1
            @Override // java.lang.Runnable
            public void run() {
                activity.finish();
            }
        }, i);
    }

    public static void b(Activity activity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent();
        try {
            intent.setPackage("hk.alipay.wallet");
            intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
        } catch (UnsupportedEncodingException e) {
            com.alipay.sdk.util.c.d(e);
        }
        if (activity != null) {
            try {
                activity.startActivity(intent);
            } catch (Throwable unused) {
                activity.finish();
            }
        }
    }

    public static void c(String str) {
        a.f5811b = b.f();
        e(f5807b, str);
    }

    public static void d(String str, String str2) {
        a.f5811b = str;
        e(f5807b, str2);
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

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra("orderSuffix"))) {
                a.f5810a = intent.getStringExtra("phonecashier.pay.hash");
                String stringExtra = intent.getStringExtra("orderSuffix");
                String stringExtra2 = intent.getStringExtra("externalPkgName");
                com.alipay.sdk.sys.a aVarA = com.alipay.sdk.sys.a.C0120a.a(intent);
                this.f5808a = aVarA;
                if (aVarA == null) {
                    finish();
                }
                b(this, a.f5810a, stringExtra, stringExtra2);
                a(this, 300);
                return;
            }
            if (this.f5808a == null) {
                finish();
            }
            String stringExtra3 = intent.getStringExtra("phonecashier.pay.result");
            int intExtra = intent.getIntExtra("phonecashier.pay.resultOrderHash", 0);
            if (intExtra != 0 && TextUtils.equals(a.f5810a, String.valueOf(intExtra))) {
                if (TextUtils.isEmpty(stringExtra3)) {
                    c(a.f5810a);
                } else {
                    d(stringExtra3, a.f5810a);
                }
                a.f5810a = "";
                a(this, 300);
                return;
            }
            com.alipay.sdk.app.statistic.a.c(this.f5808a, "biz", "SchemePayWrongHashEx", "Expected " + a.f5810a + ", got " + intExtra);
            c(a.f5810a);
            a(this, 300);
        } catch (Throwable unused) {
            finish();
        }
    }
}

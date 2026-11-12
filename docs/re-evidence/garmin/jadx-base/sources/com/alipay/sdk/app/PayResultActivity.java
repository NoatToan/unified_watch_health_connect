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
import nh.d;
import ug.b;

/* JADX INFO: loaded from: classes7.dex */
public final class PayResultActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, Object> f28416b = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lh.a f28417a = null;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile String f28418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static volatile String f28419b;
    }

    public static void a(PayResultActivity payResultActivity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent();
        try {
            intent.setPackage("hk.alipay.wallet");
            intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
        } catch (UnsupportedEncodingException e4) {
            d.a(e4);
        }
        try {
            payResultActivity.startActivity(intent);
        } catch (Throwable unused) {
            payResultActivity.finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        Object obj2;
        Object obj3;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra("orderSuffix"))) {
                a.f28418a = intent.getStringExtra("phonecashier.pay.hash");
                String stringExtra = intent.getStringExtra("orderSuffix");
                String stringExtra2 = intent.getStringExtra("externalPkgName");
                lh.a aVarA = lh.a.C2158a.a(intent);
                this.f28417a = aVarA;
                if (aVarA == null) {
                    finish();
                }
                a(this, a.f28418a, stringExtra, stringExtra2);
                new Handler().postDelayed(new fg.d(this), 300);
                return;
            }
            if (this.f28417a == null) {
                finish();
            }
            String stringExtra3 = intent.getStringExtra("phonecashier.pay.result");
            int intExtra = intent.getIntExtra("phonecashier.pay.resultOrderHash", 0);
            if (intExtra == 0 || !TextUtils.equals(a.f28418a, String.valueOf(intExtra))) {
                wg.a.g(this.f28417a, "biz", "SchemePayWrongHashEx", "Expected " + a.f28418a + ", got " + intExtra);
                String str = a.f28418a;
                a.f28419b = b.a();
                HashMap<String, Object> map = f28416b;
                if (map != null && str != null && (obj = map.get(str)) != null) {
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
                new Handler().postDelayed(new fg.d(this), 300);
                return;
            }
            if (TextUtils.isEmpty(stringExtra3)) {
                String str2 = a.f28418a;
                a.f28419b = b.a();
                HashMap<String, Object> map2 = f28416b;
                if (map2 != null && str2 != null && (obj2 = map2.get(str2)) != null) {
                    synchronized (obj2) {
                        obj2.notifyAll();
                    }
                }
            } else {
                String str3 = a.f28418a;
                a.f28419b = stringExtra3;
                HashMap<String, Object> map3 = f28416b;
                if (map3 != null && str3 != null && (obj3 = map3.get(str3)) != null) {
                    synchronized (obj3) {
                        obj3.notifyAll();
                    }
                }
            }
            a.f28418a = "";
            new Handler().postDelayed(new fg.d(this), 300);
            return;
            finish();
        } catch (Throwable unused) {
            finish();
        }
    }
}

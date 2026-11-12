package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.mibi.sdk.common.CommonConstants;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AlipayResultActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f5795a = new ConcurrentHashMap<>();

    public interface a {
        void a(int i, String str, String str2);
    }

    public final void a(String str, Bundle bundle) {
        a aVarRemove = f5795a.remove(str);
        if (aVarRemove == null) {
            finish();
            return;
        }
        try {
            aVarRemove.a(bundle.getInt("endCode"), bundle.getString("memo"), bundle.getString("result"));
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            try {
                String stringExtra = intent.getStringExtra(CommonConstants.KEY_SESSION);
                Bundle bundleExtra = intent.getBundleExtra("result");
                String stringExtra2 = intent.getStringExtra("scene");
                com.alipay.sdk.sys.a aVarB = com.alipay.sdk.sys.a.C0120a.b(stringExtra);
                if (aVarB == null) {
                    finish();
                    return;
                }
                com.alipay.sdk.app.statistic.a.h(aVarB, "biz", "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    a(stringExtra, bundleExtra);
                    return;
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        stringExtra = jSONObject.getString(CommonConstants.KEY_SESSION);
                        com.alipay.sdk.app.statistic.a.h(aVarB, "biz", "BSPUriSession", stringExtra);
                        Bundle bundle2 = new Bundle();
                        try {
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                bundle2.putString(next, jSONObject2.getString(next));
                            }
                            bundleExtra = bundle2;
                        } catch (Throwable th) {
                            th = th;
                            bundleExtra = bundle2;
                            com.alipay.sdk.app.statistic.a.d(aVarB, "biz", "BSPResEx", th);
                            com.alipay.sdk.app.statistic.a.d(aVarB, "biz", "ParseSchemeQueryError", th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    com.alipay.sdk.app.statistic.a.g(this, aVarB, "", aVarB.d);
                    finish();
                    return;
                }
                try {
                    com.alipay.sdk.app.statistic.a.h(aVarB, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.app.statistic.a.h(aVarB, "biz", "PgReturnV", bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString("memo", "-"));
                    OpenAuthTask.b(stringExtra, 9000, "OK", bundleExtra);
                } finally {
                    com.alipay.sdk.app.statistic.a.g(this, aVarB, "", aVarB.d);
                    finish();
                }
            } catch (Throwable th3) {
                com.alipay.sdk.app.statistic.a.d(null, "biz", "BSPSerError", th3);
                com.alipay.sdk.app.statistic.a.d(null, "biz", "ParseBundleSerializableError", th3);
                finish();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}

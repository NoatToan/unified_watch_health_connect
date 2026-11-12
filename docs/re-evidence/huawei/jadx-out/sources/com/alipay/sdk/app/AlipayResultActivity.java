package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.TagConstants;
import defpackage.mu;
import defpackage.on;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AlipayResultActivity extends Activity {
    public static final ConcurrentHashMap<String, a> e = new ConcurrentHashMap<>();

    public interface a {
        void a(int i, String str, String str2);
    }

    public final void c(String str, Bundle bundle) {
        a aVarRemove = e.remove(str);
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
        Throwable th;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            try {
                String stringExtra = intent.getStringExtra("session");
                Bundle bundleExtra = intent.getBundleExtra("result");
                String stringExtra2 = intent.getStringExtra(TagConstants.SCENE_TYPE);
                on onVarB = on.b.b(stringExtra);
                if (onVarB == null) {
                    finish();
                    return;
                }
                mu.d(onVarB, "biz", "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    c(stringExtra, bundleExtra);
                    return;
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        stringExtra = jSONObject.getString("session");
                        mu.d(onVarB, "biz", "BSPUriSession", stringExtra);
                        Bundle bundle2 = new Bundle();
                        try {
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                bundle2.putString(next, jSONObject2.getString(next));
                            }
                            bundleExtra = bundle2;
                        } catch (Throwable th2) {
                            th = th2;
                            bundleExtra = bundle2;
                            mu.c(onVarB, "biz", "BSPResEx", th);
                            mu.c(onVarB, "biz", "ParseSchemeQueryError", th);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    mu.b(this, onVarB, "", onVarB.f44353a);
                    finish();
                    return;
                }
                try {
                    mu.d(onVarB, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                    mu.d(onVarB, "biz", "PgReturnV", bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString("memo", Constants.LINK));
                    OpenAuthTask.c(stringExtra, 9000, "OK", bundleExtra);
                } finally {
                    mu.b(this, onVarB, "", onVarB.f44353a);
                    finish();
                }
            } catch (Throwable th4) {
                mu.c(null, "biz", "BSPSerError", th4);
                mu.c(null, "biz", "ParseBundleSerializableError", th4);
                finish();
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

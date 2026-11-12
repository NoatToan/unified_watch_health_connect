package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import fg.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import nh.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class AlipayResultActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f28403a = new ConcurrentHashMap<>();

    public interface a {
        void a();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Throwable th3;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            lh.a aVarRemove = null;
            try {
                String stringExtra = intent.getStringExtra("session");
                Bundle bundleExtra = intent.getBundleExtra("result");
                String stringExtra2 = intent.getStringExtra("scene");
                HashMap<UUID, lh.a> map = lh.a.C2158a.f112387a;
                if (!TextUtils.isEmpty(stringExtra)) {
                    aVarRemove = lh.a.C2158a.f112388b.remove(stringExtra);
                }
                if (aVarRemove == null) {
                    finish();
                    return;
                }
                String str = aVarRemove.f112379d;
                wg.a.c(aVarRemove, "biz", "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    a aVarRemove2 = f28403a.remove(stringExtra);
                    if (aVarRemove2 == null) {
                        finish();
                        return;
                    }
                    try {
                        bundleExtra.getInt("endCode");
                        bundleExtra.getString("memo");
                        bundleExtra.getString("result");
                        aVarRemove2.a();
                        return;
                    } finally {
                        finish();
                    }
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        stringExtra = jSONObject.getString("session");
                        wg.a.c(aVarRemove, "biz", "BSPUriSession", stringExtra);
                        Bundle bundle2 = new Bundle();
                        try {
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                bundle2.putString(next, jSONObject2.getString(next));
                            }
                            bundleExtra = bundle2;
                        } catch (Throwable th4) {
                            th3 = th4;
                            bundleExtra = bundle2;
                            wg.a.d(aVarRemove, "biz", "BSPResEx", th3);
                            wg.a.d(aVarRemove, "biz", "ParseSchemeQueryError", th3);
                        }
                    } catch (Throwable th5) {
                        th3 = th5;
                    }
                }
                if (TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    wg.a.f("", str, this, aVarRemove);
                    finish();
                    return;
                }
                try {
                    wg.a.c(aVarRemove, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                    wg.a.c(aVarRemove, "biz", "PgReturnV", bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString("memo", "-"));
                    c.a aVar = (c.a) c.f71203a.remove(stringExtra);
                    if (aVar != null) {
                        try {
                            aVar.a();
                        } catch (Throwable th6) {
                            d.a(th6);
                        }
                    }
                    wg.a.f("", str, this, aVarRemove);
                    finish();
                    return;
                } catch (Throwable th7) {
                    wg.a.f("", str, this, aVarRemove);
                    finish();
                    throw th7;
                }
                finish();
            } catch (Throwable th8) {
                wg.a.d(null, "biz", "BSPSerError", th8);
                wg.a.d(null, "biz", "ParseBundleSerializableError", th8);
                finish();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}

package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.u.l;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.google.firebase.crashlytics.internal.settings.b;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AlipayResultActivity extends Activity {
    public static final ConcurrentHashMap<String, a> a = new ConcurrentHashMap<>();

    public interface a {
        void a(int i, String str, String str2);
    }

    private void a(String str, Bundle bundle) {
        a aVarRemove = a.remove(str);
        if (aVarRemove == null) {
            finish();
            return;
        }
        try {
            aVarRemove.a(bundle.getInt("endCode"), bundle.getString(l.b), bundle.getString("result"));
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
                String stringExtra = intent.getStringExtra(b.c);
                Bundle bundleExtra = intent.getBundleExtra("result");
                String stringExtra2 = intent.getStringExtra("scene");
                com.alipay.sdk.m.s.a aVarA = com.alipay.sdk.m.s.a.C0094a.a(stringExtra);
                if (aVarA == null) {
                    finish();
                    return;
                }
                com.alipay.sdk.m.k.a.a(aVarA, com.alipay.sdk.m.k.b.l, "BSPSession", stringExtra + AESEncryptionHelper.SEPARATOR + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    a(stringExtra, bundleExtra);
                    return;
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        stringExtra = jSONObject.getString(b.c);
                        com.alipay.sdk.m.k.a.a(aVarA, com.alipay.sdk.m.k.b.l, "BSPUriSession", stringExtra);
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
                            com.alipay.sdk.m.k.a.a(aVarA, com.alipay.sdk.m.k.b.l, "BSPResEx", th);
                            com.alipay.sdk.m.k.a.a(aVarA, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.o0, th);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    com.alipay.sdk.m.k.a.b(this, aVarA, "", aVarA.d);
                    finish();
                    return;
                }
                try {
                    com.alipay.sdk.m.k.a.a(aVarA, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.U, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.k.a.a(aVarA, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.V, bundleExtra.getInt("endCode", -1) + AESEncryptionHelper.SEPARATOR + bundleExtra.getString(l.b, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
                    OpenAuthTask.a(stringExtra, OpenAuthTask.OK, "OK", bundleExtra);
                } finally {
                    com.alipay.sdk.m.k.a.b(this, aVarA, "", aVarA.d);
                    finish();
                }
            } catch (Throwable th4) {
                com.alipay.sdk.m.k.a.a((com.alipay.sdk.m.s.a) null, com.alipay.sdk.m.k.b.l, "BSPSerError", th4);
                com.alipay.sdk.m.k.a.a((com.alipay.sdk.m.s.a) null, com.alipay.sdk.m.k.b.l, com.alipay.sdk.m.k.b.n0, th4);
                finish();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}

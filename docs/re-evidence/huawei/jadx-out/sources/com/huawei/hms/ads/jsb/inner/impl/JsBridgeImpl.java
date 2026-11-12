package com.huawei.hms.ads.jsb.inner.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.jsb.JsbConfig;
import com.huawei.openalliance.ad.g;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.j;
import com.huawei.openalliance.ad.m;
import com.huawei.openalliance.ad.utils.ds;
import com.huawei.openalliance.ad.utils.o;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class JsBridgeImpl {
    public static void invoke(Context context, String str, String str2, RemoteCallResultCallback<String> remoteCallResultCallback, Class<String> cls) throws IllegalAccessException, InstantiationException {
        if (context == null || TextUtils.isEmpty(str2)) {
            hw.d("JsBridgeImpl", "param is invalid, please check it!");
            j.a(remoteCallResultCallback, str, 1001, null, true);
            return;
        }
        g gVarA = m.a().a(str);
        o.a aVarA = o.a.IO;
        if (gVarA != null) {
            aVarA = gVarA.a();
            if (context instanceof Activity) {
                gVarA.a((Activity) context);
            }
        }
        o.a(new a(context.getApplicationContext(), gVarA, str, str2, remoteCallResultCallback), aVarA, false);
    }

    public static String invoke(Context context, String str, String str2) {
        Object objA;
        JSONObject jSONObject = new JSONObject();
        int i = 1011;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    g gVarA = m.a().a(str);
                    if (gVarA != null) {
                        hw.b("JsBridgeImpl", "call api: " + str);
                        objA = gVarA.a(context.getApplicationContext(), new JSONObject(str2).optString("content"));
                        i = 1000;
                    } else {
                        objA = null;
                    }
                    try {
                        jSONObject.put("code", i);
                        jSONObject.put("data", objA);
                    } catch (Throwable th) {
                        hw.c("JsBridgeImpl", "call method : " + th.getClass().getSimpleName());
                    }
                    return jSONObject.toString();
                }
            } catch (Throwable th2) {
                hw.c("JsBridgeImpl", "call method : " + th2.getClass().getSimpleName());
                objA = "call " + str + " " + th2.getClass().getSimpleName() + ":" + th2.getMessage();
            }
        }
        hw.c("JsBridgeImpl", "param is invalid, please check it!");
        jSONObject.put("msg", "invalid params");
        jSONObject.put("code", 1011);
        return jSONObject.toString();
    }

    public static void initConfig(Context context, JsbConfig jsbConfig) {
        com.huawei.hms.ads.jsb.a.a(context).a(jsbConfig);
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f12829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f12830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f12831c;
        private final RemoteCallResultCallback<String> d;
        private g e;

        @Override // java.lang.Runnable
        public void run() {
            JsBridgeImpl.b(this.f12829a, this.e, this.f12830b, this.f12831c, this.d);
        }

        public a(Context context, g gVar, String str, String str2, RemoteCallResultCallback<String> remoteCallResultCallback) {
            this.f12829a = context;
            this.f12830b = str;
            this.f12831c = str2;
            this.d = remoteCallResultCallback;
            this.e = gVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, g gVar, String str, String str2, RemoteCallResultCallback<String> remoteCallResultCallback) {
        if (gVar != null) {
            hw.b("JsBridgeImpl", "call method: " + str);
            if (hw.a()) {
                hw.a("JsBridgeImpl", "param: %s", ds.a(str2));
            }
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String strOptString = jSONObject.optString("content");
                gVar.a(jSONObject.optString("url"));
                String strOptString2 = jSONObject.optString("cid");
                String strOptString3 = jSONObject.optString("webid");
                if (hw.a()) {
                    hw.a("JsBridgeImpl", "call method %s, webID: %s", str, strOptString3);
                }
                if (TextUtils.isEmpty(strOptString3)) {
                    gVar.b(strOptString2);
                } else {
                    gVar.b(strOptString3);
                }
                gVar.a(context, strOptString, remoteCallResultCallback);
                return;
            } catch (Throwable th) {
                hw.c("JsBridgeImpl", "call method %s, ex: %s", str, th.getClass().getSimpleName());
                j.a(remoteCallResultCallback, str, 1011, th.getClass().getSimpleName() + ":" + th.getMessage(), true);
                hw.a(3, th);
                return;
            }
        }
        String str3 = "api for " + str + " is not found";
        hw.b("JsBridgeImpl", "call " + str3);
        j.a(remoteCallResultCallback, str, 1011, str3, true);
    }
}

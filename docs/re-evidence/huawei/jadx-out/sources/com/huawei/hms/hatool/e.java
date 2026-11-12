package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;
import ohos.ace.plugin.wifimanager.WifiDeviceUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static e f13419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Long> f13420c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13421a;

    public void a(String str, String str2, String str3) {
        Context context = this.f13421a;
        if (context == null) {
            v.e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String strB = r0.b(context);
        if (a1.e(str, str2) && !WifiDeviceUtils.NETWORKINFO_TYPE_NAME.equals(strB)) {
            v.c("hmsSdk", "strNetworkType is :" + strB);
        } else if ("unknown".equals(strB) || "none".equals(strB) || "2G".equals(strB)) {
            v.e("hmsSdk", "The network is bad.");
        } else {
            b0.c().a(new v0(str, str2, str3));
        }
    }

    public void a(String str, String str2) {
        if (!a1.a(str, str2)) {
            v.c("hmsSdk", "auto report is closed tag:" + str);
            return;
        }
        long j = a1.j(str, str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - j <= 30000) {
            v.f("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        v.a("hmsSdk", "begin to call onReport!");
        a1.a(str, str2, jCurrentTimeMillis);
        a(str, str2, q0.g());
    }

    public void a(String str, int i, String str2, JSONObject jSONObject, long j) {
        new i1(str, n1.a(i), str2, jSONObject.toString(), j).a();
    }

    public void a(String str, int i, String str2, JSONObject jSONObject) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (2 == i) {
            jCurrentTimeMillis = n1.a("yyyy-MM-dd", jCurrentTimeMillis);
        }
        b0.c().a(new a0(str2, jSONObject, str, n1.a(i), jCurrentTimeMillis));
    }

    public void a(String str, int i) {
        if (this.f13421a == null) {
            v.e("hmsSdk", "onReport() null context or SDK was not init.");
        } else {
            v.a("hmsSdk", "onReport: Before calling runtaskhandler()");
            a(str, n1.a(i), q0.g());
        }
    }

    public void a(Context context) {
        this.f13421a = context;
        b(context);
        s.c().b().h(o.a());
    }

    private void b(Context context) {
        String str;
        String strD = o.d(context);
        q0.a(strD);
        if (q1.b().a()) {
            String strA = d.a(context, "global_v2", Constants.PARAM_APP_VER, "");
            d.b(context, "global_v2", Constants.PARAM_APP_VER, strD);
            q0.b(strA);
            if (!TextUtils.isEmpty(strA)) {
                if (strA.equals(strD)) {
                    return;
                }
                v.c("hmsSdk", "the appVers are different!");
                a().a("", "alltype", strA);
                return;
            }
            str = "app ver is first save!";
        } else {
            str = "userManager.isUserUnlocked() == false";
        }
        v.c("hmsSdk", str);
    }

    private static e b() {
        e eVar;
        synchronized (e.class) {
            if (f13419b == null) {
                f13419b = new e();
            }
            eVar = f13419b;
        }
        return eVar;
    }

    public static e a() {
        return b();
    }
}

package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import fg.e;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import nh.d;
import nh.i;
import nh.j;
import nh.k;
import nh.m;
import nh.n;
import org.apache.commons.text.StringSubstitutor;
import org.json.JSONObject;
import ph.c;

/* JADX INFO: loaded from: classes7.dex */
public class PayTask {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f28420h = i.class;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static long f28421i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f28422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f28423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28424c = "wappaygw.alipay.com/service/rest.htm";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28425d = "mclient.alipay.com/service/rest.htm";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28426e = "mclient.alipay.com/home/exterfaceAssign.htm";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28427f = "mclient.alipay.com/cashier/mobilepay.htm";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<String, b> f28428g = new HashMap();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f28429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f28430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ H5PayCallback f28431c;

        public a(String str, boolean z14, H5PayCallback h5PayCallback) {
            this.f28429a = str;
            this.f28430b = z14;
            this.f28431c = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PayTask payTask = PayTask.this;
            Activity activity = payTask.f28422a;
            String str = this.f28429a;
            sh.a aVarH5Pay = payTask.h5Pay(new lh.a(activity, str, "payInterceptorWithUrl"), str, this.f28430b);
            String str2 = aVarH5Pay.f159270a;
            this.f28431c.onPayResult(aVarH5Pay);
        }
    }

    public PayTask(Activity activity) {
        this.f28422a = activity;
        lh.b bVarB = lh.b.b();
        Activity activity2 = this.f28422a;
        bVarB.getClass();
        ah.b.c();
        bVarB.f112390a = activity2.getApplicationContext();
        this.f28423b = new c(activity, this.f28422a.getString(R.string.loading_go_pay));
    }

    public static String a(lh.a aVar, String str, List<ah.a.b> list, String str2, Activity activity) {
        n.b bVarF = n.f(aVar, activity, list);
        if (bVarF != null && !bVarF.a(aVar)) {
            PackageInfo packageInfo = bVarF.f126135a;
            if (packageInfo.versionCode >= bVarF.f126136b && TextUtils.equals(packageInfo.packageName, "hk.alipay.wallet")) {
                String strValueOf = String.valueOf(str.hashCode());
                Object obj = new Object();
                HashMap<String, Object> map = PayResultActivity.f28416b;
                map.put(strValueOf, obj);
                Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
                intent.putExtra("orderSuffix", str);
                intent.putExtra("externalPkgName", activity.getPackageName());
                intent.putExtra("phonecashier.pay.hash", strValueOf);
                lh.a.C2158a.b(aVar, intent);
                activity.startActivity(intent);
                synchronized (map.get(strValueOf)) {
                    try {
                        map.get(strValueOf).wait();
                    } catch (InterruptedException unused) {
                        return ug.b.a();
                    }
                }
                return PayResultActivity.a.f28419b;
            }
        }
        return str2;
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        try {
            lh.b bVarB = lh.b.b();
            bVarB.getClass();
            ah.b.c();
            bVarB.f112390a = context.getApplicationContext();
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (jElapsedRealtime - f28421i < ah.a.g().f3248d) {
                return false;
            }
            f28421i = jElapsedRealtime;
            ah.a.g().c(null, context.getApplicationContext(), false, 4);
            return true;
        } catch (Exception e4) {
            d.a(e4);
            return false;
        }
        throw th;
    }

    public static void h(lh.a aVar, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("tid");
            String strOptString2 = jSONObject.optString("client_key");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            mh.a.a(lh.b.b().f112390a).b(strOptString, strOptString2);
        } catch (Throwable th3) {
            wg.a.d(aVar, "biz", "ParserTidClientKeyEx", th3);
        }
    }

    public static boolean i(boolean z14, boolean z15, String str, StringBuilder sb3, HashMap map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i14];
            if (!TextUtils.isEmpty((CharSequence) map.get(str3))) {
                str2 = (String) map.get(str3);
                break;
            }
            i14++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z15;
        }
        if (!z14) {
            sn.a.t(sb3, str, "=\"", str2, "\"");
            return true;
        }
        sn.a.t(sb3, "&", str, "=\"", str2);
        sb3.append("\"");
        return true;
    }

    public final String b(String str, HashMap map) {
        boolean zEquals = "9000".equals(map.get("resultStatus"));
        String str2 = (String) map.get("result");
        b bVarRemove = this.f28428g.remove(str);
        if (map.containsKey("callBackUrl")) {
            return (String) map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String strA = a(n.c("&callBackUrl=\"", "\"", str2), n.c("&call_back_url=\"", "\"", str2), n.c("&return_url=\"", "\"", str2), URLDecoder.decode(n.c("&return_url=", "&", str2), "utf-8"), URLDecoder.decode(n.c("&callBackUrl=", "&", str2), "utf-8"), n.c("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        if (bVarRemove != null) {
            String str3 = zEquals ? bVarRemove.f28433a : bVarRemove.f28434b;
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return bVarRemove != null ? ah.a.g().f3247c : "";
    }

    public final String c(String str, lh.a aVar) {
        String strA = aVar.a(str);
        if (strA.contains("paymethod=\"expressGateway\"")) {
            return d(aVar, strA);
        }
        ArrayList arrayList = ah.a.g().f3268x;
        ah.a.g().getClass();
        List<ah.a.b> list = ug.a.f170550d;
        if (!n.j(aVar, this.f28422a, list, true)) {
            wg.a.b("LogCalledH5", aVar);
            return d(aVar, strA);
        }
        i iVar = new i(this.f28422a, aVar, new e(this));
        "pay inner started: ".concat(strA);
        String strC = iVar.c(strA, false);
        if (!TextUtils.isEmpty(strC)) {
            if (strC.contains("resultStatus={" + ug.c.ACTIVITY_NOT_START_EXIT.f170562a + StringSubstitutor.DEFAULT_VAR_END)) {
                n.g(this.f28422a, "startActivityEx", aVar);
                strC = iVar.c(strA, true);
            }
        }
        iVar.f126122a = null;
        iVar.f126125d = null;
        boolean z14 = ah.a.g().f3261q;
        if (TextUtils.equals(strC, "failed") || TextUtils.equals(strC, "scheme_failed") || (z14 && aVar.f112382g)) {
            wg.a.b("LogBindCalledH5", aVar);
            return d(aVar, strA);
        }
        if (TextUtils.isEmpty(strC)) {
            return ug.b.a();
        }
        if (!strC.contains("{\"isLogin\":\"false\"}")) {
            return strC;
        }
        wg.a.b("LogHkLoginByIntent", aVar);
        return a(aVar, strA, list, strC, this.f28422a);
    }

    public final String d(lh.a aVar, String str) {
        JSONObject jSONObject;
        showLoading();
        ug.c cVarA = null;
        try {
            try {
                try {
                    String str2 = new hh.e().a(this.f28422a.getApplicationContext(), str, aVar).f71573b;
                    if (TextUtils.isEmpty(str2)) {
                        jSONObject = null;
                    } else {
                        try {
                            jSONObject = new JSONObject(str2);
                        } catch (Exception e4) {
                            d.a(e4);
                            jSONObject = null;
                        }
                    }
                    String strOptString = jSONObject.optString("end_code", null);
                    ArrayList arrayListA = jh.b.a(jSONObject.optJSONObject("form").optJSONObject("onload"));
                    for (int i14 = 0; i14 < arrayListA.size(); i14++) {
                        if (((jh.b) arrayListA.get(i14)).f98745a == jh.a.Update) {
                            jh.b.b((jh.b) arrayListA.get(i14));
                        }
                    }
                    h(aVar, jSONObject);
                    dismissLoading();
                    Activity activity = this.f28422a;
                    String str3 = aVar.f112379d;
                    wg.a.a(str, str3, activity, aVar);
                    for (int i15 = 0; i15 < arrayListA.size(); i15++) {
                        jh.b bVar = (jh.b) arrayListA.get(i15);
                        jh.a aVar2 = bVar.f98745a;
                        if (aVar2 == jh.a.WapPay) {
                            String strF = f(aVar, bVar);
                            dismissLoading();
                            wg.a.a(str, str3, this.f28422a, aVar);
                            return strF;
                        }
                        if (aVar2 == jh.a.OpenWeb) {
                            String strG = g(aVar, bVar, strOptString);
                            dismissLoading();
                            wg.a.a(str, str3, this.f28422a, aVar);
                            return strG;
                        }
                    }
                    dismissLoading();
                    wg.a.a(str, str3, this.f28422a, aVar);
                } catch (Throwable th3) {
                    d.a(th3);
                    wg.a.d(aVar, "biz", "H5PayDataAnalysisError", th3);
                    dismissLoading();
                    wg.a.a(str, aVar.f112379d, this.f28422a, aVar);
                }
            } catch (IOException e14) {
                ug.c cVarA2 = ug.c.a(ug.c.NETWORK_ERROR.f170562a);
                if (aVar != null) {
                    wg.c cVar = aVar.f112386k;
                    String simpleName = e14.getClass().getSimpleName();
                    cVar.getClass();
                    cVar.f("net", simpleName, wg.c.c(e14));
                }
                dismissLoading();
                wg.a.a(str, aVar.f112379d, this.f28422a, aVar);
                cVarA = cVarA2;
            }
            if (cVarA == null) {
                cVarA = ug.c.a(ug.c.FAILED.f170562a);
            }
            return ug.b.b(cVarA.f170562a, cVarA.f170563b, "");
        } catch (Throwable th4) {
            dismissLoading();
            wg.a.a(str, aVar.f112379d, this.f28422a, aVar);
            throw th4;
        }
    }

    public void dismissLoading() {
        c cVar = this.f28423b;
        if (cVar != null) {
            Activity activity = cVar.f137648b;
            if (activity != null) {
                activity.runOnUiThread(new ph.b(cVar));
            }
            this.f28423b = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x014e A[Catch: all -> 0x000f, PHI: r11
      0x014e: PHI (r11v18 java.lang.String) = (r11v17 java.lang.String), (r11v20 java.lang.String) binds: [B:41:0x014c, B:36:0x00fc] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x000f, blocks: (B:5:0x000b, B:8:0x0012, B:10:0x001b, B:12:0x002f, B:13:0x0033, B:15:0x0054, B:17:0x005c, B:18:0x005f, B:20:0x0063, B:22:0x006b, B:23:0x0078, B:25:0x0080, B:35:0x00b7, B:43:0x015b, B:42:0x014e, B:40:0x0107, B:47:0x016c, B:49:0x01b3, B:50:0x01c0, B:51:0x01ce, B:14:0x004f, B:39:0x0100, B:28:0x008f, B:34:0x00ad, B:29:0x009c, B:31:0x00a6), top: B:60:0x000b, inners: #0, #2 }] */
    public final synchronized String e(lh.a aVar, String str, boolean z14) {
        String strA;
        if (z14) {
            try {
                showLoading();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (str.contains("payment_inst=")) {
            String strSubstring = str.substring(str.indexOf("payment_inst=") + 13);
            int iIndexOf = strSubstring.indexOf(38);
            if (iIndexOf > 0) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            ug.a.a(strSubstring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
        } else {
            ug.a.a("");
        }
        if (str.contains("service=alipay.acquire.mr.ord.createandpay")) {
            yg.a.f196900b = true;
        }
        if (yg.a.f196900b) {
            if (str.startsWith("https://wappaygw.alipay.com/home/exterfaceAssign.htm?")) {
                str = str.substring(str.indexOf("https://wappaygw.alipay.com/home/exterfaceAssign.htm?") + 53);
            } else if (str.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm?")) {
                str = str.substring(str.indexOf("https://mclient.alipay.com/home/exterfaceAssign.htm?") + 52);
            }
        }
        strA = "";
        try {
            "pay prepared: ".concat(str);
            strA = c(str, aVar);
            Context applicationContext = this.f28422a.getApplicationContext();
            try {
                String strA2 = j.a(strA);
                if (!TextUtils.isEmpty(strA2)) {
                    k.c("pref_trade_token", strA2, applicationContext, aVar);
                }
            } catch (Throwable th4) {
                wg.a.d(aVar, "biz", "SaveTradeTokenError", th4);
                d.a(th4);
            }
            wg.a.c(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
            wg.a.c(aVar, "biz", "PgReturnV", m.a(strA, "resultStatus") + "|" + m.a(strA, "memo"));
            if (!ah.a.g().f3258n) {
                ah.a.g().c(aVar, this.f28422a.getApplicationContext(), false, 3);
            }
        } catch (Throwable th5) {
            try {
                strA = ug.b.a();
                d.a(th5);
                wg.a.c(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                wg.a.c(aVar, "biz", "PgReturnV", m.a(strA, "resultStatus") + "|" + m.a(strA, "memo"));
                if (!ah.a.g().f3258n) {
                    ah.a.g().c(aVar, this.f28422a.getApplicationContext(), false, 3);
                }
            } catch (Throwable th6) {
                wg.a.c(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                wg.a.c(aVar, "biz", "PgReturnV", m.a(strA, "resultStatus") + "|" + m.a(strA, "memo"));
                if (!ah.a.g().f3258n) {
                    ah.a.g().c(aVar, this.f28422a.getApplicationContext(), false, 3);
                }
                dismissLoading();
                wg.a.f(str, aVar.f112379d, this.f28422a.getApplicationContext(), aVar);
                throw th6;
            }
        }
        dismissLoading();
        wg.a.f(str, aVar.f112379d, this.f28422a.getApplicationContext(), aVar);
        return strA;
    }

    public final String f(lh.a aVar, jh.b bVar) {
        String[] strArr = bVar.f98746b;
        Intent intent = new Intent(this.f28422a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", strArr[0]);
        if (strArr.length == 2) {
            bundle.putString("cookie", strArr[1]);
        }
        intent.putExtras(bundle);
        lh.a.C2158a.b(aVar, intent);
        this.f28422a.startActivity(intent);
        Object obj = f28420h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e4) {
                d.a(e4);
                return ug.b.a();
            }
        }
        String str = ug.b.f170552b;
        return TextUtils.isEmpty(str) ? ug.b.a() : str;
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String strTrim = str.trim();
                if (strTrim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || strTrim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String strTrim2 = strTrim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim2)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + n.c("<request_token>", "</request_token>", (String) n.l(strTrim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f28422a) + "\"";
                    }
                }
                if (strTrim.startsWith("https://mclient.alipay.com/service/rest.htm") || strTrim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String strTrim3 = strTrim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + n.c("<request_token>", "</request_token>", (String) n.l(strTrim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f28422a) + "\"";
                    }
                }
                if ((strTrim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || strTrim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((strTrim.contains("alipay.wap.create.direct.pay.by.user") || strTrim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(strTrim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", a(this.f28422a));
                    return "new_external_info==" + jSONObject.toString();
                }
                a aVar = null;
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String strC = n.c(CallerData.NA, "", str);
                    if (!TextUtils.isEmpty(strC)) {
                        HashMap mapL = n.l(strC);
                        StringBuilder sb3 = new StringBuilder();
                        if (i(false, true, "trade_no", sb3, mapL, "trade_no", "alipay_trade_no")) {
                            i(true, false, "pay_phase_id", sb3, mapL, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb3.append("&biz_sub_type=\"TRADE\"");
                            sb3.append("&biz_type=\"trade\"");
                            String str2 = (String) mapL.get("app_name");
                            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty((CharSequence) mapL.get("cid"))) {
                                str2 = "ali1688";
                            } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty((CharSequence) mapL.get("sid")) || !TextUtils.isEmpty((CharSequence) mapL.get("s_id")))) {
                                str2 = TtmlNode.VERTICAL;
                            }
                            sb3.append("&app_name=\"" + str2 + "\"");
                            if (!i(true, true, "extern_token", sb3, mapL, "extern_token", "cid", "sid", "s_id")) {
                                return "";
                            }
                            i(true, false, "appenv", sb3, mapL, "appenv");
                            sb3.append("&pay_channel_id=\"alipay_sdk\"");
                            b bVar = new b(this, aVar);
                            bVar.f28433a = (String) mapL.get("return_url");
                            bVar.f28434b = (String) mapL.get("show_url");
                            String str3 = sb3.toString() + "&bizcontext=\"" + a(this.f28422a) + "\"";
                            this.f28428g.put(str3, bVar);
                            return str3;
                        }
                    }
                }
                if (!strTrim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !strTrim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!fg.b.a() || !strTrim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    if (ah.a.g().f3249e && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(strTrim).find()) {
                        Uri uri = Uri.parse(strTrim);
                        String queryParameter = uri.getQueryParameter("return_url");
                        String queryParameter2 = uri.getQueryParameter("show_url");
                        uri.getQueryParameter("pay_order_id");
                        String strA = a(uri.getQueryParameter("trade_nos"), uri.getQueryParameter("alipay_trade_no"));
                        String strA2 = a(uri.getQueryParameter("payPhaseId"), uri.getQueryParameter("pay_phase_id"), uri.getQueryParameter("out_relation_id"));
                        String strA3 = a(uri.getQueryParameter("app_name"), !TextUtils.isEmpty(uri.getQueryParameter("cid")) ? "ali1688" : "", !TextUtils.isEmpty(uri.getQueryParameter("sid")) ? TtmlNode.VERTICAL : "", !TextUtils.isEmpty(uri.getQueryParameter("s_id")) ? TtmlNode.VERTICAL : "");
                        String strA4 = a(uri.getQueryParameter("extern_token"), uri.getQueryParameter("cid"), uri.getQueryParameter("sid"), uri.getQueryParameter("s_id"));
                        String strA5 = a(uri.getQueryParameter("appenv"));
                        if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strA3) && !TextUtils.isEmpty(strA4)) {
                            String str4 = "trade_no=\"" + strA + "\"&pay_phase_id=\"" + strA2 + "\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"" + strA3 + "\"&extern_token=\"" + strA4 + "\"&appenv=\"" + strA5 + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f28422a) + "\"";
                            b bVar2 = new b(this, aVar);
                            bVar2.f28433a = queryParameter;
                            bVar2.f28434b = queryParameter2;
                            this.f28428g.put(str4, bVar2);
                            return str4;
                        }
                    }
                }
                String strA6 = a(this.f28422a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", strTrim);
                jSONObject2.put("bizcontext", strA6);
                return "new_external_info==" + jSONObject2.toString();
            }
        } catch (Throwable th3) {
            d.a(th3);
        }
        return "";
    }

    public synchronized String fetchTradeToken() {
        return k.b("pref_trade_token", "", this.f28422a.getApplicationContext(), new lh.a(this.f28422a, "", "fetchTradeToken"));
    }

    public final String g(lh.a aVar, jh.b bVar, String str) {
        JSONObject jSONObject;
        boolean z14;
        String str2;
        JSONObject jSONObject2;
        String[] strArr = bVar.f98746b;
        Intent intent = new Intent(this.f28422a, (Class<?>) H5PayActivity.class);
        try {
            try {
                jSONObject = new JSONObject(new String(ch.a.c(strArr[2])));
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
            intent.putExtra("url", strArr[0]);
            intent.putExtra("title", strArr[1]);
            intent.putExtra("version", "v2");
            intent.putExtra(FirebaseAnalytics.Param.METHOD, jSONObject.optString(FirebaseAnalytics.Param.METHOD, FirebasePerformance.HttpMethod.POST));
            ug.b.f170551a = false;
            ug.b.f170552b = null;
            lh.a.C2158a.b(aVar, intent);
            this.f28422a.startActivity(intent);
            Object obj = f28420h;
            synchronized (obj) {
                try {
                    obj.wait();
                    z14 = ug.b.f170551a;
                    str2 = ug.b.f170552b;
                    ug.b.f170551a = false;
                    ug.b.f170552b = null;
                } catch (InterruptedException e4) {
                    d.a(e4);
                    return ug.b.a();
                }
            }
            String strB = "";
            if (z14) {
                try {
                    try {
                        jSONObject2 = new JSONObject(new String(ch.a.c(str2)));
                    } catch (Throwable unused2) {
                        jSONObject2 = new JSONObject();
                    }
                    ArrayList arrayListA = jh.b.a(jSONObject2);
                    for (int i14 = 0; i14 < arrayListA.size(); i14++) {
                        jh.b bVar2 = (jh.b) arrayListA.get(i14);
                        if (bVar2.f98745a == jh.a.SetResult) {
                            String[] strArr2 = bVar2.f98746b;
                            strB = ug.b.b(Integer.valueOf(strArr2[1]).intValue(), strArr2[0], n.p(strArr2[2], aVar));
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    d.a(th3);
                    wg.a.e(aVar, "H5PayDataAnalysisError", th3, str2);
                }
            }
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            try {
                return ug.b.b(Integer.valueOf(str).intValue(), "", "");
            } catch (Throwable th4) {
                wg.a.e(aVar, "H5PayDataAnalysisError", th4, "endCode: " + str);
                return ug.b.b(8000, "", "");
            }
        } catch (Throwable th5) {
            d.a(th5);
            wg.a.e(aVar, "H5PayDataAnalysisError", th5, Arrays.toString(strArr));
            return ug.b.a();
        }
    }

    public String getVersion() {
        return "15.8.30";
    }

    public synchronized sh.a h5Pay(lh.a aVar, String str, boolean z14) {
        sh.a aVar2;
        aVar2 = new sh.a();
        try {
            String[] strArrSplit = e(aVar, str, z14).split(";");
            HashMap map = new HashMap();
            for (String str2 : strArrSplit) {
                int iIndexOf = str2.indexOf("={");
                if (iIndexOf >= 0) {
                    String strSubstring = str2.substring(0, iIndexOf);
                    String str3 = strSubstring + "={";
                    map.put(strSubstring, str2.substring(str3.length() + str2.indexOf(str3), str2.lastIndexOf(StringSubstitutor.DEFAULT_VAR_END)));
                }
            }
            if (map.containsKey("resultStatus")) {
                aVar2.f159270a = (String) map.get("resultStatus");
            }
            if (TextUtils.isEmpty(b(str, map))) {
                wg.a.g(aVar, "biz", "H5CbUrlEmpty", "");
            }
        } catch (Throwable th3) {
            wg.a.d(aVar, "biz", "H5CbEx", th3);
            d.a(th3);
        }
        return aVar2;
    }

    public synchronized String pay(String str, boolean z14) {
        if (!nh.b.a()) {
            return e(new lh.a(this.f28422a, str, "pay"), str, z14);
        }
        ug.c cVarA = ug.c.a(ug.c.DOUBLE_REQUEST.f170562a);
        return ug.b.b(cVarA.f170562a, cVarA.f170563b, "");
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z14, H5PayCallback h5PayCallback) {
        String strFetchOrderInfoFromH5PayUrl;
        try {
            strFetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
            if (!TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl)) {
                new Thread(new a(strFetchOrderInfoFromH5PayUrl, z14, h5PayCallback)).start();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return !TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z14) {
        String strE;
        lh.a aVar;
        if (nh.b.a()) {
            ug.c cVarA = ug.c.a(ug.c.DOUBLE_REQUEST.f170562a);
            strE = ug.b.b(cVarA.f170562a, cVarA.f170563b, "");
            aVar = null;
        } else {
            lh.a aVar2 = new lh.a(this.f28422a, str, "payV2");
            strE = e(aVar2, str, z14);
            aVar = aVar2;
        }
        return m.c(strE, aVar);
    }

    public void showLoading() {
        Activity activity;
        c cVar = this.f28423b;
        if (cVar == null || (activity = cVar.f137648b) == null) {
            return;
        }
        activity.runOnUiThread(new ph.a(cVar));
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f28434b;

        public b(PayTask payTask) {
            this.f28433a = "";
            this.f28434b = "";
        }

        public /* synthetic */ b(PayTask payTask, a aVar) {
            this(payTask);
        }
    }

    public static String a(Context context) {
        String str;
        String str2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                str2 = packageInfo.packageName;
            } catch (Exception e4) {
                e = e4;
                d.a(e);
                str2 = "";
            }
        } catch (Exception e14) {
            e = e14;
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "and_lite");
            jSONObject.put("sv", "h.a.3.8.30");
            jSONObject.put("an", str2);
            jSONObject.put("av", str);
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            if (!TextUtils.isEmpty("sc")) {
                jSONObject.put("sc", "h5tonative");
            }
            return jSONObject.toString();
        } catch (Throwable th3) {
            d.a(th3);
            return "";
        }
    }

    public static final String a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }
}

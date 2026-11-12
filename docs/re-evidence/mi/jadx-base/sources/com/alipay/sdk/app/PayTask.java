package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.packet.impl.f;
import com.alipay.sdk.util.H5PayResultModel;
import com.alipay.sdk.util.e;
import com.alipay.sdk.util.i;
import com.alipay.sdk.util.k;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.onetrack.OneTrack;
import defpackage.gv5;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PayTask {
    public static final Object h = e.class;
    public static long i = 0;
    public static long j = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f5812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.alipay.sdk.widget.a f5813b;
    public final String c = "wappaygw.alipay.com/service/rest.htm";
    public final String d = "mclient.alipay.com/service/rest.htm";
    public final String e = "mclient.alipay.com/home/exterfaceAssign.htm";
    public final String f = "mclient.alipay.com/cashier/mobilepay.htm";
    public Map<String, a> g = new HashMap();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f5818b;
        public String c;
        public String d;

        public a() {
            this.f5817a = "";
            this.f5818b = "";
            this.c = "";
            this.d = "";
        }

        public String a() {
            return this.f5817a;
        }

        public void b(String str) {
            this.f5817a = str;
        }

        public String c() {
            return this.c;
        }

        public void d(String str) {
            this.c = str;
        }

        public String e() {
            return this.f5818b;
        }

        public void f(String str) {
            this.f5818b = str;
        }

        public String g() {
            return this.d;
        }

        public void h(String str) {
            this.d = str;
        }
    }

    public PayTask(Activity activity) {
        this.f5812a = activity;
        com.alipay.sdk.sys.b.a().b(this.f5812a);
        this.f5813b = new com.alipay.sdk.widget.a(activity, "去支付宝付款");
    }

    public static String f(com.alipay.sdk.sys.a aVar, String str, List<com.alipay.sdk.data.a.C0118a> list, String str2, Activity activity) {
        k.a aVarC = k.c(aVar, activity, list);
        if (aVarC == null || aVarC.b(aVar) || aVarC.a() || !TextUtils.equals(aVarC.f5891a.packageName, "hk.alipay.wallet")) {
            return str2;
        }
        com.alipay.sdk.util.c.b("mspl", "PayTask not_login");
        String strValueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap<String, Object> map = PayResultActivity.f5807b;
        map.put(strValueOf, obj);
        Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
        intent.putExtra("orderSuffix", str);
        intent.putExtra("externalPkgName", activity.getPackageName());
        intent.putExtra("phonecashier.pay.hash", strValueOf);
        com.alipay.sdk.sys.a.C0120a.c(aVar, intent);
        activity.startActivity(intent);
        synchronized (map.get(strValueOf)) {
            try {
                com.alipay.sdk.util.c.b("mspl", "PayTask wait");
                map.get(strValueOf).wait();
            } catch (InterruptedException unused) {
                com.alipay.sdk.util.c.b("mspl", "PayTask interrupted");
                return b.f();
            }
        }
        String str3 = PayResultActivity.a.f5811b;
        com.alipay.sdk.util.c.b("mspl", "PayTask ret: " + str3);
        return str3;
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        try {
            com.alipay.sdk.sys.b.a().b(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
            if (jElapsedRealtime - i < com.alipay.sdk.data.a.w().m()) {
                return false;
            }
            i = jElapsedRealtime;
            com.alipay.sdk.data.a.w().e(com.alipay.sdk.sys.a.a(), context.getApplicationContext());
            return true;
        } catch (Exception e) {
            com.alipay.sdk.util.c.d(e);
            return false;
        }
        throw th;
    }

    public static final String k(String... strArr) {
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

    public static boolean n() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - j < 3000) {
            return true;
        }
        j = jElapsedRealtime;
        return false;
    }

    public final e.c b() {
        return new e.c() { // from class: com.alipay.sdk.app.PayTask.2
            @Override // com.alipay.sdk.util.e.c
            public void a() {
            }

            @Override // com.alipay.sdk.util.e.c
            public void b() {
                PayTask.this.dismissLoading();
            }
        };
    }

    public final String c(com.alipay.sdk.sys.a aVar, com.alipay.sdk.protocol.b bVar) {
        String[] strArrF = bVar.f();
        Intent intent = new Intent(this.f5812a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrF[0]);
        if (strArrF.length == 2) {
            bundle.putString("cookie", strArrF[1]);
        }
        intent.putExtras(bundle);
        com.alipay.sdk.sys.a.C0120a.c(aVar, intent);
        this.f5812a.startActivity(intent);
        Object obj = h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                com.alipay.sdk.util.c.d(e);
                return b.f();
            }
        }
        String strA = b.a();
        return TextUtils.isEmpty(strA) ? b.f() : strA;
    }

    public final String d(com.alipay.sdk.sys.a aVar, com.alipay.sdk.protocol.b bVar, String str) {
        boolean zE;
        String strA;
        String[] strArrF = bVar.f();
        Intent intent = new Intent(this.f5812a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectY = k.y(new String(com.alipay.sdk.encrypt.a.d(strArrF[2])));
            intent.putExtra("url", strArrF[0]);
            intent.putExtra("title", strArrF[1]);
            intent.putExtra("version", "v2");
            intent.putExtra("method", jSONObjectY.optString("method", "POST"));
            b.d(false);
            b.c(null);
            com.alipay.sdk.sys.a.C0120a.c(aVar, intent);
            this.f5812a.startActivity(intent);
            Object obj = h;
            synchronized (obj) {
                try {
                    obj.wait();
                    zE = b.e();
                    strA = b.a();
                    b.d(false);
                    b.c(null);
                } catch (InterruptedException e) {
                    com.alipay.sdk.util.c.d(e);
                    return b.f();
                }
            }
            String strB = "";
            if (zE) {
                try {
                    List<com.alipay.sdk.protocol.b> listA = com.alipay.sdk.protocol.b.a(k.y(new String(com.alipay.sdk.encrypt.a.d(strA))));
                    for (int i2 = 0; i2 < listA.size(); i2++) {
                        com.alipay.sdk.protocol.b bVar2 = listA.get(i2);
                        if (bVar2.d() == com.alipay.sdk.protocol.a.SetResult) {
                            String[] strArrF2 = bVar2.f();
                            strB = b.b(Integer.valueOf(strArrF2[1]).intValue(), strArrF2[0], k.s(aVar, strArrF2[2]));
                            break;
                        }
                    }
                } catch (Throwable th) {
                    com.alipay.sdk.util.c.d(th);
                    com.alipay.sdk.app.statistic.a.e(aVar, "biz", "H5PayDataAnalysisError", th, strA);
                }
            }
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            try {
                return b.b(Integer.valueOf(str).intValue(), "", "");
            } catch (Throwable th2) {
                com.alipay.sdk.app.statistic.a.e(aVar, "biz", "H5PayDataAnalysisError", th2, "endCode: " + str);
                return b.b(8000, "", "");
            }
        } catch (Throwable th3) {
            com.alipay.sdk.util.c.d(th3);
            com.alipay.sdk.app.statistic.a.e(aVar, "biz", "H5PayDataAnalysisError", th3, Arrays.toString(strArrF));
            return b.f();
        }
    }

    public void dismissLoading() {
        com.alipay.sdk.widget.a aVar = this.f5813b;
        if (aVar != null) {
            aVar.f();
            this.f5813b = null;
        }
    }

    public final String e(com.alipay.sdk.sys.a aVar, String str) {
        String strC;
        showLoading();
        c cVarB = null;
        try {
            try {
                try {
                    JSONObject jSONObjectC = new f().b(aVar, this.f5812a.getApplicationContext(), str).c();
                    String strOptString = jSONObjectC.optString("end_code", null);
                    List<com.alipay.sdk.protocol.b> listA = com.alipay.sdk.protocol.b.a(jSONObjectC.optJSONObject("form").optJSONObject("onload"));
                    for (int i2 = 0; i2 < listA.size(); i2++) {
                        if (listA.get(i2).d() == com.alipay.sdk.protocol.a.Update) {
                            com.alipay.sdk.protocol.b.b(listA.get(i2));
                        }
                    }
                    l(aVar, jSONObjectC);
                    dismissLoading();
                    com.alipay.sdk.app.statistic.a.a(this.f5812a, aVar, str, aVar.d);
                    for (int i3 = 0; i3 < listA.size(); i3++) {
                        com.alipay.sdk.protocol.b bVar = listA.get(i3);
                        if (bVar.d() == com.alipay.sdk.protocol.a.WapPay) {
                            strC = c(aVar, bVar);
                        } else if (bVar.d() == com.alipay.sdk.protocol.a.OpenWeb) {
                            strC = d(aVar, bVar, strOptString);
                        }
                        dismissLoading();
                        com.alipay.sdk.app.statistic.a.a(this.f5812a, aVar, str, aVar.d);
                        return strC;
                    }
                } catch (IOException e) {
                    c cVarB2 = c.b(c.NETWORK_ERROR.a());
                    com.alipay.sdk.app.statistic.a.f(aVar, OneTrack.Param.NET, e);
                    dismissLoading();
                    com.alipay.sdk.app.statistic.a.a(this.f5812a, aVar, str, aVar.d);
                    cVarB = cVarB2;
                }
            } catch (Throwable th) {
                com.alipay.sdk.util.c.d(th);
                com.alipay.sdk.app.statistic.a.d(aVar, "biz", "H5PayDataAnalysisError", th);
            }
            dismissLoading();
            com.alipay.sdk.app.statistic.a.a(this.f5812a, aVar, str, aVar.d);
            if (cVarB == null) {
                cVarB = c.b(c.FAILED.a());
            }
            return b.b(cVarB.a(), cVarB.b(), "");
        } catch (Throwable th2) {
            dismissLoading();
            com.alipay.sdk.app.statistic.a.a(this.f5812a, aVar, str, aVar.d);
            throw th2;
        }
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String strTrim = str.trim();
                if (strTrim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || strTrim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String strTrim2 = strTrim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim2)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + k.i("<request_token>", "</request_token>", k.t(strTrim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + new com.alipay.sdk.sys.a(this.f5812a, "", "").c("sc", "h5tonative") + "\"";
                    }
                }
                if (strTrim.startsWith("https://mclient.alipay.com/service/rest.htm") || strTrim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String strTrim3 = strTrim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(strTrim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + k.i("<request_token>", "</request_token>", k.t(strTrim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + new com.alipay.sdk.sys.a(this.f5812a, "", "").c("sc", "h5tonative") + "\"";
                    }
                }
                if ((strTrim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || strTrim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((strTrim.contains("alipay.wap.create.direct.pay.by.user") || strTrim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(strTrim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    com.alipay.sdk.sys.a aVar = new com.alipay.sdk.sys.a(this.f5812a, "", "");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", aVar.c("sc", "h5tonative"));
                    return "new_external_info==" + jSONObject.toString();
                }
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String strI = k.i("?", "", str);
                    if (!TextUtils.isEmpty(strI)) {
                        Map<String, String> mapT = k.t(strI);
                        StringBuilder sb = new StringBuilder();
                        if (m(false, true, "trade_no", sb, mapT, "trade_no", "alipay_trade_no")) {
                            m(true, false, "pay_phase_id", sb, mapT, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb.append("&biz_sub_type=\"TRADE\"");
                            sb.append("&biz_type=\"trade\"");
                            String str2 = mapT.get(FeedbackConstants.KEY_APP_NAME);
                            if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(mapT.get("cid"))) {
                                str2 = "ali1688";
                            } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(mapT.get("sid")) || !TextUtils.isEmpty(mapT.get("s_id")))) {
                                str2 = "tb";
                            }
                            sb.append("&app_name=\"" + str2 + "\"");
                            if (!m(true, true, "extern_token", sb, mapT, "extern_token", "cid", "sid", "s_id")) {
                                return "";
                            }
                            m(true, false, "appenv", sb, mapT, "appenv");
                            sb.append("&pay_channel_id=\"alipay_sdk\"");
                            a aVar2 = new a();
                            aVar2.b(mapT.get("return_url"));
                            aVar2.f(mapT.get("show_url"));
                            aVar2.d(mapT.get("pay_order_id"));
                            String str3 = sb.toString() + "&bizcontext=\"" + new com.alipay.sdk.sys.a(this.f5812a, "", "").c("sc", "h5tonative") + "\"";
                            this.g.put(str3, aVar2);
                            return str3;
                        }
                    }
                }
                if (!strTrim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !strTrim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!EnvUtils.a() || !strTrim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    if (com.alipay.sdk.data.a.w().k() && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(strTrim).find()) {
                        Uri uri = Uri.parse(strTrim);
                        String queryParameter = uri.getQueryParameter("return_url");
                        String queryParameter2 = uri.getQueryParameter("show_url");
                        String queryParameter3 = uri.getQueryParameter("pay_order_id");
                        String strK = k(uri.getQueryParameter("trade_nos"), uri.getQueryParameter("alipay_trade_no"));
                        String strK2 = k(uri.getQueryParameter("payPhaseId"), uri.getQueryParameter("pay_phase_id"), uri.getQueryParameter("out_relation_id"));
                        String[] strArr = new String[4];
                        strArr[0] = uri.getQueryParameter(FeedbackConstants.KEY_APP_NAME);
                        strArr[1] = !TextUtils.isEmpty(uri.getQueryParameter("cid")) ? "ali1688" : "";
                        strArr[2] = !TextUtils.isEmpty(uri.getQueryParameter("sid")) ? "tb" : "";
                        strArr[3] = !TextUtils.isEmpty(uri.getQueryParameter("s_id")) ? "tb" : "";
                        String strK3 = k(strArr);
                        String strK4 = k(uri.getQueryParameter("extern_token"), uri.getQueryParameter("cid"), uri.getQueryParameter("sid"), uri.getQueryParameter("s_id"));
                        String strK5 = k(uri.getQueryParameter("appenv"));
                        if (!TextUtils.isEmpty(strK) && !TextUtils.isEmpty(strK3) && !TextUtils.isEmpty(strK4)) {
                            String str4 = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", strK, strK2, strK3, strK4, strK5, new com.alipay.sdk.sys.a(this.f5812a, "", "").c("sc", "h5tonative"));
                            a aVar3 = new a();
                            aVar3.b(queryParameter);
                            aVar3.f(queryParameter2);
                            aVar3.d(queryParameter3);
                            aVar3.h(strK);
                            this.g.put(str4, aVar3);
                            return str4;
                        }
                    }
                }
                String strC = new com.alipay.sdk.sys.a(this.f5812a, "", "").c("sc", "h5tonative");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", strTrim);
                jSONObject2.put("bizcontext", strC);
                return String.format("new_external_info==%s", jSONObject2.toString());
            }
        } catch (Throwable th) {
            com.alipay.sdk.util.c.d(th);
        }
        return "";
    }

    public synchronized String fetchTradeToken() {
        return com.alipay.sdk.util.f.a(new com.alipay.sdk.sys.a(this.f5812a, "", "fetchTradeToken"), this.f5812a.getApplicationContext());
    }

    public final synchronized String g(com.alipay.sdk.sys.a aVar, String str, boolean z) {
        Context applicationContext;
        String str2;
        if (n()) {
            com.alipay.sdk.app.statistic.a.c(aVar, "biz", "RepPay", "");
            return b.g();
        }
        if (z) {
            showLoading();
        }
        if (str.contains("payment_inst=")) {
            String strSubstring = str.substring(str.indexOf("payment_inst=") + 13);
            int iIndexOf = strSubstring.indexOf(38);
            if (iIndexOf > 0) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            com.alipay.sdk.app.a.b(strSubstring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
        } else {
            com.alipay.sdk.app.a.b("");
        }
        if (str.contains("service=alipay.acquire.mr.ord.createandpay")) {
            com.alipay.sdk.cons.a.c = true;
        }
        if (com.alipay.sdk.cons.a.c) {
            if (str.startsWith("https://wappaygw.alipay.com/home/exterfaceAssign.htm?")) {
                str = str.substring(str.indexOf("https://wappaygw.alipay.com/home/exterfaceAssign.htm?") + 53);
            } else if (str.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm?")) {
                str = str.substring(str.indexOf("https://mclient.alipay.com/home/exterfaceAssign.htm?") + 52);
            }
        }
        String strF = "";
        try {
            com.alipay.sdk.util.c.f("mspl", "pay prepared: " + str);
            strF = h(str, aVar);
            com.alipay.sdk.util.c.f("mspl", "pay raw result: " + strF);
            com.alipay.sdk.util.f.c(aVar, this.f5812a.getApplicationContext(), strF);
            com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
            com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturnV", i.a(strF, "resultStatus") + "|" + i.a(strF, "memo"));
            if (!com.alipay.sdk.data.a.w().u()) {
                com.alipay.sdk.data.a.w().e(aVar, this.f5812a.getApplicationContext());
            }
            dismissLoading();
            applicationContext = this.f5812a.getApplicationContext();
            str2 = aVar.d;
        } catch (Throwable th) {
            try {
                strF = b.f();
                com.alipay.sdk.util.c.d(th);
                com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturnV", i.a(strF, "resultStatus") + "|" + i.a(strF, "memo"));
                if (!com.alipay.sdk.data.a.w().u()) {
                    com.alipay.sdk.data.a.w().e(aVar, this.f5812a.getApplicationContext());
                }
                dismissLoading();
                applicationContext = this.f5812a.getApplicationContext();
                str2 = aVar.d;
            } catch (Throwable th2) {
                com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                com.alipay.sdk.app.statistic.a.h(aVar, "biz", "PgReturnV", i.a(strF, "resultStatus") + "|" + i.a(strF, "memo"));
                if (!com.alipay.sdk.data.a.w().u()) {
                    com.alipay.sdk.data.a.w().e(aVar, this.f5812a.getApplicationContext());
                }
                dismissLoading();
                com.alipay.sdk.app.statistic.a.g(this.f5812a.getApplicationContext(), aVar, str, aVar.d);
                throw th2;
            }
        }
        com.alipay.sdk.app.statistic.a.g(applicationContext, aVar, str, str2);
        com.alipay.sdk.util.c.f("mspl", "pay returning: " + strF);
        return strF;
    }

    public String getVersion() {
        return "15.7.5";
    }

    public final String h(String str, com.alipay.sdk.sys.a aVar) {
        String strB = aVar.b(str);
        if (strB.contains("paymethod=\"expressGateway\"")) {
            return e(aVar, strB);
        }
        List<com.alipay.sdk.data.a.C0118a> listV = com.alipay.sdk.data.a.w().v();
        if (!com.alipay.sdk.data.a.w().g || listV == null) {
            listV = com.alipay.sdk.app.a.d;
        }
        if (!k.v(aVar, this.f5812a, listV)) {
            com.alipay.sdk.app.statistic.a.b(aVar, "biz", "LogCalledH5");
            return e(aVar, strB);
        }
        e eVar = new e(this.f5812a, aVar, b());
        com.alipay.sdk.util.c.f("mspl", "pay inner started: " + strB);
        String strE = eVar.e(strB);
        com.alipay.sdk.util.c.f("mspl", "pay inner raw result: " + strE);
        eVar.h();
        if (TextUtils.equals(strE, "failed") || TextUtils.equals(strE, "scheme_failed")) {
            com.alipay.sdk.app.statistic.a.b(aVar, "biz", "LogBindCalledH5");
            return e(aVar, strB);
        }
        if (TextUtils.isEmpty(strE)) {
            return b.f();
        }
        if (!strE.contains("{\"isLogin\":\"false\"}")) {
            return strE;
        }
        com.alipay.sdk.app.statistic.a.b(aVar, "biz", "LogHkLoginByIntent");
        return f(aVar, strB, listV, strE, this.f5812a);
    }

    public synchronized H5PayResultModel h5Pay(com.alipay.sdk.sys.a aVar, String str, boolean z) {
        H5PayResultModel h5PayResultModel;
        h5PayResultModel = new H5PayResultModel();
        try {
            String[] strArrSplit = g(aVar, str, z).split(";");
            HashMap map = new HashMap();
            for (String str2 : strArrSplit) {
                int iIndexOf = str2.indexOf("={");
                if (iIndexOf >= 0) {
                    String strSubstring = str2.substring(0, iIndexOf);
                    map.put(strSubstring, i(str2, strSubstring));
                }
            }
            if (map.containsKey("resultStatus")) {
                h5PayResultModel.c(map.get("resultStatus"));
            }
            h5PayResultModel.d(j(str, map));
            if (TextUtils.isEmpty(h5PayResultModel.b())) {
                com.alipay.sdk.app.statistic.a.c(aVar, "biz", "H5CbUrlEmpty", "");
            }
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.d(aVar, "biz", "H5CbEx", th);
            com.alipay.sdk.util.c.d(th);
        }
        return h5PayResultModel;
    }

    public final String i(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }

    public final String j(String str, Map<String, String> map) throws UnsupportedEncodingException {
        boolean zEquals = "9000".equals(map.get("resultStatus"));
        String str2 = map.get("result");
        a aVarRemove = this.g.remove(str);
        String[] strArr = new String[2];
        strArr[0] = aVarRemove != null ? aVarRemove.c() : "";
        strArr[1] = aVarRemove != null ? aVarRemove.g() : "";
        k(strArr);
        if (map.containsKey(Constants.HYBRID_EXTRA_KEY_CALL_BACK_URL)) {
            return map.get(Constants.HYBRID_EXTRA_KEY_CALL_BACK_URL);
        }
        if (str2.length() > 15) {
            String strK = k(k.i("&callBackUrl=\"", "\"", str2), k.i("&call_back_url=\"", "\"", str2), k.i("&return_url=\"", "\"", str2), URLDecoder.decode(k.i("&return_url=", gv5.CONNECT_STR, str2), "utf-8"), URLDecoder.decode(k.i("&callBackUrl=", gv5.CONNECT_STR, str2), "utf-8"), k.i("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(strK)) {
                return strK;
            }
        }
        if (aVarRemove != null) {
            String strA = zEquals ? aVarRemove.a() : aVarRemove.e();
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        return aVarRemove != null ? com.alipay.sdk.data.a.w().l() : "";
    }

    public final void l(com.alipay.sdk.sys.a aVar, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("tid");
            String strOptString2 = jSONObject.optString("client_key");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            com.alipay.sdk.tid.a.a(com.alipay.sdk.sys.b.a().c()).c(strOptString, strOptString2);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.d(aVar, "biz", "ParserTidClientKeyEx", th);
        }
    }

    public final boolean m(boolean z, boolean z2, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                str2 = "";
                break;
            }
            String str3 = strArr[i2];
            if (!TextUtils.isEmpty(map.get(str3))) {
                str2 = map.get(str3);
                break;
            }
            i2++;
        }
        if (TextUtils.isEmpty(str2)) {
            return !z2;
        }
        if (!z) {
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
            return true;
        }
        sb.append(gv5.CONNECT_STR);
        sb.append(str);
        sb.append("=\"");
        sb.append(str2);
        sb.append("\"");
        return true;
    }

    public synchronized String pay(String str, boolean z) {
        return g(new com.alipay.sdk.sys.a(this.f5812a, str, "pay"), str, z);
    }

    public synchronized boolean payInterceptorWithUrl(String str, final boolean z, final H5PayCallback h5PayCallback) {
        final String strFetchOrderInfoFromH5PayUrl;
        try {
            strFetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
            if (!TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl)) {
                com.alipay.sdk.util.c.f("mspl", "intercepted: " + strFetchOrderInfoFromH5PayUrl);
                new Thread(new Runnable() { // from class: com.alipay.sdk.app.PayTask.1
                    @Override // java.lang.Runnable
                    public void run() {
                        H5PayResultModel h5PayResultModelH5Pay = PayTask.this.h5Pay(new com.alipay.sdk.sys.a(PayTask.this.f5812a, strFetchOrderInfoFromH5PayUrl, "payInterceptorWithUrl"), strFetchOrderInfoFromH5PayUrl, z);
                        com.alipay.sdk.util.c.f("mspl", "inc finished: " + h5PayResultModelH5Pay.a());
                        h5PayCallback.onPayResult(h5PayResultModelH5Pay);
                    }
                }).start();
            }
        } catch (Throwable th) {
            throw th;
        }
        return !TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z) {
        com.alipay.sdk.sys.a aVar;
        aVar = new com.alipay.sdk.sys.a(this.f5812a, str, "payV2");
        return i.c(aVar, g(aVar, str, z));
    }

    public void showLoading() {
        com.alipay.sdk.widget.a aVar = this.f5813b;
        if (aVar != null) {
            aVar.d();
        }
    }
}

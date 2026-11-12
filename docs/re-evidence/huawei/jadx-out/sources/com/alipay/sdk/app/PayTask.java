package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alipay.sdk.R;
import com.alipay.sdk.app.debug.AlipayDebugOptions;
import com.alipay.sdk.m.x.i;
import defpackage.jz;
import defpackage.ka;
import defpackage.mn;
import defpackage.mp;
import defpackage.mu;
import defpackage.mx;
import defpackage.mz;
import defpackage.ng;
import defpackage.nn;
import defpackage.np;
import defpackage.nw;
import defpackage.ob;
import defpackage.of;
import defpackage.og;
import defpackage.oi;
import defpackage.ok;
import defpackage.ol;
import defpackage.on;
import defpackage.oo;
import defpackage.oq;
import defpackage.or;
import defpackage.ot;
import defpackage.ov;
import defpackage.ox;
import defpackage.oy;
import defpackage.pb;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import ohos.ace.plugin.taskmanagerplugin.EventType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class PayTask {
    public static final Object h = i.class;
    public static long i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f2072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ka f2073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2074c = "wappaygw.alipay.com/service/rest.htm";
    public final String d = "mclient.alipay.com/service/rest.htm";
    public final String e = "mclient.alipay.com/home/exterfaceAssign.htm";
    public final String f = "mclient.alipay.com/cashier/mobilepay.htm";
    public Map<String, a> g = new HashMap();

    /* JADX INFO: loaded from: classes21.dex */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f2077c;
        public String e;

        public a() {
            this.e = "";
            this.f2076b = "";
            this.f2077c = "";
            this.f2075a = "";
        }

        public String a() {
            return this.f2076b;
        }

        public String e() {
            return this.e;
        }

        public void b(String str) {
            this.f2077c = str;
        }

        public void c(String str) {
            this.e = str;
        }

        public void d(String str) {
            this.f2075a = str;
        }

        public void e(String str) {
            this.f2076b = str;
        }

        public /* synthetic */ a(PayTask payTask, c cVar) {
            this();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2078a;
        public final /* synthetic */ on e;

        public b(on onVar, String str) {
            this.e = onVar;
            this.f2078a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            PayTask.this.b(this.e, this.f2078a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f2081c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ H5PayCallback e;

        public c(String str, boolean z, H5PayCallback h5PayCallback) {
            this.f2081c = str;
            this.d = z;
            this.e = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            pb pbVarH5Pay = PayTask.this.h5Pay(new on(PayTask.this.f2072a, this.f2081c, "payInterceptorWithUrl"), this.f2081c, this.d);
            oq.c("mspl", "inc finished: " + pbVarH5Pay.d());
            this.e.onPayResult(pbVarH5Pay);
        }
    }

    public class e implements i.f {
        public e() {
        }

        @Override // com.alipay.sdk.m.x.i.f
        public void a() {
            PayTask.this.dismissLoading();
        }

        @Override // com.alipay.sdk.m.x.i.f
        public void b() {
        }
    }

    public PayTask(Activity activity) {
        this.f2072a = activity;
        ol.e().b(this.f2072a);
        this.f2073b = new ka(activity, this.f2072a.getString(R.string.loading_go_pay));
    }

    public static boolean fetchSdkConfig(Context context) {
        synchronized (PayTask.class) {
            try {
                ol.e().b(context);
                long jElapsedRealtime = SystemClock.elapsedRealtime() / 1000;
                if (jElapsedRealtime - i < mx.c().j()) {
                    return false;
                }
                i = jElapsedRealtime;
                mx.c().a(on.d(), context.getApplicationContext(), false, 4);
                return true;
            } catch (Exception e2) {
                oq.c(e2);
                return false;
            }
            throw th;
        }
    }

    public final void b(on onVar, JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("tid");
            String strOptString2 = jSONObject.optString("client_key");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                return;
            }
            ok.a(ol.e().c()).c(strOptString, strOptString2);
        } catch (Throwable th) {
            mu.c(onVar, "biz", "ParserTidClientKeyEx", th);
        }
    }

    public final void c(on onVar, String str) {
        if (onVar.e() && mx.c().c(onVar)) {
            new Thread(new b(onVar, str)).start();
        }
    }

    public void dismissLoading() {
        ka kaVar = this.f2073b;
        if (kaVar != null) {
            kaVar.c();
            this.f2073b = null;
        }
    }

    public String fetchOrderInfoFromH5PayUrl(String str) {
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    String strTrim = str.trim();
                    if (strTrim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || strTrim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                        String strTrim2 = strTrim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                        if (!TextUtils.isEmpty(strTrim2)) {
                            return "_input_charset=\"utf-8\"&ordertoken=\"" + ox.e("<request_token>", "</request_token>", ox.e(strTrim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f2072a) + "\"";
                        }
                    }
                    if (strTrim.startsWith("https://mclient.alipay.com/service/rest.htm") || strTrim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                        String strTrim3 = strTrim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                        if (!TextUtils.isEmpty(strTrim3)) {
                            return "_input_charset=\"utf-8\"&ordertoken=\"" + ox.e("<request_token>", "</request_token>", ox.e(strTrim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f2072a) + "\"";
                        }
                    }
                    if ((strTrim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || strTrim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((strTrim.contains("alipay.wap.create.direct.pay.by.user") || strTrim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(strTrim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", str);
                        jSONObject.put("bizcontext", a(this.f2072a));
                        return "new_external_info==" + jSONObject.toString();
                    }
                    c cVar = null;
                    if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                        String strE = ox.e("?", "", str);
                        if (!TextUtils.isEmpty(strE)) {
                            Map<String, String> mapE = ox.e(strE);
                            StringBuilder sb = new StringBuilder();
                            if (a(false, true, "trade_no", sb, mapE, "trade_no", "alipay_trade_no")) {
                                a(true, false, "pay_phase_id", sb, mapE, "payPhaseId", "pay_phase_id", "out_relation_id");
                                sb.append("&biz_sub_type=\"TRADE\"");
                                sb.append("&biz_type=\"trade\"");
                                String str2 = mapE.get("app_name");
                                if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(mapE.get("cid"))) {
                                    str2 = "ali1688";
                                } else if (TextUtils.isEmpty(str2) && (!TextUtils.isEmpty(mapE.get(CmcdConfiguration.KEY_SESSION_ID)) || !TextUtils.isEmpty(mapE.get("s_id")))) {
                                    str2 = "tb";
                                }
                                sb.append("&app_name=\"" + str2 + "\"");
                                if (!a(true, true, "extern_token", sb, mapE, "extern_token", "cid", CmcdConfiguration.KEY_SESSION_ID, "s_id")) {
                                    return "";
                                }
                                a(true, false, "appenv", sb, mapE, "appenv");
                                sb.append("&pay_channel_id=\"alipay_sdk\"");
                                a aVar = new a(this, cVar);
                                aVar.c(mapE.get("return_url"));
                                aVar.e(mapE.get("show_url"));
                                aVar.b(mapE.get("pay_order_id"));
                                String str3 = sb.toString() + "&bizcontext=\"" + a(this.f2072a) + "\"";
                                this.g.put(str3, aVar);
                                return str3;
                            }
                        }
                    }
                    if (!strTrim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !strTrim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!EnvUtils.b() || !strTrim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                        if (mx.c().m() && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(strTrim).find()) {
                            Uri uri = Uri.parse(strTrim);
                            String queryParameter = uri.getQueryParameter("return_url");
                            String queryParameter2 = uri.getQueryParameter("show_url");
                            String queryParameter3 = uri.getQueryParameter("pay_order_id");
                            String strA = a(uri.getQueryParameter("trade_nos"), uri.getQueryParameter("alipay_trade_no"));
                            String strA2 = a(uri.getQueryParameter("payPhaseId"), uri.getQueryParameter("pay_phase_id"), uri.getQueryParameter("out_relation_id"));
                            String strA3 = a(uri.getQueryParameter("app_name"), !TextUtils.isEmpty(uri.getQueryParameter("cid")) ? "ali1688" : "", !TextUtils.isEmpty(uri.getQueryParameter(CmcdConfiguration.KEY_SESSION_ID)) ? "tb" : "", !TextUtils.isEmpty(uri.getQueryParameter("s_id")) ? "tb" : "");
                            String strA4 = a(uri.getQueryParameter("extern_token"), uri.getQueryParameter("cid"), uri.getQueryParameter(CmcdConfiguration.KEY_SESSION_ID), uri.getQueryParameter("s_id"));
                            String strA5 = a(uri.getQueryParameter("appenv"));
                            if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strA3) && !TextUtils.isEmpty(strA4)) {
                                String str4 = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", strA, strA2, strA3, strA4, strA5, a(this.f2072a));
                                a aVar2 = new a(this, cVar);
                                aVar2.c(queryParameter);
                                aVar2.e(queryParameter2);
                                aVar2.b(queryParameter3);
                                aVar2.d(strA);
                                this.g.put(str4, aVar2);
                                return str4;
                            }
                        }
                    }
                    String strA6 = a(this.f2072a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("url", strTrim);
                    jSONObject2.put("bizcontext", strA6);
                    return String.format("new_external_info==%s", jSONObject2.toString());
                }
            } catch (Throwable th) {
                oq.c(th);
            }
            return "";
        }
    }

    public String fetchTradeToken() {
        String strA;
        synchronized (this) {
            strA = ot.a(new on(this.f2072a, "", "fetchTradeToken"), this.f2072a.getApplicationContext());
        }
        return strA;
    }

    public String getVersion() {
        return "15.8.35";
    }

    public pb h5Pay(on onVar, String str, boolean z) {
        pb pbVar;
        synchronized (this) {
            pbVar = new pb();
            try {
                String[] strArrSplit = a(onVar, str, z).split(";");
                HashMap map = new HashMap();
                for (String str2 : strArrSplit) {
                    int iIndexOf = str2.indexOf("={");
                    if (iIndexOf >= 0) {
                        String strSubstring = str2.substring(0, iIndexOf);
                        map.put(strSubstring, a(str2, strSubstring));
                    }
                }
                if (map.containsKey("resultStatus")) {
                    pbVar.e(map.get("resultStatus"));
                }
                pbVar.b(a(str, map));
                if (TextUtils.isEmpty(pbVar.b())) {
                    mu.e(onVar, "biz", "H5CbUrlEmpty", "");
                }
            } catch (Throwable th) {
                mu.c(onVar, "biz", "H5CbEx", th);
                oq.c(th);
            }
        }
        return pbVar;
    }

    public String pay(String str, boolean z) {
        synchronized (this) {
            if (oo.b()) {
                return mp.b();
            }
            return a(new on(this.f2072a, str, "pay"), str, z);
        }
    }

    public boolean payInterceptorWithUrl(String str, boolean z, H5PayCallback h5PayCallback) {
        boolean zIsEmpty;
        synchronized (this) {
            String strFetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
            if (!TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl)) {
                oq.c("mspl", "intercepted: " + strFetchOrderInfoFromH5PayUrl);
                new Thread(new c(strFetchOrderInfoFromH5PayUrl, z, h5PayCallback)).start();
            }
            zIsEmpty = TextUtils.isEmpty(strFetchOrderInfoFromH5PayUrl);
        }
        return !zIsEmpty;
    }

    public Map<String, String> payV2(String str, boolean z) {
        String strA;
        on onVar;
        Map<String, String> mapD;
        synchronized (this) {
            if (oo.b()) {
                strA = mp.b();
                onVar = null;
            } else {
                on onVar2 = new on(this.f2072a, str, "payV2");
                strA = a(onVar2, str, z);
                onVar = onVar2;
            }
            mapD = ov.d(onVar, strA);
        }
        return mapD;
    }

    public void showLoading() {
        ka kaVar = this.f2073b;
        if (kaVar != null) {
            kaVar.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x034a A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:131:? A[ADDED_TO_REGION, Catch: all -> 0x0369, REMOVE, SYNTHETIC, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f5 A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x015a A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x017c A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d1 A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01db A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0236 A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0258 A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02c3 A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02cd A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0328 A[Catch: all -> 0x0369, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x0008, B:8:0x0012, B:10:0x0027, B:11:0x002b, B:13:0x004c, B:15:0x0055, B:16:0x0058, B:18:0x005c, B:20:0x0064, B:21:0x0071, B:23:0x0079, B:26:0x00c0, B:28:0x00ca, B:35:0x00f2, B:36:0x00f5, B:38:0x00ff, B:39:0x010d, B:41:0x015a, B:42:0x0167, B:44:0x017c, B:46:0x0182, B:79:0x026d, B:50:0x018f, B:80:0x0276, B:54:0x019c, B:56:0x01a6, B:63:0x01ce, B:64:0x01d1, B:66:0x01db, B:67:0x01e9, B:69:0x0236, B:70:0x0243, B:72:0x0258, B:74:0x025e, B:78:0x026a, B:84:0x028e, B:86:0x0298, B:93:0x02c0, B:94:0x02c3, B:96:0x02cd, B:97:0x02db, B:99:0x0328, B:100:0x0335, B:102:0x034a, B:104:0x0350, B:109:0x035f, B:108:0x035c, B:110:0x0368, B:12:0x0047, B:30:0x00d6, B:32:0x00e8, B:25:0x0089, B:75:0x0263, B:105:0x0355, B:58:0x01b2, B:60:0x01c4, B:53:0x0195, B:47:0x0187, B:88:0x02a4, B:90:0x02b6), top: B:120:0x0001, inners: #0, #1, #2, #4, #5, #6, #7, #8 }] */
    public final String a(on onVar, String str, boolean z) {
        String strD;
        AlipayDebugOptions alipayDebugOptions;
        AlipayDebugOptions alipayDebugOptions2;
        JSONObject jSONObject;
        AlipayDebugOptions alipayDebugOptions3;
        synchronized (this) {
            boolean z2 = jz.f39239a;
            if (z) {
                showLoading();
            }
            if (str.contains("payment_inst=")) {
                String strSubstring = str.substring(str.indexOf("payment_inst=") + 13);
                int iIndexOf = strSubstring.indexOf(38);
                if (iIndexOf > 0) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
                mn.c(strSubstring.replaceAll("\"", "").toLowerCase(Locale.getDefault()).replaceAll("alipay", ""));
            } else {
                mn.c("");
            }
            if (str.contains("service=alipay.acquire.mr.ord.createandpay")) {
                mz.e = true;
            }
            if (mz.e) {
                if (str.startsWith("https://wappaygw.alipay.com/home/exterfaceAssign.htm?")) {
                    str = str.substring(str.indexOf("https://wappaygw.alipay.com/home/exterfaceAssign.htm?") + 53);
                } else if (str.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm?")) {
                    str = str.substring(str.indexOf("https://mclient.alipay.com/home/exterfaceAssign.htm?") + 52);
                }
            }
            strD = "";
            try {
                oq.c("mspl", "pay prepared: " + str);
                strD = a(str, onVar);
                oq.c("mspl", "pay raw result: " + strD);
                ot.d(onVar, this.f2072a.getApplicationContext(), strD);
                if (!mx.c().a(onVar)) {
                    String strC = ov.c(strD, "externalSdkData");
                    if (!TextUtils.isEmpty(strC)) {
                        try {
                            String strOptString = new JSONObject(strC).optString("preheatUserToken");
                            if (!TextUtils.isEmpty(strOptString)) {
                                or.c(onVar, this.f2072a, "sp_preheatUserToken", strOptString);
                                if (mx.c().e((on) null)) {
                                    np.e().c();
                                    np.e().a();
                                }
                                mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                                mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                                if (!mx.c().x()) {
                                    mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                                }
                                dismissLoading();
                                a(onVar);
                                mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                                alipayDebugOptions3 = jz.e;
                                if (alipayDebugOptions3 != null && alipayDebugOptions3.e() != null) {
                                    jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("isHitPreHeatApp", z2);
                                    } catch (Throwable th) {
                                        oq.c(th);
                                    }
                                    jz.e.e().onPayEnd(jSONObject);
                                }
                            } else {
                                if (mx.c().e((on) null)) {
                                    np.e().c();
                                    np.e().a();
                                }
                                mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                                mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                                if (!mx.c().x()) {
                                    mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                                }
                                dismissLoading();
                                a(onVar);
                                mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                                alipayDebugOptions3 = jz.e;
                                if (alipayDebugOptions3 != null) {
                                    jSONObject = new JSONObject();
                                    jSONObject.put("isHitPreHeatApp", z2);
                                    jz.e.e().onPayEnd(jSONObject);
                                }
                            }
                        } catch (Throwable th2) {
                            oq.c(th2);
                        }
                    } else {
                        if (mx.c().e((on) null)) {
                            np.e().c();
                            np.e().a();
                        }
                        mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                        mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                        if (!mx.c().x()) {
                            mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                        }
                        dismissLoading();
                        a(onVar);
                        mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                        alipayDebugOptions3 = jz.e;
                        if (alipayDebugOptions3 != null) {
                            jSONObject = new JSONObject();
                            jSONObject.put("isHitPreHeatApp", z2);
                            jz.e.e().onPayEnd(jSONObject);
                        }
                    }
                } else {
                    if (mx.c().e((on) null)) {
                        np.e().c();
                        np.e().a();
                    }
                    mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                    mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                    if (!mx.c().x()) {
                        mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                    }
                    dismissLoading();
                    a(onVar);
                    mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                    alipayDebugOptions3 = jz.e;
                    if (alipayDebugOptions3 != null) {
                        jSONObject = new JSONObject();
                        jSONObject.put("isHitPreHeatApp", z2);
                        jz.e.e().onPayEnd(jSONObject);
                    }
                }
            } catch (Throwable th3) {
                try {
                    strD = mp.d();
                    oq.c(th3);
                    if (!mx.c().a(onVar)) {
                        String strC2 = ov.c(strD, "externalSdkData");
                        if (!TextUtils.isEmpty(strC2)) {
                            try {
                                String strOptString2 = new JSONObject(strC2).optString("preheatUserToken");
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    or.c(onVar, this.f2072a, "sp_preheatUserToken", strOptString2);
                                    if (mx.c().e((on) null)) {
                                        np.e().c();
                                        np.e().a();
                                    }
                                    mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                                    mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                                    if (!mx.c().x()) {
                                        mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                                    }
                                    dismissLoading();
                                    a(onVar);
                                    mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                                    alipayDebugOptions2 = jz.e;
                                    if (alipayDebugOptions2 != null && alipayDebugOptions2.e() != null) {
                                        jSONObject = new JSONObject();
                                        try {
                                            jSONObject.put("isHitPreHeatApp", z2);
                                        } catch (Throwable th4) {
                                            oq.c(th4);
                                        }
                                    }
                                } else {
                                    if (mx.c().e((on) null)) {
                                        np.e().c();
                                        np.e().a();
                                    }
                                    mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                                    mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                                    if (!mx.c().x()) {
                                        mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                                    }
                                    dismissLoading();
                                    a(onVar);
                                    mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                                    alipayDebugOptions2 = jz.e;
                                    if (alipayDebugOptions2 != null) {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("isHitPreHeatApp", z2);
                                    }
                                }
                            } catch (Throwable th5) {
                                oq.c(th5);
                            }
                        } else {
                            if (mx.c().e((on) null)) {
                                np.e().c();
                                np.e().a();
                            }
                            mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                            mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                            if (!mx.c().x()) {
                                mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                            }
                            dismissLoading();
                            a(onVar);
                            mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                            alipayDebugOptions2 = jz.e;
                            if (alipayDebugOptions2 != null) {
                                jSONObject = new JSONObject();
                                jSONObject.put("isHitPreHeatApp", z2);
                            }
                        }
                    } else {
                        if (mx.c().e((on) null)) {
                            np.e().c();
                            np.e().a();
                        }
                        mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                        mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                        if (!mx.c().x()) {
                            mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                        }
                        dismissLoading();
                        a(onVar);
                        mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                        alipayDebugOptions2 = jz.e;
                        if (alipayDebugOptions2 != null) {
                            jSONObject = new JSONObject();
                            jSONObject.put("isHitPreHeatApp", z2);
                        }
                    }
                } catch (Throwable th6) {
                    if (!mx.c().a(onVar)) {
                        String strC3 = ov.c(strD, "externalSdkData");
                        if (!TextUtils.isEmpty(strC3)) {
                            try {
                                String strOptString3 = new JSONObject(strC3).optString("preheatUserToken");
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    or.c(onVar, this.f2072a, "sp_preheatUserToken", strOptString3);
                                    if (mx.c().e((on) null)) {
                                        np.e().c();
                                        np.e().a();
                                    }
                                    mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                                    mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                                    if (!mx.c().x()) {
                                        mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                                    }
                                    dismissLoading();
                                    a(onVar);
                                    mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                                    alipayDebugOptions = jz.e;
                                    if (alipayDebugOptions == null && alipayDebugOptions.e() != null) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            jSONObject2.put("isHitPreHeatApp", z2);
                                        } catch (Throwable th7) {
                                            oq.c(th7);
                                        }
                                        jz.e.e().onPayEnd(jSONObject2);
                                        throw th6;
                                    }
                                    throw th6;
                                }
                                if (mx.c().e((on) null)) {
                                    np.e().c();
                                    np.e().a();
                                }
                                mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                                mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                                if (!mx.c().x()) {
                                    mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                                }
                                dismissLoading();
                                a(onVar);
                                mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                                alipayDebugOptions = jz.e;
                                if (alipayDebugOptions == null) {
                                    throw th6;
                                }
                                throw th6;
                            } catch (Throwable th8) {
                                oq.c(th8);
                            }
                        } else {
                            if (mx.c().e((on) null)) {
                                np.e().c();
                                np.e().a();
                            }
                            mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                            mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                            if (!mx.c().x()) {
                                mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                            }
                            dismissLoading();
                            a(onVar);
                            mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                            alipayDebugOptions = jz.e;
                            if (alipayDebugOptions == null) {
                                throw th6;
                            }
                            throw th6;
                        }
                    } else {
                        if (mx.c().e((on) null)) {
                            np.e().c();
                            np.e().a();
                        }
                        mu.d(onVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                        mu.d(onVar, "biz", "PgReturnV", ov.a(strD, "resultStatus") + "|" + ov.a(strD, "memo"));
                        if (!mx.c().x()) {
                            mx.c().a(onVar, this.f2072a.getApplicationContext(), false, 3);
                        }
                        dismissLoading();
                        a(onVar);
                        mu.b(this.f2072a.getApplicationContext(), onVar, str, onVar.f44353a);
                        alipayDebugOptions = jz.e;
                        if (alipayDebugOptions == null) {
                            throw th6;
                        }
                        throw th6;
                    }
                }
            }
            oq.c("mspl", "pay returning: " + strD);
        }
        return strD;
    }

    public final void b(on onVar, String str) {
        oq.b("mspl", "requestPreheatPay");
        mu.d(onVar, "biz", "requestPreheatStart", onVar.g());
        try {
            oq.b("mspl", "requestPreheatPay respData:" + new og().a(onVar, this.f2072a.getApplicationContext(), str).c());
        } catch (Throwable th) {
            oq.c(th);
            mu.c(onVar, "biz", "requestPreheatError", th);
        }
        mu.d(onVar, "biz", "requestPreheatEnd", onVar.g());
    }

    public final void a(on onVar) {
        WeakReference<Context> weakReference;
        if (mx.c().b(onVar)) {
            return;
        }
        oq.c("mspl", "unbindRegisterAppService registerAppServiceConnectSuccess=" + jz.f39239a);
        mu.d(onVar, "biz", "registerApp", "unbindServiceStart");
        if (jz.f39240c != null && jz.f39239a && (weakReference = jz.d) != null && weakReference.get() != null) {
            try {
                jz.d.get().unbindService(jz.f39240c);
                mu.d(onVar, "biz", "registerApp", "unbindServiceEnd");
            } catch (Throwable th) {
                oq.c(th);
                mu.c(onVar, "wr", "registerAppUnbindServiceError", th);
            }
        }
        jz.d = null;
        jz.f39239a = false;
        jz.f39240c = null;
    }

    public static String a(Context context) {
        String str;
        String str2;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                str2 = packageInfo.packageName;
            } catch (Exception e2) {
                e = e2;
                oq.c(e);
                str2 = "";
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "and_lite");
            jSONObject.put("sv", "h.a.3.8.35");
            jSONObject.put("an", str2);
            jSONObject.put(CmcdData.Factory.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO, str);
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            if (!TextUtils.isEmpty("sc")) {
                jSONObject.put("sc", "h5tonative");
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            oq.c(th);
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

    public final boolean a(boolean z, boolean z2, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
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
        if (z) {
            sb.append("&");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
            return true;
        }
        sb.append(str);
        sb.append("=\"");
        sb.append(str2);
        sb.append("\"");
        return true;
    }

    public final String a(String str, Map<String, String> map) throws UnsupportedEncodingException {
        boolean zEquals = "9000".equals(map.get("resultStatus"));
        String str2 = map.get("result");
        a aVarRemove = this.g.remove(str);
        if (map.containsKey("callBackUrl")) {
            return map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String strA = a(ox.e("&callBackUrl=\"", "\"", str2), ox.e("&call_back_url=\"", "\"", str2), ox.e("&return_url=\"", "\"", str2), URLDecoder.decode(ox.e("&return_url=", "&", str2), "utf-8"), URLDecoder.decode(ox.e("&callBackUrl=", "&", str2), "utf-8"), ox.e("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        if (aVarRemove != null) {
            String strE = zEquals ? aVarRemove.e() : aVarRemove.a();
            if (!TextUtils.isEmpty(strE)) {
                return strE;
            }
        }
        if (aVarRemove != null) {
            return mx.c().w();
        }
        return "";
    }

    public final String a(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }

    public final i.f a() {
        return new e();
    }

    public final String a(String str, on onVar) {
        String strB = onVar.b(str);
        oq.b("mspl", "payResult orderInfo=" + strB);
        if (strB.contains("paymethod=\"expressGateway\"")) {
            return a(onVar, strB);
        }
        List<mx.d> listP = mx.c().p();
        if (!mx.c().o || listP == null) {
            listP = mn.e;
        }
        if (ox.d(onVar, this.f2072a, listP, true)) {
            i iVar = new i(this.f2072a, onVar, a());
            oq.c("mspl", "pay inner started: " + strB);
            c(onVar, strB);
            String strB2 = iVar.b(strB, false);
            if (!TextUtils.isEmpty(strB2)) {
                if (strB2.contains("resultStatus={" + com.alipay.sdk.m.l.c.ACTIVITY_NOT_START_EXIT.b() + "}")) {
                    ox.b("alipaySdk", "startActivityEx", this.f2072a, onVar);
                    strB2 = iVar.b(strB, true);
                }
            }
            oq.c("mspl", "pay inner raw result: " + strB2);
            iVar.b();
            boolean zAb = mx.c().ab();
            if (!TextUtils.equals(strB2, EventType.FAILED) && !TextUtils.equals(strB2, "scheme_failed") && (!zAb || !onVar.h())) {
                if (TextUtils.isEmpty(strB2)) {
                    return mp.d();
                }
                if (!strB2.contains("{\"isLogin\":\"false\"}")) {
                    return strB2;
                }
                mu.b(onVar, "biz", "LogHkLoginByIntent");
                return a(onVar, strB, listP, strB2, this.f2072a);
            }
            mu.b(onVar, "biz", "LogBindCalledH5");
            return a(onVar, strB);
        }
        mu.b(onVar, "biz", "LogCalledH5");
        return a(onVar, strB);
    }

    public static String a(on onVar, String str, List<mx.d> list, String str2, Activity activity) {
        ox.d dVarC = ox.c(onVar, activity, list);
        if (dVarC == null || dVarC.d(onVar) || dVarC.a() || !TextUtils.equals(dVarC.e.packageName, "hk.alipay.wallet")) {
            return str2;
        }
        oq.b("mspl", "PayTask not_login");
        String strValueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap<String, Object> map = PayResultActivity.f2069a;
        map.put(strValueOf, obj);
        Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
        intent.putExtra("orderSuffix", str);
        intent.putExtra("externalPkgName", activity.getPackageName());
        intent.putExtra("phonecashier.pay.hash", strValueOf);
        on.b.d(onVar, intent);
        activity.startActivity(intent);
        synchronized (map.get(strValueOf)) {
            try {
                oq.b("mspl", "PayTask wait");
                map.get(strValueOf).wait();
            } catch (InterruptedException unused) {
                oq.b("mspl", "PayTask interrupted");
                return mp.d();
            }
        }
        String str3 = PayResultActivity.a.f2070b;
        oq.b("mspl", "PayTask ret: " + str3);
        return str3;
    }

    public final String a(on onVar, String str) {
        nw nwVarA;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        showLoading();
        com.alipay.sdk.m.l.c cVarA = null;
        try {
            try {
                try {
                    mu.b(onVar, "biz", "h5CashierRequest");
                    if (mx.c().e(onVar)) {
                        np.e().e(onVar);
                        nwVarA = new ob().a(onVar, this.f2072a.getApplicationContext(), str, oy.e());
                    } else {
                        nwVarA = new oi().a(onVar, this.f2072a.getApplicationContext(), str);
                    }
                    JSONObject jSONObjectC = nwVarA.c();
                    mu.b(onVar, "biz", "h5CashierResponse");
                    String strOptString = jSONObjectC.optString("end_code", null);
                    JSONObject jSONObjectOptJSONObject3 = (!mx.c().e((on) null) || (jSONObjectOptJSONObject = jSONObjectC.optJSONObject("data")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("form")) == null) ? null : jSONObjectOptJSONObject2.optJSONObject("onload");
                    if (jSONObjectOptJSONObject3 == null) {
                        jSONObjectOptJSONObject3 = jSONObjectC.optJSONObject("form").optJSONObject("onload");
                    }
                    List<of> listC = of.c(jSONObjectOptJSONObject3);
                    for (int i2 = 0; i2 < listC.size(); i2++) {
                        if (listC.get(i2).e() == com.alipay.sdk.m.u.a.Update) {
                            of.e(listC.get(i2));
                        }
                    }
                    b(onVar, jSONObjectC);
                    dismissLoading();
                    mu.d(this.f2072a, onVar, str, onVar.f44353a);
                    for (int i3 = 0; i3 < listC.size(); i3++) {
                        of ofVar = listC.get(i3);
                        if (ofVar.e() == com.alipay.sdk.m.u.a.WapPay) {
                            String strA = a(onVar, ofVar);
                            dismissLoading();
                            mu.d(this.f2072a, onVar, str, onVar.f44353a);
                            return strA;
                        }
                        if (ofVar.e() == com.alipay.sdk.m.u.a.OpenWeb) {
                            String strA2 = a(onVar, ofVar, strOptString);
                            dismissLoading();
                            mu.d(this.f2072a, onVar, str, onVar.f44353a);
                            return strA2;
                        }
                        if (mx.c().e((on) null) && ofVar.e() == com.alipay.sdk.m.u.a.LocalWebPay) {
                            String strA3 = a(onVar, jSONObjectC);
                            dismissLoading();
                            mu.d(this.f2072a, onVar, str, onVar.f44353a);
                            return strA3;
                        }
                    }
                    dismissLoading();
                    mu.d(this.f2072a, onVar, str, onVar.f44353a);
                } catch (Throwable th) {
                    oq.c(th);
                    mu.c(onVar, "biz", "H5PayDataAnalysisError", th);
                    dismissLoading();
                    mu.d(this.f2072a, onVar, str, onVar.f44353a);
                }
            } catch (IOException e2) {
                cVarA = com.alipay.sdk.m.l.c.a(com.alipay.sdk.m.l.c.NETWORK_ERROR.b());
                mu.c(onVar, "net", e2);
                dismissLoading();
                mu.d(this.f2072a, onVar, str, onVar.f44353a);
            }
            if (cVarA == null) {
                cVarA = com.alipay.sdk.m.l.c.a(com.alipay.sdk.m.l.c.FAILED.b());
            }
            return mp.d(cVarA.b(), cVarA.a(), "");
        } catch (Throwable th2) {
            dismissLoading();
            mu.d(this.f2072a, onVar, str, onVar.f44353a);
            throw th2;
        }
    }

    public final String a(on onVar, JSONObject jSONObject) {
        oq.b("mspl", "processLocalWebPay");
        Intent intent = new Intent(this.f2072a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data").optJSONObject("local_web_pay_data");
            String strOptString = jSONObjectOptJSONObject.optString("h5_cashier_url");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("h5_local_data");
            String strOptString2 = jSONObjectOptJSONObject2.optString("sha256", "");
            String strOptString3 = jSONObjectOptJSONObject2.optString("source_url", "");
            String strOptString4 = jSONObjectOptJSONObject2.optString("update_strategy");
            np.e().c(new nn(strOptString2, strOptString3, strOptString4));
            mu.d(onVar, "biz", "h5LocalDataUpdateStrategy", strOptString4);
            intent.putExtra("url", strOptString);
            intent.putExtra("version", "v1");
            intent.putExtra("cashierBizData", jSONObject.toString());
            on.b.d(onVar, intent);
            this.f2072a.startActivity(intent);
            Object obj = h;
            synchronized (obj) {
                try {
                    obj.wait();
                } catch (InterruptedException e2) {
                    oq.c(e2);
                    return mp.d();
                }
            }
            String strA = mp.a();
            return TextUtils.isEmpty(strA) ? mp.d() : strA;
        } catch (Throwable th) {
            oq.c(th);
            mu.c(onVar, "biz", "processLocalWebPay", th);
            return mp.d();
        }
    }

    public final String a(on onVar, of ofVar, String str) {
        boolean zC;
        String strA;
        String[] strArrC = ofVar.c();
        Intent intent = new Intent(this.f2072a, (Class<?>) H5PayActivity.class);
        try {
            JSONObject jSONObjectJ = ox.j(new String(ng.a(strArrC[2])));
            intent.putExtra("url", strArrC[0]);
            intent.putExtra("title", strArrC[1]);
            intent.putExtra("version", "v2");
            intent.putExtra("method", jSONObjectJ.optString("method", "POST"));
            mp.a(false);
            mp.e(null);
            on.b.d(onVar, intent);
            this.f2072a.startActivity(intent);
            Object obj = h;
            synchronized (obj) {
                try {
                    obj.wait();
                    zC = mp.c();
                    strA = mp.a();
                    mp.a(false);
                    mp.e(null);
                } catch (InterruptedException e2) {
                    oq.c(e2);
                    return mp.d();
                }
            }
            String strD = "";
            if (zC) {
                try {
                    List<of> listC = of.c(ox.j(new String(ng.a(strA))));
                    for (int i2 = 0; i2 < listC.size(); i2++) {
                        of ofVar2 = listC.get(i2);
                        if (ofVar2.e() == com.alipay.sdk.m.u.a.SetResult) {
                            String[] strArrC2 = ofVar2.c();
                            strD = mp.d(Integer.valueOf(strArrC2[1]).intValue(), strArrC2[0], ox.c(onVar, strArrC2[2]));
                            break;
                        }
                    }
                } catch (Throwable th) {
                    oq.c(th);
                    mu.e(onVar, "biz", "H5PayDataAnalysisError", th, strA);
                }
            }
            if (!TextUtils.isEmpty(strD)) {
                return strD;
            }
            try {
                return mp.d(Integer.valueOf(str).intValue(), "", "");
            } catch (Throwable th2) {
                mu.e(onVar, "biz", "H5PayDataAnalysisError", th2, "endCode: " + str);
                return mp.d(8000, "", "");
            }
        } catch (Throwable th3) {
            oq.c(th3);
            mu.e(onVar, "biz", "H5PayDataAnalysisError", th3, Arrays.toString(strArrC));
            return mp.d();
        }
    }

    public final String a(on onVar, of ofVar) {
        String[] strArrC = ofVar.c();
        Intent intent = new Intent(this.f2072a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrC[0]);
        if (strArrC.length == 2) {
            bundle.putString("cookie", strArrC[1]);
        }
        intent.putExtras(bundle);
        on.b.d(onVar, intent);
        this.f2072a.startActivity(intent);
        Object obj = h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e2) {
                oq.c(e2);
                return mp.d();
            }
        }
        String strA = mp.a();
        return TextUtils.isEmpty(strA) ? mp.d() : strA;
    }
}

package com.unicom.online.account.kernel;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.webkit.ProxyConfig;
import com.huawei.hms.network.embedded.w9;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f31138a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f31139b = false;

    /* JADX WARN: Code duplicated, block: B:105:0x0332  */
    /* JADX WARN: Code duplicated, block: B:129:0x03f9 A[Catch: Exception -> 0x0438, all -> 0x0458, TRY_LEAVE, TryCatch #5 {Exception -> 0x0438, blocks: (B:123:0x0381, B:127:0x03a7, B:129:0x03f9), top: B:210:0x0338 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0401  */
    /* JADX WARN: Code duplicated, block: B:134:0x040c A[Catch: Exception -> 0x0436, all -> 0x0475, TryCatch #7 {Exception -> 0x0436, blocks: (B:132:0x0407, B:134:0x040c, B:136:0x0417), top: B:213:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0417 A[Catch: Exception -> 0x0436, all -> 0x0475, TRY_LEAVE, TryCatch #7 {Exception -> 0x0436, blocks: (B:132:0x0407, B:134:0x040c, B:136:0x0417), top: B:213:0x03f7 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x048c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x04a5 A[Catch: all -> 0x0475, Exception -> 0x04af, TRY_LEAVE, TryCatch #0 {Exception -> 0x04af, blocks: (B:161:0x0486, B:164:0x048e, B:166:0x04a5), top: B:200:0x0486 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:206:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x015c A[Catch: all -> 0x0475, Exception -> 0x0478, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0478, blocks: (B:53:0x013b, B:59:0x015c), top: B:211:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0192 A[Catch: Exception -> 0x0471, all -> 0x0475, TryCatch #11 {Exception -> 0x0471, blocks: (B:61:0x0164, B:63:0x0192, B:64:0x019a, B:66:0x01a0, B:67:0x01b4), top: B:220:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0 A[Catch: Exception -> 0x0471, all -> 0x0475, LOOP:0: B:64:0x019a->B:66:0x01a0, LOOP_END, TryCatch #11 {Exception -> 0x0471, blocks: (B:61:0x0164, B:63:0x0192, B:64:0x019a, B:66:0x01a0, B:67:0x01b4), top: B:220:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x02cf A[Catch: Exception -> 0x043b, all -> 0x0458, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x043b, blocks: (B:73:0x0201, B:76:0x026e, B:78:0x0277, B:83:0x02cf), top: B:226:0x0201 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x02d9 A[Catch: Exception -> 0x0322, all -> 0x0458, TRY_LEAVE, TryCatch #16 {, blocks: (B:71:0x01dc, B:72:0x01ff, B:73:0x0201, B:76:0x026e, B:78:0x0277, B:81:0x02b2, B:83:0x02cf, B:84:0x02d3, B:86:0x02d9, B:88:0x02e3, B:90:0x02eb, B:96:0x0307, B:98:0x031a, B:99:0x031d, B:110:0x033f, B:114:0x0349, B:116:0x0356, B:119:0x0368, B:122:0x0376, B:123:0x0381, B:127:0x03a7, B:129:0x03f9), top: B:224:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0307 A[Catch: Exception -> 0x0301, all -> 0x0458, TryCatch #16 {, blocks: (B:71:0x01dc, B:72:0x01ff, B:73:0x0201, B:76:0x026e, B:78:0x0277, B:81:0x02b2, B:83:0x02cf, B:84:0x02d3, B:86:0x02d9, B:88:0x02e3, B:90:0x02eb, B:96:0x0307, B:98:0x031a, B:99:0x031d, B:110:0x033f, B:114:0x0349, B:116:0x0356, B:119:0x0368, B:122:0x0376, B:123:0x0381, B:127:0x03a7, B:129:0x03f9), top: B:224:0x01dc }] */
    /* JADX WARN: Code duplicated, block: B:98:0x031a A[Catch: Exception -> 0x0301, all -> 0x0458, TryCatch #16 {, blocks: (B:71:0x01dc, B:72:0x01ff, B:73:0x0201, B:76:0x026e, B:78:0x0277, B:81:0x02b2, B:83:0x02cf, B:84:0x02d3, B:86:0x02d9, B:88:0x02e3, B:90:0x02eb, B:96:0x0307, B:98:0x031a, B:99:0x031d, B:110:0x033f, B:114:0x0349, B:116:0x0356, B:119:0x0368, B:122:0x0376, B:123:0x0381, B:127:0x03a7, B:129:0x03f9), top: B:224:0x01dc }] */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x05a1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v30, types: [long] */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.unicom.online.account.kernel.aa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.unicom.online.account.kernel.aa] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.unicom.online.account.kernel.aa] */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.HashMap, java.util.HashMap<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Context context, String str, HashMap<String, String> map, Object obj) {
        String host;
        String strA;
        String str2;
        boolean z;
        StringBuilder sb;
        String str3;
        ?? r14;
        String strA2;
        ?? r4;
        ?? r2;
        HttpsURLConnection httpsURLConnection;
        ?? r1;
        String message;
        URL url;
        HttpsURLConnection httpsURLConnection2;
        HttpsURLConnection httpsURLConnection3;
        HttpsURLConnection httpsURLConnection4;
        g gVar;
        StringBuilder sb2;
        int responseCode;
        String string;
        String str4;
        JSONObject jSONObject;
        String str5;
        String strReplaceFirst;
        ?? r3 = this;
        String strReplaceFirst2 = str;
        obj = obj;
        String str6 = "ret_url";
        System.currentTimeMillis();
        String strG = i.g();
        try {
            host = new URL(strReplaceFirst2).getHost();
        } catch (MalformedURLException e) {
            aj.a(e);
            host = "";
        }
        String str7 = host;
        if (str7.contains(i.d()) && f31139b && f31138a) {
            if (TextUtils.isEmpty(ak.f31167a)) {
                strReplaceFirst = strReplaceFirst2;
            } else {
                String strD = i.d();
                strA = a(ak.f31167a);
                strReplaceFirst = strReplaceFirst2.replaceFirst(strD, strA);
            }
            f31139b = false;
            strReplaceFirst2 = strReplaceFirst;
        }
        if (ac.b()) {
            try {
                d dVarI = ak.i(str7);
                try {
                    if (dVarI == null) {
                        strA = "msg";
                        str2 = "code";
                        ak.a((Context) context, str7);
                        sb = new StringBuilder("DNS cache add domain = ");
                        sb.append(str7);
                        sb.append("\n");
                    } else if (!ak.a(str7) || dVarI.f31182b == null || dVarI.f31182b.length() <= 0) {
                        strA = "msg";
                        str2 = "code";
                        z = false;
                    } else {
                        strA = "msg";
                        str2 = "code";
                        if (dVarI.f31183c > System.currentTimeMillis()) {
                            strReplaceFirst2 = strReplaceFirst2.replaceFirst(str7, a(dVarI.f31182b));
                            ak.p.add(dVarI.f31182b);
                            try {
                                aj.a("DNS cache use domain = " + str7 + "\n");
                                z = true;
                            } catch (Exception e2) {
                                e = e2;
                                z = true;
                                aj.a("DNS cache catch error = " + e.getMessage() + "\n");
                                strReplaceFirst2 = strReplaceFirst2;
                            }
                        } else {
                            ak.b((Context) context, str7);
                            sb = new StringBuilder("DNS cache expire,clean domain = ");
                            sb.append(str7);
                            sb.append("\n");
                        }
                    }
                    aj.a(sb.toString());
                    z = false;
                } catch (Exception e3) {
                    e = e3;
                    z = false;
                    aj.a("DNS cache catch error = " + e.getMessage() + "\n");
                    strReplaceFirst2 = strReplaceFirst2;
                    if (strReplaceFirst2.contains("nisportal")) {
                        e.a().f31178a = 1;
                    }
                    StringBuilder sb3 = new StringBuilder("\n*********************\nrequestGetHttps() requestUrl - >");
                    str3 = strA;
                    sb3.append(strReplaceFirst2.substring(0, 30));
                    sb3.append("...\n*********************\n");
                    aj.a(sb3.toString());
                    url = new URL(strReplaceFirst2);
                    if (obj != 0) {
                        try {
                            httpsURLConnection2 = (HttpsURLConnection) ((Network) obj).openConnection(url);
                        } catch (Exception e4) {
                            e = e4;
                            r14 = obj;
                            strA2 = str2;
                            str6 = str3;
                            strG = "\n";
                            httpsURLConnection = null;
                            r4 = context;
                            r2 = map;
                            r1 = r3;
                        }
                    } else {
                        httpsURLConnection2 = (HttpsURLConnection) url.openConnection();
                    }
                    httpsURLConnection3 = httpsURLConnection2;
                    httpsURLConnection3.setDoInput(true);
                    httpsURLConnection3.setDoOutput(false);
                    httpsURLConnection3.setUseCaches(false);
                    httpsURLConnection3.setInstanceFollowRedirects(false);
                    httpsURLConnection3.setReadTimeout(10000);
                    httpsURLConnection3.setConnectTimeout(10000);
                    httpsURLConnection3.setRequestMethod("GET");
                    httpsURLConnection3.setHostnameVerifier(new a());
                    boolean zC = ac.c();
                    httpsURLConnection3.setInstanceFollowRedirects(zC);
                    HttpURLConnection.setFollowRedirects(zC);
                    if (map != 0) {
                        for (String str8 : map.keySet()) {
                            httpsURLConnection3.setRequestProperty(str8, (String) map.get(str8));
                        }
                    }
                    httpsURLConnection3.addRequestProperty("Connection", "close");
                    aj.a("TAG\thttpsURLConnection.connect();\n");
                    gVar = new g();
                    gVar.f31189a = strReplaceFirst2.substring(0, strReplaceFirst2.indexOf("?"));
                    httpsURLConnection4 = httpsURLConnection3;
                    try {
                        gVar.f31190b = System.currentTimeMillis();
                        aj.a(3, strReplaceFirst2.substring(0, 30));
                        httpsURLConnection4.connect();
                        gVar.f31191c = System.currentTimeMillis();
                        gVar.d = 1L;
                        e.a().a(gVar);
                        sb2 = new StringBuilder("connect url cost:");
                        try {
                            sb2.append(gVar.f31191c - gVar.f31190b);
                            aj.a(sb2.toString());
                            aj.a(3, "cost:" + (gVar.f31191c - gVar.f31190b) + "ms\n");
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            responseCode = httpsURLConnection4.getResponseCode();
                            aj.a("\n*********************\n requestGetHttps() statusCode - >" + responseCode + "\n*********************\n");
                            StringBuilder sb4 = new StringBuilder("get response cost:");
                            sb4.append(System.currentTimeMillis() - jCurrentTimeMillis);
                            aj.a(sb4.toString());
                            string = httpsURLConnection4.getURL().toString();
                            context = "seq";
                            if (string.contains("ret_url")) {
                                strG = Uri.parse(new String(Base64.decode(Uri.parse(string).getQueryParameter("ret_url"), 0))).getQueryParameter("seq");
                                aj.a("seq = " + strG + "\nstatusCode = " + responseCode);
                            }
                            if (responseCode != 200) {
                                try {
                                    InputStream inputStream = httpsURLConnection4.getInputStream();
                                    strA2 = a(inputStream);
                                    str4 = new String(strA2);
                                    httpsURLConnection4.disconnect();
                                    inputStream.close();
                                    if (an.a(strG).booleanValue()) {
                                        strG = i.g();
                                    }
                                    try {
                                        if (TextUtils.isEmpty(str4)) {
                                            jSONObject = new JSONObject(str4);
                                            if (TextUtils.isEmpty(jSONObject.optString("seq"))) {
                                                jSONObject.put("seq", strG);
                                            }
                                            return jSONObject.toString();
                                        }
                                        JSONObject jSONObject2 = new JSONObject();
                                        strA2 = str2;
                                        try {
                                            jSONObject2.put(strA2, 410012);
                                            jSONObject2.put(str3, "返回数据体为空");
                                            jSONObject2.put("seq", strG);
                                            jSONObject2.put("data", "requestUrl:".concat(String.valueOf(strReplaceFirst2)));
                                            return jSONObject2.toString();
                                        } catch (Exception e5) {
                                            e = e5;
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    strA2 = str2;
                                }
                                str6 = str3;
                            } else {
                                strA2 = str2;
                                str6 = str3;
                                try {
                                    if (responseCode != 302) {
                                    }
                                    context = context;
                                    strG = "\n";
                                    str5 = new String(httpsURLConnection4.getHeaderField("Location"));
                                    aj.a("statusCode == 302 301, redirectUrl is \n" + str5.substring(0, 30) + "...");
                                    map = "System.currentTimeMillis() is  \n";
                                    ?? sb5 = new StringBuilder("System.currentTimeMillis() is  \n");
                                    obj = System.currentTimeMillis();
                                    sb5.append(obj);
                                    aj.a(sb5.toString());
                                    httpsURLConnection4.getInputStream().close();
                                    httpsURLConnection4.disconnect();
                                    this = TextUtils.isEmpty(str5);
                                    try {
                                        if (this == 0) {
                                            return str5.startsWith(ProxyConfig.MATCH_HTTPS) ? a(context, str5, map, obj) : b(context, str5, map, obj);
                                        }
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put(strA2, 410013);
                                        jSONObject3.put(str6, "无跳转地址");
                                        jSONObject3.put("data", str7);
                                        return jSONObject3.toString();
                                    } catch (Exception e8) {
                                        e = e8;
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                }
                            }
                            strG = "\n";
                        } catch (Exception e10) {
                            e = e10;
                            this = this;
                            map = map;
                            obj = obj;
                            strA2 = str2;
                            str6 = str3;
                            strG = "\n";
                            context = context;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                    httpsURLConnection = httpsURLConnection4;
                    r1 = this;
                    r2 = map;
                    r4 = context;
                    r14 = obj;
                    if (ac.b()) {
                        ak.b((Context) r4, str7);
                        aj.a("DNS cache use error,clean domain = " + str7 + strG);
                    }
                    if (httpsURLConnection != null) {
                        httpsURLConnection.getInputStream().close();
                        httpsURLConnection.disconnect();
                    }
                    int iE = al.e();
                    aj.a("\n*********************\niRetry = >" + iE + " \n   e-->" + e + "\n*********************\n");
                    aj.a(e);
                    message = e.getMessage();
                    if (message != null) {
                    }
                    try {
                        aj.a("catch (Exception e) is  ".concat(String.valueOf(e)));
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(strA2, 410011);
                        jSONObject4.put(str6, "https异常: ".concat(String.valueOf(message)));
                        jSONObject4.put("data", "requestUrl->".concat(String.valueOf(strReplaceFirst2)));
                        return jSONObject4.toString();
                    } catch (Exception unused) {
                        return null;
                    }
                }
            } catch (Exception e12) {
                e = e12;
                strA = "msg";
                str2 = "code";
            }
        } else {
            strA = "msg";
            str2 = "code";
            z = false;
        }
        if (strReplaceFirst2.contains("nisportal")) {
            e.a().f31178a = 1;
        }
        StringBuilder sb6 = new StringBuilder("\n*********************\nrequestGetHttps() requestUrl - >");
        str3 = strA;
        sb6.append(strReplaceFirst2.substring(0, 30));
        sb6.append("...\n*********************\n");
        aj.a(sb6.toString());
        try {
            url = new URL(strReplaceFirst2);
            if (obj != 0) {
                httpsURLConnection2 = (HttpsURLConnection) ((Network) obj).openConnection(url);
            } else {
                httpsURLConnection2 = (HttpsURLConnection) url.openConnection();
            }
            httpsURLConnection3 = httpsURLConnection2;
            try {
                httpsURLConnection3.setDoInput(true);
                httpsURLConnection3.setDoOutput(false);
                httpsURLConnection3.setUseCaches(false);
                httpsURLConnection3.setInstanceFollowRedirects(false);
                httpsURLConnection3.setReadTimeout(10000);
                httpsURLConnection3.setConnectTimeout(10000);
                httpsURLConnection3.setRequestMethod("GET");
                httpsURLConnection3.setHostnameVerifier(new a());
                boolean zC2 = ac.c();
                httpsURLConnection3.setInstanceFollowRedirects(zC2);
                HttpURLConnection.setFollowRedirects(zC2);
                if (map != 0) {
                    while (r0.hasNext()) {
                        httpsURLConnection3.setRequestProperty(str8, (String) map.get(str8));
                    }
                }
                httpsURLConnection3.addRequestProperty("Connection", "close");
                aj.a("TAG\thttpsURLConnection.connect();\n");
                gVar = new g();
                gVar.f31189a = strReplaceFirst2.substring(0, strReplaceFirst2.indexOf("?"));
                httpsURLConnection4 = httpsURLConnection3;
                gVar.f31190b = System.currentTimeMillis();
                try {
                    aj.a(3, strReplaceFirst2.substring(0, 30));
                    httpsURLConnection4.connect();
                    gVar.f31191c = System.currentTimeMillis();
                    gVar.d = 1L;
                    e.a().a(gVar);
                    sb2 = new StringBuilder("connect url cost:");
                    try {
                        sb2.append(gVar.f31191c - gVar.f31190b);
                        aj.a(sb2.toString());
                        aj.a(3, "cost:" + (gVar.f31191c - gVar.f31190b) + "ms\n");
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        responseCode = httpsURLConnection4.getResponseCode();
                        aj.a("\n*********************\n requestGetHttps() statusCode - >" + responseCode + "\n*********************\n");
                        StringBuilder sb7 = new StringBuilder("get response cost:");
                        sb7.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                        aj.a(sb7.toString());
                        string = httpsURLConnection4.getURL().toString();
                        context = "seq";
                        if (string.contains("ret_url") && strG.equalsIgnoreCase("seqAndroidEmpty")) {
                            strG = Uri.parse(new String(Base64.decode(Uri.parse(string).getQueryParameter("ret_url"), 0))).getQueryParameter("seq");
                            aj.a("seq = " + strG + "\nstatusCode = " + responseCode);
                        }
                        if (responseCode != 200) {
                            strA2 = str2;
                            str6 = str3;
                            if (responseCode != 302 || responseCode == 301) {
                                context = context;
                                strG = "\n";
                                str5 = new String(httpsURLConnection4.getHeaderField("Location"));
                                aj.a("statusCode == 302 301, redirectUrl is \n" + str5.substring(0, 30) + "...");
                                map = "System.currentTimeMillis() is  \n";
                                ?? sb8 = new StringBuilder("System.currentTimeMillis() is  \n");
                                obj = System.currentTimeMillis();
                                sb8.append(obj);
                                aj.a(sb8.toString());
                                httpsURLConnection4.getInputStream().close();
                                httpsURLConnection4.disconnect();
                                this = TextUtils.isEmpty(str5);
                                if (this == 0) {
                                    if (str5.startsWith(ProxyConfig.MATCH_HTTPS)) {
                                    }
                                }
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put(strA2, 410013);
                                jSONObject5.put(str6, "无跳转地址");
                                jSONObject5.put("data", str7);
                                return jSONObject5.toString();
                            }
                            try {
                                if (ac.b() && z) {
                                    context = context;
                                    try {
                                        ak.b((Context) context, str7);
                                        StringBuilder sb9 = new StringBuilder("DNS cache use error,clean domain = ");
                                        sb9.append(str7);
                                        strG = "\n";
                                        try {
                                            sb9.append(strG);
                                            aj.a(sb9.toString());
                                            context = context;
                                        } catch (Exception unused2) {
                                        }
                                    } catch (Exception unused3) {
                                        strG = "\n";
                                    }
                                } else {
                                    context = context;
                                    strG = "\n";
                                }
                                httpsURLConnection4.getInputStream().close();
                                httpsURLConnection4.disconnect();
                            } catch (Exception unused4) {
                                context = context;
                            }
                            try {
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put(strA2, 410010);
                                jSONObject6.put(str6, "Https状态码错误".concat(String.valueOf(responseCode)));
                                jSONObject6.put("data", "requestUrl:".concat(String.valueOf(strReplaceFirst2)));
                                return jSONObject6.toString();
                            } catch (Exception e13) {
                                e = e13;
                                this = this;
                                map = map;
                                obj = obj;
                                httpsURLConnection = httpsURLConnection4;
                                r1 = this;
                                r2 = map;
                                r4 = context;
                                r14 = obj;
                                if (ac.b()) {
                                    ak.b((Context) r4, str7);
                                    aj.a("DNS cache use error,clean domain = " + str7 + strG);
                                }
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.getInputStream().close();
                                    httpsURLConnection.disconnect();
                                }
                                int iE2 = al.e();
                                aj.a("\n*********************\niRetry = >" + iE2 + " \n   e-->" + e + "\n*********************\n");
                                aj.a(e);
                                message = e.getMessage();
                                if (message != null) {
                                }
                                aj.a("catch (Exception e) is  ".concat(String.valueOf(e)));
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put(strA2, 410011);
                                jSONObject7.put(str6, "https异常: ".concat(String.valueOf(message)));
                                jSONObject7.put("data", "requestUrl->".concat(String.valueOf(strReplaceFirst2)));
                                return jSONObject7.toString();
                            }
                        }
                        InputStream inputStream2 = httpsURLConnection4.getInputStream();
                        strA2 = a(inputStream2);
                        str4 = new String(strA2);
                        httpsURLConnection4.disconnect();
                        inputStream2.close();
                        if (an.a(strG).booleanValue()) {
                            strG = i.g();
                        }
                        if (TextUtils.isEmpty(str4)) {
                            jSONObject = new JSONObject(str4);
                            if (TextUtils.isEmpty(jSONObject.optString("seq"))) {
                                jSONObject.put("seq", strG);
                            }
                            return jSONObject.toString();
                        }
                        JSONObject jSONObject8 = new JSONObject();
                        strA2 = str2;
                        jSONObject8.put(strA2, 410012);
                        jSONObject8.put(str3, "返回数据体为空");
                        jSONObject8.put("seq", strG);
                        jSONObject8.put("data", "requestUrl:".concat(String.valueOf(strReplaceFirst2)));
                        return jSONObject8.toString();
                        str6 = str3;
                    } catch (Exception e14) {
                        e = e14;
                        strA2 = str2;
                        str6 = str3;
                    }
                    strG = "\n";
                } catch (Exception e15) {
                    e = e15;
                    r3 = this;
                    this = r3;
                    strA2 = str2;
                    str6 = str3;
                    strG = "\n";
                    context = context;
                    map = map;
                }
            } catch (Exception e16) {
                e = e16;
                httpsURLConnection4 = httpsURLConnection3;
                this = r3;
            }
            httpsURLConnection = httpsURLConnection4;
            r1 = this;
            r2 = map;
            r4 = context;
            r14 = obj;
        } catch (Exception e17) {
            e = e17;
            r14 = obj;
            strA2 = str2;
            str6 = str3;
            strG = "\n";
            r4 = context;
            r2 = map;
            httpsURLConnection = null;
            r1 = r3;
        }
        try {
            if (ac.b() && z) {
                ak.b((Context) r4, str7);
                aj.a("DNS cache use error,clean domain = " + str7 + strG);
            }
            if (httpsURLConnection != null) {
                httpsURLConnection.getInputStream().close();
                httpsURLConnection.disconnect();
            }
        } catch (Exception unused5) {
        }
        int iE3 = al.e();
        aj.a("\n*********************\niRetry = >" + iE3 + " \n   e-->" + e + "\n*********************\n");
        aj.a(e);
        message = e.getMessage();
        if (message != null || iE3 >= al.d()) {
            aj.a("catch (Exception e) is  ".concat(String.valueOf(e)));
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put(strA2, 410011);
            jSONObject9.put(str6, "https异常: ".concat(String.valueOf(message)));
            jSONObject9.put("data", "requestUrl->".concat(String.valueOf(strReplaceFirst2)));
            return jSONObject9.toString();
        }
        int iF = al.f();
        if (!message.contains("resolve host") || (!str7.contains(i.d()) && !str7.contains(i.e()))) {
            StringBuilder sb10 = message.contains("Failed to connect") ? new StringBuilder("Failed to connect error: retry->") : new StringBuilder("other  error: retry->");
            sb10.append(iF);
            sb10.append(" times \ne_getMessage=");
            sb10.append(message);
            aj.a(sb10.toString());
            return r1.a(r4, strReplaceFirst2, r2, r14);
        }
        aj.a("resolve host error: retry->" + iF + " times \ne_getMessage=" + message);
        if (f31139b && f31138a && !TextUtils.isEmpty(ak.f31167a)) {
            strReplaceFirst2 = strReplaceFirst2.replaceFirst(i.d(), a(ak.f31167a));
        }
        return r1.a(r4, strReplaceFirst2, r2, r14);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x02a4  */
    /* JADX WARN: Multi-variable type inference failed */
    private String b(Context context, String str, HashMap<String, String> map, Object obj) throws Throwable {
        String host;
        com.huawei.agconnect.apms.f fVar;
        HttpURLConnection httpURLConnection;
        String strReplaceFirst = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            host = new URL(strReplaceFirst).getHost();
        } catch (MalformedURLException e) {
            aj.a(e);
            host = strReplaceFirst;
        }
        if (host.contains(i.d()) && f31139b && f31138a) {
            if (!TextUtils.isEmpty(ak.f31167a)) {
                strReplaceFirst = strReplaceFirst.replaceFirst(i.d(), a(ak.f31167a));
            }
            f31139b = false;
        }
        if (strReplaceFirst.contains("nisportal")) {
            e.a().f31178a = 1;
        }
        aj.a("\n*********************\nrequestGetHttp() requestUrl - >" + strReplaceFirst.substring(0, 30) + "...\n ...\n \n*********************\n");
        try {
            try {
                URL url = new URL(strReplaceFirst);
                httpURLConnection = (HttpURLConnection) (obj != null ? ((Network) obj).openConnection(url) : url.openConnection());
                try {
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setRequestMethod("GET");
                    boolean zC = ac.c();
                    httpURLConnection.setInstanceFollowRedirects(zC);
                    HttpURLConnection.setFollowRedirects(zC);
                    if (map != null) {
                        for (String str2 : map.keySet()) {
                            httpURLConnection.setRequestProperty(str2, map.get(str2));
                        }
                    }
                    httpURLConnection.addRequestProperty("Connection", "close");
                    aj.a("TAG\thttpsURLConnection.connect();\n");
                    g gVar = new g();
                    gVar.f31189a = strReplaceFirst.substring(0, strReplaceFirst.indexOf("?"));
                    gVar.f31190b = System.currentTimeMillis();
                    httpURLConnection.connect();
                    gVar.f31191c = System.currentTimeMillis();
                    gVar.d = 1L;
                    e.a().a(gVar);
                    aj.a("connect cost:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    int responseCode = httpURLConnection.getResponseCode();
                    aj.a("\n*********************\nrequestGetHttp() statusCode - >" + responseCode + "\n*********************\n");
                    StringBuilder sb = new StringBuilder("response cost:");
                    sb.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                    aj.a(sb.toString());
                    if (responseCode == 200) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        String strA = a(inputStream);
                        httpURLConnection.getInputStream().close();
                        httpURLConnection.disconnect();
                        inputStream.close();
                        if (!TextUtils.isEmpty(strA)) {
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return strA;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", 410012);
                        jSONObject.put("msg", "返回数据体为空");
                        jSONObject.put("data", "requestUrl:".concat(String.valueOf(strReplaceFirst)));
                        String string = jSONObject.toString();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return string;
                    }
                    if (responseCode != 302) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("code", 410010);
                        jSONObject2.put("msg", "Https状态码错误".concat(String.valueOf(responseCode)));
                        jSONObject2.put("data", "requestUrl:".concat(String.valueOf(strReplaceFirst)));
                        String string2 = jSONObject2.toString();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return string2;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    aj.a("redirectUrl is \n".concat(String.valueOf(headerField)));
                    aj.a("System.currentTimeMillis() is  \n" + System.currentTimeMillis());
                    if (TextUtils.isEmpty(headerField)) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("code", 410013);
                        jSONObject3.put("msg", "无跳转地址");
                        jSONObject3.put("data", host);
                        String string3 = jSONObject3.toString();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return string3;
                    }
                    if (headerField.startsWith(ProxyConfig.MATCH_HTTPS)) {
                        String strA2 = a(context, headerField, null, obj);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return strA2;
                    }
                    aj.a("warning http redirectUrl \n" + System.currentTimeMillis());
                    String strB = b(context, headerField, null, obj);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return strB;
                } catch (Exception e2) {
                    e = e2;
                    aj.a(e);
                    try {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("code", 410024);
                        jSONObject4.put("msg", "http异常" + e.getMessage());
                        jSONObject4.put("data", "requestUrl->".concat(String.valueOf(strReplaceFirst)));
                        String string4 = jSONObject4.toString();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return string4;
                    } catch (Exception unused) {
                        if (httpURLConnection == null) {
                            return null;
                        }
                        httpURLConnection.disconnect();
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                fVar = "...\n ...\n \n*********************\n";
                if (fVar != 0) {
                    fVar.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            fVar = 0;
            if (fVar != 0) {
                fVar.disconnect();
            }
            throw th;
        }
    }

    public static String a(String str, String str2) {
        String strA = "";
        OutputStream outputStream = null;
        try {
            try {
                URL url = new URL(str);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                String protocol = url.getProtocol();
                if (an.b(protocol).booleanValue()) {
                    ProxyConfig.MATCH_HTTPS.equals(protocol.toLowerCase(Locale.getDefault()));
                }
                httpURLConnection.setConnectTimeout(50000);
                httpURLConnection.setReadTimeout(50000);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty(FeedbackWebConstants.USER_AGENT, "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 %sSafari/533.1");
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                httpURLConnection.setRequestProperty(w9.h, w9.j);
                httpURLConnection.setRequestProperty("api-protocol", "1.1");
                httpURLConnection.connect();
                outputStream = httpURLConnection.getOutputStream();
                outputStream.write(str2.getBytes("utf-8"));
                outputStream.flush();
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    strA = a(inputStream);
                    httpURLConnection.disconnect();
                    inputStream.close();
                }
                aj.a("responseCode = " + responseCode + "\nresult = " + strA);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                        return strA;
                    } catch (IOException e) {
                        aj.a(e);
                    }
                }
                return strA;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e2) {
                        aj.a(e2);
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            aj.a(e3);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                    aj.a(e4);
                }
            }
            return strA;
        }
    }

    private static String a(String str) {
        if (!str.contains(":")) {
            return str;
        }
        return "[" + str + "]";
    }

    final class a implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            if (!TextUtils.isEmpty(str) && sSLSession != null) {
                try {
                    return ak.a(str, ((X509Certificate) sSLSession.getPeerCertificates()[0]).getSubjectDN().getName());
                } catch (SSLPeerUnverifiedException e) {
                    aj.a(e);
                }
            }
            return false;
        }

        a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003b A[Catch: Exception -> 0x003e, TRY_LEAVE, TryCatch #0 {Exception -> 0x003e, blocks: (B:24:0x0036, B:26:0x003b), top: B:37:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0049 A[Catch: Exception -> 0x004c, TRY_LEAVE, TryCatch #2 {Exception -> 0x004c, blocks: (B:30:0x0044, B:32:0x0049), top: B:39:0x0044 }] */
    private static String a(InputStream inputStream) throws Throwable {
        Exception e;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
                        th = th;
                        byteArrayOutputStream2 = byteArrayOutputStream3;
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Exception unused) {
                            }
                        } else if (inputStream != null) {
                            inputStream.close();
                        }
                        throw th;
                    }
                    String str = new String(byteArrayOutputStream.toByteArray());
                    try {
                        byteArrayOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Exception unused2) {
                    }
                    return str;
                } catch (Exception e2) {
                    e = e2;
                    aj.a(e);
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (Exception unused3) {
                            return null;
                        }
                    } else if (inputStream != null) {
                        inputStream.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
                th = th;
                byteArrayOutputStream2 = byteArrayOutputStream4;
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

package com.tencent.open.a;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfHttpClient;
import com.huami.account.UserLegalInfoManager;
import com.loopj.android.http.AsyncHttpClient;
import com.sensetime.senseid.sdk.liveness.silent.common.type.AbstractContentType;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.i;
import com.tencent.open.utils.k;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import kotlin.text.Typography;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.ByteArrayEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class g {
    public static g a;
    public HandlerThread e;
    public Handler f;
    public Random b = new Random();
    public List<Serializable> d = Collections.synchronizedList(new ArrayList());
    public List<Serializable> c = Collections.synchronizedList(new ArrayList());
    public Executor g = i.b();
    public Executor h = i.b();

    private g() {
        this.e = null;
        if (this.e == null) {
            HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
            this.e = handlerThread;
            handlerThread.start();
        }
        if (!this.e.isAlive() || this.e.getLooper() == null) {
            return;
        }
        this.f = new Handler(this.e.getLooper()) { // from class: com.tencent.open.a.g.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1000) {
                    g.this.b();
                } else if (i == 1001) {
                    g.this.e();
                }
                super.handleMessage(message);
            }
        };
    }

    public static synchronized g a() {
        if (a == null) {
            a = new g();
        }
        return a;
    }

    public void b() {
        this.h.execute(new Runnable() { // from class: com.tencent.open.a.g.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Bundle bundleC = g.this.c();
                    if (bundleC == null) {
                        return;
                    }
                    int iA = com.tencent.open.utils.f.a(com.tencent.open.utils.e.a(), (String) null).a("Common_HttpRetryCount");
                    if (iA == 0) {
                        iA = 3;
                    }
                    SLog.d("openSDK_LOG.ReportManager", "-->doReportCgi, retryCount: " + iA);
                    boolean z = false;
                    int i = 0;
                    do {
                        i++;
                        try {
                            try {
                                try {
                                    HttpClient httpClient = HttpUtils.getHttpClient(com.tencent.open.utils.e.a(), null, "https://wspeed.qq.com/w.cgi");
                                    HttpPost httpPost = new HttpPost("https://wspeed.qq.com/w.cgi");
                                    httpPost.addHeader("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
                                    httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");
                                    httpPost.setEntity(new ByteArrayEntity(k.i(HttpUtils.encodeUrl(bundleC))));
                                    int statusCode = FirebasePerfHttpClient.execute(httpClient, httpPost).getStatusLine().getStatusCode();
                                    SLog.d("openSDK_LOG.ReportManager", "-->doReportCgi, statusCode: " + statusCode);
                                    if (statusCode != 200) {
                                        break;
                                    }
                                    f.a().b("report_cgi");
                                    z = true;
                                    break;
                                } catch (Exception e) {
                                    SLog.e("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception", e);
                                }
                            } catch (SocketTimeoutException e2) {
                                SLog.e("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception", e2);
                            }
                        } catch (ConnectTimeoutException e3) {
                            SLog.e("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception", e3);
                        }
                    } while (i < iA);
                    if (!z) {
                        f.a().a("report_cgi", g.this.c);
                    }
                    g.this.c.clear();
                } catch (Exception e4) {
                    SLog.e("openSDK_LOG.ReportManager", "-->doReportCgi, doupload exception out.", e4);
                }
            }
        });
    }

    public Bundle c() {
        if (this.c.size() == 0) {
            return null;
        }
        b bVar = (b) this.c.get(0);
        if (bVar == null) {
            SLog.d("openSDK_LOG.ReportManager", "-->prepareCgiData, the 0th cgireportitem is null.");
            return null;
        }
        String str = bVar.a.get("appid");
        List<Serializable> listA = f.a().a("report_cgi");
        if (listA != null) {
            this.c.addAll(listA);
        }
        SLog.d("openSDK_LOG.ReportManager", "-->prepareCgiData, mCgiList size: " + this.c.size());
        if (this.c.size() == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putString("appid", str);
            bundle.putString("releaseversion", Constants.SDK_VERSION_REPORT);
            bundle.putString("device", Build.DEVICE);
            bundle.putString("qua", Constants.SDK_QUA);
            bundle.putString("key", "apn,frequency,commandid,resultcode,tmcost,reqsize,rspsize,detail,touin,deviceinfo");
            for (int i = 0; i < this.c.size(); i++) {
                b bVar2 = (b) this.c.get(i);
                bundle.putString(i + "_1", bVar2.a.get("apn"));
                bundle.putString(i + "_2", bVar2.a.get("frequency"));
                bundle.putString(i + "_3", bVar2.a.get("commandid"));
                bundle.putString(i + "_4", bVar2.a.get("resultCode"));
                bundle.putString(i + "_5", bVar2.a.get("timeCost"));
                bundle.putString(i + "_6", bVar2.a.get("reqSize"));
                bundle.putString(i + "_7", bVar2.a.get("rspSize"));
                bundle.putString(i + "_8", bVar2.a.get("detail"));
                bundle.putString(i + "_9", bVar2.a.get("uin"));
                bundle.putString(i + "_10", c.e(com.tencent.open.utils.e.a()) + com.alipay.sdk.m.s.a.l + bVar2.a.get("deviceInfo"));
            }
            SLog.v("openSDK_LOG.ReportManager", "-->prepareCgiData, end. params: " + bundle.toString());
            return bundle;
        } catch (Exception e) {
            SLog.e("openSDK_LOG.ReportManager", "-->prepareCgiData, exception.", e);
            return null;
        }
    }

    public Bundle d() {
        List<Serializable> listA = f.a().a("report_via");
        if (listA != null) {
            this.d.addAll(listA);
        }
        SLog.d("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + this.d.size());
        if (this.d.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : this.d) {
            JSONObject jSONObject = new JSONObject();
            b bVar = (b) serializable;
            for (String str : bVar.a.keySet()) {
                try {
                    String str2 = bVar.a.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e) {
                    SLog.e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e);
                }
            }
            jSONArray.put(jSONObject);
        }
        SLog.v("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        Bundle bundle = new Bundle();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", jSONArray);
            bundle.putString("data", jSONObject2.toString());
            return bundle;
        } catch (JSONException e2) {
            SLog.e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e2);
            return null;
        }
    }

    public void e() {
        this.g.execute(new Runnable() { // from class: com.tencent.open.a.g.5
            @Override // java.lang.Runnable
            public void run() {
                int i;
                try {
                    Bundle bundleD = g.this.d();
                    if (bundleD == null) {
                        return;
                    }
                    SLog.v("openSDK_LOG.ReportManager", "-->doReportVia, params: " + bundleD.toString());
                    int iA = e.a();
                    int i2 = 0;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z = false;
                    int errorCodeFromException = 0;
                    long j = 0;
                    long j2 = 0;
                    do {
                        int i3 = i2 + 1;
                        try {
                            try {
                                try {
                                    k.a aVarOpenUrl2 = HttpUtils.openUrl2(com.tencent.open.utils.e.a(), "https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report", "POST", bundleD);
                                    try {
                                        i = k.d(aVarOpenUrl2.a).getInt(QQLogin.KEY_RESULT);
                                    } catch (JSONException unused) {
                                        i = -4;
                                    }
                                    if (i == 0 || !TextUtils.isEmpty(aVarOpenUrl2.a)) {
                                        i3 = iA;
                                        z = true;
                                    }
                                    j = aVarOpenUrl2.b;
                                    j2 = aVarOpenUrl2.c;
                                    i2 = i3;
                                } catch (JSONException unused2) {
                                    i2 = i3;
                                    errorCodeFromException = -4;
                                    j = 0;
                                    j2 = 0;
                                }
                            } catch (SocketTimeoutException unused3) {
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                i2 = i3;
                                errorCodeFromException = -8;
                                j = 0;
                                j2 = 0;
                            } catch (IOException e) {
                                errorCodeFromException = HttpUtils.getErrorCodeFromException(e);
                                i2 = i3;
                                j = 0;
                                j2 = 0;
                            }
                        } catch (HttpUtils.HttpStatusException e2) {
                            try {
                                errorCodeFromException = Integer.parseInt(e2.getMessage().replace(HttpUtils.HttpStatusException.ERROR_INFO, ""));
                            } catch (Exception unused4) {
                            }
                        } catch (HttpUtils.NetworkUnavailableException unused5) {
                            g.this.d.clear();
                            SLog.d("openSDK_LOG.ReportManager", "doReportVia, NetworkUnavailableException.");
                            return;
                        } catch (ConnectTimeoutException unused6) {
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                            i2 = i3;
                            errorCodeFromException = -7;
                            j = 0;
                            j2 = 0;
                        } catch (Exception unused7) {
                            i2 = iA;
                            errorCodeFromException = -6;
                            j = 0;
                            j2 = 0;
                        }
                    } while (i2 < iA);
                    g.this.a("mapp_apptrace_sdk", jElapsedRealtime, j, j2, errorCodeFromException, null, false);
                    if (z) {
                        f.a().b("report_via");
                    } else {
                        f.a().a("report_via", g.this.d);
                    }
                    g.this.d.clear();
                    SLog.d("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z);
                } catch (Exception e3) {
                    SLog.e("openSDK_LOG.ReportManager", "-->doReportVia, exception in serial executor.", e3);
                }
            }
        });
    }

    public void a(final Bundle bundle, String str, final boolean z) {
        if (bundle == null) {
            return;
        }
        SLog.v("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        if (a("report_via", str) || z) {
            this.g.execute(new Runnable() { // from class: com.tencent.open.a.g.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String strK = k.k(c.b(com.tencent.open.utils.e.a()));
                        String strK2 = k.k(c.c(com.tencent.open.utils.e.a()));
                        String strK3 = k.k(c.a());
                        String strK4 = k.k(c.d(com.tencent.open.utils.e.a()));
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("uin", "1000");
                        bundle2.putString("imei", strK);
                        bundle2.putString("imsi", strK2);
                        bundle2.putString("android_id", strK4);
                        bundle2.putString("mac", strK3);
                        bundle2.putString(Constants.PARAM_PLATFORM, "1");
                        bundle2.putString("os_ver", Build.VERSION.RELEASE);
                        bundle2.putString("network", a.a(com.tencent.open.utils.e.a()));
                        bundle2.putString(UserLegalInfoManager.KEY_LANGUAGE, c.b());
                        bundle2.putString("resolution", c.a(com.tencent.open.utils.e.a()));
                        bundle2.putString("apn", a.b(com.tencent.open.utils.e.a()));
                        bundle2.putString("model_name", Build.MODEL);
                        bundle2.putString("timezone", TimeZone.getDefault().getID());
                        bundle2.putString(AbstractContentType.PARAM_SDK_VERSION, Constants.SDK_VERSION_350);
                        bundle2.putString("qz_ver", k.d(com.tencent.open.utils.e.a(), "com.qzone"));
                        bundle2.putString("qq_ver", k.c(com.tencent.open.utils.e.a(), "com.tencent.mobileqq"));
                        bundle2.putString("qua", k.e(com.tencent.open.utils.e.a(), com.tencent.open.utils.e.b()));
                        bundle2.putString("packagename", com.tencent.open.utils.e.b());
                        bundle2.putString("app_ver", k.d(com.tencent.open.utils.e.a(), com.tencent.open.utils.e.b()));
                        Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        g.this.d.add(new b(bundle2));
                        int size = g.this.d.size();
                        int iA = com.tencent.open.utils.f.a(com.tencent.open.utils.e.a(), (String) null).a("Agent_ReportTimeInterval");
                        if (iA == 0) {
                            iA = 10000;
                        }
                        if (!g.this.a("report_via", size) && !z) {
                            if (g.this.f.hasMessages(1001)) {
                                return;
                            }
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1001;
                            g.this.f.sendMessageDelayed(messageObtain, iA);
                            return;
                        }
                        g.this.e();
                        g.this.f.removeMessages(1001);
                    } catch (Exception e) {
                        SLog.e("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e);
                    }
                }
            });
        }
    }

    public void a(String str, long j, long j2, long j3, int i) {
        a(str, j, j2, j3, i, "", false);
    }

    public void a(final String str, final long j, final long j2, final long j3, final int i, final String str2, final boolean z) {
        SLog.v("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j + " | reqSize:" + j2 + " | rspSize: " + j3 + " | responseCode: " + i + " | detail: " + str2);
        if (a("report_cgi", "" + i) || z) {
            this.h.execute(new Runnable() { // from class: com.tencent.open.a.g.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                        Bundle bundle = new Bundle();
                        String strA = a.a(com.tencent.open.utils.e.a());
                        bundle.putString("apn", strA);
                        bundle.putString("appid", "1000067");
                        bundle.putString("commandid", str);
                        bundle.putString("detail", str2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("network=");
                        sb.append(strA);
                        sb.append(Typography.amp);
                        sb.append("sdcard=");
                        int i2 = 1;
                        sb.append(Environment.getExternalStorageState().equals("mounted") ? 1 : 0);
                        sb.append(Typography.amp);
                        sb.append("wifi=");
                        sb.append(a.e(com.tencent.open.utils.e.a()));
                        bundle.putString("deviceInfo", sb.toString());
                        int iA = 100 / g.this.a(i);
                        if (iA > 0) {
                            i2 = iA > 100 ? 100 : iA;
                        }
                        bundle.putString("frequency", i2 + "");
                        bundle.putString("reqSize", j2 + "");
                        bundle.putString("resultCode", i + "");
                        bundle.putString("rspSize", j3 + "");
                        bundle.putString("timeCost", jElapsedRealtime + "");
                        bundle.putString("uin", "1000");
                        g.this.c.add(new b(bundle));
                        int size = g.this.c.size();
                        int iA2 = com.tencent.open.utils.f.a(com.tencent.open.utils.e.a(), (String) null).a("Agent_ReportTimeInterval");
                        if (iA2 == 0) {
                            iA2 = 10000;
                        }
                        if (g.this.a("report_cgi", size) || z) {
                            g.this.b();
                            g.this.f.removeMessages(1000);
                        } else if (!g.this.f.hasMessages(1000)) {
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1000;
                            g.this.f.sendMessageDelayed(messageObtain, iA2);
                        }
                    } catch (Exception e) {
                        SLog.e("openSDK_LOG.ReportManager", "--> reportCGI, exception in sub thread.", e);
                    }
                }
            });
        }
    }

    public boolean a(String str, String str2) {
        int iA;
        SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, report: " + str + " | ext: " + str2);
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 100;
        if (str.equals("report_cgi")) {
            try {
                iA = a(Integer.parseInt(str2));
                if (this.b.nextInt(100) < iA) {
                    z = true;
                }
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (str.equals("report_via")) {
                iA = e.a(str2);
                if (this.b.nextInt(100) < iA) {
                    i = iA;
                    z = true;
                }
            }
            SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z + " | frequency: " + i);
            return z;
        }
        i = iA;
        SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z + " | frequency: " + i);
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c A[PHI: r0
      0x001c: PHI (r0v9 int) = (r0v6 int), (r0v12 int) binds: [B:11:0x0034, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean a(String str, int i) {
        int iA;
        int i2 = 5;
        if (str.equals("report_cgi")) {
            iA = com.tencent.open.utils.f.a(com.tencent.open.utils.e.a(), (String) null).a("Common_CGIReportMaxcount");
            if (iA != 0) {
                i2 = iA;
            }
        } else if (str.equals("report_via")) {
            iA = com.tencent.open.utils.f.a(com.tencent.open.utils.e.a(), (String) null).a("Agent_ReportBatchCount");
            if (iA != 0) {
                i2 = iA;
            }
        } else {
            i2 = 0;
        }
        SLog.d("openSDK_LOG.ReportManager", "-->availableCount, report: " + str + " | dataSize: " + i + " | maxcount: " + i2);
        return i >= i2;
    }

    public int a(int i) {
        if (i == 0) {
            int iA = com.tencent.open.utils.f.a(com.tencent.open.utils.e.a(), (String) null).a("Common_CGIReportFrequencySuccess");
            if (iA == 0) {
                return 10;
            }
            return iA;
        }
        int iA2 = com.tencent.open.utils.f.a(com.tencent.open.utils.e.a(), (String) null).a("Common_CGIReportFrequencyFailed");
        if (iA2 == 0) {
            return 100;
        }
        return iA2;
    }

    public void a(final String str, final String str2, final Bundle bundle, final boolean z) {
        i.a(new Runnable() { // from class: com.tencent.open.a.g.6
            /* JADX WARN: Code duplicated, block: B:102:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:120:0x0133 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:129:? A[LOOP:0: B:21:0x0096->B:129:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:84:0x0135 A[Catch: Exception -> 0x0158, TRY_ENTER, TryCatch #5 {Exception -> 0x0158, blocks: (B:3:0x0004, B:5:0x0008, B:7:0x000e, B:10:0x0015, B:12:0x003e, B:13:0x0042, B:15:0x0050, B:19:0x0086, B:84:0x0135, B:85:0x013b, B:34:0x00d4, B:70:0x0118, B:94:0x0151, B:93:0x014e, B:16:0x0064, B:18:0x0072, B:95:0x0152, B:88:0x0143, B:90:0x0149), top: B:105:0x0004, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:85:0x013b A[Catch: Exception -> 0x0158, TRY_LEAVE, TryCatch #5 {Exception -> 0x0158, blocks: (B:3:0x0004, B:5:0x0008, B:7:0x000e, B:10:0x0015, B:12:0x003e, B:13:0x0042, B:15:0x0050, B:19:0x0086, B:84:0x0135, B:85:0x013b, B:34:0x00d4, B:70:0x0118, B:94:0x0151, B:93:0x014e, B:16:0x0064, B:18:0x0072, B:95:0x0152, B:88:0x0143, B:90:0x0149), top: B:105:0x0004, inners: #2 }] */
            /* JADX WARN: Code duplicated, block: B:90:0x0149 A[Catch: Exception -> 0x014d, TRY_LEAVE, TryCatch #2 {Exception -> 0x014d, blocks: (B:88:0x0143, B:90:0x0149), top: B:102:0x0143, outer: #5 }] */
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                HttpUriRequest httpGet;
                HttpResponse httpResponseExecute;
                HttpEntity entity;
                String str3 = "-->ReportCenter httpRequest consumeContent Exception:";
                try {
                    if (bundle == null) {
                        SLog.e("openSDK_LOG.ReportManager", "-->httpRequest, params is null!");
                        return;
                    }
                    int iA = e.a();
                    if (iA == 0) {
                        iA = 3;
                    }
                    SLog.d("openSDK_LOG.ReportManager", "-->httpRequest, retryCount: " + iA);
                    HttpResponse httpResponse = null;
                    HttpClient httpClient = HttpUtils.getHttpClient(com.tencent.open.utils.e.a(), null, str);
                    String strEncodeUrl = HttpUtils.encodeUrl(bundle);
                    if (z) {
                        strEncodeUrl = URLEncoder.encode(strEncodeUrl);
                    }
                    if (str2.toUpperCase().equals("GET")) {
                        StringBuffer stringBuffer = new StringBuffer(str);
                        stringBuffer.append(strEncodeUrl);
                        httpGet = new HttpGet(stringBuffer.toString());
                    } else if (!str2.toUpperCase().equals("POST")) {
                        SLog.e("openSDK_LOG.ReportManager", "-->httpRequest unkonw request method return.");
                        return;
                    } else {
                        HttpPost httpPost = new HttpPost(str);
                        httpPost.setEntity(new ByteArrayEntity(k.i(strEncodeUrl)));
                        httpGet = httpPost;
                    }
                    httpGet.addHeader("Accept-Encoding", AsyncHttpClient.ENCODING_GZIP);
                    httpGet.addHeader("Content-Type", "application/x-www-form-urlencoded");
                    int i = 0;
                    boolean z2 = false;
                    while (true) {
                        i++;
                        try {
                            try {
                                httpResponseExecute = FirebasePerfHttpClient.execute(httpClient, httpGet);
                                try {
                                    int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
                                    SLog.d("openSDK_LOG.ReportManager", "-->httpRequest, statusCode: " + statusCode);
                                    if (statusCode != 200) {
                                        SLog.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest : HttpStatuscode != 200");
                                    } else {
                                        try {
                                            SLog.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread success");
                                            z2 = true;
                                        } catch (SocketTimeoutException e) {
                                            e = e;
                                            z2 = true;
                                            try {
                                                SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest SocketTimeoutException:", e);
                                                if (httpResponseExecute != null) {
                                                    try {
                                                        HttpEntity entity2 = httpResponseExecute.getEntity();
                                                        if (entity2 != null) {
                                                            entity2.consumeContent();
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest consumeContent Exception:", e);
                                                        if (i >= iA) {
                                                            if (z2) {
                                                                str3 = "-->ReportCenter httpRequest Thread request success";
                                                                SLog.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request success");
                                                            } else {
                                                                str3 = "-->ReportCenter httpRequest Thread request failed";
                                                                SLog.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request failed");
                                                            }
                                                            return;
                                                        }
                                                    }
                                                }
                                                if (i >= iA) {
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                httpResponse = httpResponseExecute;
                                                if (httpResponse != null) {
                                                    try {
                                                        entity = httpResponse.getEntity();
                                                        if (entity != null) {
                                                            entity.consumeContent();
                                                        }
                                                    } catch (Exception e3) {
                                                        SLog.e("openSDK_LOG.ReportManager", str3, e3);
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (ConnectTimeoutException e4) {
                                            e = e4;
                                            z2 = true;
                                            SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest ConnectTimeoutException:", e);
                                            if (httpResponseExecute != null) {
                                                try {
                                                    HttpEntity entity3 = httpResponseExecute.getEntity();
                                                    if (entity3 != null) {
                                                        entity3.consumeContent();
                                                    }
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest consumeContent Exception:", e);
                                                    if (i >= iA) {
                                                        if (z2) {
                                                            str3 = "-->ReportCenter httpRequest Thread request success";
                                                            SLog.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request success");
                                                        } else {
                                                            str3 = "-->ReportCenter httpRequest Thread request failed";
                                                            SLog.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request failed");
                                                        }
                                                        return;
                                                    }
                                                }
                                            }
                                            if (i >= iA) {
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            httpResponse = httpResponseExecute;
                                            z2 = true;
                                            SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Exception:", e);
                                            if (httpResponse != null) {
                                                try {
                                                    HttpEntity entity4 = httpResponse.getEntity();
                                                    if (entity4 != null) {
                                                        entity4.consumeContent();
                                                    }
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest consumeContent Exception:", e);
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        HttpEntity entity5 = httpResponseExecute.getEntity();
                                        if (entity5 != null) {
                                            entity5.consumeContent();
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest consumeContent Exception:", e);
                                    }
                                } catch (SocketTimeoutException e9) {
                                    e = e9;
                                } catch (ConnectTimeoutException e10) {
                                    e = e10;
                                } catch (Exception e11) {
                                    e = e11;
                                    httpResponse = httpResponseExecute;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (httpResponse != null) {
                                    entity = httpResponse.getEntity();
                                    if (entity != null) {
                                        entity.consumeContent();
                                    }
                                }
                                throw th;
                            }
                        } catch (SocketTimeoutException e12) {
                            e = e12;
                            httpResponseExecute = null;
                        } catch (ConnectTimeoutException e13) {
                            e = e13;
                            httpResponseExecute = null;
                        } catch (Exception e14) {
                            e = e14;
                        }
                        if (z2) {
                            str3 = "-->ReportCenter httpRequest Thread request success";
                            SLog.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request success");
                        } else {
                            str3 = "-->ReportCenter httpRequest Thread request failed";
                            SLog.d("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Thread request failed");
                        }
                        return;
                    }
                } catch (Exception e15) {
                    SLog.e("openSDK_LOG.ReportManager", "-->httpRequest, exception in serial executor:", e15);
                }
            }
        });
    }
}

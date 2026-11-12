package com.tencent.open.b;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hihealthservice.db.table.DBSessionCommon;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.i;
import com.tencent.open.utils.l;
import com.tencent.open.utils.m;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static h f31035a;
    protected HandlerThread e;
    protected Handler f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Random f31036b = new SecureRandom();
    protected List<Serializable> d = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<Serializable> f31037c = Collections.synchronizedList(new ArrayList());
    protected Executor g = l.b();
    protected Executor h = l.b();

    protected void b() {
    }

    public static h a() {
        h hVar;
        synchronized (h.class) {
            if (f31035a == null) {
                f31035a = new h();
            }
            hVar = f31035a;
        }
        return hVar;
    }

    private h() {
        this.e = null;
        if (this.e == null) {
            HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
            this.e = handlerThread;
            handlerThread.start();
        }
        if (!this.e.isAlive() || this.e.getLooper() == null) {
            return;
        }
        this.f = new Handler(this.e.getLooper()) { // from class: com.tencent.open.b.h.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1000) {
                    h.this.b();
                } else if (i == 1001) {
                    h.this.d();
                }
                super.handleMessage(message);
            }
        };
    }

    public void a(final Bundle bundle, String str, final boolean z) {
        if (bundle == null) {
            return;
        }
        SLog.v("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        if (a("report_via", str) || z) {
            this.g.execute(new Runnable() { // from class: com.tencent.open.b.h.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("uin", "1000");
                        bundle2.putString("platform", "1");
                        bundle2.putString("os_ver", Build.VERSION.RELEASE);
                        bundle2.putString("position", "");
                        bundle2.putString("network", a.a(com.tencent.open.utils.g.a()));
                        bundle2.putString("language", d.a());
                        bundle2.putString("resolution", d.a(com.tencent.open.utils.g.a()));
                        bundle2.putString("apn", a.b(com.tencent.open.utils.g.a()));
                        bundle2.putString(Constants.PARAM_MODEL_NAME, com.tencent.open.utils.f.a().c(com.tencent.open.utils.g.a()));
                        bundle2.putString(DBSessionCommon.COLUMN_TIME_ZONE, TimeZone.getDefault().getID());
                        bundle2.putString("sdk_ver", Constants.SDK_VERSION);
                        bundle2.putString("qz_ver", m.d(com.tencent.open.utils.g.a(), Constants.PACKAGE_QZONE));
                        bundle2.putString(Constants.PARAM_QQ_VER, m.c(com.tencent.open.utils.g.a(), "com.tencent.mobileqq"));
                        bundle2.putString("qua", m.e(com.tencent.open.utils.g.a(), com.tencent.open.utils.g.b()));
                        bundle2.putString("packagename", com.tencent.open.utils.g.b());
                        bundle2.putString(Constants.PARAM_APP_VER, m.d(com.tencent.open.utils.g.a(), com.tencent.open.utils.g.b()));
                        Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        h.this.d.add(new c(bundle2));
                        int size = h.this.d.size();
                        int iA = i.a(com.tencent.open.utils.g.a(), (String) null).a("Agent_ReportTimeInterval");
                        if (iA == 0) {
                            iA = 10000;
                        }
                        if (!h.this.a("report_via", size) && !z) {
                            if (h.this.f.hasMessages(1001)) {
                                return;
                            }
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 1001;
                            h.this.f.sendMessageDelayed(messageObtain, iA);
                            return;
                        }
                        h.this.d();
                        h.this.f.removeMessages(1001);
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

    public void a(String str, long j, long j2, long j3, int i, String str2, boolean z) {
        SLog.v("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j + " | reqSize:" + j2 + " | rspSize: " + j3 + " | responseCode: " + i + " | detail: " + str2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057 A[PHI: r6
      0x0057: PHI (r6v6 int) = (r6v2 int), (r6v8 int) binds: [B:9:0x003e, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x005a A[PHI: r6
      0x005a: PHI (r6v5 int) = (r6v2 int), (r6v8 int) binds: [B:9:0x003e, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    protected boolean a(String str, String str2) {
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
                if (this.f31036b.nextInt(100) < iA) {
                    i = iA;
                    z = true;
                } else {
                    i = iA;
                }
            } catch (Exception unused) {
                return false;
            }
        } else if (str.equals("report_via")) {
            iA = f.a(str2);
            if (this.f31036b.nextInt(100) < iA) {
                i = iA;
                z = true;
            } else {
                i = iA;
            }
        }
        SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z + " | frequency: " + i);
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    protected boolean a(String str, int i) {
        int iA;
        if (str.equals("report_cgi")) {
            iA = i.a(com.tencent.open.utils.g.a(), (String) null).a("Common_CGIReportMaxcount");
            if (iA == 0) {
                iA = 5;
            }
        } else if (str.equals("report_via")) {
            iA = i.a(com.tencent.open.utils.g.a(), (String) null).a("Agent_ReportBatchCount");
            if (iA == 0) {
                iA = 5;
            }
        } else {
            iA = 0;
        }
        SLog.d("openSDK_LOG.ReportManager", "-->availableCount, report: " + str + " | dataSize: " + i + " | maxcount: " + iA);
        return i >= iA;
    }

    protected int a(int i) {
        if (i == 0) {
            int iA = i.a(com.tencent.open.utils.g.a(), (String) null).a("Common_CGIReportFrequencySuccess");
            if (iA == 0) {
                return 10;
            }
            return iA;
        }
        int iA2 = i.a(com.tencent.open.utils.g.a(), (String) null).a("Common_CGIReportFrequencyFailed");
        if (iA2 == 0) {
            return 100;
        }
        return iA2;
    }

    protected Map<String, String> c() {
        List<Serializable> listB = g.b("report_via");
        if (listB != null) {
            this.d.addAll(listB);
        }
        SLog.d("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + this.d.size());
        if (this.d.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : this.d) {
            JSONObject jSONObject = new JSONObject();
            c cVar = (c) serializable;
            for (String str : cVar.f31031a.keySet()) {
                try {
                    String str2 = cVar.f31031a.get(str);
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
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", jSONArray);
            HashMap map = new HashMap();
            map.put("data", jSONObject2.toString());
            return map;
        } catch (JSONException e2) {
            SLog.e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e2);
            return null;
        }
    }

    protected void d() {
        if (m.b(com.tencent.open.utils.g.a())) {
            this.g.execute(new Runnable() { // from class: com.tencent.open.b.h.3
                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    long j;
                    int i2;
                    int errorCodeFromException;
                    long jB;
                    long j2;
                    long j3;
                    long j4;
                    boolean z;
                    try {
                        Map<String, String> mapC = h.this.c();
                        if (mapC == null) {
                            return;
                        }
                        SLog.d("openSDK_LOG.ReportManager", "-->doReportVia, params: " + mapC.toString());
                        int iA = f.a();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = 0;
                        int iD = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            try {
                                try {
                                    com.tencent.open.a.g gVarB = com.tencent.open.a.f.a().b("https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report", mapC);
                                    SLog.i("openSDK_LOG.ReportManager", "-->reportVia: statusCode " + gVarB.d());
                                    JSONObject jSONObjectD = m.d(gVarB.a());
                                    long jC = (long) gVarB.c();
                                    i = i4;
                                    jB = gVarB.b();
                                    try {
                                        try {
                                            if (gVarB.d() != 200) {
                                                iD = gVarB.d();
                                                j4 = jElapsedRealtime;
                                                j2 = jB;
                                                j3 = jC;
                                                z = false;
                                            } else {
                                                try {
                                                    if (jSONObjectD.getInt("ret") != 0) {
                                                        if (jB == 0) {
                                                            j = jC;
                                                            i3 = i;
                                                            if (i3 >= iA) {
                                                                jC = j;
                                                                j4 = jElapsedRealtime;
                                                                j2 = jB;
                                                                j3 = jC;
                                                                z = false;
                                                            }
                                                        }
                                                    }
                                                } catch (JSONException unused) {
                                                }
                                                j4 = jElapsedRealtime;
                                                j2 = jB;
                                                j3 = jC;
                                                z = true;
                                            }
                                        } catch (JSONException unused2) {
                                            j = 0;
                                            iD = -4;
                                            jB = 0;
                                        }
                                    } catch (SocketTimeoutException unused3) {
                                        j = 0;
                                        jElapsedRealtime = SystemClock.elapsedRealtime();
                                        errorCodeFromException = -8;
                                        iD = errorCodeFromException;
                                        i2 = i;
                                        i3 = i2;
                                        jB = j;
                                    } catch (IOException e) {
                                        e = e;
                                        j = 0;
                                        errorCodeFromException = HttpUtils.getErrorCodeFromException(e);
                                        iD = errorCodeFromException;
                                        i2 = i;
                                        i3 = i2;
                                        jB = j;
                                    }
                                } catch (Exception unused4) {
                                    j = 0;
                                    iD = -6;
                                    i2 = iA;
                                    i3 = i2;
                                    jB = j;
                                }
                            } catch (SocketTimeoutException unused5) {
                                i = i4;
                            } catch (IOException e2) {
                                e = e2;
                                i = i4;
                            } catch (JSONException unused6) {
                                i = i4;
                            }
                            h.this.a("mapp_apptrace_sdk", j4, j3, j2, iD, null, false);
                            if (!z) {
                                g.a("report_via", h.this.d);
                            } else {
                                g.a("report_via");
                            }
                            h.this.d.clear();
                            SLog.i("openSDK_LOG.ReportManager", "-->doReportVia, uploadSuccess: " + z + " resultCode: " + iD);
                            return;
                        }
                    } catch (Exception e3) {
                        SLog.e("openSDK_LOG.ReportManager", "-->doReportVia, exception in serial executor.", e3);
                    }
                }
            });
        }
    }

    public void a(final String str, final Map<String, String> map) {
        if (m.b(com.tencent.open.utils.g.a())) {
            l.b(new Runnable() { // from class: com.tencent.open.b.h.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        int iA = f.a();
                        if (iA == 0) {
                            iA = 3;
                        }
                        SLog.d("openSDK_LOG.ReportManager", "-->httpRequest, retryCount: " + iA);
                        int i = 0;
                        do {
                            i++;
                            try {
                                SLog.i("openSDK_LOG.ReportManager", "-->httpRequest, statusCode: " + com.tencent.open.a.f.a().a(str, map).d());
                                break;
                            } catch (SocketTimeoutException e) {
                                SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest SocketTimeoutException:", e);
                            } catch (Exception e2) {
                                SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Exception:", e2);
                                break;
                            }
                        } while (i < iA);
                    } catch (Exception e3) {
                        SLog.e("openSDK_LOG.ReportManager", "-->httpRequest, exception in serial executor:", e3);
                    }
                }
            });
        }
    }
}

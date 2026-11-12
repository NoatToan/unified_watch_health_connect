package com.huawei.hms.network.embedded;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.PackageManagerCompat;
import com.huawei.hms.framework.common.ReflectionUtils;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.InitReport;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.network.ComposedNetworkKit;
import com.huawei.hms.network.RemoteInitializer;
import com.huawei.hms.network.abtest.ABHelper;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.conf.api.ConfigAPI;
import com.huawei.hms.network.exception.NetworkTimeoutException;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.inner.api.InterceptorNetworkService;
import com.huawei.hms.network.inner.api.NetDiagnosisNetworkService;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class t2 extends z2 {
    public static final String V = "DefaultRCEventListener";
    public static boolean W = false;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    public static final int a0 = 1;
    public static final int b0 = 2;
    public static final String c0 = "X-HwPs-Redirects";
    public static final char d0 = ';';
    public int A;
    public int B;
    public PolicyNetworkService C;
    public boolean D;
    public boolean E;
    public NetDiagnosisNetworkService F;
    public int G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public String R;
    public String S;
    public String T;
    public boolean U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15383c;
    public int d;
    public int e;
    public long f;
    public volatile int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public String n;
    public String o;
    public int p;
    public int q;
    public int r;
    public String s;
    public Map<String, String> t;
    public List<d1> u;
    public List<IOException> v;
    public boolean w;
    public Exception x;
    public int y;
    public int z;

    private long a(long j, long j2) {
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return j - j2;
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void traceResponseNetworkKitOutEvent(String str) {
        this.S = str;
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void traceResponseNetworkKitInEvent(String str, String str2) {
        this.R = str;
        this.T = str2;
    }

    public void setReadStatus(int i) {
        this.g = i;
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void retryInterceptorStart(Request request, d1 d1Var, long j) {
        this.e++;
        this.l += j;
        this.u.add(d1Var);
        a("retryInterceptorStart");
        d1Var.setRcEventListener(this);
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void retryInterceptorFailed(IOException iOException) {
        this.v.add(iOException);
        a("retryInterceptorFailed");
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void retryInterceptorEnd(Response response, a1 a1Var) {
        a("retryInterceptorEnd");
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void responseFailed() {
        a("responseFailed");
        if (this.U) {
            setReadStatus(2);
        }
        a();
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void responseBodyEnd() {
        a("responseBodyEnd");
        setReadStatus(1);
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void reportData(T t) {
        String string;
        if (W) {
            Logger.v(V, "the networkKit dynamic data no need for reporting this time!");
        } else {
            Logger.v(V, "the networkKit dynamic data is reporting this time!");
            W = true;
            d();
        }
        if (this.D) {
            return;
        }
        Logger.d(V, "metric policy:" + this.A);
        int i = this.A;
        if (i == 1) {
            return;
        }
        if (i != 2 || (t instanceof Exception) || ((t instanceof Integer) && a((Integer) t))) {
            Context appContext = ContextHolder.getAppContext();
            x2 x2Var = new x2();
            if (a(t, x2Var, appContext)) {
                this.e--;
                x2Var.put("sdk_version", "8.0.1.320").put(x2.REQ_START, this.f15383c).put(x2.CALL_START_NETWORK_TYPE, this.d).put("network_type", NetworkUtil.getCurrentNetworkType()).put("total_time", this.h).put(x2.REQUEST_RETRY, Math.max(this.e, 0)).putIfNotDefault(x2.REQUEST_TYPE, this.z, 0L).put(x2.WAITINGTIME, this.l);
                x2Var.put(x2.ALL_TIME, this.f).put(x2.READ_STATUS, this.g);
                if (this.C != null) {
                    String strValueOf = String.valueOf(ConfigAPI.getValue("core_configversion"));
                    x2Var.put("config_version", strValueOf);
                    x2Var.put(x2.PROFILE_TYPE, Character.toUpperCase(this.o.charAt(0)) + "_" + strValueOf);
                }
                int i2 = this.B;
                if (i2 > 0) {
                    x2Var.put(x2.TRAFFIC_CLASS, i2);
                }
                if (this.t != null) {
                    for (String str : x2.RECORD_LIST) {
                        if (this.t.containsKey(str)) {
                            x2Var.put(str, this.t.get(str));
                        }
                    }
                    string = this.t.get("trace_id");
                } else {
                    string = "";
                }
                if (TextUtils.isEmpty(string)) {
                    string = UUID.randomUUID().toString();
                    x2Var.put("trace_id", string);
                }
                InterceptorNetworkService interceptorNetworkService = NetworkKitInnerImpl.getInstance().getInterceptorNetworkService("netdiag");
                if (interceptorNetworkService != null) {
                    NetDiagnosisNetworkService netDiagnosisNetworkService = (NetDiagnosisNetworkService) interceptorNetworkService;
                    this.F = netDiagnosisNetworkService;
                    netDiagnosisNetworkService.requestThirdMetrics(string);
                }
                String option = ComposedNetworkKit.getInstance().getOption("", "core_wlacid");
                if (!TextUtils.isEmpty(option)) {
                    x2Var.put(x2.WLACID, option);
                }
                if (t instanceof Integer) {
                    x2Var.put("error_code", ((Integer) t).intValue());
                }
                if (!TextUtils.isEmpty(this.s)) {
                    x2Var.put(x2.REDIRECT_INFO, this.s);
                }
                x2Var.put(x2.CONNECT_TIMEOUT, this.p);
                x2Var.put("read_timeout", this.q);
                x2Var.put(x2.WRITE_TIMEMEOUT, this.r);
                x2Var.put(x2.AI_TYPE, b());
                String strValueOf2 = String.valueOf(ConfigAPI.getValue(PolicyNetworkService.GlobalConstants.DNS_RESULT_TTL));
                if (!TextUtils.isEmpty(strValueOf2)) {
                    x2Var.put(x2.DNS_RESULT_TTL, strValueOf2);
                }
                String scene = u3.getInstance().getScene();
                if (!TextUtils.isEmpty(scene)) {
                    x2Var.put(x2.SCENE_SITE, scene);
                }
                try {
                    URL url = new URL(this.n);
                    x2Var.put(x2.ORIGIN_DOMAIN, url.getHost());
                    x2Var.put(x2.API_ID, this.f15381a ? url.getPath() : StringUtils.anonymizeMessage(url.getPath()));
                } catch (MalformedURLException unused) {
                    Logger.w(V, "the url is error,and can't known the host and path!");
                    x2Var.put(x2.ORIGIN_DOMAIN, "unknown");
                    x2Var.put(x2.API_ID, "unknown");
                }
                a(x2Var);
                if (this.F != null) {
                    x2Var.put(x2.NETDIAG_INFO, a(t));
                } else {
                    Logger.w(V, "netdaigService is null, and skip it");
                }
                if (this.u.size() > 0 && (this.u.get(0) instanceof j2)) {
                    Logger.v(V, "collect quic stats");
                    n2.collectQuicStats(x2Var, (j2) this.u.get(0));
                }
                Logger.v(V, x2Var);
                HianalyticsHelper.getInstance().onEvent(x2Var.get());
                b(t);
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void recordCpNetworkInterceptorNums(int i) {
        this.H = i;
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void recordCpApplicationInterceptorNums(int i) {
        this.G = i;
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void rcNetworkInterceptorResStart() {
        this.Q = SystemClock.elapsedRealtime();
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void rcNetworkInterceptorReqEnd(h1.d dVar) {
        if (TextUtils.isEmpty(this.n) || this.n.startsWith("grs://")) {
            this.n = dVar.getUrl();
            Logger.v(V, "cpApplicationInterceptorReqEnd requestUrl:" + this.n);
        }
        this.P = SystemClock.elapsedRealtime();
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void cpNetworkInterceptorResStart() {
        this.N = SystemClock.elapsedRealtime();
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void cpNetworkInterceptorResEnd() {
        this.O = SystemClock.elapsedRealtime();
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void cpNetworkInterceptorReqStart() {
        this.J = SystemClock.elapsedRealtime();
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void cpNetworkInterceptorReqEnd() {
        this.K = SystemClock.elapsedRealtime();
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void cpApplicationInterceptorResStart() {
        this.L = SystemClock.elapsedRealtime();
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void cpApplicationInterceptorResEnd() {
        this.M = SystemClock.elapsedRealtime();
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void cpApplicationInterceptorReqEnd() {
        this.I = SystemClock.elapsedRealtime();
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void convertGrsStart(String str) {
        a("convertGrsStart");
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void convertGrsEnd(String str) {
        this.n = str;
        a("convertGrsEnd");
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void cancel() {
        this.w = true;
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void callStart() {
        this.f15383c = System.currentTimeMillis();
        this.i = SystemClock.elapsedRealtime();
        this.d = NetworkUtil.getCurrentNetworkType();
        a("callStart");
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void callFinishAtNetLib(int i) {
        Logger.v(V, "call finish at net lib, try to report data to AIOps");
        setReadStatus(i);
        a();
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void callFailed(Exception exc) {
        this.k = SystemClock.elapsedRealtime();
        this.j = System.currentTimeMillis();
        a(3);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.i;
        this.h = jElapsedRealtime;
        this.f = jElapsedRealtime;
        if (this.w) {
            int i = (h1.apiAvailable(4) && (exc instanceof NetworkTimeoutException)) ? ExceptionCode.NETWORK_TIMEOUT : ExceptionCode.CANCEL;
            this.m = i;
            c(Integer.valueOf(i));
        } else {
            c(exc);
            this.x = exc;
        }
        a("callFailed");
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void callEnd(Response response) {
        this.U = true;
        this.k = SystemClock.elapsedRealtime();
        this.j = System.currentTimeMillis();
        a(2);
        this.h = SystemClock.elapsedRealtime() - this.i;
        this.m = response.getCode();
        b(response);
        c(Integer.valueOf(response.getCode()));
        a("callEnd");
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void acquireRequestStart() {
        a("acquireRequestStart");
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void acquireRequestEnd(h1.d dVar) {
        this.n = dVar.getUrl();
        a("acquireRequestEnd");
        this.t = dVar.getNetConfig().getMap("core_metrics_data");
        this.z = dVar.getNetConfig().enableConnectEmptyBody() ? 1 : 0;
        this.A = dVar.getNetConfig().getMetricPolicy();
        this.D = dVar.getNetConfig().enableInnerConnectEmptyBody();
        this.p = dVar.getNetConfig().getInt("core_connect_timeout");
        this.q = dVar.getNetConfig().getInt("core_read_timeout");
        this.r = dVar.getNetConfig().getInt("core_write_timeout");
        String string = dVar.getNetConfig().getString(PolicyNetworkService.ProfileConstants.SCENE_TYPE);
        if (!TextUtils.isEmpty(string)) {
            Logger.v(V, "type: " + string);
            this.o = string;
        }
        Logger.v(V, "sceneType: " + this.o);
    }

    @Override // com.huawei.hms.network.embedded.z2
    public void acquireClient(a1 a1Var) {
        String value = a1Var.getPolicyExecutor().getValue("", PolicyNetworkService.ClientConstants.TRAFFIC_CLASS);
        if (TextUtils.isEmpty(value)) {
            return;
        }
        this.B = StringUtils.stringToInteger(value, -1);
    }

    private void d() {
        String str;
        PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(ContextHolder.getResourceContext(), RemoteInitializer.b.i);
        try {
            if (!HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getAppContext())) {
                pLSharedPreferences.clear();
                return;
            }
            try {
                Map<String, ?> all = pLSharedPreferences.getAll();
                if (all.isEmpty()) {
                    Logger.v(V, "the dynamic init data is empty!");
                    pLSharedPreferences.clear();
                    return;
                }
                y2 y2Var = new y2();
                y2Var.put("kit_version", (String) all.get("kit_version"));
                y2Var.put("error_code", (String) all.get("error_code"));
                y2Var.put("total_time", (String) all.get("total_time"));
                y2Var.put("message", (String) all.get("message"));
                y2Var.put("exception_name", (String) all.get("exception_name"));
                y2Var.put("req_start_time", (String) all.get("req_start_time"));
                y2Var.put(y2.SPILT_MODULES_MSG, (String) all.get(y2.SPILT_MODULES_MSG));
                ClassLoader classLoader = getClass().getClassLoader();
                y2Var.put("kit_provider", classLoader == null ? null : classLoader.getClass().getCanonicalName());
                HianalyticsHelper.getInstance().onEvent(y2Var.get(), "network_load");
                pLSharedPreferences.clear();
            } catch (ClassCastException e) {
                e = e;
                str = "the map cast has error!";
                Logger.w(V, str);
                HianalyticsHelper.getInstance().reportException(e, CrashHianalyticsData.EVENT_ID_CRASH);
            } catch (Exception e2) {
                e = e2;
                str = "the dynamic data has error! exception = " + e.getClass().getSimpleName();
                Logger.w(V, str);
                HianalyticsHelper.getInstance().reportException(e, CrashHianalyticsData.EVENT_ID_CRASH);
            }
        } catch (Throwable th) {
            pLSharedPreferences.clear();
            throw th;
        }
    }

    private <T> void c(T t) {
        boolean zB;
        synchronized (this) {
            try {
                if (!InitReport.isHasConnectNet()) {
                    Logger.i(V, "unable to report before first connect");
                    return;
                }
                if (this.u.size() > 0) {
                    List<d1> list = this.u;
                    zB = b(list.get(list.size() - 1));
                } else {
                    zB = true;
                }
                Logger.v(V, "reportImmediate:%s", Boolean.valueOf(zB));
                if (zB) {
                    try {
                        HianalyticsHelper.getInstance().getReportExecutor().submit(new a(t));
                    } catch (RejectedExecutionException unused) {
                        Logger.w(V, "executor rejected at report");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private long c() {
        long j;
        if (this.u.size() == 0) {
            return 0L;
        }
        List<d1> list = this.u;
        d1 d1Var = list.get(list.size() - 1);
        if (d1Var != null && d1Var.getRequestFinishedInfo() != null) {
            v2 v2Var = (v2) d1Var.getRequestFinishedInfo().getMetricsRealTime();
            if (v2Var.getCallStartTime() == 0) {
                return 0L;
            }
            if (d1Var instanceof j3) {
                j = this.k;
            } else if (d1Var instanceof j2) {
                j = this.j;
            }
            return j - v2Var.getCallStartTime();
        }
        return 0L;
    }

    private <T> boolean b(d1 d1Var) {
        if (!(d1Var instanceof j2) && !(d1Var instanceof j3)) {
            return true;
        }
        Logger.v(V, "listenerFinishState:%d", Integer.valueOf(this.y));
        return (this.y & 3) == 3;
    }

    private <T> void b(T t) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        linkedHashMapPack.put("package", ContextHolder.getAppContext().getPackageName()).put("version", "8.0.1.320").put("service", "networkkit").put("apiName", HianalyticsBaseData.EVENT_ID).put("result", t instanceof Integer ? 0L : -1L).put(WiseOpenHianalyticsData.UNION_COSTTIME, this.h).put(WiseOpenHianalyticsData.UNION_APP_VERSION, PackageManagerCompat.getAppVersion(ContextHolder.getAppContext())).put("callTime", this.f15383c);
        HianalyticsHelper.getInstance().onEvent(linkedHashMapPack.getAll(), "60000", 0);
    }

    private void b(Response response) {
        List<String> list;
        if (response == null || response.getHeaders() == null || (list = response.getHeaders().get(c0)) == null || list.isEmpty()) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        this.s = stringBuffer.toString();
    }

    private String b() {
        JSONObject jSONObject;
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        boolean z = m4.c().b("ai") != null;
        linkedHashMapPack.put("ai", z);
        if (z) {
            boolean zStringToBoolean = StringUtils.stringToBoolean(String.valueOf(ConfigAPI.getValue(NetworkService.Constants.AI_IPSORT_SWITCH)), false);
            if (zStringToBoolean) {
                linkedHashMapPack.put(NetworkService.Constants.AI_IPSORT_SWITCH, zStringToBoolean);
            }
            boolean zStringToBoolean2 = StringUtils.stringToBoolean(String.valueOf(ConfigAPI.getValue(NetworkService.Constants.AI_CONNECTTIMEOUT_SWITCH)), false);
            if (zStringToBoolean2) {
                linkedHashMapPack.put(NetworkService.Constants.AI_CONNECTTIMEOUT_SWITCH, zStringToBoolean2);
            }
            boolean zStringToBoolean3 = StringUtils.stringToBoolean(String.valueOf(ConfigAPI.getValue("ai_ping_enable")), false);
            if (zStringToBoolean3) {
                linkedHashMapPack.put("ai_ping_enable", zStringToBoolean3);
            }
            jSONObject = new JSONObject(linkedHashMapPack.getAll());
        } else {
            jSONObject = new JSONObject(linkedHashMapPack.getAll());
        }
        return jSONObject.toString();
    }

    private <T> boolean a(T t, x2 x2Var, Context context) {
        if (ReflectionUtils.isAbTestEnable() && ABHelper.getInstance().isInAllowList(String.valueOf(ConfigAPI.getValue(PolicyNetworkService.GlobalConstants.AB_ALLOWED_LIST)))) {
            String reportAbInfo = ABHelper.getInstance().getReportAbInfo();
            if (!TextUtils.isEmpty(reportAbInfo)) {
                x2Var.put(x2.INRATE, "" + (HianalyticsHelper.getInstance().inRate() ? 1 : 0));
                x2Var.put(x2.AB_INFO, reportAbInfo);
                return true;
            }
        }
        if ((t instanceof Exception) && HianalyticsHelper.getInstance().isEnableReportNoSeed(context)) {
            x2Var.put(x2.INRATE, "" + (HianalyticsHelper.getInstance().inRate() ? 1 : 0));
            return true;
        }
        if (this.u.size() > 0) {
            List<d1> list = this.u;
            RequestFinishedInfo requestFinishedInfo = list.get(list.size() - 1).getRequestFinishedInfo();
            if (requestFinishedInfo != null && requestFinishedInfo.getNetworkSdkType().equals("type_cronet")) {
                if (!HianalyticsHelper.getInstance().isQuicEnableReport(context)) {
                    return false;
                }
                x2Var.put(x2.INRATE, "" + (HianalyticsHelper.getInstance().inRate() ? 1 : 0));
                return true;
            }
        }
        return HianalyticsHelper.getInstance().isEnableReport(context);
    }

    private boolean a(Integer num) {
        return num.intValue() == 10000101;
    }

    private void a(String str) {
        Logger.v(V, "callId = %d / %s : ElapsedTime = %d", Long.valueOf(this.f15382b), str, Long.valueOf(System.currentTimeMillis() - this.f15383c));
    }

    private void a(x2 x2Var) {
        x2Var.put(x2.NETWORK_TIME, c());
        int size = this.u.size();
        if (size > 0) {
            int i = size - 1;
            x2Var.put(a(this.u.get(i)));
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < i; i2++) {
                jSONArray.put(new JSONObject(a(this.u.get(i2))));
            }
            if (jSONArray.length() > 0) {
                x2Var.put(x2.FAILED_INFO, jSONArray.toString());
            }
        }
    }

    private void a(LinkedHashMapPack linkedHashMapPack, RequestFinishedInfo requestFinishedInfo, h1.d dVar) {
        if (requestFinishedInfo.getResponse() == null) {
            Logger.v(V, "reponse is null, try to get net msg id from request");
            String strA = a(dVar);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            linkedHashMapPack.put(x2.NETWORK_MSG_ID, strA);
            return;
        }
        Headers headersOf = Headers.of(requestFinishedInfo.getResponse().getHeaders());
        String strA2 = a(headersOf.get(g4.g), 2);
        if (!TextUtils.isEmpty(strA2)) {
            linkedHashMapPack.put(x2.NETWORK_VENDOR, strA2);
        }
        String strA3 = a(headersOf.get("network-in"), 0);
        if (!TextUtils.isEmpty(strA3)) {
            linkedHashMapPack.put(x2.NETWORK_IN, strA3);
        }
        String strA4 = a(headersOf.get("network-out"), 1);
        if (!TextUtils.isEmpty(strA4)) {
            linkedHashMapPack.put(x2.NETWORK_OUT, strA4);
        }
        String str = headersOf.get("net-msg-id");
        if (TextUtils.isEmpty(str)) {
            String strA5 = a(dVar);
            if (TextUtils.isEmpty(strA5)) {
                Logger.v(V, "there is no net-msg-id in request and reponse");
            } else {
                Logger.v(V, "report net msg id from request");
                linkedHashMapPack.put(x2.NETWORK_MSG_ID, strA5);
            }
        } else {
            Logger.v(V, "report net msg id from reponse");
            linkedHashMapPack.put(x2.NETWORK_MSG_ID, str);
        }
        String str2 = headersOf.get(HeaderType.X_NUWA_SAMPLE_STATE);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        linkedHashMapPack.put(x2.X_NUWA_SAMPLE_STATE, str2);
    }

    private void a(LinkedHashMapPack linkedHashMapPack) {
        linkedHashMapPack.put(x2.CP_INTERCEPTOR_NUM, this.G + this.H);
        long jA = this.G == 0 ? 0L : a(this.I, this.i);
        long jA2 = this.G == 0 ? 0L : a(this.M, this.L);
        long jA3 = this.H == 0 ? 0L : a(this.K, this.J);
        long jA4 = this.H != 0 ? a(this.O, this.N) : 0L;
        linkedHashMapPack.put(x2.CP_INTERCEPTOR_COST, jA + jA2 + jA3 + jA4);
        Logger.v(V, "cpApplicationInterceptorNum:" + this.G + " cpAppInterceptorReqCost:" + jA + "  cpAppInterceptorResCost:" + jA2);
        Logger.v(V, "cpNetworkInterceptorNum:" + this.H + " cpNetInterceptorReqCost:" + jA3 + "  cpNetInterceptorResCost:" + jA4);
        long jA5 = a(this.P, this.K);
        long jA6 = a(this.N, this.Q);
        long jA7 = a(this.J, this.I);
        long jA8 = a(this.L, this.O);
        linkedHashMapPack.put(x2.RC_INTERCEPTOR_COST, jA5 + jA6 + jA7 + jA8);
        Logger.v(V, "rcApplicationInterceptorReqCost:" + jA7 + "  rcApplicationInterceptorResCost:" + jA8 + " rcNetworkInterceptorReqCost:" + jA5 + "  rcNetworkInterceptorResCost:" + jA6);
        linkedHashMapPack.put(x2.PROTOCOL_COST, a(this.Q, this.P));
        StringBuilder sb = new StringBuilder("protocolCost:");
        sb.append(a(this.Q, this.P));
        Logger.v(V, sb.toString());
    }

    private void a(int i) {
        synchronized (this) {
            this.y = i | this.y;
        }
    }

    private void a() {
        this.f = SystemClock.elapsedRealtime() - this.i;
        a(1);
        Exception exc = this.x;
        if (exc != null) {
            c(exc);
        } else {
            c(Integer.valueOf(this.m));
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x020e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0214  */
    /* JADX WARN: Code duplicated, block: B:53:0x0222  */
    private LinkedHashMap<String, String> a(d1 d1Var) {
        RequestFinishedInfo requestFinishedInfo;
        long connectRetryTime;
        Exception exception;
        String strA;
        String str;
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        if (d1Var == null || (requestFinishedInfo = d1Var.getRequestFinishedInfo()) == null || d1Var.request() == null) {
            Logger.w(V, "the task or reqInfo is null,and the collection is failed!");
        } else {
            u2 u2Var = (u2) requestFinishedInfo.getMetrics();
            List<String> connectIps = u2Var.getConnectIps();
            if (connectIps.isEmpty()) {
                try {
                    for (InetAddress inetAddress : InetAddress.getAllByName(requestFinishedInfo.getHost())) {
                        connectIps.add(inetAddress.getHostAddress());
                    }
                } catch (NullPointerException | UnknownHostException e) {
                    Logger.w(V, e);
                }
            }
            String string = connectIps.isEmpty() ? null : Arrays.toString(connectIps.toArray());
            String successIp = requestFinishedInfo.getMetrics().getSuccessIp();
            if (!TextUtils.isEmpty(successIp)) {
                string = string + "/" + successIp;
                if (CheckParamUtils.isIpV6(successIp)) {
                    linkedHashMapPack.put(x2.IP_TYPE, "AAAA");
                }
                str = CheckParamUtils.isIpV4(successIp) ? "A" : "unknown";
                connectRetryTime = u2Var.getConnectRetryTime();
                LinkedHashMapPack linkedHashMapPackPut = linkedHashMapPack.put("server_ip", string).put("domain", requestFinishedInfo.getHost()).put(x2.REQ_SIZE, u2Var.getRequestByteCount()).put(x2.RSP_SIZE, u2Var.getResponseByteCount());
                if (connectRetryTime < 0) {
                    connectRetryTime = 0;
                }
                linkedHashMapPackPut.put(x2.CONNECT_RETRY, connectRetryTime).put(x2.PROTOCOL, u2Var.getProtocol()).put("protocol_impl", requestFinishedInfo.getNetworkSdkType()).put(x2.TLS_VERSION, u2Var.getTlsVersion()).put(x2.TLS_CIPHERSUITE, u2Var.getCipherSuite());
                linkedHashMapPack.put(x2.CONNECT_OUT_IP, a(u2Var, requestFinishedInfo));
                v2 v2Var = (v2) requestFinishedInfo.getMetricsRealTime();
                linkedHashMapPack.put("req_total_time", v2Var.getTotalTime()).put("tcpconn_time", a(v2Var.getSecureConnectStartTime(), v2Var.getConnectStartTime())).put("ssl_time", a(v2Var.getSecureConnectEndTime(), v2Var.getSecureConnectStartTime())).put("connect_time", a(v2Var.getConnectEndTime(), v2Var.getConnectStartTime())).put(x2.REQ_START_TRANSFER, a(v2Var.getRequestHeadersStartTime(), v2Var.getCallStartTime())).put(x2.TTFB, v2Var.getTtfb()).put(x2.TTFBV1, v2Var.getTtfbV1()).put(x2.DNS_TIME, a(v2Var.getDnsEndTime(), v2Var.getDnsStartTime())).put(x2.DNS_TYPE, u2Var.getDnsType()).put(x2.DNS_CACHE, u2Var.getDnsCache()).put(x2.DNS_TTL, u2Var.getDnsTtl()).put(x2.DNS_STATUS, u2Var.getDnsStatus()).put("dns_server_ips", NetworkUtil.getDnsServerIps(ContextHolder.getAppContext())).put("req_start_time", requestFinishedInfo.getMetricsTime().getCallStartTime());
                a(linkedHashMapPack);
                exception = requestFinishedInfo.getException();
                if (exception == null && !this.U) {
                    if (!this.w) {
                        this.m = 10000802;
                        if (d1Var instanceof j2) {
                            this.m = g2.getInstance().mappingCronetErrorCode(exception);
                        }
                        if (this.m == 10000802) {
                            this.m = i4.getErrorCodeFromException(exception);
                        }
                    }
                    linkedHashMapPack.put("error_code", this.m).put("exception_name", exception.getClass().getSimpleName()).put("message", StringUtils.anonymizeMessage(exception.getMessage()));
                } else if (requestFinishedInfo.getResponse() != null) {
                    strA = a(requestFinishedInfo.getResponse());
                    if (!TextUtils.isEmpty(strA)) {
                        linkedHashMapPack.put(x2.DL_FROM, strA);
                    }
                }
                a(linkedHashMapPack, requestFinishedInfo, d1Var.request());
            }
            linkedHashMapPack.put(x2.IP_TYPE, str);
            connectRetryTime = u2Var.getConnectRetryTime();
            LinkedHashMapPack linkedHashMapPackPut2 = linkedHashMapPack.put("server_ip", string).put("domain", requestFinishedInfo.getHost()).put(x2.REQ_SIZE, u2Var.getRequestByteCount()).put(x2.RSP_SIZE, u2Var.getResponseByteCount());
            if (connectRetryTime < 0) {
                connectRetryTime = 0;
            }
            linkedHashMapPackPut2.put(x2.CONNECT_RETRY, connectRetryTime).put(x2.PROTOCOL, u2Var.getProtocol()).put("protocol_impl", requestFinishedInfo.getNetworkSdkType()).put(x2.TLS_VERSION, u2Var.getTlsVersion()).put(x2.TLS_CIPHERSUITE, u2Var.getCipherSuite());
            linkedHashMapPack.put(x2.CONNECT_OUT_IP, a(u2Var, requestFinishedInfo));
            v2 v2Var2 = (v2) requestFinishedInfo.getMetricsRealTime();
            linkedHashMapPack.put("req_total_time", v2Var2.getTotalTime()).put("tcpconn_time", a(v2Var2.getSecureConnectStartTime(), v2Var2.getConnectStartTime())).put("ssl_time", a(v2Var2.getSecureConnectEndTime(), v2Var2.getSecureConnectStartTime())).put("connect_time", a(v2Var2.getConnectEndTime(), v2Var2.getConnectStartTime())).put(x2.REQ_START_TRANSFER, a(v2Var2.getRequestHeadersStartTime(), v2Var2.getCallStartTime())).put(x2.TTFB, v2Var2.getTtfb()).put(x2.TTFBV1, v2Var2.getTtfbV1()).put(x2.DNS_TIME, a(v2Var2.getDnsEndTime(), v2Var2.getDnsStartTime())).put(x2.DNS_TYPE, u2Var.getDnsType()).put(x2.DNS_CACHE, u2Var.getDnsCache()).put(x2.DNS_TTL, u2Var.getDnsTtl()).put(x2.DNS_STATUS, u2Var.getDnsStatus()).put("dns_server_ips", NetworkUtil.getDnsServerIps(ContextHolder.getAppContext())).put("req_start_time", requestFinishedInfo.getMetricsTime().getCallStartTime());
            a(linkedHashMapPack);
            exception = requestFinishedInfo.getException();
            if (exception == null) {
                if (requestFinishedInfo.getResponse() != null) {
                    strA = a(requestFinishedInfo.getResponse());
                    if (!TextUtils.isEmpty(strA)) {
                        linkedHashMapPack.put(x2.DL_FROM, strA);
                    }
                }
            } else if (requestFinishedInfo.getResponse() != null) {
                strA = a(requestFinishedInfo.getResponse());
                if (!TextUtils.isEmpty(strA)) {
                    linkedHashMapPack.put(x2.DL_FROM, strA);
                }
            }
            a(linkedHashMapPack, requestFinishedInfo, d1Var.request());
        }
        return linkedHashMapPack.getAll();
    }

    private String a(String str, int i) {
        String str2;
        if (i == 0) {
            str2 = this.R;
        } else if (i != 1) {
            str2 = i != 2 ? "" : this.T;
        } else {
            str2 = this.S;
        }
        Logger.v(V, "networkHeaderData:" + str);
        Logger.v(V, "extralInfo:" + str2);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        int iIndexOf = str.indexOf(59);
        int length = str.length() - 1;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (iIndexOf != length) {
            sb.append(';');
        }
        sb.append(str2);
        return sb.toString();
    }

    private <T> String a(T t) {
        String str;
        HashMap map = new HashMap();
        try {
            map.putAll(this.F.getSyncNetDiagnosisInfo(this.i, this.k, t instanceof Exception, this.E));
            return new JSONObject(map).toString();
        } catch (NullPointerException e) {
            e = e;
            str = "key == null";
            Logger.w(V, str);
            HianalyticsHelper.getInstance().reportException(e, CrashHianalyticsData.EVENT_ID_CRASH);
            return "";
        } catch (Throwable th) {
            e = th;
            str = "netdiag has error!";
            Logger.w(V, str);
            HianalyticsHelper.getInstance().reportException(e, CrashHianalyticsData.EVENT_ID_CRASH);
            return "";
        }
    }

    private String a(Response response) {
        String str = Headers.of(response.getHeaders()).get("dl-from");
        for (String str2 : x2.DL_WHITESPACE) {
            if (str2.equalsIgnoreCase(str)) {
                return str2;
            }
        }
        return "";
    }

    private String a(u2 u2Var, RequestFinishedInfo requestFinishedInfo) {
        if (requestFinishedInfo.getNetworkSdkType() != "type_okhttp") {
            return null;
        }
        List<String> connectIps = u2Var.getConnectIps();
        if (connectIps.isEmpty()) {
            Logger.d(V, "connect ip is empty");
            return null;
        }
        String successIp = u2Var.getSuccessIp();
        if (TextUtils.isEmpty(successIp)) {
            Logger.d(V, "success ip is empty, all connect ip expire");
            return StringUtils.collection2String(connectIps);
        }
        LinkedList linkedList = new LinkedList();
        for (String str : connectIps) {
            if (successIp.equals(str)) {
                break;
            }
            linkedList.add(str);
        }
        return StringUtils.collection2String(linkedList);
    }

    private String a(h1.d dVar) {
        String str = Headers.of(dVar.getHeaders()).get("net-msg-id");
        if (TextUtils.isEmpty(str)) {
            Logger.v(V, "there is no net-msg-id in request");
            return "";
        }
        Logger.v(V, "net msg id in request: " + str);
        return str;
    }

    public static class b implements z2.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AtomicLong f15386b = new AtomicLong(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15387a;

        @Override // com.huawei.hms.network.embedded.z2.c
        public z2 create(Submit submit) {
            return new t2(f15386b.getAndIncrement(), this.f15387a, null);
        }

        public b(boolean z) {
            this.f15387a = z;
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f15384a;

        @Override // java.lang.Runnable
        public void run() {
            t2.this.reportData(this.f15384a);
        }

        public a(Object obj) {
            this.f15384a = obj;
        }
    }

    public /* synthetic */ t2(long j, boolean z, a aVar) {
        this(j, z);
    }

    public t2(long j, boolean z) {
        this.e = 0;
        this.l = 0L;
        this.o = "default";
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = false;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.U = false;
        this.C = NetworkKitInnerImpl.getInstance().getPolicyNetworkService(NetworkService.Constants.CONFIG_SERVICE);
        this.f15382b = j;
        this.f15381a = z;
        this.E = StringUtils.stringToBoolean(String.valueOf(ConfigAPI.getValue(k.i.f14986a)), false);
    }
}

package com.huawei.hms.network.embedded;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.Utils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class q0 {
    public static final String d = "HttpDnsClient";
    public static final String e = ",";
    public static final String f = "Retry-After";
    public static final String g = "metrics_data";
    public static final String h = "type";
    public static final String i = "ttl";
    public static final String j = "values";
    public static final String k = "values_v6";
    public static final String l = "domain";
    public static final String m = "dns";
    public static final String n = "error_code";
    public static final int o = 1000;
    public static final int p = 5;
    public static final int q = 86400;
    public static final int r = 600;
    public static final int s = 60;
    public static final int t = 503;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpClient f15215b = new HttpClient.Builder().retryTimeOnConnectionFailure(0).build();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f15216c;

    public void a(a aVar) {
        this.f15216c = aVar;
    }

    public ArrayList<m0> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (String str : list) {
            if (i2 >= 5) {
                break;
            }
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
                i2++;
            }
        }
        p0 p0Var = new p0();
        p0Var.put("trigger_type", "dns_init");
        ArrayList<m0> arrayListA = a(arrayList, p0Var);
        p0.a();
        if (HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getAppContext())) {
            Logger.v("HttpDnsClient", "httpdns report data to aiops is: %s", new JSONObject(p0Var.get()));
            HianalyticsHelper.getInstance().executeReportHa(p0Var, "dns_request");
        }
        return arrayListA;
    }

    public a a() {
        return this.f15216c;
    }

    public m0 a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        p0 p0Var = new p0();
        ArrayList<m0> arrayListA = a(arrayList, p0Var);
        p0.a();
        if (HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getAppContext())) {
            Logger.v("HttpDnsClient", "httpdns report data to aiops is: %s", new JSONObject(p0Var.get()));
            HianalyticsHelper.getInstance().executeReportHa(p0Var, "dns_request");
        }
        Iterator<m0> it = arrayListA.iterator();
        return it.hasNext() ? it.next() : new m0();
    }

    private ArrayList<m0> a(List<String> list, p0 p0Var) {
        long code;
        if (TextUtils.isEmpty(this.f15214a)) {
            Logger.e("HttpDnsClient", "HttpDns baseUrl is null,maybe accountId is null");
            return new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append(str);
                i2++;
            }
        }
        String str2 = this.f15214a + sb.toString();
        Logger.v("HttpDnsClient", "send the request to server:" + str2);
        String string = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metrics_data", new JSONObject().put("trace_id", string));
        } catch (JSONException e2) {
            Logger.w("HttpDnsClient", "recordMap fail to put:", e2);
        }
        p0Var.put("trace_id", string);
        p0Var.put("request_domain", list.toString());
        p0Var.put("network_type", NetworkUtil.getCurrentNetworkType());
        Request requestBuild = this.f15215b.newRequest().options(jSONObject.toString()).url(str2).build();
        ArrayList<m0> arrayList = new ArrayList<>();
        Submit<ResponseBody> submitNewSubmit = this.f15215b.newSubmit(requestBuild);
        try {
            Response<ResponseBody> responseExecute = submitNewSubmit.execute();
            if (responseExecute.isOK()) {
                arrayList = a(responseExecute);
                if (arrayList.isEmpty()) {
                    code = 10020001;
                    p0Var.put("error_code", code);
                } else {
                    p0Var.put("error_code", 10020000L);
                    Logger.v("HttpDnsClient", arrayList);
                }
            } else if (responseExecute.getCode() == 503) {
                p0Var.put("error_code", responseExecute.getCode());
                long jStringToLong = StringUtils.stringToLong(Headers.of(responseExecute.getHeaders()).get(f), 60L) * 1000;
                a(new a(jStringToLong, Utils.getCurrentTime(true)));
                Logger.i("HttpDnsClient", "retry-after:" + jStringToLong);
            } else {
                Logger.i("HttpDnsClient", "httpDns request error code:" + responseExecute.getCode());
                code = (long) responseExecute.getCode();
                p0Var.put("error_code", code);
            }
            RequestFinishedInfo requestFinishedInfo = submitNewSubmit.getRequestFinishedInfo();
            if (requestFinishedInfo != null) {
                p0Var.put("dns_server_ips", Arrays.toString(requestFinishedInfo.getMetrics().getConnectIps().toArray()));
                p0Var.put(p0.n, requestFinishedInfo.getMetricsTime().getTotalTime());
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<m0> it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append(Arrays.toString(it.next().d().toArray()));
            }
            p0Var.put(p0.l, sb2.toString());
            return arrayList;
        } catch (IOException e3) {
            Logger.w("HttpDnsClient", "IOException: ", e3);
            p0Var.put("error_code", z.a((Exception) e3));
            return arrayList;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f15217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15218b;

        public boolean a() {
            return SystemClock.elapsedRealtime() - this.f15218b <= this.f15217a;
        }

        public a(long j, long j2) {
            this.f15217a = j;
            this.f15218b = j2;
        }
    }

    private ArrayList<m0> a(Response<ResponseBody> response) {
        String str;
        ArrayList<m0> arrayList = new ArrayList<>();
        try {
            String strByte2Str = StringUtils.byte2Str(IoUtils.toByteArray(response.getBody().getInputStream()));
            Logger.v("HttpDnsClient", "BODY:" + strByte2Str);
            JSONArray jSONArray = new JSONObject(strByte2Str).getJSONArray("dns");
            arrayList.ensureCapacity(jSONArray.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                m0 m0VarA = a(jSONArray.getJSONObject(i2));
                m0VarA.a(0);
                arrayList.add(m0VarA);
            }
        } catch (IOException e2) {
            e = e2;
            str = "IOException";
            Logger.w("HttpDnsClient", str, e);
        } catch (JSONException e3) {
            Logger.w("HttpDnsClient", "JSONException", e3.getClass().getSimpleName());
        } catch (Throwable th) {
            e = th;
            str = "parseResponse error";
            Logger.w("HttpDnsClient", str, e);
        }
        return arrayList;
    }

    private m0 a(JSONObject jSONObject) {
        boolean z;
        m0 m0Var = new m0();
        m0Var.b(3);
        if (TextUtils.isEmpty(jSONObject.optString("error_code"))) {
            int iOptInt = jSONObject.optInt("ttl");
            if (iOptInt > 86400) {
                iOptInt = 86400;
            } else if (iOptInt < 0) {
                iOptInt = 600;
            }
            m0Var.b(iOptInt * 1000);
            m0Var.b(jSONObject.optString("domain"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(j);
            int i2 = 0;
            boolean z2 = false;
            if (jSONArrayOptJSONArray == null) {
                Logger.e("HttpDnsClient", "response return empty ipv4 values");
                z = false;
            } else {
                int i3 = 0;
                z = false;
                while (i3 < jSONArrayOptJSONArray.length()) {
                    m0Var.a((String) jSONArrayOptJSONArray.opt(i3));
                    i3++;
                    z = true;
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(k);
            if (jSONArrayOptJSONArray2 == null) {
                Logger.w("HttpDnsClient", "response return empty ipv6 values");
            } else {
                boolean z3 = false;
                while (i2 < jSONArrayOptJSONArray2.length()) {
                    m0Var.a((String) jSONArrayOptJSONArray2.opt(i2));
                    i2++;
                    z3 = true;
                }
                z2 = z3;
            }
            y.a(m0Var, z, z2);
        }
        return m0Var;
    }

    public q0(String str) {
        this.f15214a = str;
    }
}

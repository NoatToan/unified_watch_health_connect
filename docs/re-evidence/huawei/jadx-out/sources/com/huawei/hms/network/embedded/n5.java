package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class n5 {
    public static final String i = "RequestMetrics";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15128c;
    public long d;
    public long e;
    public long f;
    public String g;
    public boolean h;

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("domain", this.f15126a);
            jSONObject.put(p5.d, this.g);
            jSONObject.put(p5.e, this.f15127b);
            jSONObject.put(p5.f, this.f15128c);
            jSONObject.put(p5.g, this.d);
            jSONObject.put(p5.h, this.e);
            return jSONObject;
        } catch (JSONException unused) {
            Logger.w(i, "Generate RequestMetrics Error");
            return jSONObject;
        }
    }

    public boolean h() {
        return this.h;
    }

    public long g() {
        return this.d;
    }

    public long f() {
        return this.f;
    }

    public String e() {
        return this.g;
    }

    public String d() {
        return this.f15126a;
    }

    public long c() {
        return this.f15127b;
    }

    public long b() {
        return this.f15128c;
    }

    public long a() {
        return this.e;
    }

    public n5(RequestFinishedInfo requestFinishedInfo) {
        if (requestFinishedInfo == null || requestFinishedInfo.getMetricsTime() == null) {
            return;
        }
        RequestFinishedInfo.MetricsTime metricsTime = requestFinishedInfo.getMetricsTime();
        this.f15126a = requestFinishedInfo.getHost();
        this.f15127b = metricsTime.getDnsEndTime() - metricsTime.getDnsStartTime();
        this.f15128c = metricsTime.getConnectEndTime() - metricsTime.getConnectStartTime();
        this.d = metricsTime.getSecureConnectEndTime() - metricsTime.getSecureConnectStartTime();
        this.e = metricsTime.getConnectStartTime();
        this.f = metricsTime.getSecureConnectStartTime();
        this.g = requestFinishedInfo.getMetrics().getSuccessIp();
        this.h = requestFinishedInfo.getResponse() == null ? false : requestFinishedInfo.getResponse().isOK();
    }

    public n5(Interceptor.Chain chain) {
        RequestFinishedInfo requestFinishedInfo = chain.requestFinishedInfo();
        if (requestFinishedInfo != null) {
            RequestFinishedInfo.MetricsTime metricsTime = requestFinishedInfo.getMetricsTime();
            this.f15126a = chain.requestFinishedInfo().getHost();
            this.g = requestFinishedInfo.getMetrics().getSuccessIp();
            this.h = requestFinishedInfo.getResponse() == null ? false : requestFinishedInfo.getResponse().isOK();
            if (metricsTime != null) {
                this.f15127b = metricsTime.getDnsEndTime() - metricsTime.getDnsStartTime();
                this.f15128c = metricsTime.getConnectEndTime() - metricsTime.getConnectStartTime();
                this.d = metricsTime.getSecureConnectEndTime() - metricsTime.getSecureConnectStartTime();
                this.e = metricsTime.getConnectStartTime();
                this.f = metricsTime.getSecureConnectStartTime();
            }
        }
    }
}

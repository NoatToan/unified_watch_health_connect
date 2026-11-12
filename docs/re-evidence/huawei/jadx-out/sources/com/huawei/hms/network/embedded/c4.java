package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d4 f14672a = new d4();

    public void a() {
    }

    public void a(String str, String str2, String str3, d1 d1Var) {
    }

    public void a(Map<String, List<String>> map) {
    }

    public void b() {
    }

    public void b(String str) {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public RequestFinishedInfo getRequestFinishedInfo() {
        return this.f14672a;
    }

    public void b(long j) {
        this.f14672a.getMetrics().setResponseByteCount(j);
    }

    public void a(String str) {
        this.f14672a.setUrl(str);
        this.f14672a.getMetricsTime().setCallStartTime();
        this.f14672a.getMetricsRealTime().setCallStartTime();
    }

    public void a(Exception exc) {
        this.f14672a.setException(exc);
        this.f14672a.getMetricsTime().setCallEndTime();
        this.f14672a.getMetricsRealTime().setCallEndTime();
    }

    public void a(Response response) {
        this.f14672a.getMetricsTime().setCallEndTime();
        this.f14672a.getMetricsRealTime().setCallEndTime();
    }

    public void a(long j) {
        this.f14672a.getMetrics().setRequestByteCount(j);
    }
}

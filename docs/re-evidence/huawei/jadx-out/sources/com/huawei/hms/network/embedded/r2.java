package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes34.dex */
public abstract class r2 extends RequestFinishedInfo {
    public static final String f = "BaseRequestFinishedInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Exception f15272c;
    public Response d;
    public String e;

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public long getPingInterval() {
        return 0L;
    }

    public void setUrl(String str) {
        this.f15271b = str;
        try {
            this.f15270a = new URL(str).getHost();
        } catch (MalformedURLException unused) {
            Logger.i(f, "fail to get hostname from url");
        }
    }

    public void setResponse(Response response) {
        this.d = response;
    }

    public void setNetMsgId(String str) {
        this.e = str;
    }

    public void setException(Exception exc) {
        this.f15272c = exc;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public String getUrl() {
        return this.f15271b;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public Response getResponse() {
        return this.d;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public String getNetMsgId() {
        return this.e;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public String getHost() {
        return this.f15270a;
    }

    @Override // com.huawei.hms.network.httpclient.RequestFinishedInfo
    public Exception getException() {
        return this.f15272c;
    }
}

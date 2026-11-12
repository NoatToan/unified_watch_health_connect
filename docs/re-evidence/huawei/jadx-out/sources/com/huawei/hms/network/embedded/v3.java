package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.inner.api.RequestContext;

/* JADX INFO: loaded from: classes34.dex */
public class v3 extends RequestContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Request f15485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Response<ResponseBody> f15486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f15487c;
    public boolean d = false;
    public RequestFinishedInfo e;
    public String f;
    public int g;

    @Override // com.huawei.hms.network.inner.api.RequestContext
    public Throwable throwable() {
        return this.f15487c;
    }

    public void setThrowable(Throwable th) {
        this.f15487c = th;
    }

    public void setResponse(Response<ResponseBody> response) {
        if (response == null || (response instanceof h1.f)) {
            this.f15486b = response;
        } else {
            this.f15486b = new h1.f(response);
        }
    }

    public void setRequestFinishedInfo(RequestFinishedInfo requestFinishedInfo) {
        this.e = requestFinishedInfo;
    }

    public void setRequest(Request request) {
        if (request == null || (request instanceof h1.d)) {
            this.f15485a = request;
        } else {
            this.f15485a = new h1.d(request);
        }
    }

    public void setConnectTimeout(int i) {
        this.g = i;
    }

    public void setChannel(String str) {
        this.f = str;
    }

    public void setCancel(boolean z) {
        this.d = z;
    }

    @Override // com.huawei.hms.network.inner.api.RequestContext
    public Response<ResponseBody> response() {
        return this.f15486b;
    }

    @Override // com.huawei.hms.network.inner.api.RequestContext
    public RequestFinishedInfo requestFinishedInfo() {
        return this.e;
    }

    @Override // com.huawei.hms.network.inner.api.RequestContext
    public Request request() {
        return this.f15485a;
    }

    @Override // com.huawei.hms.network.inner.api.RequestContext
    public boolean isCancel() {
        return this.d;
    }

    @Override // com.huawei.hms.network.inner.api.RequestContext
    public int getConnectTimeout() {
        return this.g;
    }

    @Override // com.huawei.hms.network.inner.api.RequestContext
    public String getChannel() {
        return this.f;
    }
}

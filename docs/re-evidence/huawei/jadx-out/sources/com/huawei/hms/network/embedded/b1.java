package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.inner.api.RequestContext;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class b1 extends Interceptor.Chain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HttpClient f14592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Interceptor> f14593c;
    public z2 d;
    public d1 e;
    public RequestContext f;

    @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
    public RequestFinishedInfo requestFinishedInfo() {
        d1 d1Var = this.e;
        if (d1Var != null) {
            return d1Var.getRequestFinishedInfo();
        }
        return null;
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
    public h1.d request() {
        return (h1.d) this.f.request();
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
    public Response<ResponseBody> proceed(Request request) throws IOException {
        ((v3) this.f).setRequest(request);
        return a(this.f, this.e);
    }

    public d1 getRequestTask() {
        return this.e;
    }

    public z2 getRCEventListener() {
        return this.d;
    }

    public HttpClient getClient() {
        return this.f14592b;
    }

    public h1.f<ResponseBody> a(RequestContext requestContext, d1 d1Var) throws IOException {
        if (this.f14591a >= this.f14593c.size()) {
            throw new AssertionError();
        }
        h1.b bVar = new h1.b(new b1(this.f14592b, requestContext, this.f14593c, this.d, this.f14591a + 1, d1Var));
        Interceptor interceptor = this.f14593c.get(this.f14591a);
        Response<ResponseBody> responseIntercept = interceptor.intercept(bVar);
        if (this.f14591a == 0) {
            this.d.cpApplicationInterceptorResEnd();
            g4.getInstance().traceResponseNetworkKitOutEvent(this.d);
        }
        if (responseIntercept != null) {
            return responseIntercept instanceof h1.f ? (h1.f) responseIntercept : new h1.f<>(responseIntercept);
        }
        throw new NullPointerException("interceptor " + interceptor + " returned null");
    }

    public b1(HttpClient httpClient, RequestContext requestContext, List<Interceptor> list, z2 z2Var, int i, d1 d1Var) {
        this.f14592b = httpClient;
        this.f = requestContext;
        this.f14593c = list;
        this.f14591a = i;
        this.d = z2Var;
        this.e = d1Var;
    }
}

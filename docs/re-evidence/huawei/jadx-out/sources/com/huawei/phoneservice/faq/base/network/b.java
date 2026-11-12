package com.huawei.phoneservice.faq.base.network;

import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.framework.network.restclient.hwhttp.Interceptor;
import com.huawei.hms.framework.network.restclient.hwhttp.Request;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hms.framework.network.restclient.hwhttp.Response;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import defpackage.zcp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements Interceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21563b = "Xcallback";
    private final Charset e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f21564c = a.NONE;

    public enum a {
        NONE,
        HEADERS,
        BODY
    }

    @Override // com.huawei.hms.framework.network.restclient.hwhttp.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        a aVar = this.f21564c;
        zcp.e(chain);
        Request request = chain.request();
        zcp.b((Object) request, "");
        if (aVar == a.NONE) {
            Response responseProceed = chain.proceed(chain.request());
            zcp.b((Object) responseProceed, "");
            return responseProceed;
        }
        d(request);
        long jNanoTime = System.nanoTime();
        Response responseProceed2 = chain.proceed(request);
        zcp.b((Object) responseProceed2, "");
        return e(request, responseProceed2, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime));
    }

    public final b a(a aVar) {
        zcp.c(aVar, "");
        this.f21564c = aVar;
        return this;
    }

    public final Response c(Response response, byte[] bArr) {
        zcp.c(response, "");
        ResponseBody body = response.getBody();
        ResponseBody responseBodyBuild = new ResponseBody.Builder().contentLength(body.getContentLength()).contentType(body.getContentType()).inputStream(new ByteArrayInputStream(bArr)).charSet(this.e).build();
        zcp.b((Object) responseBodyBuild, "");
        Response responseBuild = new Response.Builder().body(responseBodyBuild).code(response.getCode()).headers(response.getHeaders()).message(response.getMessage()).build();
        zcp.b((Object) responseBuild, "");
        return responseBuild;
    }

    private final void d(Request request) {
        a aVar = this.f21564c;
        boolean z = aVar == a.BODY || aVar == a.HEADERS;
        RequestBody body = request.getBody();
        StringBuilder sb = new StringBuilder("Request");
        sb.append(" ");
        sb.append(request.getMethod());
        sb.append(" ");
        sb.append(request.getUrl().getUrl());
        zcp.b((Object) sb, "");
        if (z) {
            Headers headers = request.getHeaders();
            zcp.b((Object) headers, "");
            int size = headers.size();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb2.append(headers.name(i) + ' ' + headers.value(i));
                sb2.append(" ");
            }
            com.huawei.phoneservice.faq.base.util.g.a(this.f21563b, sb2.toString(), new Object[0]);
        }
        sb.append(" ");
        sb.append(StringUtils.byte2Str(body != null ? body.body() : null));
        com.huawei.phoneservice.faq.base.util.g.a(this.f21563b, sb.toString(), new Object[0]);
    }

    private final Response e(Request request, Response response, long j) throws IOException {
        Response.Builder builderNewBuilder = response.newBuilder();
        zcp.b((Object) builderNewBuilder, "");
        Response responseBuild = builderNewBuilder.build();
        zcp.b((Object) responseBuild, "");
        ResponseBody body = responseBuild.getBody();
        zcp.b((Object) body, "");
        byte[] bArrBytes = body.bytes();
        a aVar = this.f21564c;
        if (aVar == a.BODY || aVar == a.HEADERS) {
            Headers headers = responseBuild.getHeaders();
            zcp.b((Object) headers, "");
            int size = headers.size();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append(headers.name(i) + ':' + headers.value(i));
                sb.append(" ");
            }
            sb.append(responseBuild.getUrl());
            com.huawei.phoneservice.faq.base.util.g.a(this.f21563b, sb.toString(), new Object[0]);
        }
        StringBuilder sb2 = new StringBuilder("Response");
        sb2.append(" ");
        sb2.append(request.getMethod());
        sb2.append(" ");
        sb2.append(j);
        sb2.append("ms ");
        sb2.append(response.getUrl());
        sb2.append(" response params :");
        sb2.append(StringUtils.byte2Str(bArrBytes));
        zcp.b((Object) sb2, "");
        com.huawei.phoneservice.faq.base.util.g.a(this.f21563b, sb2.toString(), new Object[0]);
        return c(response, bArrBytes);
    }
}

package com.huawei.phoneservice.faq.base.network;

import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import defpackage.zcp;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends Interceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21559b = "Xcallback";
    private final Charset e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EnumC0254a f21558a = EnumC0254a.NONE;

    /* JADX INFO: renamed from: com.huawei.phoneservice.faq.base.network.a$a, reason: collision with other inner class name */
    public enum EnumC0254a {
        NONE,
        HEADERS,
        BODY
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response<ResponseBody> intercept(Interceptor.Chain chain) throws IOException {
        EnumC0254a enumC0254a = this.f21558a;
        zcp.e(chain);
        Request request = chain.request();
        zcp.b((Object) request, "");
        if (enumC0254a == EnumC0254a.NONE) {
            Response<ResponseBody> responseProceed = chain.proceed(chain.request());
            zcp.b((Object) responseProceed, "");
            return responseProceed;
        }
        e(request);
        long jNanoTime = System.nanoTime();
        Response<ResponseBody> responseProceed2 = chain.proceed(request);
        zcp.b((Object) responseProceed2, "");
        e(request, responseProceed2, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime));
        return responseProceed2;
    }

    public final a e(EnumC0254a enumC0254a) {
        zcp.c(enumC0254a, "");
        this.f21558a = enumC0254a;
        return this;
    }

    private final void e(Request request, Response<ResponseBody> response, long j) {
        StringBuilder sb = new StringBuilder("Response");
        sb.append(" ");
        sb.append(request.getMethod());
        sb.append(" ");
        sb.append(j);
        sb.append("ms ");
        sb.append(response.getUrl());
        sb.append(" ");
        zcp.b((Object) sb, "");
        com.huawei.phoneservice.faq.base.util.g.c(this.f21559b, sb.toString(), new Object[0]);
    }

    private final void e(Request request) {
        EnumC0254a enumC0254a = this.f21558a;
        boolean z = enumC0254a == EnumC0254a.BODY || enumC0254a == EnumC0254a.HEADERS;
        RequestBody body = request.getBody();
        StringBuilder sb = new StringBuilder("Request");
        sb.append(" ");
        sb.append(request.getMethod());
        sb.append(" ");
        sb.append(request.getUrl());
        zcp.b((Object) sb, "");
        if (z) {
            Map<String, List<String>> headers = request.getHeaders();
            zcp.b((Object) headers, "");
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                sb2.append(entry.getKey() + ' ' + entry.getValue());
                sb2.append(" ");
            }
            com.huawei.phoneservice.faq.base.util.g.c(this.f21559b, sb2.toString(), new Object[0]);
        }
        sb.append(" ");
        sb.append(body != null ? body.toString() : null);
        com.huawei.phoneservice.faq.base.util.g.c(this.f21559b, sb.toString(), new Object[0]);
    }
}

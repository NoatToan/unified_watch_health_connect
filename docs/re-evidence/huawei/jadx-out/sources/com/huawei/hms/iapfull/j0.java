package com.huawei.hms.iapfull;

import com.huawei.hms.framework.network.restclient.hwhttp.Interceptor;
import com.huawei.hms.framework.network.restclient.hwhttp.Request;
import com.huawei.hms.framework.network.restclient.hwhttp.Response;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class j0 implements Interceptor {
    @Override // com.huawei.hms.framework.network.restclient.hwhttp.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        StringBuilder sb;
        String str;
        String string;
        Request request = chain.request();
        Request.Builder builderHeaders = request.newBuilder().headers(chain.request().getHeaders().newBuilder().set("Content-Type", "application/json; charset=utf-8").add("Connection", "Keep-Alive"));
        String url = request.getUrl().getUrl();
        if (url == null) {
            y0.b("HeaderInterceptor", "url is null");
            string = null;
        } else {
            if (url.contains("?")) {
                sb = new StringBuilder();
                sb.append(url);
                str = "&app_version=iaplitesdk20201303";
            } else {
                sb = new StringBuilder();
                sb.append(url);
                str = "?app_version=iaplitesdk20201303";
            }
            sb.append(str);
            string = sb.toString();
        }
        return chain.proceed(builderHeaders.url(string).build());
    }
}

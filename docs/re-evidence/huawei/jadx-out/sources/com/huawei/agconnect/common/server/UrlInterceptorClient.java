package com.huawei.agconnect.common.server;

import android.content.Context;
import com.huawei.agconnect.credential.Server;
import java.io.IOException;
import java.util.Collections;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes22.dex */
public class UrlInterceptorClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SiteUrl f4917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f4918b = Boolean.FALSE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OkHttpClient f4919c;

    public SiteUrl c() {
        return this.f4917a;
    }

    public OkHttpClient b() {
        return this.f4919c;
    }

    public Boolean a() {
        return this.f4918b;
    }

    private void a(Context context) {
        this.f4919c = new ClientImpl(context, Collections.singletonList(new Interceptor() { // from class: com.huawei.agconnect.common.server.UrlInterceptorClient.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request request = chain.request();
                String str = request.url().scheme() + "://" + request.url().host();
                if (!Server.GW.equals(str)) {
                    return chain.proceed(request);
                }
                Request requestBuild = request.newBuilder().url(request.url().getUrl().replace(str, "https://" + UrlInterceptorClient.this.f4917a.f())).build();
                if (!UrlInterceptorClient.this.f4918b.booleanValue()) {
                    UrlInterceptorClient.this.f4918b = Boolean.TRUE;
                }
                return chain.proceed(requestBuild);
            }
        }), true).a();
    }

    public UrlInterceptorClient(Context context, SiteUrl siteUrl) {
        this.f4917a = siteUrl;
        a(context);
    }
}

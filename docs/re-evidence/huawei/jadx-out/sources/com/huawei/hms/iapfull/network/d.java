package com.huawei.hms.iapfull.network;

import android.content.Context;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hms.iapfull.k0;
import com.huawei.hms.iapfull.l0;
import com.huawei.hms.iapfull.y0;
import com.huawei.hms.network.embedded.y;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile IAPFullQueryResultService f13713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile IAPFullQueryResultService f13714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile IAPFullQueryResultService f13715c;
    private static volatile IAPFullQueryResultService d;

    public static IAPFullQueryResultService d(Context context, String str) {
        y0.b("QueryResultClient", "getWxWithholdResultService");
        if (d == null) {
            RestClient restClientBuild = f.a(context, str, y.f15619c).build();
            HttpClient.Builder builderNewBuilder = restClientBuild.getHttpClient().newBuilder();
            builderNewBuilder.addInterceptor(new l0());
            d = a(restClientBuild, builderNewBuilder);
        }
        return d;
    }

    public static IAPFullQueryResultService c(Context context, String str) {
        y0.b("QueryResultClient", "getWxPayResultService");
        if (f13715c == null) {
            RestClient restClientBuild = f.a(context, str, y.f15619c).build();
            HttpClient.Builder builderNewBuilder = restClientBuild.getHttpClient().newBuilder();
            builderNewBuilder.addInterceptor(new k0());
            f13715c = a(restClientBuild, builderNewBuilder);
        }
        return f13715c;
    }

    public static IAPFullQueryResultService b(Context context, String str) {
        y0.b("QueryResultClient", "getAlipayWithholdResultService");
        if (f13714b == null) {
            RestClient restClientBuild = f.a(context, str, 20000).build();
            f13714b = a(restClientBuild, restClientBuild.getHttpClient().newBuilder());
        }
        return f13714b;
    }

    public static IAPFullQueryResultService a(RestClient restClient, HttpClient.Builder builder) {
        return (IAPFullQueryResultService) restClient.newBuilder().httpClient(builder.build()).build().create(IAPFullQueryResultService.class);
    }

    public static IAPFullQueryResultService a(Context context, String str) {
        y0.b("QueryResultClient", "getAlipayPayResultService");
        if (f13713a == null) {
            RestClient restClientBuild = f.a(context, str, 20000).build();
            HttpClient.Builder builderNewBuilder = restClientBuild.getHttpClient().newBuilder();
            builderNewBuilder.addInterceptor(new k0());
            f13713a = a(restClientBuild, builderNewBuilder);
        }
        return f13713a;
    }
}

package com.huawei.agconnect.common.server;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.credential.Server;
import com.huawei.hms.network.embedded.g2;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
final class UrlInterceptorV2 implements Interceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4921b = "UrlInterceptorV2";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<SiteUrl> f4922a;

    /* JADX WARN: Code duplicated, block: B:23:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        AGCHostManager.a().a(request.header("sdkServiceName"));
        if (!Server.GW.equals(request.url().scheme() + "://" + request.url().host()) || this.f4922a.isEmpty()) {
            return chain.proceed(request);
        }
        UnknownHostException unknownHostException = null;
        UnknownHostException unknownHostException2 = null;
        Response responseA = null;
        for (int i = 0; i < this.f4922a.size(); i++) {
            SiteUrl siteUrl = this.f4922a.get(i);
            if (!TextUtils.isEmpty(siteUrl.d())) {
                return a(chain, siteUrl.f());
            }
            String strC = siteUrl.c();
            String strA = siteUrl.a();
            Response responseA2 = a(chain, strC);
            if (responseA2 != null) {
                siteUrl.a(strC, false);
                responseA = responseA2;
            } else {
                responseA = a(chain, strA);
                if (responseA == null) {
                    unknownHostException2 = new UnknownHostException("no host can access");
                } else {
                    siteUrl.a(strA, true);
                }
            }
            if (unknownHostException == null) {
                return responseA;
            }
            throw unknownHostException;
        }
        unknownHostException = unknownHostException2;
        if (unknownHostException == null) {
            return responseA;
        }
        throw unknownHostException;
    }

    private Response a(Interceptor.Chain chain, String str) throws IOException {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Request request = chain.request();
        String[] strArrSplit = str.split(":");
        int length = strArrSplit.length;
        int i = g2.n;
        if (length == 2) {
            try {
                i = Integer.parseInt(strArrSplit[1]);
                str2 = strArrSplit[0];
            } catch (NumberFormatException unused) {
                Logger.e(f4921b, "port is error:" + i + ", use default 443");
                str2 = str;
            }
        } else {
            str2 = str;
        }
        try {
            return chain.proceed(request.newBuilder().url(request.url().newBuilder().scheme(ProxyConfig.MATCH_HTTPS).host(str2).port(i).build()).build());
        } catch (IOException e) {
            if (!(e instanceof UnknownHostException)) {
                throw e;
            }
            Logger.e(f4921b, "UnknownHostException" + str);
            return null;
        }
    }

    public UrlInterceptorV2(String str, String str2) {
        this.f4922a = Collections.singletonList(new SiteUrl(str, str2));
    }

    public UrlInterceptorV2(BackendService.Options options) {
        this.f4922a = AGCHostManager.a().b(options.getApp());
    }
}

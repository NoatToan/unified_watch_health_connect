package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import android.util.LruCache;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.net.URL;

/* JADX INFO: loaded from: classes34.dex */
public class h3 extends Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14855a = "MultiHostChange";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14856b = 256;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LruCache<String, e3> f14857c = new LruCache<>(256);
    public static final String d = "Multi-Cloud-Svc";
    public static final String e = "host";
    public static final String f = ";";
    public static final String g = "=";
    public static final String h = ":";
    public static final int i = -1;

    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response<ResponseBody> intercept(Interceptor.Chain chain) throws Exception {
        Request request = chain.request();
        String url = request.getUrl();
        URL url2 = new URL(url);
        String host = url2.getHost();
        int port = url2.getPort();
        LruCache<String, e3> lruCache = f14857c;
        e3 e3Var = lruCache.get(host);
        boolean zIsHealthy = e3Var != null ? e3Var.isHealthy(!request.getMethod().equals("GET")) : false;
        Logger.v(f14855a, "whether the connection is OK ? %s", Boolean.valueOf(zIsHealthy));
        Logger.v(f14855a, "Before the MultiHostChange,the request is = %s", request);
        if (zIsHealthy) {
            String host2 = e3Var.getHost();
            if (host2 != null) {
                if (port != -1) {
                    host = host + ":" + port;
                }
                request = request.newBuilder().url(new d3(url.replaceFirst(host, host2)).getUrl()).build();
            }
        } else {
            lruCache.remove(host);
        }
        Logger.v(f14855a, "after the MultiHost,the request is = %s", request);
        try {
            Response<ResponseBody> responseProceed = chain.proceed(request);
            if (responseProceed != null) {
                String str = Headers.of(responseProceed.getHeaders()).get(d);
                Logger.v(f14855a, "the headers that you need is : %s", str);
                String strA = a(str, "host");
                if (!TextUtils.isEmpty(strA) && (chain instanceof h1.b)) {
                    d1 requestTask = ((h1.b) chain).getRequestTask();
                    if (requestTask != null) {
                        e3 connectionInfo = requestTask.getConnectionInfo();
                        if (connectionInfo != null) {
                            lruCache.put(strA, connectionInfo);
                        } else {
                            Logger.w(f14855a, "cacheMapFailed,because the message is null!");
                        }
                    }
                    Logger.v(f14855a, "the cache size is %d \n %s", Integer.valueOf(lruCache.size()), lruCache.snapshot());
                }
            }
            return responseProceed;
        } catch (Exception e2) {
            f14857c.remove(host);
            throw e2;
        }
    }

    private String a(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        for (String str3 : str.split(";")) {
            String[] strArrSplit = str3.split("=");
            if (strArrSplit.length == 2 && str2.equals(strArrSplit[0].trim())) {
                return strArrSplit[1].trim();
            }
        }
        return "";
    }
}

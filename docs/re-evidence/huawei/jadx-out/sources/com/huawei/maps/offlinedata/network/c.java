package com.huawei.maps.offlinedata.network;

import android.util.ArrayMap;
import com.google.gson.JsonObject;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.embedded.y;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.restclient.Converter;
import com.huawei.hms.network.restclient.RestClient;
import com.huawei.hms.network.restclient.converter.gson.GsonConverterFactory;
import com.huawei.maps.offlinedata.utils.g;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class c {
    private static volatile c d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f17864a = new ThreadPoolExecutor(2, 5, 0, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayMap f17865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayMap f17866c;

    class a extends NetworkKit.Callback {
        a() {
        }

        @Override // com.huawei.hms.network.NetworkKit.Callback
        public void onResult(boolean z) {
            if (!z) {
                g.b("MapNetUtils", "NetworkKit init failed");
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("enable_ipv6", Boolean.TRUE);
            NetworkKit.getInstance().setOptions(jsonObject.toString());
            g.c("MapNetUtils", "NetworkKit init success");
        }
    }

    private c() {
        ArrayMap arrayMap = new ArrayMap();
        this.f17865b = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        this.f17866c = arrayMap2;
        NetworkKit.init(com.huawei.maps.offlinedata.utils.a.b(), new a());
        HttpClient httpClientBuild = new HttpClient.Builder().readTimeout(10000).writeTimeout(y.f15619c).connectTimeout(5000).callTimeout(y.f15619c).addInterceptor((Interceptor) new com.huawei.maps.offlinedata.network.a()).build();
        arrayMap.put(0, new RestClient.Builder().httpClient(httpClientBuild).addConverterFactory((Converter.Factory) GsonConverterFactory.create()).build());
        arrayMap2.put(0, httpClientBuild);
    }

    public static c a() {
        if (d == null) {
            synchronized (c.class) {
                if (d == null) {
                    d = new c();
                }
            }
        }
        return d;
    }

    public void b(final Submit submit, final b bVar) {
        this.f17864a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.network.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                submit.enqueue(bVar);
            }
        });
    }

    public Object a(Class cls) {
        return ((RestClient) this.f17865b.get(0)).create(cls);
    }

    public static String a(String str) {
        return com.huawei.maps.offlinedata.service.config.a.h().e() + str;
    }
}

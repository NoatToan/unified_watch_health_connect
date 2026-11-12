package com.huawei.hms.network.embedded;

import android.content.Context;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Interceptor;
import java.net.InetAddress;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public abstract class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile p4 f15174a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15175b = "https://";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15176c = "GET";
    public static volatile HttpClient d;

    public abstract LinkedHashMapPack a(String str);

    public abstract n5 a(String str, List<InetAddress> list);

    public abstract t5 a(boolean z);

    public abstract z4 a(long j, long j2);

    public abstract void a(Context context);

    public abstract void a(Interceptor.Chain chain);

    public abstract boolean a();

    public abstract String b();

    public abstract void b(boolean z);

    public abstract boolean b(long j, long j2);

    public abstract Map<String, Integer> c();

    public abstract void c(boolean z);

    public abstract void d();

    public static p4 f() {
        if (f15174a == null) {
            synchronized (p4.class) {
                if (f15174a == null) {
                    f15174a = new q4();
                }
            }
        }
        return f15174a;
    }

    public static HttpClient e() {
        HttpClient httpClient;
        synchronized (p4.class) {
            if (d == null) {
                d = new HttpClient.Builder().retryTimeOnConnectionFailure(0).build();
            }
            httpClient = d;
        }
        return httpClient;
    }
}

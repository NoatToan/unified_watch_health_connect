package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.Request;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes34.dex */
public class s3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15324b = "HostRoute";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile s3 f15325c = null;
    public static final int d = 1000;
    public static final int e = 500;
    public static final int f = 400;
    public static final int g = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<String, a> f15326a = new ConcurrentHashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15327a = 500;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15328b = 1;
    }

    public void a(long j, String str) {
        int i;
        if (j <= 0 || str == null) {
            return;
        }
        if (this.f15326a.get(str) == null) {
            this.f15326a.putIfAbsent(str, new a());
        }
        a aVar = this.f15326a.get(str);
        if (j > 400) {
            aVar.f15327a = 1000;
            aVar.f15328b = 1;
        } else if (aVar.f15327a == 1000 && (i = aVar.f15328b) < 3) {
            aVar.f15328b = i + 1;
        } else {
            aVar.f15328b = 1;
            aVar.f15327a = 500;
        }
    }

    public Request a(h1.d dVar) {
        a aVar = this.f15326a.get(new d3(dVar.getUrl()).getHost());
        if (aVar == null || aVar.f15327a == dVar.getNetConfig().getConcurrentConnectDelay()) {
            Logger.v(f15324b, "request not change: ");
            return dVar;
        }
        Logger.v(f15324b, "  old delay time = " + dVar.getNetConfig().getConcurrentConnectDelay() + " new delay time " + aVar.f15327a);
        dVar.getNetConfig().setValue("core_concurrent_connect_delay", aVar.f15327a);
        return dVar;
    }

    public static s3 getInstance() {
        if (f15325c == null) {
            synchronized (s3.class) {
                if (f15325c == null) {
                    f15325c = new s3();
                }
            }
        }
        return f15325c;
    }
}

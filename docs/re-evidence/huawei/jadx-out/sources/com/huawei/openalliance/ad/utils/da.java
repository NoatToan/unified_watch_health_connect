package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.constant.FlavorConstants;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f20616a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static da f20617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f20618c;
    private String d;
    private String e;

    public void a(Context context, boolean z) {
    }

    public void d(String str) {
        if (z.a()) {
            z.a(str);
        }
    }

    public void c(String str) {
        this.f20618c = str;
    }

    public String c() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public void b(Context context) {
        if (dg.b(this.f20618c)) {
            hw.c("ServerConfig", "asyncGetUrl, appNameBlank");
        } else {
            hw.b("ServerConfig", "asyncGetUrl");
            o.b(new a(context, this.f20618c));
        }
    }

    public String b() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(Context context) {
        hw.b("ServerConfig", "init");
        o.b(new a(context, this.f20618c));
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f20619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20620b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f20620b == null) {
                hw.d("ServerConfig", "Must set application name for GRS: HiAd.setApplicationName");
                return;
            }
            String strO = com.huawei.openalliance.ad.cc.a(this.f20619a).o();
            com.huawei.openalliance.ad.cs csVarA = com.huawei.openalliance.ad.cd.a(this.f20619a);
            csVarA.a(this.f20620b);
            csVarA.b(strO);
            hw.b("ServerConfig", "country:" + strO);
            Map<String, String> mapC = csVarA.c(FlavorConstants.HIAD_GRS_SERVICE_NAME);
            HashMap map = new HashMap();
            if (mapC != null && !mapC.isEmpty()) {
                for (Map.Entry<String, String> entry : mapC.entrySet()) {
                    String strC = as.c(entry.getValue());
                    map.put(entry.getKey() + strO, strC);
                    StringBuilder sb = new StringBuilder("url:");
                    sb.append(ds.a(strC));
                    hw.b("ServerConfig", sb.toString());
                }
                fp.b(this.f20619a).a(map);
            }
            if (z.a()) {
                z.a(this.f20619a);
            }
        }

        public a(Context context, String str) {
            this.f20619a = context;
            this.f20620b = str;
        }
    }

    public static da a() {
        da daVar;
        synchronized (f20616a) {
            if (f20617b == null) {
                f20617b = new da();
            }
            daVar = f20617b;
        }
        return daVar;
    }

    private da() {
    }
}

package com.huawei.hwcloudjs.e.a;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes37.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17098a = "CacheManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f17099b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<String, a> f17100c = new b(100);
    private long d = 10000000;
    private long e = 0;

    public boolean e(String str) {
        boolean zContainsKey;
        synchronized (this) {
            zContainsKey = f17100c.containsKey(str);
        }
        return zContainsKey;
    }

    public long e() {
        return this.d;
    }

    public a d(String str) {
        StringBuilder sb;
        String authority;
        synchronized (this) {
            a aVarC = c(str);
            if (aVarC == null || !(aVarC instanceof a)) {
                aVarC = null;
            }
            if (aVarC != null) {
                com.huawei.hwcloudjs.f.d.c("CacheManager", "getCacheInfo success!", true);
                return aVarC;
            }
            try {
                URL url = new URL(str);
                if (url.getPath().isEmpty() || url.getPath().equalsIgnoreCase("/")) {
                    sb = new StringBuilder();
                    sb.append(url.getProtocol());
                    sb.append("://");
                    authority = url.getAuthority();
                } else {
                    sb = new StringBuilder();
                    sb.append(url.getProtocol());
                    sb.append("://");
                    sb.append(url.getAuthority());
                    authority = url.getPath();
                }
                sb.append(authority);
                a aVarC2 = c(sb.toString());
                if (aVarC2 == null || !(aVarC2 instanceof a)) {
                    com.huawei.hwcloudjs.f.d.c("CacheManager", "getCacheInfo(urlPath) is not Cache type", true);
                } else {
                    aVarC = aVarC2;
                }
                return aVarC;
            } catch (MalformedURLException unused) {
                com.huawei.hwcloudjs.f.d.b("CacheManager", "MalformedURLException", true);
                return null;
            }
        }
    }

    public a c(String str) {
        synchronized (this) {
            if (!e(str)) {
                return null;
            }
            a aVarB = b(str);
            if (aVarB != null && aVarB.b() == 0) {
                this.e -= (long) aVarB.d();
                f17100c.remove(str);
            }
            return aVarB;
        }
    }

    public long c() {
        long j;
        synchronized (this) {
            j = this.e;
        }
        return j;
    }

    public a b(String str) {
        synchronized (this) {
            a aVar = f17100c.get(str);
            if (aVar == null || !(aVar instanceof a)) {
                return null;
            }
            return aVar;
        }
    }

    public int b() {
        int size;
        synchronized (this) {
            size = f17100c.size();
        }
        return size;
    }

    public void a(String str, a aVar) {
        synchronized (this) {
            a aVar2 = f17100c.get(str);
            if (aVar2 != null) {
                this.e -= (long) aVar2.d();
            }
            f17100c.put(str, aVar);
            long jD = this.e + ((long) aVar.d());
            this.e = jD;
            if (jD > this.d) {
                Iterator<Map.Entry<String, a>> it = f17100c.entrySet().iterator();
                while (it.hasNext()) {
                    a(it.next().getKey());
                    if (this.e < this.d / 2) {
                        return;
                    }
                }
            }
        }
    }

    public void a(String str) {
        synchronized (this) {
            a aVarB = b(str);
            if (aVarB != null) {
                this.e -= (long) aVarB.d();
            }
            f17100c.remove(str);
        }
    }

    public void a(long j) {
        this.d = j;
    }

    public void a() {
        synchronized (this) {
            f17100c.clear();
            this.e = 0L;
        }
    }

    public static c d() {
        return f17099b;
    }

    private c() {
    }
}

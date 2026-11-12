package com.huawei.watchface;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f30680a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap f30681b = new ConcurrentHashMap();

    public void a(String str, String str2) {
        q2.c(this.f30680a, str, str2);
        q2.c(this.f30681b, str2, str);
    }

    public boolean b(String str) {
        return q2.a((Map) this.f30681b, (Object) str);
    }

    public String c(String str) {
        return q2.a((Map) this.f30680a, str);
    }

    public String d(String str) {
        return q2.a((Map) this.f30681b, str);
    }

    public void e(String str) {
        q2.b(this.f30681b, q2.a((Map) this.f30680a, str));
        q2.b(this.f30680a, str);
    }

    public void a() {
        ConcurrentHashMap concurrentHashMap = this.f30680a;
        if (concurrentHashMap == null || this.f30681b == null) {
            return;
        }
        concurrentHashMap.clear();
        this.f30681b.clear();
    }

    public void a(String str, String str2, String str3) {
        q2.c(this.f30680a, str, str2);
        q2.c(this.f30681b, str2, str3);
    }

    public boolean a(String str) {
        return q2.a((Map) this.f30680a, (Object) str);
    }
}

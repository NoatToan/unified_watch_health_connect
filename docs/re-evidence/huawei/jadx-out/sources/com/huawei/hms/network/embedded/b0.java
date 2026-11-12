package com.huawei.hms.network.embedded;

import java.util.Date;

/* JADX INFO: loaded from: classes34.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14590c;
    public long d;
    public int e;

    public String toString() {
        return "Address{domain='" + this.f14588a + "', ip=" + this.f14589b + ", ttl=" + this.f14590c + ", createTime=" + this.d + ", source=" + t.m().a(this.e) + '}';
    }

    public boolean a() {
        long jB = b() - this.d;
        return jB > 86400000 || jB < -86400000;
    }

    private long b() {
        return new Date().getTime();
    }

    public b0(String str, String str2, long j) {
        w.a();
        this.f14588a = str;
        this.f14589b = str2;
        this.f14590c = j;
    }

    public b0(String str, String str2) {
        this.f14590c = w.a();
        this.f14588a = str;
        this.f14589b = str2;
    }

    public b0() {
        this.f14590c = w.a();
    }
}

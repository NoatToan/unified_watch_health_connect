package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class m0 {
    public static final String h = "DomainResult";
    public static final String i = "A";
    public static final String j = "AAAA";
    public static final String k = "ALL";
    public static final long l = 86400000;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final String p = "CNAME";
    public int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15072a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15073b = "A";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f15074c = new ArrayList();
    public long d = System.currentTimeMillis();
    public long e = w.a();
    public int g = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder("{'");
        sb.append(this.f15073b);
        sb.append('\'');
        sb.append(j() ? ", not exist" : ", exist");
        sb.append(", createTime=");
        sb.append(this.d);
        sb.append(", ");
        sb.append(t.m().a(this.f));
        sb.append(", ");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }

    public boolean j() {
        return this.f15074c.isEmpty();
    }

    public String i() {
        return this.f15073b;
    }

    public long h() {
        return this.e;
    }

    public int g() {
        long jAbs = Math.abs(System.currentTimeMillis() - this.d);
        Logger.v(h, "getStatus:time is %d,ttl is %d", Long.valueOf(jAbs), Long.valueOf(this.e));
        if (jAbs < this.e) {
            return 0;
        }
        return jAbs < 86400000 ? 1 : 2;
    }

    public int f() {
        return this.f;
    }

    public int e() {
        long jAbs = Math.abs(System.currentTimeMillis() - this.d);
        Logger.v(h, "getReportStatus:time is %d,ttl is %d", Long.valueOf(jAbs), Long.valueOf(this.e));
        long j2 = this.e;
        if (j2 <= 0) {
            return -1;
        }
        return (int) (jAbs / j2);
    }

    public List<String> d() {
        return new ArrayList(this.f15074c);
    }

    public void c(String str) {
        this.f15073b = str;
    }

    public String c() {
        return this.f15072a;
    }

    public void b(List<String> list) {
        if (list == null) {
            this.f15074c = new ArrayList();
        } else {
            this.f15074c = list;
        }
    }

    public void b(String str) {
        this.f15072a = str;
    }

    public void b(long j2) {
        this.e = j2;
    }

    public void b(int i2) {
        this.f = i2;
    }

    public long b() {
        return this.d;
    }

    public boolean a(m0 m0Var) {
        return m0Var == null || m0Var.j() || this.f >= m0Var.f();
    }

    public void a(List<String> list) {
        this.f15074c.addAll(list);
    }

    public void a(String str) {
        this.f15074c.add(str);
    }

    public void a(long j2) {
        this.d = j2;
    }

    public void a(int i2) {
        this.g = i2;
    }

    public int a() {
        return this.g;
    }
}

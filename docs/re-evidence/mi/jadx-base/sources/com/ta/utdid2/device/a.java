package com.ta.utdid2.device;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f10701a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10702b = 0;

    public void a(long j) {
        this.f10702b = j;
    }

    public void b(long j) {
        this.f10701a = j;
    }

    public void c(String str) {
        this.e = str;
    }

    public void d(String str) {
        this.f = str;
    }

    public String e() {
        return this.d;
    }

    public String f() {
        return this.g;
    }

    public String getDeviceId() {
        return this.f;
    }

    public String getImsi() {
        return this.e;
    }

    public long a() {
        return this.f10701a;
    }

    public void b(String str) {
        this.d = str;
    }

    public void e(String str) {
        this.g = str;
    }
}

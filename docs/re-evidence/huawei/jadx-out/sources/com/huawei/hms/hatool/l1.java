package com.huawei.hms.hatool;

/* JADX INFO: loaded from: classes3.dex */
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s0 f13459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s0 f13460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s0 f13461c;
    private s0 d;

    public s0 d() {
        return this.d;
    }

    public s0 c() {
        return this.f13460b;
    }

    public void b(s0 s0Var) {
        this.f13460b = s0Var;
    }

    public s0 b() {
        return this.f13459a;
    }

    public void a(s0 s0Var) {
        this.f13459a = s0Var;
    }

    public s0 a(String str) {
        if (str.equals("oper")) {
            return c();
        }
        if (str.equals("maint")) {
            return b();
        }
        if (str.equals("diffprivacy")) {
            return a();
        }
        if (str.equals("preins")) {
            return d();
        }
        v.f("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: " + str);
        return null;
    }

    public s0 a() {
        return this.f13461c;
    }

    public l1(String str) {
    }
}
